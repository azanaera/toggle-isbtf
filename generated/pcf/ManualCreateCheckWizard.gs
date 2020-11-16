package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/newtransaction/manualcheck/ManualCreateCheckWizard.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ManualCreateCheckWizard extends com.guidewire.pl.web.codegen.WizardBase {
  static function createDestination (claim :  Claim) : pcf.api.Destination {
    return __newDestinationForWizard(pcf.ManualCreateCheckWizard, {claim}, 0)
  }
  
  static function drilldown (claim :  Claim) : pcf.api.Location {
    return __newDestinationForWizard(pcf.ManualCreateCheckWizard, {claim}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (claim :  Claim) : pcf.api.Location {
    return __newDestinationForWizard(pcf.ManualCreateCheckWizard, {claim}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (claim :  Claim) : pcf.api.Location {
    return __newDestinationForWizard(pcf.ManualCreateCheckWizard, {claim}, 0).goInMain()
  }
  
  static function printPage (claim :  Claim) : pcf.api.Location {
    return __newDestinationForWizard(pcf.ManualCreateCheckWizard, {claim}, 0).printPage()
  }
  
  static function push (claim :  Claim) : pcf.api.Location {
    return __newDestinationForWizard(pcf.ManualCreateCheckWizard, {claim}, 0).push()
  }
  
  
}