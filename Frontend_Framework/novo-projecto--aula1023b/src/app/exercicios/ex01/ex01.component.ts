import { Component } from '@angular/core';
import { InputNomeComponent } from './input-nome/input-nome.component';
import { InputIdadeComponent } from './input-idade/input-idade.component';

@Component({
  selector: 'app-ex01',
  standalone: true,
  imports: [InputNomeComponent, InputIdadeComponent],
  templateUrl: './ex01.component.html',
  styleUrl: './ex01.component.scss',
})
export class Ex01Component {
  nomeUtilizador: string = 'Zé Ninguém';
  idadeUtilizador: number = 0;

  atualizarNome(novoNome: string) {
    this.nomeUtilizador = novoNome;
  }

  atualizarIdade(novaIdade: number) {
    this.idadeUtilizador = novaIdade;
  }
  
  ok(l: string): number {
    return 0
  }
}
