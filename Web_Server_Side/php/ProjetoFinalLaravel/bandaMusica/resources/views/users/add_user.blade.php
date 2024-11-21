@extends('layouts.fmaster')

@section('content')


<h1>Adicionar usuário</h1>
<form method="POST" action="{{route("users.create")}}">

    @csrf
    <fieldset>
      <div class="mb-3">
        <label for="" class="form-label">Nome</label>
        <input type="text" name="name" id="" class="form-control" placeholder="Nome" required>
      </div>
      <div class="mb-3">
        <label for="" class="form-label">Email</label>
        <input type="text" name="email" id="" class="form-control" placeholder="Email" required>
        @error('email')
        Email ou password incorreto
        @enderror
      </div>
      <div class="mb-3">
        <label for="" class="form-label">Password</label>
        <input type="password" name="password" id="" class="form-control" placeholder="password" required min="6">
      </div>
      <button type="submit" class="btn btn-primary">Enviar</button>
    </fieldset>
  </form>


@endsection
