import { Component } from '@angular/core';
import {FormsModule} from '@angular/forms';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-new-recipe',
  standalone: true,
  imports: [
    FormsModule
  ],
  templateUrl: './new-recipe.component.html',
  styleUrl: './new-recipe.component.scss'
})
export class NewRecipeComponent {
  title = "";
  description = "";
  doseMultiplier = 1;
  doseUnit = "porzioni";


  constructor(
    private httpClient: HttpClient
  ) {
  }

  onSave(){
    console.log("Salvataggio in corso...");

    const nuovaRicetta = {
      name: this.title,
      description: this.description,
      baseMultiplier: this.doseMultiplier,
      baseMultiplierUnit: this.doseUnit
    }

    console.log("chiamata al backend");

    this.httpClient.post('http://localhost:8080/recipes', nuovaRicetta).subscribe((risultato) => {
      console.log("Ricetta salvata");
      console.log(risultato);
    })

  }

}
