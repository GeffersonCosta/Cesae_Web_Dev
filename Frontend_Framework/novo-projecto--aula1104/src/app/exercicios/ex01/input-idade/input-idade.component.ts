import { Component, EventEmitter, Input, Output } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-input-idade',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './input-idade.component.html',
  styleUrl: './input-idade.component.scss',
})
export class InputIdadeComponent {
  @Input() idade: number = 50;
  @Output() mudacaNaIdade: EventEmitter<number> = new EventEmitter();

  mudarIdade() {
    this.mudacaNaIdade.emit(this.idade);
  }
}
