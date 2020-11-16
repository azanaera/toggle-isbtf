package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSummaryDV.WC_RTW;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/summary/ClaimSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSummaryDV extends DetailViewElement {
  public final static String CHECKSUM = "11e672c21ce39578b5940042b0679534";
  
  public ClaimSummaryDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLocation() {
    return getOrCreateProperty("Location", "Location", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getLossDate() {
    return getOrCreateProperty("LossDate", "LossDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getReportDate() {
    return getOrCreateProperty("ReportDate", "ReportDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getWCInjuryWorkStatus() {
    return getOrCreateProperty("WCInjuryWorkStatus", "WCInjuryWorkStatus", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public WC_RTW getWC_RTW() {
    return getOrCreateProperty("WC_RTW", "WC_RTW", null, pcftest.ClaimSummaryDV.WC_RTW.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/summary/ClaimSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WC_RTW extends PCFElement {
    public WC_RTW(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ReturnToWorkInputSet_WC getReturnToWorkInputSet_WC() {
      return getOrCreateProperty("ReturnToWorkInputSet_WC", "ReturnToWorkInputSet", null, pcftest.ReturnToWorkInputSet_WC.class);
    }
    
    
  }
  
  
}