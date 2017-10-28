import { Shared } from './shared';
import { Component, ViewChild, OnInit } from '@angular/core';
import { BreakpointObserver } from '@angular/cdk/layout';
import { MatSidenav } from '@angular/material/sidenav';
import * as hljs from 'highlight.js';

@Component({
	selector: 'app-root',
	templateUrl: './app.component.html'
})
export class AppComponent implements OnInit {
	constructor(private breakpointObserver: BreakpointObserver, private shared: Shared){}
	@ViewChild('left') sidenav: MatSidenav;
	get isSidenavOpen() {
		if (this.sidenav.opened) {
			return true;
		} else {
			return false;
		}
	}
	get isMobile() {
		if (this.breakpointObserver.isMatched('(max-width: 599px)')) {
			return true;
		} else {
			return false;
		}
	}
	links: NavLink[] = [
		{
			link: "home",
			title: "Home",
			icon: "home"
		},
		{
			link: "downloads",
			title: "Downloads",
			icon: "file_download"
		},
		{
			link: "guides",
			title: "Guides"
		}
	];
	ngOnInit() {
		hljs.initHighlightingOnLoad();
	}
}

export interface NavLink {
	link: string;
	title: string;
	icon?: string;
}