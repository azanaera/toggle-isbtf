package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotExposure310DV.PIPDamages.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotExposure310DV_PIPDamagesExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotExposure310DV.PIPDamages.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposure310DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=StatusDate_Cell) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 189, column 81
    function sortValue_83 (WorkStatusChange :  dynamic.Dynamic) : java.lang.Object {
      return util.Snapshot.renderValue(WorkStatusChange.StatusDate)
    }
    
    // 'value' attribute on TextCell (id=Status_Cell) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 194, column 46
    function sortValue_84 (WorkStatusChange :  dynamic.Dynamic) : java.lang.Object {
      return WorkStatusChange.Status
    }
    
    // 'value' attribute on TextCell (id=Comments_Cell) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 199, column 46
    function sortValue_85 (WorkStatusChange :  dynamic.Dynamic) : java.lang.Object {
      return WorkStatusChange.Comments
    }
    
    // 'value' attribute on TextInput (id=LossParty_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 21, column 38
    function valueRoot_1 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TextInput (id=Contact_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 41, column 38
    function valueRoot_13 () : java.lang.Object {
      return Exposure.AssignedUser
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 96, column 38
    function valueRoot_40 () : java.lang.Object {
      return Exposure.Claimant.PrimaryAddress
    }
    
    // 'value' attribute on TextInput (id=Occupation_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 105, column 38
    function valueRoot_43 () : java.lang.Object {
      return Exposure.Claimant
    }
    
    // 'value' attribute on TextInput (id=ContactCompany_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 110, column 38
    function valueRoot_46 () : java.lang.Object {
      return Exposure.Claimant.ContactCompany
    }
    
    // 'value' attribute on TextInput (id=PrimaryContact_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 115, column 38
    function valueRoot_49 () : java.lang.Object {
      return Exposure.Claimant.ContactCompany.PrimaryContact
    }
    
    // 'value' attribute on TextInput (id=EmploymentStatus_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 124, column 38
    function valueRoot_54 () : java.lang.Object {
      return Exposure.PriorEmpData
    }
    
    // 'value' attribute on TextInput (id=LossParty_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 21, column 38
    function value_0 () : dynamic.Dynamic {
      return Exposure.LossParty
    }
    
    // 'value' attribute on TextInput (id=JurisdictionState_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 221, column 38
    function value_101 () : dynamic.Dynamic {
      return Exposure.JurisdictionState
    }
    
    // 'value' attribute on TextInput (id=Contact_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 41, column 38
    function value_12 () : dynamic.Dynamic {
      return Exposure.AssignedUser.Contact
    }
    
    // 'value' attribute on TextInput (id=State_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 46, column 38
    function value_15 () : dynamic.Dynamic {
      return Exposure.State
    }
    
    // 'value' attribute on TextInput (id=CreateTime_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 50, column 65
    function value_18 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.CreateTime)
    }
    
    // 'value' attribute on TextInput (id=CloseDate_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 54, column 64
    function value_20 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.CloseDate)
    }
    
    // 'value' attribute on TextInput (id=ReOpenDate_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 58, column 65
    function value_22 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.ReOpenDate)
    }
    
    // 'value' attribute on TextInput (id=ClosedOutcome_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 63, column 38
    function value_24 () : dynamic.Dynamic {
      return Exposure.ClosedOutcome
    }
    
    // 'value' attribute on TextInput (id=StatLine_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 68, column 38
    function value_27 () : dynamic.Dynamic {
      return Exposure.StatLine
    }
    
    // 'value' attribute on TextInput (id=PrimaryCoverage_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 26, column 38
    function value_3 () : dynamic.Dynamic {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TextInput (id=Claimant_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 75, column 63
    function value_30 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.Claimant)
    }
    
    // 'value' attribute on TextInput (id=ClaimantType_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 80, column 38
    function value_32 () : dynamic.Dynamic {
      return Exposure.ClaimantType
    }
    
    // 'value' attribute on BooleanRadioInput (id=ContactProhibited_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 87, column 38
    function value_35 () : dynamic.Dynamic {
      return util.Snapshot.getClaimant(Exposure.Claim, Exposure)["ContactProhibited"]
    }
    
    // 'value' attribute on TextInput (id=PrimaryPhone_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 91, column 67
    function value_37 () : java.lang.String {
      return util.Snapshot.getPrimaryPhone(Exposure.Claimant)
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 96, column 38
    function value_39 () : dynamic.Dynamic {
      return Exposure.Claimant.PrimaryAddress.DisplayName
    }
    
    // 'value' attribute on TextInput (id=Occupation_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 105, column 38
    function value_42 () : dynamic.Dynamic {
      return Exposure.Claimant.Occupation
    }
    
    // 'value' attribute on TextInput (id=ContactCompany_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 110, column 38
    function value_45 () : dynamic.Dynamic {
      return Exposure.Claimant.ContactCompany.DisplayName
    }
    
    // 'value' attribute on TextInput (id=PrimaryContact_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 115, column 38
    function value_48 () : dynamic.Dynamic {
      return Exposure.Claimant.ContactCompany.PrimaryContact.DisplayName
    }
    
    // 'value' attribute on TextInput (id=HireDate_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 119, column 76
    function value_51 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.PriorEmpData.HireDate)
    }
    
    // 'value' attribute on TextInput (id=EmploymentStatus_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 124, column 38
    function value_53 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.EmploymentStatus
    }
    
    // 'value' attribute on TextInput (id=NumHoursWorked_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 129, column 38
    function value_56 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.NumHoursWorked
    }
    
    // 'value' attribute on TextInput (id=NumDaysWorked_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 134, column 38
    function value_59 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.NumDaysWorked
    }
    
    // 'value' attribute on TextInput (id=CoverageSubType_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 31, column 38
    function value_6 () : dynamic.Dynamic {
      return Exposure.CoverageSubType
    }
    
    // 'value' attribute on TextInput (id=WageAmount_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 139, column 38
    function value_62 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.WageAmount
    }
    
    // 'value' attribute on TextInput (id=OvertimeRate_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 144, column 38
    function value_65 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.OvertimeRate
    }
    
    // 'value' attribute on TextInput (id=LastYearIncome_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 149, column 38
    function value_68 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.LastYearIncome
    }
    
    // 'value' attribute on TextInput (id=PayPeriod_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 154, column 38
    function value_71 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.PayPeriod
    }
    
    // 'value' attribute on BooleanRadioInput (id=WagePaymentCont_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 161, column 38
    function value_74 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.WagePaymentCont
    }
    
    // 'value' attribute on TextInput (id=InjuryStartTime_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 166, column 38
    function value_77 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.InjuryStartTime
    }
    
    // 'value' attribute on TextInput (id=DaysWorkedWeek_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 171, column 38
    function value_80 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.DaysWorkedWeek
    }
    
    // 'value' attribute on TextInput (id=Coverage_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 36, column 38
    function value_9 () : dynamic.Dynamic {
      return Exposure.Coverage
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 184, column 41
    function value_94 () : dynamic.Dynamic {
      return Exposure.PriorEmpData.WorkStatusChanges
    }
    
    // 'value' attribute on TextInput (id=Segment_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 211, column 38
    function value_95 () : dynamic.Dynamic {
      return Exposure.Segment
    }
    
    // 'value' attribute on TextInput (id=Strategy_Input) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 216, column 38
    function value_98 () : dynamic.Dynamic {
      return Exposure.Strategy
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get Exposure () : dynamic.Dynamic {
      return getRequireValue("Exposure", 0) as dynamic.Dynamic
    }
    
    property set Exposure ($arg :  dynamic.Dynamic) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/310/ClaimSnapshotExposure310DV.PIPDamages.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotExposure310DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Status_Cell) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 194, column 46
    function valueRoot_89 () : java.lang.Object {
      return WorkStatusChange
    }
    
    // 'value' attribute on TextCell (id=StatusDate_Cell) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 189, column 81
    function value_86 () : java.lang.String {
      return util.Snapshot.renderValue(WorkStatusChange.StatusDate)
    }
    
    // 'value' attribute on TextCell (id=Status_Cell) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 194, column 46
    function value_88 () : dynamic.Dynamic {
      return WorkStatusChange.Status
    }
    
    // 'value' attribute on TextCell (id=Comments_Cell) at ClaimSnapshotExposure310DV.PIPDamages.pcf: line 199, column 46
    function value_91 () : dynamic.Dynamic {
      return WorkStatusChange.Comments
    }
    
    property get WorkStatusChange () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}