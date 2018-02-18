import { SharedService, Release } from '../shared.service';
import { Component } from '@angular/core';

@Component({
	selector: 'app-downloads',
	templateUrl: './downloads.component.html'
})
export class DownloadsComponent {

	constructor(private shared: SharedService) {
		this.releases = shared.getReleases();
		shared.title = 'Downloads';
	}
	releases: Release[];
}
