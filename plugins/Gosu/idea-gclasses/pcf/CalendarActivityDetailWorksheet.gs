package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/workspace/activity/CalendarActivityDetailWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CalendarActivityDetailWorksheet extends com.guidewire.pl.web.codegen.LocationBase {
  static function createDestination (Activity :  Activity) : pcf.api.Destination {
    return __newDestinationForLocation(pcf.CalendarActivityDetailWorksheet, {Activity}, 0)
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInWorkspace (Activity :  Activity) : pcf.api.Location {
    return __newDestinationForLocation(pcf.CalendarActivityDetailWorksheet, {Activity}, 0).goInWorkspace()
  }
  
  static function push (Activity :  Activity) : pcf.api.Location {
    return __newDestinationForLocation(pcf.CalendarActivityDetailWorksheet, {Activity}, 0).push()
  }
  
  
}