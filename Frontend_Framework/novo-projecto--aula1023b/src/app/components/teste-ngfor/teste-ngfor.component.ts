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
  fruta: Array<string> = ["Maçã", "Banana", "Pera", "Morango"];

  ngOnInit(){
    console.table(this.fruta)
  }
}
