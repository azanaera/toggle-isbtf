package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/admin/coverage/InvalidCoverageForFaultLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class InvalidCoverageForFaultLVExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/admin/coverage/InvalidCoverageForFaultLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InvalidCoverageForFaultLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=PolicyType_Cell) at InvalidCoverageForFaultLV.pcf: line 31, column 42
    function sortValue_0 (InvalidCoverageForFault :  entity.InvalidCoverageForFault) : java.lang.Object {
      return InvalidCoverageForFault.PolicyType
    }
    
    // 'value' attribute on TypeKeyCell (id=PrimaryCoverage_Cell) at InvalidCoverageForFaultLV.pcf: line 41, column 44
    function sortValue_1 (InvalidCoverageForFault :  entity.InvalidCoverageForFault) : java.lang.Object {
      return InvalidCoverageForFault.PrimaryCoverage
    }
    
    // 'value' attribute on TypeKeyCell (id=Fault_Cell) at InvalidCoverageForFaultLV.pcf: line 51, column 43
    function sortValue_2 (InvalidCoverageForFault :  entity.InvalidCoverageForFault) : java.lang.Object {
      return InvalidCoverageForFault.FaultRating
    }
    
    // 'toCreateAndAdd' attribute on RowIterator at InvalidCoverageForFaultLV.pcf: line 22, column 90
    function toCreateAndAdd_19 () : entity.InvalidCoverageForFault {
      return new InvalidCoverageForFault()
    }
    
    // 'toRemove' attribute on RowIterator at InvalidCoverageForFaultLV.pcf: line 22, column 90
    function toRemove_20 (InvalidCoverageForFault :  entity.InvalidCoverageForFault) : void {
      InvalidCoverageForFault.remove()
    }
    
    // 'value' attribute on RowIterator at InvalidCoverageForFaultLV.pcf: line 22, column 90
    function value_21 () : gw.api.database.IQueryBeanResult<entity.InvalidCoverageForFault> {
      return InvalidCoverageForFaultList
    }
    
    property get InvalidCoverageForFaultList () : gw.api.database.IQueryBeanResult<InvalidCoverageForFault> {
      return getRequireValue("InvalidCoverageForFaultList", 0) as gw.api.database.IQueryBeanResult<InvalidCoverageForFault>
    }
    
    property set InvalidCoverageForFaultList ($arg :  gw.api.database.IQueryBeanResult<InvalidCoverageForFault>) {
      setRequireValue("InvalidCoverageForFaultList", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/admin/coverage/InvalidCoverageForFaultLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends InvalidCoverageForFaultLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=Fault_Cell) at InvalidCoverageForFaultLV.pcf: line 51, column 43
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      InvalidCoverageForFault.FaultRating = (__VALUE_TO_SET as typekey.FaultRating)
    }
    
    // 'value' attribute on TypeKeyCell (id=PolicyType_Cell) at InvalidCoverageForFaultLV.pcf: line 31, column 42
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      InvalidCoverageForFault.PolicyType = (__VALUE_TO_SET as typekey.PolicyType)
    }
    
    // 'value' attribute on TypeKeyCell (id=PrimaryCoverage_Cell) at InvalidCoverageForFaultLV.pcf: line 41, column 44
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      InvalidCoverageForFault.PrimaryCoverage = (__VALUE_TO_SET as typekey.CoverageType)
    }
    
    // 'editable' attribute on TypeKeyCell (id=Fault_Cell) at InvalidCoverageForFaultLV.pcf: line 51, column 43
    function editable_13 () : java.lang.Boolean {
      return InvalidCoverageForFault.PrimaryCoverage!=null
    }
    
    // 'editable' attribute on TypeKeyCell (id=PrimaryCoverage_Cell) at InvalidCoverageForFaultLV.pcf: line 41, column 44
    function editable_7 () : java.lang.Boolean {
      return InvalidCoverageForFault.PolicyType!=null
    }
    
    // 'value' attribute on TypeKeyCell (id=PolicyType_Cell) at InvalidCoverageForFaultLV.pcf: line 31, column 42
    function valueRoot_5 () : java.lang.Object {
      return InvalidCoverageForFault
    }
    
    // 'value' attribute on TypeKeyCell (id=Fault_Cell) at InvalidCoverageForFaultLV.pcf: line 51, column 43
    function value_14 () : typekey.FaultRating {
      return InvalidCoverageForFault.FaultRating
    }
    
    // 'value' attribute on TypeKeyCell (id=PolicyType_Cell) at InvalidCoverageForFaultLV.pcf: line 31, column 42
    function value_3 () : typekey.PolicyType {
      return InvalidCoverageForFault.PolicyType
    }
    
    // 'value' attribute on TypeKeyCell (id=PrimaryCoverage_Cell) at InvalidCoverageForFaultLV.pcf: line 41, column 44
    function value_8 () : typekey.CoverageType {
      return InvalidCoverageForFault.PrimaryCoverage
    }
    
    property get InvalidCoverageForFault () : entity.InvalidCoverageForFault {
      return getIteratedValue(1) as entity.InvalidCoverageForFault
    }
    
    
  }
  
  
}