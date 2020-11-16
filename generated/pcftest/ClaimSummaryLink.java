package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSummaryLink.ClaimSummaryLink_UpLink;
import pcftest.ClaimSummaryLink._Paging;
import pcftest.ClaimSummaryLink.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/util/ClaimSummaryLink.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSummaryLink extends PCFLocation {
  public final static String CHECKSUM = "4b0e279f3f24be9e351ec7d9f4014ead";
  
  public ClaimSummaryLink(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSummaryLink"));
  }
  
  public ClaimSummaryLink_UpLink getClaimSummaryLink_UpLink() {
    return getOrCreateProperty("ClaimSummaryLink_UpLink", "ClaimSummaryLink_UpLink", null, pcftest.ClaimSummaryLink.ClaimSummaryLink_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSummaryLink._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSummaryLink.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/ClaimSummaryLink.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryLink_UpLink extends ClickableActionElement {
    public ClaimSummaryLink_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/ClaimSummaryLink.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/ClaimSummaryLink.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}