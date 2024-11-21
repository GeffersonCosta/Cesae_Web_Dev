export interface Animal {
  id?: string;
  nome: string;
  especie: string;
  dataNascimento: string;
  //cor: string | undefined;
  // ou ↓
  cor?: string;
}
