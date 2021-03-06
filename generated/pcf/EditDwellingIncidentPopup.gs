package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/incidents/EditDwellingIncidentPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class EditDwellingIncidentPopup extends com.guidewire.pl.web.codegen.LocationBase {
  static function createDestination (Claim :  Claim, startInEditMode :  boolean) : pcf.api.Destination {
    return __newDestinationForLocation(pcf.EditDwellingIncidentPopup, {Claim, startInEditMode}, 2)
  }
  
  static function createDestination (dwellingIncident :  DwellingIncident) : pcf.api.Destination {
    return __newDestinationForLocation(pcf.EditDwellingIncidentPopup, {dwellingIncident}, 1)
  }
  
  static function createDestination (dwellingIncident :  DwellingIncident, startInEditMode :  boolean) : pcf.api.Destination {
    return __newDestinationForLocation(pcf.EditDwellingIncidentPopup, {dwellingIncident, startInEditMode}, 0)
  }
  
  static function push (Claim :  Claim, startInEditMode :  boolean) : pcf.api.Location {
    return __newDestinationForLocation(pcf.EditDwellingIncidentPopup, {Claim, startInEditMode}, 2).push()
  }
  
  static function push (dwellingIncident :  DwellingIncident) : pcf.api.Location {
    return __newDestinationForLocation(pcf.EditDwellingIncidentPopup, {dwellingIncident}, 1).push()
  }
  
  static function push (dwellingIncident :  DwellingIncident, startInEditMode :  boolean) : pcf.api.Location {
    return __newDestinationForLocation(pcf.EditDwellingIncidentPopup, {dwellingIncident, startInEditMode}, 0).push()
  }
  
  
}