package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotExposure600DV.VehicleDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposure600DV_VehicleDamage extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Claim :  Claim, $Exposure :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotExposure600DV_VehicleDamage, SECTION_WIDGET_CLASS).setVariables(false, {$Claim, $Exposure})
  }
  
  function refreshVariables ($Claim :  Claim, $Exposure :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotExposure600DV_VehicleDamage, SECTION_WIDGET_CLASS).setVariables(true, {$Claim, $Exposure})
  }
  
  
}