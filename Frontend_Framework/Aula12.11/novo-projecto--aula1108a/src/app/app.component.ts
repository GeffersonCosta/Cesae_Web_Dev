import { Component } from '@angular/core';
import { RouterLink, RouterLinkActive, RouterOutlet } from '@angular/router';
import { MeuComponenteComponent } from './components/meu-componente/meu-componente.component';
import { OutroComponenteComponent } from './components/outro-componente/outro-componente.component';
import { Ex01Component } from './exercicios/ex01/ex01.component';
import { Ex02Component } from './exercicios/ex02/ex02.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    RouterOutlet,
    MeuComponenteComponent,
    OutroComponenteComponent,
    Ex01Component,
    Ex02Component,
    RouterLink,
    RouterLinkActive,
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss',
})
export class AppComponent {
  title: string = 'novo-projecto';

  // -- ---- -------- ----------------
  // Tipo de dados - JS Core
  bool: boolean = true; // false
  numero: number = 0; // 5; 8.6...
  texto: string = 'isto é um texto';
  objeto: object = { a: 'texto', b: 8.6 };
  vetor: object = ['a', 'b'];
  indefinido: undefined;
  nulo: null = null;

  // Tipo de dados - TS
  vetor2: Array<number> = [0, 1, 1, 2, 3, 5, 8.5]; // Ou = new Array(0, 1, 1, 2, 3, 5, 8.5);
  objeto2: MinhaClasse = new MinhaClasse();
  numeroOuNull: number | null = null;
  textoOuIndefinido: string | undefined;
}

class MinhaClasse {}
