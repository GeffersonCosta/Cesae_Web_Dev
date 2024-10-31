import { Component } from '@angular/core';
import { ListaAnimaisComponent } from "../../components/lista-animais/lista-animais.component";

@Component({
  selector: 'app-animais',
  standalone: true,
  imports: [ListaAnimaisComponent],
  templateUrl: './animais.component.html',
  styleUrl: './animais.component.scss'
})
export class AnimaisComponent {

  animais: Array<any> = [
    { id: 1, nome: "Cachorro" },
    { id: 2, nome: "Gato" },
    { id: 3, nome: "Elefante" },
    { id: 4, nome: "Leão" },
    { id: 5, nome: "Tigre" },
    { id: 6, nome: "Girafa" },
    { id: 7, nome: "Zebra" },
    { id: 8, nome: "Macaco" },
    { id: 9, nome: "Coelho" },
    { id: 10, nome: "Lobo" },
    { id: 11, nome: "Raposa" },
    { id: 12, nome: "Urso" },
    { id: 13, nome: "Cavalo" },
    { id: 14, nome: "Cobra" },
    { id: 15, nome: "Golfinho" },
    { id: 16, nome: "Pinguim" },
    { id: 17, nome: "Crocodilo" },
    { id: 18, nome: "Águia" },
    { id: 19, nome: "Coruja" },
    { id: 20, nome: "Arara" }
  ];

}
