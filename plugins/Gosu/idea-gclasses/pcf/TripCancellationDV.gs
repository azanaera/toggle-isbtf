package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/exposures/TripCancellationDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TripCancellationDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Exposure :  Exposure) : void {
    __widgetOf(this, pcf.TripCancellationDV, SECTION_WIDGET_CLASS).setVariables(false, {$Exposure})
  }
  
  function refreshVariables ($Exposure :  Exposure) : void {
    __widgetOf(this, pcf.TripCancellationDV, SECTION_WIDGET_CLASS).setVariables(true, {$Exposure})
  }
  
  
}