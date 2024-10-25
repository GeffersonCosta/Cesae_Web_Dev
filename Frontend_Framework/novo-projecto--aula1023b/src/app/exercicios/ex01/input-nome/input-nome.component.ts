import { Component, EventEmitter, Input, Output } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-input-nome',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './input-nome.component.html',
  styleUrl: './input-nome.component.scss',
})
export class InputNomeComponent {
  @Input() nome: string = '';
  @Output() mudacaNoNome: EventEmitter<string> = new EventEmitter();

  mudarNome() {
    this.mudacaNoNome.emit(this.nome);
  }
}
