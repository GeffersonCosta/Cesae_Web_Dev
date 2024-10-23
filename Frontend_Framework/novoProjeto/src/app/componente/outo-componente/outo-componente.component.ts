import { Component } from '@angular/core';
import { ContadorComponent } from "../contador/contador.component";

@Component({
  selector: 'app-outo-componente',
  standalone: true,
  imports: [ContadorComponent],
  templateUrl: './outo-componente.component.html',
  styleUrl: './outo-componente.component.scss'
})
export class OutoComponenteComponent {
  contagem = 100;
  atualizar(valor: any){
    this.contagem = valor;
  }

}
