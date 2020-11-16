package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/financials/checks/VoidStopCheckGroupLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class VoidStopCheckGroupLVExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/financials/checks/VoidStopCheckGroupLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends VoidStopCheckGroupLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Check_CreateUser_Cell) at VoidStopCheckGroupLV.pcf: line 52, column 57
    function valueRoot_26 () : java.lang.Object {
      return Check.CreateUser.Contact
    }
    
    // 'value' attribute on BooleanRadioCell (id=Check_Primary_Cell) at VoidStopCheckGroupLV.pcf: line 25, column 34
    function valueRoot_9 () : java.lang.Object {
      return Check
    }
    
    // 'value' attribute on TextCell (id=Check_PayTo_Cell) at VoidStopCheckGroupLV.pcf: line 30, column 32
    function value_11 () : java.lang.String {
      return Check.PayTo
    }
    
    // 'value' attribute on TextCell (id=Check_CheckNumber_Cell) at VoidStopCheckGroupLV.pcf: line 34, column 38
    function value_14 () : java.lang.String {
      return Check.CheckNumber
    }
    
    // 'value' attribute on TextCell (id=Check_Portion_Cell) at VoidStopCheckGroupLV.pcf: line 38, column 69
    function value_17 () : java.lang.String {
      return Check.Portion.getMultiCurrencyDisplayName(Check)
    }
    
    // 'value' attribute on CurrencyCell (id=Check_NetAmount_Cell) at VoidStopCheckGroupLV.pcf: line 44, column 61
    function value_19 () : gw.api.financials.CurrencyAmountPair {
      return Check.NetAmountPair
    }
    
    // 'value' attribute on DateCell (id=Check_IssueDate_Cell) at VoidStopCheckGroupLV.pcf: line 48, column 36
    function value_22 () : java.util.Date {
      return Check.IssueDate
    }
    
    // 'value' attribute on TextCell (id=Check_CreateUser_Cell) at VoidStopCheckGroupLV.pcf: line 52, column 57
    function value_25 () : java.lang.String {
      return Check.CreateUser.Contact.DisplayName
    }
    
    // 'value' attribute on DateCell (id=Check_CreateTime_Cell) at VoidStopCheckGroupLV.pcf: line 56, column 37
    function value_28 () : java.util.Date {
      return Check.CreateTime
    }
    
    // 'value' attribute on BooleanRadioCell (id=Check_Primary_Cell) at VoidStopCheckGroupLV.pcf: line 25, column 34
    function value_8 () : java.lang.Boolean {
      return Check.Primary
    }
    
    property get Check () : entity.Check {
      return getIteratedValue(1) as entity.Check
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/financials/checks/VoidStopCheckGroupLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VoidStopCheckGroupLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on BooleanRadioCell (id=Check_Primary_Cell) at VoidStopCheckGroupLV.pcf: line 25, column 34
    function sortValue_0 (Check :  entity.Check) : java.lang.Object {
      return Check.Primary
    }
    
    // 'value' attribute on TextCell (id=Check_PayTo_Cell) at VoidStopCheckGroupLV.pcf: line 30, column 32
    function sortValue_1 (Check :  entity.Check) : java.lang.Object {
      return Check.PayTo
    }
    
    // 'value' attribute on TextCell (id=Check_CheckNumber_Cell) at VoidStopCheckGroupLV.pcf: line 34, column 38
    function sortValue_2 (Check :  entity.Check) : java.lang.Object {
      return Check.CheckNumber
    }
    
    // 'value' attribute on TextCell (id=Check_Portion_Cell) at VoidStopCheckGroupLV.pcf: line 38, column 69
    function sortValue_3 (Check :  entity.Check) : java.lang.Object {
      return Check.Portion.getMultiCurrencyDisplayName(Check)
    }
    
    // 'value' attribute on CurrencyCell (id=Check_NetAmount_Cell) at VoidStopCheckGroupLV.pcf: line 44, column 61
    function sortValue_4 (Check :  entity.Check) : java.lang.Object {
      return Check.NetAmountPair
    }
    
    // 'value' attribute on DateCell (id=Check_IssueDate_Cell) at VoidStopCheckGroupLV.pcf: line 48, column 36
    function sortValue_5 (Check :  entity.Check) : java.lang.Object {
      return Check.IssueDate
    }
    
    // 'value' attribute on TextCell (id=Check_CreateUser_Cell) at VoidStopCheckGroupLV.pcf: line 52, column 57
    function sortValue_6 (Check :  entity.Check) : java.lang.Object {
      return Check.CreateUser.Contact.DisplayName
    }
    
    // 'value' attribute on DateCell (id=Check_CreateTime_Cell) at VoidStopCheckGroupLV.pcf: line 56, column 37
    function sortValue_7 (Check :  entity.Check) : java.lang.Object {
      return Check.CreateTime
    }
    
    // 'value' attribute on RowIterator at VoidStopCheckGroupLV.pcf: line 16, column 34
    function value_31 () : entity.Check[] {
      return CheckGroup.Checks
    }
    
    property get CheckGroup () : CheckGroup {
      return getRequireValue("CheckGroup", 0) as CheckGroup
    }
    
    property set CheckGroup ($arg :  CheckGroup) {
      setRequireValue("CheckGroup", 0, $arg)
    }
    
    
  }
  
  
}