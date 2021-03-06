package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/financials/shared/ReserveSetLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ReserveSetLVExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/financials/shared/ReserveSetLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends ReserveSetLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=ReserveViewDetail) at ReserveSetLV.pcf: line 78, column 113
    function action_36 () : void {
      ClaimFinancialsTransactionsDetail.goInMain(Reserve.Claim, Reserve)
    }
    
    // 'action' attribute on Link (id=ReserveViewDetail) at ReserveSetLV.pcf: line 78, column 113
    function action_dest_37 () : pcf.api.Destination {
      return pcf.ClaimFinancialsTransactionsDetail.createDestination(Reserve.Claim, Reserve)
    }
    
    // 'value' attribute on TypeKeyCell (id=Coverage_Cell) at ReserveSetLV.pcf: line 41, column 45
    function valueRoot_18 () : java.lang.Object {
      return Reserve.Exposure
    }
    
    // 'value' attribute on TypeKeyCell (id=CostType_Cell) at ReserveSetLV.pcf: line 47, column 41
    function valueRoot_21 () : java.lang.Object {
      return Reserve
    }
    
    // 'value' attribute on CurrencyCell (id=OpenReserves_Cell) at ReserveSetLV.pcf: line 63, column 132
    function valueRoot_31 () : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getOpenReserves().withReserveLine(Reserve.ReserveLine)
    }
    
    // 'value' attribute on TextCell (id=Exposure_Cell) at ReserveSetLV.pcf: line 35, column 161
    function value_15 () : java.lang.String {
      return Reserve.Exposure.FullDescription == null ? DisplayKey.get("Web.Financials.Exposure.ClaimLevel") : Reserve.Exposure.FullDescription
    }
    
    // 'value' attribute on TypeKeyCell (id=Coverage_Cell) at ReserveSetLV.pcf: line 41, column 45
    function value_17 () : typekey.CoverageType {
      return Reserve.Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TypeKeyCell (id=CostType_Cell) at ReserveSetLV.pcf: line 47, column 41
    function value_20 () : typekey.CostType {
      return Reserve.CostType
    }
    
    // 'value' attribute on TypeKeyCell (id=CostCategories_Cell) at ReserveSetLV.pcf: line 52, column 45
    function value_23 () : typekey.CostCategory {
      return Reserve.CostCategory
    }
    
    // 'value' attribute on TypeKeyCell (id=ReservingCurrency_Cell) at ReserveSetLV.pcf: line 58, column 74
    function value_26 () : typekey.Currency {
      return Reserve.ReservingCurrency
    }
    
    // 'value' attribute on CurrencyCell (id=OpenReserves_Cell) at ReserveSetLV.pcf: line 63, column 132
    function value_30 () : gw.api.financials.CurrencyAmount {
      return gw.api.financials.FinancialsCalculations.getOpenReserves().withReserveLine(Reserve.ReserveLine).ReservingAmount
    }
    
    // 'value' attribute on CurrencyCell (id=Amount_Cell) at ReserveSetLV.pcf: line 70, column 55
    function value_33 () : gw.api.financials.IPairedMoney {
      return Reserve.TransactionAmountReservingAmountPair
    }
    
    // 'visible' attribute on TypeKeyCell (id=ReservingCurrency_Cell) at ReserveSetLV.pcf: line 58, column 74
    function visible_28 () : java.lang.Boolean {
      return gw.util.CCConfigUtil.AllowExplicitReservingCurrency
    }
    
    // 'visible' attribute on LinkCell at ReserveSetLV.pcf: line 72, column 36
    function visible_38 () : java.lang.Boolean {
      return showViewDetail
    }
    
    property get Reserve () : entity.Reserve {
      return getIteratedValue(1) as entity.Reserve
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/financials/shared/ReserveSetLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReserveSetLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at ReserveSetLV.pcf: line 17, column 23
    function initialValue_0 () : boolean {
      return gw.api.financials.TransactionWizardHelper.haveSingleTransactionCurrency(ReserveList.toList())
    }
    
    // 'initialValue' attribute on Variable at ReserveSetLV.pcf: line 22, column 23
    function initialValue_1 () : boolean {
      return gw.api.financials.TransactionWizardHelper.haveSingleReservingCurrency(ReserveList.toList())
    }
    
    // 'value' attribute on TextCell (id=Exposure_Cell) at ReserveSetLV.pcf: line 35, column 161
    function sortValue_2 (Reserve :  entity.Reserve) : java.lang.Object {
      return Reserve.Exposure.FullDescription == null ? DisplayKey.get("Web.Financials.Exposure.ClaimLevel") : Reserve.Exposure.FullDescription
    }
    
    // 'value' attribute on TypeKeyCell (id=Coverage_Cell) at ReserveSetLV.pcf: line 41, column 45
    function sortValue_3 (Reserve :  entity.Reserve) : java.lang.Object {
      return Reserve.Exposure.PrimaryCoverage
    }
    
    // 'value' attribute on TypeKeyCell (id=CostType_Cell) at ReserveSetLV.pcf: line 47, column 41
    function sortValue_4 (Reserve :  entity.Reserve) : java.lang.Object {
      return Reserve.CostType
    }
    
    // 'value' attribute on TypeKeyCell (id=CostCategories_Cell) at ReserveSetLV.pcf: line 52, column 45
    function sortValue_5 (Reserve :  entity.Reserve) : java.lang.Object {
      return Reserve.CostCategory
    }
    
    // 'value' attribute on TypeKeyCell (id=ReservingCurrency_Cell) at ReserveSetLV.pcf: line 58, column 74
    function sortValue_6 (Reserve :  entity.Reserve) : java.lang.Object {
      return Reserve.ReservingCurrency
    }
    
    // 'value' attribute on CurrencyCell (id=OpenReserves_Cell) at ReserveSetLV.pcf: line 63, column 132
    function sortValue_8 (Reserve :  entity.Reserve) : java.lang.Object {
      return gw.api.financials.FinancialsCalculations.getOpenReserves().withReserveLine(Reserve.ReserveLine).ReservingAmount
    }
    
    // 'value' attribute on CurrencyCell (id=Amount_Cell) at ReserveSetLV.pcf: line 70, column 55
    function sortValue_9 (Reserve :  entity.Reserve) : java.lang.Object {
      return Reserve.TransactionAmountReservingAmountPair
    }
    
    // 'footerSumValue' attribute on RowIterator at ReserveSetLV.pcf: line 70, column 55
    function sumValue_13 (Reserve :  entity.Reserve) : java.lang.Object {
      return gw.api.financials.TransactionWizardHelper.getAmountForSumComputation(Reserve, haveSingleReservingCurrency, haveSingleTransactionCurrency)
    }
    
    // 'footerLabel' attribute on RowIterator at ReserveSetLV.pcf: line 35, column 161
    function value_11 () : java.lang.Object {
      return (haveSingleTransactionCurrency or haveSingleReservingCurrency) ? DisplayKey.get("LV.Financials.Total") : null
    }
    
    // 'value' attribute on RowIterator at ReserveSetLV.pcf: line 28, column 36
    function value_39 () : entity.Reserve[] {
      return ReserveList
    }
    
    // 'visible' attribute on LinkCell at ReserveSetLV.pcf: line 72, column 36
    function visible_10 () : java.lang.Boolean {
      return showViewDetail
    }
    
    // 'visible' attribute on TypeKeyCell (id=ReservingCurrency_Cell) at ReserveSetLV.pcf: line 58, column 74
    function visible_7 () : java.lang.Boolean {
      return gw.util.CCConfigUtil.AllowExplicitReservingCurrency
    }
    
    property get ReserveList () : Reserve[] {
      return getRequireValue("ReserveList", 0) as Reserve[]
    }
    
    property set ReserveList ($arg :  Reserve[]) {
      setRequireValue("ReserveList", 0, $arg)
    }
    
    property get haveSingleReservingCurrency () : boolean {
      return getVariableValue("haveSingleReservingCurrency", 0) as java.lang.Boolean
    }
    
    property set haveSingleReservingCurrency ($arg :  boolean) {
      setVariableValue("haveSingleReservingCurrency", 0, $arg)
    }
    
    property get haveSingleTransactionCurrency () : boolean {
      return getVariableValue("haveSingleTransactionCurrency", 0) as java.lang.Boolean
    }
    
    property set haveSingleTransactionCurrency ($arg :  boolean) {
      setVariableValue("haveSingleTransactionCurrency", 0, $arg)
    }
    
    property get showViewDetail () : boolean {
      return getRequireValue("showViewDetail", 0) as java.lang.Boolean
    }
    
    property set showViewDetail ($arg :  boolean) {
      setRequireValue("showViewDetail", 0, $arg)
    }
    
    
  }
  
  
}