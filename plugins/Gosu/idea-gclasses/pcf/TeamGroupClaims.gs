package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/team/claims/TeamGroupClaims.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TeamGroupClaims extends com.guidewire.pl.web.codegen.LocationBase {
  static function createDestination (GroupInfo :  gw.api.admin.TreeGroupInfo) : pcf.api.Destination {
    return __newDestinationForLocation(pcf.TeamGroupClaims, {GroupInfo}, 0)
  }
  
  static function drilldown (GroupInfo :  gw.api.admin.TreeGroupInfo) : pcf.api.Location {
    return __newDestinationForLocation(pcf.TeamGroupClaims, {GroupInfo}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (GroupInfo :  gw.api.admin.TreeGroupInfo) : pcf.api.Location {
    return __newDestinationForLocation(pcf.TeamGroupClaims, {GroupInfo}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (GroupInfo :  gw.api.admin.TreeGroupInfo) : pcf.api.Location {
    return __newDestinationForLocation(pcf.TeamGroupClaims, {GroupInfo}, 0).goInMain()
  }
  
  static function printPage (GroupInfo :  gw.api.admin.TreeGroupInfo) : pcf.api.Location {
    return __newDestinationForLocation(pcf.TeamGroupClaims, {GroupInfo}, 0).printPage()
  }
  
  static function push (GroupInfo :  gw.api.admin.TreeGroupInfo) : pcf.api.Location {
    return __newDestinationForLocation(pcf.TeamGroupClaims, {GroupInfo}, 0).push()
  }
  
  
}