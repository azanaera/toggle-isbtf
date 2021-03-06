package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/team/group/TeamGroupPendingSubrogations.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamGroupPendingSubrogations extends com.guidewire.pl.web.codegen.LocationBase {
  static function createDestination (group :  entity.Group) : pcf.api.Destination {
    return __newDestinationForLocation(pcf.TeamGroupPendingSubrogations, {group}, 0)
  }
  
  static function drilldown (group :  entity.Group) : pcf.api.Location {
    return __newDestinationForLocation(pcf.TeamGroupPendingSubrogations, {group}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (group :  entity.Group) : pcf.api.Location {
    return __newDestinationForLocation(pcf.TeamGroupPendingSubrogations, {group}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (group :  entity.Group) : pcf.api.Location {
    return __newDestinationForLocation(pcf.TeamGroupPendingSubrogations, {group}, 0).goInMain()
  }
  
  static function printPage (group :  entity.Group) : pcf.api.Location {
    return __newDestinationForLocation(pcf.TeamGroupPendingSubrogations, {group}, 0).printPage()
  }
  
  static function push (group :  entity.Group) : pcf.api.Location {
    return __newDestinationForLocation(pcf.TeamGroupPendingSubrogations, {group}, 0).push()
  }
  
  
}