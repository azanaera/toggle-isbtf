package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimInfoForward.ClaimInfoForward_UpLink;
import pcftest.ClaimInfoForward._Paging;
import pcftest.ClaimInfoForward.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/ClaimInfoForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimInfoForward extends PCFLocation {
  public final static String CHECKSUM = "b1630430e95f1cda4acfd4eb786b7c03";
  
  public ClaimInfoForward(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimInfoForward"));
  }
  
  public ClaimInfoForward_UpLink getClaimInfoForward_UpLink() {
    return getOrCreateProperty("ClaimInfoForward_UpLink", "ClaimInfoForward_UpLink", null, pcftest.ClaimInfoForward.ClaimInfoForward_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimInfoForward._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimInfoForward.__crumb__.class);
  }
  
  public ClaimTabForward get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimTabForward.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/ClaimInfoForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimInfoForward_UpLink extends ClickableActionElement {
    public ClaimInfoForward_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/ClaimInfoForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/ClaimInfoForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}