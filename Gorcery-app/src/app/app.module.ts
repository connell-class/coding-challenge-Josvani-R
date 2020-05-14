import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {HomeContainerComponent} from './components/home-container/home-container.component'
@NgModule({
  imports:      [ BrowserModule, AppRoutingModule ],
  declarations: [AppComponent, HomeContainerComponent ],

})
export class AppModule { }
