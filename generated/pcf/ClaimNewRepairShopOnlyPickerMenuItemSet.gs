package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/shared/contacts/ClaimNewRepairShopOnlyPickerMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimNewRepairShopOnlyPickerMenuItemSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($requiredContactType :  Type, $parentContact :  Contact, $claim :  Claim) : void {
    __widgetOf(this, pcf.ClaimNewRepairShopOnlyPickerMenuItemSet, SECTION_WIDGET_CLASS).setVariables(false, {$requiredContactType, $parentContact, $claim})
  }
  
  function refreshVariables ($requiredContactType :  Type, $parentContact :  Contact, $claim :  Claim) : void {
    __widgetOf(this, pcf.ClaimNewRepairShopOnlyPickerMenuItemSet, SECTION_WIDGET_CLASS).setVariables(true, {$requiredContactType, $parentContact, $claim})
  }
  
  
}