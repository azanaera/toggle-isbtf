package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/newtransaction/check/NewCheckNoAbilityToPay.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class NewCheckNoAbilityToPay extends com.guidewire.pl.web.codegen.LocationBase {
  static function createDestination (claim :  Claim, canPayResult :  gw.api.financials.AbilityToPayResult) : pcf.api.Destination {
    return __newDestinationForLocation(pcf.NewCheckNoAbilityToPay, {claim, canPayResult}, 0)
  }
  
  static function drilldown (claim :  Claim, canPayResult :  gw.api.financials.AbilityToPayResult) : pcf.api.Location {
    return __newDestinationForLocation(pcf.NewCheckNoAbilityToPay, {claim, canPayResult}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (claim :  Claim, canPayResult :  gw.api.financials.AbilityToPayResult) : pcf.api.Location {
    return __newDestinationForLocation(pcf.NewCheckNoAbilityToPay, {claim, canPayResult}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (claim :  Claim, canPayResult :  gw.api.financials.AbilityToPayResult) : pcf.api.Location {
    return __newDestinationForLocation(pcf.NewCheckNoAbilityToPay, {claim, canPayResult}, 0).goInMain()
  }
  
  static function printPage (claim :  Claim, canPayResult :  gw.api.financials.AbilityToPayResult) : pcf.api.Location {
    return __newDestinationForLocation(pcf.NewCheckNoAbilityToPay, {claim, canPayResult}, 0).printPage()
  }
  
  static function push (claim :  Claim, canPayResult :  gw.api.financials.AbilityToPayResult) : pcf.api.Location {
    return __newDestinationForLocation(pcf.NewCheckNoAbilityToPay, {claim, canPayResult}, 0).push()
  }
  
  
}