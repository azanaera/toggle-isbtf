package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewRole.NewRole_UpLink;
import pcftest.NewRole._Paging;
import pcftest.NewRole.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/roles/NewRole.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewRole extends PCFLocation {
  public final static String CHECKSUM = "e5a0507b000e8b41995bbd44de37b30c";
  
  public NewRole(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewRole"));
  }
  
  public NewRole_UpLink getNewRole_UpLink() {
    return getOrCreateProperty("NewRole_UpLink", "NewRole_UpLink", null, pcftest.NewRole.NewRole_UpLink.class);
  }
  
  public RoleDetailScreen getRoleDetailScreen() {
    return getOrCreateProperty("RoleDetailScreen", "RoleDetailScreen", null, pcftest.RoleDetailScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewRole._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewRole.__crumb__.class);
  }
  
  public Roles get_parent() {
    return getOrCreateProperty("_parent", pcftest.Roles.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/roles/NewRole.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewRole_UpLink extends ClickableActionElement {
    public NewRole_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/roles/NewRole.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/roles/NewRole.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}