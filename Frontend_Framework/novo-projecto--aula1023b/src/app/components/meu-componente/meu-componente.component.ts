import { Component, Input } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-meu-componente',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './meu-componente.component.html',
  styleUrl: './meu-componente.component.scss'
  //template: `<p>ola</p>`,
  //styles: `p { color: red }`
})
export class MeuComponenteComponent {
  //@Input() meuNome = 'João';
  //@Input('meu-nome') meuNome = 'João';
  @Input({ alias: 'meu-nome', required: true }) meuNome = 'João';
  mensagem = 'Eu adoro gatos! 😻';
  idade = 60;
  imagem = 'https://images.pexels.com/photos/416160/pexels-photo-416160.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1';
  
  estaAtivado = false;
  corDeTexto = 'rgba(200, 200, 150, .75)';
  corDeFundo = '#369';
  
  onClick() {
    this.estaAtivado = !this.estaAtivado;
    this.meuNome = 'Paulo';
    this.corDeFundo = '#147'
  }
}
