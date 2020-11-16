package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/shared/exposures/PIPSSBenefitsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PIPSSBenefitsInputSet extends PCFElement {
  public final static String CHECKSUM = "7e3ce7b11938b0caba8f0381cd32e521";
  
  public PIPSSBenefitsInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getLostWagesBenefits_MonthlyCompRate() {
    return getOrCreateProperty("LostWagesBenefits_MonthlyCompRate", "LostWagesBenefits_MonthlyCompRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getSSCollected_Question() {
    return getOrCreateProperty("SSCollected_Question", "SSCollected_Question", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public DateElement getSSDIBenefits_BeginDate() {
    return getOrCreateProperty("SSDIBenefits_BeginDate", "SSDIBenefits_BeginDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  
}