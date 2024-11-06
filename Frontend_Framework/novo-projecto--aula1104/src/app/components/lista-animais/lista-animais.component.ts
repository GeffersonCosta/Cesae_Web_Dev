import { Component, Input } from '@angular/core';
import { ItemListaAnimaisComponent } from "../item-lista-animais/item-lista-animais.component";

@Component({
  selector: 'app-lista-animais',
  standalone: true,
  imports: [ItemListaAnimaisComponent],
  templateUrl: './lista-animais.component.html',
  styleUrl: './lista-animais.component.scss'
})
export class ListaAnimaisComponent {
  //@Input() dadosLista: Array<any> = [];
  //@Input('dados-lista') dadosLista: Array<any> = [];
  //@Input({ alias: 'dados-lista' }) dadosLista: Array<any> = [];
  @Input({ alias: 'dados-lista', required: true }) dadosLista: Array<any> = [];
}
