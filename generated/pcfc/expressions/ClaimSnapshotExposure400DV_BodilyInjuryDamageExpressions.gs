package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotExposure400DV_BodilyInjuryDamageExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposure400DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Insurer_Cell) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 172, column 46
    function sortValue_68 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.Insurer
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber_Cell) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 177, column 46
    function sortValue_69 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=ContactName_Cell) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 182, column 46
    function sortValue_70 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.ContactName
    }
    
    // 'value' attribute on TextCell (id=ContactPhone_Cell) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 188, column 46
    function sortValue_71 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.ContactPhone
    }
    
    // 'value' attribute on TextCell (id=Notes_Cell) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 193, column 46
    function sortValue_72 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.Notes
    }
    
    // 'value' attribute on TextInput (id=LossParty_Input) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 21, column 38
    function valueRoot_1 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress_Input) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 72, column 38
    function valueRoot_26 () : java.lang.Object {
      return Exposure.Claimant.PrimaryAddress
    }
    
    // 'value' attribute on TextAreaInput (id=Description_Input) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 110, column 38
    function valueRoot_46 () : java.lang.Object {
      return Exposure.Incident
    }
    
    // 'value' attribute on TextInput (id=LossParty_Input) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 21, column 38
    function value_0 () : dynamic.Dynamic {
      return Exposure.LossParty
    }
    
    // 'value' attribute on TextInput (id=CreateTime_Input) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 39, column 65
    function value_11 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.CreateTime)
    }
    
    // 'value' attribute on TextInput (id=StatLine_Input) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 44, column 38
    function value_13 () : dynamic.Dynamic {
      return Exposure.StatLine
    }
    
    // 'value' attribute on TextInput (id=Claimant_Input) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 51, column 63
    function value_16 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.Claimant)
    }
    
    // 'value' attribute on TextInput (id=ClaimantType_Input) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 56, column 38
    function value_18 () : dynamic.Dynamic {
      return Exposure.ClaimantType
    }
    
    // 'value' attribute on BooleanRadioInput (id=ContactProhibited_Input) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 63, column 38
    function value_21 () : dynamic.Dynamic {
      return util.Snapshot.getClaimant(Exposure.Claim, Exposure)["ContactProhibited"]
    }
    
    // 'value' attribute on TextInput (id=PrimaryPhone_Input) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 67, column 67
    function value_23 () : java.lang.String {
      return util.Snapshot.getPrimaryPhone(Exposure.Claimant)
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress_Input) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 72, column 38
    function value_25 () : dynamic.Dynamic {
      return Exposure.Claimant.PrimaryAddress.DisplayName
    }
    
    // 'value' attribute on TextInput (id=AltContact_Input) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 76, column 65
    function value_28 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.AltContact)
    }
    
    // 'value' attribute on TextInput (id=PrimaryCoverage_Input) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 26, column 38
    function value_3 () : dynamic.Dynamic {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TextInput (id=Severity_Input) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 84, column 38
    function value_30 () : dynamic.Dynamic {
      return Exposure.Severity
    }
    
    // 'value' attribute on TextInput (id=LeadingInjury_Input) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 89, column 38
    function value_33 () : dynamic.Dynamic {
      return Exposure.LeadingInjury
    }
    
    // 'value' attribute on TextInput (id=DetailedInjury_Input) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 94, column 38
    function value_36 () : dynamic.Dynamic {
      return Exposure.DetailedInjury
    }
    
    // 'value' attribute on TextInput (id=PrimaryBodyPart_Input) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 99, column 38
    function value_39 () : dynamic.Dynamic {
      return Exposure.PrimaryBodyPart
    }
    
    // 'value' attribute on TextInput (id=DetailedBodyPart_Input) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 104, column 38
    function value_42 () : dynamic.Dynamic {
      return Exposure.DetailedBodyPart
    }
    
    // 'value' attribute on TextAreaInput (id=Description_Input) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 110, column 38
    function value_45 () : dynamic.Dynamic {
      return Exposure.Incident.Description
    }
    
    // 'value' attribute on TextInput (id=PrimaryDoctor_Input) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 114, column 68
    function value_48 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.PrimaryDoctor)
    }
    
    // 'value' attribute on TextInput (id=MedicalTreatment_Input) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 119, column 38
    function value_50 () : dynamic.Dynamic {
      return Exposure.MedicalTreatment
    }
    
    // 'value' attribute on BooleanRadioInput (id=LostWages_Input) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 126, column 38
    function value_53 () : dynamic.Dynamic {
      return Exposure.LostWages
    }
    
    // 'value' attribute on TextInput (id=Impairment_Input) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 131, column 38
    function value_56 () : dynamic.Dynamic {
      return Exposure.Impairment
    }
    
    // 'value' attribute on TextInput (id=LossEstimate_Input) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 136, column 38
    function value_59 () : dynamic.Dynamic {
      return Exposure.LossEstimate
    }
    
    // 'value' attribute on TextInput (id=CoverageSubType_Input) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 31, column 38
    function value_6 () : dynamic.Dynamic {
      return Exposure.CoverageSubType
    }
    
    // 'value' attribute on TextInput (id=JurisdictionState_Input) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 146, column 38
    function value_62 () : dynamic.Dynamic {
      return Exposure.JurisdictionState
    }
    
    // 'value' attribute on BooleanRadioInput (id=OtherCoverage_Input) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 156, column 38
    function value_65 () : dynamic.Dynamic {
      return Exposure.OtherCoverage
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 166, column 41
    function value_88 () : dynamic.Dynamic {
      return Exposure.OtherCoverageDet
    }
    
    // 'value' attribute on TextInput (id=Coverage_Input) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 35, column 63
    function value_9 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.Coverage)
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
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/400/ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotExposure400DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Insurer_Cell) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 172, column 46
    function valueRoot_74 () : java.lang.Object {
      return OtherCoverageDet
    }
    
    // 'value' attribute on TextCell (id=Insurer_Cell) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 172, column 46
    function value_73 () : dynamic.Dynamic {
      return OtherCoverageDet.Insurer
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber_Cell) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 177, column 46
    function value_76 () : dynamic.Dynamic {
      return OtherCoverageDet.PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=ContactName_Cell) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 182, column 46
    function value_79 () : dynamic.Dynamic {
      return OtherCoverageDet.ContactName
    }
    
    // 'value' attribute on TextCell (id=ContactPhone_Cell) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 188, column 46
    function value_82 () : dynamic.Dynamic {
      return OtherCoverageDet.ContactPhone
    }
    
    // 'value' attribute on TextCell (id=Notes_Cell) at ClaimSnapshotExposure400DV.BodilyInjuryDamage.pcf: line 193, column 46
    function value_85 () : dynamic.Dynamic {
      return OtherCoverageDet.Notes
    }
    
    property get OtherCoverageDet () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}