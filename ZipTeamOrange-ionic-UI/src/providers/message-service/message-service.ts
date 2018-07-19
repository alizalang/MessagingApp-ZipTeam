import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

/*
  Generated class for the MessageServiceProvider provider.

  See https://angular.io/guide/dependency-injection for more info on providers
  and Angular DI.
*/
@Injectable()
export class MessageServiceProvider {

  constructor(public http: HttpClient) {
    console.log('Hello MessageServiceProvider Provider');
  }

  getMessages(){
    return this.http.get('http:localhost:8080/messages')
  }

  saveMessage(createAccountInfo: any) : Observable<Object> {
    return this.http.post(`http://localhost:8080/message/add`, createAccountInfo);
  }

}
