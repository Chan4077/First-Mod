import { CommunityComponent } from './docs/community/community.component';
import { DocsItems } from './docs/docs-items';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppRouting } from './app.routing';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FlexLayoutModule } from '@angular/flex-layout';

//#region Shared module
import { SharedModule } from './shared.service';
//#endregion

//#region Material module imports
import { MatButtonModule } from '@angular/material/button';
import { MatCardModule } from '@angular/material/card';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatDialogModule } from '@angular/material/dialog';
import { MatExpansionModule } from '@angular/material/expansion';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatIconModule } from '@angular/material/icon';
import { MatInputModule } from '@angular/material/input';
import { MatListModule } from '@angular/material/list';
import { MatMenuModule } from '@angular/material/menu';
import { MatNativeDateModule } from '@angular/material/core';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatTooltipModule } from '@angular/material/tooltip';
//#endregion

//#region CDK module imports
import { LayoutModule } from '@angular/cdk/layout';
import { HomeComponent } from './home/home.component';
//#endregion

//#region Components
import { AppComponent } from './app.component';
import { GettingStartedComponent } from './docs/getting-started/getting-started.component';
import { BuildingComponent } from './docs/building/building.component';
import { GuideHomeComponent } from './docs/guide-home/guide-home.component';
import { DownloadsComponent } from './downloads/downloads.component';
import { HighlightCodeDirective } from './highlight-code.directive';
import { CodeViewerComponent } from './code-viewer/code-viewer.component';
//#endregion

//#region Material modules
const MATERIAL_MODULES = [
	MatButtonModule,
	MatCardModule,
	MatDatepickerModule,
	MatDialogModule,
	MatExpansionModule,
	MatFormFieldModule,
	MatIconModule,
	MatInputModule,
	MatListModule,
	MatMenuModule,
	MatNativeDateModule,
	MatSidenavModule,
	MatSnackBarModule,
	MatToolbarModule,
	MatTooltipModule
];
//#endregion

//#region CDK modules
const CDK_MODULES = [
	LayoutModule
];
//#endregion
@NgModule({
	declarations: [
		AppComponent,
		HomeComponent,
		GettingStartedComponent,
		BuildingComponent,
		CommunityComponent,
		GuideHomeComponent,
		DownloadsComponent,
		HighlightCodeDirective,
		CodeViewerComponent
	],
	imports: [
		BrowserModule,
		BrowserAnimationsModule,
		FormsModule,
		HttpClientModule,
		FlexLayoutModule,
		MATERIAL_MODULES,
		CDK_MODULES,
		SharedModule,
		AppRouting
	],
	providers: [
		DocsItems
	],
	bootstrap: [
		AppComponent
	]
})
export class AppModule { }
