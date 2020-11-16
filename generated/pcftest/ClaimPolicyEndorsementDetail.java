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
import pcftest.ClaimPolicyEndorsementDetail.ClaimPolicyEndorsementDetailScreen;
import pcftest.ClaimPolicyEndorsementDetail.ClaimPolicyEndorsementDetailScreen._msgs;
import pcftest.ClaimPolicyEndorsementDetail.ClaimPolicyEndorsementDetail_UpLink;
import pcftest.ClaimPolicyEndorsementDetail._Paging;
import pcftest.ClaimPolicyEndorsementDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyEndorsementDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPolicyEndorsementDetail extends PCFLocation {
  public final static String CHECKSUM = "6871b82794ddba09f0b073ebe186f17c";
  
  public ClaimPolicyEndorsementDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimPolicyEndorsementDetail"));
  }
  
  public ClaimPolicyEndorsementDetailScreen getClaimPolicyEndorsementDetailScreen() {
    return getOrCreateProperty("ClaimPolicyEndorsementDetailScreen", "ClaimPolicyEndorsementDetailScreen", null, pcftest.ClaimPolicyEndorsementDetail.ClaimPolicyEndorsementDetailScreen.class);
  }
  
  public ClaimPolicyEndorsementDetail_UpLink getClaimPolicyEndorsementDetail_UpLink() {
    return getOrCreateProperty("ClaimPolicyEndorsementDetail_UpLink", "ClaimPolicyEndorsementDetail_UpLink", null, pcftest.ClaimPolicyEndorsementDetail.ClaimPolicyEndorsementDetail_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimPolicyEndorsementDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimPolicyEndorsementDetail.__crumb__.class);
  }
  
  public ClaimPolicyEndorsements get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPolicyEndorsements.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyEndorsementDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyEndorsementDetailScreen extends PCFElement {
    public ClaimPolicyEndorsementDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EndorsementDetailDV getEndorsementDetailDV() {
      return getOrCreateProperty("EndorsementDetailDV", "EndorsementDetailDV", null, pcftest.EndorsementDetailDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimPolicyEndorsementDetail.ClaimPolicyEndorsementDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyEndorsementDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyEndorsementDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyEndorsementDetail_UpLink extends ClickableActionElement {
    public ClaimPolicyEndorsementDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyEndorsementDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyEndorsementDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}