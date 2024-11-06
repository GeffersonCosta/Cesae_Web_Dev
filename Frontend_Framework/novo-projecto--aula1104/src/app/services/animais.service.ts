import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Animal } from '../models/animal';

@Injectable({
  providedIn: 'root',
})
export class AnimaisService {
  private animais: Array<any> = [];

  constructor(private http: HttpClient) {
    console.log('AnimaisService.constructor()');
  }

  getAnimais(): Promise<Animal[]> {
    return new Promise<Animal[]>((resolve, reject) => {
      this.http.get<Animal[]>('http://localhost:3000/animais').subscribe();
    });
  }

  createAnimal(animal: any) {
    this.animais.push(animal);
  }
}
