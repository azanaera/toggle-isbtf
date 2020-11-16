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
import pcftest.UserMattersPage.UserMattersPage_UpLink;
import pcftest.UserMattersPage.UserMattersScreen;
import pcftest.UserMattersPage.UserMattersScreen.UserMattersPage_AssignButton;
import pcftest.UserMattersPage.UserMattersScreen._msgs;
import pcftest.UserMattersPage._Paging;
import pcftest.UserMattersPage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/users/UserMattersPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserMattersPage extends PCFLocation {
  public final static String CHECKSUM = "42479d69dd3ede032e3aec9f17d77625";
  
  public UserMattersPage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("UserMattersPage"));
  }
  
  public UserMattersPage_UpLink getUserMattersPage_UpLink() {
    return getOrCreateProperty("UserMattersPage_UpLink", "UserMattersPage_UpLink", null, pcftest.UserMattersPage.UserMattersPage_UpLink.class);
  }
  
  public UserMattersScreen getUserMattersScreen() {
    return getOrCreateProperty("UserMattersScreen", "UserMattersScreen", null, pcftest.UserMattersPage.UserMattersScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.UserMattersPage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.UserMattersPage.__crumb__.class);
  }
  
  public UserDetailGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.UserDetailGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserMattersPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserMattersPage_UpLink extends ClickableActionElement {
    public UserMattersPage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserMattersPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserMattersScreen extends PCFElement {
    public UserMattersScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UserMattersLV getUserMattersLV() {
      return getOrCreateProperty("UserMattersLV", "UserMattersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.UserMattersLV.class);
    }
    
    public UserMattersPage_AssignButton getUserMattersPage_AssignButton() {
      return getOrCreateProperty("UserMattersPage_AssignButton", "UserMattersPage_AssignButton", null, pcftest.UserMattersPage.UserMattersScreen.UserMattersPage_AssignButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.UserMattersPage.UserMattersScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserMattersPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserMattersPage_AssignButton extends ClickableActionElement {
      public UserMattersPage_AssignButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserMattersPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/users/UserMattersPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserMattersPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}