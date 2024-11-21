import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-item-lista-animais',
  standalone: true,
  imports: [],
  templateUrl: './item-lista-animais.component.html',
  styleUrl: './item-lista-animais.component.scss',
})
export class ItemListaAnimaisComponent {
  @Input() dados: any = {};
}
