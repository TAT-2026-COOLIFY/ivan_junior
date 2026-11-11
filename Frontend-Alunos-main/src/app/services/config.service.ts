import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class ConfigService {
  private apiUrl!: string;

  loadConfig(): void {
    const ip = window.location.hostname;
    this.apiUrl = `http://${ip}:8080`;

    console.log('API configurada:', this.apiUrl);
  }

  getApi(path: string): string {
    if (!this.apiUrl) {
      throw new Error('Configuração ainda não carregada!');
    }
    return `${this.apiUrl}/${path}`;
  }
}