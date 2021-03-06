package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SubrogationPartiesExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CardViewPanelExpressionsImpl extends ListDetailPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on ToolbarButton (id=CreateFromTemplate) at SubrogationParties.pcf: line 294, column 89
    function action_85 () : void {
      ClaimNewDocumentFromTemplateWorksheet.goInWorkspace(claim, claim.SubrogationSummary.getDocumentInitForUI(subroadverseparty))
    }
    
    // 'action' attribute on ToolbarButton (id=AttachDocument) at SubrogationParties.pcf: line 299, column 89
    function action_88 () : void {
      ClaimNewDocumentLinkedWorksheet.goInWorkspace(claim, claim.SubrogationSummary.getDocumentInitForUI(subroadverseparty))
    }
    
    // 'action' attribute on PickerToolbarButton (id=LinkDocument) at SubrogationParties.pcf: line 305, column 104
    function action_91 () : void {
      PickExistingDocumentPopup.push(claim)
    }
    
    // 'action' attribute on ToolbarButton (id=RefreshAsyncContent) at SubrogationParties.pcf: line 312, column 101
    function action_96 () : void {
      
    }
    
    // 'action' attribute on ToolbarButton (id=CreateFromTemplate) at SubrogationParties.pcf: line 294, column 89
    function action_dest_86 () : pcf.api.Destination {
      return pcf.ClaimNewDocumentFromTemplateWorksheet.createDestination(claim, claim.SubrogationSummary.getDocumentInitForUI(subroadverseparty))
    }
    
    // 'action' attribute on ToolbarButton (id=AttachDocument) at SubrogationParties.pcf: line 299, column 89
    function action_dest_89 () : pcf.api.Destination {
      return pcf.ClaimNewDocumentLinkedWorksheet.createDestination(claim, claim.SubrogationSummary.getDocumentInitForUI(subroadverseparty))
    }
    
    // 'action' attribute on PickerToolbarButton (id=LinkDocument) at SubrogationParties.pcf: line 305, column 104
    function action_dest_92 () : pcf.api.Destination {
      return pcf.PickExistingDocumentPopup.createDestination(claim)
    }
    
    // 'available' attribute on ToolbarButton (id=CreateFromTemplate) at SubrogationParties.pcf: line 294, column 89
    function available_84 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentTemplateActionsAvailable
    }
    
    // 'available' attribute on ToolbarButton (id=AttachDocument) at SubrogationParties.pcf: line 299, column 89
    function available_87 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentMetadataActionsAvailable and documentsActionsHelper.DocumentContentActionsAvailable
    }
    
    // 'available' attribute on PickerToolbarButton (id=LinkDocument) at SubrogationParties.pcf: line 305, column 104
    function available_90 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentMetadataActionsAvailable
    }
    
    // 'available' attribute on ToolbarButton (id=RefreshAsyncContent) at SubrogationParties.pcf: line 312, column 101
    function available_94 () : java.lang.Boolean {
      return documentsActionsHelper.DocumentContentServerAvailable
    }
    
    // 'def' attribute on PanelRef at SubrogationParties.pcf: line 72, column 65
    function def_onEnter_14 (def :  pcf.SubrogationPartyDetailDV) : void {
      def.onEnter(subroadverseparty)
    }
    
    // 'def' attribute on InputSetRef at SubrogationParties.pcf: line 276, column 52
    function def_onEnter_80 (def :  pcf.DeductibleInputSet) : void {
      def.onEnter(claim)
    }
    
    // 'def' attribute on PanelRef at SubrogationParties.pcf: line 286, column 46
    function def_onEnter_82 (def :  pcf.DocumentAlertPanelSet) : void {
      def.onEnter()
    }
    
    // 'def' attribute on PanelRef at SubrogationParties.pcf: line 288, column 60
    function def_onEnter_97 (def :  pcf.SubrogationDocumentsLV) : void {
      def.onEnter(subroDocuments)
    }
    
    // 'def' attribute on PanelRef at SubrogationParties.pcf: line 72, column 65
    function def_refreshVariables_15 (def :  pcf.SubrogationPartyDetailDV) : void {
      def.refreshVariables(subroadverseparty)
    }
    
    // 'def' attribute on InputSetRef at SubrogationParties.pcf: line 276, column 52
    function def_refreshVariables_81 (def :  pcf.DeductibleInputSet) : void {
      def.refreshVariables(claim)
    }
    
    // 'def' attribute on PanelRef at SubrogationParties.pcf: line 286, column 46
    function def_refreshVariables_83 (def :  pcf.DocumentAlertPanelSet) : void {
      def.refreshVariables()
    }
    
    // 'def' attribute on PanelRef at SubrogationParties.pcf: line 288, column 60
    function def_refreshVariables_98 (def :  pcf.SubrogationDocumentsLV) : void {
      def.refreshVariables(subroDocuments)
    }
    
    // 'initialValue' attribute on Variable at SubrogationParties.pcf: line 61, column 39
    function initialValue_10 () : SubroAdverseParty {
      return adversePartyRow.AdverseParty
    }
    
    // 'initialValue' attribute on Variable at SubrogationParties.pcf: line 66, column 32
    function initialValue_11 () : Document[] {
      return claim.SubrogationSummary.getRelatedDocuments(subroadverseparty)
    }
    
    // EditButtons at SubrogationParties.pcf: line 75, column 63
    function label_13 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'onPick' attribute on PickerToolbarButton (id=LinkDocument) at SubrogationParties.pcf: line 305, column 104
    function onPick_93 (PickedValue :  Document) : void {
      claim.SubrogationSummary.linkDocumentForUI(PickedValue, subroadverseparty)
    }
    
    // 'title' attribute on Card (id=DetailAdverseViewTitleCard) at SubrogationParties.pcf: line 70, column 60
    function title_17 () : java.lang.String {
      return DisplayKey.get("Web.Subrogation.SubrogationParties.DetailViewTitle", subroadverseparty.AdverseParty)
    }
    
    // 'editVisible' attribute on EditButtons at SubrogationParties.pcf: line 75, column 63
    function visible_12 () : java.lang.Boolean {
      return perm.System.editsubrodetails
    }
    
    // 'visible' attribute on Card (id=DetailAdverseViewTitleCard) at SubrogationParties.pcf: line 70, column 60
    function visible_16 () : java.lang.Boolean {
      return adversePartyRow.AdverseParty != null
    }
    
    // 'visible' attribute on ToolbarButton (id=RefreshAsyncContent) at SubrogationParties.pcf: line 312, column 101
    function visible_95 () : java.lang.Boolean {
      return documentsActionsHelper.isShowAsynchronousRefreshAction(subroDocuments)
    }
    
    property get subroDocuments () : Document[] {
      return getVariableValue("subroDocuments", 2) as Document[]
    }
    
    property set subroDocuments ($arg :  Document[]) {
      setVariableValue("subroDocuments", 2, $arg)
    }
    
    property get subroadverseparty () : SubroAdverseParty {
      return getVariableValue("subroadverseparty", 2) as SubroAdverseParty
    }
    
    property set subroadverseparty ($arg :  SubroAdverseParty) {
      setVariableValue("subroadverseparty", 2, $arg)
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends SubrogationRecoveriesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 4)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on DateCell (id=CreateDate_Cell) at SubrogationParties.pcf: line 240, column 52
    function valueRoot_65 () : java.lang.Object {
      return recovery
    }
    
    // 'value' attribute on DateCell (id=CreateDate_Cell) at SubrogationParties.pcf: line 240, column 52
    function value_64 () : java.util.Date {
      return recovery.CreateTime
    }
    
    // 'value' attribute on TextCell (id=ReserveLine_Cell) at SubrogationParties.pcf: line 245, column 55
    function value_67 () : entity.ReserveLine {
      return recovery.ReserveLine
    }
    
    // 'value' attribute on CurrencyCell (id=RecoveryAmount_Cell) at SubrogationParties.pcf: line 249, column 57
    function value_70 () : gw.api.financials.CurrencyAmount {
      return recovery.ReservingAmount
    }
    
    // 'value' attribute on TypeKeyCell (id=Status_Cell) at SubrogationParties.pcf: line 254, column 62
    function value_73 () : typekey.TransactionStatus {
      return recovery.Status
    }
    
    property get recovery () : entity.Recovery {
      return getIteratedValue(4) as entity.Recovery
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends SubrogationFinancialsLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 4)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'useSubHeaderStyle' attribute on Row at SubrogationParties.pcf: line 156, column 58
    function useSubHeaderStyle_40 () : java.lang.Boolean {
      return fsRow.Level == 1
    }
    
    // 'value' attribute on TextCell (id=Label_Cell) at SubrogationParties.pcf: line 159, column 44
    function valueRoot_22 () : java.lang.Object {
      return fsRow
    }
    
    // 'value' attribute on TextCell (id=Label_Cell) at SubrogationParties.pcf: line 159, column 44
    function value_21 () : java.lang.String {
      return fsRow.Label
    }
    
    // 'value' attribute on CurrencyCell (id=Paid_Cell) at SubrogationParties.pcf: line 162, column 111
    function value_24 () : gw.api.financials.CurrencyAmount {
      return fsRow.Calculations[gw.subrogation.financials.SubrogationCalculationsEnum.PAID]
    }
    
    // 'value' attribute on CurrencyCell (id=RecoveryAmount_Cell) at SubrogationParties.pcf: line 165, column 117
    function value_26 () : gw.api.financials.CurrencyAmount {
      return fsRow.Calculations[gw.subrogation.financials.SubrogationCalculationsEnum.RECOVERIES]
    }
    
    // 'value' attribute on CurrencyCell (id=NetPaidAmount_Cell) at SubrogationParties.pcf: line 168, column 115
    function value_28 () : gw.api.financials.CurrencyAmount {
      return fsRow.Calculations[gw.subrogation.financials.SubrogationCalculationsEnum.NET_PAID]
    }
    
    // 'value' attribute on CurrencyCell (id=DeductibleAmount_Cell) at SubrogationParties.pcf: line 171, column 117
    function value_30 () : gw.api.financials.CurrencyAmount {
      return fsRow.Calculations[gw.subrogation.financials.SubrogationCalculationsEnum.DEDUCTIBLE]
    }
    
    // 'value' attribute on CurrencyCell (id=ExpectedRecoveryAmount_Cell) at SubrogationParties.pcf: line 174, column 124
    function value_32 () : gw.api.financials.CurrencyAmount {
      return fsRow.Calculations[gw.subrogation.financials.SubrogationCalculationsEnum.EXPECTED_RECOVERY]
    }
    
    // 'value' attribute on CurrencyCell (id=SubroRecoveredAmount_Cell) at SubrogationParties.pcf: line 177, column 129
    function value_34 () : gw.api.financials.CurrencyAmount {
      return fsRow.Calculations[gw.subrogation.financials.SubrogationCalculationsEnum.SUBROGATION_RECOVERIES]
    }
    
    // 'value' attribute on CurrencyCell (id=PendingAmount_Cell) at SubrogationParties.pcf: line 180, column 114
    function value_36 () : gw.api.financials.CurrencyAmount {
      return fsRow.Calculations[gw.subrogation.financials.SubrogationCalculationsEnum.PENDING]
    }
    
    // 'value' attribute on CurrencyCell (id=AvailableRecoveryReserves_Cell) at SubrogationParties.pcf: line 183, column 129
    function value_38 () : gw.api.financials.CurrencyAmount {
      return fsRow.Calculations[gw.subrogation.financials.SubrogationCalculationsEnum.OPEN_RECOVERY_RESERVES]
    }
    
    property get fsRow () : gw.subrogation.financials.AbstractSubroFinsNode {
      return getIteratedValue(4) as gw.subrogation.financials.AbstractSubroFinsNode
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ListDetailPanelExpressionsImpl extends SubrogationPartiesExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on PanelRef at SubrogationParties.pcf: line 55, column 76
    function def_onEnter_8 (def :  pcf.EditableSubrogationPartiesLV) : void {
      def.onEnter(adversePartyWrappers, claim)
    }
    
    // 'def' attribute on PanelRef at SubrogationParties.pcf: line 55, column 76
    function def_refreshVariables_9 (def :  pcf.EditableSubrogationPartiesLV) : void {
      def.refreshVariables(adversePartyWrappers, claim)
    }
    
    // 'selectionOnEnter' attribute on ListDetailPanel at SubrogationParties.pcf: line 53, column 71
    function selectionOnEnter_100 () : java.lang.Object {
      return adversePartyWrappers.firstWhere(\ wrapper -> wrapper == selectedWrapper)
    }
    
    property get adversePartyRow () : gw.subrogation.financials.AdversePartyWrapper {
      return getCurrentSelection(1) as gw.subrogation.financials.AdversePartyWrapper
    }
    
    property set adversePartyRow ($arg :  gw.subrogation.financials.AdversePartyWrapper) {
      setCurrentSelection(1, $arg)
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationFinancialsLVExpressionsImpl extends CardViewPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 3)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at SubrogationParties.pcf: line 94, column 69
    function initialValue_18 () : gw.subrogation.financials.SubroFinsResult {
      return gw.subrogation.financials.SubrogationFinancialsHelper.getSubroFinancialsRows(claim, subroadverseparty)
    }
    
    // 'value' attribute on TextCell (id=AvailableRecoveryReservesHeader_Cell) at SubrogationParties.pcf: line 148, column 345
    function value_19 () : java.lang.String {
      if(gw.api.system.CCConfigParameters.UseRecoveryReserves.getValue()) { return subroadverseparty == null ? DisplayKey.get("Web.Subrogation.Financials.Header.OpenRecoveryReserves") : DisplayKey.get("Web.Subrogation.Financials.Header.ApportionedOpenRecoveryReserves") } else { return "" }
    }
    
    // 'value' attribute on RowIterator at SubrogationParties.pcf: line 154, column 101
    function value_41 () : java.util.List<gw.subrogation.financials.AbstractSubroFinsNode> {
      return subroFinsResult.Nodes
    }
    
    // 'value' attribute on CurrencyCell (id=TotalPaid_Cell) at SubrogationParties.pcf: line 194, column 113
    function value_42 () : gw.api.financials.CurrencyAmount {
      return subroFinsResult.Totals[gw.subrogation.financials.SubrogationCalculationsEnum.PAID]
    }
    
    // 'value' attribute on CurrencyCell (id=TotalRecovered_Cell) at SubrogationParties.pcf: line 197, column 119
    function value_44 () : gw.api.financials.CurrencyAmount {
      return subroFinsResult.Totals[gw.subrogation.financials.SubrogationCalculationsEnum.RECOVERIES]
    }
    
    // 'value' attribute on CurrencyCell (id=TotalNetPaid_Cell) at SubrogationParties.pcf: line 200, column 117
    function value_46 () : gw.api.financials.CurrencyAmount {
      return subroFinsResult.Totals[gw.subrogation.financials.SubrogationCalculationsEnum.NET_PAID]
    }
    
    // 'value' attribute on CurrencyCell (id=TotalDeductible_Cell) at SubrogationParties.pcf: line 203, column 119
    function value_48 () : gw.api.financials.CurrencyAmount {
      return subroFinsResult.Totals[gw.subrogation.financials.SubrogationCalculationsEnum.DEDUCTIBLE]
    }
    
    // 'value' attribute on CurrencyCell (id=TotalExpectedRecovery_Cell) at SubrogationParties.pcf: line 206, column 126
    function value_50 () : gw.api.financials.CurrencyAmount {
      return subroFinsResult.Totals[gw.subrogation.financials.SubrogationCalculationsEnum.EXPECTED_RECOVERY]
    }
    
    // 'value' attribute on CurrencyCell (id=TotalSubroRecovered_Cell) at SubrogationParties.pcf: line 209, column 131
    function value_52 () : gw.api.financials.CurrencyAmount {
      return subroFinsResult.Totals[gw.subrogation.financials.SubrogationCalculationsEnum.SUBROGATION_RECOVERIES]
    }
    
    // 'value' attribute on CurrencyCell (id=TotalPending_Cell) at SubrogationParties.pcf: line 212, column 116
    function value_54 () : gw.api.financials.CurrencyAmount {
      return subroFinsResult.Totals[gw.subrogation.financials.SubrogationCalculationsEnum.PENDING]
    }
    
    // 'value' attribute on CurrencyCell (id=TotalAvailableRecoveryReserves_Cell) at SubrogationParties.pcf: line 215, column 131
    function value_56 () : gw.api.financials.CurrencyAmount {
      return subroFinsResult.Totals[gw.subrogation.financials.SubrogationCalculationsEnum.OPEN_RECOVERY_RESERVES]
    }
    
    // 'visible' attribute on Row at SubrogationParties.pcf: line 188, column 66
    function visible_58 () : java.lang.Boolean {
      return subroFinsResult.Totals.size() > 0
    }
    
    property get subroFinsResult () : gw.subrogation.financials.SubroFinsResult {
      return getVariableValue("subroFinsResult", 3) as gw.subrogation.financials.SubroFinsResult
    }
    
    property set subroFinsResult ($arg :  gw.subrogation.financials.SubroFinsResult) {
      setVariableValue("subroFinsResult", 3, $arg)
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationPartiesExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (claim :  Claim) : int {
      return 0
    }
    
    static function __constructorIndex (claim :  Claim, selectedWrapper :  gw.subrogation.financials.AdversePartyWrapper) : int {
      return 1
    }
    
    // 'afterCommit' attribute on Page (id=SubrogationParties) at SubrogationParties.pcf: line 11, column 76
    function afterCommit_101 (TopLocation :  pcf.api.Location) : void {
      adversePartyWrappers = gw.subrogation.financials.SubrogationFinancialsHelper.getSelectableAdversePartiesWithTotalRow(claim)
    }
    
    // 'afterReturnFromPopup' attribute on Page (id=SubrogationParties) at SubrogationParties.pcf: line 11, column 76
    function afterReturnFromPopup_102 (popupCommitted :  boolean) : void {
      if(claim.SubrogationSummary.SubroAdverseParties.Count == 0) { CurrentLocation.cancel() }
    }
    
    // 'canVisit' attribute on Page (id=SubrogationParties) at SubrogationParties.pcf: line 11, column 76
    static function canVisit_104 (claim :  Claim, selectedWrapper :  gw.subrogation.financials.AdversePartyWrapper) : java.lang.Boolean {
      return perm.Claim.view(claim) and perm.System.viewsubrodetails
    }
    
    // 'conversionExpression' attribute on AddButton (id=AddNewSubroAdverseParty) at SubrogationParties.pcf: line 42, column 51
    function conversionExpression_4 (PickedValue :  entity.SubroAdverseParty) : gw.subrogation.financials.AdversePartyWrapper {
      return new gw.subrogation.financials.AdversePartyWrapper(PickedValue)
    }
    
    // 'initialValue' attribute on Variable at SubrogationParties.pcf: line 22, column 83
    function initialValue_0 () : java.util.List<gw.subrogation.financials.AdversePartyWrapper> {
      return gw.subrogation.financials.SubrogationFinancialsHelper.getSelectableAdversePartiesWithTotalRow(claim)
    }
    
    // 'initialValue' attribute on Variable at SubrogationParties.pcf: line 26, column 61
    function initialValue_1 () : gw.subrogation.financials.AdversePartyWrapper {
      return null
    }
    
    // 'initialValue' attribute on Variable at SubrogationParties.pcf: line 30, column 52
    function initialValue_2 () : gw.document.DocumentsActionsUIHelper {
      return new gw.document.DocumentsActionsUIHelper()
    }
    
    // Page (id=SubrogationParties) at SubrogationParties.pcf: line 11, column 76
    static function parent_105 (claim :  Claim, selectedWrapper :  gw.subrogation.financials.AdversePartyWrapper) : pcf.api.Destination {
      return pcf.ClaimSubrogationGroup.createDestination(claim)
    }
    
    // 'pickLocation' attribute on AddButton (id=AddNewSubroAdverseParty) at SubrogationParties.pcf: line 42, column 51
    function pickLocation_5 () : void {
      NewSubroAdversePartyPopup.push(claim)
    }
    
    // 'showRemoveConfirmMessage' attribute on IteratorButtons at SubrogationParties.pcf: line 47, column 100
    function showConfirmMessage_7 () : java.lang.Boolean {
      return not claim.SubrogationSummary.HasNoSubroAdversePartyOverrides
    }
    
    // 'visible' attribute on AddButton (id=AddNewSubroAdverseParty) at SubrogationParties.pcf: line 42, column 51
    function visible_3 () : java.lang.Boolean {
      return perm.System.editsubrodetails
    }
    
    override property get CurrentLocation () : pcf.SubrogationParties {
      return super.CurrentLocation as pcf.SubrogationParties
    }
    
    property get adversePartyWrappers () : java.util.List<gw.subrogation.financials.AdversePartyWrapper> {
      return getVariableValue("adversePartyWrappers", 0) as java.util.List<gw.subrogation.financials.AdversePartyWrapper>
    }
    
    property set adversePartyWrappers ($arg :  java.util.List<gw.subrogation.financials.AdversePartyWrapper>) {
      setVariableValue("adversePartyWrappers", 0, $arg)
    }
    
    property get claim () : Claim {
      return getVariableValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setVariableValue("claim", 0, $arg)
    }
    
    property get documentsActionsHelper () : gw.document.DocumentsActionsUIHelper {
      return getVariableValue("documentsActionsHelper", 0) as gw.document.DocumentsActionsUIHelper
    }
    
    property set documentsActionsHelper ($arg :  gw.document.DocumentsActionsUIHelper) {
      setVariableValue("documentsActionsHelper", 0, $arg)
    }
    
    property get selectedWrapper () : gw.subrogation.financials.AdversePartyWrapper {
      return getVariableValue("selectedWrapper", 0) as gw.subrogation.financials.AdversePartyWrapper
    }
    
    property set selectedWrapper ($arg :  gw.subrogation.financials.AdversePartyWrapper) {
      setVariableValue("selectedWrapper", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/subrogation/AdverseParty/SubrogationParties.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationRecoveriesLVExpressionsImpl extends CardViewPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 3)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at SubrogationParties.pcf: line 229, column 58
    function initialValue_59 () : java.util.List<Recovery> {
      return subroadverseparty != null ? subroadverseparty.getSubroRecoveriesForParty() : claim.SubroClaimCostRecoveries
    }
    
    // 'value' attribute on DateCell (id=CreateDate_Cell) at SubrogationParties.pcf: line 240, column 52
    function sortValue_60 (recovery :  entity.Recovery) : java.lang.Object {
      return recovery.CreateTime
    }
    
    // 'value' attribute on TextCell (id=ReserveLine_Cell) at SubrogationParties.pcf: line 245, column 55
    function sortValue_61 (recovery :  entity.Recovery) : java.lang.Object {
      return recovery.ReserveLine
    }
    
    // 'value' attribute on CurrencyCell (id=RecoveryAmount_Cell) at SubrogationParties.pcf: line 249, column 57
    function sortValue_62 (recovery :  entity.Recovery) : java.lang.Object {
      return recovery.ReservingAmount
    }
    
    // 'value' attribute on TypeKeyCell (id=Status_Cell) at SubrogationParties.pcf: line 254, column 62
    function sortValue_63 (recovery :  entity.Recovery) : java.lang.Object {
      return recovery.Status
    }
    
    // 'value' attribute on RowIterator at SubrogationParties.pcf: line 234, column 69
    function value_76 () : java.util.List<entity.Recovery> {
      return recoveries
    }
    
    // 'value' attribute on CurrencyCell (id=RecoveryAmountTotalFooter_Cell) at SubrogationParties.pcf: line 267, column 93
    function value_77 () : gw.api.financials.CurrencyAmount {
      return recoveries.sumCurrencyAmount(\ rec -> rec.ReservingAmount )
    }
    
    // 'visible' attribute on Row at SubrogationParties.pcf: line 259, column 174
    function visible_79 () : java.lang.Boolean {
      return recoveries.size() > 0 and !recoveries.hasMatch(\ rec -> rec.ReserveLine.ReservingCurrency != recoveries[0].ReserveLine.ReservingCurrency )
    }
    
    property get recoveries () : java.util.List<Recovery> {
      return getVariableValue("recoveries", 3) as java.util.List<Recovery>
    }
    
    property set recoveries ($arg :  java.util.List<Recovery>) {
      setVariableValue("recoveries", 3, $arg)
    }
    
    
  }
  
  
}