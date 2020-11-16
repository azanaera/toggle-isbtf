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
import pcftest.UserClaimsPage.UserClaimsPage_UpLink;
import pcftest.UserClaimsPage.UserClaimsScreen;
import pcftest.UserClaimsPage.UserClaimsScreen.UserClaimsPage_AssignButton;
import pcftest.UserClaimsPage.UserClaimsScreen._msgs;
import pcftest.UserClaimsPage._Paging;
import pcftest.UserClaimsPage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/users/UserClaimsPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserClaimsPage extends PCFLocation {
  public final static String CHECKSUM = "e192e3ff30f797e08264f9f33f171b7f";
  
  public UserClaimsPage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("UserClaimsPage"));
  }
  
  public UserClaimsPage_UpLink getUserClaimsPage_UpLink() {
    return getOrCreateProperty("UserClaimsPage_UpLink", "UserClaimsPage_UpLink", null, pcftest.UserClaimsPage.UserClaimsPage_UpLink.class);
  }
  
  public UserClaimsScreen getUserClaimsScreen() {
    return getOrCreateProperty("UserClaimsScreen", "UserClaimsScreen", null, pcftest.UserClaimsPage.UserClaimsScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.UserClaimsPage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.UserClaimsPage.__crumb__.class);
  }
  
  public UserDetailGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.UserDetailGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserClaimsPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserClaimsPage_UpLink extends ClickableActionElement {
    public UserClaimsPage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserClaimsPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserClaimsScreen extends PCFElement {
    public UserClaimsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DesktopClaimsLV getDesktopClaimsLV() {
      return getOrCreateProperty("DesktopClaimsLV", "DesktopClaimsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DesktopClaimsLV.class);
    }
    
    public UserClaimsPage_AssignButton getUserClaimsPage_AssignButton() {
      return getOrCreateProperty("UserClaimsPage_AssignButton", "UserClaimsPage_AssignButton", null, pcftest.UserClaimsPage.UserClaimsScreen.UserClaimsPage_AssignButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.UserClaimsPage.UserClaimsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserClaimsPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserClaimsPage_AssignButton extends ClickableActionElement {
      public UserClaimsPage_AssignButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserClaimsPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/users/UserClaimsPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserClaimsPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}