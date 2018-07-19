import { NgModule, ErrorHandler } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { IonicApp, IonicModule, IonicErrorHandler } from 'ionic-angular';
import { MyApp } from './app.component';


import { AboutPage } from '../pages/about/about';
import { ContactPage } from '../pages/contact/contact';
import { HomePage } from '../pages/home/home';
import { TabsPage } from '../pages/tabs/tabs';

import { StatusBar } from '@ionic-native/status-bar';
import { SplashScreen } from '@ionic-native/splash-screen';
import { FirstPage } from '../pages/firstPage/first';
import { SignUpPage } from '../pages/sign-up/sign-up';
import { ApiServiceProvider } from '../providers/api-service/api-service';
import { HttpClientModule } from '../../node_modules/@angular/common/http';
import { AuthServiceProvider } from '../providers/auth-service/auth-service';
import { MessageServiceProvider } from '../providers/message-service/message-service';
import { ChatPage } from '../pages/chat/chat';

@NgModule({
  declarations: [
    MyApp,
    FirstPage,
    AboutPage,
    ContactPage,
    HomePage,
    TabsPage,
    SignUpPage,
    ChatPage
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    IonicModule.forRoot(MyApp)
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    FirstPage,
    AboutPage,
    ContactPage,
    HomePage,
    TabsPage,
    SignUpPage,
    ChatPage
  ],
  providers: [
    StatusBar,
    SplashScreen,
    {provide: ErrorHandler, useClass: IonicErrorHandler},
    ApiServiceProvider,
    AuthServiceProvider,
    MessageServiceProvider
  ]
})
export class AppModule {}
