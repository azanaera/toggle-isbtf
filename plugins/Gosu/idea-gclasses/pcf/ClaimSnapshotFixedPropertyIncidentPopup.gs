package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/ClaimSnapshotFixedPropertyIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotFixedPropertyIncidentPopup extends com.guidewire.pl.web.codegen.LocationBase {
  static function createDestination (Claim :  Claim, Incident :  dynamic.Dynamic) : pcf.api.Destination {
    return __newDestinationForLocation(pcf.ClaimSnapshotFixedPropertyIncidentPopup, {Claim, Incident}, 0)
  }
  
  static function push (Claim :  Claim, Incident :  dynamic.Dynamic) : pcf.api.Location {
    return __newDestinationForLocation(pcf.ClaimSnapshotFixedPropertyIncidentPopup, {Claim, Incident}, 0).push()
  }
  
  
}