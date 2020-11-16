package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryPanelSet.Exposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FinancialsSummaryPanelSet_Exposure extends FinancialsSummaryPanelSet {
  public final static String CHECKSUM = "d7212ea81f9ec4a7056ecea536906917";
  
  public FinancialsSummaryPanelSet_Exposure(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public FinancialsSummaryLV getFinancialsSummaryLV() {
    return getOrCreateProperty("FinancialsSummaryLV", "FinancialsSummaryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FinancialsSummaryLV.class);
  }
  
  
}