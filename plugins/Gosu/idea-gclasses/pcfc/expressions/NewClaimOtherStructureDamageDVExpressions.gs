package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/FNOL/NewClaimOtherStructureDamageDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimOtherStructureDamageDVExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/FNOL/NewClaimOtherStructureDamageDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimOtherStructureDamageDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=OtherStructureDamageDV_NewIncidentMenuItem) at NewClaimOtherStructureDamageDV.pcf: line 30, column 111
    function action_2 () : void {
      NewOtherStructureIncidentPopup.push(Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=OtherStructureDamageDV_EditIncidentMenuItem) at NewClaimOtherStructureDamageDV.pcf: line 35, column 112
    function action_4 () : void {
      EditOtherStructureIncidentPopup.push(Exposure.OtherStructureIncident, true)
    }
    
    // 'action' attribute on MenuItem (id=OtherStructureDamageDV_ViewIncidentMenuItem) at NewClaimOtherStructureDamageDV.pcf: line 40, column 112
    function action_6 () : void {
      EditOtherStructureIncidentPopup.push(Exposure.OtherStructureIncident, false)
    }
    
    // 'action' attribute on MenuItem (id=OtherStructureDamageDV_NewIncidentMenuItem) at NewClaimOtherStructureDamageDV.pcf: line 30, column 111
    function action_dest_3 () : pcf.api.Destination {
      return pcf.NewOtherStructureIncidentPopup.createDestination(Exposure.Claim)
    }
    
    // 'action' attribute on MenuItem (id=OtherStructureDamageDV_EditIncidentMenuItem) at NewClaimOtherStructureDamageDV.pcf: line 35, column 112
    function action_dest_5 () : pcf.api.Destination {
      return pcf.EditOtherStructureIncidentPopup.createDestination(Exposure.OtherStructureIncident, true)
    }
    
    // 'action' attribute on MenuItem (id=OtherStructureDamageDV_ViewIncidentMenuItem) at NewClaimOtherStructureDamageDV.pcf: line 40, column 112
    function action_dest_7 () : pcf.api.Destination {
      return pcf.EditOtherStructureIncidentPopup.createDestination(Exposure.OtherStructureIncident, false)
    }
    
    // 'def' attribute on InputSetRef at NewClaimOtherStructureDamageDV.pcf: line 12, column 55
    function def_onEnter_0 (def :  pcf.ExposureDetailInputSet) : void {
      def.onEnter(Exposure, true)
    }
    
    // 'def' attribute on InputSetRef at NewClaimOtherStructureDamageDV.pcf: line 45, column 58
    function def_onEnter_15 (def :  pcf.OtherCarrierInvolvementInputSet) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at NewClaimOtherStructureDamageDV.pcf: line 12, column 55
    function def_refreshVariables_1 (def :  pcf.ExposureDetailInputSet) : void {
      def.refreshVariables(Exposure, true)
    }
    
    // 'def' attribute on InputSetRef at NewClaimOtherStructureDamageDV.pcf: line 45, column 58
    function def_refreshVariables_16 (def :  pcf.OtherCarrierInvolvementInputSet) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'value' attribute on RangeInput (id=Other_Structure_Incident_Input) at NewClaimOtherStructureDamageDV.pcf: line 25, column 51
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.OtherStructureIncident = (__VALUE_TO_SET as entity.OtherStructureIncident)
    }
    
    // 'valueRange' attribute on RangeInput (id=Other_Structure_Incident_Input) at NewClaimOtherStructureDamageDV.pcf: line 25, column 51
    function valueRange_11 () : java.lang.Object {
      return Exposure.Claim.OtherStructureIncidentsOnly
    }
    
    // 'value' attribute on RangeInput (id=Other_Structure_Incident_Input) at NewClaimOtherStructureDamageDV.pcf: line 25, column 51
    function valueRoot_10 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on RangeInput (id=Other_Structure_Incident_Input) at NewClaimOtherStructureDamageDV.pcf: line 25, column 51
    function value_8 () : entity.OtherStructureIncident {
      return Exposure.OtherStructureIncident
    }
    
    // 'valueRange' attribute on RangeInput (id=Other_Structure_Incident_Input) at NewClaimOtherStructureDamageDV.pcf: line 25, column 51
    function verifyValueRangeIsAllowedType_12 ($$arg :  entity.OtherStructureIncident[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Other_Structure_Incident_Input) at NewClaimOtherStructureDamageDV.pcf: line 25, column 51
    function verifyValueRangeIsAllowedType_12 ($$arg :  gw.api.database.IQueryBeanResult<entity.OtherStructureIncident>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Other_Structure_Incident_Input) at NewClaimOtherStructureDamageDV.pcf: line 25, column 51
    function verifyValueRangeIsAllowedType_12 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=Other_Structure_Incident_Input) at NewClaimOtherStructureDamageDV.pcf: line 25, column 51
    function verifyValueRange_13 () : void {
      var __valueRangeArg = Exposure.Claim.OtherStructureIncidentsOnly
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_12(__valueRangeArg)
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
    property get ContactProhibited() : boolean {
        return Exposure.Claim.getClaimContact(Exposure.Claimant).ContactProhibited
    }
      
    property set ContactProhibited(prohibited : boolean) {
      var claimContact = Exposure.Claim.getClaimContact(Exposure.Claimant) 
      if (claimContact != null) claimContact.ContactProhibited = prohibited 
    }
        
    
    
  }
  
  
}