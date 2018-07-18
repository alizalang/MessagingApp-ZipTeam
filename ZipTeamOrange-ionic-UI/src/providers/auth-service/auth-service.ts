import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import 'rxjs/add/operator/map';


/*
  Generated class for the AuthServiceProvider provider.

  See https://angular.io/guide/dependency-injection for more info on providers
  and Angular DI.
*/
@Injectable()
export class AuthServiceProvider {

  constructor(public http: HttpClient) {
    console.log('Hello AuthServiceProvider Provider');
  }

  postData(createAccountInfo: any){
    return new Promise((resolve, reject) => {

      this.http.post(`http://localhost:8080/user/add`, createAccountInfo, {responseType: 'text'}).subscribe((res: any) => {
      console.log(JSON.parse(res))
      resolve(JSON.parse(res));
      }, (err) => {
        reject(err);
      });
    });
  }

}
