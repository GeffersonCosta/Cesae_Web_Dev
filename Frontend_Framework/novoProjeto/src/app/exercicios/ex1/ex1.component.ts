import { Component, Input } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AlterarIdadeComponent } from "./alterar-idade/alterar-idade.component";
import { AlterarNomeComponent } from "./alterar-nome/alterar-nome.component";

@Component({
  selector: 'app-ex1',
  standalone: true,
  imports: [FormsModule, Ex1Component, AlterarIdadeComponent, AlterarNomeComponent],
  templateUrl: './ex1.component.html',
  styleUrl: './ex1.component.scss'
})
export class Ex1Component {
 @Input() nome = "Gefferson";
  @Input() idade = 28;

  atualizarNome(novoNome: any){
    this.nome = novoNome;
  }

  atualizarIdade(novaIdade: any){
    this.idade = novaIdade;
  }

}
