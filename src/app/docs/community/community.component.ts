import { Component } from '@angular/core';
import { SharedService } from '../../shared.service';

@Component({
	selector: 'app-community',
	templateUrl: './community.component.html'
})
export class CommunityComponent {
	constructor(private shared: SharedService) { shared.title = 'Community contributions'; }
}
