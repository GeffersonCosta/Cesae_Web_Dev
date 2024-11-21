@extends('layouts.fmaster')

@section('content')


<h1>Adicionar Álbum</h1>

<form method="POST" action="{{route('create.albums')}}" enctype="multipart/form-data">

    @csrf
    <fieldset>
      <div class="mb-3">
        <label for="name" class="form-label">Nome do álbum</label>
        <input type="text" name="name" id="name" class="form-control" placeholder="Nome" required>
      </div>
      <div class="mb-3">
        <label for="photo" class="form-label">Imagem</label>
        <input type="file" accept="image/*" name="photo" id="photo" class="form-control" required>
      </div>

      <div class="mb-3">
        <label for="select" class="form-label">Selecione a Banda</label>
        <select name="band_id" id="">
            @foreach ($allBands as $band)
            <option value="{{ $band->id }}">{{ $band->name }}</option>
            @endforeach
          </select>
      </div>

      <div class="mb-3">
        <label for="date" class="form-label">Data de lançamento</label>
        <input type="date" name="date" id="date" class="form-control">
      </div>

      <button type="submit" class="btn btn-primary">Enviar</button>
    </fieldset>
  </form>


@endsection
