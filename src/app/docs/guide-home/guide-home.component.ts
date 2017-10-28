import { NavLink } from './../../app.component';
import { Component, OnInit } from '@angular/core';

@Component({
	selector: 'app-guide-home',
	templateUrl: './guide-home.component.html'
})
export class GuideHomeComponent implements OnInit {
	guides: NavLink[] = [
		{
			link: "getting-started",
			title: "Getting started"
		},
		{
			link: "building",
			title: "Building locally"
		}
	]
	constructor() { }

	ngOnInit() {
	}

}
