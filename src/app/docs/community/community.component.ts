import { Component } from '@angular/core';
import { SharedInjectable } from '../../shared';

@Component({
	selector: 'app-community',
	templateUrl: './community.component.html'
})
export class CommunityComponent {
	constructor(private shared: SharedInjectable) { shared.title = "Community contributions"; }
}