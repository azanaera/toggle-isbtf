package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimServiceRequestForward.ClaimServiceRequestForward_UpLink;
import pcftest.ClaimServiceRequestForward._Paging;
import pcftest.ClaimServiceRequestForward.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequestForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimServiceRequestForward extends PCFLocation {
  public final static String CHECKSUM = "b3323d47def8984343901b663f30f8fd";
  
  public ClaimServiceRequestForward(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimServiceRequestForward"));
  }
  
  public ClaimServiceRequestForward_UpLink getClaimServiceRequestForward_UpLink() {
    return getOrCreateProperty("ClaimServiceRequestForward_UpLink", "ClaimServiceRequestForward_UpLink", null, pcftest.ClaimServiceRequestForward.ClaimServiceRequestForward_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimServiceRequestForward._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimServiceRequestForward.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequestForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimServiceRequestForward_UpLink extends ClickableActionElement {
    public ClaimServiceRequestForward_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequestForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequestForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}