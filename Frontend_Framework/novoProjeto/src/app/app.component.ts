import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { ComponenteComponent } from "./componente/componente.component";
import { OutoComponenteComponent } from "./componente/outo-componente/outo-componente.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, ComponenteComponent, OutoComponenteComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'novoProjeto';

}
