@extends('layouts.main_layout')
@section('content')

<div class="container p-3">
    <div class="table-responsive">
    <h3>Formulário para {{ isset($task) ? ' atualizar' : ' adicionar' }} tasks</h3>
        <form method="POST" action="{{ route('tasks.create') }}">
            @csrf
            <div class="col-6">
                <label for="inputName" class="form-label">Task Name</label>
                <input name="name" value="{{ isset($task)? $task->name : '' }}" type="text" id="inputName" required
                class="form-control @error('name') is-invalid @enderror">
                @error('name')
                <div class="invalid-feedback">
                    Por favor, insira um nome válido!
                </div>
                @enderror
            </div>
            <div class="col-6">
                <label for="inputDescription" class="form-label">Description</label>
                <input name="description" value="{{ isset($task)? $task->description : '' }}" type="text" id="inputDescription" required
                class="form-control @error('description') is-invalid @enderror">
                @error('description')
                <div class="invalid-feedback">
                    Por favor, insira uma descrição válido!
                </div>
                @enderror
            </div>
            <div class="col-6">
                <label for="inputDue_At" class="form-label">Data de conclusão</label>
                <input name="due_at" value="{{ isset($task)? $task->due_at : '' }}" type="date" id="inputDue_At" required
                class="form-control">
            </div>
            <br>
            @if(isset($task))
            <input type="hidden" name="id" value=" {{ $task->id }}">
                <div class="col-6">
                    <label for="inputStatus" class="form-check-label">Status</label>
                    <input name="status" {{ $task->status == 1 ? 'checked' : '' }} type="checkbox" id="inputstatus"
                    class="form-check-input">
                </div>
                <br>
            @endif
            <div class="col-6">
                <label for="selectUser" class="form-label">User</label>
                <select name="user_id" type="text" id="selectUser_id" required
                class="form-select @error('user_id') is-invalid @enderror" aria-label="Default select example">
                    <option value="" selected></option>
                    @foreach($users as $user)
                        <option @if( isset($task) && $user->id == $task->user_id) selected @endif  value="{{ $user->id }}">{{ $user->name }}</option>
                     @endforeach
                </select>
                @error('user_id')
                    <div class="invalid-feedback">
                        User inválido!
                    </div>
                @enderror
            </div>
            <br>
            <div class="col-12">
                <button type="submit" class="btn btn-primary">Enviar</button>
            </div>
        </form>
    </div>
</div>

@endsection
