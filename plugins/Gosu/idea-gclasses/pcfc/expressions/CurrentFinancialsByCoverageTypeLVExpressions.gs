package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/dashboard/CurrentFinancialsByCoverageTypeLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CurrentFinancialsByCoverageTypeLVExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/dashboard/CurrentFinancialsByCoverageTypeLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CurrentFinancialsByCoverageTypeLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=ByCoverageType_Cell) at CurrentFinancialsByCoverageTypeLV.pcf: line 43, column 45
    function sortValue_0 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.CoverageType
    }
    
    // 'value' attribute on TextCell (id=CurrentFinancials_OpenExposures_Cell) at CurrentFinancialsByCoverageTypeLV.pcf: line 50, column 42
    function sortValue_1 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.OpenExposures
    }
    
    // 'value' attribute on TextCell (id=CurrentFinancials_OpenReserves_Cell) at CurrentFinancialsByCoverageTypeLV.pcf: line 58, column 45
    function sortValue_2 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.OpenReserves.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on TextCell (id=CurrentFinancials_ExpensesPaid_Cell) at CurrentFinancialsByCoverageTypeLV.pcf: line 66, column 45
    function sortValue_3 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.ExpensesPaid.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on TextCell (id=CurrentFinancials_ClaimCostsPaid_Cell) at CurrentFinancialsByCoverageTypeLV.pcf: line 74, column 45
    function sortValue_4 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.ClaimCostsPaid.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on TextCell (id=CurrentFinancials_TotalPaid_Cell) at CurrentFinancialsByCoverageTypeLV.pcf: line 82, column 45
    function sortValue_5 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.TotalPaid.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on TextCell (id=CurrentFinancials_TotalIncurredNet_Cell) at CurrentFinancialsByCoverageTypeLV.pcf: line 90, column 45
    function sortValue_6 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.TotalIncurredNet.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on TextCell (id=AvgIncurred_Exposure_Cell) at CurrentFinancialsByCoverageTypeLV.pcf: line 97, column 45
    function sortValue_7 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.AvgIncurred.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // '$$sumValue' attribute on RowIterator at CurrentFinancialsByCoverageTypeLV.pcf: line 50, column 42
    function sumValueRoot_9 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats
    }
    
    // 'footerSumValue' attribute on RowIterator at CurrentFinancialsByCoverageTypeLV.pcf: line 58, column 45
    function sumValue_10 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.OpenReserves.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'footerSumValue' attribute on RowIterator at CurrentFinancialsByCoverageTypeLV.pcf: line 66, column 45
    function sumValue_11 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.ExpensesPaid.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'footerSumValue' attribute on RowIterator at CurrentFinancialsByCoverageTypeLV.pcf: line 74, column 45
    function sumValue_12 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.ClaimCostsPaid.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'footerSumValue' attribute on RowIterator at CurrentFinancialsByCoverageTypeLV.pcf: line 82, column 45
    function sumValue_13 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.TotalPaid.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'footerSumValue' attribute on RowIterator at CurrentFinancialsByCoverageTypeLV.pcf: line 90, column 45
    function sumValue_14 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.TotalIncurredNet.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'footerSumValue' attribute on RowIterator at CurrentFinancialsByCoverageTypeLV.pcf: line 50, column 42
    function sumValue_8 (DashboardStats :  entity.DashboardStats) : java.lang.Object {
      return DashboardStats.OpenExposures
    }
    
    // 'value' attribute on RowIterator at CurrentFinancialsByCoverageTypeLV.pcf: line 34, column 43
    function value_33 () : entity.DashboardStats[] {
      return DashboardStatsList
    }
    
    property get DashboardStatsList () : DashboardStats[] {
      return getRequireValue("DashboardStatsList", 0) as DashboardStats[]
    }
    
    property set DashboardStatsList ($arg :  DashboardStats[]) {
      setRequireValue("DashboardStatsList", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/dashboard/CurrentFinancialsByCoverageTypeLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends CurrentFinancialsByCoverageTypeLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyCell (id=ByCoverageType_Cell) at CurrentFinancialsByCoverageTypeLV.pcf: line 43, column 45
    function valueRoot_16 () : java.lang.Object {
      return DashboardStats
    }
    
    // 'value' attribute on TypeKeyCell (id=ByCoverageType_Cell) at CurrentFinancialsByCoverageTypeLV.pcf: line 43, column 45
    function value_15 () : typekey.CoverageType {
      return DashboardStats.CoverageType
    }
    
    // 'value' attribute on TextCell (id=CurrentFinancials_OpenExposures_Cell) at CurrentFinancialsByCoverageTypeLV.pcf: line 50, column 42
    function value_18 () : java.lang.Integer {
      return DashboardStats.OpenExposures
    }
    
    // 'value' attribute on TextCell (id=CurrentFinancials_OpenReserves_Cell) at CurrentFinancialsByCoverageTypeLV.pcf: line 58, column 45
    function value_21 () : java.math.BigDecimal {
      return DashboardStats.OpenReserves.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on TextCell (id=CurrentFinancials_ExpensesPaid_Cell) at CurrentFinancialsByCoverageTypeLV.pcf: line 66, column 45
    function value_23 () : java.math.BigDecimal {
      return DashboardStats.ExpensesPaid.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on TextCell (id=CurrentFinancials_ClaimCostsPaid_Cell) at CurrentFinancialsByCoverageTypeLV.pcf: line 74, column 45
    function value_25 () : java.math.BigDecimal {
      return DashboardStats.ClaimCostsPaid.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on TextCell (id=CurrentFinancials_TotalPaid_Cell) at CurrentFinancialsByCoverageTypeLV.pcf: line 82, column 45
    function value_27 () : java.math.BigDecimal {
      return DashboardStats.TotalPaid.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on TextCell (id=CurrentFinancials_TotalIncurredNet_Cell) at CurrentFinancialsByCoverageTypeLV.pcf: line 90, column 45
    function value_29 () : java.math.BigDecimal {
      return DashboardStats.TotalIncurredNet.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    // 'value' attribute on TextCell (id=AvgIncurred_Exposure_Cell) at CurrentFinancialsByCoverageTypeLV.pcf: line 97, column 45
    function value_31 () : java.math.BigDecimal {
      return DashboardStats.AvgIncurred.divide(1000).setScale(2, gw.api.util.CurrencyUtil.getRoundingMode())
    }
    
    property get DashboardStats () : entity.DashboardStats {
      return getIteratedValue(1) as entity.DashboardStats
    }
    
    
  }
  
  
}