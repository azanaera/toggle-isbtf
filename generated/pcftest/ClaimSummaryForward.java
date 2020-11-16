package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSummaryForward.ClaimSummaryForward_UpLink;
import pcftest.ClaimSummaryForward._Paging;
import pcftest.ClaimSummaryForward.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimSummaryForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSummaryForward extends PCFLocation {
  public final static String CHECKSUM = "37b55ed8fb60f940b42c9bc89d061486";
  
  public ClaimSummaryForward(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSummaryForward"));
  }
  
  public ClaimSummaryForward_UpLink getClaimSummaryForward_UpLink() {
    return getOrCreateProperty("ClaimSummaryForward_UpLink", "ClaimSummaryForward_UpLink", null, pcftest.ClaimSummaryForward.ClaimSummaryForward_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSummaryForward._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSummaryForward.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimSummaryForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryForward_UpLink extends ClickableActionElement {
    public ClaimSummaryForward_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimSummaryForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/quickjump/contextualforward/ClaimSummaryForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}