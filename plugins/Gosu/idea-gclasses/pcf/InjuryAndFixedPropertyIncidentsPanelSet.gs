package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/shared/InjuryAndFixedPropertyIncidentsPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class InjuryAndFixedPropertyIncidentsPanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim, $wizard :  gw.api.claim.NewClaimWizardInfo) : void {
    __widgetOf(this, pcf.InjuryAndFixedPropertyIncidentsPanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$claim, $wizard})
  }
  
  function refreshVariables ($claim :  Claim, $wizard :  gw.api.claim.NewClaimWizardInfo) : void {
    __widgetOf(this, pcf.InjuryAndFixedPropertyIncidentsPanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$claim, $wizard})
  }
  
  
}