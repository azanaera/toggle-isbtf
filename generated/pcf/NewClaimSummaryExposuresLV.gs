package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/FNOL/NewClaimSummaryExposuresLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimSummaryExposuresLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $Wizard :  gw.api.claim.NewClaimWizardInfo, $ExposureList :  Exposure[]) : void {
    __widgetOf(this, pcf.NewClaimSummaryExposuresLV, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $Wizard, $ExposureList})
  }
  
  function refreshVariables ($Claim :  Claim, $Wizard :  gw.api.claim.NewClaimWizardInfo, $ExposureList :  Exposure[]) : void {
    __widgetOf(this, pcf.NewClaimSummaryExposuresLV, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $Wizard, $ExposureList})
  }
  
  
}