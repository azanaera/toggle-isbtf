package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/newclaim/NewClaimWizard_AssignDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimWizard_AssignDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $Wizard :  gw.api.claim.NewClaimWizardInfo) : void {
    __widgetOf(this, pcf.NewClaimWizard_AssignDV, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $Wizard})
  }
  
  function refreshVariables ($Claim :  Claim, $Wizard :  gw.api.claim.NewClaimWizardInfo) : void {
    __widgetOf(this, pcf.NewClaimWizard_AssignDV, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $Wizard})
  }
  
  
}