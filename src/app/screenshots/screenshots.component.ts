import { SharedInjectable } from '../shared';
import { Component } from '@angular/core';

@Component({
	selector: 'app-screenshots',
	templateUrl: './screenshots.component.html'
})
export class ScreenshotsComponent {

	constructor(private shared: SharedInjectable) {shared.title = "Mod Screenshots";}

}
