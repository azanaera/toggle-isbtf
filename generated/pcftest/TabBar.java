package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ActionElementWithAJAXMenu;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.QuickJumpElement;
import gw.smoketest.platform.web.TabBarElement;
import gw.smoketest.platform.web.UnsavedWorkElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.TabBar.AboutTabBarLink;
import pcftest.TabBar.AddressBookTab;
import pcftest.TabBar.AddressBookTab.AddressBook_AddressBookSearch;
import pcftest.TabBar.AdminTab;
import pcftest.TabBar.AdminTab.AdminTab_Admin;
import pcftest.TabBar.AdminTab.AdminTab_PrintUserGroupTree;
import pcftest.TabBar.ClaimTab;
import pcftest.TabBar.ClaimTab.ClaimTab_FNOLWizard;
import pcftest.TabBar.ClaimTab.ClaimTab_FindClaim_Button;
import pcftest.TabBar.ClaimTab.entry.ClaimMenuClaim;
import pcftest.TabBar.DashboardTab;
import pcftest.TabBar.DesktopTab;
import pcftest.TabBar.DesktopTab.Desktop_BulkPay;
import pcftest.TabBar.DesktopTab.Desktop_DesktopActivities;
import pcftest.TabBar.DesktopTab.Desktop_DesktopAwaitingAssignment;
import pcftest.TabBar.DesktopTab.Desktop_DesktopCalendarGroup;
import pcftest.TabBar.DesktopTab.Desktop_DesktopCalendarGroup.DesktopCalendarGroup_Calendar;
import pcftest.TabBar.DesktopTab.Desktop_DesktopCalendarGroup.DesktopCalendarGroup_SupervisorCalendar;
import pcftest.TabBar.DesktopTab.Desktop_DesktopClaims;
import pcftest.TabBar.DesktopTab.Desktop_DesktopExposures;
import pcftest.TabBar.DesktopTab.Desktop_DesktopQueuedActivities;
import pcftest.TabBar.DesktopTab.Desktop_DesktopSubrogations;
import pcftest.TabBar.HelpTabBarLink;
import pcftest.TabBar.InternalToolsHiddenLink;
import pcftest.TabBar.LanguageTabBarLink;
import pcftest.TabBar.LanguageTabBarLink.languageSwitcher;
import pcftest.TabBar.LanguageTabBarLink.languageSwitcher.entry.langs;
import pcftest.TabBar.LanguageTabBarLink.localeSwitcher;
import pcftest.TabBar.LanguageTabBarLink.localeSwitcher.entry.locales;
import pcftest.TabBar.LogoutOAuthTabBarLink;
import pcftest.TabBar.LogoutTabBarLink;
import pcftest.TabBar.OpenPreferencesTabBarLink;
import pcftest.TabBar.ProfilerHiddenLink;
import pcftest.TabBar.QuickJump;
import pcftest.TabBar.ReloadPCFTabBarLink;
import pcftest.TabBar.ReportTab;
import pcftest.TabBar.SearchTab;
import pcftest.TabBar.SearchTab.Search_ActivitySearch;
import pcftest.TabBar.SearchTab.Search_BulkInvoiceSearch;
import pcftest.TabBar.SearchTab.Search_ClaimSearchesGroup;
import pcftest.TabBar.SearchTab.Search_ClaimSearchesGroup.ClaimSearchesGroup_CatastropheSearch;
import pcftest.TabBar.SearchTab.Search_ClaimSearchesGroup.ClaimSearchesGroup_ClaimSearch;
import pcftest.TabBar.SearchTab.Search_ClaimSearchesGroup.ClaimSearchesGroup_FreeTextClaimSearch;
import pcftest.TabBar.SearchTab.Search_ClaimSearchesGroup.ClaimSearchesGroup_SimpleClaimSearch;
import pcftest.TabBar.SearchTab.Search_PaymentSearch;
import pcftest.TabBar.SearchTab.Search_RecoverySearch;
import pcftest.TabBar.TeamTab;
import pcftest.TabBar.UnsavedWorkTabBarLink;
import pcftest.TabBar.VacationTab;
import pcftest.TabBar.VacationTab.Vacation_VacationActivities;
import pcftest.TabBar.VacationTab.Vacation_VacationClaims;
import pcftest.TabBar.VacationTab.Vacation_VacationExposures;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TabBar extends TabBarElement {
  public final static String CHECKSUM = "448efb08c68ed61765b99f435c21a68f";
  
  public TabBar(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("TabBar"));
  }
  
  public AboutTabBarLink getAboutTabBarLink() {
    return getOrCreateProperty("AboutTabBarLink", "AboutTabBarLink", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PreferencesMenuItem, pcftest.TabBar.AboutTabBarLink.class);
  }
  
  public AddressBookTab getAddressBookTab() {
    return getOrCreateProperty("AddressBookTab", "AddressBookTab", null, pcftest.TabBar.AddressBookTab.class);
  }
  
  public AdminTab getAdminTab() {
    return getOrCreateProperty("AdminTab", "AdminTab", null, pcftest.TabBar.AdminTab.class);
  }
  
  public ClaimTab getClaimTab() {
    return getOrCreateProperty("ClaimTab", "ClaimTab", null, pcftest.TabBar.ClaimTab.class);
  }
  
  public DashboardTab getDashboardTab() {
    return getOrCreateProperty("DashboardTab", "DashboardTab", null, pcftest.TabBar.DashboardTab.class);
  }
  
  public DesktopTab getDesktopTab() {
    return getOrCreateProperty("DesktopTab", "DesktopTab", null, pcftest.TabBar.DesktopTab.class);
  }
  
  public HelpTabBarLink getHelpTabBarLink() {
    return getOrCreateProperty("HelpTabBarLink", "HelpTabBarLink", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PreferencesMenuItem, pcftest.TabBar.HelpTabBarLink.class);
  }
  
  public InternalToolsHiddenLink getInternalToolsHiddenLink() {
    return getOrCreateProperty("InternalToolsHiddenLink", "InternalToolsHiddenLink", null, pcftest.TabBar.InternalToolsHiddenLink.class);
  }
  
  public LanguageTabBarLink getLanguageTabBarLink() {
    return getOrCreateProperty("LanguageTabBarLink", "LanguageTabBarLink", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PreferencesMenuItem, pcftest.TabBar.LanguageTabBarLink.class);
  }
  
  public LogoutOAuthTabBarLink getLogoutOAuthTabBarLink() {
    return getOrCreateProperty("LogoutOAuthTabBarLink", "LogoutOAuthTabBarLink", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PreferencesMenuItem, pcftest.TabBar.LogoutOAuthTabBarLink.class);
  }
  
  public LogoutTabBarLink getLogoutTabBarLink() {
    return getOrCreateProperty("LogoutTabBarLink", "LogoutTabBarLink", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PreferencesMenuItem, pcftest.TabBar.LogoutTabBarLink.class);
  }
  
  public OpenPreferencesTabBarLink getOpenPreferencesTabBarLink() {
    return getOrCreateProperty("OpenPreferencesTabBarLink", "OpenPreferencesTabBarLink", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PreferencesMenuItem, pcftest.TabBar.OpenPreferencesTabBarLink.class);
  }
  
  public ProfilerHiddenLink getProfilerHiddenLink() {
    return getOrCreateProperty("ProfilerHiddenLink", "ProfilerHiddenLink", null, pcftest.TabBar.ProfilerHiddenLink.class);
  }
  
  public QuickJump getQuickJump() {
    return getOrCreateProperty("QuickJump", pcftest.TabBar.QuickJump.class);
  }
  
  public ReloadPCFTabBarLink getReloadPCFTabBarLink() {
    return getOrCreateProperty("ReloadPCFTabBarLink", "ReloadPCFTabBarLink", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PreferencesMenuItem, pcftest.TabBar.ReloadPCFTabBarLink.class);
  }
  
  public ReportTab getReportTab() {
    return getOrCreateProperty("ReportTab", "ReportTab", null, pcftest.TabBar.ReportTab.class);
  }
  
  public SearchTab getSearchTab() {
    return getOrCreateProperty("SearchTab", "SearchTab", null, pcftest.TabBar.SearchTab.class);
  }
  
  public SystemAlertBar getSystemAlertBar() {
    return getOrCreateProperty("SystemAlertBar", "SystemAlertBar", null, pcftest.SystemAlertBar.class);
  }
  
  public TeamTab getTeamTab() {
    return getOrCreateProperty("TeamTab", "TeamTab", null, pcftest.TabBar.TeamTab.class);
  }
  
  public UnsavedWorkTabBarLink getUnsavedWorkTabBarLink() {
    return getOrCreateProperty("UnsavedWorkTabBarLink", "UnsavedWorkTabBarLink", null, pcftest.TabBar.UnsavedWorkTabBarLink.class);
  }
  
  public VacationTab getVacationTab() {
    return getOrCreateProperty("VacationTab", "VacationTab", null, pcftest.TabBar.VacationTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AboutTabBarLink extends ClickableActionElement {
    public AboutTabBarLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookTab extends ClickableActionElement {
    public AddressBookTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    public AddressBook_AddressBookSearch getAddressBook_AddressBookSearch() {
      return getOrCreateProperty("AddressBook_AddressBookSearch", "AddressBook_AddressBookSearch", null, pcftest.TabBar.AddressBookTab.AddressBook_AddressBookSearch.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/addressbook/AddressBook.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddressBook_AddressBookSearch extends ClickableActionElement {
      public AddressBook_AddressBookSearch(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookSearch click() {
        return clickThis(pcftest.AddressBookSearch.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdminTab extends ClickableActionElement {
    public AdminTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    public AdminTab_Admin getAdminTab_Admin() {
      return getOrCreateProperty("AdminTab_Admin", "AdminTab_Admin", null, pcftest.TabBar.AdminTab.AdminTab_Admin.class);
    }
    
    public AdminTab_PrintUserGroupTree getAdminTab_PrintUserGroupTree() {
      return getOrCreateProperty("AdminTab_PrintUserGroupTree", "AdminTab_PrintUserGroupTree", null, pcftest.TabBar.AdminTab.AdminTab_PrintUserGroupTree.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AdminTab_Admin extends ClickableActionElement {
      public AdminTab_Admin(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AdminTab_PrintUserGroupTree extends ClickableActionElement {
      public AdminTab_PrintUserGroupTree(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimTab extends ClickableActionElement {
    public ClaimTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    public ClaimTab_FNOLWizard getClaimTab_FNOLWizard() {
      return getOrCreateProperty("ClaimTab_FNOLWizard", "ClaimTab_FNOLWizard", null, pcftest.TabBar.ClaimTab.ClaimTab_FNOLWizard.class);
    }
    
    public ValueElement getClaimTab_FindClaim() {
      return getOrCreateProperty("ClaimTab_FindClaim", "ClaimTab_FindClaim", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ClaimTab_FindClaim_Button getClaimTab_FindClaim_Button() {
      return getOrCreateProperty("ClaimTab_FindClaim_Button", "ClaimTab_FindClaim_Button", null, pcftest.TabBar.ClaimTab.ClaimTab_FindClaim_Button.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.TabBar.ClaimTab.entry> get_Entries() {
      return getOrCreateEntries(null, pcftest.TabBar.ClaimTab.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimTab_FNOLWizard extends ClickableActionElement {
      public ClaimTab_FNOLWizard(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public FNOLWizard click() {
        return clickThis(pcftest.FNOLWizard.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimTab_FindClaim_Button extends ClickableActionElement {
      public ClaimTab_FindClaim_Button(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends PCFElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimMenuClaim getClaimMenuClaim() {
        return getOrCreateProperty("ClaimMenuClaim", "ClaimMenuClaim", null, pcftest.TabBar.ClaimTab.entry.ClaimMenuClaim.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimMenuClaim extends ClickableActionElement {
        public ClaimMenuClaim(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DashboardTab extends ClickableActionElement {
    public DashboardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopTab extends ActionElementWithAJAXMenu {
    public DesktopTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    public Desktop_BulkPay getDesktop_BulkPay() {
      return getOrCreateProperty("Desktop_BulkPay", "Desktop_BulkPay", null, pcftest.TabBar.DesktopTab.Desktop_BulkPay.class);
    }
    
    public Desktop_DesktopActivities getDesktop_DesktopActivities() {
      return getOrCreateProperty("Desktop_DesktopActivities", "Desktop_DesktopActivities", null, pcftest.TabBar.DesktopTab.Desktop_DesktopActivities.class);
    }
    
    public Desktop_DesktopAwaitingAssignment getDesktop_DesktopAwaitingAssignment() {
      return getOrCreateProperty("Desktop_DesktopAwaitingAssignment", "Desktop_DesktopAwaitingAssignment", null, pcftest.TabBar.DesktopTab.Desktop_DesktopAwaitingAssignment.class);
    }
    
    public Desktop_DesktopCalendarGroup getDesktop_DesktopCalendarGroup() {
      return getOrCreateProperty("Desktop_DesktopCalendarGroup", "Desktop_DesktopCalendarGroup", null, pcftest.TabBar.DesktopTab.Desktop_DesktopCalendarGroup.class);
    }
    
    public Desktop_DesktopClaims getDesktop_DesktopClaims() {
      return getOrCreateProperty("Desktop_DesktopClaims", "Desktop_DesktopClaims", null, pcftest.TabBar.DesktopTab.Desktop_DesktopClaims.class);
    }
    
    public Desktop_DesktopExposures getDesktop_DesktopExposures() {
      return getOrCreateProperty("Desktop_DesktopExposures", "Desktop_DesktopExposures", null, pcftest.TabBar.DesktopTab.Desktop_DesktopExposures.class);
    }
    
    public Desktop_DesktopQueuedActivities getDesktop_DesktopQueuedActivities() {
      return getOrCreateProperty("Desktop_DesktopQueuedActivities", "Desktop_DesktopQueuedActivities", null, pcftest.TabBar.DesktopTab.Desktop_DesktopQueuedActivities.class);
    }
    
    public Desktop_DesktopSubrogations getDesktop_DesktopSubrogations() {
      return getOrCreateProperty("Desktop_DesktopSubrogations", "Desktop_DesktopSubrogations", null, pcftest.TabBar.DesktopTab.Desktop_DesktopSubrogations.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/Desktop.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Desktop_BulkPay extends ClickableActionElement {
      public Desktop_BulkPay(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public BulkPay click() {
        return clickThis(pcftest.BulkPay.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/Desktop.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Desktop_DesktopActivities extends ClickableActionElement {
      public Desktop_DesktopActivities(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DesktopActivities click() {
        return clickThis(pcftest.DesktopActivities.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/Desktop.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Desktop_DesktopAwaitingAssignment extends ClickableActionElement {
      public Desktop_DesktopAwaitingAssignment(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DesktopAwaitingAssignment click() {
        return clickThis(pcftest.DesktopAwaitingAssignment.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/Desktop.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Desktop_DesktopCalendarGroup extends ClickableActionElement {
      public Desktop_DesktopCalendarGroup(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      public DesktopCalendarGroup_Calendar getDesktopCalendarGroup_Calendar() {
        return getOrCreateProperty("DesktopCalendarGroup_Calendar", "DesktopCalendarGroup_Calendar", null, pcftest.TabBar.DesktopTab.Desktop_DesktopCalendarGroup.DesktopCalendarGroup_Calendar.class);
      }
      
      public DesktopCalendarGroup_SupervisorCalendar getDesktopCalendarGroup_SupervisorCalendar() {
        return getOrCreateProperty("DesktopCalendarGroup_SupervisorCalendar", "DesktopCalendarGroup_SupervisorCalendar", null, pcftest.TabBar.DesktopTab.Desktop_DesktopCalendarGroup.DesktopCalendarGroup_SupervisorCalendar.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/desktop/calendar/DesktopCalendarGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DesktopCalendarGroup_Calendar extends ClickableActionElement {
        public DesktopCalendarGroup_Calendar(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public Calendar click() {
          return clickThis(pcftest.Calendar.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/desktop/calendar/DesktopCalendarGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DesktopCalendarGroup_SupervisorCalendar extends ClickableActionElement {
        public DesktopCalendarGroup_SupervisorCalendar(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SupervisorCalendar click() {
          return clickThis(pcftest.SupervisorCalendar.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/Desktop.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Desktop_DesktopClaims extends ClickableActionElement {
      public Desktop_DesktopClaims(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DesktopClaims click() {
        return clickThis(pcftest.DesktopClaims.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/Desktop.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Desktop_DesktopExposures extends ClickableActionElement {
      public Desktop_DesktopExposures(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DesktopExposures click() {
        return clickThis(pcftest.DesktopExposures.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/Desktop.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Desktop_DesktopQueuedActivities extends ClickableActionElement {
      public Desktop_DesktopQueuedActivities(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DesktopQueuedActivities click() {
        return clickThis(pcftest.DesktopQueuedActivities.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/Desktop.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Desktop_DesktopSubrogations extends ClickableActionElement {
      public Desktop_DesktopSubrogations(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DesktopSubrogations click() {
        return clickThis(pcftest.DesktopSubrogations.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class HelpTabBarLink extends ClickableActionElement {
    public HelpTabBarLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Help click() {
      return clickThis(pcftest.Help.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InternalToolsHiddenLink extends ClickableActionElement {
    public InternalToolsHiddenLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LanguageTabBarLink extends ClickableActionElement {
    public LanguageTabBarLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public languageSwitcher getlanguageSwitcher() {
      return getOrCreateProperty("languageSwitcher", "languageSwitcher", null, pcftest.TabBar.LanguageTabBarLink.languageSwitcher.class);
    }
    
    public localeSwitcher getlocaleSwitcher() {
      return getOrCreateProperty("localeSwitcher", "localeSwitcher", null, pcftest.TabBar.LanguageTabBarLink.localeSwitcher.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class languageSwitcher extends ClickableActionElement {
      public languageSwitcher(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.TabBar.LanguageTabBarLink.languageSwitcher.entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.TabBar.LanguageTabBarLink.languageSwitcher.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends PCFElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public langs getlangs() {
          return getOrCreateProperty("langs", "langs", null, pcftest.TabBar.LanguageTabBarLink.languageSwitcher.entry.langs.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class langs extends ClickableActionElement {
          public langs(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class localeSwitcher extends ClickableActionElement {
      public localeSwitcher(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.TabBar.LanguageTabBarLink.localeSwitcher.entry> get_Entries() {
        return getOrCreateEntries(null, pcftest.TabBar.LanguageTabBarLink.localeSwitcher.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends PCFElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public locales getlocales() {
          return getOrCreateProperty("locales", "locales", null, pcftest.TabBar.LanguageTabBarLink.localeSwitcher.entry.locales.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class locales extends ClickableActionElement {
          public locales(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LogoutOAuthTabBarLink extends ClickableActionElement {
    public LogoutOAuthTabBarLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Logout click() {
      return clickThis(pcftest.Logout.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LogoutTabBarLink extends ClickableActionElement {
    public LogoutTabBarLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OpenPreferencesTabBarLink extends ClickableActionElement {
    public OpenPreferencesTabBarLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerHiddenLink extends ClickableActionElement {
    public ProfilerHiddenLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ProfilerPopup click() {
      return clickThis(pcftest.ProfilerPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuickJump extends QuickJumpElement {
    public QuickJump(ISmokeTest helper)  {
      super(helper, new gw.smoketest.platform.web.PCFElementId("QuickJump"));
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReloadPCFTabBarLink extends ClickableActionElement {
    public ReloadPCFTabBarLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReportTab extends ClickableActionElement {
    public ReportTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchTab extends ClickableActionElement {
    public SearchTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    public Search_ActivitySearch getSearch_ActivitySearch() {
      return getOrCreateProperty("Search_ActivitySearch", "Search_ActivitySearch", null, pcftest.TabBar.SearchTab.Search_ActivitySearch.class);
    }
    
    public Search_BulkInvoiceSearch getSearch_BulkInvoiceSearch() {
      return getOrCreateProperty("Search_BulkInvoiceSearch", "Search_BulkInvoiceSearch", null, pcftest.TabBar.SearchTab.Search_BulkInvoiceSearch.class);
    }
    
    public Search_ClaimSearchesGroup getSearch_ClaimSearchesGroup() {
      return getOrCreateProperty("Search_ClaimSearchesGroup", "Search_ClaimSearchesGroup", null, pcftest.TabBar.SearchTab.Search_ClaimSearchesGroup.class);
    }
    
    public Search_PaymentSearch getSearch_PaymentSearch() {
      return getOrCreateProperty("Search_PaymentSearch", "Search_PaymentSearch", null, pcftest.TabBar.SearchTab.Search_PaymentSearch.class);
    }
    
    public Search_RecoverySearch getSearch_RecoverySearch() {
      return getOrCreateProperty("Search_RecoverySearch", "Search_RecoverySearch", null, pcftest.TabBar.SearchTab.Search_RecoverySearch.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Search_ActivitySearch extends ClickableActionElement {
      public Search_ActivitySearch(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ActivitySearch click() {
        return clickThis(pcftest.ActivitySearch.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Search_BulkInvoiceSearch extends ClickableActionElement {
      public Search_BulkInvoiceSearch(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public BulkInvoiceSearch click() {
        return clickThis(pcftest.BulkInvoiceSearch.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Search_ClaimSearchesGroup extends ClickableActionElement {
      public Search_ClaimSearchesGroup(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      public ClaimSearchesGroup_CatastropheSearch getClaimSearchesGroup_CatastropheSearch() {
        return getOrCreateProperty("ClaimSearchesGroup_CatastropheSearch", "ClaimSearchesGroup_CatastropheSearch", null, pcftest.TabBar.SearchTab.Search_ClaimSearchesGroup.ClaimSearchesGroup_CatastropheSearch.class);
      }
      
      public ClaimSearchesGroup_ClaimSearch getClaimSearchesGroup_ClaimSearch() {
        return getOrCreateProperty("ClaimSearchesGroup_ClaimSearch", "ClaimSearchesGroup_ClaimSearch", null, pcftest.TabBar.SearchTab.Search_ClaimSearchesGroup.ClaimSearchesGroup_ClaimSearch.class);
      }
      
      public ClaimSearchesGroup_FreeTextClaimSearch getClaimSearchesGroup_FreeTextClaimSearch() {
        return getOrCreateProperty("ClaimSearchesGroup_FreeTextClaimSearch", "ClaimSearchesGroup_FreeTextClaimSearch", null, pcftest.TabBar.SearchTab.Search_ClaimSearchesGroup.ClaimSearchesGroup_FreeTextClaimSearch.class);
      }
      
      public ClaimSearchesGroup_SimpleClaimSearch getClaimSearchesGroup_SimpleClaimSearch() {
        return getOrCreateProperty("ClaimSearchesGroup_SimpleClaimSearch", "ClaimSearchesGroup_SimpleClaimSearch", null, pcftest.TabBar.SearchTab.Search_ClaimSearchesGroup.ClaimSearchesGroup_SimpleClaimSearch.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/search/claims/ClaimSearchesGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimSearchesGroup_CatastropheSearch extends ClickableActionElement {
        public ClaimSearchesGroup_CatastropheSearch(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public CatastropheSearch click() {
          return clickThis(pcftest.CatastropheSearch.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/search/claims/ClaimSearchesGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimSearchesGroup_ClaimSearch extends ClickableActionElement {
        public ClaimSearchesGroup_ClaimSearch(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimSearch click() {
          return clickThis(pcftest.ClaimSearch.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/search/claims/ClaimSearchesGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimSearchesGroup_FreeTextClaimSearch extends ClickableActionElement {
        public ClaimSearchesGroup_FreeTextClaimSearch(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public FreeTextClaimSearch click() {
          return clickThis(pcftest.FreeTextClaimSearch.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/search/claims/ClaimSearchesGroup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimSearchesGroup_SimpleClaimSearch extends ClickableActionElement {
        public ClaimSearchesGroup_SimpleClaimSearch(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public SimpleClaimSearch click() {
          return clickThis(pcftest.SimpleClaimSearch.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Search_PaymentSearch extends ClickableActionElement {
      public Search_PaymentSearch(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PaymentSearch click() {
        return clickThis(pcftest.PaymentSearch.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/Search.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Search_RecoverySearch extends ClickableActionElement {
      public Search_RecoverySearch(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public RecoverySearch click() {
        return clickThis(pcftest.RecoverySearch.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamTab extends ClickableActionElement {
    public TeamTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UnsavedWorkTabBarLink extends UnsavedWorkElement {
    public UnsavedWorkTabBarLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/TabBar.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VacationTab extends ClickableActionElement {
    public VacationTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    public Vacation_VacationActivities getVacation_VacationActivities() {
      return getOrCreateProperty("Vacation_VacationActivities", "Vacation_VacationActivities", null, pcftest.TabBar.VacationTab.Vacation_VacationActivities.class);
    }
    
    public Vacation_VacationClaims getVacation_VacationClaims() {
      return getOrCreateProperty("Vacation_VacationClaims", "Vacation_VacationClaims", null, pcftest.TabBar.VacationTab.Vacation_VacationClaims.class);
    }
    
    public Vacation_VacationExposures getVacation_VacationExposures() {
      return getOrCreateProperty("Vacation_VacationExposures", "Vacation_VacationExposures", null, pcftest.TabBar.VacationTab.Vacation_VacationExposures.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/vacation/Vacation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Vacation_VacationActivities extends ClickableActionElement {
      public Vacation_VacationActivities(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public VacationActivities click() {
        return clickThis(pcftest.VacationActivities.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/vacation/Vacation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Vacation_VacationClaims extends ClickableActionElement {
      public Vacation_VacationClaims(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public VacationClaims click() {
        return clickThis(pcftest.VacationClaims.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/vacation/Vacation.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Vacation_VacationExposures extends ClickableActionElement {
      public Vacation_VacationExposures(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public VacationExposures click() {
        return clickThis(pcftest.VacationExposures.class);
      }
      
      
    }
    
    
  }
  
  
}