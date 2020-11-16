package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/shared/exposures/PIPEmploymentInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PIPEmploymentInputSetExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/shared/exposures/PIPEmploymentInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PIPEmploymentInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ClaimContactInput (id=PIPDamages_Claimant_Input) at ClaimContactWidget.xml: line 16, column 225
    function action_4 () : void {
      AddressBookPickerPopup.push(statictypeof (Exposure.Claimant), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=PIPDamages_Claimant_Input) at ClaimContactWidget.xml: line 18, column 285
    function action_6 () : void {
      if (Exposure.Claimant != null) { ClaimContactDetailPopup.push(Exposure.Claimant, Exposure.Claim, false, !CurrentLocation.InEditMode) } else { NullClaimContactDetailPopup.push() }
    }
    
    // 'action' attribute on ClaimContactInput (id=PIPDamages_Claimant_Input) at ClaimContactWidget.xml: line 12, column 273
    function action_7 () : void {
      ClaimContactDetailPopup.push(Exposure.Claimant, Exposure.Claim)
    }
    
    // 'action' attribute on ClaimContactInput (id=PIPDamages_Claimant_Input) at ClaimContactWidget.xml: line 16, column 225
    function action_dest_5 () : pcf.api.Destination {
      return pcf.AddressBookPickerPopup.createDestination(statictypeof (Exposure.Claimant), Exposure.Claim, null as List<SpecialistService>)
    }
    
    // 'action' attribute on ClaimContactInput (id=PIPDamages_Claimant_Input) at ClaimContactWidget.xml: line 12, column 273
    function action_dest_8 () : pcf.api.Destination {
      return pcf.ClaimContactDetailPopup.createDestination(Exposure.Claimant, Exposure.Claim)
    }
    
    // 'def' attribute on ClaimContactInput (id=PIPDamages_Claimant_Input) at ClaimContactWidget.xml: line 14, column 229
    function def_onEnter_1 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.onEnter(statictypeof (Exposure.Claimant), null, Exposure.Claim)
    }
    
    // 'def' attribute on ListViewInput at PIPEmploymentInputSet.pcf: line 109, column 100
    function def_onEnter_82 (def :  pcf.EditableWorkStatusChangesLV) : void {
      def.onEnter(Exposure.PriorEmpData)
    }
    
    // 'def' attribute on ClaimContactInput (id=PIPDamages_Claimant_Input) at ClaimContactWidget.xml: line 14, column 229
    function def_refreshVariables_2 (def :  pcf.ClaimNewContactPickerMenuItemSet) : void {
      def.refreshVariables(statictypeof (Exposure.Claimant), null, Exposure.Claim)
    }
    
    // 'def' attribute on ListViewInput at PIPEmploymentInputSet.pcf: line 109, column 100
    function def_refreshVariables_83 (def :  pcf.EditableWorkStatusChangesLV) : void {
      def.refreshVariables(Exposure.PriorEmpData)
    }
    
    // 'value' attribute on DateInput (id=EmploymentData_HireDate_Input) at PIPEmploymentInputSet.pcf: line 40, column 47
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.PriorEmpData.HireDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TypeKeyInput (id=EmploymentData_EmploymentStatus_Input) at PIPEmploymentInputSet.pcf: line 46, column 49
    function defaultSetter_35 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.PriorEmpData.EmploymentStatus = (__VALUE_TO_SET as typekey.EmploymentStatusType)
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_NumHoursWorkedPerDay_Input) at PIPEmploymentInputSet.pcf: line 52, column 41
    function defaultSetter_39 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.PriorEmpData.NumHoursWorked = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_NumDaysWorkedPerWeek_Input) at PIPEmploymentInputSet.pcf: line 58, column 41
    function defaultSetter_43 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.PriorEmpData.NumDaysWorked = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on CurrencyInput (id=EmploymentData_WageAmount_Input) at PIPEmploymentInputSet.pcf: line 63, column 49
    function defaultSetter_47 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.PriorEmpData.WageAmount = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=EmploymentData_OvertimeRate_Input) at PIPEmploymentInputSet.pcf: line 68, column 51
    function defaultSetter_51 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.PriorEmpData.OvertimeRate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=EmploymentData_LastYearIncome_Input) at PIPEmploymentInputSet.pcf: line 73, column 53
    function defaultSetter_55 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.PriorEmpData.LastYearIncome = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TypeKeyInput (id=EmploymentData_PayPeriod_Input) at PIPEmploymentInputSet.pcf: line 79, column 42
    function defaultSetter_59 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.PriorEmpData.PayPeriod = (__VALUE_TO_SET as typekey.PayPeriodType)
    }
    
    // 'value' attribute on BooleanRadioInput (id=EmploymentData_WagePaymentCont_Input) at PIPEmploymentInputSet.pcf: line 84, column 54
    function defaultSetter_63 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.PriorEmpData.WagePaymentCont = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on DateInput (id=EmploymentData_InjuryStartDate_Input) at PIPEmploymentInputSet.pcf: line 92, column 54
    function defaultSetter_68 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.PriorEmpData.InjuryStartTime = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_DaysWorkedWeek_Input) at PIPEmploymentInputSet.pcf: line 105, column 53
    function defaultSetter_79 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.PriorEmpData.DaysWorkedWeek = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'onPick' attribute on ClaimContactInput (id=PIPDamages_Claimant_Input) at ClaimContactWidget.xml: line 12, column 273
    function onPick_9 (PickedValue :  Contact) : void {
      var contactType = statictypeof (Exposure.Claimant); var result = eval("Exposure.Claimant = Exposure.Claim.resolveContact(Exposure.Claimant) as " + contactType.Name + ";return null;"); ;
    }
    
    // 'value' attribute on Reflect at PIPEmploymentInputSet.pcf: line 24, column 74
    function reflectionValue_18 (TRIGGER_INDEX :  int, VALUE :  entity.Contact) : java.lang.Object {
      return (VALUE typeis Person) ? VALUE.Occupation : ""
    }
    
    // 'validationExpression' attribute on DateInput (id=EmploymentData_HireDate_Input) at PIPEmploymentInputSet.pcf: line 40, column 47
    function validationExpression_28 () : java.lang.Object {
      return (Exposure.PriorEmpData.HireDate == null) or (Exposure.PriorEmpData.HireDate < gw.api.util.DateUtil.currentDate()) ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'validationExpression' attribute on DateInput (id=EmploymentData_InjuryStartDate_Input) at PIPEmploymentInputSet.pcf: line 92, column 54
    function validationExpression_66 () : java.lang.Object {
      return (Exposure.PriorEmpData.InjuryStartTime == null) or (Exposure.PriorEmpData.InjuryStartTime < gw.api.util.DateUtil.currentDate()) ? null : DisplayKey.get("Java.Validation.Date.ForbidFuture")
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PIPDamages_Claimant_Input) at ClaimContactWidget.xml: line 12, column 273
    function valueRange_12 () : java.lang.Object {
      return Exposure.Claim.getRelatedContacts(Exposure.Claim.getContactTypes(TC_CLAIMANT)) as Person[]
    }
    
    // 'value' attribute on ClaimContactInput (id=PIPDamages_Claimant_Input) at ClaimContactWidget.xml: line 12, column 273
    function valueRoot_11 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TextInput (id=Person_Employer_Input) at PIPEmploymentInputSet.pcf: line 29, column 61
    function valueRoot_23 () : java.lang.Object {
      return Exposure.Claimant.ContactCompany
    }
    
    // 'value' attribute on TextInput (id=Company_PrimaryContact_Input) at PIPEmploymentInputSet.pcf: line 33, column 76
    function valueRoot_26 () : java.lang.Object {
      return Exposure.Claimant.ContactCompany.PrimaryContact
    }
    
    // 'value' attribute on DateInput (id=EmploymentData_HireDate_Input) at PIPEmploymentInputSet.pcf: line 40, column 47
    function valueRoot_31 () : java.lang.Object {
      return Exposure.PriorEmpData
    }
    
    // 'value' attribute on ClaimContactInput (id=PIPDamages_Claimant_Input) at ClaimContactWidget.xml: line 12, column 273
    function value_10 () : entity.Contact {
      return Exposure.Claimant
    }
    
    // 'value' attribute on TextInput (id=Person_Occupation_Input) at PIPEmploymentInputSet.pcf: line 21, column 95
    function value_20 () : java.lang.String {
      return (Exposure.Claimant typeis Person) ? Exposure.Claimant.Occupation : ""
    }
    
    // 'value' attribute on TextInput (id=Person_Employer_Input) at PIPEmploymentInputSet.pcf: line 29, column 61
    function value_22 () : java.lang.String {
      return Exposure.Claimant.ContactCompany.DisplayName
    }
    
    // 'value' attribute on TextInput (id=Company_PrimaryContact_Input) at PIPEmploymentInputSet.pcf: line 33, column 76
    function value_25 () : java.lang.String {
      return Exposure.Claimant.ContactCompany.PrimaryContact.DisplayName
    }
    
    // 'value' attribute on DateInput (id=EmploymentData_HireDate_Input) at PIPEmploymentInputSet.pcf: line 40, column 47
    function value_29 () : java.util.Date {
      return Exposure.PriorEmpData.HireDate
    }
    
    // 'value' attribute on TypeKeyInput (id=EmploymentData_EmploymentStatus_Input) at PIPEmploymentInputSet.pcf: line 46, column 49
    function value_34 () : typekey.EmploymentStatusType {
      return Exposure.PriorEmpData.EmploymentStatus
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_NumHoursWorkedPerDay_Input) at PIPEmploymentInputSet.pcf: line 52, column 41
    function value_38 () : java.math.BigDecimal {
      return Exposure.PriorEmpData.NumHoursWorked
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_NumDaysWorkedPerWeek_Input) at PIPEmploymentInputSet.pcf: line 58, column 41
    function value_42 () : java.math.BigDecimal {
      return Exposure.PriorEmpData.NumDaysWorked
    }
    
    // 'value' attribute on CurrencyInput (id=EmploymentData_WageAmount_Input) at PIPEmploymentInputSet.pcf: line 63, column 49
    function value_46 () : gw.api.financials.CurrencyAmount {
      return Exposure.PriorEmpData.WageAmount
    }
    
    // 'value' attribute on CurrencyInput (id=EmploymentData_OvertimeRate_Input) at PIPEmploymentInputSet.pcf: line 68, column 51
    function value_50 () : gw.api.financials.CurrencyAmount {
      return Exposure.PriorEmpData.OvertimeRate
    }
    
    // 'value' attribute on CurrencyInput (id=EmploymentData_LastYearIncome_Input) at PIPEmploymentInputSet.pcf: line 73, column 53
    function value_54 () : gw.api.financials.CurrencyAmount {
      return Exposure.PriorEmpData.LastYearIncome
    }
    
    // 'value' attribute on TypeKeyInput (id=EmploymentData_PayPeriod_Input) at PIPEmploymentInputSet.pcf: line 79, column 42
    function value_58 () : typekey.PayPeriodType {
      return Exposure.PriorEmpData.PayPeriod
    }
    
    // 'value' attribute on BooleanRadioInput (id=EmploymentData_WagePaymentCont_Input) at PIPEmploymentInputSet.pcf: line 84, column 54
    function value_62 () : java.lang.Boolean {
      return Exposure.PriorEmpData.WagePaymentCont
    }
    
    // 'value' attribute on DateInput (id=EmploymentData_InjuryStartDate_Input) at PIPEmploymentInputSet.pcf: line 92, column 54
    function value_67 () : java.util.Date {
      return Exposure.PriorEmpData.InjuryStartTime
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_DaysWorkedWeek_Input) at PIPEmploymentInputSet.pcf: line 105, column 53
    function value_78 () : java.lang.String {
      return Exposure.PriorEmpData.DaysWorkedWeek
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PIPDamages_Claimant_Input) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_13 ($$arg :  entity.Contact[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PIPDamages_Claimant_Input) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_13 ($$arg :  gw.api.database.IQueryBeanResult<entity.Contact>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PIPDamages_Claimant_Input) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRangeIsAllowedType_13 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on ClaimContactInput (id=PIPDamages_Claimant_Input) at ClaimContactWidget.xml: line 12, column 273
    function verifyValueRange_14 () : void {
      var __valueRangeArg = Exposure.Claim.getRelatedContacts(Exposure.Claim.getContactTypes(TC_CLAIMANT)) as Person[]
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_13(__valueRangeArg)
    }
    
    // 'visible' attribute on ClaimContactInput (id=PIPDamages_Claimant_Input) at ClaimContactWidget.xml: line 14, column 229
    function visible_0 () : java.lang.Boolean {
      return perm.Contact.createlocal
    }
    
    // 'visible' attribute on ClaimContactInput (id=PIPDamages_Claimant_Input) at ClaimContactWidget.xml: line 16, column 225
    function visible_3 () : java.lang.Boolean {
      return "AddressBookPickerPopup.push(statictypeof (Exposure.Claimant), Exposure.Claim, null as List<SpecialistService>)" != "" && true
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  
}