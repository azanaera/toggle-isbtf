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
import pcftest.UserExposuresPage.UserExposuresPage_UpLink;
import pcftest.UserExposuresPage.UserExposuresScreen;
import pcftest.UserExposuresPage.UserExposuresScreen.UserExposuresPage_AssignButton;
import pcftest.UserExposuresPage.UserExposuresScreen._msgs;
import pcftest.UserExposuresPage._Paging;
import pcftest.UserExposuresPage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/users/UserExposuresPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserExposuresPage extends PCFLocation {
  public final static String CHECKSUM = "bfb64914d6d6edb9bad6b99d377d0ca9";
  
  public UserExposuresPage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("UserExposuresPage"));
  }
  
  public UserExposuresPage_UpLink getUserExposuresPage_UpLink() {
    return getOrCreateProperty("UserExposuresPage_UpLink", "UserExposuresPage_UpLink", null, pcftest.UserExposuresPage.UserExposuresPage_UpLink.class);
  }
  
  public UserExposuresScreen getUserExposuresScreen() {
    return getOrCreateProperty("UserExposuresScreen", "UserExposuresScreen", null, pcftest.UserExposuresPage.UserExposuresScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.UserExposuresPage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.UserExposuresPage.__crumb__.class);
  }
  
  public UserDetailGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.UserDetailGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserExposuresPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserExposuresPage_UpLink extends ClickableActionElement {
    public UserExposuresPage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserExposuresPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserExposuresScreen extends PCFElement {
    public UserExposuresScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DesktopExposuresLV getDesktopExposuresLV() {
      return getOrCreateProperty("DesktopExposuresLV", "DesktopExposuresLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DesktopExposuresLV.class);
    }
    
    public UserExposuresPage_AssignButton getUserExposuresPage_AssignButton() {
      return getOrCreateProperty("UserExposuresPage_AssignButton", "UserExposuresPage_AssignButton", null, pcftest.UserExposuresPage.UserExposuresScreen.UserExposuresPage_AssignButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.UserExposuresPage.UserExposuresScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserExposuresPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserExposuresPage_AssignButton extends ClickableActionElement {
      public UserExposuresPage_AssignButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserExposuresPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/users/UserExposuresPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserExposuresPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}