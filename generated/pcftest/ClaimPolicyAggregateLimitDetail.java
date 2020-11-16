package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimPolicyAggregateLimitDetail.ClaimPolicyAggregateLimitDetail_UpLink;
import pcftest.ClaimPolicyAggregateLimitDetail._Paging;
import pcftest.ClaimPolicyAggregateLimitDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyAggregateLimitDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPolicyAggregateLimitDetail extends PCFLocation {
  public final static String CHECKSUM = "6066c288c97fd4f2787bc42abccadeaa";
  
  public ClaimPolicyAggregateLimitDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimPolicyAggregateLimitDetail"));
  }
  
  public ClaimPolicyAggregateLimitDetailScreen getClaimPolicyAggregateLimitDetailScreen() {
    return getOrCreateProperty("ClaimPolicyAggregateLimitDetailScreen", "ClaimPolicyAggregateLimitDetailScreen", null, pcftest.ClaimPolicyAggregateLimitDetailScreen.class);
  }
  
  public ClaimPolicyAggregateLimitDetail_UpLink getClaimPolicyAggregateLimitDetail_UpLink() {
    return getOrCreateProperty("ClaimPolicyAggregateLimitDetail_UpLink", "ClaimPolicyAggregateLimitDetail_UpLink", null, pcftest.ClaimPolicyAggregateLimitDetail.ClaimPolicyAggregateLimitDetail_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimPolicyAggregateLimitDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimPolicyAggregateLimitDetail.__crumb__.class);
  }
  
  public ClaimPolicyAggregateLimits get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPolicyAggregateLimits.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyAggregateLimitDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyAggregateLimitDetail_UpLink extends ClickableActionElement {
    public ClaimPolicyAggregateLimitDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyAggregateLimitDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyAggregateLimitDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}