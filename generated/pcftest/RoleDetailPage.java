package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RoleDetailPage.RoleDetailPage_UpLink;
import pcftest.RoleDetailPage._Paging;
import pcftest.RoleDetailPage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/roles/RoleDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RoleDetailPage extends PCFLocation {
  public final static String CHECKSUM = "0982ad1c1f9534b13350e9b463e7a652";
  
  public RoleDetailPage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("RoleDetailPage"));
  }
  
  public RoleDetailPage_UpLink getRoleDetailPage_UpLink() {
    return getOrCreateProperty("RoleDetailPage_UpLink", "RoleDetailPage_UpLink", null, pcftest.RoleDetailPage.RoleDetailPage_UpLink.class);
  }
  
  public RoleDetailScreen getRoleDetailScreen() {
    return getOrCreateProperty("RoleDetailScreen", "RoleDetailScreen", null, pcftest.RoleDetailScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.RoleDetailPage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.RoleDetailPage.__crumb__.class);
  }
  
  public Roles get_parent() {
    return getOrCreateProperty("_parent", pcftest.Roles.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/roles/RoleDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RoleDetailPage_UpLink extends ClickableActionElement {
    public RoleDetailPage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/roles/RoleDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/roles/RoleDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}