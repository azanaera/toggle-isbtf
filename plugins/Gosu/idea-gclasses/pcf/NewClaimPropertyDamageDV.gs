package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/FNOL/NewClaimPropertyDamageDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimPropertyDamageDV extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Exposure :  Exposure) : void {
    __widgetOf(this, pcf.NewClaimPropertyDamageDV, SECTION_WIDGET_CLASS).setVariables(false, {$Exposure})
  }
  
  function refreshVariables ($Exposure :  Exposure) : void {
    __widgetOf(this, pcf.NewClaimPropertyDamageDV, SECTION_WIDGET_CLASS).setVariables(true, {$Exposure})
  }
  
  
}