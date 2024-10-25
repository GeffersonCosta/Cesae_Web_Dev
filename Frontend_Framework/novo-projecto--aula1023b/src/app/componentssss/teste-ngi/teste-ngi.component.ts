import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-teste-ngi',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './teste-ngi.component.html',
  styleUrl: './teste-ngi.component.scss'
})
export class TesteNgiComponent {
  valor: number = 20;
}
