package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryPanelSet.Coverage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FinancialsSummaryPanelSet_Coverage extends FinancialsSummaryPanelSet {
  public final static String CHECKSUM = "8525f1d567828934e7bf0441f6429bde";
  
  public FinancialsSummaryPanelSet_Coverage(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public FinancialsSummaryLV getFinancialsSummaryLV() {
    return getOrCreateProperty("FinancialsSummaryLV", "FinancialsSummaryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FinancialsSummaryLV.class);
  }
  
  
}