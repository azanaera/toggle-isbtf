package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/financials/transactions/TransactionApprovalHistoryInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionApprovalHistoryInputSet extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Transaction :  Transaction) : void {
    __widgetOf(this, pcf.TransactionApprovalHistoryInputSet, SECTION_WIDGET_CLASS).setVariables(false, {$Transaction})
  }
  
  function refreshVariables ($Transaction :  Transaction) : void {
    __widgetOf(this, pcf.TransactionApprovalHistoryInputSet, SECTION_WIDGET_CLASS).setVariables(true, {$Transaction})
  }
  
  
}