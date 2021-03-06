package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/dashboard/CurrentFinancialsByLOBLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CurrentFinancialsByLOBLVExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/dashboard/CurrentFinancialsByLOBLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CurrentFinancialsByLOBLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=ByLineOfBusiness_Cell) at CurrentFinancialsByLOBLV.pcf: line 45, column 40
    function sortValue_0 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.LOBCode
    }
    
    // 'value' attribute on TextCell (id=CurrentFinancials_OpenExposures_Cell) at CurrentFinancialsByLOBLV.pcf: line 52, column 42
    function sortValue_1 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.OpenExposures
    }
    
    // 'value' attribute on TextCell (id=CurrentFinancials_OpenClaims_Cell) at CurrentFinancialsByLOBLV.pcf: line 59, column 42
    function sortValue_2 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.OpenClaims
    }
    
    // 'value' attribute on TextCell (id=CurrentFinancials_OpenReserves_Cell) at CurrentFinancialsByLOBLV.pcf: line 67, column 45
    function sortValue_3 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.OpenReserves.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on TextCell (id=CurrentFinancials_ExpensesPaid_Cell) at CurrentFinancialsByLOBLV.pcf: line 75, column 45
    function sortValue_4 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.ExpensesPaid.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on TextCell (id=CurrentFinancials_ClaimCostsPaid_Cell) at CurrentFinancialsByLOBLV.pcf: line 83, column 45
    function sortValue_5 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.ClaimCostsPaid.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on TextCell (id=CurrentFinancials_TotalPaid_Cell) at CurrentFinancialsByLOBLV.pcf: line 91, column 45
    function sortValue_6 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.TotalPaid.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on TextCell (id=CurrentFinancials_TotalIncurredNet_Cell) at CurrentFinancialsByLOBLV.pcf: line 99, column 45
    function sortValue_7 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.TotalIncurredNet.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on TextCell (id=AvgIncurred_Claim_Cell) at CurrentFinancialsByLOBLV.pcf: line 106, column 45
    function sortValue_8 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.AvgIncurred.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // '$$sumValue' attribute on RowIterator at CurrentFinancialsByLOBLV.pcf: line 52, column 42
    function sumValueRoot_10 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats
    }
    
    // 'footerSumValue' attribute on RowIterator at CurrentFinancialsByLOBLV.pcf: line 59, column 42
    function sumValue_11 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.OpenClaims
    }
    
    // 'footerSumValue' attribute on RowIterator at CurrentFinancialsByLOBLV.pcf: line 67, column 45
    function sumValue_13 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.OpenReserves.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'footerSumValue' attribute on RowIterator at CurrentFinancialsByLOBLV.pcf: line 75, column 45
    function sumValue_14 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.ExpensesPaid.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'footerSumValue' attribute on RowIterator at CurrentFinancialsByLOBLV.pcf: line 83, column 45
    function sumValue_15 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.ClaimCostsPaid.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'footerSumValue' attribute on RowIterator at CurrentFinancialsByLOBLV.pcf: line 91, column 45
    function sumValue_16 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.TotalPaid.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'footerSumValue' attribute on RowIterator at CurrentFinancialsByLOBLV.pcf: line 99, column 45
    function sumValue_17 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.TotalIncurredNet.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'footerSumValue' attribute on RowIterator at CurrentFinancialsByLOBLV.pcf: line 52, column 42
    function sumValue_9 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.OpenExposures
    }
    
    // 'value' attribute on RowIterator at CurrentFinancialsByLOBLV.pcf: line 36, column 43
    function value_39 () : entity.DashboardStats[] {
      return DashboardStatsList
    }
    
    property get DashboardStatsList () : DashboardStats[] {
      return getRequireValue("DashboardStatsList", 0) as DashboardStats[]
    }
    
    property set DashboardStatsList ($arg :  DashboardStats[]) {
      setRequireValue("DashboardStatsList", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/dashboard/CurrentFinancialsByLOBLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends CurrentFinancialsByLOBLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=ByLineOfBusiness_Cell) at CurrentFinancialsByLOBLV.pcf: line 45, column 40
    function valueRoot_19 () : java.lang.Object {
      return DashboardStats
    }
    
    // 'value' attribute on TypeKeyCell (id=ByLineOfBusiness_Cell) at CurrentFinancialsByLOBLV.pcf: line 45, column 40
    function value_18 () : typekey.LOBCode {
      return DashboardStats.LOBCode
    }
    
    // 'value' attribute on TextCell (id=CurrentFinancials_OpenExposures_Cell) at CurrentFinancialsByLOBLV.pcf: line 52, column 42
    function value_21 () : java.lang.Integer {
      return DashboardStats.OpenExposures
    }
    
    // 'value' attribute on TextCell (id=CurrentFinancials_OpenClaims_Cell) at CurrentFinancialsByLOBLV.pcf: line 59, column 42
    function value_24 () : java.lang.Integer {
      return DashboardStats.OpenClaims
    }
    
    // 'value' attribute on TextCell (id=CurrentFinancials_OpenReserves_Cell) at CurrentFinancialsByLOBLV.pcf: line 67, column 45
    function value_27 () : java.math.BigDecimal {
      return DashboardStats.OpenReserves.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on TextCell (id=CurrentFinancials_ExpensesPaid_Cell) at CurrentFinancialsByLOBLV.pcf: line 75, column 45
    function value_29 () : java.math.BigDecimal {
      return DashboardStats.ExpensesPaid.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on TextCell (id=CurrentFinancials_ClaimCostsPaid_Cell) at CurrentFinancialsByLOBLV.pcf: line 83, column 45
    function value_31 () : java.math.BigDecimal {
      return DashboardStats.ClaimCostsPaid.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on TextCell (id=CurrentFinancials_TotalPaid_Cell) at CurrentFinancialsByLOBLV.pcf: line 91, column 45
    function value_33 () : java.math.BigDecimal {
      return DashboardStats.TotalPaid.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on TextCell (id=CurrentFinancials_TotalIncurredNet_Cell) at CurrentFinancialsByLOBLV.pcf: line 99, column 45
    function value_35 () : java.math.BigDecimal {
      return DashboardStats.TotalIncurredNet.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on TextCell (id=AvgIncurred_Claim_Cell) at CurrentFinancialsByLOBLV.pcf: line 106, column 45
    function value_37 () : java.math.BigDecimal {
      return DashboardStats.AvgIncurred.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    property get DashboardStats () : entity.DashboardStats {
      return getIteratedValue(1) as entity.DashboardStats
    }
    
    
  }
  
  
}