package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/FNOL/NewClaimWageBenefitsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimWageBenefitsDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Exposure :  Exposure) : void {
    __widgetOf(this, pcf.NewClaimWageBenefitsDV, SECTION_WIDGET_CLASS).setVariables(false, {$Exposure})
  }
  
  function refreshVariables ($Exposure :  Exposure) : void {
    __widgetOf(this, pcf.NewClaimWageBenefitsDV, SECTION_WIDGET_CLASS).setVariables(true, {$Exposure})
  }
  
  
}