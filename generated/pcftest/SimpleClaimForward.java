package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.SimpleClaimForward.SimpleClaimForward_UpLink;
import pcftest.SimpleClaimForward._Paging;
import pcftest.SimpleClaimForward.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/claims/SimpleClaimForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SimpleClaimForward extends PCFLocation {
  public final static String CHECKSUM = "397ca70388ebeb4e8e8de3dd4f13ff84";
  
  public SimpleClaimForward(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("SimpleClaimForward"));
  }
  
  public SimpleClaimForward_UpLink getSimpleClaimForward_UpLink() {
    return getOrCreateProperty("SimpleClaimForward_UpLink", "SimpleClaimForward_UpLink", null, pcftest.SimpleClaimForward.SimpleClaimForward_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.SimpleClaimForward._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.SimpleClaimForward.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/SimpleClaimForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SimpleClaimForward_UpLink extends ClickableActionElement {
    public SimpleClaimForward_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/SimpleClaimForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/SimpleClaimForward.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}