import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-teste-ngfor',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './teste-ngfor.component.html',
  styleUrl: './teste-ngfor.component.scss'
})
export class TesteNgforComponent {
  frutas: Array<string> = [
    'banana',
    'maça',
    'pera',
    'morango'
  ];
  
  animais: Array<any> = [
    { id: 1, nome: 'Bob', espece: 'cao'},
    { id: 2, nome: 'Max', espece: 'gato'},
    { id: 3, nome: 'Rex', espece: 'cao'},
  ];
  
  ngOnInit() {
    console.table(this.frutas);
    console.table(this.animais);
  }
}
