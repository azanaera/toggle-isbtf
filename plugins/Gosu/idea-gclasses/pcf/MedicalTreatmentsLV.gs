package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/medicalcasemgmt/MedicalTreatmentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class MedicalTreatmentsLV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim) : void {
    __widgetOf(this, pcf.MedicalTreatmentsLV, SECTION_WIDGET_CLASS).setVariables(false, {$Claim})
  }
  
  function refreshVariables ($Claim :  Claim) : void {
    __widgetOf(this, pcf.MedicalTreatmentsLV, SECTION_WIDGET_CLASS).setVariables(true, {$Claim})
  }
  
  
}