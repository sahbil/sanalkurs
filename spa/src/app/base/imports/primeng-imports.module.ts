import {NgModule} from "@angular/core";
import {CommonModule} from "@angular/common";
import {
  AutoCompleteModule,
  BlockUIModule,
  CalendarModule,
  CheckboxModule,
  ConfirmDialogModule,
  DataTableModule,
  DialogModule,
  DropdownModule,
  GrowlModule,
  InputSwitchModule,
  MessageModule,
  MessagesModule,
  RadioButtonModule,
  SharedModule,
  TabViewModule
} from "primeng/primeng";
import {MessageService} from "primeng/components/common/messageservice";

@NgModule({
  imports: [
    CommonModule,
    AutoCompleteModule,
    CheckboxModule,
    ConfirmDialogModule,
    DataTableModule,
    MessageModule,
    MessagesModule,
    GrowlModule,
    RadioButtonModule,
    SharedModule,
    InputSwitchModule,
    TabViewModule,
    BlockUIModule,
    CalendarModule
  ],
  exports: [
    AutoCompleteModule,
    CheckboxModule,
    ConfirmDialogModule,
    DataTableModule,
    MessageModule,
    MessagesModule,
    RadioButtonModule,
    SharedModule,
    TabViewModule,
    DropdownModule,
    GrowlModule,
    InputSwitchModule,
    DialogModule,
    BlockUIModule,
    CalendarModule
  ],
  providers: [ MessageService ],
  declarations: []
})
export class PrimengImportsModule {

}
