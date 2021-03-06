package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/addressbook/AddressBookAdditionalInfoInputSet.PersonVendor.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookAdditionalInfoInputSet_PersonVendorExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/addressbook/AddressBookAdditionalInfoInputSet.PersonVendor.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookAdditionalInfoInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 19, column 65
    function def_onEnter_0 (def :  pcf.AddressBookDoctorAdditionalInfoInputSet_Doctor) : void {
      def.onEnter(contact as PersonVendor)
    }
    
    // 'def' attribute on InputSetRef at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 45, column 120
    function def_onEnter_24 (def :  pcf.AddressBookBusinessContactInfoInputSet) : void {
      def.onEnter((contact as PersonVendor), externalContactSource,allowEditContact)
    }
    
    // 'def' attribute on InputSetRef at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 22, column 69
    function def_onEnter_3 (def :  pcf.AddressBookAttorneyAdditionalInfoInputSet_Attorney) : void {
      def.onEnter(contact as PersonVendor)
    }
    
    // 'def' attribute on InputSetRef at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 58, column 82
    function def_onEnter_32 (def :  pcf.AddressBookVendorW9InfoInputSet) : void {
      def.onEnter((contact as PersonVendor))
    }
    
    // 'def' attribute on InputSetRef at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 19, column 65
    function def_refreshVariables_1 (def :  pcf.AddressBookDoctorAdditionalInfoInputSet_Doctor) : void {
      def.refreshVariables(contact as PersonVendor)
    }
    
    // 'def' attribute on InputSetRef at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 45, column 120
    function def_refreshVariables_25 (def :  pcf.AddressBookBusinessContactInfoInputSet) : void {
      def.refreshVariables((contact as PersonVendor), externalContactSource,allowEditContact)
    }
    
    // 'def' attribute on InputSetRef at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 58, column 82
    function def_refreshVariables_33 (def :  pcf.AddressBookVendorW9InfoInputSet) : void {
      def.refreshVariables((contact as PersonVendor))
    }
    
    // 'def' attribute on InputSetRef at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 22, column 69
    function def_refreshVariables_4 (def :  pcf.AddressBookAttorneyAdditionalInfoInputSet_Attorney) : void {
      def.refreshVariables(contact as PersonVendor)
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency_Input) at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 43, column 65
    function defaultSetter_20 (__VALUE_TO_SET :  java.lang.Object) : void {
      contact.PreferredCurrency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on PrivacyInput (id=SSN_Input) at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 55, column 48
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      (contact as PersonVendor).TaxID = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsPreferredVendor_Input) at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 27, column 52
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      (contact as PersonVendor).Preferred = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'editable' attribute on BooleanRadioInput (id=IsPreferredVendor_Input) at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 27, column 52
    function editable_6 () : java.lang.Boolean {
      return perm.Contact.createpreferredab
    }
    
    // 'encryptionExpression' attribute on PrivacyInput (id=SSN_Input) at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 55, column 48
    function encryptionExpression_29 (VALUE :  java.lang.String) : java.lang.String {
      return contact.maskTaxId(VALUE)
    }
    
    // 'mode' attribute on InputSetRef at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 19, column 65
    function mode_2 () : java.lang.Object {
      return contact typeis Doctor ? "Doctor" : null
    }
    
    // 'mode' attribute on InputSetRef at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 22, column 69
    function mode_5 () : java.lang.Object {
      return contact typeis Attorney ? "Attorney" : null
    }
    
    // 'value' attribute on TypeKeyInput (id=IsVendorAvailable_Ext_Input) at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 36, column 55
    function valueRoot_16 () : java.lang.Object {
      return contact
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsPreferredVendor_Input) at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 27, column 52
    function valueRoot_9 () : java.lang.Object {
      return (contact as PersonVendor)
    }
    
    // 'value' attribute on TextInput (id=VendorID_Ext_Input) at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 31, column 55
    function value_12 () : java.lang.String {
      return (contact as PersonVendor).VendorNumber
    }
    
    // 'value' attribute on TypeKeyInput (id=IsVendorAvailable_Ext_Input) at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 36, column 55
    function value_15 () : typekey.VendorAvailabilityType_Ext {
      return contact.VendorAvailability_Ext
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency_Input) at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 43, column 65
    function value_19 () : typekey.Currency {
      return contact.PreferredCurrency
    }
    
    // 'value' attribute on PrivacyInput (id=SSN_Input) at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 55, column 48
    function value_26 () : java.lang.String {
      return (contact as PersonVendor).TaxID
    }
    
    // 'value' attribute on BooleanRadioInput (id=Backupwithholding_Ext_Input) at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 63, column 64
    function value_34 () : java.lang.Boolean {
      return (contact as PersonVendor).Backupwithholding_Ext
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsPreferredVendor_Input) at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 27, column 52
    function value_7 () : java.lang.Boolean {
      return (contact as PersonVendor).Preferred
    }
    
    // 'visible' attribute on TypeKeyInput (id=Currency_Input) at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 43, column 65
    function visible_18 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode()
    }
    
    // 'visible' attribute on InputSetRef at AddressBookAdditionalInfoInputSet.PersonVendor.pcf: line 58, column 82
    function visible_31 () : java.lang.Boolean {
      return gw.api.admin.BaseAdminUtil.getDefaultCountry() == Country.TC_US
    }
    
    property get allowEditContact () : boolean {
      return getRequireValue("allowEditContact", 0) as java.lang.Boolean
    }
    
    property set allowEditContact ($arg :  boolean) {
      setRequireValue("allowEditContact", 0, $arg)
    }
    
    property get contact () : Person {
      return getRequireValue("contact", 0) as Person
    }
    
    property set contact ($arg :  Person) {
      setRequireValue("contact", 0, $arg)
    }
    
    property get externalContactSource () : gw.api.contact.ExternalContactSource {
      return getRequireValue("externalContactSource", 0) as gw.api.contact.ExternalContactSource
    }
    
    property set externalContactSource ($arg :  gw.api.contact.ExternalContactSource) {
      setRequireValue("externalContactSource", 0, $arg)
    }
    
    
  }
  
  
}