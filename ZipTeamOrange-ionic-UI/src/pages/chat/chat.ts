import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { NgForm } from '../../../node_modules/@angular/forms';
import { MessageServiceProvider } from '../../providers/message-service/message-service';
import { Message } from '../../../node_modules/@angular/compiler/src/i18n/i18n_ast';

/**
 * Generated class for the ChatPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */

@IonicPage()
@Component({
  selector: 'page-chat',
  templateUrl: 'chat.html',
})
export class ChatPage {
  test: any;
  msg: any;
  messages: Message [];
  constructor(public navCtrl: NavController, public navParams: NavParams, public messageApi: MessageServiceProvider) {
  }

  ionViewDidLoad() {
    console.log('ionViewDidLoad ChatPage');
    this.getMessages();
  }

  send(createAccountInfo: NgForm){
    console.log("clicked");
    console.log(createAccountInfo)
    this.messageApi.saveMessage(createAccountInfo).subscribe(console.log);
    this.getMessages()
  }

  getMessages(){
    this.messageApi.getMessages().subscribe(data => {
      this.msg = data
      console.log(data)
    });
    this.test = this.messageApi.getCurrentMessage();
  }

}