package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/team/group/TeamGroupOtherExposures.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamGroupOtherExposures extends com.guidewire.pl.web.codegen.LocationBase {
  static function createDestination (Group :  Group) : pcf.api.Destination {
    return __newDestinationForLocation(pcf.TeamGroupOtherExposures, {Group}, 0)
  }
  
  static function drilldown (Group :  Group) : pcf.api.Location {
    return __newDestinationForLocation(pcf.TeamGroupOtherExposures, {Group}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Group :  Group) : pcf.api.Location {
    return __newDestinationForLocation(pcf.TeamGroupOtherExposures, {Group}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Group :  Group) : pcf.api.Location {
    return __newDestinationForLocation(pcf.TeamGroupOtherExposures, {Group}, 0).goInMain()
  }
  
  static function printPage (Group :  Group) : pcf.api.Location {
    return __newDestinationForLocation(pcf.TeamGroupOtherExposures, {Group}, 0).printPage()
  }
  
  static function push (Group :  Group) : pcf.api.Location {
    return __newDestinationForLocation(pcf.TeamGroupOtherExposures, {Group}, 0).push()
  }
  
  
}