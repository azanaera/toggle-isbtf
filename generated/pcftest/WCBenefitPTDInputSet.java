package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/shared/WCBenefitPTDInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WCBenefitPTDInputSet extends PCFElement {
  public final static String CHECKSUM = "2153e254b557e628620ce1037756a26a";
  
  public WCBenefitPTDInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getManualCompRate() {
    return getOrCreateProperty("ManualCompRate", "ManualCompRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getMinStateCompRateAdj() {
    return getOrCreateProperty("MinStateCompRateAdj", "MinStateCompRateAdj", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPTDCR() {
    return getOrCreateProperty("PTDCR", "PTDCR", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPTDCompRateUnavailable() {
    return getOrCreateProperty("PTDCompRateUnavailable", "PTDCompRateUnavailable", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPTDPercentOfWages() {
    return getOrCreateProperty("PTDPercentOfWages", "PTDPercentOfWages", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPTDRefData() {
    return getOrCreateProperty("PTDRefData", "PTDRefData", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPTD_MaxStateCompRate() {
    return getOrCreateProperty("PTD_MaxStateCompRate", "PTD_MaxStateCompRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPTD_MinStateCompRate() {
    return getOrCreateProperty("PTD_MinStateCompRate", "PTD_MinStateCompRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}