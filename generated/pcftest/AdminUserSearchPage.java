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
import pcftest.AdminUserSearchPage.AdminUserSearchPage_UpLink;
import pcftest.AdminUserSearchPage.UserSearchScreen;
import pcftest.AdminUserSearchPage.UserSearchScreen.AdminUserSearchResultsLV_tb;
import pcftest.AdminUserSearchPage.UserSearchScreen.AdminUserSearchResultsLV_tb.RetrieveRequested;
import pcftest.AdminUserSearchPage.UserSearchScreen._msgs;
import pcftest.AdminUserSearchPage._Paging;
import pcftest.AdminUserSearchPage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/usersandsecurity/AdminUserSearchPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AdminUserSearchPage extends PCFLocation {
  public final static String CHECKSUM = "b48db4ea458567d7949f4163ea9a638c";
  
  public AdminUserSearchPage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AdminUserSearchPage"));
  }
  
  public AdminUserSearchPage_UpLink getAdminUserSearchPage_UpLink() {
    return getOrCreateProperty("AdminUserSearchPage_UpLink", "AdminUserSearchPage_UpLink", null, pcftest.AdminUserSearchPage.AdminUserSearchPage_UpLink.class);
  }
  
  public UserSearchScreen getUserSearchScreen() {
    return getOrCreateProperty("UserSearchScreen", "UserSearchScreen", null, pcftest.AdminUserSearchPage.UserSearchScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AdminUserSearchPage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AdminUserSearchPage.__crumb__.class);
  }
  
  public UsersAndSecurity get_parent() {
    return getOrCreateProperty("_parent", pcftest.UsersAndSecurity.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/AdminUserSearchPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdminUserSearchPage_UpLink extends ClickableActionElement {
    public AdminUserSearchPage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/AdminUserSearchPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserSearchScreen extends PCFElement {
    public UserSearchScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AdminUserSearchResultsLV getAdminUserSearchResultsLV() {
      return getOrCreateProperty("AdminUserSearchResultsLV", "AdminUserSearchResultsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.AdminUserSearchResultsLV.class);
    }
    
    public AdminUserSearchResultsLV_tb getAdminUserSearchResultsLV_tb() {
      return getOrCreateProperty("AdminUserSearchResultsLV_tb", "AdminUserSearchResultsLV_tb", null, pcftest.AdminUserSearchPage.UserSearchScreen.AdminUserSearchResultsLV_tb.class);
    }
    
    public UserSearchDV getUserSearchDV() {
      return getOrCreateProperty("UserSearchDV", "UserSearchDV", null, pcftest.UserSearchDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.AdminUserSearchPage.UserSearchScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/usersandsecurity/AdminUserSearchPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AdminUserSearchResultsLV_tb extends PCFElement {
      public AdminUserSearchResultsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public RetrieveRequested getRetrieveRequested() {
        return getOrCreateProperty("RetrieveRequested", "RetrieveRequested", null, pcftest.AdminUserSearchPage.UserSearchScreen.AdminUserSearchResultsLV_tb.RetrieveRequested.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/usersandsecurity/AdminUserSearchPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/admin/usersandsecurity/AdminUserSearchPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/AdminUserSearchPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/AdminUserSearchPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}