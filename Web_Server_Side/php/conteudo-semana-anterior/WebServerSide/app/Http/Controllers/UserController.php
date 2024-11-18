<?php

namespace App\Http\Controllers;

use App\Models\Task;
use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Hash;
use Illuminate\Support\Facades\Storage;
use Illuminate\Support\Facades\Response;


class UserController extends Controller
{
    public function users()
    {
        // A linha 15 serve para devolver os dados da função getAllUsersFromArray() que devolve os dados do array desta função (É estático!)
        //$users = $this->getAllUsersFromArray();

        $search = request()->query('search') ? request()->query('search') : null;
        $users = $this->getAllUsersFromDB($search);

        return view('users.all_users', compact('users'));
    }

    public function addUser()
    {
        return view('users.add_user');
    }

    private function getCesaeInfo()
    {
        $cesaeInfo = [
            'name' => 'Cesae',
            'address' => 'Rua Ciríaco Cardoso 186, 4150-212 Porto',
            'email' => 'cesae@cesae.pt'
        ];
        return $cesaeInfo;
    }

    public function showCesaeInfo()
    {
        return $this->getCesaeInfo();
    }

    private function getAllUsersFromArray()
    {
        $users = [
            ['id' => 1, 'name' => 'Sara', 'email' => 'Sara@gmail.com'],
            ['id' => 2, 'name' => 'Dra. Anabela', 'email' => 'Anabela@gmail.com'],
            ['id' => 3, 'name' => 'Bruno', 'email' => 'Bruno@gmail.com']
        ];
        return $users;
    }

    //Tem que preencher todos os campos obrigatórios
    public function insertUser()
    {
        DB::table('users')
            ->insert([
                'name' => 'Pai',
                'email' => 'reymar22@email.com',
                'nif' => '287113250',
                'password' => 'reymar6599'
            ]);
        return Response::json('sucesso');
    }

    /*     public function updateUser()
    {
        DB::table('users')
            ->where('id', 3)
            ->update([
                'name' => 'Gabriel'
            ]);
        return Response::json('sucesso');
    } */

    // Primeiro verifica os primeiros campos das [], se não existir cria, se sim, atuliza
    public function updateOrInsertUser()
    {
        DB::table('users')
            ->updateOrInsert(
                [
                    'email' => 'Joaquim@gmail.com',
                    'password' => 'Joaquim123'
                ],
                [
                    'name' => 'Joaquim',
                    'updated_at' => now(),
                    'nif' => '234869675'
                ]
            );
        return Response::json('sucesso');
    }

    // Melhor forma utilizar id para apagar registro
    public function deleteUsers()
    {
        DB::table('users')
            ->where('id', 3)
            ->delete();
        return Response::json('sucesso');
    }

    private function getAllUsersFromDB($search)
    {
        $users = DB::table('users');
        if ($search) {
            $users->where("name", "LIKE", "%{$search}%");
            $users->orWhere("email", "LIKE", "%{$search}%");
        }
        $allUsers = $users->get();
        return $allUsers;
    }

    //Usando o User Model
    private function getAllUsersFromModel()
    {
        $users = User::all();
        return $users;
    }

    // * Usar scope para utilizar parametros *
    //$users = User::getUsersByMonth($month);

    // Devolve o campo que não está NULL (*Ler sobre CARBON)
    /*  private function getAllUsersFromDB() {
        $users = DB::table('users')
                ->whereNotNull('updated_at')
                -> get();
        return $users;
    } */

    // Devolve o PRIMEIRO registro onde o updated_at é NULL. Devolve o objeto inteiro!
    //Para devolver um atributo desse objeto, tem de passá-lo como parametro da query.
    /*  private function getAllUsersFromDB() {
        $users = DB::table('users')
                ->whereNull('updated_at')
                -> first('name');
        return $users;
    } */

    public function viewUser($id)
    {
        $user = User::where('id', $id)->first();
        //dd($user);
        return view('users.add_user', compact('user'));
    }

    public function deleteUser($id)
    {
        //Usando Query Builder
        //DB::table('tasks')->where('user_id', $id)->delete();
        Task::where('user_id', $id)->delete();
        User::where('id', $id)->delete();
        return back();
    }


    public function createUser(Request $request)
    {
        $action = '';

        if (isset($request->id)) {
            // Atualizar usuário
            $action = 'atualizado';

            // Validação de dados
            $request->validate([
                'name' => 'string|required|max:255',
                'nif' => 'numeric|digits:9',
                'address' => 'nullable|string|max:255',
                'user_type' => 'required|in:' . implode(',', [User::TYPE_ADMIN, User::TYPE_STUDENT, User::TYPE_EXSTUDENT]),
            ]);

            $photo = null;
            // Verifica se há uma nova foto
            if ($request->hasFile('photo')) {
                $photo = Storage::putFile('uploadedImages', $request->photo);
            }

            $updateData = [
                'name' => $request->name,
                'nif' => $request->nif,
                'address' => $request->address,
                'photo' => $photo,
                'user_type' => $request->user_type
            ];

            // Atualiza os dados do usuário
            if ($request->has('password') && $request->password) {
                $updateData['password'] = Hash::make($request->password);
            }

            User::where('id', $request->id)->update($updateData);

        } else {
            // Criar novo usuário
            $action = 'inserido';

            // Validação de dados para criação
            $request->validate([
                'name' => 'string|required|max:255',
                'email' => 'email|required|unique:users',
                'nif' => 'numeric|digits:9',
                'password' => 'min:6|required',
                'user_type' => 'required|in:' . implode(',', [User::TYPE_ADMIN, User::TYPE_STUDENT, User::TYPE_EXSTUDENT]),
            ]);

            $photo = null;
            // Verifica se há foto para upload
            if ($request->hasFile('photo')) {
                $photo = Storage::putFile('uploadedImages', $request->photo);
            }

            // Cria um novo usuário
            User::insert([
                'name' => $request->name,
                'email' => $request->email,
                'address' => $request->address,
                'nif' => $request->nif,
                'password' => Hash::make($request->password),
                'photo' => $photo,
                'user_type' => $request->user_type
            ]);
        }

        return redirect()->route('users.all')->with('message', 'Usuário ' . $action . ' com sucesso!');
    }
}
