package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/desktop/calendar/SupervisorClaimAllMattersCalendar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class SupervisorClaimAllMattersCalendar extends com.guidewire.pl.web.codegen.LocationBase {
  static function createDestination (Claim :  Claim) : pcf.api.Destination {
    return __newDestinationForLocation(pcf.SupervisorClaimAllMattersCalendar, {Claim}, 0)
  }
  
  static function drilldown (Claim :  Claim) : pcf.api.Location {
    return __newDestinationForLocation(pcf.SupervisorClaimAllMattersCalendar, {Claim}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Claim :  Claim) : pcf.api.Location {
    return __newDestinationForLocation(pcf.SupervisorClaimAllMattersCalendar, {Claim}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Claim :  Claim) : pcf.api.Location {
    return __newDestinationForLocation(pcf.SupervisorClaimAllMattersCalendar, {Claim}, 0).goInMain()
  }
  
  static function printPage (Claim :  Claim) : pcf.api.Location {
    return __newDestinationForLocation(pcf.SupervisorClaimAllMattersCalendar, {Claim}, 0).printPage()
  }
  
  static function push (Claim :  Claim) : pcf.api.Location {
    return __newDestinationForLocation(pcf.SupervisorClaimAllMattersCalendar, {Claim}, 0).push()
  }
  
  
}