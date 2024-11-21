import { Component, inject } from '@angular/core';
import { ListaAnimaisComponent } from "../../components/lista-animais/lista-animais.component";
import { AnimaisService } from '../../services/animais.service';
import { Animal } from '../../models/animal';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';

@Component({
  selector: 'app-animais',
  standalone: true,
  imports: [ListaAnimaisComponent],
  providers: [],
  templateUrl: './animais.component.html',
  styleUrl: './animais.component.scss'
})
export class AnimaisComponent {
  //animais: Array<{id: number, nome: string, ...}> = [
  animais: Array<any> = [];

  //animaisServicee = inject(AnimaisService);

  constructor(private animaisService: AnimaisService, private router: Router) {
    //this.animais = animaisService.getAnimais()
    console.log(this.animais)
  }

  onClickAdd() {
    const animal: Animal = {
      //id: 101,
      nome: 'Caril',
      especie: 'gato',
      dataNascimento: '2018-06-25',
      cor: 'amarelado'
    };

    this.animaisService.createAnimal(animal).subscribe({
      next: (animal) => {
        this.animais.push(animal);
      },
      error: (error) => {
        console.error('Algo deu errado:', error)
      }
    });
  }

  goToCreateAnimal() {
    //this.router.navigateByUrl('animais/create')
    this.router.navigate(['animais','create']);
  };

  ngOnInit() {
    this.animaisService.getAnimais().subscribe({
      next: (data) => {
        this.animais = data;
      },
      error: (error) => {
        console.error('Algo deu errado:', error)
      }
    });
  }
}
function next(value: Animal): void {
  throw new Error('Function not implemented.');
}

