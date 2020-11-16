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
import pcftest.ClaimPolicyStatCodeDetail.ClaimPolicyStatCodeDetailScreen;
import pcftest.ClaimPolicyStatCodeDetail.ClaimPolicyStatCodeDetailScreen._msgs;
import pcftest.ClaimPolicyStatCodeDetail.ClaimPolicyStatCodeDetail_UpLink;
import pcftest.ClaimPolicyStatCodeDetail._Paging;
import pcftest.ClaimPolicyStatCodeDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyStatCodeDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPolicyStatCodeDetail extends PCFLocation {
  public final static String CHECKSUM = "1d5565eb88a20f31a636fc9e8d9b42f1";
  
  public ClaimPolicyStatCodeDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimPolicyStatCodeDetail"));
  }
  
  public ClaimPolicyStatCodeDetailScreen getClaimPolicyStatCodeDetailScreen() {
    return getOrCreateProperty("ClaimPolicyStatCodeDetailScreen", "ClaimPolicyStatCodeDetailScreen", null, pcftest.ClaimPolicyStatCodeDetail.ClaimPolicyStatCodeDetailScreen.class);
  }
  
  public ClaimPolicyStatCodeDetail_UpLink getClaimPolicyStatCodeDetail_UpLink() {
    return getOrCreateProperty("ClaimPolicyStatCodeDetail_UpLink", "ClaimPolicyStatCodeDetail_UpLink", null, pcftest.ClaimPolicyStatCodeDetail.ClaimPolicyStatCodeDetail_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimPolicyStatCodeDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimPolicyStatCodeDetail.__crumb__.class);
  }
  
  public ClaimPolicyStatCodes get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPolicyStatCodes.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyStatCodeDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyStatCodeDetailScreen extends PCFElement {
    public ClaimPolicyStatCodeDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public StatCodeDetailDV getStatCodeDetailDV() {
      return getOrCreateProperty("StatCodeDetailDV", "StatCodeDetailDV", null, pcftest.StatCodeDetailDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimPolicyStatCodeDetail.ClaimPolicyStatCodeDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyStatCodeDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyStatCodeDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyStatCodeDetail_UpLink extends ClickableActionElement {
    public ClaimPolicyStatCodeDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyStatCodeDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyStatCodeDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}