package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/servicerequests/AddDelayPopup.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class AddDelayPopup extends com.guidewire.pl.web.codegen.LocationBase {
  static function createDestination (serviceRequest :  ServiceRequest) : pcf.api.Destination {
    return __newDestinationForLocation(pcf.AddDelayPopup, {serviceRequest}, 0)
  }
  
  static function push (serviceRequest :  ServiceRequest) : pcf.api.Location {
    return __newDestinationForLocation(pcf.AddDelayPopup, {serviceRequest}, 0).push()
  }
  
  
}