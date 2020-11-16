package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/shared/WCBenefitTTDInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WCBenefitTTDInputSet extends PCFElement {
  public final static String CHECKSUM = "19b6b3f1acbfae8ebf08784d5e74bff4";
  
  public WCBenefitTTDInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getManualCompRate() {
    return getOrCreateProperty("ManualCompRate", "ManualCompRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getMinStateCompRateAdj() {
    return getOrCreateProperty("MinStateCompRateAdj", "MinStateCompRateAdj", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTTDCR() {
    return getOrCreateProperty("TTDCR", "TTDCR", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTTDCompRateUnavailable() {
    return getOrCreateProperty("TTDCompRateUnavailable", "TTDCompRateUnavailable", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTTDPercentOfWages() {
    return getOrCreateProperty("TTDPercentOfWages", "TTDPercentOfWages", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTTDRefData() {
    return getOrCreateProperty("TTDRefData", "TTDRefData", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTTD_MaxStateCompRate() {
    return getOrCreateProperty("TTD_MaxStateCompRate", "TTD_MaxStateCompRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTTD_MinStateCompRate() {
    return getOrCreateProperty("TTD_MinStateCompRate", "TTD_MinStateCompRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}