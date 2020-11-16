package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimPolicyNewAggregateLimit.ClaimPolicyNewAggregateLimit_UpLink;
import pcftest.ClaimPolicyNewAggregateLimit._Paging;
import pcftest.ClaimPolicyNewAggregateLimit.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyNewAggregateLimit.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPolicyNewAggregateLimit extends PCFLocation {
  public final static String CHECKSUM = "b3e926a384b544c101d1ef633ac2b0a0";
  
  public ClaimPolicyNewAggregateLimit(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimPolicyNewAggregateLimit"));
  }
  
  public ClaimPolicyAggregateLimitDetailScreen getClaimPolicyAggregateLimitDetailScreen() {
    return getOrCreateProperty("ClaimPolicyAggregateLimitDetailScreen", "ClaimPolicyAggregateLimitDetailScreen", null, pcftest.ClaimPolicyAggregateLimitDetailScreen.class);
  }
  
  public ClaimPolicyNewAggregateLimit_UpLink getClaimPolicyNewAggregateLimit_UpLink() {
    return getOrCreateProperty("ClaimPolicyNewAggregateLimit_UpLink", "ClaimPolicyNewAggregateLimit_UpLink", null, pcftest.ClaimPolicyNewAggregateLimit.ClaimPolicyNewAggregateLimit_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimPolicyNewAggregateLimit._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimPolicyNewAggregateLimit.__crumb__.class);
  }
  
  public ClaimPolicyAggregateLimits get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPolicyAggregateLimits.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyNewAggregateLimit.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyNewAggregateLimit_UpLink extends ClickableActionElement {
    public ClaimPolicyNewAggregateLimit_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyNewAggregateLimit.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyNewAggregateLimit.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}