package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/admin/catastrophes/CatastropheDetailPage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class CatastropheDetailPage extends com.guidewire.pl.web.codegen.LocationBase {
  static function createDestination (Catastrophe :  Catastrophe) : pcf.api.Destination {
    return __newDestinationForLocation(pcf.CatastropheDetailPage, {Catastrophe}, 0)
  }
  
  static function drilldown (Catastrophe :  Catastrophe) : pcf.api.Location {
    return __newDestinationForLocation(pcf.CatastropheDetailPage, {Catastrophe}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Catastrophe :  Catastrophe) : pcf.api.Location {
    return __newDestinationForLocation(pcf.CatastropheDetailPage, {Catastrophe}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Catastrophe :  Catastrophe) : pcf.api.Location {
    return __newDestinationForLocation(pcf.CatastropheDetailPage, {Catastrophe}, 0).goInMain()
  }
  
  static function printPage (Catastrophe :  Catastrophe) : pcf.api.Location {
    return __newDestinationForLocation(pcf.CatastropheDetailPage, {Catastrophe}, 0).printPage()
  }
  
  static function push (Catastrophe :  Catastrophe) : pcf.api.Location {
    return __newDestinationForLocation(pcf.CatastropheDetailPage, {Catastrophe}, 0).push()
  }
  
  
}