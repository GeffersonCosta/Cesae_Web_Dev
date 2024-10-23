import { Routes } from '@angular/router';
import { Ex1Component } from './exercicios/ex1/ex1.component';
import { NotFoundComponent } from './pages/not-found/not-found.component';
import { OutoComponenteComponent } from './componente/outo-componente/outo-componente.component';

export const routes: Routes = [
  { path: 'ex01', title: 'Exercicio 1', component: Ex1Component },
  {path: 'outro',title: 'Outro componente',component: OutoComponenteComponent},
  { path: ' ', redirectTo: 'outro' , pathMatch: 'full' },
  { path: '**', title: 'Pagina não encontrada', component: NotFoundComponent },
];
