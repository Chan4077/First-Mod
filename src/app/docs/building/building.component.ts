import { SharedService } from '../../shared.service';
import { Component, AfterViewInit } from '@angular/core';

@Component({
	selector: 'app-building',
	templateUrl: './building.component.html'
})
export class BuildingComponent {
	constructor(private shared: SharedService) { shared.title = 'Building from source'; }
}
