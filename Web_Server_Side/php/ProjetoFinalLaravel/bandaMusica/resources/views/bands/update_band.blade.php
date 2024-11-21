@extends('layouts.fmaster')

@section('content')

{{-- <input type="hidden" name="id" value="{{ isset($band) ? $band->id : '' }}"> --}}
{{-- <h1>{{ isset($band) ? 'atualizar' : 'adicionar' }} Banda</h1> --}}
<h1>Atualizar Banda</h1>

<form method="POST" action="{{route('create.bands')}}" enctype="multipart/form-data">
    @csrf
    <fieldset>
      <input type="hidden" name="id" value="{{ isset($band) ? $band->id : '' }}">
      <div class="mb-3">
        <label for="name" class="form-label">Nome da Banda</label>
        <input type="text" value="{{ isset($band) ? $band->name : ''}}" name="name" id="name" class="form-control"   required>
      </div>
      <div class="mb-3">

        <img width="150px" style="border-radius: 10%"
        src="{{ $band->photo ? asset('storage/' . $band->photo) : '' }}"><br>
        <label for="photo" class="form-label">Photo</label>
        <input type="file" accept="image/*" name="photo" id="photo"  class="form-control" required>
      </div>
      <button type="submit" class="btn btn-primary">Enviar</button>
    </fieldset>
  </form>


@endsection
