package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/800/shared/ClaimSnapshotOtherCarrierInvolvementInputSet.800.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimSnapshotOtherCarrierInvolvementInputSet_800Expressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/800/shared/ClaimSnapshotOtherCarrierInvolvementInputSet.800.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotOtherCarrierInvolvementInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ClaimSnapshotOtherCarrierInvolvementInputSet.800.pcf: line 14, column 31
    function initialValue_0 () : dynamic.Dynamic {
      return ExposureParam
    }
    
    // 'value' attribute on TextCell (id=Insurer_Cell) at ClaimSnapshotOtherCarrierInvolvementInputSet.800.pcf: line 40, column 44
    function sortValue_4 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.Insurer
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber_Cell) at ClaimSnapshotOtherCarrierInvolvementInputSet.800.pcf: line 45, column 44
    function sortValue_5 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=ContactName_Cell) at ClaimSnapshotOtherCarrierInvolvementInputSet.800.pcf: line 50, column 44
    function sortValue_6 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.ContactName
    }
    
    // 'value' attribute on TextCell (id=ContactPhone_Cell) at ClaimSnapshotOtherCarrierInvolvementInputSet.800.pcf: line 56, column 44
    function sortValue_7 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.ContactPhone
    }
    
    // 'value' attribute on TextCell (id=Notes_Cell) at ClaimSnapshotOtherCarrierInvolvementInputSet.800.pcf: line 61, column 44
    function sortValue_8 (OtherCoverageDet :  dynamic.Dynamic) : java.lang.Object {
      return OtherCoverageDet.Notes
    }
    
    // 'value' attribute on BooleanRadioInput (id=OtherCoverage_Input) at ClaimSnapshotOtherCarrierInvolvementInputSet.800.pcf: line 23, column 36
    function valueRoot_2 () : java.lang.Object {
      return Exposure
    }
    
    // 'value' attribute on BooleanRadioInput (id=OtherCoverage_Input) at ClaimSnapshotOtherCarrierInvolvementInputSet.800.pcf: line 23, column 36
    function value_1 () : dynamic.Dynamic {
      return Exposure.OtherCoverage
    }
    
    // 'value' attribute on RowIterator at ClaimSnapshotOtherCarrierInvolvementInputSet.800.pcf: line 34, column 39
    function value_24 () : dynamic.Dynamic {
      return Exposure.OtherCoverageDet
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
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/snapshot/800/shared/ClaimSnapshotOtherCarrierInvolvementInputSet.800.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ClaimSnapshotOtherCarrierInvolvementInputSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Insurer_Cell) at ClaimSnapshotOtherCarrierInvolvementInputSet.800.pcf: line 40, column 44
    function valueRoot_10 () : java.lang.Object {
      return OtherCoverageDet
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber_Cell) at ClaimSnapshotOtherCarrierInvolvementInputSet.800.pcf: line 45, column 44
    function value_12 () : dynamic.Dynamic {
      return OtherCoverageDet.PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=ContactName_Cell) at ClaimSnapshotOtherCarrierInvolvementInputSet.800.pcf: line 50, column 44
    function value_15 () : dynamic.Dynamic {
      return OtherCoverageDet.ContactName
    }
    
    // 'value' attribute on TextCell (id=ContactPhone_Cell) at ClaimSnapshotOtherCarrierInvolvementInputSet.800.pcf: line 56, column 44
    function value_18 () : dynamic.Dynamic {
      return OtherCoverageDet.ContactPhone
    }
    
    // 'value' attribute on TextCell (id=Notes_Cell) at ClaimSnapshotOtherCarrierInvolvementInputSet.800.pcf: line 61, column 44
    function value_21 () : dynamic.Dynamic {
      return OtherCoverageDet.Notes
    }
    
    // 'value' attribute on TextCell (id=Insurer_Cell) at ClaimSnapshotOtherCarrierInvolvementInputSet.800.pcf: line 40, column 44
    function value_9 () : dynamic.Dynamic {
      return OtherCoverageDet.Insurer
    }
    
    property get OtherCoverageDet () : dynamic.Dynamic {
      return getIteratedValue(1) as dynamic.Dynamic
    }
    
    
  }
  
  
}