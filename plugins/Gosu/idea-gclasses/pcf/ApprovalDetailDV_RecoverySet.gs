package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/workspace/activity/ApprovalDetailDV.RecoverySet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ApprovalDetailDV_RecoverySet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Activity :  Activity) : void {
    __widgetOf(this, pcf.ApprovalDetailDV_RecoverySet, SECTION_WIDGET_CLASS).setVariables(false, {$Activity})
  }
  
  function refreshVariables ($Activity :  Activity) : void {
    __widgetOf(this, pcf.ApprovalDetailDV_RecoverySet, SECTION_WIDGET_CLASS).setVariables(true, {$Activity})
  }
  
  
}