package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/shared/WCBenefitPPDInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WCBenefitPPDInputSet extends PCFElement {
  public final static String CHECKSUM = "35cc2f0780a07223dec3845a76a9b6f3";
  
  public WCBenefitPPDInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getManualCompRate() {
    return getOrCreateProperty("ManualCompRate", "ManualCompRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getMaxTotalPPD() {
    return getOrCreateProperty("MaxTotalPPD", "MaxTotalPPD", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getMinStateCompRateAdj() {
    return getOrCreateProperty("MinStateCompRateAdj", "MinStateCompRateAdj", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPPDCR() {
    return getOrCreateProperty("PPDCR", "PPDCR", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPPDCompRateUnavailable() {
    return getOrCreateProperty("PPDCompRateUnavailable", "PPDCompRateUnavailable", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPPDPercentOfWages() {
    return getOrCreateProperty("PPDPercentOfWages", "PPDPercentOfWages", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPPDRefData() {
    return getOrCreateProperty("PPDRefData", "PPDRefData", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPPDWeeks() {
    return getOrCreateProperty("PPDWeeks", "PPDWeeks", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPPD_MaxStateCompRate() {
    return getOrCreateProperty("PPD_MaxStateCompRate", "PPD_MaxStateCompRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPPD_MinStateCompRate() {
    return getOrCreateProperty("PPD_MinStateCompRate", "PPD_MinStateCompRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}