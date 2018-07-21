import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams, ToastController } from 'ionic-angular';
import { NgForm } from '@angular/forms';
import { ApiServiceProvider } from '../../providers/api-service/api-service';
``

/**
 * Generated class for the SignUpPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-sign-up',
  templateUrl: 'sign-up.html',
})
export class SignUpPage {


  user: any = {};
  error: any;

  constructor(public navCtrl: NavController, public navParams: NavParams, public apiProvider: ApiServiceProvider, public toastCtrl: ToastController) {
  }

  // ngOnInit(){
  //   this.loadUsers();
  // }

  // loadUsers(){
  //   this.apiProvider.getUsers().subscribe(data => this.user =data["_embedded"]["users"],
  // err => {
  //   console.log(err);
  // });
  // }

  ionViewDidLoad() {
    console.log('ionViewDidLoad SignUpPage');
  }

  save(createAccountInfo: NgForm) {
  //  console.log(createAccountInfo)
    this.apiProvider.save(createAccountInfo).subscribe(console.log)
  }

}
