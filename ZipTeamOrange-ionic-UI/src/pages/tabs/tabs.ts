import { Component } from '@angular/core';

import { AboutPage } from '../about/about';
import { ContactPage } from '../contact/contact';
import { HomePage } from '../home/home';
import { FirstPage } from '../firstPage/first';

@Component({
  templateUrl: 'tabs.html'
})
export class TabsPage {

  tab1Root = FirstPage;
  tab2Root = HomePage;
  tab3Root = AboutPage;
  tab4Root = ContactPage;

  constructor() {

  }
}
