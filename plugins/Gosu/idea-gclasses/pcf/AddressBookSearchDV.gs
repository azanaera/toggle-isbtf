package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/addressbook/AddressBookSearchDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookSearchDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($searchCriteria :  ContactSearchCriteria, $proximitySearchPageHelper :  gw.api.contact.CCProximitySearchPageHelper, $requiredContactType :  Type, $externalSearchEnabled :  boolean, $claim :  Claim, $performVendorSearch :  boolean, $contactSearchHelper :  gw.pcf.ContactSearchHelper) : void {
    __widgetOf(this, pcf.AddressBookSearchDV, SECTION_WIDGET_CLASS).setVariables(false, {$searchCriteria, $proximitySearchPageHelper, $requiredContactType, $externalSearchEnabled, $claim, $performVendorSearch, $contactSearchHelper})
  }
  
  function refreshVariables ($searchCriteria :  ContactSearchCriteria, $proximitySearchPageHelper :  gw.api.contact.CCProximitySearchPageHelper, $requiredContactType :  Type, $externalSearchEnabled :  boolean, $claim :  Claim, $performVendorSearch :  boolean, $contactSearchHelper :  gw.pcf.ContactSearchHelper) : void {
    __widgetOf(this, pcf.AddressBookSearchDV, SECTION_WIDGET_CLASS).setVariables(true, {$searchCriteria, $proximitySearchPageHelper, $requiredContactType, $externalSearchEnabled, $claim, $performVendorSearch, $contactSearchHelper})
  }
  
  
}