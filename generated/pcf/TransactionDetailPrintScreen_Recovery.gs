package pcf

uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/financials/transactions/print/TransactionDetailPrintScreen.Recovery.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionDetailPrintScreen_Recovery extends com.guidewire.pl.web.codegen.SectionBase {
  function onEnter ($Transaction :  Transaction) : void {
    __widgetOf(this, pcf.TransactionDetailPrintScreen_Recovery, SECTION_WIDGET_CLASS).setVariables(false, {$Transaction})
  }
  
  function refreshVariables ($Transaction :  Transaction) : void {
    __widgetOf(this, pcf.TransactionDetailPrintScreen_Recovery, SECTION_WIDGET_CLASS).setVariables(true, {$Transaction})
  }
  
  
}