package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/addressbook/AddressBookSearchScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AddressBookSearchScreenExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/addressbook/AddressBookSearchScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressBookSearchScreenExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=cancel) at AddressBookSearchScreen.pcf: line 46, column 31
    function action_4 () : void {
      CurrentLocation.cancel()
    }
    
    // 'action' attribute on ToolbarButton (id=LaunchAB) at AddressBookSearchScreen.pcf: line 52, column 119
    function action_6 () : void {
      launchContactManager()
    }
    
    // 'initialValue' attribute on Variable at AddressBookSearchScreen.pcf: line 28, column 42
    function initialValue_0 () : gw.pcf.ContactSearchHelper {
      return new gw.pcf.ContactSearchHelper(false)
    }
    
    // 'initialValue' attribute on Variable at AddressBookSearchScreen.pcf: line 32, column 58
    function initialValue_1 () : gw.api.contact.CCProximitySearchPageHelper {
      return new gw.api.contact.CCProximitySearchPageHelper()
    }
    
    // 'initialValue' attribute on Variable at AddressBookSearchScreen.pcf: line 40, column 43
    function initialValue_2 () : gw.api.addressbook.ABSystem {
      return new gw.api.addressbook.ContactManager()
    }
    
    // 'visible' attribute on ToolbarButton (id=cancel) at AddressBookSearchScreen.pcf: line 46, column 31
    function visible_3 () : java.lang.Boolean {
      return showCancel
    }
    
    // 'visible' attribute on ToolbarButton (id=LaunchAB) at AddressBookSearchScreen.pcf: line 52, column 119
    function visible_5 () : java.lang.Boolean {
      return RemoteSystem.Enabled && gw.api.contact.ContactUtil.showOpenContactManager(CurrentLocation)
    }
    
    property get PageHelper () : gw.api.contact.CCProximitySearchPageHelper {
      return getVariableValue("PageHelper", 0) as gw.api.contact.CCProximitySearchPageHelper
    }
    
    property set PageHelper ($arg :  gw.api.contact.CCProximitySearchPageHelper) {
      setVariableValue("PageHelper", 0, $arg)
    }
    
    property get PrintTargetLV () : java.lang.String {
      return getVariableValue("PrintTargetLV", 0) as java.lang.String
    }
    
    property set PrintTargetLV ($arg :  java.lang.String) {
      setVariableValue("PrintTargetLV", 0, $arg)
    }
    
    property get RemoteSystem () : gw.api.addressbook.ABSystem {
      return getVariableValue("RemoteSystem", 0) as gw.api.addressbook.ABSystem
    }
    
    property set RemoteSystem ($arg :  gw.api.addressbook.ABSystem) {
      setVariableValue("RemoteSystem", 0, $arg)
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get contactSearchHelper () : gw.pcf.ContactSearchHelper {
      return getVariableValue("contactSearchHelper", 0) as gw.pcf.ContactSearchHelper
    }
    
    property set contactSearchHelper ($arg :  gw.pcf.ContactSearchHelper) {
      setVariableValue("contactSearchHelper", 0, $arg)
    }
    
    property get externalSearchEnabled () : boolean {
      return getRequireValue("externalSearchEnabled", 0) as java.lang.Boolean
    }
    
    property set externalSearchEnabled ($arg :  boolean) {
      setRequireValue("externalSearchEnabled", 0, $arg)
    }
    
    property get initialSpecialistServices () : java.util.List<SpecialistService> {
      return getRequireValue("initialSpecialistServices", 0) as java.util.List<SpecialistService>
    }
    
    property set initialSpecialistServices ($arg :  java.util.List<SpecialistService>) {
      setRequireValue("initialSpecialistServices", 0, $arg)
    }
    
    property get performVendorSearch () : boolean {
      return getRequireValue("performVendorSearch", 0) as java.lang.Boolean
    }
    
    property set performVendorSearch ($arg :  boolean) {
      setRequireValue("performVendorSearch", 0, $arg)
    }
    
    property get requiredContactType () : Type {
      return getRequireValue("requiredContactType", 0) as Type
    }
    
    property set requiredContactType ($arg :  Type) {
      setRequireValue("requiredContactType", 0, $arg)
    }
    
    property get showCancel () : boolean {
      return getRequireValue("showCancel", 0) as java.lang.Boolean
    }
    
    property set showCancel ($arg :  boolean) {
      setRequireValue("showCancel", 0, $arg)
    }
    
    function newSearchCriteria() : ContactSearchCriteria {
          var aCriteria = new ContactSearchCriteria();
          aCriteria.ContactSubtype = typekey.Contact.get(requiredContactType.RelativeName);
          aCriteria.SearchType = TC_INTERNAL;
          if (claim != null) {
            aCriteria.initializeProximitySearch(claim.Addresses?.toList(), claim.LossLocation);
          }
    
          aCriteria.initializeSpecialistServices(initialSpecialistServices)
          gw.api.web.PebblesUtil.invalidateIterators(CurrentLocation, SpecialistService)
    
          if (performVendorSearch) {
            // AllTagsRequired doesn't have any effect when there is only one tag, but setting it here for completeness
            aCriteria.AllTagsRequired = true
            aCriteria.setTagTypes({ContactTagType.TC_VENDOR})
            if (claim.LossLocation != null) {
              aCriteria.Address.setState(claim.LossLocation.State)
              aCriteria.Address.setCountry(claim.LossLocation.Country)
            }
          }
          return aCriteria
        }
    
        function launchContactManager() {
          if (not RemoteSystem.Enabled) {
            gw.api.util.LocationUtil.addRequestScopedErrorMessage(DisplayKey.get("Web.AddressBook.RemoteSystemNotEnabled"))
          }
          GoToAB.push(RemoteSystem.EntryPointURL)
        }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/addressbook/AddressBookSearchScreen.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends AddressBookSearchScreenExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=ClaimSearchScreen_PrintButton) at AddressBookSearchScreen.pcf: line 89, column 27
    function action_14 () : void {
      gw.api.print.ListViewPrintOptionPopupAction.printListViewOnlyWithOptions(PrintTargetLV, DisplayKey.get("Web.Search.Results"), null)
    }
    
    // 'allCheckedRowsAction' attribute on CheckedValuesToolbarButton (id=RetrieveRequested) at AddressBookSearchScreen.pcf: line 83, column 59
    function allCheckedRowsAction_12 (CheckedValues :  Contact[], CheckedValuesErrors :  java.util.Map) : void {
      PageHelper.getDrivingDirectionsCache().getSelectedDirections(CheckedValues, searchCriteria);
    }
    
    // 'available' attribute on ToolbarButton (id=ClaimSearchScreen_PrintButton) at AddressBookSearchScreen.pcf: line 89, column 27
    function available_13 () : java.lang.Boolean {
      return perm.User.printlistviews
    }
    
    // 'def' attribute on PanelRef at AddressBookSearchScreen.pcf: line 73, column 122
    function def_onEnter_15 (def :  pcf.AddressBookSearchLV) : void {
      def.onEnter(null, PageHelper, searchCriteria.ExternalContactSource, searchResults, searchCriteria)
    }
    
    // 'def' attribute on PanelRef at AddressBookSearchScreen.pcf: line 65, column 69
    function def_onEnter_7 (def :  pcf.AddressBookContactSearchPopupDV) : void {
      def.onEnter(contactSearchHelper)
    }
    
    // 'def' attribute on PanelRef at AddressBookSearchScreen.pcf: line 67, column 156
    function def_onEnter_9 (def :  pcf.AddressBookSearchDV) : void {
      def.onEnter(searchCriteria, PageHelper, requiredContactType, externalSearchEnabled, claim, performVendorSearch, contactSearchHelper)
    }
    
    // 'def' attribute on PanelRef at AddressBookSearchScreen.pcf: line 67, column 156
    function def_refreshVariables_10 (def :  pcf.AddressBookSearchDV) : void {
      def.refreshVariables(searchCriteria, PageHelper, requiredContactType, externalSearchEnabled, claim, performVendorSearch, contactSearchHelper)
    }
    
    // 'def' attribute on PanelRef at AddressBookSearchScreen.pcf: line 73, column 122
    function def_refreshVariables_16 (def :  pcf.AddressBookSearchLV) : void {
      def.refreshVariables(null, PageHelper, searchCriteria.ExternalContactSource, searchResults, searchCriteria)
    }
    
    // 'def' attribute on PanelRef at AddressBookSearchScreen.pcf: line 65, column 69
    function def_refreshVariables_8 (def :  pcf.AddressBookContactSearchPopupDV) : void {
      def.refreshVariables(contactSearchHelper)
    }
    
    // 'maxSearchResults' attribute on SearchPanel at AddressBookSearchScreen.pcf: line 63, column 75
    function maxSearchResults_17 () : java.lang.Object {
      return gw.api.search.MaxSearchResults.forContacts()
    }
    
    // 'searchCriteria' attribute on SearchPanel at AddressBookSearchScreen.pcf: line 63, column 75
    function searchCriteria_19 () : entity.ContactSearchCriteria {
      return newSearchCriteria()
    }
    
    // 'search' attribute on SearchPanel at AddressBookSearchScreen.pcf: line 63, column 75
    function search_18 () : java.lang.Object {
      new gw.api.name.UserSearchNameOwner(searchCriteria).clearNonvisibleFields(); return PageHelper.performProximitySearch(CurrentLocation,searchCriteria)
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=RetrieveRequested) at AddressBookSearchScreen.pcf: line 83, column 59
    function visible_11 () : java.lang.Boolean {
      return searchCriteria.isProximitySearch()
    }
    
    property get searchCriteria () : entity.ContactSearchCriteria {
      return getCriteriaValue(1) as entity.ContactSearchCriteria
    }
    
    property set searchCriteria ($arg :  entity.ContactSearchCriteria) {
      setCriteriaValue(1, $arg)
    }
    
    property get searchResults () : gw.api.database.IQueryBeanResult<Contact> {
      return getResultsValue(1) as gw.api.database.IQueryBeanResult<Contact>
    }
    
    
  }
  
  
}