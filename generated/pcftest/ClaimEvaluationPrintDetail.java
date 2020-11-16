package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimEvaluationPrintDetail.ClaimEvaluationPrintDetail_UpLink;
import pcftest.ClaimEvaluationPrintDetail.EvaluationPrintDetailScreen;
import pcftest.ClaimEvaluationPrintDetail.EvaluationPrintDetailScreen._msgs;
import pcftest.ClaimEvaluationPrintDetail._Paging;
import pcftest.ClaimEvaluationPrintDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/planofaction/ClaimEvaluationPrintDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimEvaluationPrintDetail extends PCFLocation {
  public final static String CHECKSUM = "27510f2f093583ef7b9b8b50806a579a";
  
  public ClaimEvaluationPrintDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimEvaluationPrintDetail"));
  }
  
  public ClaimEvaluationPrintDetail_UpLink getClaimEvaluationPrintDetail_UpLink() {
    return getOrCreateProperty("ClaimEvaluationPrintDetail_UpLink", "ClaimEvaluationPrintDetail_UpLink", null, pcftest.ClaimEvaluationPrintDetail.ClaimEvaluationPrintDetail_UpLink.class);
  }
  
  public EvaluationPrintDetailScreen getEvaluationPrintDetailScreen() {
    return getOrCreateProperty("EvaluationPrintDetailScreen", "EvaluationPrintDetailScreen", null, pcftest.ClaimEvaluationPrintDetail.EvaluationPrintDetailScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimEvaluationPrintDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimEvaluationPrintDetail.__crumb__.class);
  }
  
  public ClaimPrintout get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPrintout.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/planofaction/ClaimEvaluationPrintDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimEvaluationPrintDetail_UpLink extends ClickableActionElement {
    public ClaimEvaluationPrintDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/planofaction/ClaimEvaluationPrintDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EvaluationPrintDetailScreen extends PCFElement {
    public EvaluationPrintDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimEvaluationDetailsDV_Auto getClaimEvaluationDetailsDV_Auto() {
      return getOrCreateProperty("ClaimEvaluationDetailsDV_Auto", "ClaimEvaluationDetailsDV", null, pcftest.ClaimEvaluationDetailsDV_Auto.class);
    }
    
    public ClaimEvaluationDetailsDV_Gl getClaimEvaluationDetailsDV_Gl() {
      return getOrCreateProperty("ClaimEvaluationDetailsDV_Gl", "ClaimEvaluationDetailsDV", null, pcftest.ClaimEvaluationDetailsDV_Gl.class);
    }
    
    public ClaimEvaluationDetailsDV_Pr getClaimEvaluationDetailsDV_Pr() {
      return getOrCreateProperty("ClaimEvaluationDetailsDV_Pr", "ClaimEvaluationDetailsDV", null, pcftest.ClaimEvaluationDetailsDV_Pr.class);
    }
    
    public ClaimEvaluationDetailsDV_Trav getClaimEvaluationDetailsDV_Trav() {
      return getOrCreateProperty("ClaimEvaluationDetailsDV_Trav", "ClaimEvaluationDetailsDV", null, pcftest.ClaimEvaluationDetailsDV_Trav.class);
    }
    
    public ClaimEvaluationDetailsDV_Wc getClaimEvaluationDetailsDV_Wc() {
      return getOrCreateProperty("ClaimEvaluationDetailsDV_Wc", "ClaimEvaluationDetailsDV", null, pcftest.ClaimEvaluationDetailsDV_Wc.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimEvaluationPrintDetail.EvaluationPrintDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/planofaction/ClaimEvaluationPrintDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/planofaction/ClaimEvaluationPrintDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/planofaction/ClaimEvaluationPrintDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}