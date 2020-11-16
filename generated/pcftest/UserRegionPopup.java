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
import pcftest.UserRegionPopup.UserRegionPopupScreen;
import pcftest.UserRegionPopup.UserRegionPopupScreen.RegionSearchResultsLV_tb;
import pcftest.UserRegionPopup.UserRegionPopupScreen.RegionSearchResultsLV_tb.UserRegionPopup_SelectButton;
import pcftest.UserRegionPopup.UserRegionPopupScreen._msgs;
import pcftest.UserRegionPopup.UserRegionPopup_UpLink;
import pcftest.UserRegionPopup._Paging;
import pcftest.UserRegionPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/users/UserRegionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserRegionPopup extends PCFLocation {
  public final static String CHECKSUM = "f1a14541f480c6e69afd0e3e99e345a2";
  
  public UserRegionPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("UserRegionPopup"));
  }
  
  public UserRegionPopupScreen getUserRegionPopupScreen() {
    return getOrCreateProperty("UserRegionPopupScreen", "UserRegionPopupScreen", null, pcftest.UserRegionPopup.UserRegionPopupScreen.class);
  }
  
  public UserRegionPopup_UpLink getUserRegionPopup_UpLink() {
    return getOrCreateProperty("UserRegionPopup_UpLink", "UserRegionPopup_UpLink", null, pcftest.UserRegionPopup.UserRegionPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.UserRegionPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.UserRegionPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserRegionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserRegionPopupScreen extends PCFElement {
    public UserRegionPopupScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RegionSearchDV getRegionSearchDV() {
      return getOrCreateProperty("RegionSearchDV", "RegionSearchDV", null, pcftest.RegionSearchDV.class);
    }
    
    public RegionSearchResultsLV getRegionSearchResultsLV() {
      return getOrCreateProperty("RegionSearchResultsLV", "RegionSearchResultsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.RegionSearchResultsLV.class);
    }
    
    public RegionSearchResultsLV_tb getRegionSearchResultsLV_tb() {
      return getOrCreateProperty("RegionSearchResultsLV_tb", "RegionSearchResultsLV_tb", null, pcftest.UserRegionPopup.UserRegionPopupScreen.RegionSearchResultsLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.UserRegionPopup.UserRegionPopupScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserRegionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RegionSearchResultsLV_tb extends PCFElement {
      public RegionSearchResultsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserRegionPopup_SelectButton getUserRegionPopup_SelectButton() {
        return getOrCreateProperty("UserRegionPopup_SelectButton", "UserRegionPopup_SelectButton", null, pcftest.UserRegionPopup.UserRegionPopupScreen.RegionSearchResultsLV_tb.UserRegionPopup_SelectButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/users/UserRegionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class UserRegionPopup_SelectButton extends ClickableActionElement {
        public UserRegionPopup_SelectButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserRegionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/users/UserRegionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserRegionPopup_UpLink extends ClickableActionElement {
    public UserRegionPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserRegionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserRegionPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}