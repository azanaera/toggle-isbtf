package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotExposure800DV_BodilyInjuryDamageExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposure800DVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=PrimaryBodyPart_Cell) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 117, column 46
    function sortValue_42 (BodyPart :  dynamic.Dynamic) : java.lang.Object {
      return BodyPart.PrimaryBodyPart
    }
    
    // 'value' attribute on TextCell (id=DetailedBodyPart_Cell) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 122, column 46
    function sortValue_43 (BodyPart :  dynamic.Dynamic) : java.lang.Object {
      return BodyPart.DetailedBodyPart
    }
    
    // 'value' attribute on TextCell (id=CompensabilityDecision_Cell) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 127, column 46
    function sortValue_44 (BodyPart :  dynamic.Dynamic) : java.lang.Object {
      return BodyPart.CompensabilityDecision
    }
    
    // 'value' attribute on TextCell (id=CompensabilityDecisionDate_Cell) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 132, column 46
    function sortValue_45 (BodyPart :  dynamic.Dynamic) : java.lang.Object {
      return BodyPart.CompensabilityDecisionDate
    }
    
    // 'value' attribute on TextCell (id=CompensabilityComments_Cell) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 137, column 46
    function sortValue_46 (BodyPart :  dynamic.Dynamic) : java.lang.Object {
      return BodyPart.CompensabilityComments
    }
    
    // 'value' attribute on TextCell (id=Insurer_Cell) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 203, column 46
    function sortValue_83 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.Insurer
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber_Cell) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 208, column 46
    function sortValue_84 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=ContactName_Cell) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 213, column 46
    function sortValue_85 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.ContactName
    }
    
    // 'value' attribute on TextCell (id=ContactPhone_Cell) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 219, column 46
    function sortValue_86 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.ContactPhone
    }
    
    // 'value' attribute on TextCell (id=Notes_Cell) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 224, column 46
    function sortValue_87 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.Notes
    }
    
    // 'value' attribute on TextInput (id=LossParty_Input) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 21, column 38
    function valueRoot_1 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress_Input) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 72, column 38
    function valueRoot_26 () : java.lang.Object {
      return Exposure.Claimant.PrimaryAddress
    }
    
    // 'value' attribute on TextInput (id=Severity_Input) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 84, column 38
    function valueRoot_31 () : java.lang.Object {
      return Exposure.Incident
    }
    
    // 'value' attribute on TextInput (id=LeadingInjury_Input) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 89, column 38
    function valueRoot_34 () : java.lang.Object {
      return Exposure.InjuryIncident
    }
    
    // 'value' attribute on TextInput (id=LossParty_Input) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 21, column 38
    function value_0 () : dynamic.Dynamic {
      return Exposure.LossParty
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 197, column 41
    function value_103 () : dynamic.Dynamic {
      return Exposure.OtherCoverageDet
    }
    
    // 'value' attribute on TextInput (id=CreateTime_Input) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 39, column 65
    function value_11 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.CreateTime)
    }
    
    // 'value' attribute on TextInput (id=StatLine_Input) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 44, column 38
    function value_13 () : dynamic.Dynamic {
      return Exposure.StatLine
    }
    
    // 'value' attribute on TextInput (id=Claimant_Input) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 51, column 63
    function value_16 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.Claimant)
    }
    
    // 'value' attribute on TextInput (id=ClaimantType_Input) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 56, column 38
    function value_18 () : dynamic.Dynamic {
      return Exposure.ClaimantType
    }
    
    // 'value' attribute on BooleanRadioInput (id=ContactProhibited_Input) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 63, column 38
    function value_21 () : dynamic.Dynamic {
      return util.Snapshot.getClaimant(Exposure.Claim, Exposure)["ContactProhibited"]
    }
    
    // 'value' attribute on TextInput (id=PrimaryPhone_Input) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 67, column 67
    function value_23 () : java.lang.String {
      return util.Snapshot.getPrimaryPhone(Exposure.Claimant)
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress_Input) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 72, column 38
    function value_25 () : dynamic.Dynamic {
      return Exposure.Claimant.PrimaryAddress.DisplayName
    }
    
    // 'value' attribute on TextInput (id=AltContact_Input) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 76, column 65
    function value_28 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.AltContact)
    }
    
    // 'value' attribute on TextInput (id=PrimaryCoverage_Input) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 26, column 38
    function value_3 () : dynamic.Dynamic {
      return Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TextInput (id=Severity_Input) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 84, column 38
    function value_30 () : dynamic.Dynamic {
      return Exposure.Incident.Severity
    }
    
    // 'value' attribute on TextInput (id=LeadingInjury_Input) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 89, column 38
    function value_33 () : dynamic.Dynamic {
      return Exposure.InjuryIncident.GeneralInjuryType
    }
    
    // 'value' attribute on TextInput (id=DetailedInjury_Input) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 94, column 38
    function value_36 () : dynamic.Dynamic {
      return Exposure.InjuryIncident.DetailedInjuryType
    }
    
    // 'value' attribute on TextAreaInput (id=Description_Input) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 100, column 38
    function value_39 () : dynamic.Dynamic {
      return Exposure.Incident.Description
    }
    
    // 'value' attribute on TextInput (id=CoverageSubType_Input) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 31, column 38
    function value_6 () : dynamic.Dynamic {
      return Exposure.CoverageSubType
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 111, column 41
    function value_62 () : dynamic.Dynamic {
      return Exposure.InjuryIncident.BodyParts
    }
    
    // 'value' attribute on TextInput (id=PrimaryDoctor_Input) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 145, column 83
    function value_63 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.InjuryIncident.PrimaryDoctor)
    }
    
    // 'value' attribute on TextInput (id=MedicalTreatment_Input) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 150, column 38
    function value_65 () : dynamic.Dynamic {
      return Exposure.InjuryIncident.MedicalTreatmentType
    }
    
    // 'value' attribute on BooleanRadioInput (id=LostWages_Input) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 157, column 38
    function value_68 () : dynamic.Dynamic {
      return Exposure.InjuryIncident.LostWages
    }
    
    // 'value' attribute on TextInput (id=Impairment_Input) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 162, column 38
    function value_71 () : dynamic.Dynamic {
      return Exposure.InjuryIncident.Impairment
    }
    
    // 'value' attribute on TextInput (id=LossEstimate_Input) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 167, column 38
    function value_74 () : dynamic.Dynamic {
      return Exposure.Incident.LossEstimate
    }
    
    // 'value' attribute on TextInput (id=JurisdictionState_Input) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 177, column 38
    function value_77 () : dynamic.Dynamic {
      return Exposure.JurisdictionState
    }
    
    // 'value' attribute on BooleanRadioInput (id=OtherCoverage_Input) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 187, column 38
    function value_80 () : dynamic.Dynamic {
      return Exposure.OtherCoverage
    }
    
    // 'value' attribute on TextInput (id=Coverage_Input) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 35, column 63
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
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends ClaimSnapshotExposure800DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Insurer_Cell) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 203, column 46
    function valueRoot_89 () : java.lang.Object {
      return OtherCoverageDet
    }
    
    // 'value' attribute on TextCell (id=Notes_Cell) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 224, column 46
    function value_100 () : dynamic.Dynamic {
      return OtherCoverageDet.Notes
    }
    
    // 'value' attribute on TextCell (id=Insurer_Cell) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 203, column 46
    function value_88 () : dynamic.Dynamic {
      return OtherCoverageDet.Insurer
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber_Cell) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 208, column 46
    function value_91 () : dynamic.Dynamic {
      return OtherCoverageDet.PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=ContactName_Cell) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 213, column 46
    function value_94 () : dynamic.Dynamic {
      return OtherCoverageDet.ContactName
    }
    
    // 'value' attribute on TextCell (id=ContactPhone_Cell) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 219, column 46
    function value_97 () : dynamic.Dynamic {
      return OtherCoverageDet.ContactPhone
    }
    
    property get OtherCoverageDet () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/800/ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotExposure800DVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=PrimaryBodyPart_Cell) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 117, column 46
    function valueRoot_48 () : java.lang.Object {
      return BodyPart
    }
    
    // 'value' attribute on TextCell (id=PrimaryBodyPart_Cell) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 117, column 46
    function value_47 () : dynamic.Dynamic {
      return BodyPart.PrimaryBodyPart
    }
    
    // 'value' attribute on TextCell (id=DetailedBodyPart_Cell) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 122, column 46
    function value_50 () : dynamic.Dynamic {
      return BodyPart.DetailedBodyPart
    }
    
    // 'value' attribute on TextCell (id=CompensabilityDecision_Cell) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 127, column 46
    function value_53 () : dynamic.Dynamic {
      return BodyPart.CompensabilityDecision
    }
    
    // 'value' attribute on TextCell (id=CompensabilityDecisionDate_Cell) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 132, column 46
    function value_56 () : dynamic.Dynamic {
      return BodyPart.CompensabilityDecisionDate
    }
    
    // 'value' attribute on TextCell (id=CompensabilityComments_Cell) at ClaimSnapshotExposure800DV.BodilyInjuryDamage.pcf: line 137, column 46
    function value_59 () : dynamic.Dynamic {
      return BodyPart.CompensabilityComments
    }
    
    property get BodyPart () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}