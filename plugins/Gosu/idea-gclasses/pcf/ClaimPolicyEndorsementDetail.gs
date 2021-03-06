package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/policy/ClaimPolicyEndorsementDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPolicyEndorsementDetail extends com.guidewire.pl.web.codegen.LocationBase {
  static function createDestination (Claim :  Claim, Endorsement :  Endorsement) : pcf.api.Destination {
    return __newDestinationForLocation(pcf.ClaimPolicyEndorsementDetail, {Claim, Endorsement}, 0)
  }
  
  static function drilldown (Claim :  Claim, Endorsement :  Endorsement) : pcf.api.Location {
    return __newDestinationForLocation(pcf.ClaimPolicyEndorsementDetail, {Claim, Endorsement}, 0).drilldown()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function go (Claim :  Claim, Endorsement :  Endorsement) : pcf.api.Location {
    return __newDestinationForLocation(pcf.ClaimPolicyEndorsementDetail, {Claim, Endorsement}, 0).go()
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInMain (Claim :  Claim, Endorsement :  Endorsement) : pcf.api.Location {
    return __newDestinationForLocation(pcf.ClaimPolicyEndorsementDetail, {Claim, Endorsement}, 0).goInMain()
  }
  
  static function printPage (Claim :  Claim, Endorsement :  Endorsement) : pcf.api.Location {
    return __newDestinationForLocation(pcf.ClaimPolicyEndorsementDetail, {Claim, Endorsement}, 0).printPage()
  }
  
  static function push (Claim :  Claim, Endorsement :  Endorsement) : pcf.api.Location {
    return __newDestinationForLocation(pcf.ClaimPolicyEndorsementDetail, {Claim, Endorsement}, 0).push()
  }
  
  
}