package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AdminWelcome.AdminWelcome_UpLink;
import pcftest.AdminWelcome._Paging;
import pcftest.AdminWelcome.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/AdminWelcome.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AdminWelcome extends PCFLocation {
  public final static String CHECKSUM = "4c0f8010a6ab8e1570b80cb00de4be4f";
  
  public AdminWelcome(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AdminWelcome"));
  }
  
  public AdminWelcome_UpLink getAdminWelcome_UpLink() {
    return getOrCreateProperty("AdminWelcome_UpLink", "AdminWelcome_UpLink", null, pcftest.AdminWelcome.AdminWelcome_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AdminWelcome._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AdminWelcome.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/AdminWelcome.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdminWelcome_UpLink extends ClickableActionElement {
    public AdminWelcome_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/AdminWelcome.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/AdminWelcome.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}