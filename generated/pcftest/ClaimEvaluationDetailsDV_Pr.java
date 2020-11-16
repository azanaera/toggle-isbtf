package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimEvaluationDetailsDV_Pr.ClaimEvaluationDetailsCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/planofaction/ClaimEvaluationDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimEvaluationDetailsDV_Pr extends ClaimEvaluationDetailsDV {
  public final static String CHECKSUM = "a58902b2567a0d25ee691e7055eeb5e7";
  
  public ClaimEvaluationDetailsDV_Pr(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimEvaluationDetailDV getClaimEvaluationDetailDV() {
    return getOrCreateProperty("ClaimEvaluationDetailDV", "ClaimEvaluationDetailDV", null, pcftest.ClaimEvaluationDetailDV.class);
  }
  
  public ClaimEvaluationDetailsCardTab getClaimEvaluationDetailsCardTab() {
    return getOrCreateProperty("ClaimEvaluationDetailsCardTab", "ClaimEvaluationDetailsCardTab", null, pcftest.ClaimEvaluationDetailsDV_Pr.ClaimEvaluationDetailsCardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/planofaction/ClaimEvaluationDetailsDV.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimEvaluationDetailsCardTab extends ClickableActionElement {
    public ClaimEvaluationDetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}