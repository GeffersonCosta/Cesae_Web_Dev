import { Component } from '@angular/core';
import { ListaItemComponent } from "./lista/lista-item/lista-item.component";

@Component({
  selector: 'app-ex2',
  standalone: true,
  imports: [ListaItemComponent],
  templateUrl: './ex2.component.html',
  styleUrl: './ex2.component.scss'
})
export class Ex2Component {


}
