import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from '../../../node_modules/rxjs/Rx';

/*
  Generated class for the ApiServiceProvider provider.

  See https://angular.io/guide/dependency-injection for more info on providers
  and Angular DI.
*/
@Injectable()
export class ApiServiceProvider {

  constructor(public http: HttpClient) {
    console.log('Hello ApiServiceProvider Provider');
  }

  getUsers(){
    return this.http.get('http:localhost:8080/users')
  }

  save(createAccountInfo: any) : Observable<Object> {
    //return this.http.post(`http://localhost:8080/ZipTeamOrange/add?username=${createAccountInfo.name}&email=${createAccountInfo.email}&password=${createAccountInfo.password}`, {})
    return this.http.post(`http://localhost:8080/user/add`, createAccountInfo);
  }

}
