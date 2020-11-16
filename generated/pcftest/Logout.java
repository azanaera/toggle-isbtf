package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.Logout.Logout_UpLink;
import pcftest.Logout._Paging;
import pcftest.Logout.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/util/Logout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class Logout extends PCFLocation {
  public final static String CHECKSUM = "01e0481caef8bfaf849869862b9b8063";
  
  public Logout(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("Logout"));
  }
  
  public Logout_UpLink getLogout_UpLink() {
    return getOrCreateProperty("Logout_UpLink", "Logout_UpLink", null, pcftest.Logout.Logout_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.Logout._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.Logout.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/Logout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Logout_UpLink extends ClickableActionElement {
    public Logout_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/Logout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/Logout.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}