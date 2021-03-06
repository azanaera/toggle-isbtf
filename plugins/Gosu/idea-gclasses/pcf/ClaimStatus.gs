package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/summary/ClaimStatus.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimStatus extends com.guidewire.pl.web.codegen.LocationBase {
  static function createDestination (claim :  Claim) : pcf.api.Destination {
    return __newDestinationForLocation(pcf.ClaimStatus, {claim}, 0)
  }
  
  static function drilldown (claim :  Claim) : pcf.api.Location {
    return __newDestinationForLocation(pcf.ClaimStatus, {claim}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (claim :  Claim) : pcf.api.Location {
    return __newDestinationForLocation(pcf.ClaimStatus, {claim}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (claim :  Claim) : pcf.api.Location {
    return __newDestinationForLocation(pcf.ClaimStatus, {claim}, 0).goInMain()
  }
  
  static function printPage (claim :  Claim) : pcf.api.Location {
    return __newDestinationForLocation(pcf.ClaimStatus, {claim}, 0).printPage()
  }
  
  static function push (claim :  Claim) : pcf.api.Location {
    return __newDestinationForLocation(pcf.ClaimStatus, {claim}, 0).push()
  }
  
  
}