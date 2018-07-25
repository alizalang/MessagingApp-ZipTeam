import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Message } from '../../Classes/Messsage';

/*
  Generated class for the MessageServiceProvider provider.

  See https://angular.io/guide/dependency-injection for more info on providers
  and Angular DI.
*/
@Injectable()
export class MessageServiceProvider {

  messages = [];
  constructor(public http: HttpClient) {
    console.log('Hello MessageServiceProvider Provider');
  }

  getMessages(){
    return this.http.get('https://arcane-ridge.herokuapp.com//message/all');
  }

  getCurrentMessage(){
    return this.messages;
  }

  saveMessage(createAccountInfo: any) : Observable<Object> {
    return this.http.post('https://arcane-ridge.herokuapp.com//message/add', createAccountInfo);
  }

}
