package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/newtransaction/shared/EditablePaymentLineItemsLV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditablePaymentLineItemsLV_default extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Transaction :  Transaction) : void {
    __widgetOf(this, pcf.EditablePaymentLineItemsLV_default, SECTION_WIDGET_CLASS).setVariables(false, {$Transaction})
  }
  
  function refreshVariables ($Transaction :  Transaction) : void {
    __widgetOf(this, pcf.EditablePaymentLineItemsLV_default, SECTION_WIDGET_CLASS).setVariables(true, {$Transaction})
  }
  
  
}