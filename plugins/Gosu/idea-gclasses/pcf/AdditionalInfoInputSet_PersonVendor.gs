package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/shared/contacts/AdditionalInfoInputSet.PersonVendor.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AdditionalInfoInputSet_PersonVendor extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($contactHandle :  gw.api.contact.ContactHandle, $claimContact :  ClaimContact, $claim :  Claim) : void {
    __widgetOf(this, pcf.AdditionalInfoInputSet_PersonVendor, SECTION_WIDGET_CLASS).setVariables(false, {$contactHandle, $claimContact, $claim})
  }
  
  function refreshVariables ($contactHandle :  gw.api.contact.ContactHandle, $claimContact :  ClaimContact, $claim :  Claim) : void {
    __widgetOf(this, pcf.AdditionalInfoInputSet_PersonVendor, SECTION_WIDGET_CLASS).setVariables(true, {$contactHandle, $claimContact, $claim})
  }
  
  
}