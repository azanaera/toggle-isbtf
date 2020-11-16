package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.Roles.RolesScreen;
import pcftest.Roles.RolesScreen.Roles_AddRoleButton;
import pcftest.Roles.RolesScreen.Roles_DeleteButton;
import pcftest.Roles.RolesScreen._msgs;
import pcftest.Roles.Roles_UpLink;
import pcftest.Roles._Paging;
import pcftest.Roles.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/usersandsecurity/Roles.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class Roles extends PCFLocation {
  public final static String CHECKSUM = "90637bd94f61315b7218e14d29642515";
  
  public Roles(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("Roles"));
  }
  
  public RolesScreen getRolesScreen() {
    return getOrCreateProperty("RolesScreen", "RolesScreen", null, pcftest.Roles.RolesScreen.class);
  }
  
  public Roles_UpLink getRoles_UpLink() {
    return getOrCreateProperty("Roles_UpLink", "Roles_UpLink", null, pcftest.Roles.Roles_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.Roles._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.Roles.__crumb__.class);
  }
  
  public UsersAndSecurity get_parent() {
    return getOrCreateProperty("_parent", pcftest.UsersAndSecurity.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/Roles.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RolesScreen extends PCFElement {
    public RolesScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RolesLV getRolesLV() {
      return getOrCreateProperty("RolesLV", "RolesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.RolesLV.class);
    }
    
    public Roles_AddRoleButton getRoles_AddRoleButton() {
      return getOrCreateProperty("Roles_AddRoleButton", "Roles_AddRoleButton", null, pcftest.Roles.RolesScreen.Roles_AddRoleButton.class);
    }
    
    public Roles_DeleteButton getRoles_DeleteButton() {
      return getOrCreateProperty("Roles_DeleteButton", "Roles_DeleteButton", null, pcftest.Roles.RolesScreen.Roles_DeleteButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.Roles.RolesScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/usersandsecurity/Roles.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Roles_AddRoleButton extends ClickableActionElement {
      public Roles_AddRoleButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewRole click() {
        return clickThis(pcftest.NewRole.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/usersandsecurity/Roles.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Roles_DeleteButton extends ClickableActionElement {
      public Roles_DeleteButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/usersandsecurity/Roles.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/Roles.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Roles_UpLink extends ClickableActionElement {
    public Roles_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/Roles.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/Roles.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}