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
import pcftest.AdminGroupSearchPage.AdminGroupSearchPage_UpLink;
import pcftest.AdminGroupSearchPage.GroupSearchScreen;
import pcftest.AdminGroupSearchPage.GroupSearchScreen.GroupSearchResultsLV_tb;
import pcftest.AdminGroupSearchPage.GroupSearchScreen._msgs;
import pcftest.AdminGroupSearchPage._Paging;
import pcftest.AdminGroupSearchPage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/usersandsecurity/AdminGroupSearchPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AdminGroupSearchPage extends PCFLocation {
  public final static String CHECKSUM = "648f7cc0d0eb739b5ec0d9349583844d";
  
  public AdminGroupSearchPage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AdminGroupSearchPage"));
  }
  
  public AdminGroupSearchPage_UpLink getAdminGroupSearchPage_UpLink() {
    return getOrCreateProperty("AdminGroupSearchPage_UpLink", "AdminGroupSearchPage_UpLink", null, pcftest.AdminGroupSearchPage.AdminGroupSearchPage_UpLink.class);
  }
  
  public GroupSearchScreen getGroupSearchScreen() {
    return getOrCreateProperty("GroupSearchScreen", "GroupSearchScreen", null, pcftest.AdminGroupSearchPage.GroupSearchScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AdminGroupSearchPage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AdminGroupSearchPage.__crumb__.class);
  }
  
  public UsersAndSecurity get_parent() {
    return getOrCreateProperty("_parent", pcftest.UsersAndSecurity.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/AdminGroupSearchPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdminGroupSearchPage_UpLink extends ClickableActionElement {
    public AdminGroupSearchPage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/AdminGroupSearchPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupSearchScreen extends PCFElement {
    public GroupSearchScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GroupSearchDV getGroupSearchDV() {
      return getOrCreateProperty("GroupSearchDV", "GroupSearchDV", null, pcftest.GroupSearchDV.class);
    }
    
    public GroupSearchResultsLV getGroupSearchResultsLV() {
      return getOrCreateProperty("GroupSearchResultsLV", "GroupSearchResultsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.GroupSearchResultsLV.class);
    }
    
    public GroupSearchResultsLV_tb getGroupSearchResultsLV_tb() {
      return getOrCreateProperty("GroupSearchResultsLV_tb", "GroupSearchResultsLV_tb", null, pcftest.AdminGroupSearchPage.GroupSearchScreen.GroupSearchResultsLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.AdminGroupSearchPage.GroupSearchScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/usersandsecurity/AdminGroupSearchPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class GroupSearchResultsLV_tb extends PCFElement {
      public GroupSearchResultsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/usersandsecurity/AdminGroupSearchPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/AdminGroupSearchPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/AdminGroupSearchPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}