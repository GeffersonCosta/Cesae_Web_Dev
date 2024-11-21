import { Component, EventEmitter, Input, Output, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-contador',
  standalone: true,
  imports: [],
  templateUrl: './contador.component.html',
  styleUrl: './contador.component.scss'
})
export class ContadorComponent {
  @Output() mudancaNoContador = new EventEmitter();
  @Input() aux: number = 0;
  
  constructor() {
    console.log('ContadorComponent.constructor()');
  }
  
  ngOnChanges(changes: SimpleChanges): void {
    console.log('ContadorComponent.ngOnChanges()', changes);
    
    if(changes['aux'] && changes['aux'].currentValue >= 110) {
      this.aux = 109;
      this.mudancaNoContador.emit(this.aux);
    }
  }
  
  ngOnInit() {
    console.log('ContadorComponent.ngOnInit()');
  }
  
  ngOnDestroy() {
    console.log('ContadorComponent.ngOnDestroy()');
  }

  incrementar() {
    this.aux++;
    this.mudancaNoContador.emit(this.aux);
  }

  decrementar() {
    this.aux--;
    this.mudancaNoContador.emit(this.aux);
  }
}
