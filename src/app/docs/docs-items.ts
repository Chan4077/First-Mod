import { Injectable } from '@angular/core';

const GUIDE_ITEMS: DocItem[] = [
	{
		name: 'Building the Source Code',
		id: 'building',
		url: 'guides/building'
	},
	{
		name: 'Getting Started',
		id: 'getting-started',
		url: 'guides/getting-started'
	},
	{
		name: 'Community',
		id: 'community',
		url: 'guides/community'
	},
	{
		name: 'Mod Screenshots',
		id: 'screenshots',
		url: 'guides/screenshots'
	}
];

@Injectable()
export class DocsItems {
	getDocItems(): DocItem[] {
		return GUIDE_ITEMS;
	}
	getDocItemById(id: string): DocItem {
		return GUIDE_ITEMS.find(i => i.id === id);
	}
}

export interface DocItem {
	name: string;
	id: string;
	url: string;
}
