package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/documents/ClaimDocuments.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimDocumentsExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/documents/ClaimDocuments.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimDocumentsExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (Claim :  Claim) : int {
      return 0
    }
    
    // 'canVisit' attribute on Page (id=ClaimDocuments) at ClaimDocuments.pcf: line 9, column 79
    static function canVisit_21 (Claim :  Claim) : java.lang.Boolean {
      return perm.Claim.view(Claim) and perm.System.viewdocs and (Claim.State != ClaimState.TC_DRAFT)
    }
    
    // 'initialValue' attribute on Variable at ClaimDocuments.pcf: line 18, column 52
    function initialValue_0 () : gw.document.DocumentsActionsUIHelper {
      return new gw.document.DocumentsActionsUIHelper()
    }
    
    // Page (id=ClaimDocuments) at ClaimDocuments.pcf: line 9, column 79
    static function parent_22 (Claim :  Claim) : pcf.api.Destination {
      return pcf.Claim.createDestination(Claim)
    }
    
    // 'visible' attribute on AlertBar (id=IDCSDisabledAlert) at ClaimDocuments.pcf: line 24, column 68
    function visible_1 () : java.lang.Boolean {
      return not documentsActionsHelper.ContentSourceEnabled
    }
    
    // 'visible' attribute on AlertBar (id=IDCSUnavailableAlert) at ClaimDocuments.pcf: line 28, column 72
    function visible_2 () : java.lang.Boolean {
      return documentsActionsHelper.ShowContentServerDownWarning
    }
    
    // 'visible' attribute on AlertBar (id=IDMSUnavailableAlert) at ClaimDocuments.pcf: line 32, column 73
    function visible_3 () : java.lang.Boolean {
      return documentsActionsHelper.ShowMetadataServerDownWarning
    }
    
    property get Claim () : Claim {
      return getVariableValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setVariableValue("Claim", 0, $arg)
    }
    
    override property get CurrentLocation () : pcf.ClaimDocuments {
      return super.CurrentLocation as pcf.ClaimDocuments
    }
    
    property get documentsActionsHelper () : gw.document.DocumentsActionsUIHelper {
      return getVariableValue("documentsActionsHelper", 0) as gw.document.DocumentsActionsUIHelper
    }
    
    property set documentsActionsHelper ($arg :  gw.document.DocumentsActionsUIHelper) {
      setVariableValue("documentsActionsHelper", 0, $arg)
    }
    
    
          function createSearchCriteria() : DocumentSearchCriteria {
            var searchCriteria = new DocumentSearchCriteria();
            searchCriteria.Claim = Claim;
            searchCriteria.IncludeObsoletes = false;
            return searchCriteria;
          }
        
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/documents/ClaimDocuments.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends ClaimDocumentsExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=RefreshAsyncContent) at ClaimDocuments.pcf: line 87, column 110
    function action_16 () : void {
      
    }
    
    // 'available' attribute on ToolbarButton (id=RefreshAsyncContent) at ClaimDocuments.pcf: line 87, column 110
    function available_14 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentContentServerAvailable
    }
    
    // 'available' attribute on CheckedValuesToolbarButton (id=ClaimDocuments_ObsolesceButton) at ClaimDocuments.pcf: line 55, column 29
    function available_6 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentMetadataActionsAvailable
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=ClaimDocuments_DeobsolesceButton) at ClaimDocuments.pcf: line 64, column 66
    function checkedRowAction_10 (element :  entity.Document, CheckedValue :  entity.Document) : void {
       CheckedValue.Obsolete = false
    }
    
    // 'checkedRowAction' attribute on CheckedValuesToolbarButton (id=ClaimDocuments_ObsolesceButton) at ClaimDocuments.pcf: line 55, column 29
    function checkedRowAction_7 (element :  entity.Document, CheckedValue :  entity.Document) : void {
       CheckedValue.Obsolete = true
    }
    
    // 'def' attribute on MenuItemSetRef at ClaimDocuments.pcf: line 70, column 59
    function def_onEnter_11 (def :  pcf.ClaimNewDocumentMenuItemSet) : void {
      def.onEnter(Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimDocuments.pcf: line 45, column 66
    function def_onEnter_17 (def :  pcf.DocumentsLV) : void {
      def.onEnter(DocumentList,DocumentSearchCriteria)
    }
    
    // 'def' attribute on PanelRef at ClaimDocuments.pcf: line 43, column 64
    function def_onEnter_4 (def :  pcf.ClaimDocumentSearchDV) : void {
      def.onEnter(DocumentSearchCriteria)
    }
    
    // 'def' attribute on MenuItemSetRef at ClaimDocuments.pcf: line 70, column 59
    function def_refreshVariables_12 (def :  pcf.ClaimNewDocumentMenuItemSet) : void {
      def.refreshVariables(Claim)
    }
    
    // 'def' attribute on PanelRef at ClaimDocuments.pcf: line 45, column 66
    function def_refreshVariables_18 (def :  pcf.DocumentsLV) : void {
      def.refreshVariables(DocumentList,DocumentSearchCriteria)
    }
    
    // 'def' attribute on PanelRef at ClaimDocuments.pcf: line 43, column 64
    function def_refreshVariables_5 (def :  pcf.ClaimDocumentSearchDV) : void {
      def.refreshVariables(DocumentSearchCriteria)
    }
    
    // 'searchCriteria' attribute on SearchPanel at ClaimDocuments.pcf: line 41, column 78
    function searchCriteria_20 () : entity.DocumentSearchCriteria {
      return createSearchCriteria();
    }
    
    // 'search' attribute on SearchPanel at ClaimDocuments.pcf: line 41, column 78
    function search_19 () : java.lang.Object {
      return DocumentSearchCriteria.performSearch() as gw.api.database.IQueryBeanResult<Document>
    }
    
    // 'visible' attribute on ToolbarButton (id=AddDocuments) at ClaimDocuments.pcf: line 68, column 58
    function visible_13 () : java.lang.Boolean {
      return perm.Claim.createdocument(Claim)
    }
    
    // 'visible' attribute on ToolbarButton (id=RefreshAsyncContent) at ClaimDocuments.pcf: line 87, column 110
    function visible_15 () : java.lang.Boolean {
      return documentsActionsHelper.isShowAsynchronousRefreshAction(DocumentList.toTypedArray())
    }
    
    // 'visible' attribute on CheckedValuesToolbarButton (id=ClaimDocuments_DeobsolesceButton) at ClaimDocuments.pcf: line 64, column 66
    function visible_9 () : java.lang.Boolean {
      return DocumentSearchCriteria.IncludeObsoletes
    }
    
    property get DocumentList () : gw.api.database.IQueryBeanResult<Document> {
      return getResultsValue(1) as gw.api.database.IQueryBeanResult<Document>
    }
    
    property get DocumentSearchCriteria () : entity.DocumentSearchCriteria {
      return getCriteriaValue(1) as entity.DocumentSearchCriteria
    }
    
    property set DocumentSearchCriteria ($arg :  entity.DocumentSearchCriteria) {
      setCriteriaValue(1, $arg)
    }
    
    
  }
  
  
}