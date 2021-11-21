import { AuthService } from './services/auth.service';
import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { User } from './models/models';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  events: string[] = [];
  opened: boolean;
  currentUser: User;
  showMenu: boolean = true;
  title = 'gestao-financeira-web';

  constructor (
    private router: Router,
    private auth: AuthService
  ){
    this.auth.currentUser.subscribe( res => {
      if(res){
        this.currentUser = res
        this.showMenu = false;
      }
    });
  }


  public logout() {
    this.auth.logout();
    this.router.navigate(['/login'])
  }

}
