@extends('layouts.femaster')

@section('content')


<h1>Atualizar Dados do usuário</h1>

<form method="POST" action="{{route("users.create")}}">

    @csrf
    <fieldset>
      <div class="mb-3">
        <label for="" class="form-label">Nome</label>
        <input value="{{$users->name}}" type="text" name="name" id="" class="form-control" placeholder="Nome" required>
      </div>
      <div class="mb-3">
        <input value="{{$users->id}}" type="hidden" name="id" id="" class="form-control">
      </div>
      <div class="mb-3">
        <label for="" class="form-label">Email</label>
        <input value="{{$users->email}}" type="text" name="email" id="" class="form-control" placeholder="Email" required disabled>
      </div>
      <div class="mb-3">
        <label for="nif" class="form-label">NIF</label>
        <input value="{{$users->nif}}" type="text" name="nif" id="nif" class="form-control" placeholder="NIF" required>
      </div>
      <div class="mb-3">
        <label for="address" class="form-label">Morada</label>
        <input value="{{$users->address}}" type="text" name="address" id="address" class="form-control" placeholder="Morada" required>
      </div>
      <button type="submit" class="btn btn-primary">Enviar</button>
    </fieldset>
  </form>


@endsection
