import { Component, OnInit } from '@angular/core';
import { ListService } from 'src/app/services/list.service';
import { List } from 'src/app/model/List';

@Component({
  selector: 'app-home-container',
  templateUrl: './home-container.component.html',
  styleUrls: ['./home-container.component.css']
})
export class HomeContainerComponent implements OnInit {



  constructor(private listService:ListService) { }

  getList(){
    this.listService.getAll().then(resp=>{
      console.log(resp);

    })
  }

  ngOnInit(): void {
    this.getList();
  }

}
