package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/newclaim/NewClaimSavedDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimSavedDVExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/newclaim/NewClaimSavedDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends NewClaimSavedDVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=ServiceRequestNumber_Cell) at NewClaimSavedDV.pcf: line 57, column 62
    function action_17 () : void {
      pcf.ClaimServiceRequests.go(claim, serviceRequest)
    }
    
    // 'action' attribute on TextCell (id=ServiceRequestNumber_Cell) at NewClaimSavedDV.pcf: line 57, column 62
    function action_dest_18 () : pcf.api.Destination {
      return pcf.ClaimServiceRequests.createDestination(claim, serviceRequest)
    }
    
    // 'iconLabel' attribute on BooleanRadioCell (id=Kind_Cell) at NewClaimSavedDV.pcf: line 51, column 38
    function iconLabel_15 () : java.lang.String {
      return serviceRequest.Kind.Label
    }
    
    // 'icon' attribute on BooleanRadioCell (id=Kind_Cell) at NewClaimSavedDV.pcf: line 51, column 38
    function icon_16 () : java.lang.String {
      return serviceRequest.Kind.Icon
    }
    
    // 'value' attribute on TextCell (id=ServiceRequestNumber_Cell) at NewClaimSavedDV.pcf: line 57, column 62
    function valueRoot_20 () : java.lang.Object {
      return serviceRequest
    }
    
    // 'value' attribute on TextCell (id=ServiceRequestNumber_Cell) at NewClaimSavedDV.pcf: line 57, column 62
    function value_19 () : java.lang.String {
      return serviceRequest.ServiceRequestNumber
    }
    
    // 'value' attribute on TextCell (id=RelatedTo_Cell) at NewClaimSavedDV.pcf: line 62, column 55
    function value_22 () : java.lang.String {
      return serviceRequest.RelatedToName
    }
    
    // 'value' attribute on TextCell (id=Services_Cell) at NewClaimSavedDV.pcf: line 66, column 56
    function value_25 () : java.lang.String {
      return serviceRequest.ServicesString
    }
    
    // 'value' attribute on TextCell (id=Specialist_Cell) at NewClaimSavedDV.pcf: line 71, column 56
    function value_28 () : java.lang.String {
      return serviceRequest.SpecialistName
    }
    
    // 'value' attribute on DateCell (id=RequestedCompletionDate_Cell) at NewClaimSavedDV.pcf: line 75, column 150
    function value_31 () : java.util.Date {
      return serviceRequest.quoteAllowed() ? serviceRequest.RequestedQuoteCompletionDate : serviceRequest.RequestedServiceCompletionDate
    }
    
    property get serviceRequest () : entity.ServiceRequest {
      return getIteratedValue(1) as entity.ServiceRequest
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/newclaim/NewClaimSavedDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimSavedDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on BulletPointTextInput (id=GoToClaim_Input) at NewClaimSavedDV.pcf: line 89, column 100
    function action_35 () : void {
      pcf.Claim.go(claim)
    }
    
    // 'action' attribute on BulletPointTextInput (id=CreateNewClaim_Input) at NewClaimSavedDV.pcf: line 95, column 86
    function action_39 () : void {
      FNOLWizard.go()
    }
    
    // 'action' attribute on BulletPointTextInput (id=CreateReserve_Input) at NewClaimSavedDV.pcf: line 101, column 83
    function action_41 () : void {
      NewReserveSet.go(claim)
    }
    
    // 'action' attribute on BulletPointTextInput (id=CreatePayment_Input) at NewClaimSavedDV.pcf: line 107, column 84
    function action_43 () : void {
      NormalCreateCheckWizardForward.go(claim)
    }
    
    // 'action' attribute on BulletPointTextInput (id=GoToClaim_Input) at NewClaimSavedDV.pcf: line 89, column 100
    function action_dest_36 () : pcf.api.Destination {
      return pcf.Claim.createDestination(claim)
    }
    
    // 'action' attribute on BulletPointTextInput (id=CreateNewClaim_Input) at NewClaimSavedDV.pcf: line 95, column 86
    function action_dest_40 () : pcf.api.Destination {
      return pcf.FNOLWizard.createDestination()
    }
    
    // 'action' attribute on BulletPointTextInput (id=CreateReserve_Input) at NewClaimSavedDV.pcf: line 101, column 83
    function action_dest_42 () : pcf.api.Destination {
      return pcf.NewReserveSet.createDestination(claim)
    }
    
    // 'action' attribute on BulletPointTextInput (id=CreatePayment_Input) at NewClaimSavedDV.pcf: line 107, column 84
    function action_dest_44 () : pcf.api.Destination {
      return pcf.NormalCreateCheckWizardForward.createDestination(claim)
    }
    
    // 'label' attribute on Label (id=Header) at NewClaimSavedDV.pcf: line 13, column 98
    function label_0 () : java.lang.String {
      return DisplayKey.get("Web.NewClaimWizard.Saved.Header",  claim.ClaimNumber)
    }
    
    // 'value' attribute on TextCell (id=ServiceRequestNumber_Cell) at NewClaimSavedDV.pcf: line 57, column 62
    function sortValue_10 (serviceRequest :  entity.ServiceRequest) : java.lang.Object {
      return serviceRequest.ServiceRequestNumber
    }
    
    // 'value' attribute on TextCell (id=RelatedTo_Cell) at NewClaimSavedDV.pcf: line 62, column 55
    function sortValue_11 (serviceRequest :  entity.ServiceRequest) : java.lang.Object {
      return serviceRequest.RelatedToName
    }
    
    // 'value' attribute on TextCell (id=Services_Cell) at NewClaimSavedDV.pcf: line 66, column 56
    function sortValue_12 (serviceRequest :  entity.ServiceRequest) : java.lang.Object {
      return serviceRequest.ServicesString
    }
    
    // 'value' attribute on TextCell (id=Specialist_Cell) at NewClaimSavedDV.pcf: line 71, column 56
    function sortValue_13 (serviceRequest :  entity.ServiceRequest) : java.lang.Object {
      return serviceRequest.SpecialistName
    }
    
    // 'value' attribute on DateCell (id=RequestedCompletionDate_Cell) at NewClaimSavedDV.pcf: line 75, column 150
    function sortValue_14 (serviceRequest :  entity.ServiceRequest) : java.lang.Object {
      return serviceRequest.quoteAllowed() ? serviceRequest.RequestedQuoteCompletionDate : serviceRequest.RequestedServiceCompletionDate
    }
    
    // 'value' attribute on BooleanRadioCell (id=Kind_Cell) at NewClaimSavedDV.pcf: line 51, column 38
    function sortValue_9 (serviceRequest :  entity.ServiceRequest) : java.lang.Object {
      return true
    }
    
    // 'value' attribute on TextInput (id=AssignedGroup_Input) at NewClaimSavedDV.pcf: line 17, column 107
    function value_1 () : java.lang.String {
      return DisplayKey.get("Web.NewClaimWizard.Saved.AssignedGroup",  claim.AssignedGroup)
    }
    
    // 'value' attribute on RowIterator at NewClaimSavedDV.pcf: line 41, column 49
    function value_33 () : entity.ServiceRequest[] {
      return claim.ServiceRequests
    }
    
    // 'value' attribute on BulletPointTextInput (id=GoToClaim_Input) at NewClaimSavedDV.pcf: line 89, column 100
    function value_37 () : java.lang.String {
      return DisplayKey.get("Web.NewClaimWizard.Saved.GoToClaim", claim.ClaimNumber)
    }
    
    // 'value' attribute on TextInput (id=AssignedUser_Input) at NewClaimSavedDV.pcf: line 22, column 58
    function value_4 () : java.lang.String {
      return DisplayKey.get("Web.NewClaimWizard.Saved.AssignedUser",  claim.AssignedUser)
    }
    
    // 'visible' attribute on TextInput (id=AssignedUser_Input) at NewClaimSavedDV.pcf: line 22, column 58
    function visible_3 () : java.lang.Boolean {
      return claim.AssignmentStatus == TC_ASSIGNED
    }
    
    // 'visible' attribute on ListViewInput at NewClaimSavedDV.pcf: line 34, column 53
    function visible_34 () : java.lang.Boolean {
      return not claim.ServiceRequests.IsEmpty
    }
    
    // 'visible' attribute on TextInput (id=PendingAssignment_Input) at NewClaimSavedDV.pcf: line 27, column 58
    function visible_7 () : java.lang.Boolean {
      return claim.AssignmentStatus != TC_ASSIGNED
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    
  }
  
  
}