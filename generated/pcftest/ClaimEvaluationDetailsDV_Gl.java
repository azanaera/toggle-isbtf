package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimEvaluationDetailsDV_Gl.ClaimEvaluationDetailsCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/planofaction/ClaimEvaluationDetailsDV.Gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimEvaluationDetailsDV_Gl extends ClaimEvaluationDetailsDV {
  public final static String CHECKSUM = "ad7e5f060b0e25eac8b9d5ea8a6a0729";
  
  public ClaimEvaluationDetailsDV_Gl(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimEvaluationDetailDV getClaimEvaluationDetailDV() {
    return getOrCreateProperty("ClaimEvaluationDetailDV", "ClaimEvaluationDetailDV", null, pcftest.ClaimEvaluationDetailDV.class);
  }
  
  public ClaimEvaluationDetailsCardTab getClaimEvaluationDetailsCardTab() {
    return getOrCreateProperty("ClaimEvaluationDetailsCardTab", "ClaimEvaluationDetailsCardTab", null, pcftest.ClaimEvaluationDetailsDV_Gl.ClaimEvaluationDetailsCardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/planofaction/ClaimEvaluationDetailsDV.Gl.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimEvaluationDetailsCardTab extends ClickableActionElement {
    public ClaimEvaluationDetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}