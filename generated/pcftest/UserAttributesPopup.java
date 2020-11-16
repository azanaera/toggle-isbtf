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
import pcftest.UserAttributesPopup.UserAttributesPopupScreen;
import pcftest.UserAttributesPopup.UserAttributesPopupScreen.UserAttributesPopup_CancelButton;
import pcftest.UserAttributesPopup.UserAttributesPopupScreen.UserAttributesSearchLV_tb;
import pcftest.UserAttributesPopup.UserAttributesPopupScreen.UserAttributesSearchLV_tb.UserAttributesPopup_SelectButton;
import pcftest.UserAttributesPopup.UserAttributesPopupScreen._msgs;
import pcftest.UserAttributesPopup.UserAttributesPopup_UpLink;
import pcftest.UserAttributesPopup._Paging;
import pcftest.UserAttributesPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/users/UserAttributesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserAttributesPopup extends PCFLocation {
  public final static String CHECKSUM = "0c46f7d1ce0dd84a8c6b9ec68978c86c";
  
  public UserAttributesPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("UserAttributesPopup"));
  }
  
  public UserAttributesPopupScreen getUserAttributesPopupScreen() {
    return getOrCreateProperty("UserAttributesPopupScreen", "UserAttributesPopupScreen", null, pcftest.UserAttributesPopup.UserAttributesPopupScreen.class);
  }
  
  public UserAttributesPopup_UpLink getUserAttributesPopup_UpLink() {
    return getOrCreateProperty("UserAttributesPopup_UpLink", "UserAttributesPopup_UpLink", null, pcftest.UserAttributesPopup.UserAttributesPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.UserAttributesPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.UserAttributesPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserAttributesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserAttributesPopupScreen extends PCFElement {
    public UserAttributesPopupScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UserAttributesPopup_CancelButton getUserAttributesPopup_CancelButton() {
      return getOrCreateProperty("UserAttributesPopup_CancelButton", "UserAttributesPopup_CancelButton", null, pcftest.UserAttributesPopup.UserAttributesPopupScreen.UserAttributesPopup_CancelButton.class);
    }
    
    public UserAttributesSearchDV getUserAttributesSearchDV() {
      return getOrCreateProperty("UserAttributesSearchDV", "UserAttributesSearchDV", null, pcftest.UserAttributesSearchDV.class);
    }
    
    public UserAttributesSearchLV getUserAttributesSearchLV() {
      return getOrCreateProperty("UserAttributesSearchLV", "UserAttributesSearchLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.UserAttributesSearchLV.class);
    }
    
    public UserAttributesSearchLV_tb getUserAttributesSearchLV_tb() {
      return getOrCreateProperty("UserAttributesSearchLV_tb", "UserAttributesSearchLV_tb", null, pcftest.UserAttributesPopup.UserAttributesPopupScreen.UserAttributesSearchLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.UserAttributesPopup.UserAttributesPopupScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserAttributesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserAttributesPopup_CancelButton extends ClickableActionElement {
      public UserAttributesPopup_CancelButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserAttributesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserAttributesSearchLV_tb extends PCFElement {
      public UserAttributesSearchLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserAttributesPopup_SelectButton getUserAttributesPopup_SelectButton() {
        return getOrCreateProperty("UserAttributesPopup_SelectButton", "UserAttributesPopup_SelectButton", null, pcftest.UserAttributesPopup.UserAttributesPopupScreen.UserAttributesSearchLV_tb.UserAttributesPopup_SelectButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/users/UserAttributesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class UserAttributesPopup_SelectButton extends ClickableActionElement {
        public UserAttributesPopup_SelectButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserAttributesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/users/UserAttributesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserAttributesPopup_UpLink extends ClickableActionElement {
    public UserAttributesPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserAttributesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserAttributesPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}