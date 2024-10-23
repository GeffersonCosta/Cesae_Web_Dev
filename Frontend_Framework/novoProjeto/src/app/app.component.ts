import { Component } from '@angular/core';
import { RouterLink, RouterLinkActive, RouterOutlet } from '@angular/router';
import { ComponenteComponent } from "./componente/componente.component";
import { OutoComponenteComponent } from "./componente/outo-componente/outo-componente.component";
import { Ex1Component } from "./exercicios/ex1/ex1.component";
import { AlterarNomeComponent } from "./exercicios/ex1/alterar-nome/alterar-nome.component";
import { AlterarIdadeComponent } from "./exercicios/ex1/alterar-idade/alterar-idade.component";
import { FormsModule } from '@angular/forms';



@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, ComponenteComponent, OutoComponenteComponent, Ex1Component, AlterarNomeComponent, AlterarIdadeComponent, FormsModule, RouterLink, RouterLinkActive],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'novoProjeto';



}
