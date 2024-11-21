@extends('layouts.fmaster')

@section('content')

{{-- <input type="hidden" name="id" value="{{ isset($band) ? $band->id : '' }}"> --}}
{{-- <h1>{{ isset($band) ? 'atualizar' : 'adicionar' }} Banda</h1> --}}
<h1>Adicionar Banda</h1>

<form method="POST" action="{{route('create.bands')}}" enctype="multipart/form-data">
    @csrf
    <fieldset>

      <div class="mb-3">
        <label for="name" class="form-label">Nome da Banda</label>
        <input type="text" name="name" id="name" class="form-control"  placeholder="Nome da Banda" required>
      </div>
      <div class="mb-3">
        <label for="photo" class="form-label">Photo</label>
        {{-- value="{{isset($band) ? $band ->photo : ''}}" --}}
        <input type="file" accept="image/*" name="photo" id="photo"  class="form-control" required>
      </div>
      <button type="submit" class="btn btn-primary">Enviar</button>
    </fieldset>
  </form>


@endsection
