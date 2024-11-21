import { Injectable } from '@angular/core';
import { Animal } from '../models/animal';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment.development';

@Injectable({
  providedIn: 'root',
})
export class AnimaisService {

  private apiUrl = environment.URL;;
  private animais: Array<Animal> = [];

  constructor(private http: HttpClient) {
    console.log('AnimaisService.constructor()');
  }

  getAnimais(): Observable<Animal[]> {
    return this.http.get<Animal[]>(this.apiUrl)
  };

  getAnimal(id: string): Observable<Animal> {
    return this.http.get<Animal>(this.apiUrl + id)
  };

  createAnimal(animal: Animal): Observable<Animal> {
    //this.animais.push(animal);
    return this.http.post<Animal>(this.apiUrl, animal)
  };

  deleteAnimal(id: string): Observable<any> {
    return this.http.delete<any>(this.apiUrl + id)
  };

  updateAnimal(animal: Animal): Observable<any> {
    return this.http.put<Animal>(this.apiUrl + animal.id, animal)
  }
}
