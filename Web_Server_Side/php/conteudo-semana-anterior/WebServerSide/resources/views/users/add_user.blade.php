@extends('layouts.main_layout')
@section('content')
    <div class="container p-3">
        <div class="table-responsive">
            <h3>Formulário para {{ isset($user) ? 'atualizar' : 'adicionar' }} usuários</h3>
            <form method="POST" action="{{ route('users.create') }}" enctype="multipart/form-data">
                @csrf
                <input type="hidden" name="id" value="{{ isset($user) ? $user->id : '' }}">

                <div class="col-6">
                    <label for="inputName" class="form-label">Name</label>
                    <input name="name" value="{{ isset($user) ? $user->name : '' }}" type="text" required
                        class="form-control @error('name') is-invalid @enderror">
                    @error('name')
                        <div class="invalid-feedback">
                            Por favor, insira um nome válido!
                        </div>
                    @enderror
                </div>

                <div class="col-6">
                    <label for="inputEmail" class="form-label">Email</label>
                    <input name="email" value="{{ isset($user) ? $user->email : '' }}" type="email" required
                        class="form-control @error('email') is-invalid @enderror">
                    @error('email')
                        <div class="invalid-feedback">
                            Por favor, insira um email válido!
                        </div>
                    @enderror
                </div>

                <div class="col-6">
                    <label for="inputNif" class="form-label">NIF</label>
                    <input name="nif" value="{{ isset($user) ? $user->nif : '' }}" type="number"
                        class="form-control @error('nif') is-invalid @enderror">
                    @error('nif')
                        <div class="invalid-feedback">
                            Por favor, insira um NIF válido!
                        </div>
                    @enderror
                </div>

                <div class="col-6">
                    <label for="inputAddress" class="form-label">Address</label>
                    <input name="address" value="{{ isset($user) ? $user->address : '' }}" type="text"
                        class="form-control @error('address') is-invalid @enderror">
                    @error('address')
                        <div class="invalid-feedback">
                            Por favor, insira um endereço válido!
                        </div>
                    @enderror
                </div>

                <div class="col-6">
                    <label for="inputPassword" class="form-label">Password</label>
                    <input name="password" value="{{ isset($user) ? '' : '' }}" type="password" required
                        class="form-control @error('password') is-invalid @enderror">
                    @error('password')
                        <div class="invalid-feedback">
                            Por favor, insira uma senha válida!
                        </div>
                    @enderror
                </div>

                <div class="col-6">
                    <label for="photo" class="form-label">Foto</label>
                    <input name="photo" type="file" accept="image/*" id="photo"
                        class="form-control @error('photo') is-invalid @enderror">
                    @error('photo')
                        <div class="invalid-feedback">
                            Por favor, insira uma foto válida!
                        </div>
                    @enderror
                </div>

                <div class="col-6">
                    <label for="user_type" class="form-label">Tipo de Usuário</label>
                    <select name="user_type" id="user_type" class="form-control @error('user_type') is-invalid @enderror"
                        required>
                        <option value="{{ \App\Models\User::TYPE_ADMIN }}"
                            {{ isset($user) && $user->user_type == \App\Models\User::TYPE_ADMIN ? 'selected' : '' }}>
                            Administrador</option>
                        <option value="{{ \App\Models\User::TYPE_STUDENT }}"
                            {{ isset($user) && $user->user_type == \App\Models\User::TYPE_STUDENT ? 'selected' : '' }}>
                            Estudante</option>
                        <option value="{{ \App\Models\User::TYPE_EXSTUDENT }}"
                            {{ isset($user) && $user->user_type == \App\Models\User::TYPE_EXSTUDENT ? 'selected' : '' }}>
                            Ex-estudante</option>
                    </select>
                    @error('user_type')
                        <div class="invalid-feedback">
                            Por favor, selecione um tipo de usuário válido!
                        </div>
                    @enderror
                </div>

                <div class="col-12">
                    <button type="submit" class="btn btn-primary">Enviar</button>
                </div>
            </form>
        </div>
    </div>
@endsection
