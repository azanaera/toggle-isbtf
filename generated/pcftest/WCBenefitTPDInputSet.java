package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/shared/WCBenefitTPDInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WCBenefitTPDInputSet extends PCFElement {
  public final static String CHECKSUM = "65f3581a55217a35ffa4e4e9524f2bc0";
  
  public WCBenefitTPDInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getMinStateCompRateAdj() {
    return getOrCreateProperty("MinStateCompRateAdj", "MinStateCompRateAdj", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTPDCR() {
    return getOrCreateProperty("TPDCR", "TPDCR", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTPDCompRateUnavailable() {
    return getOrCreateProperty("TPDCompRateUnavailable", "TPDCompRateUnavailable", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTPDPercentOfWages() {
    return getOrCreateProperty("TPDPercentOfWages", "TPDPercentOfWages", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTPDRefData() {
    return getOrCreateProperty("TPDRefData", "TPDRefData", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTPD_MaxStateCompRate() {
    return getOrCreateProperty("TPD_MaxStateCompRate", "TPD_MaxStateCompRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTPD_MinStateCompRate() {
    return getOrCreateProperty("TPD_MinStateCompRate", "TPD_MinStateCompRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getWeeklyCompRateManualPPD() {
    return getOrCreateProperty("WeeklyCompRateManualPPD", "WeeklyCompRateManualPPD", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}