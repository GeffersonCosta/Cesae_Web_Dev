import { Routes } from '@angular/router';
import { Ex01Component } from './exercicios/ex01/ex01.component';
import { NotFoundComponent } from './pages/not-found/not-found.component';
import { OutroComponenteComponent } from './components/outro-componente/outro-componente.component';
import { TesteNgiComponent } from './componentssss/teste-ngi/teste-ngi.component';
import { TesteNgforComponent } from './components/teste-ngfor/teste-ngfor.component';

export const routes: Routes = [
  { path: 'ex01', title: 'Exercico 01', component: Ex01Component },
  {path: 'outro',title: 'Outro Componente',component: OutroComponenteComponent,},
  {path: 'ngif', title: 'Estrutura condicionais', component: TesteNgiComponent},
  {path: 'ngfor', title: 'Estrutura de repetição', component: TesteNgforComponent},
  //{ path: '', component: OutroComponenteComponent },
  { path: '', redirectTo: '/outro', pathMatch: 'full' },
  { path: '**', title: 'Página não encontrada', component: NotFoundComponent },
];
