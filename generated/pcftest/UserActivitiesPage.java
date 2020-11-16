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
import pcftest.UserActivitiesPage.UserActivitiesPage_UpLink;
import pcftest.UserActivitiesPage.UserActivitiesScreen;
import pcftest.UserActivitiesPage.UserActivitiesScreen.UserActivitiesPage_AssignButton;
import pcftest.UserActivitiesPage.UserActivitiesScreen._msgs;
import pcftest.UserActivitiesPage._Paging;
import pcftest.UserActivitiesPage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/users/UserActivitiesPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserActivitiesPage extends PCFLocation {
  public final static String CHECKSUM = "03dcb6c8bda5a5a7d49ba5d8bad33955";
  
  public UserActivitiesPage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("UserActivitiesPage"));
  }
  
  public UserActivitiesPage_UpLink getUserActivitiesPage_UpLink() {
    return getOrCreateProperty("UserActivitiesPage_UpLink", "UserActivitiesPage_UpLink", null, pcftest.UserActivitiesPage.UserActivitiesPage_UpLink.class);
  }
  
  public UserActivitiesScreen getUserActivitiesScreen() {
    return getOrCreateProperty("UserActivitiesScreen", "UserActivitiesScreen", null, pcftest.UserActivitiesPage.UserActivitiesScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.UserActivitiesPage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.UserActivitiesPage.__crumb__.class);
  }
  
  public UserDetailGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.UserDetailGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserActivitiesPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserActivitiesPage_UpLink extends ClickableActionElement {
    public UserActivitiesPage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserActivitiesPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserActivitiesScreen extends PCFElement {
    public UserActivitiesScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DesktopActivitiesLV getDesktopActivitiesLV() {
      return getOrCreateProperty("DesktopActivitiesLV", "DesktopActivitiesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DesktopActivitiesLV.class);
    }
    
    public UserActivitiesPage_AssignButton getUserActivitiesPage_AssignButton() {
      return getOrCreateProperty("UserActivitiesPage_AssignButton", "UserActivitiesPage_AssignButton", null, pcftest.UserActivitiesPage.UserActivitiesScreen.UserActivitiesPage_AssignButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.UserActivitiesPage.UserActivitiesScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserActivitiesPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserActivitiesPage_AssignButton extends ClickableActionElement {
      public UserActivitiesPage_AssignButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserActivitiesPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/users/UserActivitiesPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserActivitiesPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}