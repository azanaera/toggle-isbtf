package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/reinsurance/NewRIAgreement.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewRIAgreement extends com.guidewire.pl.web.codegen.LocationBase {
  static function createDestination (claim :  Claim, subtype :  gw.lang.reflect.IType) : pcf.api.Destination {
    return __newDestinationForLocation(pcf.NewRIAgreement, {claim, subtype}, 0)
  }
  
  static function drilldown (claim :  Claim, subtype :  gw.lang.reflect.IType) : pcf.api.Location {
    return __newDestinationForLocation(pcf.NewRIAgreement, {claim, subtype}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (claim :  Claim, subtype :  gw.lang.reflect.IType) : pcf.api.Location {
    return __newDestinationForLocation(pcf.NewRIAgreement, {claim, subtype}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (claim :  Claim, subtype :  gw.lang.reflect.IType) : pcf.api.Location {
    return __newDestinationForLocation(pcf.NewRIAgreement, {claim, subtype}, 0).goInMain()
  }
  
  static function printPage (claim :  Claim, subtype :  gw.lang.reflect.IType) : pcf.api.Location {
    return __newDestinationForLocation(pcf.NewRIAgreement, {claim, subtype}, 0).printPage()
  }
  
  static function push (claim :  Claim, subtype :  gw.lang.reflect.IType) : pcf.api.Location {
    return __newDestinationForLocation(pcf.NewRIAgreement, {claim, subtype}, 0).push()
  }
  
  
}