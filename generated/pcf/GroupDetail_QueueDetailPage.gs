package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/admin/groups/GroupDetail_QueueDetailPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupDetail_QueueDetailPage extends com.guidewire.pl.web.codegen.LocationBase {
  static function createDestination (Group :  Group, AssignableQueue :  AssignableQueue) : pcf.api.Destination {
    return __newDestinationForLocation(pcf.GroupDetail_QueueDetailPage, {Group, AssignableQueue}, 0)
  }
  
  static function drilldown (Group :  Group, AssignableQueue :  AssignableQueue) : pcf.api.Location {
    return __newDestinationForLocation(pcf.GroupDetail_QueueDetailPage, {Group, AssignableQueue}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Group :  Group, AssignableQueue :  AssignableQueue) : pcf.api.Location {
    return __newDestinationForLocation(pcf.GroupDetail_QueueDetailPage, {Group, AssignableQueue}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Group :  Group, AssignableQueue :  AssignableQueue) : pcf.api.Location {
    return __newDestinationForLocation(pcf.GroupDetail_QueueDetailPage, {Group, AssignableQueue}, 0).goInMain()
  }
  
  static function printPage (Group :  Group, AssignableQueue :  AssignableQueue) : pcf.api.Location {
    return __newDestinationForLocation(pcf.GroupDetail_QueueDetailPage, {Group, AssignableQueue}, 0).printPage()
  }
  
  static function push (Group :  Group, AssignableQueue :  AssignableQueue) : pcf.api.Location {
    return __newDestinationForLocation(pcf.GroupDetail_QueueDetailPage, {Group, AssignableQueue}, 0).push()
  }
  
  
}