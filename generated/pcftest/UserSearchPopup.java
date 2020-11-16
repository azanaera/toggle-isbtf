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
import pcftest.UserSearchPopup.UserSearchPopupScreen;
import pcftest.UserSearchPopup.UserSearchPopupScreen.UserSearchResultsLV_tb;
import pcftest.UserSearchPopup.UserSearchPopupScreen.UserSearchResultsLV_tb.RetrieveRequested;
import pcftest.UserSearchPopup.UserSearchPopupScreen._msgs;
import pcftest.UserSearchPopup.UserSearchPopup_UpLink;
import pcftest.UserSearchPopup._Paging;
import pcftest.UserSearchPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/usersearch/UserSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserSearchPopup extends PCFLocation {
  public final static String CHECKSUM = "d118c4c6dae900cc933edd234e09fb79";
  
  public UserSearchPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("UserSearchPopup"));
  }
  
  public UserSearchPopupScreen getUserSearchPopupScreen() {
    return getOrCreateProperty("UserSearchPopupScreen", "UserSearchPopupScreen", null, pcftest.UserSearchPopup.UserSearchPopupScreen.class);
  }
  
  public UserSearchPopup_UpLink getUserSearchPopup_UpLink() {
    return getOrCreateProperty("UserSearchPopup_UpLink", "UserSearchPopup_UpLink", null, pcftest.UserSearchPopup.UserSearchPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.UserSearchPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.UserSearchPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/usersearch/UserSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserSearchPopupScreen extends PCFElement {
    public UserSearchPopupScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UserSearchDV getUserSearchDV() {
      return getOrCreateProperty("UserSearchDV", "UserSearchDV", null, pcftest.UserSearchDV.class);
    }
    
    public UserSearchResultsLV getUserSearchResultsLV() {
      return getOrCreateProperty("UserSearchResultsLV", "UserSearchResultsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.UserSearchResultsLV.class);
    }
    
    public UserSearchResultsLV_tb getUserSearchResultsLV_tb() {
      return getOrCreateProperty("UserSearchResultsLV_tb", "UserSearchResultsLV_tb", null, pcftest.UserSearchPopup.UserSearchPopupScreen.UserSearchResultsLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.UserSearchPopup.UserSearchPopupScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/usersearch/UserSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserSearchResultsLV_tb extends PCFElement {
      public UserSearchResultsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public RetrieveRequested getRetrieveRequested() {
        return getOrCreateProperty("RetrieveRequested", "RetrieveRequested", null, pcftest.UserSearchPopup.UserSearchPopupScreen.UserSearchResultsLV_tb.RetrieveRequested.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/shared/usersearch/UserSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/shared/usersearch/UserSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/usersearch/UserSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserSearchPopup_UpLink extends ClickableActionElement {
    public UserSearchPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/usersearch/UserSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/usersearch/UserSearchPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}