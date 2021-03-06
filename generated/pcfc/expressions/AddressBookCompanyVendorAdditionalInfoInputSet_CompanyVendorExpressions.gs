package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/addressbook/AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookCompanyVendorAdditionalInfoInputSet_CompanyVendorExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/addressbook/AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookCompanyVendorAdditionalInfoInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 22, column 31
    function def_onEnter_11 (def :  pcf.AddressBookCompanyVendorSpecialtyInputSet_AutoTowingAgcy) : void {
      def.onEnter(company as CompanyVendor)
    }
    
    // 'def' attribute on InputSetRef at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 22, column 31
    function def_onEnter_13 (def :  pcf.AddressBookCompanyVendorSpecialtyInputSet_LawFirm) : void {
      def.onEnter(company as CompanyVendor)
    }
    
    // 'def' attribute on InputSetRef at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 22, column 31
    function def_onEnter_15 (def :  pcf.AddressBookCompanyVendorSpecialtyInputSet_MedicalCareOrg) : void {
      def.onEnter(company as CompanyVendor)
    }
    
    // 'def' attribute on InputSetRef at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 22, column 31
    function def_onEnter_17 (def :  pcf.AddressBookCompanyVendorSpecialtyInputSet_default) : void {
      def.onEnter(company as CompanyVendor)
    }
    
    // 'def' attribute on InputSetRef at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 22, column 31
    function def_onEnter_9 (def :  pcf.AddressBookCompanyVendorSpecialtyInputSet_AutoRepairShop) : void {
      def.onEnter(company as CompanyVendor)
    }
    
    // 'def' attribute on InputSetRef at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 22, column 31
    function def_refreshVariables_10 (def :  pcf.AddressBookCompanyVendorSpecialtyInputSet_AutoRepairShop) : void {
      def.refreshVariables(company as CompanyVendor)
    }
    
    // 'def' attribute on InputSetRef at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 22, column 31
    function def_refreshVariables_12 (def :  pcf.AddressBookCompanyVendorSpecialtyInputSet_AutoTowingAgcy) : void {
      def.refreshVariables(company as CompanyVendor)
    }
    
    // 'def' attribute on InputSetRef at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 22, column 31
    function def_refreshVariables_14 (def :  pcf.AddressBookCompanyVendorSpecialtyInputSet_LawFirm) : void {
      def.refreshVariables(company as CompanyVendor)
    }
    
    // 'def' attribute on InputSetRef at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 22, column 31
    function def_refreshVariables_16 (def :  pcf.AddressBookCompanyVendorSpecialtyInputSet_MedicalCareOrg) : void {
      def.refreshVariables(company as CompanyVendor)
    }
    
    // 'def' attribute on InputSetRef at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 22, column 31
    function def_refreshVariables_18 (def :  pcf.AddressBookCompanyVendorSpecialtyInputSet_default) : void {
      def.refreshVariables(company as CompanyVendor)
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsPreferredVendor_Input) at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 15, column 53
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      (company as CompanyVendor).Preferred = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'editable' attribute on BooleanRadioInput (id=IsPreferredVendor_Input) at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 15, column 53
    function editable_0 () : java.lang.Boolean {
      return perm.Contact.createpreferredab
    }
    
    // 'mode' attribute on InputSetRef at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 22, column 31
    function mode_19 () : java.lang.Object {
      return company.Subtype
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsPreferredVendor_Input) at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 15, column 53
    function valueRoot_3 () : java.lang.Object {
      return (company as CompanyVendor)
    }
    
    // 'value' attribute on BooleanRadioInput (id=IsPreferredVendor_Input) at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 15, column 53
    function value_1 () : java.lang.Boolean {
      return (company as CompanyVendor).Preferred
    }
    
    // 'value' attribute on TextInput (id=VendorID_Ext_Input) at AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf: line 19, column 56
    function value_6 () : java.lang.String {
      return (company as CompanyVendor).VendorNumber
    }
    
    property get company () : Company {
      return getRequireValue("company", 0) as Company
    }
    
    property set company ($arg :  Company) {
      setRequireValue("company", 0, $arg)
    }
    
    
  }
  
  
}