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
import pcftest.UsersAndSecurity.MenuLinks;
import pcftest.UsersAndSecurity.MenuLinks.UsersAndSecurity_AdminGroupSearchPage;
import pcftest.UsersAndSecurity.MenuLinks.UsersAndSecurity_AdminUserSearchPage;
import pcftest.UsersAndSecurity.MenuLinks.UsersAndSecurity_Attributes;
import pcftest.UsersAndSecurity.MenuLinks.UsersAndSecurity_AuthorityLimitProfiles;
import pcftest.UsersAndSecurity.MenuLinks.UsersAndSecurity_Regions;
import pcftest.UsersAndSecurity.MenuLinks.UsersAndSecurity_Roles;
import pcftest.UsersAndSecurity.MenuLinks.UsersAndSecurity_SecurityZones;
import pcftest.UsersAndSecurity.UsersAndSecurity_UpLink;
import pcftest.UsersAndSecurity._Paging;
import pcftest.UsersAndSecurity.__crumb__;
import pcftest.UsersAndSecurity._msgs;
import pcftest.UsersAndSecurity.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/usersandsecurity/UsersAndSecurity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UsersAndSecurity extends PCFLocation {
  public final static String CHECKSUM = "8f270171e2d7d9c74fe045494121a30a";
  
  public UsersAndSecurity(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("UsersAndSecurity"));
  }
  
  public AdminGroupSearchPage getAdminGroupSearchPage() {
    return getOrCreateProperty("AdminGroupSearchPage", pcftest.AdminGroupSearchPage.class);
  }
  
  public AdminUserSearchPage getAdminUserSearchPage() {
    return getOrCreateProperty("AdminUserSearchPage", pcftest.AdminUserSearchPage.class);
  }
  
  public Attributes getAttributes() {
    return getOrCreateProperty("Attributes", pcftest.Attributes.class);
  }
  
  public AuthorityLimitProfiles getAuthorityLimitProfiles() {
    return getOrCreateProperty("AuthorityLimitProfiles", pcftest.AuthorityLimitProfiles.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.UsersAndSecurity.MenuLinks.class, "Admin-MenuLinks-Admin_UsersAndSecurity");
  }
  
  public Regions getRegions() {
    return getOrCreateProperty("Regions", pcftest.Regions.class);
  }
  
  public Roles getRoles() {
    return getOrCreateProperty("Roles", pcftest.Roles.class);
  }
  
  public SecurityZones getSecurityZones() {
    return getOrCreateProperty("SecurityZones", pcftest.SecurityZones.class);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public UsersAndSecurity_UpLink getUsersAndSecurity_UpLink() {
    return getOrCreateProperty("UsersAndSecurity_UpLink", "UsersAndSecurity_UpLink", null, pcftest.UsersAndSecurity.UsersAndSecurity_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.UsersAndSecurity._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.UsersAndSecurity.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.UsersAndSecurity._msgs.class);
  }
  
  public Admin get_parent() {
    return getOrCreateProperty("_parent", pcftest.Admin.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.UsersAndSecurity.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/UsersAndSecurity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UsersAndSecurity_AdminGroupSearchPage getUsersAndSecurity_AdminGroupSearchPage() {
      return getOrCreateProperty("UsersAndSecurity_AdminGroupSearchPage", "UsersAndSecurity_AdminGroupSearchPage", null, pcftest.UsersAndSecurity.MenuLinks.UsersAndSecurity_AdminGroupSearchPage.class);
    }
    
    public UsersAndSecurity_AdminUserSearchPage getUsersAndSecurity_AdminUserSearchPage() {
      return getOrCreateProperty("UsersAndSecurity_AdminUserSearchPage", "UsersAndSecurity_AdminUserSearchPage", null, pcftest.UsersAndSecurity.MenuLinks.UsersAndSecurity_AdminUserSearchPage.class);
    }
    
    public UsersAndSecurity_Attributes getUsersAndSecurity_Attributes() {
      return getOrCreateProperty("UsersAndSecurity_Attributes", "UsersAndSecurity_Attributes", null, pcftest.UsersAndSecurity.MenuLinks.UsersAndSecurity_Attributes.class);
    }
    
    public UsersAndSecurity_AuthorityLimitProfiles getUsersAndSecurity_AuthorityLimitProfiles() {
      return getOrCreateProperty("UsersAndSecurity_AuthorityLimitProfiles", "UsersAndSecurity_AuthorityLimitProfiles", null, pcftest.UsersAndSecurity.MenuLinks.UsersAndSecurity_AuthorityLimitProfiles.class);
    }
    
    public UsersAndSecurity_Regions getUsersAndSecurity_Regions() {
      return getOrCreateProperty("UsersAndSecurity_Regions", "UsersAndSecurity_Regions", null, pcftest.UsersAndSecurity.MenuLinks.UsersAndSecurity_Regions.class);
    }
    
    public UsersAndSecurity_Roles getUsersAndSecurity_Roles() {
      return getOrCreateProperty("UsersAndSecurity_Roles", "UsersAndSecurity_Roles", null, pcftest.UsersAndSecurity.MenuLinks.UsersAndSecurity_Roles.class);
    }
    
    public UsersAndSecurity_SecurityZones getUsersAndSecurity_SecurityZones() {
      return getOrCreateProperty("UsersAndSecurity_SecurityZones", "UsersAndSecurity_SecurityZones", null, pcftest.UsersAndSecurity.MenuLinks.UsersAndSecurity_SecurityZones.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/usersandsecurity/UsersAndSecurity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UsersAndSecurity_AdminGroupSearchPage extends ClickableActionElement {
      public UsersAndSecurity_AdminGroupSearchPage(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AdminGroupSearchPage click() {
        return clickThis(pcftest.AdminGroupSearchPage.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/usersandsecurity/UsersAndSecurity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UsersAndSecurity_AdminUserSearchPage extends ClickableActionElement {
      public UsersAndSecurity_AdminUserSearchPage(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AdminUserSearchPage click() {
        return clickThis(pcftest.AdminUserSearchPage.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/usersandsecurity/UsersAndSecurity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UsersAndSecurity_Attributes extends ClickableActionElement {
      public UsersAndSecurity_Attributes(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Attributes click() {
        return clickThis(pcftest.Attributes.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/usersandsecurity/UsersAndSecurity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UsersAndSecurity_AuthorityLimitProfiles extends ClickableActionElement {
      public UsersAndSecurity_AuthorityLimitProfiles(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AuthorityLimitProfiles click() {
        return clickThis(pcftest.AuthorityLimitProfiles.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/usersandsecurity/UsersAndSecurity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UsersAndSecurity_Regions extends ClickableActionElement {
      public UsersAndSecurity_Regions(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/usersandsecurity/UsersAndSecurity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UsersAndSecurity_Roles extends ClickableActionElement {
      public UsersAndSecurity_Roles(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Roles click() {
        return clickThis(pcftest.Roles.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/usersandsecurity/UsersAndSecurity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UsersAndSecurity_SecurityZones extends ClickableActionElement {
      public UsersAndSecurity_SecurityZones(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public SecurityZones click() {
        return clickThis(pcftest.SecurityZones.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/UsersAndSecurity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UsersAndSecurity_UpLink extends ClickableActionElement {
    public UsersAndSecurity_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/UsersAndSecurity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/UsersAndSecurity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/UsersAndSecurity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/usersandsecurity/UsersAndSecurity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}