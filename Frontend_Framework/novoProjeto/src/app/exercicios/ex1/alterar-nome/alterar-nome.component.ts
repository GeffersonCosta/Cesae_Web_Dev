import { Component, Input } from '@angular/core';
import { FormsModule } from '@angular/forms';


@Component({
  selector: 'app-alterar-nome',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './alterar-nome.component.html',
  styleUrl: './alterar-nome.component.scss'
})
export class AlterarNomeComponent {
  @Input() nome = "Gefferson";
}
