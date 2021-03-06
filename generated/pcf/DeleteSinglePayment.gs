package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/financials/DeleteSinglePayment.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class DeleteSinglePayment extends com.guidewire.pl.web.codegen.LocationBase {
  static function createDestination (Claim :  Claim, Payment :  Payment) : pcf.api.Destination {
    return __newDestinationForLocation(pcf.DeleteSinglePayment, {Claim, Payment}, 0)
  }
  
  static function drilldown (Claim :  Claim, Payment :  Payment) : pcf.api.Location {
    return __newDestinationForLocation(pcf.DeleteSinglePayment, {Claim, Payment}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Claim :  Claim, Payment :  Payment) : pcf.api.Location {
    return __newDestinationForLocation(pcf.DeleteSinglePayment, {Claim, Payment}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Claim :  Claim, Payment :  Payment) : pcf.api.Location {
    return __newDestinationForLocation(pcf.DeleteSinglePayment, {Claim, Payment}, 0).goInMain()
  }
  
  static function printPage (Claim :  Claim, Payment :  Payment) : pcf.api.Location {
    return __newDestinationForLocation(pcf.DeleteSinglePayment, {Claim, Payment}, 0).printPage()
  }
  
  static function push (Claim :  Claim, Payment :  Payment) : pcf.api.Location {
    return __newDestinationForLocation(pcf.DeleteSinglePayment, {Claim, Payment}, 0).push()
  }
  
  
}