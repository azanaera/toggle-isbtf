package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryPanelSet.ReservingCurrency.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FinancialsSummaryPanelSet_ReservingCurrency extends FinancialsSummaryPanelSet {
  public final static String CHECKSUM = "19e7c3c26c23b04c553f65549f45aa66";
  
  public FinancialsSummaryPanelSet_ReservingCurrency(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public FinancialsSummaryLV getFinancialsSummaryLV() {
    return getOrCreateProperty("FinancialsSummaryLV", "FinancialsSummaryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FinancialsSummaryLV.class);
  }
  
  
}