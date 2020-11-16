package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryPanelSet.ExposureOnly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FinancialsSummaryPanelSet_ExposureOnly extends FinancialsSummaryPanelSet {
  public final static String CHECKSUM = "39bf4a41ede4a546e333432006d92778";
  
  public FinancialsSummaryPanelSet_ExposureOnly(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public FinancialsSummaryLV getFinancialsSummaryLV() {
    return getOrCreateProperty("FinancialsSummaryLV", "FinancialsSummaryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FinancialsSummaryLV.class);
  }
  
  
}