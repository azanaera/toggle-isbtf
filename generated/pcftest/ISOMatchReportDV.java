package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/iso/ISOMatchReportDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ISOMatchReportDV extends DetailViewElement {
  public final static String CHECKSUM = "5903ae3888fb6cfc7dfd8874da8de032";
  
  public ISOMatchReportDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getClaimNumber() {
    return getOrCreateProperty("ClaimNumber", "ClaimNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getInsurerAddress() {
    return getOrCreateProperty("InsurerAddress", "InsurerAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getInsurerPhone() {
    return getOrCreateProperty("InsurerPhone", "InsurerPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getInsuringCompany() {
    return getOrCreateProperty("InsuringCompany", "InsuringCompany", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getLossDate() {
    return getOrCreateProperty("LossDate", "LossDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getMatchReasons() {
    return getOrCreateProperty("MatchReasons", "MatchReasons", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPolicyNumber() {
    return getOrCreateProperty("PolicyNumber", "PolicyNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPolicyType() {
    return getOrCreateProperty("PolicyType", "PolicyType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getReceivedDate() {
    return getOrCreateProperty("ReceivedDate", "ReceivedDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  
}