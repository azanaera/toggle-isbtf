package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/AppraisalServiceDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AppraisalServiceDV extends DetailViewElement {
  public final static String CHECKSUM = "36bf358d26a65921b37d95db48a44dc0";
  
  public AppraisalServiceDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public pcftest.AppraisalServiceDV.AppraisalServiceInputSet getAppraisalServiceInputSet() {
    return getOrCreateProperty("AppraisalServiceInputSet", "AppraisalServiceInputSet", null, pcftest.AppraisalServiceDV.AppraisalServiceInputSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/AppraisalServiceDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AppraisalServiceInputSet extends PCFElement {
    public AppraisalServiceInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.AppraisalServiceInputSet getAppraisalServiceInputSet() {
      return getOrCreateProperty("AppraisalServiceInputSet", "AppraisalServiceInputSet", null, pcftest.AppraisalServiceInputSet.class);
    }
    
    
  }
  
  
}