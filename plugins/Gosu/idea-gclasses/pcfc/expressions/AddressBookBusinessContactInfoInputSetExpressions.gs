package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/addressbook/AddressBookBusinessContactInfoInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookBusinessContactInfoInputSetExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/addressbook/AddressBookBusinessContactInfoInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookBusinessContactInfoInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'actionEnabled' attribute on AddressBookContactInput (id=PrimaryContact_Input) at AddressBookContactWidget.xml: line 10, column 154
    function actionEnabled_10 () : java.lang.Boolean {
      return businessContact.PrimaryContact != null
    }
    
    // 'action' attribute on AddressBookContactInput (id=PrimaryContact_Input) at AddressBookContactWidget.xml: line 12, column 225
    function action_2 () : void {
      AddressBookPickerPopup.push(entity.Person)
    }
    
    // 'action' attribute on AddressBookContactInput (id=PrimaryContact_Input) at AddressBookContactWidget.xml: line 14, column 151
    function action_4 () : void {
      businessContact.PrimaryContact = null
    }
    
    // 'action' attribute on AddressBookContactInput (id=PrimaryContact_Input) at AddressBookContactWidget.xml: line 10, column 154
    function action_5 () : void {
      AddressBookContactDetailPopup.push(externalContactSource.wrap(businessContact.PrimaryContact),allowEditContact)
    }
    
    // 'action' attribute on AddressBookContactInput (id=PrimaryContact_Input) at AddressBookContactWidget.xml: line 12, column 225
    function action_dest_3 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(entity.Person)
    }
    
    // 'action' attribute on AddressBookContactInput (id=PrimaryContact_Input) at AddressBookContactWidget.xml: line 10, column 154
    function action_dest_6 () : pcf.api.Destination {
      return pcf.AddressBookContactDetailPopup.createDestination(externalContactSource.wrap(businessContact.PrimaryContact),allowEditContact)
    }
    
    // 'def' attribute on InputSetRef (id=Work) at AddressBookBusinessContactInfoInputSet.pcf: line 32, column 18
    function def_onEnter_14 (def :  pcf.GlobalPhoneInputSet) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(businessContact, Contact#WorkPhone), DisplayKey.get("Web.ContactDetail.Phone.Work"), false))
    }
    
    // 'def' attribute on InputSetRef (id=Home) at AddressBookBusinessContactInfoInputSet.pcf: line 37, column 48
    function def_onEnter_17 (def :  pcf.GlobalPhoneInputSet) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(businessContact, Contact#HomePhone), DisplayKey.get("Web.ContactDetail.Phone.Home"), false))
    }
    
    // 'def' attribute on InputSetRef (id=Cell) at AddressBookBusinessContactInfoInputSet.pcf: line 42, column 48
    function def_onEnter_20 (def :  pcf.GlobalPhoneInputSet) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(createCellPhoneDelegate(), DisplayKey.get("Web.ContactDetail.Phone.Cell"), false))
    }
    
    // 'def' attribute on InputSetRef (id=Fax) at AddressBookBusinessContactInfoInputSet.pcf: line 46, column 17
    function def_onEnter_22 (def :  pcf.GlobalPhoneInputSet) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(businessContact, Contact#FaxPhone), DisplayKey.get("Web.ContactDetail.Phone.Fax"), false))
    }
    
    // 'def' attribute on InputSetRef (id=AletPhone_Ext) at AddressBookBusinessContactInfoInputSet.pcf: line 50, column 27
    function def_onEnter_24 (def :  pcf.GlobalPhoneInputSet) : void {
      def.onEnter(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(businessContact, Contact#AltPhone_Ext), DisplayKey.get("Toggle.Web.ContactDetail.Phone.Alter_Ext"), false))
    }
    
    // 'def' attribute on InputSetRef (id=Work) at AddressBookBusinessContactInfoInputSet.pcf: line 32, column 18
    function def_refreshVariables_15 (def :  pcf.GlobalPhoneInputSet) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(businessContact, Contact#WorkPhone), DisplayKey.get("Web.ContactDetail.Phone.Work"), false))
    }
    
    // 'def' attribute on InputSetRef (id=Home) at AddressBookBusinessContactInfoInputSet.pcf: line 37, column 48
    function def_refreshVariables_18 (def :  pcf.GlobalPhoneInputSet) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(businessContact, Contact#HomePhone), DisplayKey.get("Web.ContactDetail.Phone.Home"), false))
    }
    
    // 'def' attribute on InputSetRef (id=Cell) at AddressBookBusinessContactInfoInputSet.pcf: line 42, column 48
    function def_refreshVariables_21 (def :  pcf.GlobalPhoneInputSet) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(createCellPhoneDelegate(), DisplayKey.get("Web.ContactDetail.Phone.Cell"), false))
    }
    
    // 'def' attribute on InputSetRef (id=Fax) at AddressBookBusinessContactInfoInputSet.pcf: line 46, column 17
    function def_refreshVariables_23 (def :  pcf.GlobalPhoneInputSet) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(businessContact, Contact#FaxPhone), DisplayKey.get("Web.ContactDetail.Phone.Fax"), false))
    }
    
    // 'def' attribute on InputSetRef (id=AletPhone_Ext) at AddressBookBusinessContactInfoInputSet.pcf: line 50, column 27
    function def_refreshVariables_25 (def :  pcf.GlobalPhoneInputSet) : void {
      def.refreshVariables(new gw.api.phone.StandardPhoneOwner(new gw.api.phone.ContactPhoneDelegate(businessContact, Contact#AltPhone_Ext), DisplayKey.get("Toggle.Web.ContactDetail.Phone.Alter_Ext"), false))
    }
    
    // 'value' attribute on TypeKeyInput (id=PrimaryPhone_Input) at AddressBookBusinessContactInfoInputSet.pcf: line 58, column 48
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      (businessContact as Person).PrimaryPhone = (__VALUE_TO_SET as typekey.PrimaryPhoneType)
    }
    
    // 'value' attribute on TextInput (id=Email1_Input) at AddressBookBusinessContactInfoInputSet.pcf: line 69, column 46
    function defaultSetter_38 (__VALUE_TO_SET :  java.lang.Object) : void {
      businessContact.EmailAddress1 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=Email2_Input) at AddressBookBusinessContactInfoInputSet.pcf: line 75, column 46
    function defaultSetter_44 (__VALUE_TO_SET :  java.lang.Object) : void {
      businessContact.EmailAddress2 = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on AddressBookContactInput (id=PrimaryContact_Input) at AddressBookContactWidget.xml: line 10, column 154
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      businessContact.PrimaryContact = (__VALUE_TO_SET as entity.Contact)
    }
    
    // 'label' attribute on Label at AddressBookBusinessContactInfoInputSet.pcf: line 20, column 27
    function label_0 () : java.lang.String {
      return topLabel()
    }
    
    // 'label' attribute on TextInput (id=Email1_Input) at AddressBookBusinessContactInfoInputSet.pcf: line 69, column 46
    function label_36 () : java.lang.Object {
      return mainEmailLabel()
    }
    
    // 'label' attribute on TextInput (id=Email2_Input) at AddressBookBusinessContactInfoInputSet.pcf: line 75, column 46
    function label_42 () : java.lang.Object {
      return alternateEmailLabel()
    }
    
    // 'validationExpression' attribute on TypeKeyInput (id=PrimaryPhone_Input) at AddressBookBusinessContactInfoInputSet.pcf: line 58, column 48
    function validationExpression_26 () : java.lang.Object {
      return (businessContact.PrimaryPhone == null or (businessContact.PrimaryPhone == TC_WORK and businessContact.WorkPhone != null) or  (businessContact.PrimaryPhone == TC_HOME and businessContact.HomePhone != null) or (businessContact.PrimaryPhone == TC_MOBILE and (businessContact as Person).CellPhone != null)) ? null : DisplayKey.get("Web.ContactDetail.Phone.PrimaryPhone.Error")
    }
    
    // 'value' attribute on TypeKeyInput (id=PrimaryPhone_Input) at AddressBookBusinessContactInfoInputSet.pcf: line 58, column 48
    function valueRoot_30 () : java.lang.Object {
      return (businessContact as Person)
    }
    
    // 'value' attribute on AddressBookContactInput (id=PrimaryContact_Input) at AddressBookContactWidget.xml: line 10, column 154
    function valueRoot_9 () : java.lang.Object {
      return businessContact
    }
    
    // 'value' attribute on TypeKeyInput (id=PrimaryPhone_Input) at AddressBookBusinessContactInfoInputSet.pcf: line 58, column 48
    function value_28 () : typekey.PrimaryPhoneType {
      return (businessContact as Person).PrimaryPhone
    }
    
    // 'value' attribute on TextInput (id=Email1_Input) at AddressBookBusinessContactInfoInputSet.pcf: line 69, column 46
    function value_37 () : java.lang.String {
      return businessContact.EmailAddress1
    }
    
    // 'value' attribute on TextInput (id=Email2_Input) at AddressBookBusinessContactInfoInputSet.pcf: line 75, column 46
    function value_43 () : java.lang.String {
      return businessContact.EmailAddress2
    }
    
    // 'value' attribute on AddressBookContactInput (id=PrimaryContact_Input) at AddressBookContactWidget.xml: line 10, column 154
    function value_7 () : entity.Contact {
      return businessContact.PrimaryContact
    }
    
    // 'visible' attribute on AddressBookContactInput (id=PrimaryContact_Input) at AddressBookContactWidget.xml: line 12, column 225
    function visible_1 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(entity.Person)" != "" && true
    }
    
    // 'visible' attribute on InputSetRef (id=Home) at AddressBookBusinessContactInfoInputSet.pcf: line 37, column 48
    function visible_16 () : java.lang.Boolean {
      return businessContact typeis Person
    }
    
    property get allowEditContact () : boolean {
      return getRequireValue("allowEditContact", 0) as java.lang.Boolean
    }
    
    property set allowEditContact ($arg :  boolean) {
      setRequireValue("allowEditContact", 0, $arg)
    }
    
    property get businessContact () : Contact {
      return getRequireValue("businessContact", 0) as Contact
    }
    
    property set businessContact ($arg :  Contact) {
      setRequireValue("businessContact", 0, $arg)
    }
    
    property get externalContactSource () : gw.api.contact.ExternalContactSource {
      return getRequireValue("externalContactSource", 0) as gw.api.contact.ExternalContactSource
    }
    
    property set externalContactSource ($arg :  gw.api.contact.ExternalContactSource) {
      setRequireValue("externalContactSource", 0, $arg)
    }
    
    function createCellPhoneDelegate() : gw.api.phone.ContactPhoneDelegate {
      if (businessContact typeis Person) {
        return new gw.api.phone.ContactPhoneDelegate(businessContact, businessContact#CellPhone)
      } else {
        return null
      }
    }
    
    
    function topLabel() : String {
      if (businessContact typeis Person) {
        return DisplayKey.get("Web.ContactDetail.Phone")
      } else {
        return DisplayKey.get("Web.ContactDetail.ContactInfo")
      }
    }
    
    function mainEmailLabel() : String {
      if (businessContact typeis Person) {
        return DisplayKey.get("Web.ContactDetail.Email.Primary")
      } else {
        return DisplayKey.get("Web.ContactDetail.PrimaryContact.Email1")
      }
    }
    
    function alternateEmailLabel() : String {
      if (businessContact typeis Person) {
        return DisplayKey.get("Web.ContactDetail.Email.Secondary")
      } else {
        return DisplayKey.get("Web.ContactDetail.PrimaryContact.Email2")
      }
    }
    
    
  }
  
  
}