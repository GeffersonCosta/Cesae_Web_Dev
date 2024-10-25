import { Component } from '@angular/core';
import { ContadorComponent } from '../contador/contador.component';

@Component({
  selector: 'app-outro-componente',
  standalone: true,
  imports: [ContadorComponent],
  templateUrl: './outro-componente.component.html',
  styleUrl: './outro-componente.component.scss',
})
export class OutroComponenteComponent {
  contagem = 100;

  atualizar(valor: any) {
    this.contagem = valor;
  }
}
