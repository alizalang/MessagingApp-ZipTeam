import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { SignUpPage } from '../sign-up/sign-up';
import { AuthServiceProvider } from '../../providers/auth-service/auth-service';
import { NgForm } from '@angular/forms';
import { HomePage } from '../home/home';

/**
 * Generated class for the FirstPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-first',
  templateUrl: 'first.html',
})
export class FirstPage {

  responseData: any;

  constructor(public navCtrl: NavController, public navParams: NavParams, public authService: AuthServiceProvider) {
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad FirstPage');
  }

  loginButton(createAccountInfo: NgForm) {
    this.authService.postData(createAccountInfo).then((result) => {
      this.responseData = result;
      console.log(createAccountInfo);
      if(!this.responseData.createAccountInfo){
        this.navCtrl.push(HomePage);
      }else{
        console.log("check your info");
      }
      
    }).catch(console.log);
  }


  createAccount(){
    this.navCtrl.push(SignUpPage);
    console.log("clicked");
  }

}
