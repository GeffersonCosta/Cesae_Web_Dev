import { Routes } from '@angular/router';
import { Ex01Component } from './exercicios/ex01/ex01.component';
import { NotFoundComponent } from './pages/not-found/not-found.component';
import { OutroComponenteComponent } from './components/outro-componente/outro-componente.component';
import { TesteNgifComponent } from './components/teste-ngif/teste-ngif.component';
import { TesteNgforComponent } from './components/teste-ngfor/teste-ngfor.component';
import { AnimaisComponent } from './pages/animais/animais.component';
import { CreateAnimalComponent } from './pages/create-animal/create-animal.component';

export const routes: Routes = [
  { path: 'ex01', title: 'Exercico 01', component: Ex01Component },
  {
    path: 'outro',
    title: 'Outro Componente',
    component: OutroComponenteComponent,
  },
  { path: 'ngif', title: 'Estruturas condicionais', component: TesteNgifComponent },
  { path: 'ngfor', title: 'Estruturas de repetição', component: TesteNgforComponent },
  { path: 'animais', title: 'Página Animais', component: AnimaisComponent },
  { path: 'animais/create', title: 'Adicionar Animal', component: CreateAnimalComponent },

  //{ path: '', component: OutroComponenteComponent },
  { path: '', redirectTo: '/outro', pathMatch: 'full' },
  { path: '**', title: 'Página não encontrada', component: NotFoundComponent },
];
