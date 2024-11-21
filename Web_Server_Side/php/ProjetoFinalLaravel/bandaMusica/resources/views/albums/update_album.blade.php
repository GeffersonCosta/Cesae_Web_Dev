@extends('layouts.fmaster')

@section('content')


<h1>Atualizar Álbum</h1>

<form method="POST" action="{{route('create.albums')}}" enctype="multipart/form-data">
    @csrf
    <fieldset>
        <input type="hidden" name="album_id" value="{{ isset($album) ? $album->id : '' }}">
      <div class="mb-3">
        <label for="name" class="form-label">Nome do álbum</label>
        <input value="{{ isset($album) ? $album->name : '' }}" type="text" name="name" id="name" class="form-control"  required>
      </div>
      <div class="mb-3">
        <img
        src="{{ $album->photo ? asset('storage/' . $album->photo) : '' }}">
        </td>
      </div>
      <div class="mb-3">
        <label for="photo" class="form-label">Imagem</label>
        <input type="file" accept="image/*" name="photo" id="photo" class="form-control" required>
      </div>

      <div class="mb-3">
        <label for="select" class="form-label">Selecione a Banda</label>
        <select name="band_id" id="" disabled>
            @foreach ($allBands as $band)
            <option value="{{ $band->id }}">{{ $band->name }}</option>

            @endforeach

          </select>
      </div>

      <div class="mb-3">
        <label for="date" class="form-label">Data de lançamento</label>
        <input value="{{ isset($album) ? $album->due_at : '' }}" type="date" name="date" id="date" class="form-control">
      </div>

      <button type="submit" class="btn btn-primary">Enviar</button>
    </fieldset>
  </form>


@endsection
