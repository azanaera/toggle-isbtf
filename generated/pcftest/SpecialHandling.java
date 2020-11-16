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
import pcftest.SpecialHandling.MenuLinks;
import pcftest.SpecialHandling.MenuLinks.SpecialHandling_AccountAdmin;
import pcftest.SpecialHandling.MenuLinks.SpecialHandling_CustomerServiceTierAdmin;
import pcftest.SpecialHandling.SpecialHandling_UpLink;
import pcftest.SpecialHandling._Paging;
import pcftest.SpecialHandling.__crumb__;
import pcftest.SpecialHandling._msgs;
import pcftest.SpecialHandling.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandling.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SpecialHandling extends PCFLocation {
  public final static String CHECKSUM = "3bee0c8be761cc8988c34f82ec0648cf";
  
  public SpecialHandling(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("SpecialHandling"));
  }
  
  public AccountAdmin getAccountAdmin() {
    return getOrCreateProperty("AccountAdmin", pcftest.AccountAdmin.class);
  }
  
  public CustomerServiceTierAdmin getCustomerServiceTierAdmin() {
    return getOrCreateProperty("CustomerServiceTierAdmin", pcftest.CustomerServiceTierAdmin.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.SpecialHandling.MenuLinks.class, "Admin-MenuLinks-Admin_SpecialHandling");
  }
  
  public SpecialHandling_UpLink getSpecialHandling_UpLink() {
    return getOrCreateProperty("SpecialHandling_UpLink", "SpecialHandling_UpLink", null, pcftest.SpecialHandling.SpecialHandling_UpLink.class);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.SpecialHandling._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.SpecialHandling.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.SpecialHandling._msgs.class);
  }
  
  public Admin get_parent() {
    return getOrCreateProperty("_parent", pcftest.Admin.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.SpecialHandling.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandling.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SpecialHandling_AccountAdmin getSpecialHandling_AccountAdmin() {
      return getOrCreateProperty("SpecialHandling_AccountAdmin", "SpecialHandling_AccountAdmin", null, pcftest.SpecialHandling.MenuLinks.SpecialHandling_AccountAdmin.class);
    }
    
    public SpecialHandling_CustomerServiceTierAdmin getSpecialHandling_CustomerServiceTierAdmin() {
      return getOrCreateProperty("SpecialHandling_CustomerServiceTierAdmin", "SpecialHandling_CustomerServiceTierAdmin", null, pcftest.SpecialHandling.MenuLinks.SpecialHandling_CustomerServiceTierAdmin.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandling.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SpecialHandling_AccountAdmin extends ClickableActionElement {
      public SpecialHandling_AccountAdmin(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AccountAdmin click() {
        return clickThis(pcftest.AccountAdmin.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandling.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SpecialHandling_CustomerServiceTierAdmin extends ClickableActionElement {
      public SpecialHandling_CustomerServiceTierAdmin(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CustomerServiceTierAdmin click() {
        return clickThis(pcftest.CustomerServiceTierAdmin.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandling.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SpecialHandling_UpLink extends ClickableActionElement {
    public SpecialHandling_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandling.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandling.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandling.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/SpecialHandling.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}