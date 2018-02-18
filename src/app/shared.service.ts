import { MatButtonModule } from '@angular/material/button';
import { Observable } from 'rxjs/Observable';
import { Injectable, Component, OnInit, ViewChild, NgModule } from '@angular/core';
import { MatSnackBarConfig, MatSnackBar, MatSnackBarRef, SimpleSnackBar, MatSnackBarModule } from '@angular/material/snack-bar';
import { MatDialog, MatDialogRef, MatDialogConfig, MatDialogModule } from '@angular/material/dialog';
import { ThemePalette } from '@angular/material/core';
import { MatSelectionList, MatListModule } from '@angular/material/list';
import { MatInputModule } from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field';
import { ComponentType } from '@angular/cdk/portal';
import { Title, SafeHtml } from '@angular/platform-browser';
import { BreakpointObserver, LayoutModule } from '@angular/cdk/layout';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

@Injectable()
export class SharedService {
	private _title: string = ''
	constructor(
		private snackBar: MatSnackBar,
		private dialog: MatDialog,
		private documentTitle: Title,
		private breakpointObserver: BreakpointObserver
	) { }
	private releases: Release[] = [
		{
			mcVer: '1.12, 1.12.1, 1.12.2',
			versions: [
				{
					downloadLink: '',
					version: 'v2.x (Not available yet)',
					notAvailable: true
				}
			]
		},
		{
			mcVer: '1.11.2',
			versions: [
				{
					downloadLink: 'https://github.com/Chan4077/First-Mod/releases/download/v1.2.1/First_Mod-1.11.2-1.2.1.jar',
					version: 'v1.2.1',
					deprecated: true
				},
				{
					downloadLink: 'https://github.com/Chan4077/First-Mod/releases/download/v1.2/First_Mod-1.11.2-1.2.jar',
					version: 'v1.2',
					deprecated: true
				}
			]
		},
		{
			mcVer: '1.10.2',
			versions: [
				{
					downloadLink: 'https://github.com/Chan4077/First-Mod/releases/download/v1.1/First_Mod-1.10.2-1.1.jar',
					version: 'v1.1',
					unsupported: true
				}
			]
		}
	]
	/**
	 * Gets all releases
	 * @returns {Release[]}
	 */
	public getReleases(): Release[] {
		return this.releases;
	}
	/**
	 * Gets all releases which are neither unsupported/deprecated
	 * @returns {Release[]}
	 */
	public getSupportedReleases(): Release[] {
		let supportedReleases: Release[] = [];
		for (let i = 0; i < this.releases.length; i++) {
			for (let j = 0; j < this.releases[i].versions.length; j++) {
				// Checks if the version is un-unsupported (i.e. supported)
				if (!this.releases[i].versions[j].unsupported) {
					// Checks if the version is not deprecated
					if (!this.releases[i].versions[j].deprecated) {
						// TODO: Remove this logging
						console.log(this.releases[i]);
						// Pushes the specified release to the temporary variable declared earlier on
						supportedReleases.push(this.releases[i]);
					}
				}
			}
		}
		// Once done, return all supported releases
		return supportedReleases;
	}
	/**
	 * Whether the user is on a mobile device
	 * @returns {boolean}
	 */
	public isMobile(): boolean {
		if (this.breakpointObserver.isMatched('(max-width: 699px)')) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Sets the document's title
	 * @param {string} title The title of the document to set
	 */
	set title(title: string) {
		this._title = title;
		if (title !== '') {
			title = `${title} | `;
		}
		this.documentTitle.setTitle(`${title}First-Mod`);
	}
	/**
	 * Returns the document's title
	 */
	get title(): string {
		return this._title;
	}
	/**
	 * Opens a snackBar with the specified params and no return
	 * @param {SnackBarConfig} opts The options of the snackBar
	 */
	public openSnackBar(opts: SnackBarConfig): MatSnackBarRef<SimpleSnackBar> {
		return this.handleSnackBar(opts);
	}
	/**
	 * Opens a snackBar with the specified params and a return of the snackBar's ref (for component)
	 * @param {SnackBarConfig} opts The options of the snackBar
	 * @returns {MatSnackBarRef<any>}
	 */
	public openSnackBarComponent(opts: SnackBarConfig): MatSnackBarRef<any> {
		return this.handleSnackBarWithComponent(opts);
	}
	/**
	 * Handles a snackBar with a snackBarref if the developer needs a return
	 * @param {SnackBarConfig} opts The config for the snackBar.
	 * @returns {MatSnackBarRef<SimpleSnackBar>}
	 * @private
	 */
	private handleSnackBar(opts: SnackBarConfig): MatSnackBarRef<SimpleSnackBar> {
		if (opts) {
			if (opts.action) {
				let snackBarRef = this.snackBar.open(opts.msg, opts.action, opts.additionalOpts);
				return snackBarRef;
			} else {
				let snackBarRef = this.snackBar.open(opts.msg, undefined, opts.additionalOpts);
				return snackBarRef;
			}
		} else {
			this.throwError('opts', 'SnackBarConfig');
		}
	}
	/**
	 * Handles a snackBar with a component
	 * @param {SnackBarConfig} opts The config for the snackBar
	 * @returns {MatSnackbarRef<any>}
	 */
	private handleSnackBarWithComponent(opts: SnackBarConfig): MatSnackBarRef<any> {
		if (opts) {
			if (opts.additionalOpts) {
				if (opts.additionalOpts) {
					return this.snackBar.openFromComponent(opts.component, opts.additionalOpts);
				} else {
					return this.snackBar.openFromComponent(opts.component);
				}
			} else {
				this.throwError('opts.additionalOpts', 'MatSnackBarConfig');
			}
		} else {
			this.throwError('opts', 'SnackBarConfig');
		}
	}
	/**
	 * Closes the current snackBar
	 */
	public closeSnackBar() {
		this.snackBar.dismiss();
	}
	/**
	 * Opens an alert dialog with the specified parameters
	 * @param {AlertDialogConfig} opts The options for the dialog
	 * @returns {MatDialogRef<AlertDialog>}
	 */
	public openAlertDialog(opts: AlertDialogConfig): MatDialogRef<AlertDialog> {
		if (opts) {
			let dialogRef = this.dialog.open(AlertDialog);
			dialogRef.componentInstance.alertConfig = opts;
			return dialogRef;
		} else {
			this.throwError('opts', 'AlertDialogConfig');
		}
	}
	/**
	 * Opens a confirm dialog with the specified parameters
	 * @param {ConfirMatialogConfig} opts The options for the dialog
	 * @return {MatDialogRef<ConfirMatialog>}
	 */
	public openConfirmDialog(opts: ConfirmDialogConfig): MatDialogRef<ConfirmDialog> {
		if (opts) {
			let dialogRef = this.dialog.open(ConfirmDialog);
			dialogRef.componentInstance.confirmConfig = opts;
			return dialogRef;
		} else {
			this.throwError('opts', 'ConfirmDialogConfig');
		}
	}
	/**
	 * Opens a prompt dialog with the specified parameters
	 * @param {PromptDialogConfig} opts The options for the dialog
	 * @return {MatDialogRef<PromptDialog>}
	 */
	public openPromptDialog(opts: PromptDialogConfig): MatDialogRef<PromptDialog> {
		if (opts) {
			let dialogRef = this.dialog.open(PromptDialog);
			dialogRef.componentInstance.promptConfig = opts;
			return dialogRef;
		} else {
			this.throwError('opts', 'PromptDialogConfig');
		}
	}
	/**
	 * Opens a selection dialog with the configured options
	 * @param {SelectionDialogConfig} opts The options for the dialog
	 * @returns {MatDialogRef<SelectionDialog>}
	 */
	public openSelectionDialog(opts: SelectionDialogConfig): MatDialogRef<SelectionDialog> {
		if (opts) {
			let dialogRef = this.dialog.open(SelectionDialog, { disableClose: true, panelClass: 'selection-dialog' });
			dialogRef.componentInstance.selectionConfig = opts;
			return dialogRef;
		} else {
			this.throwError('opts', 'SelectionDialogConfig');
		}
	}
	/**
	 * Gets all opens dialogs
	 * @returns {MatDialogRef<any>[]}
	 */
	public getDialogs(): MatDialogRef<any>[] {
		return this.dialog.openDialogs;
	}
	/**
	 * Closes all dialogs
	 */
	public closeAllDialogs() {
		this.dialog.closeAll();
	}
	/**
	 * Gets a dialog by its id
	 * @param {string} id The ID of the dialog
	 * @returns {MatDialogRef<any>}
	 */
	public getDialogById(id: string): MatDialogRef<any> {
		return this.dialog.getDialogById(id);
	}
	/**
	 * Observable for after all dialogs have been closed
	 * @returns {Observable<void>}
	 */
	public afterAllClosed(): Observable<void> {
		return this.dialog.afterAllClosed;
	}
	/**
	 * Throws an error with the specified parameters
	 * @param {string} variable The variable that was not specified
	 * @param {string} type The type of variable
	 * @private
	 */
	private throwError(variable: string, type: string) {
		throw new Error(`${variable} was not specified. Please ensure that the ${variable} property is specified and that it is of type ${type}.`);
	}
}


@Component({
	selector: 'alert-dialog',
	template: `
	<h2 matDialogTitle>{{alertConfig.title ? alertConfig.title : 'Alert'}}</h2>
	<mat-dialog-content fxLayout="column" class="mat-typography">
		<p class="mat-body" *ngIf="!alertConfig.isHtml">{{alertConfig.msg}}</p>
		<span *ngIf="alertConfig.isHtml" [innerHTML]="alertConfig.msg"></span>
	</mat-dialog-content>
	<mat-dialog-actions align="end">
		<button mat-button [color]="okColor" (click)="close()">{{alertConfig.ok ? alertConfig.ok : 'Dismiss'}}</button>
	</mat-dialog-actions>
	`
})
export class AlertDialog implements OnInit {
	constructor(private dialogRef: MatDialogRef<AlertDialog>) {
	}
	okColor: ThemePalette = 'primary';
	alertConfig: AlertDialogConfig;
	close() {
		this.dialogRef.close();
	}
	ngOnInit() {
		if (this.alertConfig.disableClose) {
			this.dialogRef.disableClose = true;
		}
		if (this.alertConfig.themeColor) {
			this.okColor = this.alertConfig.themeColor;
		} else if (this.alertConfig.okColor) {
			this.okColor = this.alertConfig.okColor;
		}
	}
}
@Component({
	selector: 'confirm-dialog',
	template: `
	<h2 matDialogTitle>{{confirmConfig.title ? confirmConfig.title : 'Confirm'}}</h2>
	<mat-dialog-content fxLayout="column" class="mat-typography">
		<p class="mat-body" *ngIf="!confirmConfig.isHtml">{{confirmConfig.msg}}</p>
		<span *ngIf="confirmConfig.isHtml" [innerHTML]="confirmConfig.msg"></span>
	</mat-dialog-content>
	<mat-dialog-actions align="end">
		<button mat-button (click)="cancel()" [color]="cancelColor">{{confirmConfig.cancel ? confirmConfig.cancel : 'Cancel'}}</button>
		<button mat-button (click)="ok()" [color]="okColor">{{confirmConfig.ok ? confirmConfig.ok : 'OK'}}</button>
	</mat-dialog-actions>
	`
})
export class ConfirmDialog implements OnInit {
	constructor(private dialogRef: MatDialogRef<ConfirmDialog>) { }
	okColor: ThemePalette = 'primary';
	cancelColor: ThemePalette = 'primary';
	confirmConfig: ConfirmDialogConfig;
	cancel() {
		this.dialogRef.close('cancel');
	}
	ok() {
		this.dialogRef.close('ok');
	}
	ngOnInit() {
		if (this.confirmConfig.disableClose) {
			this.dialogRef.disableClose = true;
		}
		if (this.confirmConfig.themeColor) {
			this.okColor = this.confirmConfig.themeColor;
			this.cancelColor = this.confirmConfig.themeColor;
		} else {
			if (this.confirmConfig.okColor) {
				this.okColor = this.confirmConfig.okColor;
			}
			if (this.confirmConfig.cancelColor) {
				this.cancelColor = this.confirmConfig.cancelColor;
			}
		}
	}
}
@Component({
	selector: 'prompt-dialog',
	template: `
	<h2 matDialogTitle>{{promptConfig.title ? promptConfig.title : 'Prompt'}}</h2>
	<mat-dialog-content fxLayout="column" class="mat-typography">
		<p class="mat-body" *ngIf="!promptConfig.isHtml">{{promptConfig.msg}}</p>
		<span *ngIf="promptConfig.isHtml" [innerHTML]="promptConfig.msg"></span>
		<form #form="ngForm">
			<mat-form-field [color]="inputColor" style="width:100%">
				<input matInput [(ngModel)]="input" [placeholder]="promptConfig.placeholder" [type]="promptConfig.inputType" required name="input">
				<mat-error>This is required.</mat-error>
			</mat-form-field>
		</form>
	</mat-dialog-content>
	<mat-dialog-actions align="end">
		<button mat-button (click)="cancel()" [color]="cancelColor">{{promptConfig.cancel ? promptConfig.cancel : 'Cancel'}}</button>
		<button mat-button (click)="ok()" [color]="okColor" [disabled]="form.invalid">{{promptConfig.ok ? promptConfig.ok : 'OK'}}</button>
	</mat-dialog-actions>
	`
})
export class PromptDialog implements OnInit {
	constructor(private dialogRef: MatDialogRef<PromptDialog>) {
	}
	promptConfig: PromptDialogConfig;
	cancelColor: ThemePalette = 'primary';
	okColor: ThemePalette = 'primary';
	inputColor: ThemePalette = 'primary';
	input: string | number;
	cancel() {
		this.dialogRef.close('cancel');
	}
	ok() {
		this.dialogRef.close(this.input);
	}
	ngOnInit() {
		if (this.promptConfig.value) {
			this.input = this.promptConfig.value;
		}
		if (this.promptConfig.disableClose) {
			this.dialogRef.disableClose = true;
		}
		if (this.promptConfig.themeColor) {
			this.cancelColor = this.promptConfig.themeColor;
			this.okColor = this.promptConfig.themeColor;
			this.inputColor = this.promptConfig.themeColor;
		} else {
			if (this.promptConfig.okColor) {
				this.okColor = this.promptConfig.okColor;
			}
			if (this.promptConfig.cancelColor) {
				this.cancelColor = this.promptConfig.cancelColor;
			}
			if (this.promptConfig.inputColor) {
				this.inputColor = this.promptConfig.inputColor;
			}
		}
	}
}
@Component({
	selector: 'selection-dialog',
	template: `
	<h2 matDialogTitle>{{selectionConfig.title ? selectionConfig.title : 'Select options from the list'}}</h2>
	<mat-dialog-content fxLayout="column" class="mat-typography">
		<mat-selection-list #selection>
			<mat-list-option *ngFor="let option of selectionConfig.options" [disabled]="option.disabled" [value]="option.value" [checkboxPosition]="option.checkboxPosition ? option.checkboxPosition : 'before'" [selected]="option.selected">
				{{option.content}}
			</mat-list-option>
		</mat-selection-list>
	</mat-dialog-content>
	<mat-dialog-actions align="end">
		<button mat-button [color]="cancelColor" (click)="cancel()">{{selectionConfig.cancel ? selectionConfig.cancel : 'Cancel'}}</button>
		<button mat-button [color]="okColor" (click)="ok()" [disabled]="_checkValid()">{{selectionConfig.ok ? selectionConfig.ok : 'OK'}}</button>
	</mat-dialog-actions>
	`
})
export class SelectionDialog implements OnInit {
	@ViewChild('selection') selection: MatSelectionList;
	constructor(private dialogRef: MatDialogRef<SelectionDialog>) { }
	cancelColor: ThemePalette = 'primary';
	okColor: ThemePalette = 'primary';
	selectionConfig: SelectionDialogConfig;
	private _checkValid(): boolean {
		if (this.selection.selectedOptions.selected.length < 1) {
			return false;
		} else {
			return true;
		}
	}
	ngOnInit() {
		if (this.selectionConfig.themeColor) {
			this.cancelColor = this.okColor = this.selectionConfig.themeColor;
		} else {
			if (this.selectionConfig.okColor) {
				this.okColor = this.selectionConfig.okColor;
			}
			if (this.selectionConfig.cancelColor) {
				this.cancelColor = this.selectionConfig.cancelColor;
			}
		}
		if (this.selectionConfig.disableClose) {
			this.dialogRef.disableClose = true;
		}
	}
	cancel() {
		this.dialogRef.close('cancel');
	}
	ok() {
		this.dialogRef.close(this.selection.selectedOptions.selected);
	}
}
export interface SnackBarConfig {
	/**
	 * The message for the snackBar
	 * @type {string}
	 */
	msg: string;
	/**
	 * The action for the snackBar
	 * @type {string}
	 */
	action?: string;
	/**
	 * The custom component for the snackBar to open in
	 * @type {ComponentType<any>}
	 */
	component?: ComponentType<any>;
	/**
	 * Additional options
	 * @type {MatSnackBarConfig}
	 */
	additionalOpts?: MatSnackBarConfig;
}
export interface DialogConfig extends MatDialogConfig {
	/**
	 * The message of the dialog
	 * @type {string|SafeHtml}
	 */
	msg: string | SafeHtml;
	/**
	 * The title of the dialog
	 * @type {string}
	 */
	title?: string;
	/**
	 * Whether the dialog's message is HTML
	 * @type {boolean}
	 */
	isHtml?: boolean;
	/**
	 * The theme of the dialog
	 * @type {ThemePalette}
	 */
	themeColor?: ThemePalette;
}
export interface AlertDialogConfig extends DialogConfig {
	/**
	 * The ok button text
	 * @type {string}
	 */
	ok?: string;
	/**
	 * The color of the ok button
	 */
	okColor?: ThemePalette;
}

export interface ConfirmDialogConfig extends DialogConfig {
	/**
	 * The ok button text
	 * @type {string}
	 */
	ok?: string;
	/**
	 * The color of the cancel button
	 * @type {ThemePalette}
	 */
	okColor?: ThemePalette;
	/**
	 * The cancel button text
	 * @type {string}
	 */
	cancel?: string;
	/**
	 * The color of the cancel button
	 */
	cancelColor?: ThemePalette;
}

export interface PromptDialogConfig extends DialogConfig {
	/**
	 * The ok button text
	 * @type {string}
	 */
	ok?: string;
	/**
	 * The color of the ok button
	 * @type {ThemePalette}
	 */
	okColor?: ThemePalette;
	/**
	 * The cancel button text
	 * @type {string}
	 */
	cancel?: string;
	/**
	 * The color of the cancel button
	 * @type {ThemePalette}
	 */
	cancelColor?: ThemePalette;
	/**
	 * The placeholder of the input
	 * @type {string}
	 */
	placeholder?: string;
	/**
	 * The input type
	 * @type {"text"|"email"|"password"|"number"}
	 */
	inputType: 'text' | 'email' | 'password' | 'number';
	/**
	 * The initial value of the input
	 * @type {string|number}
	 */
	value?: string | number;
	/**
	 * The color of the input
	 * @type {ThemePalette}
	 */
	inputColor?: ThemePalette;
}
export interface SelectionDialogConfig extends DialogConfig {
	/**
	 * The ok button text
	 * @type {string}
	 */
	ok?: string;
	/**
	 * The color of the ok button
	 * @type {ThemePalette}
	 */
	okColor?: ThemePalette;
	/**
	 * The cancel button text
	 * @type {string}
	 */
	cancel?: string;
	/**
	 * The color of the cancel button
	 * @type {ThemePalette}
	 */
	cancelColor?: ThemePalette;
	/**
	 * The options for the selection dialog
	 * @type {SelectionDialogOptions[]}
	 */
	options: SelectionDialogOptions[];
}
export interface SelectionDialogOptions {
	/**
	 * The title of the selection list item
	 * @type {string}
	 */
	content: string;
	/**
	 * Whether the selection list item is disabled
	 * @type {boolean}
	 */
	disabled?: boolean;
	/**
	 * The value of the selection list item
	 * @type {any}
	 */
	value: any;
	/**
	 * The checkbox position of the selection list item
	 * @type {"before"|"after"}
	 */
	checkboxPosition?: 'before' | 'after';
	/**
	 * Whether the selection list item is initially selected
	 * @type {boolean}
	 */
	selected?: boolean;
}
export interface Release {
	mcVer: string;
	versions: Version[];
}
export interface Version {
	downloadLink: string;
	version: string;
	notAvailable?: boolean;
	deprecated?: boolean;
	unsupported?: boolean;
}

export const SHARED_DIALOGS = [
	AlertDialog,
	ConfirmDialog,
	PromptDialog,
	SelectionDialog
]
@NgModule({
	imports: [
		CommonModule,
		BrowserAnimationsModule,
		MatButtonModule,
		MatDialogModule,
		MatFormFieldModule,
		MatInputModule,
		MatListModule,
		MatSnackBarModule,
		FormsModule,
		LayoutModule
	],
	exports: [
		SHARED_DIALOGS
	],
	providers: [
		SharedService
	],
	declarations: [
		SHARED_DIALOGS
	],
	entryComponents: [
		SHARED_DIALOGS
	]
})
export class SharedModule { }
