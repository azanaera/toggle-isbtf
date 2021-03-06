package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotPartiesInvolvedScreen.310.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotPartiesInvolvedScreen_310Expressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotPartiesInvolvedScreen.310.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPartiesInvolvedScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get SnapshotParam () : dynamic.Dynamic {
      return getRequireValue("SnapshotParam", 0) as dynamic.Dynamic
    }
    
    property set SnapshotParam ($arg :  dynamic.Dynamic) {
      setRequireValue("SnapshotParam", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotPartiesInvolvedScreen.310.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Address_Cell) at ClaimSnapshotPartiesInvolvedScreen.310.pcf: line 48, column 44
    function valueRoot_18 () : java.lang.Object {
      return ClaimContact.Contact.PrimaryAddress
    }
    
    // 'value' attribute on TextCell (id=Name_Cell) at ClaimSnapshotPartiesInvolvedScreen.310.pcf: line 30, column 44
    function valueRoot_9 () : java.lang.Object {
      return ClaimContact.Contact
    }
    
    // 'value' attribute on TextCell (id=Roles_Cell) at ClaimSnapshotPartiesInvolvedScreen.310.pcf: line 34, column 82
    function value_11 () : java.lang.String {
      return util.Snapshot.getDistinctContactRoles(ClaimContact.Roles)
    }
    
    // 'value' attribute on TextCell (id=Prohibited_Cell) at ClaimSnapshotPartiesInvolvedScreen.310.pcf: line 38, column 82
    function value_13 () : java.lang.String {
      return util.Snapshot.renderValue(ClaimContact.ContactProhibited)
    }
    
    // 'value' attribute on TextCell (id=Phone_Cell) at ClaimSnapshotPartiesInvolvedScreen.310.pcf: line 43, column 76
    function value_15 () : java.lang.String {
      return util.Snapshot.getPrimaryPhone(ClaimContact.Contact)
    }
    
    // 'value' attribute on TextCell (id=Address_Cell) at ClaimSnapshotPartiesInvolvedScreen.310.pcf: line 48, column 44
    function value_17 () : dynamic.Dynamic {
      return ClaimContact.Contact.PrimaryAddress.AddressLine1
    }
    
    // 'value' attribute on TextCell (id=City_Cell) at ClaimSnapshotPartiesInvolvedScreen.310.pcf: line 53, column 44
    function value_20 () : dynamic.Dynamic {
      return ClaimContact.Contact.PrimaryAddress.City
    }
    
    // 'value' attribute on TextCell (id=State_Cell) at ClaimSnapshotPartiesInvolvedScreen.310.pcf: line 58, column 44
    function value_23 () : dynamic.Dynamic {
      return ClaimContact.Contact.PrimaryAddress.State
    }
    
    // 'value' attribute on TextCell (id=ZipCode_Cell) at ClaimSnapshotPartiesInvolvedScreen.310.pcf: line 63, column 44
    function value_26 () : dynamic.Dynamic {
      return ClaimContact.Contact.PrimaryAddress.PostalCode
    }
    
    // 'value' attribute on TextCell (id=Name_Cell) at ClaimSnapshotPartiesInvolvedScreen.310.pcf: line 30, column 44
    function value_8 () : dynamic.Dynamic {
      return ClaimContact.Contact.DisplayName
    }
    
    property get ClaimContact () : dynamic.Dynamic {
      return getIteratedValue(2) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotPartiesInvolvedScreen.310.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends ClaimSnapshotPartiesInvolvedScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPartiesInvolvedScreen.310.pcf: line 73, column 78
    function def_onEnter_30 (def :  pcf.ClaimSnapshotContact310DV_company) : void {
      def.onEnter(SelectedClaimContact)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPartiesInvolvedScreen.310.pcf: line 73, column 78
    function def_onEnter_32 (def :  pcf.ClaimSnapshotContact310DV_contact) : void {
      def.onEnter(SelectedClaimContact)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPartiesInvolvedScreen.310.pcf: line 73, column 78
    function def_onEnter_34 (def :  pcf.ClaimSnapshotContact310DV_person) : void {
      def.onEnter(SelectedClaimContact)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPartiesInvolvedScreen.310.pcf: line 73, column 78
    function def_refreshVariables_31 (def :  pcf.ClaimSnapshotContact310DV_company) : void {
      def.refreshVariables(SelectedClaimContact)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPartiesInvolvedScreen.310.pcf: line 73, column 78
    function def_refreshVariables_33 (def :  pcf.ClaimSnapshotContact310DV_contact) : void {
      def.refreshVariables(SelectedClaimContact)
    }
    
    // 'def' attribute on PanelRef at ClaimSnapshotPartiesInvolvedScreen.310.pcf: line 73, column 78
    function def_refreshVariables_35 (def :  pcf.ClaimSnapshotContact310DV_person) : void {
      def.refreshVariables(SelectedClaimContact)
    }
    
    // 'mode' attribute on PanelRef at ClaimSnapshotPartiesInvolvedScreen.310.pcf: line 73, column 78
    function mode_36 () : java.lang.Object {
      return util.Snapshot.getEntityType(SelectedClaimContact.Contact)
    }
    
    // 'value' attribute on TextCell (id=Name_Cell) at ClaimSnapshotPartiesInvolvedScreen.310.pcf: line 30, column 44
    function sortValue_0 (ClaimContact :  dynamic.Dynamic) : java.lang.Object {
      return ClaimContact.Contact.DisplayName
    }
    
    // 'value' attribute on TextCell (id=Roles_Cell) at ClaimSnapshotPartiesInvolvedScreen.310.pcf: line 34, column 82
    function sortValue_1 (ClaimContact :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.getDistinctContactRoles(ClaimContact.Roles)
    }
    
    // 'value' attribute on TextCell (id=Prohibited_Cell) at ClaimSnapshotPartiesInvolvedScreen.310.pcf: line 38, column 82
    function sortValue_2 (ClaimContact :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(ClaimContact.ContactProhibited)
    }
    
    // 'value' attribute on TextCell (id=Phone_Cell) at ClaimSnapshotPartiesInvolvedScreen.310.pcf: line 43, column 76
    function sortValue_3 (ClaimContact :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.getPrimaryPhone(ClaimContact.Contact)
    }
    
    // 'value' attribute on TextCell (id=Address_Cell) at ClaimSnapshotPartiesInvolvedScreen.310.pcf: line 48, column 44
    function sortValue_4 (ClaimContact :  dynamic.Dynamic) : java.lang.Object {
      return ClaimContact.Contact.PrimaryAddress.AddressLine1
    }
    
    // 'value' attribute on TextCell (id=City_Cell) at ClaimSnapshotPartiesInvolvedScreen.310.pcf: line 53, column 44
    function sortValue_5 (ClaimContact :  dynamic.Dynamic) : java.lang.Object {
      return ClaimContact.Contact.PrimaryAddress.City
    }
    
    // 'value' attribute on TextCell (id=State_Cell) at ClaimSnapshotPartiesInvolvedScreen.310.pcf: line 58, column 44
    function sortValue_6 (ClaimContact :  dynamic.Dynamic) : java.lang.Object {
      return ClaimContact.Contact.PrimaryAddress.State
    }
    
    // 'value' attribute on TextCell (id=ZipCode_Cell) at ClaimSnapshotPartiesInvolvedScreen.310.pcf: line 63, column 44
    function sortValue_7 (ClaimContact :  dynamic.Dynamic) : java.lang.Object {
      return ClaimContact.Contact.PrimaryAddress.PostalCode
    }
    
    // 'title' attribute on Card (id=ClaimSnapshotPartiesInvolvedCard) at ClaimSnapshotPartiesInvolvedScreen.310.pcf: line 70, column 70
    function title_37 () : java.lang.String {
      return SelectedClaimContact.Contact.DisplayName as String
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotPartiesInvolvedScreen.310.pcf: line 24, column 39
    function value_29 () : dynamic.Dynamic {
      return SnapshotParam.Contacts
    }
    
    property get SelectedClaimContact () : dynamic.Dynamic {
      return getCurrentSelection(1) as dynamic.Dynamic
    }
    
    property set SelectedClaimContact ($arg :  dynamic.Dynamic) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  
}