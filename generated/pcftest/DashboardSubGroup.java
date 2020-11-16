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
import pcftest.DashboardSubGroup.DashboardSubGroup_UpLink;
import pcftest.DashboardSubGroup.MenuLinks;
import pcftest.DashboardSubGroup.MenuLinks.DashboardSubGroup_DashboardClaimActivity;
import pcftest.DashboardSubGroup.MenuLinks.DashboardSubGroup_DashboardClaimCount;
import pcftest.DashboardSubGroup.MenuLinks.DashboardSubGroup_DashboardCurrentFinancials;
import pcftest.DashboardSubGroup.MenuLinks.DashboardSubGroup_DashboardPeriodFinancials;
import pcftest.DashboardSubGroup._Paging;
import pcftest.DashboardSubGroup.__crumb__;
import pcftest.DashboardSubGroup._msgs;
import pcftest.DashboardSubGroup.actWizard;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/dashboard/DashboardSubGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DashboardSubGroup extends PCFLocation {
  public final static String CHECKSUM = "6999554be1fbee60424343659b31ec53";
  
  public DashboardSubGroup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DashboardSubGroup"));
  }
  
  public DashboardClaimActivity getDashboardClaimActivity() {
    return getOrCreateProperty("DashboardClaimActivity", pcftest.DashboardClaimActivity.class);
  }
  
  public DashboardClaimCount getDashboardClaimCount() {
    return getOrCreateProperty("DashboardClaimCount", pcftest.DashboardClaimCount.class);
  }
  
  public DashboardCurrentFinancials getDashboardCurrentFinancials() {
    return getOrCreateProperty("DashboardCurrentFinancials", pcftest.DashboardCurrentFinancials.class);
  }
  
  public DashboardPeriodFinancials getDashboardPeriodFinancials() {
    return getOrCreateProperty("DashboardPeriodFinancials", pcftest.DashboardPeriodFinancials.class);
  }
  
  public DashboardSubGroup_UpLink getDashboardSubGroup_UpLink() {
    return getOrCreateProperty("DashboardSubGroup_UpLink", "DashboardSubGroup_UpLink", null, pcftest.DashboardSubGroup.DashboardSubGroup_UpLink.class);
  }
  
  public MenuLinks getMenuLinks() {
    return getOrCreateMenuLinksProperty("MenuLinks", "MenuLinks", null, pcftest.DashboardSubGroup.MenuLinks.class, null);
  }
  
  public TabBar getTabBar() {
    return getOrCreateProperty("TabBar", pcftest.TabBar.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DashboardSubGroup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DashboardSubGroup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DashboardSubGroup._msgs.class);
  }
  
  public DashboardGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.DashboardGroup.class);
  }
  
  public actWizard getactWizard() {
    return getOrCreateProperty("actWizard", "actWizard", null, pcftest.DashboardSubGroup.actWizard.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/DashboardSubGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DashboardSubGroup_UpLink extends ClickableActionElement {
    public DashboardSubGroup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/DashboardSubGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MenuLinks extends PCFElement {
    public MenuLinks(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DashboardSubGroup_DashboardClaimActivity getDashboardSubGroup_DashboardClaimActivity() {
      return getOrCreateProperty("DashboardSubGroup_DashboardClaimActivity", "DashboardSubGroup_DashboardClaimActivity", null, pcftest.DashboardSubGroup.MenuLinks.DashboardSubGroup_DashboardClaimActivity.class);
    }
    
    public DashboardSubGroup_DashboardClaimCount getDashboardSubGroup_DashboardClaimCount() {
      return getOrCreateProperty("DashboardSubGroup_DashboardClaimCount", "DashboardSubGroup_DashboardClaimCount", null, pcftest.DashboardSubGroup.MenuLinks.DashboardSubGroup_DashboardClaimCount.class);
    }
    
    public DashboardSubGroup_DashboardCurrentFinancials getDashboardSubGroup_DashboardCurrentFinancials() {
      return getOrCreateProperty("DashboardSubGroup_DashboardCurrentFinancials", "DashboardSubGroup_DashboardCurrentFinancials", null, pcftest.DashboardSubGroup.MenuLinks.DashboardSubGroup_DashboardCurrentFinancials.class);
    }
    
    public DashboardSubGroup_DashboardPeriodFinancials getDashboardSubGroup_DashboardPeriodFinancials() {
      return getOrCreateProperty("DashboardSubGroup_DashboardPeriodFinancials", "DashboardSubGroup_DashboardPeriodFinancials", null, pcftest.DashboardSubGroup.MenuLinks.DashboardSubGroup_DashboardPeriodFinancials.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/DashboardSubGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DashboardSubGroup_DashboardClaimActivity extends ClickableActionElement {
      public DashboardSubGroup_DashboardClaimActivity(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DashboardClaimActivity click() {
        return clickThis(pcftest.DashboardClaimActivity.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/DashboardSubGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DashboardSubGroup_DashboardClaimCount extends ClickableActionElement {
      public DashboardSubGroup_DashboardClaimCount(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DashboardClaimCount click() {
        return clickThis(pcftest.DashboardClaimCount.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/DashboardSubGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DashboardSubGroup_DashboardCurrentFinancials extends ClickableActionElement {
      public DashboardSubGroup_DashboardCurrentFinancials(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DashboardCurrentFinancials click() {
        return clickThis(pcftest.DashboardCurrentFinancials.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/dashboard/DashboardSubGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DashboardSubGroup_DashboardPeriodFinancials extends ClickableActionElement {
      public DashboardSubGroup_DashboardPeriodFinancials(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DashboardPeriodFinancials click() {
        return clickThis(pcftest.DashboardPeriodFinancials.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/DashboardSubGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/DashboardSubGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/DashboardSubGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/dashboard/DashboardSubGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actWizard extends ClickableActionElement {
    public actWizard(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}