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
import pcftest.MultiUserSearchPopup.MultiUserSearchPopupScreen;
import pcftest.MultiUserSearchPopup.MultiUserSearchPopupScreen.UserSearchResultsLV_tb;
import pcftest.MultiUserSearchPopup.MultiUserSearchPopupScreen.UserSearchResultsLV_tb.MultiUserSearchPopup_SelectButton;
import pcftest.MultiUserSearchPopup.MultiUserSearchPopupScreen.UserSearchResultsLV_tb.RetrieveRequested;
import pcftest.MultiUserSearchPopup.MultiUserSearchPopupScreen._msgs;
import pcftest.MultiUserSearchPopup.MultiUserSearchPopup_UpLink;
import pcftest.MultiUserSearchPopup._Paging;
import pcftest.MultiUserSearchPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/usersearch/MultiUserSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MultiUserSearchPopup extends PCFLocation {
  public final static String CHECKSUM = "43b5ba2caf58b6bdf6dea5f5d9a95324";
  
  public MultiUserSearchPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("MultiUserSearchPopup"));
  }
  
  public MultiUserSearchPopupScreen getMultiUserSearchPopupScreen() {
    return getOrCreateProperty("MultiUserSearchPopupScreen", "MultiUserSearchPopupScreen", null, pcftest.MultiUserSearchPopup.MultiUserSearchPopupScreen.class);
  }
  
  public MultiUserSearchPopup_UpLink getMultiUserSearchPopup_UpLink() {
    return getOrCreateProperty("MultiUserSearchPopup_UpLink", "MultiUserSearchPopup_UpLink", null, pcftest.MultiUserSearchPopup.MultiUserSearchPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.MultiUserSearchPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.MultiUserSearchPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/usersearch/MultiUserSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MultiUserSearchPopupScreen extends PCFElement {
    public MultiUserSearchPopupScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UserSearchDV getUserSearchDV() {
      return getOrCreateProperty("UserSearchDV", "UserSearchDV", null, pcftest.UserSearchDV.class);
    }
    
    public UserSearchResultsLV getUserSearchResultsLV() {
      return getOrCreateProperty("UserSearchResultsLV", "UserSearchResultsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.UserSearchResultsLV.class);
    }
    
    public UserSearchResultsLV_tb getUserSearchResultsLV_tb() {
      return getOrCreateProperty("UserSearchResultsLV_tb", "UserSearchResultsLV_tb", null, pcftest.MultiUserSearchPopup.MultiUserSearchPopupScreen.UserSearchResultsLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.MultiUserSearchPopup.MultiUserSearchPopupScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/usersearch/MultiUserSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserSearchResultsLV_tb extends PCFElement {
      public UserSearchResultsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public MultiUserSearchPopup_SelectButton getMultiUserSearchPopup_SelectButton() {
        return getOrCreateProperty("MultiUserSearchPopup_SelectButton", "MultiUserSearchPopup_SelectButton", null, pcftest.MultiUserSearchPopup.MultiUserSearchPopupScreen.UserSearchResultsLV_tb.MultiUserSearchPopup_SelectButton.class);
      }
      
      public RetrieveRequested getRetrieveRequested() {
        return getOrCreateProperty("RetrieveRequested", "RetrieveRequested", null, pcftest.MultiUserSearchPopup.MultiUserSearchPopupScreen.UserSearchResultsLV_tb.RetrieveRequested.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/usersearch/MultiUserSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class MultiUserSearchPopup_SelectButton extends ClickableActionElement {
        public MultiUserSearchPopup_SelectButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/usersearch/MultiUserSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class RetrieveRequested extends ClickableActionElement {
        public RetrieveRequested(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/usersearch/MultiUserSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/usersearch/MultiUserSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MultiUserSearchPopup_UpLink extends ClickableActionElement {
    public MultiUserSearchPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/usersearch/MultiUserSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/usersearch/MultiUserSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}