package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotDwellingIncidentCV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotDwellingIncidentCV_default extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($claim :  Claim, $incidentParam :  dynamic.Dynamic, $snapshot :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotDwellingIncidentCV_default, SECTION_WIDGET_CLASS).setVariables(false, {$claim, $incidentParam, $snapshot})
  }
  
  function refreshVariables ($claim :  Claim, $incidentParam :  dynamic.Dynamic, $snapshot :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotDwellingIncidentCV_default, SECTION_WIDGET_CLASS).setVariables(true, {$claim, $incidentParam, $snapshot})
  }
  
  
}