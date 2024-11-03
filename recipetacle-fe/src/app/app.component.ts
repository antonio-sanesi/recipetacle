import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { NewRecipeComponent } from "./components/new-recipe/new-recipe.component";
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    RouterOutlet,
    NewRecipeComponent
],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'recipetacle';
}
