
@extends('layouts.femaster')

@section('content')


<h1>Adicionar Task</h1>

<form method="POST" action="{{route("task.create")}}">
    @csrf
    <fieldset>
      <div class="mb-3">
        <label for="" class="form-label">Nome da Tarefa</label>
        <input type="text" name="name" id="" class="form-control" placeholder="Nome da Tarefa" required>
      </div>
      <div class="mb-3">
        <label for="" class="form-label">Descrição da Tarefa</label>
        <input type="text" name="description" id="" class="form-control" placeholder="Descrição da Tarefa" required>
      </div>
      <div class="mb-3">
        <select name="user_id" id="">
            @foreach ($users as $user)
             <option value="{{$user -> id}}">{{$user -> name}}</option>
            @endforeach
        </select>
      </div>

      <button type="submit" class="btn btn-primary">Enviar</button>
    </fieldset>
  </form>


@endsection
