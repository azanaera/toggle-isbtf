package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/lossdetails/EditableBaggageIncidentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableBaggageIncidentsLVExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/lossdetails/EditableBaggageIncidentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableBaggageIncidentsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickLocation' attribute on RowIterator at EditableBaggageIncidentsLV.pcf: line 22, column 44
    function pickLocation_17 () : void {
      BaggageIncidentPopup.push( Claim )
    }
    
    // 'sortBy' attribute on IteratorSort at EditableBaggageIncidentsLV.pcf: line 27, column 24
    function sortBy_0 (BaggageIncident :  entity.BaggageIncident) : java.lang.Object {
      return BaggageIncident.BaggageType
    }
    
    // 'value' attribute on TextCell (id=PropertyDesc_Cell) at EditableBaggageIncidentsLV.pcf: line 34, column 47
    function sortValue_1 (BaggageIncident :  entity.BaggageIncident) : java.lang.Object {
      return BaggageIncident
    }
    
    // 'value' attribute on TextCell (id=Description_Cell) at EditableBaggageIncidentsLV.pcf: line 40, column 29
    function sortValue_2 (BaggageIncident :  entity.BaggageIncident) : java.lang.Object {
      return BaggageIncident.Description.length > 40 ? BaggageIncident.Description.substring( 0, 37 ) + "..." : BaggageIncident.Description
    }
    
    // 'value' attribute on CurrencyCell (id=ApprovedContentTotal_Cell) at EditableBaggageIncidentsLV.pcf: line 45, column 29
    function sortValue_3 (BaggageIncident :  entity.BaggageIncident) : java.lang.Object {
      return BaggageIncident.ApprovedContentTotal()
    }
    
    // 'value' attribute on CurrencyCell (id=ReviewContentTotal_Cell) at EditableBaggageIncidentsLV.pcf: line 49, column 57
    function sortValue_4 (BaggageIncident :  entity.BaggageIncident) : java.lang.Object {
      return BaggageIncident.ReviewContentTotal()
    }
    
    // 'toRemove' attribute on RowIterator at EditableBaggageIncidentsLV.pcf: line 22, column 44
    function toRemove_18 (BaggageIncident :  entity.BaggageIncident) : void {
      removeBaggageIncident(BaggageIncident)
    }
    
    // 'value' attribute on RowIterator at EditableBaggageIncidentsLV.pcf: line 22, column 44
    function value_19 () : entity.BaggageIncident[] {
      return Claim.BaggageIncidentsOnly
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    function removeBaggageIncident(baggageIncidentParam : BaggageIncident) {
      if (baggageIncidentParam.UsedByExposure) {
          throw new gw.api.util.DisplayableException(DisplayKey.get("Web.NewLossDetailsScreen.CannotDeleteBaggageIncidentExposureLabel"))
      }  
      Claim.removeNewServiceRequests(baggageIncidentParam)
      Claim.removeFromIncidents( baggageIncidentParam )
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/lossdetails/EditableBaggageIncidentsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableBaggageIncidentsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=PropertyDesc_Cell) at EditableBaggageIncidentsLV.pcf: line 34, column 47
    function action_5 () : void {
      BaggageIncidentPopup.push(BaggageIncident, CurrentLocation.InEditMode)
    }
    
    // 'action' attribute on TextCell (id=Description_Cell) at EditableBaggageIncidentsLV.pcf: line 40, column 29
    function action_9 () : void {
      BaggageIncidentPopup.push(BaggageIncident, CurrentLocation.InEditMode)
    }
    
    // 'action' attribute on TextCell (id=Description_Cell) at EditableBaggageIncidentsLV.pcf: line 40, column 29
    function action_dest_10 () : pcf.api.Destination {
      return pcf.BaggageIncidentPopup.createDestination(BaggageIncident, CurrentLocation.InEditMode)
    }
    
    // 'action' attribute on TextCell (id=PropertyDesc_Cell) at EditableBaggageIncidentsLV.pcf: line 34, column 47
    function action_dest_6 () : pcf.api.Destination {
      return pcf.BaggageIncidentPopup.createDestination(BaggageIncident, CurrentLocation.InEditMode)
    }
    
    // 'value' attribute on TextCell (id=Description_Cell) at EditableBaggageIncidentsLV.pcf: line 40, column 29
    function value_11 () : java.lang.String {
      return BaggageIncident.Description.length > 40 ? BaggageIncident.Description.substring( 0, 37 ) + "..." : BaggageIncident.Description
    }
    
    // 'value' attribute on CurrencyCell (id=ApprovedContentTotal_Cell) at EditableBaggageIncidentsLV.pcf: line 45, column 29
    function value_13 () : gw.api.financials.CurrencyAmount {
      return BaggageIncident.ApprovedContentTotal()
    }
    
    // 'value' attribute on CurrencyCell (id=ReviewContentTotal_Cell) at EditableBaggageIncidentsLV.pcf: line 49, column 57
    function value_15 () : gw.api.financials.CurrencyAmount {
      return BaggageIncident.ReviewContentTotal()
    }
    
    // 'value' attribute on TextCell (id=PropertyDesc_Cell) at EditableBaggageIncidentsLV.pcf: line 34, column 47
    function value_7 () : entity.BaggageIncident {
      return BaggageIncident
    }
    
    property get BaggageIncident () : entity.BaggageIncident {
      return getIteratedValue(1) as entity.BaggageIncident
    }
    
    
  }
  
  
}