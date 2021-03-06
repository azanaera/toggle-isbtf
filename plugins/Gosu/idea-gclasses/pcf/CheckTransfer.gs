package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/financials/checks/CheckTransfer.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckTransfer extends com.guidewire.pl.web.codegen.LocationBase {
  static function createDestination (Claim :  Claim, OldCheck :  Check) : pcf.api.Destination {
    return __newDestinationForLocation(pcf.CheckTransfer, {Claim, OldCheck}, 0)
  }
  
  static function drilldown (Claim :  Claim, OldCheck :  Check) : pcf.api.Location {
    return __newDestinationForLocation(pcf.CheckTransfer, {Claim, OldCheck}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Claim :  Claim, OldCheck :  Check) : pcf.api.Location {
    return __newDestinationForLocation(pcf.CheckTransfer, {Claim, OldCheck}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Claim :  Claim, OldCheck :  Check) : pcf.api.Location {
    return __newDestinationForLocation(pcf.CheckTransfer, {Claim, OldCheck}, 0).goInMain()
  }
  
  static function printPage (Claim :  Claim, OldCheck :  Check) : pcf.api.Location {
    return __newDestinationForLocation(pcf.CheckTransfer, {Claim, OldCheck}, 0).printPage()
  }
  
  static function push (Claim :  Claim, OldCheck :  Check) : pcf.api.Location {
    return __newDestinationForLocation(pcf.CheckTransfer, {Claim, OldCheck}, 0).push()
  }
  
  
}