package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/lossdetails/EditableContributingFactorsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class EditableContributingFactorsLVExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/lossdetails/EditableContributingFactorsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableContributingFactorsLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=EditableContributingFactors_contribprimary_Cell) at EditableContributingFactorsLV.pcf: line 29, column 55
    function sortValue_0 (ContribFactors :  entity.ContribFactor) : java.lang.Object {
      return ContribFactors.PriContributingFactors
    }
    
    // 'value' attribute on TypeKeyCell (id=EditableContributingFactors_contribsecond_Cell) at EditableContributingFactorsLV.pcf: line 37, column 55
    function sortValue_1 (ContribFactors :  entity.ContribFactor) : java.lang.Object {
      return ContribFactors.SecContributingFactors
    }
    
    // 'value' attribute on TypeKeyCell (id=EditableContributingFactors_contribresult_Cell) at EditableContributingFactorsLV.pcf: line 45, column 55
    function sortValue_2 (ContribFactors :  entity.ContribFactor) : java.lang.Object {
      return ContribFactors.ResContributingFactors
    }
    
    // 'value' attribute on TextCell (id=EditableContributingFactors_Text_Cell) at EditableContributingFactorsLV.pcf: line 52, column 48
    function sortValue_3 (ContribFactors :  entity.ContribFactor) : java.lang.Object {
      return ContribFactors.ContFactText
    }
    
    // 'toAdd' attribute on RowIterator at EditableContributingFactorsLV.pcf: line 20, column 42
    function toAdd_20 (ContribFactors :  entity.ContribFactor) : void {
      Claim.addToContribFactors(ContribFactors)
    }
    
    // 'toRemove' attribute on RowIterator at EditableContributingFactorsLV.pcf: line 20, column 42
    function toRemove_21 (ContribFactors :  entity.ContribFactor) : void {
      Claim.removeFromContribFactors(ContribFactors)
    }
    
    // 'value' attribute on RowIterator at EditableContributingFactorsLV.pcf: line 20, column 42
    function value_22 () : entity.ContribFactor[] {
      return Claim.ContribFactors
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/lossdetails/EditableContributingFactorsLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends EditableContributingFactorsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=EditableContributingFactors_contribresult_Cell) at EditableContributingFactorsLV.pcf: line 45, column 55
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      ContribFactors.ResContributingFactors = (__VALUE_TO_SET as typekey.ResContributingFactors)
    }
    
    // 'value' attribute on TextCell (id=EditableContributingFactors_Text_Cell) at EditableContributingFactorsLV.pcf: line 52, column 48
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      ContribFactors.ContFactText = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyCell (id=EditableContributingFactors_contribprimary_Cell) at EditableContributingFactorsLV.pcf: line 29, column 55
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      ContribFactors.PriContributingFactors = (__VALUE_TO_SET as typekey.PriContributingFactors)
    }
    
    // 'value' attribute on TypeKeyCell (id=EditableContributingFactors_contribsecond_Cell) at EditableContributingFactorsLV.pcf: line 37, column 55
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      ContribFactors.SecContributingFactors = (__VALUE_TO_SET as typekey.SecContributingFactors)
    }
    
    // 'value' attribute on TypeKeyCell (id=EditableContributingFactors_contribprimary_Cell) at EditableContributingFactorsLV.pcf: line 29, column 55
    function valueRoot_6 () : java.lang.Object {
      return ContribFactors
    }
    
    // 'value' attribute on TypeKeyCell (id=EditableContributingFactors_contribresult_Cell) at EditableContributingFactorsLV.pcf: line 45, column 55
    function value_12 () : typekey.ResContributingFactors {
      return ContribFactors.ResContributingFactors
    }
    
    // 'value' attribute on TextCell (id=EditableContributingFactors_Text_Cell) at EditableContributingFactorsLV.pcf: line 52, column 48
    function value_16 () : java.lang.String {
      return ContribFactors.ContFactText
    }
    
    // 'value' attribute on TypeKeyCell (id=EditableContributingFactors_contribprimary_Cell) at EditableContributingFactorsLV.pcf: line 29, column 55
    function value_4 () : typekey.PriContributingFactors {
      return ContribFactors.PriContributingFactors
    }
    
    // 'value' attribute on TypeKeyCell (id=EditableContributingFactors_contribsecond_Cell) at EditableContributingFactorsLV.pcf: line 37, column 55
    function value_8 () : typekey.SecContributingFactors {
      return ContribFactors.SecContributingFactors
    }
    
    property get ContribFactors () : entity.ContribFactor {
      return getIteratedValue(1) as entity.ContribFactor
    }
    
    
  }
  
  
}