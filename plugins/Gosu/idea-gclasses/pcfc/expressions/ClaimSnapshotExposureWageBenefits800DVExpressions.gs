package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotExposureWageBenefits800DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotExposureWageBenefits800DVExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotExposureWageBenefits800DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposureWageBenefits800DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=StatusDate_Cell) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 106, column 81
    function sortValue_44 (WorkStatusChange :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(WorkStatusChange.StatusDate)
    }
    
    // 'value' attribute on TextCell (id=Status_Cell) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 111, column 46
    function sortValue_45 (WorkStatusChange :  dynamic.Dynamic) : java.lang.Object {
      return WorkStatusChange.Status
    }
    
    // 'value' attribute on TextCell (id=Comments_Cell) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 116, column 46
    function sortValue_46 (WorkStatusChange :  dynamic.Dynamic) : java.lang.Object {
      return WorkStatusChange.Comments
    }
    
    // 'value' attribute on TextInput (id=PartialPIPDamages_Employer_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 215, column 40
    function valueRoot_104 () : java.lang.Object {
      return Exposure.Employer
    }
    
    // 'value' attribute on TextInput (id=PartialEmployer_PrimaryContact_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 225, column 40
    function valueRoot_110 () : java.lang.Object {
      return Exposure.Employer.PrimaryContact
    }
    
    // 'value' attribute on TextInput (id=PartialEmploymentData_NumHoursWorkedPerDay_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 235, column 40
    function valueRoot_116 () : java.lang.Object {
      return Exposure.NewEmpData
    }
    
    // 'value' attribute on DateInput (id=EmploymentData_HireDate_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 37, column 38
    function valueRoot_12 () : java.lang.Object {
      return Exposure.PriorEmpData
    }
    
    // 'value' attribute on TextInput (id=Person_Occupation_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 21, column 38
    function valueRoot_3 () : java.lang.Object {
      return Exposure.Claimant
    }
    
    // 'value' attribute on TextInput (id=CompBenefits_BenefitsBeginDate_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 129, column 38
    function valueRoot_57 () : java.lang.Object {
      return Exposure.CompBenefits
    }
    
    // 'value' attribute on TextInput (id=Person_Employer_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 26, column 38
    function valueRoot_6 () : java.lang.Object {
      return Exposure.Claimant.ContactCompany
    }
    
    // 'value' attribute on TextInput (id=WorkersCompCollected_Question_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 152, column 38
    function valueRoot_69 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TextInput (id=PIPDamages_WCCarrier_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 159, column 40
    function valueRoot_72 () : java.lang.Object {
      return Exposure.WCCarrier
    }
    
    // 'value' attribute on TextInput (id=WCCarrier_PrimaryContact_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 169, column 40
    function valueRoot_78 () : java.lang.Object {
      return Exposure.WCCarrier.PrimaryContact
    }
    
    // 'value' attribute on TextInput (id=WCBenefits_BenefitsBeginDate_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 179, column 40
    function valueRoot_84 () : java.lang.Object {
      return Exposure.WCBenefits
    }
    
    // 'value' attribute on TextInput (id=Company_PrimaryContact_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 31, column 38
    function valueRoot_9 () : java.lang.Object {
      return Exposure.Claimant.ContactCompany.PrimaryContact
    }
    
    // 'value' attribute on TextInput (id=SSDIBenefits_BeginDate_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 194, column 40
    function valueRoot_92 () : java.lang.Object {
      return Exposure.SSDIBenefits
    }
    
    // 'value' attribute on TextInput (id=PIPDamages_Claimant_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 16, column 63
    function value_0 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.Claimant)
    }
    
    // 'value' attribute on TextInput (id=PartialWageBenefitCollected_Question_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 208, column 38
    function value_100 () : dynamic.Dynamic {
      return Exposure.WageBenefit
    }
    
    // 'value' attribute on TextInput (id=PartialPIPDamages_Employer_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 215, column 40
    function value_103 () : dynamic.Dynamic {
      return Exposure.Employer.DisplayName
    }
    
    // 'value' attribute on TextInput (id=PartialEmployer_PrimaryAddress_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 220, column 40
    function value_106 () : dynamic.Dynamic {
      return Exposure.Employer.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on TextInput (id=PartialEmployer_PrimaryContact_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 225, column 40
    function value_109 () : dynamic.Dynamic {
      return Exposure.Employer.PrimaryContact.DisplayName
    }
    
    // 'value' attribute on DateInput (id=EmploymentData_HireDate_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 37, column 38
    function value_11 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.HireDate
    }
    
    // 'value' attribute on TextInput (id=PartialEmployer_PrimaryPhone_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 230, column 40
    function value_112 () : dynamic.Dynamic {
      return Exposure.Employer.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextInput (id=PartialEmploymentData_NumHoursWorkedPerDay_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 235, column 40
    function value_115 () : dynamic.Dynamic {
      return Exposure.NewEmpData.NumHoursWorked
    }
    
    // 'value' attribute on TextInput (id=PartialEmploymentData_NumDaysWorkedPerWeek_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 240, column 40
    function value_118 () : dynamic.Dynamic {
      return Exposure.NewEmpData.NumDaysWorked
    }
    
    // 'value' attribute on TextInput (id=PartialEmploymentData_WageAmount_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 245, column 40
    function value_121 () : dynamic.Dynamic {
      return Exposure.NewEmpData.WageAmount
    }
    
    // 'value' attribute on TextInput (id=PartialEmploymentData_PayPeriod_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 250, column 40
    function value_124 () : dynamic.Dynamic {
      return Exposure.NewEmpData.PayPeriod
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_EmploymentStatus_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 42, column 38
    function value_14 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.EmploymentStatus
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_NumHoursWorkedPerDay_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 47, column 38
    function value_17 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.NumHoursWorked
    }
    
    // 'value' attribute on TextInput (id=Person_Occupation_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 21, column 38
    function value_2 () : dynamic.Dynamic {
      return Exposure.Claimant.Occupation
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_NumDaysWorkedPerWeek_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 52, column 38
    function value_20 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.NumDaysWorked
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_WageAmount_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 57, column 38
    function value_23 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.WageAmount
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_OvertimeRate_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 62, column 38
    function value_26 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.OvertimeRate
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_LastYearIncome_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 67, column 38
    function value_29 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.LastYearIncome
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_PayPeriod_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 72, column 38
    function value_32 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.PayPeriod
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_WagePaymentCont_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 77, column 38
    function value_35 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.WagePaymentCont
    }
    
    // 'value' attribute on DateInput (id=EmploymentData_InjuryStartTime_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 84, column 38
    function value_38 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.InjuryStartTime
    }
    
    // 'value' attribute on TextInput (id=EmploymentData_DaysWorkedWeek_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 89, column 38
    function value_41 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.DaysWorkedWeek
    }
    
    // 'value' attribute on TextInput (id=Person_Employer_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 26, column 38
    function value_5 () : dynamic.Dynamic {
      return Exposure.Claimant.ContactCompany.DisplayName
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposureWageBenefits800DV.pcf: line 101, column 41
    function value_55 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.WorkStatusChanges
    }
    
    // 'value' attribute on TextInput (id=CompBenefits_BenefitsBeginDate_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 129, column 38
    function value_56 () : dynamic.Dynamic {
      return Exposure.CompBenefits.BenefitsBeginDate
    }
    
    // 'value' attribute on TextInput (id=CompBenefits_BenefitsEndDate_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 134, column 38
    function value_59 () : dynamic.Dynamic {
      return Exposure.CompBenefits.BenefitsEndDate
    }
    
    // 'value' attribute on TextInput (id=CompBenefits_WeeklyCompRate_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 139, column 38
    function value_62 () : dynamic.Dynamic {
      return Exposure.CompBenefits.WeeklyCompRate
    }
    
    // 'value' attribute on TextInput (id=CompBenefits_PaymentFrequency_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 144, column 38
    function value_65 () : dynamic.Dynamic {
      return Exposure.CompBenefits.PaymentFrequency
    }
    
    // 'value' attribute on TextInput (id=WorkersCompCollected_Question_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 152, column 38
    function value_68 () : dynamic.Dynamic {
      return Exposure.WCBenefit
    }
    
    // 'value' attribute on TextInput (id=PIPDamages_WCCarrier_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 159, column 40
    function value_71 () : dynamic.Dynamic {
      return Exposure.WCCarrier.DisplayName
    }
    
    // 'value' attribute on TextInput (id=WCCarrier_PrimaryAddress_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 164, column 40
    function value_74 () : dynamic.Dynamic {
      return Exposure.WCCarrier.PrimaryAddressDisplayValue
    }
    
    // 'value' attribute on TextInput (id=WCCarrier_PrimaryContact_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 169, column 40
    function value_77 () : dynamic.Dynamic {
      return Exposure.WCCarrier.PrimaryContact.DisplayName
    }
    
    // 'value' attribute on TextInput (id=Company_PrimaryContact_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 31, column 38
    function value_8 () : dynamic.Dynamic {
      return Exposure.Claimant.ContactCompany.PrimaryContact.DisplayName
    }
    
    // 'value' attribute on TextInput (id=WCCarrier_PrimaryPhone_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 174, column 40
    function value_80 () : dynamic.Dynamic {
      return Exposure.WCCarrier.PrimaryPhoneValue
    }
    
    // 'value' attribute on TextInput (id=WCBenefits_BenefitsBeginDate_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 179, column 40
    function value_83 () : dynamic.Dynamic {
      return Exposure.WCBenefits.BenefitsBeginDate
    }
    
    // 'value' attribute on TextInput (id=SSCollected_Question_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 188, column 38
    function value_87 () : dynamic.Dynamic {
      return Exposure.SSBenefit
    }
    
    // 'value' attribute on TextInput (id=SSDIBenefits_BeginDate_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 194, column 40
    function value_91 () : dynamic.Dynamic {
      return Exposure.SSDIBenefits.BenefitsBeginDate
    }
    
    // 'value' attribute on TextInput (id=LostWagesBenefits_MonthlyCompRate_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 200, column 40
    function value_96 () : dynamic.Dynamic {
      return Exposure.SSDIBenefits.MonthlyCompRate
    }
    
    // 'visible' attribute on InputSet at ClaimSnapshotExposureWageBenefits800DV.pcf: line 210, column 40
    function visible_127 () : java.lang.Boolean {
      return Exposure.WageBenefit
    }
    
    // 'visible' attribute on InputSet at ClaimSnapshotExposureWageBenefits800DV.pcf: line 154, column 38
    function visible_86 () : java.lang.Boolean {
      return Exposure.WCBenefit
    }
    
    // 'visible' attribute on TextInput (id=SSDIBenefits_BeginDate_Input) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 194, column 40
    function visible_90 () : java.lang.Boolean {
      return  Exposure.SSBenefit
    }
    
    property get Exposure () : dynamic.Dynamic {
      return getRequireValue("Exposure", 0) as dynamic.Dynamic
    }
    
    property set Exposure ($arg :  dynamic.Dynamic) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotExposureWageBenefits800DV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotExposureWageBenefits800DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Status_Cell) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 111, column 46
    function valueRoot_50 () : java.lang.Object {
      return WorkStatusChange
    }
    
    // 'value' attribute on TextCell (id=StatusDate_Cell) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 106, column 81
    function value_47 () : java.lang.String {
      return util.Snapshot.renderValue(WorkStatusChange.StatusDate)
    }
    
    // 'value' attribute on TextCell (id=Status_Cell) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 111, column 46
    function value_49 () : dynamic.Dynamic {
      return WorkStatusChange.Status
    }
    
    // 'value' attribute on TextCell (id=Comments_Cell) at ClaimSnapshotExposureWageBenefits800DV.pcf: line 116, column 46
    function value_52 () : dynamic.Dynamic {
      return WorkStatusChange.Comments
    }
    
    property get WorkStatusChange () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}