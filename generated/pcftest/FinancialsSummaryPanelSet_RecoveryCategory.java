package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/summary/FinancialsSummaryPanelSet.RecoveryCategory.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FinancialsSummaryPanelSet_RecoveryCategory extends FinancialsSummaryPanelSet {
  public final static String CHECKSUM = "eadf1a82609eba52b1cf0f8e5be1a3f7";
  
  public FinancialsSummaryPanelSet_RecoveryCategory(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public FinancialsSummaryRecoveriesLV getFinancialsSummaryRecoveriesLV() {
    return getOrCreateProperty("FinancialsSummaryRecoveriesLV", "FinancialsSummaryRecoveriesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.FinancialsSummaryRecoveriesLV.class);
  }
  
  
}