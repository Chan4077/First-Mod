import { DocsItems, DocItem } from '../docs-items';
import { Component, OnInit } from '@angular/core';
import { SharedService } from "../../shared.service";

@Component({
	selector: 'app-guide-home',
	templateUrl: './guide-home.component.html'
})
export class GuideHomeComponent implements OnInit {
	guides: DocItem[];
	constructor(
		private shared: SharedService,
		private docsItems: DocsItems
	) {
		shared.title = 'List of Guides';
	}

	ngOnInit() {
		this.guides = this.docsItems.getDocItems();
	}

}
