import { Component, EventEmitter, Input, Output } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-alterar-idade',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './alterar-idade.component.html',
  styleUrl: './alterar-idade.component.scss'
})
export class AlterarIdadeComponent {

  @Input() idade = 28
  @Output() mudacaNaIdade: EventEmitter<number> = new EventEmitter();

}
