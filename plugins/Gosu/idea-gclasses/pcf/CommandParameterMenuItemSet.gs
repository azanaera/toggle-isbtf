package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/bizrules/CommandParameterMenuItemSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CommandParameterMenuItemSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($parameterHolder :  gw.bizrules.pcf.RuleCommandParameterHolder) : void {
    __widgetOf(this, pcf.CommandParameterMenuItemSet, SECTION_WIDGET_CLASS).setVariables(false, {$parameterHolder})
  }
  
  function refreshVariables ($parameterHolder :  gw.bizrules.pcf.RuleCommandParameterHolder) : void {
    __widgetOf(this, pcf.CommandParameterMenuItemSet, SECTION_WIDGET_CLASS).setVariables(true, {$parameterHolder})
  }
  
  
}