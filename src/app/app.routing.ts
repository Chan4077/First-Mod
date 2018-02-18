import { CommunityComponent } from './docs/community/community.component';
import { DownloadsComponent } from './downloads/downloads.component';
import { GuideHomeComponent } from './docs/guide-home/guide-home.component';
import { BuildingComponent } from './docs/building/building.component';
import { GettingStartedComponent } from './docs/getting-started/getting-started.component';
import { HomeComponent } from './home/home.component';
import { ModuleWithProviders } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const GUIDE_ROUTES: Routes = [
	{ path: 'getting-started', component: GettingStartedComponent },
	{ path: 'building', component: BuildingComponent },
	{ path: 'community', component: CommunityComponent }
];
const APP_ROUTES: Routes = [
	{ path: 'home', component: HomeComponent },
	{ path: 'downloads', component: DownloadsComponent },
	{ path: 'guides', component: GuideHomeComponent },
	{ path: 'guides', children: GUIDE_ROUTES },
	{ path: '', redirectTo: '/home', pathMatch: 'full' }
];

export const AppRouting: ModuleWithProviders = RouterModule.forRoot(APP_ROUTES);
