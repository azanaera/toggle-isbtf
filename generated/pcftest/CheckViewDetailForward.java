package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CheckViewDetailForward.CheckViewDetailForward_UpLink;
import pcftest.CheckViewDetailForward._Paging;
import pcftest.CheckViewDetailForward.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/CheckViewDetailForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckViewDetailForward extends PCFLocation {
  public final static String CHECKSUM = "07f6f5015b8860ff0e599e4cff699df6";
  
  public CheckViewDetailForward(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CheckViewDetailForward"));
  }
  
  public CheckViewDetailForward_UpLink getCheckViewDetailForward_UpLink() {
    return getOrCreateProperty("CheckViewDetailForward_UpLink", "CheckViewDetailForward_UpLink", null, pcftest.CheckViewDetailForward.CheckViewDetailForward_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CheckViewDetailForward._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CheckViewDetailForward.__crumb__.class);
  }
  
  public ClaimFinancialsChecks get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimFinancialsChecks.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckViewDetailForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckViewDetailForward_UpLink extends ClickableActionElement {
    public CheckViewDetailForward_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckViewDetailForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckViewDetailForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}