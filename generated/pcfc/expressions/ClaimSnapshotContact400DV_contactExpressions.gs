package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotContact400DV.contact.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotContact400DV_contactExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotContact400DV.contact.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotContact400DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'encryptionExpression' attribute on PrivacyInput (id=TaxID_Input) at ClaimSnapshotContact400DV.contact.pcf: line 136, column 38
    function encryptionExpression_56 (VALUE :  dynamic.Dynamic) : java.lang.String {
      return gw.api.privacy.EncryptionMaskExpressions.maskTaxId(VALUE as String)
    }
    
    // 'value' attribute on TextCell (id=Role_Cell) at ClaimSnapshotContact400DV.contact.pcf: line 29, column 46
    function sortValue_0 (Role :  dynamic.Dynamic) : java.lang.Object {
      return Role.Role
    }
    
    // 'value' attribute on TextCell (id=Owner_Cell) at ClaimSnapshotContact400DV.contact.pcf: line 33, column 59
    function sortValue_1 (Role :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.getRoleOwner(Role)
    }
    
    // 'value' attribute on TextCell (id=Active_Cell) at ClaimSnapshotContact400DV.contact.pcf: line 37, column 65
    function sortValue_2 (Role :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(Role.Active)
    }
    
    // 'value' attribute on TextCell (id=Comments_Cell) at ClaimSnapshotContact400DV.contact.pcf: line 42, column 46
    function sortValue_3 (Role :  dynamic.Dynamic) : java.lang.Object {
      return Role.Comments
    }
    
    // 'value' attribute on TextInput (id=contact_Input) at ClaimSnapshotContact400DV.contact.pcf: line 56, column 38
    function valueRoot_16 () : java.lang.Object {
      return asClaimContact().Contact
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress_Input) at ClaimSnapshotContact400DV.contact.pcf: line 102, column 38
    function valueRoot_37 () : java.lang.Object {
      return asClaimContact().Contact.PrimaryAddress
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotContact400DV.contact.pcf: line 23, column 41
    function value_14 () : dynamic.Dynamic {
      return asClaimContact().Roles
    }
    
    // 'value' attribute on TextInput (id=contact_Input) at ClaimSnapshotContact400DV.contact.pcf: line 56, column 38
    function value_15 () : dynamic.Dynamic {
      return asClaimContact().Contact.DisplayName
    }
    
    // 'value' attribute on TextInput (id=PrimaryPhone_Input) at ClaimSnapshotContact400DV.contact.pcf: line 64, column 38
    function value_18 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryPhone
    }
    
    // 'value' attribute on TextInput (id=WorkPhone_Input) at ClaimSnapshotContact400DV.contact.pcf: line 69, column 38
    function value_21 () : dynamic.Dynamic {
      return asClaimContact().Contact.WorkPhone
    }
    
    // 'value' attribute on TextInput (id=HomePhone_Input) at ClaimSnapshotContact400DV.contact.pcf: line 74, column 38
    function value_24 () : dynamic.Dynamic {
      return asClaimContact().Contact.HomePhone
    }
    
    // 'value' attribute on TextInput (id=FaxPhone_Input) at ClaimSnapshotContact400DV.contact.pcf: line 79, column 38
    function value_27 () : dynamic.Dynamic {
      return asClaimContact().Contact.FaxPhone
    }
    
    // 'value' attribute on TextInput (id=EmailAddress1_Input) at ClaimSnapshotContact400DV.contact.pcf: line 87, column 38
    function value_30 () : dynamic.Dynamic {
      return asClaimContact().Contact.EmailAddress1
    }
    
    // 'value' attribute on TextInput (id=EmailAddress2_Input) at ClaimSnapshotContact400DV.contact.pcf: line 92, column 38
    function value_33 () : dynamic.Dynamic {
      return asClaimContact().Contact.EmailAddress2
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress_Input) at ClaimSnapshotContact400DV.contact.pcf: line 102, column 38
    function value_36 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryAddress.DisplayName
    }
    
    // 'value' attribute on TextInput (id=County_Input) at ClaimSnapshotContact400DV.contact.pcf: line 107, column 38
    function value_39 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryAddress.County
    }
    
    // 'value' attribute on TextInput (id=Country_Input) at ClaimSnapshotContact400DV.contact.pcf: line 112, column 38
    function value_42 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryAddress.Country
    }
    
    // 'value' attribute on TextInput (id=AddressType_Input) at ClaimSnapshotContact400DV.contact.pcf: line 117, column 38
    function value_45 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryAddress.AddressType
    }
    
    // 'value' attribute on TextInput (id=Description_Input) at ClaimSnapshotContact400DV.contact.pcf: line 122, column 38
    function value_48 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryAddress.Description
    }
    
    // 'value' attribute on TextInput (id=ValidUntil_Input) at ClaimSnapshotContact400DV.contact.pcf: line 127, column 38
    function value_51 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryAddress.ValidUntil
    }
    
    // 'value' attribute on PrivacyInput (id=TaxID_Input) at ClaimSnapshotContact400DV.contact.pcf: line 136, column 38
    function value_54 () : dynamic.Dynamic {
      return asClaimContact().Contact.TaxID
    }
    
    // 'value' attribute on TextAreaInput (id=Notes_Input) at ClaimSnapshotContact400DV.contact.pcf: line 144, column 38
    function value_58 () : dynamic.Dynamic {
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
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotContact400DV.contact.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotContact400DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Role_Cell) at ClaimSnapshotContact400DV.contact.pcf: line 29, column 46
    function valueRoot_5 () : java.lang.Object {
      return Role
    }
    
    // 'value' attribute on TextCell (id=Comments_Cell) at ClaimSnapshotContact400DV.contact.pcf: line 42, column 46
    function value_11 () : dynamic.Dynamic {
      return Role.Comments
    }
    
    // 'value' attribute on TextCell (id=Role_Cell) at ClaimSnapshotContact400DV.contact.pcf: line 29, column 46
    function value_4 () : dynamic.Dynamic {
      return Role.Role
    }
    
    // 'value' attribute on TextCell (id=Owner_Cell) at ClaimSnapshotContact400DV.contact.pcf: line 33, column 59
    function value_7 () : java.lang.String {
      return util.Snapshot.getRoleOwner(Role)
    }
    
    // 'value' attribute on TextCell (id=Active_Cell) at ClaimSnapshotContact400DV.contact.pcf: line 37, column 65
    function value_9 () : java.lang.String {
      return util.Snapshot.renderValue(Role.Active)
    }
    
    property get Role () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}