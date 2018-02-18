import { SharedService } from '../shared.service';
import { Component } from '@angular/core';

@Component({
	selector: 'app-screenshots',
	templateUrl: './screenshots.component.html'
})
export class ScreenshotsComponent {

	constructor(private shared: SharedService) { shared.title = 'Mod Screenshots'; }

}
