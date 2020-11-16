package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/admin/OrganizationDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class OrganizationDetail extends com.guidewire.pl.web.codegen.LocationBase {
  static function createDestination (Organization :  Organization) : pcf.api.Destination {
    return __newDestinationForLocation(pcf.OrganizationDetail, {Organization}, 0)
  }
  
  static function drilldown (Organization :  Organization) : pcf.api.Location {
    return __newDestinationForLocation(pcf.OrganizationDetail, {Organization}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Organization :  Organization) : pcf.api.Location {
    return __newDestinationForLocation(pcf.OrganizationDetail, {Organization}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Organization :  Organization) : pcf.api.Location {
    return __newDestinationForLocation(pcf.OrganizationDetail, {Organization}, 0).goInMain()
  }
  
  static function printPage (Organization :  Organization) : pcf.api.Location {
    return __newDestinationForLocation(pcf.OrganizationDetail, {Organization}, 0).printPage()
  }
  
  static function push (Organization :  Organization) : pcf.api.Location {
    return __newDestinationForLocation(pcf.OrganizationDetail, {Organization}, 0).push()
  }
  
  
}