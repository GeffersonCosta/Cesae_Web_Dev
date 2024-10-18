import { Component, Input } from '@angular/core';
import { FormsModule } from '@angular/forms';
@Component({
  selector: 'app-componente',
  standalone: true,
  imports: [FormsModule],
  providers: [],
  templateUrl: './componente.component.html',
  styleUrl: './componente.component.scss'
})
export class ComponenteComponent {

  @Input() nome = "Gefferson";
  corDeTexto = "rgba(3,3,3,99)"
  corDeFundo = '#1254'
  imagem = "https://images.unsplash.com/photo-1516280030429-27679b3dc9cf?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"

  estadoAtivo = true
  onclick(){
    this.estadoAtivo = !this.estadoAtivo;
    this.nome = "Henrique"
    this.corDeFundo = '#9A9A9A'
  }

}
