package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/default/ClaimSnapshotExposureDV.TripCancellationDelay.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposureDV_TripCancellationDelay extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $Exposure :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotExposureDV_TripCancellationDelay, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $Exposure})
  }
  
  function refreshVariables ($Claim :  Claim, $Exposure :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotExposureDV_TripCancellationDelay, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $Exposure})
  }
  
  
}