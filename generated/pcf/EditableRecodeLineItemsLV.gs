package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/financials/EditableRecodeLineItemsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableRecodeLineItemsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Transaction :  Transaction) : void {
    __widgetOf(this, pcf.EditableRecodeLineItemsLV, SECTION_WIDGET_CLASS).setVariables(false, {$Transaction})
  }
  
  function refreshVariables ($Transaction :  Transaction) : void {
    __widgetOf(this, pcf.EditableRecodeLineItemsLV, SECTION_WIDGET_CLASS).setVariables(true, {$Transaction})
  }
  
  
}