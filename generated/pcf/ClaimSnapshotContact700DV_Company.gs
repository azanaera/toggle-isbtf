package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/700/ClaimSnapshotContact700DV.company.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotContact700DV_Company extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($ClaimContactParam :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotContact700DV_Company, SECTION_WIDGET_CLASS).setVariables(false, {$ClaimContactParam})
  }
  
  function refreshVariables ($ClaimContactParam :  dynamic.Dynamic) : void {
    __widgetOf(this, pcf.ClaimSnapshotContact700DV_Company, SECTION_WIDGET_CLASS).setVariables(true, {$ClaimContactParam})
  }
  
  
}