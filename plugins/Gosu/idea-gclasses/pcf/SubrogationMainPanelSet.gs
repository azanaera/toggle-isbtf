package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/subrogation/General/SubrogationMainPanelSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class SubrogationMainPanelSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim, $selectSubrogationFinancialsCard :  boolean) : void {
    __widgetOf(this, pcf.SubrogationMainPanelSet, SECTION_WIDGET_CLASS).setVariables(false, {$claim, $selectSubrogationFinancialsCard})
  }
  
  function refreshVariables ($claim :  Claim, $selectSubrogationFinancialsCard :  boolean) : void {
    __widgetOf(this, pcf.SubrogationMainPanelSet, SECTION_WIDGET_CLASS).setVariables(true, {$claim, $selectSubrogationFinancialsCard})
  }
  
  
}