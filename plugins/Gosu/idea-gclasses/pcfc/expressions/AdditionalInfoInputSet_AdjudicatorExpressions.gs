package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/shared/contacts/AdditionalInfoInputSet.Adjudicator.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AdditionalInfoInputSet_AdjudicatorExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/shared/contacts/AdditionalInfoInputSet.Adjudicator.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdditionalInfoInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 16, column 225
    function action_23 () : void {
      AddressBookPickerPopup.push(statictypeof (Adjudicator.Employer), claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 18, column 285
    function action_25 () : void {
      if (Adjudicator.Employer != null) { ClaimContactDetailPopup.push(Adjudicator.Employer, claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 12, column 273
    function action_26 () : void {
      ClaimContactDetailPopup.push(Adjudicator.Employer, claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_24 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Adjudicator.Employer), claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_27 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Adjudicator.Employer, claim)
    }
    
    // 'available' attribute on DateInput (id=AdjudicatorValidFrom_Input) at AdditionalInfoInputSet.Adjudicator.pcf: line 66, column 46
    function available_39 () : java.lang.Boolean {
      return claimContact != null
    }
    
    // 'def' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_20 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Adjudicator.Employer), Adjudicator, claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_21 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Adjudicator.Employer), Adjudicator, claim)
    }
    
    // 'value' attribute on TextInput (id=AdjudicatorLicense_Input) at AdditionalInfoInputSet.Adjudicator.pcf: line 32, column 47
    function defaultSetter_1 (__VALUE_TO_SET :  java.lang.Object) : void {
      Adjudicator.AdjudicatorLicense = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency_Input) at AdditionalInfoInputSet.Adjudicator.pcf: line 51, column 65
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      Adjudicator.PreferredCurrency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      Adjudicator.Employer = (__VALUE_TO_SET as entity.Company)
    }
    
    // 'value' attribute on DateInput (id=AdjudicatorValidFrom_Input) at AdditionalInfoInputSet.Adjudicator.pcf: line 66, column 46
    function defaultSetter_41 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimContact.ContactValidFrom = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=AdjudicatorValidTo_Input) at AdditionalInfoInputSet.Adjudicator.pcf: line 72, column 44
    function defaultSetter_47 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimContact.ContactValidTo = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=AdjudicativeDomain_Input) at AdditionalInfoInputSet.Adjudicator.pcf: line 38, column 47
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      Adjudicator.AdjudicativeDomain = (__VALUE_TO_SET as typekey.AdjudicativeDomain)
    }
    
    // 'value' attribute on PrivacyInput (id=TaxID_Input) at AdditionalInfoInputSet.Adjudicator.pcf: line 44, column 34
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      Adjudicator.TaxID = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'encryptionExpression' attribute on PrivacyInput (id=TaxID_Input) at AdditionalInfoInputSet.Adjudicator.pcf: line 44, column 34
    function encryptionExpression_11 (VALUE :  java.lang.String) : java.lang.String {
      return Adjudicator.maskTaxId(VALUE)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 12, column 273
    function onPick_28 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Adjudicator.Employer); var result = eval("Adjudicator.Employer = claim.resolveContact(Adjudicator.Employer) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_32 () : java.lang.Object {
      return claim.RelatedCompanyArray
    }
    
    // 'value' attribute on TextInput (id=AdjudicatorLicense_Input) at AdditionalInfoInputSet.Adjudicator.pcf: line 32, column 47
    function valueRoot_2 () : java.lang.Object {
      return Adjudicator
    }
    
    // 'value' attribute on DateInput (id=AdjudicatorValidFrom_Input) at AdditionalInfoInputSet.Adjudicator.pcf: line 66, column 46
    function valueRoot_42 () : java.lang.Object {
      return claimContact
    }
    
    // 'value' attribute on TextInput (id=AdjudicatorLicense_Input) at AdditionalInfoInputSet.Adjudicator.pcf: line 32, column 47
    function value_0 () : java.lang.String {
      return Adjudicator.AdjudicatorLicense
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency_Input) at AdditionalInfoInputSet.Adjudicator.pcf: line 51, column 65
    function value_14 () : typekey.Currency {
      return Adjudicator.PreferredCurrency
    }
    
    // 'value' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 12, column 273
    function value_29 () : entity.Company {
      return Adjudicator.Employer
    }
    
    // 'value' attribute on TypeKeyInput (id=AdjudicativeDomain_Input) at AdditionalInfoInputSet.Adjudicator.pcf: line 38, column 47
    function value_4 () : typekey.AdjudicativeDomain {
      return Adjudicator.AdjudicativeDomain
    }
    
    // 'value' attribute on DateInput (id=AdjudicatorValidFrom_Input) at AdditionalInfoInputSet.Adjudicator.pcf: line 66, column 46
    function value_40 () : java.util.Date {
      return claimContact.ContactValidFrom
    }
    
    // 'value' attribute on DateInput (id=AdjudicatorValidTo_Input) at AdditionalInfoInputSet.Adjudicator.pcf: line 72, column 44
    function value_46 () : java.util.Date {
      return claimContact.ContactValidTo
    }
    
    // 'value' attribute on PrivacyInput (id=TaxID_Input) at AdditionalInfoInputSet.Adjudicator.pcf: line 44, column 34
    function value_8 () : java.lang.String {
      return Adjudicator.TaxID
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_33 ($$arg :  entity.Company[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_33 ($$arg :  gw.api.database.IQueryBeanResult<entity.Company>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_33 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_34 () : void {
      var __valueRangeArg = claim.RelatedCompanyArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_33(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=Organization_Input) at AdditionalInfoInputSet.Adjudicator.pcf: line 60, column 35
    function verifyValueType_38 () : void {
      var __valueTypeArg : entity.Company
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on TypeKeyInput (id=Currency_Input) at AdditionalInfoInputSet.Adjudicator.pcf: line 51, column 65
    function visible_13 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode()
    }
    
    // 'visible' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 14, column 229
    function visible_19 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 16, column 225
    function visible_22 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Adjudicator.Employer), claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get claimContact () : ClaimContact {
      return getRequireValue("claimContact", 0) as ClaimContact
    }
    
    property set claimContact ($arg :  ClaimContact) {
      setRequireValue("claimContact", 0, $arg)
    }
    
    property get contactHandle () : gw.api.contact.ContactHandle {
      return getRequireValue("contactHandle", 0) as gw.api.contact.ContactHandle
    }
    
    property set contactHandle ($arg :  gw.api.contact.ContactHandle) {
      setRequireValue("contactHandle", 0, $arg)
    }
    
    
    property get Adjudicator() : Adjudicator { return contactHandle.Contact as Adjudicator; }
        
    
    
  }
  
  
}