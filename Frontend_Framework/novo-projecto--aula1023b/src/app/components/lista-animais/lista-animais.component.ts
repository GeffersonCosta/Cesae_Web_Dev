import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-lista-animais',
  standalone: true,
  imports: [],
  templateUrl: './lista-animais.component.html',
  styleUrl: './lista-animais.component.scss',
})
export class ListaAnimaisComponent {
  @Input() animais: any = {};
}
