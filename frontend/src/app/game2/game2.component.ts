import { Component, OnInit } from '@angular/core';
import { game2 } from 'src/game2';




@Component({
  selector: 'app-game2',
  templateUrl: './game2.component.html',
  styleUrls: ['./game2.component.scss'],

})
export class Game2Component implements OnInit {

  constructor() { }

  ngOnInit() {

   game2.StartGame();



  }

genGame(){


}



}
