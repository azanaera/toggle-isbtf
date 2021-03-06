package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/calendar/SupervisorClaimMatterCalendar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class SupervisorClaimMatterCalendar extends com.guidewire.pl.web.codegen.LocationBase {
  static function createDestination (Claim :  Claim, Matter :  Matter) : pcf.api.Destination {
    return __newDestinationForLocation(pcf.SupervisorClaimMatterCalendar, {Claim, Matter}, 0)
  }
  
  static function drilldown (Claim :  Claim, Matter :  Matter) : pcf.api.Location {
    return __newDestinationForLocation(pcf.SupervisorClaimMatterCalendar, {Claim, Matter}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Claim :  Claim, Matter :  Matter) : pcf.api.Location {
    return __newDestinationForLocation(pcf.SupervisorClaimMatterCalendar, {Claim, Matter}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Claim :  Claim, Matter :  Matter) : pcf.api.Location {
    return __newDestinationForLocation(pcf.SupervisorClaimMatterCalendar, {Claim, Matter}, 0).goInMain()
  }
  
  static function printPage (Claim :  Claim, Matter :  Matter) : pcf.api.Location {
    return __newDestinationForLocation(pcf.SupervisorClaimMatterCalendar, {Claim, Matter}, 0).printPage()
  }
  
  static function push (Claim :  Claim, Matter :  Matter) : pcf.api.Location {
    return __newDestinationForLocation(pcf.SupervisorClaimMatterCalendar, {Claim, Matter}, 0).push()
  }
  
  
}