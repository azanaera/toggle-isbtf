package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/shared/contacts/AdditionalInfoInputSet.Person.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AdditionalInfoInputSet_PersonExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/shared/contacts/AdditionalInfoInputSet.Person.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdditionalInfoInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 16, column 225
    function action_122 () : void {
      AddressBookPickerPopup.push(statictypeof (Person.Employer), claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 18, column 285
    function action_124 () : void {
      if (Person.Employer != null) { ClaimContactDetailPopup.push(Person.Employer, claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 12, column 273
    function action_125 () : void {
      ClaimContactDetailPopup.push(Person.Employer, claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Guardian_Input) at ClaimContactWidget.xml: line 16, column 225
    function action_92 () : void {
      AddressBookPickerPopup.push(entity.Person.Type, claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Guardian_Input) at ClaimContactWidget.xml: line 18, column 285
    function action_94 () : void {
      if (Person.Guardian != null) { ClaimContactDetailPopup.push(Person.Guardian, claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=Guardian_Input) at ClaimContactWidget.xml: line 12, column 273
    function action_95 () : void {
      ClaimContactDetailPopup.push(Person.Guardian, claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_123 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Person.Employer), claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_126 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Person.Employer, claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=Guardian_Input) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_93 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(entity.Person.Type, claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=Guardian_Input) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_96 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Person.Guardian, claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_119 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Person.Employer), Person, claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Guardian_Input) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_89 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.onEnter(entity.Person.Type, Person, claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_120 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Person.Employer), Person, claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=Guardian_Input) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_90 (def :  pcf.ClaimNewPersonOnlyPickerMenuItemSet) : void {
      def.refreshVariables(entity.Person.Type, Person, claim)
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency_Input) at AdditionalInfoInputSet.Person.pcf: line 155, column 65
    function defaultSetter_110 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.PreferredCurrency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on TextInput (id=Occupation_Input) at AdditionalInfoInputSet.Person.pcf: line 163, column 34
    function defaultSetter_115 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.Occupation = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_129 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.Employer = (__VALUE_TO_SET as entity.Company)
    }
    
    // 'value' attribute on BooleanRadioInput (id=SSNReleaseAuthorized_Input) at AdditionalInfoInputSet.Person.pcf: line 51, column 118
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.SSNReleaseAuthorized = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=IDType_Input) at AdditionalInfoInputSet.Person.pcf: line 33, column 62
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.PersonClaimantIDType = (__VALUE_TO_SET as typekey.ClaimantIDType)
    }
    
    // 'value' attribute on TextInput (id=VisaNumber_Input) at AdditionalInfoInputSet.Person.pcf: line 58, column 118
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.VisaNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=GreenCardNumber_Input) at AdditionalInfoInputSet.Person.pcf: line 65, column 118
    function defaultSetter_27 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.GreenCardNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=PassportNumber_Input) at AdditionalInfoInputSet.Person.pcf: line 72, column 118
    function defaultSetter_33 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.PassportNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=JurisdictionAssignedID_Input) at AdditionalInfoInputSet.Person.pcf: line 79, column 118
    function defaultSetter_39 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.JurisdictionAssignedID = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=TaxExemptionsEntitled_Input) at AdditionalInfoInputSet.Person.pcf: line 94, column 63
    function defaultSetter_50 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.TaxExemptionsEntitled = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TypeKeyInput (id=TaxFilingStatus_Input) at AdditionalInfoInputSet.Person.pcf: line 100, column 48
    function defaultSetter_55 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.TaxFilingStatus = (__VALUE_TO_SET as typekey.TaxFilingStatusType)
    }
    
    // 'value' attribute on DateInput (id=DateOfBirth_Input) at AdditionalInfoInputSet.Person.pcf: line 106, column 35
    function defaultSetter_60 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.DateOfBirth = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=DateOfDeath_Ext_Input) at AdditionalInfoInputSet.Person.pcf: line 112, column 39
    function defaultSetter_66 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.DateOfDeath_Ext = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on BooleanRadioInput (id=MedicareBeneficiary_Ext_Input) at AdditionalInfoInputSet.Person.pcf: line 117, column 47
    function defaultSetter_71 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.MedicareBeneficiary_Ext = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TypeKeyInput (id=Gender_Input) at AdditionalInfoInputSet.Person.pcf: line 123, column 39
    function defaultSetter_75 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.Gender = (__VALUE_TO_SET as typekey.GenderType)
    }
    
    // 'value' attribute on TypeKeyInput (id=MaritalStatus_Input) at AdditionalInfoInputSet.Person.pcf: line 129, column 42
    function defaultSetter_79 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.MaritalStatus = (__VALUE_TO_SET as typekey.MaritalStatus)
    }
    
    // 'value' attribute on PrivacyInput (id=TaxID_Input) at AdditionalInfoInputSet.Person.pcf: line 44, column 69
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.TaxID = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=EducationLevel_Input) at AdditionalInfoInputSet.Person.pcf: line 137, column 63
    function defaultSetter_84 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.EducationLevel = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on ClaimContactInput (id=Guardian_Input) at ClaimContactWidget.xml: line 12, column 273
    function defaultSetter_99 (__VALUE_TO_SET :  java.lang.Object) : void {
      Person.Guardian = (__VALUE_TO_SET as entity.Person)
    }
    
    // 'encryptionExpression' attribute on PrivacyInput (id=TaxID_Input) at AdditionalInfoInputSet.Person.pcf: line 44, column 69
    function encryptionExpression_10 (VALUE :  java.lang.String) : java.lang.String {
      return Person.maskTaxId(VALUE)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 12, column 273
    function onPick_127 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Person.Employer); var result = eval("Person.Employer = claim.resolveContact(Person.Employer) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'onPick' attribute on ClaimContactInput (id=Guardian_Input) at ClaimContactWidget.xml: line 12, column 273
    function onPick_97 (PickedValue :  Contact) : void {
      var contactType = entity.Person.Type; var result = eval("Person.Guardian = claim.resolveContact(Person.Guardian) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'validationExpression' attribute on DateInput (id=DateOfBirth_Input) at AdditionalInfoInputSet.Person.pcf: line 106, column 35
    function validationExpression_58 () : java.lang.Object {
      return (Person.DateOfBirth == null or Person.DateOfBirth <= gw.api.upgrade.Coercions.makeDateFrom("today")) ? null : DisplayKey.get("Web.ContactDetail.AdditionalInfo.DateOfBirth.FutureError")
    }
    
    // 'validationExpression' attribute on DateInput (id=DateOfDeath_Ext_Input) at AdditionalInfoInputSet.Person.pcf: line 112, column 39
    function validationExpression_64 () : java.lang.Object {
      return Person.DateOfDeath_Ext != null and Person.DateOfDeath_Ext.after(gw.api.util.DateUtil.currentDate()) ? "Web.ContactDetail.AdditionalInfo.DateOfBirth.FutureError": null
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Guardian_Input) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_101 () : java.lang.Object {
      return claim.RelatedPersonArray
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_131 () : java.lang.Object {
      return claim.RelatedCompanyArray
    }
    
    // 'value' attribute on TypeKeyInput (id=IDType_Input) at AdditionalInfoInputSet.Person.pcf: line 33, column 62
    function valueRoot_3 () : java.lang.Object {
      return Person
    }
    
    // 'value' attribute on TypeKeyInput (id=IDType_Input) at AdditionalInfoInputSet.Person.pcf: line 33, column 62
    function value_1 () : typekey.ClaimantIDType {
      return Person.PersonClaimantIDType
    }
    
    // 'value' attribute on TypeKeyInput (id=Currency_Input) at AdditionalInfoInputSet.Person.pcf: line 155, column 65
    function value_109 () : typekey.Currency {
      return Person.PreferredCurrency
    }
    
    // 'value' attribute on TextInput (id=Occupation_Input) at AdditionalInfoInputSet.Person.pcf: line 163, column 34
    function value_114 () : java.lang.String {
      return Person.Occupation
    }
    
    // 'value' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 12, column 273
    function value_128 () : entity.Company {
      return Person.Employer
    }
    
    // 'value' attribute on BooleanRadioInput (id=SSNReleaseAuthorized_Input) at AdditionalInfoInputSet.Person.pcf: line 51, column 118
    function value_14 () : java.lang.Boolean {
      return Person.SSNReleaseAuthorized
    }
    
    // 'value' attribute on TextInput (id=VisaNumber_Input) at AdditionalInfoInputSet.Person.pcf: line 58, column 118
    function value_20 () : java.lang.String {
      return Person.VisaNumber
    }
    
    // 'value' attribute on TextInput (id=GreenCardNumber_Input) at AdditionalInfoInputSet.Person.pcf: line 65, column 118
    function value_26 () : java.lang.String {
      return Person.GreenCardNumber
    }
    
    // 'value' attribute on TextInput (id=PassportNumber_Input) at AdditionalInfoInputSet.Person.pcf: line 72, column 118
    function value_32 () : java.lang.String {
      return Person.PassportNumber
    }
    
    // 'value' attribute on TextInput (id=JurisdictionAssignedID_Input) at AdditionalInfoInputSet.Person.pcf: line 79, column 118
    function value_38 () : java.lang.String {
      return Person.JurisdictionAssignedID
    }
    
    // 'value' attribute on TextInput (id=EmployeeSecurityID_Input) at AdditionalInfoInputSet.Person.pcf: line 85, column 63
    function value_44 () : java.lang.String {
      return Person.EmployeeSecurityID
    }
    
    // 'value' attribute on TextInput (id=TaxExemptionsEntitled_Input) at AdditionalInfoInputSet.Person.pcf: line 94, column 63
    function value_49 () : java.math.BigDecimal {
      return Person.TaxExemptionsEntitled
    }
    
    // 'value' attribute on TypeKeyInput (id=TaxFilingStatus_Input) at AdditionalInfoInputSet.Person.pcf: line 100, column 48
    function value_54 () : typekey.TaxFilingStatusType {
      return Person.TaxFilingStatus
    }
    
    // 'value' attribute on DateInput (id=DateOfBirth_Input) at AdditionalInfoInputSet.Person.pcf: line 106, column 35
    function value_59 () : java.util.Date {
      return Person.DateOfBirth
    }
    
    // 'value' attribute on DateInput (id=DateOfDeath_Ext_Input) at AdditionalInfoInputSet.Person.pcf: line 112, column 39
    function value_65 () : java.util.Date {
      return Person.DateOfDeath_Ext
    }
    
    // 'value' attribute on PrivacyInput (id=TaxID_Input) at AdditionalInfoInputSet.Person.pcf: line 44, column 69
    function value_7 () : java.lang.String {
      return Person.TaxID
    }
    
    // 'value' attribute on BooleanRadioInput (id=MedicareBeneficiary_Ext_Input) at AdditionalInfoInputSet.Person.pcf: line 117, column 47
    function value_70 () : java.lang.Boolean {
      return Person.MedicareBeneficiary_Ext
    }
    
    // 'value' attribute on TypeKeyInput (id=Gender_Input) at AdditionalInfoInputSet.Person.pcf: line 123, column 39
    function value_74 () : typekey.GenderType {
      return Person.Gender
    }
    
    // 'value' attribute on TypeKeyInput (id=MaritalStatus_Input) at AdditionalInfoInputSet.Person.pcf: line 129, column 42
    function value_78 () : typekey.MaritalStatus {
      return Person.MaritalStatus
    }
    
    // 'value' attribute on TextInput (id=EducationLevel_Input) at AdditionalInfoInputSet.Person.pcf: line 137, column 63
    function value_83 () : java.lang.String {
      return Person.EducationLevel
    }
    
    // 'value' attribute on ClaimContactInput (id=Guardian_Input) at ClaimContactWidget.xml: line 12, column 273
    function value_98 () : entity.Person {
      return Person.Guardian
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Guardian_Input) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_102 ($$arg :  entity.Person[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Guardian_Input) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_102 ($$arg :  gw.api.database.IQueryBeanResult<entity.Person>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Guardian_Input) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_102 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_132 ($$arg :  entity.Company[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_132 ($$arg :  gw.api.database.IQueryBeanResult<entity.Company>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_132 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Guardian_Input) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_103 () : void {
      var __valueRangeArg = claim.RelatedPersonArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_102(__valueRangeArg)
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_133 () : void {
      var __valueRangeArg = claim.RelatedCompanyArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_132(__valueRangeArg)
    }
    
    // 'valueType' attribute on ClaimContactInput (id=Guardian_Input) at AdditionalInfoInputSet.Person.pcf: line 148, column 34
    function verifyValueType_107 () : void {
      var __valueTypeArg : entity.Person
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'valueType' attribute on ClaimContactInput (id=Organization_Input) at AdditionalInfoInputSet.Person.pcf: line 172, column 35
    function verifyValueType_137 () : void {
      var __valueTypeArg : entity.Company
      // If this assignment statement fails to compile, that means that the declared valueType
      // is not a valid type for use with this Input or Cell type
      var __requiredTypeArg : entity.Contact = __valueTypeArg
    }
    
    // 'visible' attribute on TypeKeyInput (id=IDType_Input) at AdditionalInfoInputSet.Person.pcf: line 33, column 62
    function visible_0 () : java.lang.Boolean {
      return claim.showClaimantInfo(Person, claimContact)
    }
    
    // 'visible' attribute on TypeKeyInput (id=Currency_Input) at AdditionalInfoInputSet.Person.pcf: line 155, column 65
    function visible_108 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.isMultiCurrencyMode()
    }
    
    // 'visible' attribute on ClaimContactInput (id=Organization_Input) at ClaimContactWidget.xml: line 16, column 225
    function visible_121 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Person.Employer), claim, null as List<SpecialistService>)" != "" && true
    }
    
    // 'visible' attribute on BooleanRadioInput (id=SSNReleaseAuthorized_Input) at AdditionalInfoInputSet.Person.pcf: line 51, column 118
    function visible_13 () : java.lang.Boolean {
      return claim.showClaimantInfo(Person, claimContact) and Person.PersonClaimantIDType == ClaimantIDType.TC_S
    }
    
    // 'visible' attribute on TextInput (id=VisaNumber_Input) at AdditionalInfoInputSet.Person.pcf: line 58, column 118
    function visible_19 () : java.lang.Boolean {
      return claim.showClaimantInfo(Person, claimContact) and Person.PersonClaimantIDType == ClaimantIDType.TC_E
    }
    
    // 'visible' attribute on TextInput (id=GreenCardNumber_Input) at AdditionalInfoInputSet.Person.pcf: line 65, column 118
    function visible_25 () : java.lang.Boolean {
      return claim.showClaimantInfo(Person, claimContact) and Person.PersonClaimantIDType == ClaimantIDType.TC_G
    }
    
    // 'visible' attribute on TextInput (id=PassportNumber_Input) at AdditionalInfoInputSet.Person.pcf: line 72, column 118
    function visible_31 () : java.lang.Boolean {
      return claim.showClaimantInfo(Person, claimContact) and Person.PersonClaimantIDType == ClaimantIDType.TC_P
    }
    
    // 'visible' attribute on TextInput (id=JurisdictionAssignedID_Input) at AdditionalInfoInputSet.Person.pcf: line 79, column 118
    function visible_37 () : java.lang.Boolean {
      return claim.showClaimantInfo(Person, claimContact) and Person.PersonClaimantIDType == ClaimantIDType.TC_A
    }
    
    // 'visible' attribute on PrivacyInput (id=TaxID_Input) at AdditionalInfoInputSet.Person.pcf: line 44, column 69
    function visible_6 () : java.lang.Boolean {
      return Person.PersonClaimantIDType == ClaimantIDType.TC_S
    }
    
    // 'visible' attribute on ClaimContactInput (id=Guardian_Input) at ClaimContactWidget.xml: line 14, column 229
    function visible_88 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=Guardian_Input) at ClaimContactWidget.xml: line 16, column 225
    function visible_91 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(entity.Person.Type, claim, null as List<SpecialistService>)" != "" && true
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
    
    
    property get Person() : Person { return contactHandle.Contact as Person; }
        
    
    
  }
  
  
}