import { Component } from '@angular/core';
import { ListaAnimaisComponent } from "../../components/lista-animais/lista-animais.component";
import { AnimaisService } from '../../services/animais.service';

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
  
  constructor(private animaisService: AnimaisService) {
    this.animais = animaisService.getAnimais()
    console.log(this.animais)
  }
  
  onClickAdd() {
    
  }
}
