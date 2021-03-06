package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/admin/coverage/InvalidCoverageForCauseLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class InvalidCoverageForCauseLVExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/admin/coverage/InvalidCoverageForCauseLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InvalidCoverageForCauseLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=LossType_Cell) at InvalidCoverageForCauseLV.pcf: line 31, column 40
    function sortValue_0 (InvalidCoverageForCause :  entity.InvalidCoverageForCause) : java.lang.Object {
      return InvalidCoverageForCause.LossType
    }
    
    // 'value' attribute on TypeKeyCell (id=LOBCode_Cell) at InvalidCoverageForCauseLV.pcf: line 41, column 39
    function sortValue_1 (InvalidCoverageForCause :  entity.InvalidCoverageForCause) : java.lang.Object {
      return InvalidCoverageForCause.LOBCode
    }
    
    // 'value' attribute on TypeKeyCell (id=PolicyType_Cell) at InvalidCoverageForCauseLV.pcf: line 51, column 42
    function sortValue_2 (InvalidCoverageForCause :  entity.InvalidCoverageForCause) : java.lang.Object {
      return InvalidCoverageForCause.PolicyType
    }
    
    // 'value' attribute on TypeKeyCell (id=LossCause_Cell) at InvalidCoverageForCauseLV.pcf: line 61, column 41
    function sortValue_3 (InvalidCoverageForCause :  entity.InvalidCoverageForCause) : java.lang.Object {
      return InvalidCoverageForCause.LossCause
    }
    
    // 'value' attribute on TypeKeyCell (id=PrimaryCoverage_Cell) at InvalidCoverageForCauseLV.pcf: line 71, column 45
    function sortValue_4 (InvalidCoverageForCause :  entity.InvalidCoverageForCause) : java.lang.Object {
      return InvalidCoverageForCause.PrimaryCoverage
    }
    
    // 'toCreateAndAdd' attribute on RowIterator at InvalidCoverageForCauseLV.pcf: line 22, column 90
    function toCreateAndAdd_33 () : entity.InvalidCoverageForCause {
      return new InvalidCoverageForCause()
    }
    
    // 'toRemove' attribute on RowIterator at InvalidCoverageForCauseLV.pcf: line 22, column 90
    function toRemove_34 (InvalidCoverageForCause :  entity.InvalidCoverageForCause) : void {
      InvalidCoverageForCause.remove()
    }
    
    // 'value' attribute on RowIterator at InvalidCoverageForCauseLV.pcf: line 22, column 90
    function value_35 () : gw.api.database.IQueryBeanResult<entity.InvalidCoverageForCause> {
      return InvalidCoverageForCauseList
    }
    
    property get InvalidCoverageForCauseList () : gw.api.database.IQueryBeanResult<InvalidCoverageForCause> {
      return getRequireValue("InvalidCoverageForCauseList", 0) as gw.api.database.IQueryBeanResult<InvalidCoverageForCause>
    }
    
    property set InvalidCoverageForCauseList ($arg :  gw.api.database.IQueryBeanResult<InvalidCoverageForCause>) {
      setRequireValue("InvalidCoverageForCauseList", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/admin/coverage/InvalidCoverageForCauseLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends InvalidCoverageForCauseLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=LOBCode_Cell) at InvalidCoverageForCauseLV.pcf: line 41, column 39
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      InvalidCoverageForCause.LOBCode = (__VALUE_TO_SET as typekey.LOBCode)
    }
    
    // 'value' attribute on TypeKeyCell (id=PolicyType_Cell) at InvalidCoverageForCauseLV.pcf: line 51, column 42
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      InvalidCoverageForCause.PolicyType = (__VALUE_TO_SET as typekey.PolicyType)
    }
    
    // 'value' attribute on TypeKeyCell (id=LossCause_Cell) at InvalidCoverageForCauseLV.pcf: line 61, column 41
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      InvalidCoverageForCause.LossCause = (__VALUE_TO_SET as typekey.LossCause)
    }
    
    // 'value' attribute on TypeKeyCell (id=PrimaryCoverage_Cell) at InvalidCoverageForCauseLV.pcf: line 71, column 45
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      InvalidCoverageForCause.PrimaryCoverage = (__VALUE_TO_SET as typekey.CoverageType)
    }
    
    // 'value' attribute on TypeKeyCell (id=LossType_Cell) at InvalidCoverageForCauseLV.pcf: line 31, column 40
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      InvalidCoverageForCause.LossType = (__VALUE_TO_SET as typekey.LossType)
    }
    
    // 'editable' attribute on TypeKeyCell (id=PolicyType_Cell) at InvalidCoverageForCauseLV.pcf: line 51, column 42
    function editable_15 () : java.lang.Boolean {
      return InvalidCoverageForCause.LOBCode!=null
    }
    
    // 'editable' attribute on TypeKeyCell (id=PrimaryCoverage_Cell) at InvalidCoverageForCauseLV.pcf: line 71, column 45
    function editable_27 () : java.lang.Boolean {
      return InvalidCoverageForCause.PolicyType!=null
    }
    
    // 'editable' attribute on TypeKeyCell (id=LOBCode_Cell) at InvalidCoverageForCauseLV.pcf: line 41, column 39
    function editable_9 () : java.lang.Boolean {
      return InvalidCoverageForCause.LossType!=null
    }
    
    // 'value' attribute on TypeKeyCell (id=LossType_Cell) at InvalidCoverageForCauseLV.pcf: line 31, column 40
    function valueRoot_7 () : java.lang.Object {
      return InvalidCoverageForCause
    }
    
    // 'value' attribute on TypeKeyCell (id=LOBCode_Cell) at InvalidCoverageForCauseLV.pcf: line 41, column 39
    function value_10 () : typekey.LOBCode {
      return InvalidCoverageForCause.LOBCode
    }
    
    // 'value' attribute on TypeKeyCell (id=PolicyType_Cell) at InvalidCoverageForCauseLV.pcf: line 51, column 42
    function value_16 () : typekey.PolicyType {
      return InvalidCoverageForCause.PolicyType
    }
    
    // 'value' attribute on TypeKeyCell (id=LossCause_Cell) at InvalidCoverageForCauseLV.pcf: line 61, column 41
    function value_22 () : typekey.LossCause {
      return InvalidCoverageForCause.LossCause
    }
    
    // 'value' attribute on TypeKeyCell (id=PrimaryCoverage_Cell) at InvalidCoverageForCauseLV.pcf: line 71, column 45
    function value_28 () : typekey.CoverageType {
      return InvalidCoverageForCause.PrimaryCoverage
    }
    
    // 'value' attribute on TypeKeyCell (id=LossType_Cell) at InvalidCoverageForCauseLV.pcf: line 31, column 40
    function value_5 () : typekey.LossType {
      return InvalidCoverageForCause.LossType
    }
    
    property get InvalidCoverageForCause () : entity.InvalidCoverageForCause {
      return getIteratedValue(1) as entity.InvalidCoverageForCause
    }
    
    
  }
  
  
}