package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/addressbook/AddressBookAdditionalInfoInputSet.UserContact.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookAdditionalInfoInputSet_UserContactExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/addressbook/AddressBookAdditionalInfoInputSet.UserContact.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookAdditionalInfoInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=EmployeeNumber_Input) at AddressBookAdditionalInfoInputSet.UserContact.pcf: line 22, column 56
    function defaultSetter_1 (__VALUE_TO_SET :  java.lang.Object) : void {
      (Contact as UserContact).EmployeeNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency_Input) at AddressBookAdditionalInfoInputSet.UserContact.pcf: line 29, column 65
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      Contact.PreferredCurrency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on TextInput (id=EmployeeNumber_Input) at AddressBookAdditionalInfoInputSet.UserContact.pcf: line 22, column 56
    function valueRoot_2 () : java.lang.Object {
      return (Contact as UserContact)
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency_Input) at AddressBookAdditionalInfoInputSet.UserContact.pcf: line 29, column 65
    function valueRoot_7 () : java.lang.Object {
      return Contact
    }
    
    // 'value' attribute on TextInput (id=EmployeeNumber_Input) at AddressBookAdditionalInfoInputSet.UserContact.pcf: line 22, column 56
    function value_0 () : java.lang.String {
      return (Contact as UserContact).EmployeeNumber
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency_Input) at AddressBookAdditionalInfoInputSet.UserContact.pcf: line 29, column 65
    function value_5 () : typekey.Currency {
      return Contact.PreferredCurrency
    }
    
    // 'visible' attribute on TypeKeyInput (id=Currency_Input) at AddressBookAdditionalInfoInputSet.UserContact.pcf: line 29, column 65
    function visible_4 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode()
    }
    
    property get Contact () : Person {
      return getRequireValue("Contact", 0) as Person
    }
    
    property set Contact ($arg :  Person) {
      setRequireValue("Contact", 0, $arg)
    }
    
    property get allowEditContact () : boolean {
      return getRequireValue("allowEditContact", 0) as java.lang.Boolean
    }
    
    property set allowEditContact ($arg :  boolean) {
      setRequireValue("allowEditContact", 0, $arg)
    }
    
    property get externalContactSource () : gw.api.contact.ExternalContactSource {
      return getRequireValue("externalContactSource", 0) as gw.api.contact.ExternalContactSource
    }
    
    property set externalContactSource ($arg :  gw.api.contact.ExternalContactSource) {
      setRequireValue("externalContactSource", 0, $arg)
    }
    
    
  }
  
  
}