package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/planofaction/ClaimEvaluationDetailsDV.Wc.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimEvaluationDetailsDV_Wc extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Evaluation :  Evaluation) : void {
    __widgetOf(this, pcf.ClaimEvaluationDetailsDV_Wc, SECTION_WIDGET_CLASS).setVariables(false, {$Evaluation})
  }
  
  function refreshVariables ($Evaluation :  Evaluation) : void {
    __widgetOf(this, pcf.ClaimEvaluationDetailsDV_Wc, SECTION_WIDGET_CLASS).setVariables(true, {$Evaluation})
  }
  
  
}