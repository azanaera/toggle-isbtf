package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/addressbook/AddressBookDriversLicenseInfoInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookDriversLicenseInfoInputSetExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/addressbook/AddressBookDriversLicenseInfoInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookDriversLicenseInfoInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=LicenseNumber_Input) at AddressBookDriversLicenseInfoInputSet.pcf: line 17, column 37
    function defaultSetter_1 (__VALUE_TO_SET :  java.lang.Object) : void {
      person.LicenseNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=LicenseState_Input) at AddressBookDriversLicenseInfoInputSet.pcf: line 24, column 41
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      person.LicenseState = (__VALUE_TO_SET as typekey.Jurisdiction)
    }
    
    // 'filter' attribute on TypeKeyInput (id=LicenseState_Input) at AddressBookDriversLicenseInfoInputSet.pcf: line 24, column 41
    function filter_7 (VALUE :  typekey.Jurisdiction, VALUES :  typekey.Jurisdiction[]) : java.lang.Boolean {
      return VALUE.hasCategory(JurisdictionType.TC_DRIVING_LIC)
    }
    
    // 'value' attribute on TextInput (id=LicenseNumber_Input) at AddressBookDriversLicenseInfoInputSet.pcf: line 17, column 37
    function valueRoot_2 () : java.lang.Object {
      return person
    }
    
    // 'value' attribute on TextInput (id=LicenseNumber_Input) at AddressBookDriversLicenseInfoInputSet.pcf: line 17, column 37
    function value_0 () : java.lang.String {
      return person.LicenseNumber
    }
    
    // 'value' attribute on TypeKeyInput (id=LicenseState_Input) at AddressBookDriversLicenseInfoInputSet.pcf: line 24, column 41
    function value_4 () : typekey.Jurisdiction {
      return person.LicenseState
    }
    
    property get person () : Person {
      return getRequireValue("person", 0) as Person
    }
    
    property set person ($arg :  Person) {
      setRequireValue("person", 0, $arg)
    }
    
    
  }
  
  
}