import { Component, EventEmitter, Output, Input } from '@angular/core';

@Component({
  selector: 'app-contador',
  standalone: true,
  imports: [],
  templateUrl: './contador.component.html',
  styleUrl: './contador.component.scss'
})
export class ContadorComponent {
  @Output() mudancaNoContador = new EventEmitter();
  @Input() aux: number = 100;
  incrementar(){
    this.aux++;
    this.mudancaNoContador.emit(this.aux)
  }
  decrementar(){
    this.aux--;
    this.mudancaNoContador.emit(this.aux)
  }
}
