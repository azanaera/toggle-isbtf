package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/admin/specialhandling/ClaimOtherInstructionWorksheet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimOtherInstructionWorksheet extends com.guidewire.pl.web.codegen.LocationBase {
  static function createDestination (claim :  Claim) : pcf.api.Destination {
    return __newDestinationForLocation(pcf.ClaimOtherInstructionWorksheet, {claim}, 0)
  }
  
  @com.guidewire.pl.system.expression.WebImmediate
  static function goInWorkspace (claim :  Claim) : pcf.api.Location {
    return __newDestinationForLocation(pcf.ClaimOtherInstructionWorksheet, {claim}, 0).goInWorkspace()
  }
  
  static function push (claim :  Claim) : pcf.api.Location {
    return __newDestinationForLocation(pcf.ClaimOtherInstructionWorksheet, {claim}, 0).push()
  }
  
  
}