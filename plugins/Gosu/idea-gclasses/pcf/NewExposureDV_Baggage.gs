package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/newexposure/NewExposureDV.Baggage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewExposureDV_Baggage extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Exposure :  Exposure, $unusedServiceRequests :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.NewExposureDV_Baggage, SECTION_WIDGET_CLASS).setVariables(false, {$Exposure, $unusedServiceRequests})
  }
  
  function refreshVariables ($Exposure :  Exposure, $unusedServiceRequests :  java.util.Set<ServiceRequest>) : void {
    __widgetOf(this, pcf.NewExposureDV_Baggage, SECTION_WIDGET_CLASS).setVariables(true, {$Exposure, $unusedServiceRequests})
  }
  
  
}