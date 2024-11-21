import { Component } from '@angular/core';

@Component({
  selector: 'app-ex02',
  standalone: true,
  imports: [],
  templateUrl: './ex02.component.html',
  styleUrl: './ex02.component.scss',
})
export class Ex02Component {
  plantas: Array<any> = [
    {
      id: 1,
      nome: 'Ficus lyrata',
      tamanhoMedio: '1.5m',
      interior: true,
      daFlores: false,
      imagem:
        'https://images.pexels.com/photos/5490302/pexels-photo-5490302.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1',
    },
    {
      id: 2,
      nome: 'Cacto',
      tamanhoMedio: '30cm',
      interior: true,
      daFlores: true,
      imagem: 'https://images.pexels.com/photos/5789864/pexels-photo-5789864.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1',
    },
    {
      id: 3,
      nome: 'Palmeira Ráfis',
      tamanhoMedio: '1.2m',
      interior: true,
      daFlores: false,
      imagem: 'https://s2.glbimg.com/y7Fd3LhX2hyiWv_txvfaTBsXyNs=/smart/e.glbimg.com/og/ed/f/original/2021/10/29/palmeira-rafia_1.jpg',
    },
    {
      id: 4,
      nome: 'Lavanda',
      tamanhoMedio: '60cm',
      interior: false,
      daFlores: true,
      imagem: 'https://images.pexels.com/photos/207518/pexels-photo-207518.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1',
    },
    {
      id: 5,
      nome: 'Bromélia',
      tamanhoMedio: '40cm',
      interior: true,
      daFlores: true,
      imagem: 'https://www.petz.com.br/blog/wp-content/uploads/2024/06/como-fazer-muda-de-bromelia-interna.jpg',
    },
    {
      id: 6,
      nome: 'Fetos',
      tamanhoMedio: '80cm',
      interior: true,
      daFlores: false,
      imagem: 'https://plantasedecor.com.br/wp-content/uploads/2024/02/samambaia-dentro-de-casa.jpg',
    },
    {
      id: 7,
      nome: 'Orquídea',
      tamanhoMedio: '50cm',
      interior: true,
      daFlores: true,
      imagem: 'https://images.pexels.com/photos/2291811/pexels-photo-2291811.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1',
    },
    {
      id: 8,
      nome: 'Hibisco',
      tamanhoMedio: '1.0m',
      interior: false,
      daFlores: true,
      imagem: 'https://images.pexels.com/photos/720375/pexels-photo-720375.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1',
    },
    {
      id: 9,
      nome: 'Zamioculca',
      tamanhoMedio: '90cm',
      interior: true,
      daFlores: false,
      imagem: 'https://images.pexels.com/photos/9507084/pexels-photo-9507084.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1',
    },
    {
      id: 10,
      nome: 'Clematis',
      tamanhoMedio: '1.5m',
      interior: false,
      daFlores: true,
      imagem: 'https://images.pexels.com/photos/94428/pexels-photo-94428.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1',
    },
  ];
}
