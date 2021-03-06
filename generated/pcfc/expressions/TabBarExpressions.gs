package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/TabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class TabBarExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/TabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookTabMenuItemExpressionsImpl extends TabBarExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on Tab (id=AddressBookTab) at AddressBook.pcf: line 12, column 39
    function action_67 () : void {
      pcf.AddressBookSearch.go()
    }
    
    // 'location' attribute on Tab (id=AddressBookTab) at AddressBook.pcf: line 12, column 39
    function action_dest_68 () : pcf.api.Destination {
      return pcf.AddressBookSearch.createDestination()
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/TabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DashboardTabMenuItemExpressionsImpl extends TabBarExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/TabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopTabMenuItemExpressionsImpl extends TabBarExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 15, column 39
    function action_0 () : void {
      pcf.DesktopActivities.go()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 35, column 47
    function action_12 () : void {
      pcf.DesktopAwaitingAssignment.go()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 40, column 45
    function action_15 () : void {
      pcf.DesktopQueuedActivities.go()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 44, column 42
    function action_22 () : void {
      pcf.DesktopCalendarGroup.go()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 48, column 29
    function action_24 () : void {
      pcf.BulkPay.go()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 20, column 35
    function action_3 () : void {
      pcf.DesktopClaims.go()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 25, column 38
    function action_6 () : void {
      pcf.DesktopExposures.go()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 30, column 41
    function action_9 () : void {
      pcf.DesktopSubrogations.go()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 15, column 39
    function action_dest_1 () : pcf.api.Destination {
      return pcf.DesktopActivities.createDestination()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 30, column 41
    function action_dest_10 () : pcf.api.Destination {
      return pcf.DesktopSubrogations.createDestination()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 35, column 47
    function action_dest_13 () : pcf.api.Destination {
      return pcf.DesktopAwaitingAssignment.createDestination()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 40, column 45
    function action_dest_16 () : pcf.api.Destination {
      return pcf.DesktopQueuedActivities.createDestination()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 44, column 42
    function action_dest_23 () : pcf.api.Destination {
      return pcf.DesktopCalendarGroup.createDestination()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 48, column 29
    function action_dest_25 () : pcf.api.Destination {
      return pcf.BulkPay.createDestination()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 20, column 35
    function action_dest_4 () : pcf.api.Destination {
      return pcf.DesktopClaims.createDestination()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 25, column 38
    function action_dest_7 () : pcf.api.Destination {
      return pcf.DesktopExposures.createDestination()
    }
    
    // 'label' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 30, column 41
    function label_11 () : java.lang.Object {
      return DisplayKey.get("Web.DesktopMenuLinks.Subrogations", gw.api.desktop.DesktopCounts.getDesktopCounts().ActiveSubrogations)
    }
    
    // 'label' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 35, column 47
    function label_14 () : java.lang.Object {
      return DisplayKey.get("Web.DesktopMenuLinks.UnassignedItems", gw.api.desktop.DesktopCounts.getDesktopCounts().AwaitingAssignment)
    }
    
    // 'label' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 40, column 45
    function label_17 () : java.lang.Object {
      return DisplayKey.get("Web.DesktopMenuLinks.ActivityQueues", gw.api.desktop.DesktopCounts.getDesktopCounts().Queues)
    }
    
    // 'label' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 15, column 39
    function label_2 () : java.lang.Object {
      return DisplayKey.get("Web.DesktopMenuLinks.Activities", gw.api.desktop.DesktopCounts.getDesktopCounts().Activities)
    }
    
    // 'label' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 20, column 35
    function label_5 () : java.lang.Object {
      return DisplayKey.get("Web.DesktopMenuLinks.Claims", gw.api.desktop.DesktopCounts.getDesktopCounts().Claims)
    }
    
    // 'label' attribute on Tab (id=DesktopTab) at Desktop.pcf: line 25, column 38
    function label_8 () : java.lang.Object {
      return DisplayKey.get("Web.DesktopMenuLinks.Exposures", gw.api.desktop.DesktopCounts.getDesktopCounts().Exposures)
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/TabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends TabBarExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=langs) at TabBar.pcf: line 120, column 29
    function action_99 () : void {
      gw.api.admin.BaseAdminUtil.setCurrentUsersLanguage(lang)
    }
    
    // 'available' attribute on MenuItem (id=langs) at TabBar.pcf: line 120, column 29
    function available_98 () : java.lang.Boolean {
      return gw.api.util.LocaleUtil.getCurrentUserLanguage() != lang
    }
    
    // 'checked' attribute on MenuItem (id=langs) at TabBar.pcf: line 120, column 29
    function checked_101 () : java.lang.Boolean {
      return gw.api.util.LocaleUtil.getCurrentLanguageType() == lang
    }
    
    // 'label' attribute on MenuItem (id=langs) at TabBar.pcf: line 120, column 29
    function label_100 () : java.lang.Object {
      return gw.api.util.LocaleUtil.getLanguageLabel(lang)
    }
    
    property get lang () : typekey.LanguageType {
      return getIteratedValue(1) as typekey.LanguageType
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/TabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry3ExpressionsImpl extends TabBarExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=locales) at TabBar.pcf: line 138, column 29
    function action_105 () : void {
      gw.api.admin.BaseAdminUtil.setCurrentUsersLocale(locale)
    }
    
    // 'available' attribute on MenuItem (id=locales) at TabBar.pcf: line 138, column 29
    function available_104 () : java.lang.Boolean {
      return gw.api.util.LocaleUtil.getCurrentUserLocale() != locale
    }
    
    // 'checked' attribute on MenuItem (id=locales) at TabBar.pcf: line 138, column 29
    function checked_107 () : java.lang.Boolean {
      return gw.api.util.LocaleUtil.getCurrentLocaleType() == locale
    }
    
    // 'label' attribute on MenuItem (id=locales) at TabBar.pcf: line 138, column 29
    function label_106 () : java.lang.Object {
      return gw.api.util.LocaleUtil.getLocaleLabel(locale)
    }
    
    property get locale () : typekey.LocaleType {
      return getIteratedValue(1) as typekey.LocaleType
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/TabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends TabBarExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuClaim) at TabBar.pcf: line 44, column 55
    function action_38 () : void {
      pcf.Claim.go(claimSessionRecentView.Claim)
    }
    
    // 'action' attribute on MenuItem (id=ClaimMenuClaim) at TabBar.pcf: line 44, column 55
    function action_dest_39 () : pcf.api.Destination {
      return pcf.Claim.createDestination(claimSessionRecentView.Claim)
    }
    
    // 'label' attribute on MenuItem (id=ClaimMenuClaim) at TabBar.pcf: line 44, column 55
    function label_40 () : java.lang.Object {
      return claimSessionRecentView.DisplayName
    }
    
    property get claimSessionRecentView () : entity.ClaimRecentView {
      return getIteratedValue(1) as entity.ClaimRecentView
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/TabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItem2ExpressionsImpl extends SearchTabMenuItemExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on Tab (id=SearchTab) at ClaimSearchesGroup.pcf: line 12, column 21
    function action_46 () : void {
      pcf.SimpleClaimSearch.go()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at ClaimSearchesGroup.pcf: line 16, column 21
    function action_48 () : void {
      pcf.ClaimSearch.go()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at ClaimSearchesGroup.pcf: line 20, column 21
    function action_50 () : void {
      pcf.FreeTextClaimSearch.go()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at ClaimSearchesGroup.pcf: line 23, column 43
    function action_52 () : void {
      pcf.CatastropheSearch.go(null)
    }
    
    // 'location' attribute on Tab (id=SearchTab) at ClaimSearchesGroup.pcf: line 12, column 21
    function action_dest_47 () : pcf.api.Destination {
      return pcf.SimpleClaimSearch.createDestination()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at ClaimSearchesGroup.pcf: line 16, column 21
    function action_dest_49 () : pcf.api.Destination {
      return pcf.ClaimSearch.createDestination()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at ClaimSearchesGroup.pcf: line 20, column 21
    function action_dest_51 () : pcf.api.Destination {
      return pcf.FreeTextClaimSearch.createDestination()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at ClaimSearchesGroup.pcf: line 23, column 43
    function action_dest_53 () : pcf.api.Destination {
      return pcf.CatastropheSearch.createDestination(null)
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/TabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationGroupMenuItemExpressionsImpl extends DesktopTabMenuItemExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at DesktopCalendarGroup.pcf: line 13, column 21
    function action_18 () : void {
      pcf.Calendar.go()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at DesktopCalendarGroup.pcf: line 17, column 21
    function action_20 () : void {
      pcf.SupervisorCalendar.go()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at DesktopCalendarGroup.pcf: line 13, column 21
    function action_dest_19 () : pcf.api.Destination {
      return pcf.Calendar.createDestination()
    }
    
    // 'location' attribute on Tab (id=DesktopTab) at DesktopCalendarGroup.pcf: line 17, column 21
    function action_dest_21 () : pcf.api.Destination {
      return pcf.SupervisorCalendar.createDestination()
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/TabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReportTabMenuItemExpressionsImpl extends TabBarExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/TabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchTabMenuItemExpressionsImpl extends TabBarExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on Tab (id=SearchTab) at Search.pcf: line 14, column 21
    function action_54 () : void {
      pcf.ClaimSearchesGroup.go()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at Search.pcf: line 18, column 21
    function action_56 () : void {
      pcf.ActivitySearch.go()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at Search.pcf: line 22, column 21
    function action_58 () : void {
      pcf.PaymentSearch.go()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at Search.pcf: line 26, column 21
    function action_60 () : void {
      pcf.RecoverySearch.go()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at Search.pcf: line 30, column 21
    function action_62 () : void {
      pcf.BulkInvoiceSearch.go()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at Search.pcf: line 14, column 21
    function action_dest_55 () : pcf.api.Destination {
      return pcf.ClaimSearchesGroup.createDestination()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at Search.pcf: line 18, column 21
    function action_dest_57 () : pcf.api.Destination {
      return pcf.ActivitySearch.createDestination()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at Search.pcf: line 22, column 21
    function action_dest_59 () : pcf.api.Destination {
      return pcf.PaymentSearch.createDestination()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at Search.pcf: line 26, column 21
    function action_dest_61 () : pcf.api.Destination {
      return pcf.RecoverySearch.createDestination()
    }
    
    // 'location' attribute on Tab (id=SearchTab) at Search.pcf: line 30, column 21
    function action_dest_63 () : pcf.api.Destination {
      return pcf.BulkInvoiceSearch.createDestination()
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/TabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TabBarExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TabBarLink (id=HelpTabBarLink) at TabBar.pcf: line 146, column 24
    function action_111 () : void {
      Help.push()
    }
    
    // 'action' attribute on TabBarLogout (id=LogoutOAuthTabBarLink) at TabBar.pcf: line 171, column 59
    function action_117 () : void {
      Logout.push('https://guidewire-hub.oktapreview.com')
    }
    
    // 'action' attribute on HiddenLink (id=ProfilerHiddenLink) at TabBar.pcf: line 175, column 26
    function action_120 () : void {
      ProfilerPopup.push()
    }
    
    // 'action' attribute on HiddenLink (id=InternalToolsHiddenLink) at TabBar.pcf: line 179, column 26
    function action_122 () : void {
      InternalTools.go()
    }
    
    // 'action' attribute on Tab (id=DesktopTab) at TabBar.pcf: line 14, column 42
    function action_27 () : void {
      Desktop.go()
    }
    
    // 'action' attribute on MenuItem (id=ClaimTab_FNOLWizard) at TabBar.pcf: line 25, column 38
    function action_30 () : void {
      FNOLWizard.go()
    }
    
    // 'action' attribute on Tab (id=ClaimTab) at TabBar.pcf: line 20, column 66
    function action_43 () : void {
      ClaimTabForward.go()
    }
    
    // 'action' attribute on Tab (id=SearchTab) at TabBar.pcf: line 52, column 41
    function action_65 () : void {
      Search.go()
    }
    
    // 'action' attribute on Tab (id=AddressBookTab) at TabBar.pcf: line 58, column 44
    function action_70 () : void {
      AddressBook.go()
    }
    
    // 'action' attribute on Tab (id=DashboardTab) at TabBar.pcf: line 63, column 117
    function action_73 () : void {
      DashboardGroup.go()
    }
    
    // 'action' attribute on Tab (id=TeamTab) at TabBar.pcf: line 69, column 39
    function action_76 () : void {
      Team.go()
    }
    
    // 'action' attribute on Tab (id=ReportTab) at TabBar.pcf: line 74, column 122
    function action_79 () : void {
      Reports.go()
    }
    
    // 'action' attribute on MenuItem (id=AdminTab_Admin) at TabBar.pcf: line 85, column 43
    function action_82 () : void {
      AdminWelcome.go()
    }
    
    // 'action' attribute on MenuItem (id=AdminTab_PrintUserGroupTree) at TabBar.pcf: line 91, column 40
    function action_85 () : void {
      gw.api.print.PrintUserGroupTreeViewAction.printUserGroupTree()
    }
    
    // 'action' attribute on Tab (id=AdminTab) at TabBar.pcf: line 80, column 65
    function action_87 () : void {
      AdminWelcome.go()
    }
    
    // 'action' attribute on Tab (id=VacationTab) at TabBar.pcf: line 98, column 43
    function action_96 () : void {
      Vacation.go()
    }
    
    // 'action' attribute on TabBarLink (id=HelpTabBarLink) at TabBar.pcf: line 146, column 24
    function action_dest_112 () : pcf.api.Destination {
      return pcf.Help.createDestination()
    }
    
    // 'action' attribute on TabBarLogout (id=LogoutOAuthTabBarLink) at TabBar.pcf: line 171, column 59
    function action_dest_118 () : pcf.api.Destination {
      return pcf.Logout.createDestination('https://guidewire-hub.oktapreview.com')
    }
    
    // 'action' attribute on HiddenLink (id=ProfilerHiddenLink) at TabBar.pcf: line 175, column 26
    function action_dest_121 () : pcf.api.Destination {
      return pcf.ProfilerPopup.createDestination()
    }
    
    // 'action' attribute on HiddenLink (id=InternalToolsHiddenLink) at TabBar.pcf: line 179, column 26
    function action_dest_123 () : pcf.api.Destination {
      return pcf.InternalTools.createDestination()
    }
    
    // 'action' attribute on Tab (id=DesktopTab) at TabBar.pcf: line 14, column 42
    function action_dest_28 () : pcf.api.Destination {
      return pcf.Desktop.createDestination()
    }
    
    // 'action' attribute on MenuItem (id=ClaimTab_FNOLWizard) at TabBar.pcf: line 25, column 38
    function action_dest_31 () : pcf.api.Destination {
      return pcf.FNOLWizard.createDestination()
    }
    
    // 'action' attribute on Tab (id=ClaimTab) at TabBar.pcf: line 20, column 66
    function action_dest_44 () : pcf.api.Destination {
      return pcf.ClaimTabForward.createDestination()
    }
    
    // 'action' attribute on Tab (id=SearchTab) at TabBar.pcf: line 52, column 41
    function action_dest_66 () : pcf.api.Destination {
      return pcf.Search.createDestination()
    }
    
    // 'action' attribute on Tab (id=AddressBookTab) at TabBar.pcf: line 58, column 44
    function action_dest_71 () : pcf.api.Destination {
      return pcf.AddressBook.createDestination()
    }
    
    // 'action' attribute on Tab (id=DashboardTab) at TabBar.pcf: line 63, column 117
    function action_dest_74 () : pcf.api.Destination {
      return pcf.DashboardGroup.createDestination()
    }
    
    // 'action' attribute on Tab (id=TeamTab) at TabBar.pcf: line 69, column 39
    function action_dest_77 () : pcf.api.Destination {
      return pcf.Team.createDestination()
    }
    
    // 'action' attribute on Tab (id=ReportTab) at TabBar.pcf: line 74, column 122
    function action_dest_80 () : pcf.api.Destination {
      return pcf.Reports.createDestination()
    }
    
    // 'action' attribute on MenuItem (id=AdminTab_Admin) at TabBar.pcf: line 85, column 43
    function action_dest_83 () : pcf.api.Destination {
      return pcf.AdminWelcome.createDestination()
    }
    
    // 'action' attribute on Tab (id=AdminTab) at TabBar.pcf: line 80, column 65
    function action_dest_88 () : pcf.api.Destination {
      return pcf.AdminWelcome.createDestination()
    }
    
    // 'action' attribute on Tab (id=VacationTab) at TabBar.pcf: line 98, column 43
    function action_dest_97 () : pcf.api.Destination {
      return pcf.Vacation.createDestination()
    }
    
    // 'afterFailure' attribute on SearchItem (id=ClaimTab_FindClaim_widget) at TabBar.pcf: line 35, column 48
    function afterFailure_33 (searchCriteria :  java.lang.Object, searchText :  java.lang.String) : void {
      (searchCriteria as gw.cc.claim.ClaimSearchCriteriaWrapper).resetWithClaimNumber(searchText)
    }
    
    // 'label' attribute on TabBarLogout (id=LogoutTabBarLink) at TabBar.pcf: line 165, column 58
    function label_115 () : java.lang.Object {
      return DisplayKey.get("Web.TabBar.Logout", entity.User.util.CurrentUser)
    }
    
    // 'label' attribute on Tab (id=ClaimTab) at TabBar.pcf: line 20, column 66
    function label_45 () : java.lang.Object {
      return gw.api.claim.ClaimUtil.getCurrentClaimNumber() != null ? DisplayKey.get("Web.TabBar.ClaimWithNumber", gw.api.claim.ClaimUtil.getCurrentClaimNumber()) : DisplayKey.get("Web.TabBar.Claim")
    }
    
    // 'onFailure' attribute on SearchItem (id=ClaimTab_FindClaim_widget) at TabBar.pcf: line 35, column 48
    function onFailure_34 (searchText :  java.lang.String) : pcf.api.Location {
      return ClaimSearch.go()
    }
    
    // 'onResult' attribute on SearchItem (id=ClaimTab_FindClaim_widget) at TabBar.pcf: line 35, column 48
    function onResult_35 (result :  java.lang.Object) : void {
      ClaimInfoForward.go(result as ClaimInfo)
    }
    
    // 'property' attribute on SearchItem (id=ClaimTab_FindClaim_widget) at TabBar.pcf: line 35, column 48
    function property_36 () : gw.lang.reflect.IPropertyInfo {
      return Claim.Type.TypeInfo.getProperty("ClaimNumber")
    }
    
    // 'search' attribute on SearchItem (id=ClaimTab_FindClaim_widget) at TabBar.pcf: line 35, column 48
    function search_37 (searchText :  java.lang.String) : java.lang.Object {
      return gw.api.claim.ClaimNumberSearchUtil.search(searchText)
    }
    
    // 'systemAlertBar' attribute on TabBar (id=TabBar) at TabBar.pcf: line 7, column 39
    function systemAlertBar_onEnter_124 (def :  pcf.SystemAlertBar) : void {
      def.onEnter()
    }
    
    // 'systemAlertBar' attribute on TabBar (id=TabBar) at TabBar.pcf: line 7, column 39
    function systemAlertBar_refreshVariables_125 (def :  pcf.SystemAlertBar) : void {
      def.refreshVariables()
    }
    
    // 'value' attribute on MenuItemIterator at TabBar.pcf: line 112, column 46
    function value_102 () : typekey.LanguageType[] {
      return gw.api.util.LocaleUtil.getAllLanguages()?.toTypedArray()
    }
    
    // 'value' attribute on MenuItemIterator at TabBar.pcf: line 130, column 44
    function value_108 () : typekey.LocaleType[] {
      return gw.api.util.LocaleUtil.getAllLocales()?.toTypedArray()
    }
    
    // 'value' attribute on MenuItemIterator (id=ClaimMenuIt) at TabBar.pcf: line 40, column 46
    function value_41 () : entity.ClaimRecentView[] {
      return gw.api.claim.ClaimUtil.getRecentlyViewedClaims()
    }
    
    // 'visible' attribute on MenuItem (id=languageSwitcher) at TabBar.pcf: line 108, column 62
    function visible_103 () : java.lang.Boolean {
      return gw.api.util.LocaleUtil.canSwitchLanguage()
    }
    
    // 'visible' attribute on MenuItem (id=localeSwitcher) at TabBar.pcf: line 126, column 60
    function visible_109 () : java.lang.Boolean {
      return gw.api.util.LocaleUtil.canSwitchLocale()
    }
    
    // 'visible' attribute on TabBarLink (id=LanguageTabBarLink) at TabBar.pcf: line 104, column 104
    function visible_110 () : java.lang.Boolean {
      return gw.api.util.LocaleUtil.canSwitchLanguage() || gw.api.util.LocaleUtil.canSwitchLocale()
    }
    
    // 'visible' attribute on TabBarLink (id=ReloadPCFTabBarLink) at TabBar.pcf: line 159, column 57
    function visible_113 () : java.lang.Boolean {
      return gw.api.tools.InternalTools.isEnabled()
    }
    
    // 'visible' attribute on TabBarLogout (id=LogoutTabBarLink) at TabBar.pcf: line 165, column 58
    function visible_114 () : java.lang.Boolean {
      return gw.auth.AuthHelper.displayLoginFields()
    }
    
    // 'visible' attribute on TabBarLogout (id=LogoutOAuthTabBarLink) at TabBar.pcf: line 171, column 59
    function visible_116 () : java.lang.Boolean {
      return !gw.auth.AuthHelper.displayLoginFields()
    }
    
    // 'visible' attribute on Tab (id=DesktopTab) at TabBar.pcf: line 14, column 42
    function visible_26 () : java.lang.Boolean {
      return perm.System.viewdesktop
    }
    
    // 'visible' attribute on MenuItem (id=ClaimTab_FNOLWizard) at TabBar.pcf: line 25, column 38
    function visible_29 () : java.lang.Boolean {
      return perm.Claim.create
    }
    
    // 'visible' attribute on SearchItem (id=ClaimTab_FindClaim_widget) at TabBar.pcf: line 35, column 48
    function visible_32 () : java.lang.Boolean {
      return perm.Claim.genericviewclaim
    }
    
    // 'visible' attribute on Tab (id=ClaimTab) at TabBar.pcf: line 20, column 66
    function visible_42 () : java.lang.Boolean {
      return perm.Claim.create or perm.Claim.genericviewclaim
    }
    
    // 'visible' attribute on Tab (id=SearchTab) at TabBar.pcf: line 52, column 41
    function visible_64 () : java.lang.Boolean {
      return perm.System.viewsearch
    }
    
    // 'visible' attribute on Tab (id=AddressBookTab) at TabBar.pcf: line 58, column 44
    function visible_69 () : java.lang.Boolean {
      return perm.Contact.viewsearchab
    }
    
    // 'visible' attribute on Tab (id=DashboardTab) at TabBar.pcf: line 63, column 117
    function visible_72 () : java.lang.Boolean {
      return perm.User.viewanyedb and !gw.api.plugin.PluginUtils.isPluginStarted(gw.plugin.cognos.CognosPlugin)
    }
    
    // 'visible' attribute on Tab (id=TeamTab) at TabBar.pcf: line 69, column 39
    function visible_75 () : java.lang.Boolean {
      return perm.System.viewteam
    }
    
    // 'visible' attribute on Tab (id=ReportTab) at TabBar.pcf: line 74, column 122
    function visible_78 () : java.lang.Boolean {
      return perm.System.reporting_view and gw.api.plugin.PluginUtils.isPluginStarted(gw.plugin.cognos.CognosPlugin)
    }
    
    // 'visible' attribute on MenuItem (id=AdminTab_Admin) at TabBar.pcf: line 85, column 43
    function visible_81 () : java.lang.Boolean {
      return perm.User.viewanyadmin
    }
    
    // 'visible' attribute on MenuItem (id=AdminTab_PrintUserGroupTree) at TabBar.pcf: line 91, column 40
    function visible_84 () : java.lang.Boolean {
      return perm.Group.viewtree
    }
    
    // 'visible' attribute on Tab (id=AdminTab) at TabBar.pcf: line 80, column 65
    function visible_86 () : java.lang.Boolean {
      return (perm.User.viewanyadmin or perm.Group.viewtree)
    }
    
    // 'visible' attribute on Tab (id=VacationTab) at TabBar.pcf: line 98, column 43
    function visible_95 () : java.lang.Boolean {
      return perm.System.viewvacation
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/TabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TeamTabMenuItemExpressionsImpl extends TabBarExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/TabBar.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VacationTabMenuItemExpressionsImpl extends TabBarExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'location' attribute on Tab (id=VacationTab) at Vacation.pcf: line 10, column 40
    function action_89 () : void {
      pcf.VacationActivities.go()
    }
    
    // 'location' attribute on Tab (id=VacationTab) at Vacation.pcf: line 12, column 36
    function action_91 () : void {
      pcf.VacationClaims.go()
    }
    
    // 'location' attribute on Tab (id=VacationTab) at Vacation.pcf: line 14, column 39
    function action_93 () : void {
      pcf.VacationExposures.go()
    }
    
    // 'location' attribute on Tab (id=VacationTab) at Vacation.pcf: line 10, column 40
    function action_dest_90 () : pcf.api.Destination {
      return pcf.VacationActivities.createDestination()
    }
    
    // 'location' attribute on Tab (id=VacationTab) at Vacation.pcf: line 12, column 36
    function action_dest_92 () : pcf.api.Destination {
      return pcf.VacationClaims.createDestination()
    }
    
    // 'location' attribute on Tab (id=VacationTab) at Vacation.pcf: line 14, column 39
    function action_dest_94 () : pcf.api.Destination {
      return pcf.VacationExposures.createDestination()
    }
    
    
  }
  
  
}