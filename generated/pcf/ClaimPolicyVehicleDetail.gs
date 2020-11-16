package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/policy/ClaimPolicyVehicleDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPolicyVehicleDetail extends com.guidewire.pl.web.codegen.LocationBase {
  static function createDestination (Claim :  Claim, VehicleRU :  VehicleRU) : pcf.api.Destination {
    return __newDestinationForLocation(pcf.ClaimPolicyVehicleDetail, {Claim, VehicleRU}, 0)
  }
  
  static function drilldown (Claim :  Claim, VehicleRU :  VehicleRU) : pcf.api.Location {
    return __newDestinationForLocation(pcf.ClaimPolicyVehicleDetail, {Claim, VehicleRU}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Claim :  Claim, VehicleRU :  VehicleRU) : pcf.api.Location {
    return __newDestinationForLocation(pcf.ClaimPolicyVehicleDetail, {Claim, VehicleRU}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Claim :  Claim, VehicleRU :  VehicleRU) : pcf.api.Location {
    return __newDestinationForLocation(pcf.ClaimPolicyVehicleDetail, {Claim, VehicleRU}, 0).goInMain()
  }
  
  static function printPage (Claim :  Claim, VehicleRU :  VehicleRU) : pcf.api.Location {
    return __newDestinationForLocation(pcf.ClaimPolicyVehicleDetail, {Claim, VehicleRU}, 0).printPage()
  }
  
  static function push (Claim :  Claim, VehicleRU :  VehicleRU) : pcf.api.Location {
    return __newDestinationForLocation(pcf.ClaimPolicyVehicleDetail, {Claim, VehicleRU}, 0).push()
  }
  
  
}