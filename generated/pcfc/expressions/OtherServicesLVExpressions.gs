package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/FNOL/OtherServicesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class OtherServicesLVExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/FNOL/OtherServicesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends OtherServicesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'checkBoxVisible' attribute on RowIterator (id=OtherServicesIterator) at OtherServicesLV.pcf: line 28, column 63
    function checkBoxVisible_15 () : java.lang.Boolean {
      return CurrentLocation.InEditMode and (serviceRequest.IsEditableInUI)
    }
    
    // 'iconLabel' attribute on BooleanRadioCell (id=Kind_Cell) at OtherServicesLV.pcf: line 38, column 32
    function iconLabel_4 () : java.lang.String {
      return serviceRequest.Kind.Label
    }
    
    // 'icon' attribute on BooleanRadioCell (id=Kind_Cell) at OtherServicesLV.pcf: line 38, column 32
    function icon_5 () : java.lang.String {
      return serviceRequest.Kind.Icon
    }
    
    // 'value' attribute on TextCell (id=RelatedTo_Cell) at OtherServicesLV.pcf: line 42, column 49
    function valueRoot_7 () : java.lang.Object {
      return serviceRequest
    }
    
    // 'value' attribute on TextCell (id=Specialist_Cell) at OtherServicesLV.pcf: line 50, column 50
    function value_12 () : java.lang.String {
      return serviceRequest.SpecialistName
    }
    
    // 'value' attribute on TextCell (id=RelatedTo_Cell) at OtherServicesLV.pcf: line 42, column 49
    function value_6 () : java.lang.String {
      return serviceRequest.RelatedToName
    }
    
    // 'value' attribute on TextCell (id=Services_Cell) at OtherServicesLV.pcf: line 46, column 50
    function value_9 () : java.lang.String {
      return serviceRequest.ServicesString
    }
    
    property get serviceRequest () : entity.ServiceRequest {
      return getIteratedValue(1) as entity.ServiceRequest
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/FNOL/OtherServicesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherServicesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on BooleanRadioCell (id=Kind_Cell) at OtherServicesLV.pcf: line 38, column 32
    function sortValue_0 (serviceRequest :  entity.ServiceRequest) : java.lang.Object {
      return true
    }
    
    // 'value' attribute on TextCell (id=RelatedTo_Cell) at OtherServicesLV.pcf: line 42, column 49
    function sortValue_1 (serviceRequest :  entity.ServiceRequest) : java.lang.Object {
      return serviceRequest.RelatedToName
    }
    
    // 'value' attribute on TextCell (id=Services_Cell) at OtherServicesLV.pcf: line 46, column 50
    function sortValue_2 (serviceRequest :  entity.ServiceRequest) : java.lang.Object {
      return serviceRequest.ServicesString
    }
    
    // 'value' attribute on TextCell (id=Specialist_Cell) at OtherServicesLV.pcf: line 50, column 50
    function sortValue_3 (serviceRequest :  entity.ServiceRequest) : java.lang.Object {
      return serviceRequest.SpecialistName
    }
    
    // 'toRemove' attribute on RowIterator (id=OtherServicesIterator) at OtherServicesLV.pcf: line 28, column 63
    function toRemove_16 (serviceRequest :  entity.ServiceRequest) : void {
      removeServiceRequest(serviceRequest)
    }
    
    // 'value' attribute on RowIterator (id=OtherServicesIterator) at OtherServicesLV.pcf: line 28, column 63
    function value_17 () : java.util.List<entity.ServiceRequest> {
      return otherServiceRequests.toList()
    }
    
    property get alsoRemove () : java.util.Set<ServiceRequest> {
      return getRequireValue("alsoRemove", 0) as java.util.Set<ServiceRequest>
    }
    
    property set alsoRemove ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("alsoRemove", 0, $arg)
    }
    
    property get otherServiceRequests () : java.util.Set<ServiceRequest> {
      return getRequireValue("otherServiceRequests", 0) as java.util.Set<ServiceRequest>
    }
    
    property set otherServiceRequests ($arg :  java.util.Set<ServiceRequest>) {
      setRequireValue("otherServiceRequests", 0, $arg)
    }
    
    function removeServiceRequest(sr : ServiceRequest) {
      otherServiceRequests.remove(sr)
      alsoRemove?.remove(sr)
      //safe to just delete the SR, since it's in draft and therefore no quotes / invoices / statements exist, and everything is deleted in a cascade
      sr.remove()
    }
    
    
  }
  
  
}