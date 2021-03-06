package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimEvaluationDetailsDV_Wc.ClaimEvaluationDetailsCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/planofaction/ClaimEvaluationDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimEvaluationDetailsDV_Wc extends ClaimEvaluationDetailsDV {
  public final static String CHECKSUM = "5062e39f6508806d1db041e6598d3257";
  
  public ClaimEvaluationDetailsDV_Wc(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimEvaluationDetailDV getClaimEvaluationDetailDV() {
    return getOrCreateProperty("ClaimEvaluationDetailDV", "ClaimEvaluationDetailDV", null, pcftest.ClaimEvaluationDetailDV.class);
  }
  
  public ClaimEvaluationDetailsCardTab getClaimEvaluationDetailsCardTab() {
    return getOrCreateProperty("ClaimEvaluationDetailsCardTab", "ClaimEvaluationDetailsCardTab", null, pcftest.ClaimEvaluationDetailsDV_Wc.ClaimEvaluationDetailsCardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/planofaction/ClaimEvaluationDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimEvaluationDetailsCardTab extends ClickableActionElement {
    public ClaimEvaluationDetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}