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
import pcftest.UserDetailGroup.MenuLinks;
import pcftest.UserDetailGroup.MenuLinks.UserDetailGroup_UserActivitiesPage;
import pcftest.UserDetailGroup.MenuLinks.UserDetailGroup_UserClaimsPage;
import pcftest.UserDetailGroup.MenuLinks.UserDetailGroup_UserDetailPage;
import pcftest.UserDetailGroup.MenuLinks.UserDetailGroup_UserExposuresPage;
import pcftest.UserDetailGroup.MenuLinks.UserDetailGroup_UserMattersPage;
import pcftest.UserDetailGroup.UserDetailGroup_UpLink;
import pcftest.UserDetailGroup._Paging;
import pcftest.UserDetailGroup.__crumb__;
import pcftest.UserDetailGroup._msgs;
import pcftest.UserDetailGroup.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/users/UserDetailGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserDetailGroup extends PCFLocation {
  public final static String CHECKSUM = "1720afbbbf3e41ac6306d00326503421";
  
  public UserDetailGroup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("UserDetailGroup"));
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.UserDetailGroup.MenuLinks.class, null);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public UserActivitiesPage getUserActivitiesPage() {
    return getOrCreateProperty("UserActivitiesPage", pcftest.UserActivitiesPage.class);
  }
  
  public UserClaimsPage getUserClaimsPage() {
    return getOrCreateProperty("UserClaimsPage", pcftest.UserClaimsPage.class);
  }
  
  public UserDetailGroup_UpLink getUserDetailGroup_UpLink() {
    return getOrCreateProperty("UserDetailGroup_UpLink", "UserDetailGroup_UpLink", null, pcftest.UserDetailGroup.UserDetailGroup_UpLink.class);
  }
  
  public UserDetailPage getUserDetailPage() {
    return getOrCreateProperty("UserDetailPage", pcftest.UserDetailPage.class);
  }
  
  public UserExposuresPage getUserExposuresPage() {
    return getOrCreateProperty("UserExposuresPage", pcftest.UserExposuresPage.class);
  }
  
  public UserMattersPage getUserMattersPage() {
    return getOrCreateProperty("UserMattersPage", pcftest.UserMattersPage.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.UserDetailGroup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.UserDetailGroup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.UserDetailGroup._msgs.class);
  }
  
  public Admin get_parent() {
    return getOrCreateProperty("_parent", pcftest.Admin.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.UserDetailGroup.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserDetailGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UserDetailGroup_UserActivitiesPage getUserDetailGroup_UserActivitiesPage() {
      return getOrCreateProperty("UserDetailGroup_UserActivitiesPage", "UserDetailGroup_UserActivitiesPage", null, pcftest.UserDetailGroup.MenuLinks.UserDetailGroup_UserActivitiesPage.class);
    }
    
    public UserDetailGroup_UserClaimsPage getUserDetailGroup_UserClaimsPage() {
      return getOrCreateProperty("UserDetailGroup_UserClaimsPage", "UserDetailGroup_UserClaimsPage", null, pcftest.UserDetailGroup.MenuLinks.UserDetailGroup_UserClaimsPage.class);
    }
    
    public UserDetailGroup_UserDetailPage getUserDetailGroup_UserDetailPage() {
      return getOrCreateProperty("UserDetailGroup_UserDetailPage", "UserDetailGroup_UserDetailPage", null, pcftest.UserDetailGroup.MenuLinks.UserDetailGroup_UserDetailPage.class);
    }
    
    public UserDetailGroup_UserExposuresPage getUserDetailGroup_UserExposuresPage() {
      return getOrCreateProperty("UserDetailGroup_UserExposuresPage", "UserDetailGroup_UserExposuresPage", null, pcftest.UserDetailGroup.MenuLinks.UserDetailGroup_UserExposuresPage.class);
    }
    
    public UserDetailGroup_UserMattersPage getUserDetailGroup_UserMattersPage() {
      return getOrCreateProperty("UserDetailGroup_UserMattersPage", "UserDetailGroup_UserMattersPage", null, pcftest.UserDetailGroup.MenuLinks.UserDetailGroup_UserMattersPage.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserDetailGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserDetailGroup_UserActivitiesPage extends ClickableActionElement {
      public UserDetailGroup_UserActivitiesPage(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserActivitiesPage click() {
        return clickThis(pcftest.UserActivitiesPage.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserDetailGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserDetailGroup_UserClaimsPage extends ClickableActionElement {
      public UserDetailGroup_UserClaimsPage(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserClaimsPage click() {
        return clickThis(pcftest.UserClaimsPage.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserDetailGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserDetailGroup_UserDetailPage extends ClickableActionElement {
      public UserDetailGroup_UserDetailPage(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserDetailPage click() {
        return clickThis(pcftest.UserDetailPage.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserDetailGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserDetailGroup_UserExposuresPage extends ClickableActionElement {
      public UserDetailGroup_UserExposuresPage(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserExposuresPage click() {
        return clickThis(pcftest.UserExposuresPage.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/users/UserDetailGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UserDetailGroup_UserMattersPage extends ClickableActionElement {
      public UserDetailGroup_UserMattersPage(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserMattersPage click() {
        return clickThis(pcftest.UserMattersPage.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserDetailGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserDetailGroup_UpLink extends ClickableActionElement {
    public UserDetailGroup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserDetailGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserDetailGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserDetailGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserDetailGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}