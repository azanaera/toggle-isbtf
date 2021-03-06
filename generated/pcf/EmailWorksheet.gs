package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/email/EmailWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EmailWorksheet extends com.guidewire.pl.web.codegen.LocationBase {
  static function createDestination (activity :  Activity) : pcf.api.Destination {
    return __newDestinationForLocation(pcf.EmailWorksheet, {activity}, 1)
  }
  
  static function createDestination (claim :  Claim) : pcf.api.Destination {
    return __newDestinationForLocation(pcf.EmailWorksheet, {claim}, 0)
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInWorkspace (activity :  Activity) : pcf.api.Location {
    return __newDestinationForLocation(pcf.EmailWorksheet, {activity}, 1).goInWorkspace()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInWorkspace (claim :  Claim) : pcf.api.Location {
    return __newDestinationForLocation(pcf.EmailWorksheet, {claim}, 0).goInWorkspace()
  }
  
  static function push (activity :  Activity) : pcf.api.Location {
    return __newDestinationForLocation(pcf.EmailWorksheet, {activity}, 1).push()
  }
  
  static function push (claim :  Claim) : pcf.api.Location {
    return __newDestinationForLocation(pcf.EmailWorksheet, {claim}, 0).push()
  }
  
  
}