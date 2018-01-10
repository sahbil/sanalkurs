import {NgModule} from '@angular/core';
import {TranslateModule} from '@ngx-translate/core';
import {CommonModule} from '@angular/common';

import {I18nService} from './i18n.service';

@NgModule({
  imports: [
    CommonModule,
    TranslateModule
  ],
  exports: [
    TranslateModule
  ],
  declarations: [],
  providers: [
    I18nService
  ]
})
export class I18nModule {
}
