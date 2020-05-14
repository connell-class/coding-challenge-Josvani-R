import { Component, OnInit } from '@angular/core';
import { ListService } from 'src/app/services/list.service';
import { List } from 'src/app/model/List';

@Component({
  selector: 'app-home-container',
  templateUrl: './home-container.component.html',
  styleUrls: ['./home-container.component.css']
})
export class HomeContainerComponent implements OnInit {
  isLoading: boolean= false;


  constructor(private listService:ListService) { }

  getList(){
    this.isLoading=true;
    let list:List={
      "id":0,
      "listname": ''
    }
  }

  ngOnInit(): void {
  }

}
