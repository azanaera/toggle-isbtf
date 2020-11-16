package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.TreeViewElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.UserSelectPopup.UserSelectPopupScreen;
import pcftest.UserSelectPopup.UserSelectPopupScreen.UserSelectPopup2;
import pcftest.UserSelectPopup.UserSelectPopupScreen.UserSelectPopup2.UserSelectPopupPicker;
import pcftest.UserSelectPopup.UserSelectPopupScreen._msgs;
import pcftest.UserSelectPopup.UserSelectPopup_UpLink;
import pcftest.UserSelectPopup._Paging;
import pcftest.UserSelectPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/userselect/UserSelectPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserSelectPopup extends PCFLocation {
  public final static String CHECKSUM = "9ee4d9d27876771978a92012edb08399";
  
  public UserSelectPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("UserSelectPopup"));
  }
  
  public UserSelectPopupScreen getUserSelectPopupScreen() {
    return getOrCreateProperty("UserSelectPopupScreen", "UserSelectPopupScreen", null, pcftest.UserSelectPopup.UserSelectPopupScreen.class);
  }
  
  public UserSelectPopup_UpLink getUserSelectPopup_UpLink() {
    return getOrCreateProperty("UserSelectPopup_UpLink", "UserSelectPopup_UpLink", null, pcftest.UserSelectPopup.UserSelectPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.UserSelectPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.UserSelectPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/userselect/UserSelectPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserSelectPopupScreen extends PCFElement {
    public UserSelectPopupScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UserSelectPopup2 getUserSelectPopup() {
      return getOrCreateProperty("UserSelectPopup", "UserSelectPopup", null, pcftest.UserSelectPopup.UserSelectPopupScreen.UserSelectPopup2.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.UserSelectPopup.UserSelectPopupScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/userselect/UserSelectPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserSelectPopup2 extends PCFElement {
      public UserSelectPopup2(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserSelectPopupPicker getUserSelectPopupPicker() {
        return getOrCreateProperty("UserSelectPopupPicker", "UserSelectPopupPicker", null, pcftest.UserSelectPopup.UserSelectPopupScreen.UserSelectPopup2.UserSelectPopupPicker.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/userselect/UserSelectPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class UserSelectPopupPicker extends TreeViewElement {
        public UserSelectPopupPicker(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/userselect/UserSelectPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/userselect/UserSelectPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserSelectPopup_UpLink extends ClickableActionElement {
    public UserSelectPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/userselect/UserSelectPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/userselect/UserSelectPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}