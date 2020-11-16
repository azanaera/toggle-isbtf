package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/700/shared/ClaimSnapshotExposureDetailInputSet.700.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotExposureDetailInputSet_700Expressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/700/shared/ClaimSnapshotExposureDetailInputSet.700.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotExposureDetailInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotExposureDetailInputSet.700.pcf: line 14, column 31
    function initialValue_0 () : dynamic.Dynamic {
      return ExposureParam
    }
    
    // 'value' attribute on TextInput (id=LossParty_Input) at ClaimSnapshotExposureDetailInputSet.700.pcf: line 21, column 36
    function valueRoot_2 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress_Input) at ClaimSnapshotExposureDetailInputSet.700.pcf: line 72, column 36
    function valueRoot_27 () : java.lang.Object {
      return Exposure.Claimant.PrimaryAddress
    }
    
    // 'value' attribute on TextInput (id=Severity_Input) at ClaimSnapshotExposureDetailInputSet.700.pcf: line 26, column 36
    function valueRoot_5 () : java.lang.Object {
      return Exposure.Incident
    }
    
    // 'value' attribute on TextInput (id=LossParty_Input) at ClaimSnapshotExposureDetailInputSet.700.pcf: line 21, column 36
    function value_1 () : dynamic.Dynamic {
      return Exposure.LossParty
    }
    
    // 'value' attribute on TextInput (id=CoverageSubType_Input) at ClaimSnapshotExposureDetailInputSet.700.pcf: line 36, column 36
    function value_10 () : dynamic.Dynamic {
      return Exposure.CoverageSubType
    }
    
    // 'value' attribute on TextInput (id=Coverage_Input) at ClaimSnapshotExposureDetailInputSet.700.pcf: line 40, column 61
    function value_13 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.Coverage)
    }
    
    // 'value' attribute on TextInput (id=CreateTime_Input) at ClaimSnapshotExposureDetailInputSet.700.pcf: line 44, column 63
    function value_15 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.CreateTime)
    }
    
    // 'value' attribute on TextInput (id=Claimant_Input) at ClaimSnapshotExposureDetailInputSet.700.pcf: line 51, column 61
    function value_17 () : java.lang.String {
      return util.Snapshot.renderValue(Exposure.Claimant)
    }
    
    // 'value' attribute on TextInput (id=ClaimantType_Input) at ClaimSnapshotExposureDetailInputSet.700.pcf: line 56, column 36
    function value_19 () : dynamic.Dynamic {
      return Exposure.ClaimantType
    }
    
    // 'value' attribute on BooleanRadioInput (id=ContactProhibited_Input) at ClaimSnapshotExposureDetailInputSet.700.pcf: line 63, column 36
    function value_22 () : dynamic.Dynamic {
      return util.Snapshot.getClaimant(Exposure.Claim, Exposure)["ContactProhibited"]
    }
    
    // 'value' attribute on TextInput (id=PrimaryPhone_Input) at ClaimSnapshotExposureDetailInputSet.700.pcf: line 67, column 65
    function value_24 () : java.lang.String {
      return util.Snapshot.getPrimaryPhone(Exposure.Claimant)
    }
    
    // 'value' attribute on TextInput (id=PrimaryAddress_Input) at ClaimSnapshotExposureDetailInputSet.700.pcf: line 72, column 36
    function value_26 () : dynamic.Dynamic {
      return Exposure.Claimant.PrimaryAddress.DisplayName
    }
    
    // 'value' attribute on TextInput (id=Severity_Input) at ClaimSnapshotExposureDetailInputSet.700.pcf: line 26, column 36
    function value_4 () : dynamic.Dynamic {
      return Exposure.Incident.Severity
    }
    
    // 'value' attribute on TextInput (id=PrimaryCoverage_Input) at ClaimSnapshotExposureDetailInputSet.700.pcf: line 31, column 36
    function value_7 () : dynamic.Dynamic {
      return Exposure.PrimaryCoverage
    }
    
    property get Exposure () : dynamic.Dynamic {
      return getVariableValue("Exposure", 0) as dynamic.Dynamic
    }
    
    property set Exposure ($arg :  dynamic.Dynamic) {
      setVariableValue("Exposure", 0, $arg)
    }
    
    property get ExposureParam () : dynamic.Dynamic {
      return getRequireValue("ExposureParam", 0) as dynamic.Dynamic
    }
    
    property set ExposureParam ($arg :  dynamic.Dynamic) {
      setRequireValue("ExposureParam", 0, $arg)
    }
    
    
  }
  
  
}