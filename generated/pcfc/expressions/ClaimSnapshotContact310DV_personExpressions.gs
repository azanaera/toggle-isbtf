package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotContact310DV.person.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotContact310DV_personExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotContact310DV.person.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotContact310DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'encryptionExpression' attribute on PrivacyInput (id=TaxID_Input) at ClaimSnapshotContact310DV.person.pcf: line 159, column 38
    function encryptionExpression_68 (VALUE :  dynamic.Dynamic) : java.lang.String {
      return gw.api.privacy.EncryptionMaskExpressions.maskTaxId(VALUE as String)
    }
    
    // 'value' attribute on TextCell (id=Role_Cell) at ClaimSnapshotContact310DV.person.pcf: line 29, column 46
    function sortValue_0 (Role :  dynamic.Dynamic) : java.lang.Object {
      return Role.Role
    }
    
    // 'value' attribute on TextCell (id=Owner_Cell) at ClaimSnapshotContact310DV.person.pcf: line 33, column 59
    function sortValue_1 (Role :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.getRoleOwner(Role)
    }
    
    // 'value' attribute on TextCell (id=Active_Cell) at ClaimSnapshotContact310DV.person.pcf: line 37, column 65
    function sortValue_2 (Role :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(Role.Active)
    }
    
    // 'value' attribute on TextCell (id=Comments_Cell) at ClaimSnapshotContact310DV.person.pcf: line 42, column 46
    function sortValue_3 (Role :  dynamic.Dynamic) : java.lang.Object {
      return Role.Comments
    }
    
    // 'value' attribute on TextInput (id=Contact_Input) at ClaimSnapshotContact310DV.person.pcf: line 56, column 38
    function valueRoot_16 () : java.lang.Object {
      return asClaimContact().Contact
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress_Input) at ClaimSnapshotContact310DV.person.pcf: line 112, column 38
    function valueRoot_43 () : java.lang.Object {
      return asClaimContact().Contact.PrimaryAddress
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotContact310DV.person.pcf: line 23, column 41
    function value_14 () : dynamic.Dynamic {
      return asClaimContact().Roles
    }
    
    // 'value' attribute on TextInput (id=Contact_Input) at ClaimSnapshotContact310DV.person.pcf: line 56, column 38
    function value_15 () : dynamic.Dynamic {
      return asClaimContact().Contact.DisplayName
    }
    
    // 'value' attribute on TextInput (id=FormerName_Input) at ClaimSnapshotContact310DV.person.pcf: line 61, column 38
    function value_18 () : dynamic.Dynamic {
      return asClaimContact().Contact.FormerName
    }
    
    // 'value' attribute on TextInput (id=PrimaryPhone_Input) at ClaimSnapshotContact310DV.person.pcf: line 69, column 38
    function value_21 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryPhone
    }
    
    // 'value' attribute on TextInput (id=WorkPhone_Input) at ClaimSnapshotContact310DV.person.pcf: line 74, column 38
    function value_24 () : dynamic.Dynamic {
      return asClaimContact().Contact.WorkPhone
    }
    
    // 'value' attribute on TextInput (id=HomePhone_Input) at ClaimSnapshotContact310DV.person.pcf: line 79, column 38
    function value_27 () : dynamic.Dynamic {
      return asClaimContact().Contact.HomePhone
    }
    
    // 'value' attribute on TextInput (id=CellPhone_Input) at ClaimSnapshotContact310DV.person.pcf: line 84, column 38
    function value_30 () : dynamic.Dynamic {
      return asClaimContact().Contact.CellPhone
    }
    
    // 'value' attribute on TextInput (id=FaxPhone_Input) at ClaimSnapshotContact310DV.person.pcf: line 89, column 38
    function value_33 () : dynamic.Dynamic {
      return asClaimContact().Contact.FaxPhone
    }
    
    // 'value' attribute on TextInput (id=EmailAddress1_Input) at ClaimSnapshotContact310DV.person.pcf: line 97, column 38
    function value_36 () : dynamic.Dynamic {
      return asClaimContact().Contact.EmailAddress1
    }
    
    // 'value' attribute on TextInput (id=EmailAddress2_Input) at ClaimSnapshotContact310DV.person.pcf: line 102, column 38
    function value_39 () : dynamic.Dynamic {
      return asClaimContact().Contact.EmailAddress2
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress_Input) at ClaimSnapshotContact310DV.person.pcf: line 112, column 38
    function value_42 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryAddress.DisplayName
    }
    
    // 'value' attribute on TextInput (id=County_Input) at ClaimSnapshotContact310DV.person.pcf: line 117, column 38
    function value_45 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryAddress.County
    }
    
    // 'value' attribute on TextInput (id=Country_Input) at ClaimSnapshotContact310DV.person.pcf: line 122, column 38
    function value_48 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryAddress.Country
    }
    
    // 'value' attribute on TextInput (id=AddressType_Input) at ClaimSnapshotContact310DV.person.pcf: line 127, column 38
    function value_51 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryAddress.AddressType
    }
    
    // 'value' attribute on TextInput (id=Description_Input) at ClaimSnapshotContact310DV.person.pcf: line 132, column 38
    function value_54 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryAddress.Description
    }
    
    // 'value' attribute on TextInput (id=ValidUntil_Input) at ClaimSnapshotContact310DV.person.pcf: line 137, column 38
    function value_57 () : dynamic.Dynamic {
      return asClaimContact().Contact.PrimaryAddress.ValidUntil
    }
    
    // 'value' attribute on TextInput (id=Occupation_Input) at ClaimSnapshotContact310DV.person.pcf: line 145, column 38
    function value_60 () : dynamic.Dynamic {
      return asClaimContact().Contact.Occupation
    }
    
    // 'value' attribute on TextInput (id=Employer_Input) at ClaimSnapshotContact310DV.person.pcf: line 150, column 38
    function value_63 () : dynamic.Dynamic {
      return asClaimContact().Contact.Employer
    }
    
    // 'value' attribute on PrivacyInput (id=TaxID_Input) at ClaimSnapshotContact310DV.person.pcf: line 159, column 38
    function value_66 () : dynamic.Dynamic {
      return asClaimContact().Contact.TaxID
    }
    
    // 'value' attribute on TextInput (id=TaxFilingStatus_Input) at ClaimSnapshotContact310DV.person.pcf: line 164, column 38
    function value_70 () : dynamic.Dynamic {
      return asClaimContact().Contact.TaxFilingStatus
    }
    
    // 'value' attribute on TextInput (id=DateOfBirth_Input) at ClaimSnapshotContact310DV.person.pcf: line 169, column 38
    function value_73 () : dynamic.Dynamic {
      return asClaimContact().Contact.DateOfBirth
    }
    
    // 'value' attribute on TextInput (id=Guardian_Input) at ClaimSnapshotContact310DV.person.pcf: line 174, column 38
    function value_76 () : dynamic.Dynamic {
      return asClaimContact().Contact.Guardian
    }
    
    // 'value' attribute on TextInput (id=Gender_Input) at ClaimSnapshotContact310DV.person.pcf: line 179, column 38
    function value_79 () : dynamic.Dynamic {
      return asClaimContact().Contact.Gender
    }
    
    // 'value' attribute on TextInput (id=MaritalStatus_Input) at ClaimSnapshotContact310DV.person.pcf: line 184, column 38
    function value_82 () : dynamic.Dynamic {
      return asClaimContact().Contact.MaritalStatus
    }
    
    // 'value' attribute on TextInput (id=LicenseNumber_Input) at ClaimSnapshotContact310DV.person.pcf: line 192, column 38
    function value_85 () : dynamic.Dynamic {
      return asClaimContact().Contact.LicenseNumber
    }
    
    // 'value' attribute on TextInput (id=LicenseState_Input) at ClaimSnapshotContact310DV.person.pcf: line 197, column 38
    function value_88 () : dynamic.Dynamic {
      return asClaimContact().Contact.LicenseState
    }
    
    // 'value' attribute on TextAreaInput (id=Notes_Input) at ClaimSnapshotContact310DV.person.pcf: line 205, column 38
    function value_91 () : dynamic.Dynamic {
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
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotContact310DV.person.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotContact310DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Role_Cell) at ClaimSnapshotContact310DV.person.pcf: line 29, column 46
    function valueRoot_5 () : java.lang.Object {
      return Role
    }
    
    // 'value' attribute on TextCell (id=Comments_Cell) at ClaimSnapshotContact310DV.person.pcf: line 42, column 46
    function value_11 () : dynamic.Dynamic {
      return Role.Comments
    }
    
    // 'value' attribute on TextCell (id=Role_Cell) at ClaimSnapshotContact310DV.person.pcf: line 29, column 46
    function value_4 () : dynamic.Dynamic {
      return Role.Role
    }
    
    // 'value' attribute on TextCell (id=Owner_Cell) at ClaimSnapshotContact310DV.person.pcf: line 33, column 59
    function value_7 () : java.lang.String {
      return util.Snapshot.getRoleOwner(Role)
    }
    
    // 'value' attribute on TextCell (id=Active_Cell) at ClaimSnapshotContact310DV.person.pcf: line 37, column 65
    function value_9 () : java.lang.String {
      return util.Snapshot.renderValue(Role.Active)
    }
    
    property get Role () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}