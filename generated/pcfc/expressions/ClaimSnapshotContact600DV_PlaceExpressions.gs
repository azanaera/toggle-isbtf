package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotContact600DV.place.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotContact600DV_PlaceExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotContact600DV.place.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotContact600DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Role_Cell) at ClaimSnapshotContact600DV.place.pcf: line 29, column 46
    function sortValue_0 (Role :  dynamic.Dynamic) : java.lang.Object {
      return Role.Role
    }
    
    // 'value' attribute on TextCell (id=Owner_Cell) at ClaimSnapshotContact600DV.place.pcf: line 33, column 59
    function sortValue_1 (Role :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.getRoleOwner(Role)
    }
    
    // 'value' attribute on TextCell (id=Active_Cell) at ClaimSnapshotContact600DV.place.pcf: line 37, column 65
    function sortValue_2 (Role :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(Role.Active)
    }
    
    // 'value' attribute on TextCell (id=Comments_Cell) at ClaimSnapshotContact600DV.place.pcf: line 42, column 46
    function sortValue_3 (Role :  dynamic.Dynamic) : java.lang.Object {
      return Role.Comments
    }
    
    // 'value' attribute on TextInput (id=contact_Input) at ClaimSnapshotContact600DV.place.pcf: line 56, column 38
    function valueRoot_16 () : java.lang.Object {
      return asClaimContact().Contact
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress_Input) at ClaimSnapshotContact600DV.place.pcf: line 106, column 38
    function valueRoot_39 () : java.lang.Object {
      return asClaimContact().Contact.PrimaryAddress
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotContact600DV.place.pcf: line 23, column 41
    function value_14 () : dynamic.Dynamic {
      return asClaimContact().Roles
    }
    
    // 'value' attribute on TextInput (id=contact_Input) at ClaimSnapshotContact600DV.place.pcf: line 56, column 38
    function value_15 () : dynamic.Dynamic {
      return asClaimContact().Contact.DisplayName
    }
    
    // 'value' attribute on TextInput (id=PrimaryContact_Input) at ClaimSnapshotContact600DV.place.pcf: line 63, column 85
    function value_18 () : java.lang.String {
      return util.Snapshot.renderValue(asClaimContact().Contact.PrimaryContact)
    }
    
    // 'value' attribute on TextInput (id=PrimaryPhone_Input) at ClaimSnapshotContact600DV.place.pcf: line 68, column 38
    function value_20 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryPhone
    }
    
    // 'value' attribute on TextInput (id=WorkPhone_Input) at ClaimSnapshotContact600DV.place.pcf: line 73, column 38
    function value_23 () : dynamic.Dynamic {
      return asClaimContact().Contact.WorkPhone
    }
    
    // 'value' attribute on TextInput (id=HomePhone_Input) at ClaimSnapshotContact600DV.place.pcf: line 78, column 38
    function value_26 () : dynamic.Dynamic {
      return asClaimContact().Contact.HomePhone
    }
    
    // 'value' attribute on TextInput (id=FaxPhone_Input) at ClaimSnapshotContact600DV.place.pcf: line 83, column 38
    function value_29 () : dynamic.Dynamic {
      return asClaimContact().Contact.FaxPhone
    }
    
    // 'value' attribute on TextInput (id=EmailAddress1_Input) at ClaimSnapshotContact600DV.place.pcf: line 91, column 38
    function value_32 () : dynamic.Dynamic {
      return asClaimContact().Contact.EmailAddress1
    }
    
    // 'value' attribute on TextInput (id=EmailAddress2_Input) at ClaimSnapshotContact600DV.place.pcf: line 96, column 38
    function value_35 () : dynamic.Dynamic {
      return asClaimContact().Contact.EmailAddress2
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress_Input) at ClaimSnapshotContact600DV.place.pcf: line 106, column 38
    function value_38 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryAddress.DisplayName
    }
    
    // 'value' attribute on TextInput (id=County_Input) at ClaimSnapshotContact600DV.place.pcf: line 111, column 38
    function value_41 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryAddress.County
    }
    
    // 'value' attribute on TextInput (id=Country_Input) at ClaimSnapshotContact600DV.place.pcf: line 116, column 38
    function value_44 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryAddress.Country
    }
    
    // 'value' attribute on TextInput (id=AddressType_Input) at ClaimSnapshotContact600DV.place.pcf: line 121, column 38
    function value_47 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryAddress.AddressType
    }
    
    // 'value' attribute on TextInput (id=Description_Input) at ClaimSnapshotContact600DV.place.pcf: line 126, column 38
    function value_50 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryAddress.Description
    }
    
    // 'value' attribute on TextInput (id=ValidUntil_Input) at ClaimSnapshotContact600DV.place.pcf: line 131, column 38
    function value_53 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryAddress.ValidUntil
    }
    
    // 'value' attribute on TextInput (id=PreferredCurrency_Input) at ClaimSnapshotContact600DV.place.pcf: line 139, column 38
    function value_56 () : dynamic.Dynamic {
      return asClaimContact().Contact.PreferredCurrency
    }
    
    // 'value' attribute on TextAreaInput (id=Notes_Input) at ClaimSnapshotContact600DV.place.pcf: line 147, column 38
    function value_59 () : dynamic.Dynamic {
      return asClaimContact().Contact.Notes
    }
    
    property get ClaimContactParam () : dynamic.Dynamic {
      return getRequireValue("ClaimContactParam", 0) as dynamic.Dynamic
    }
    
    property set ClaimContactParam ($arg :  dynamic.Dynamic) {
      setRequireValue("ClaimContactParam", 0, $arg)
    }
    
    
          function asClaimContact() : dynamic.Dynamic {
            return ClaimContactParam;
          }
        
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/600/ClaimSnapshotContact600DV.place.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotContact600DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Role_Cell) at ClaimSnapshotContact600DV.place.pcf: line 29, column 46
    function valueRoot_5 () : java.lang.Object {
      return Role
    }
    
    // 'value' attribute on TextCell (id=Comments_Cell) at ClaimSnapshotContact600DV.place.pcf: line 42, column 46
    function value_11 () : dynamic.Dynamic {
      return Role.Comments
    }
    
    // 'value' attribute on TextCell (id=Role_Cell) at ClaimSnapshotContact600DV.place.pcf: line 29, column 46
    function value_4 () : dynamic.Dynamic {
      return Role.Role
    }
    
    // 'value' attribute on TextCell (id=Owner_Cell) at ClaimSnapshotContact600DV.place.pcf: line 33, column 59
    function value_7 () : java.lang.String {
      return util.Snapshot.getRoleOwner(Role)
    }
    
    // 'value' attribute on TextCell (id=Active_Cell) at ClaimSnapshotContact600DV.place.pcf: line 37, column 65
    function value_9 () : java.lang.String {
      return util.Snapshot.renderValue(Role.Active)
    }
    
    property get Role () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}