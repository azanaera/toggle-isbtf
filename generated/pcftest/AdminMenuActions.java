package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AdminMenuActions.AdminMenuActions_NewGroup;
import pcftest.AdminMenuActions.AdminMenuActions_NewUser;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/AdminMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AdminMenuActions extends PCFElement {
  public final static String CHECKSUM = "f6f5c3da11b6aab0ea44c3d90702f1fc";
  
  public AdminMenuActions(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AdminMenuActions_NewGroup getAdminMenuActions_NewGroup() {
    return getOrCreateProperty("AdminMenuActions_NewGroup", "AdminMenuActions_NewGroup", null, pcftest.AdminMenuActions.AdminMenuActions_NewGroup.class);
  }
  
  public AdminMenuActions_NewUser getAdminMenuActions_NewUser() {
    return getOrCreateProperty("AdminMenuActions_NewUser", "AdminMenuActions_NewUser", null, pcftest.AdminMenuActions.AdminMenuActions_NewUser.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/AdminMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdminMenuActions_NewGroup extends ClickableActionElement {
    public AdminMenuActions_NewGroup(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewGroup click() {
      return clickThis(pcftest.NewGroup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/AdminMenuActions.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdminMenuActions_NewUser extends ClickableActionElement {
    public AdminMenuActions_NewUser(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewUser click() {
      return clickThis(pcftest.NewUser.class);
    }
    
    
  }
  
  
}