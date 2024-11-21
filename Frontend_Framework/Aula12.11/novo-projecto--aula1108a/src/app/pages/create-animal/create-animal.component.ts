import { AnimaisService } from './../../services/animais.service';
import { Animal } from './../../models/animal';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-animal',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './create-animal.component.html',
  styleUrl: './create-animal.component.scss'
})
export class CreateAnimalComponent {

  novoAnimal: Animal = {
    nome: '',
    especie: '',
    dataNascimento: '',
    cor: ''
  };

  constructor(private animalService: AnimaisService, private router: Router) { }

  animalData() {
    console.log(this.novoAnimal);
    this.animalService.createAnimal(this.novoAnimal)
      .subscribe({
        next: (valor) => {
          this.router.navigate(['animais']);
        },
        error: (error) => {
          console.log('Erro ao inserir um novo animal!', error);
        }
      })
  }
}
