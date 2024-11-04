import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-lista',
  standalone: true,
  imports: [],
  templateUrl: './lista.component.html',
  styleUrl: './lista.component.scss',
})
export class ListaComponent {
  @Input({ alias: 'dados-planta', required: true }) planta: any = {};
}
