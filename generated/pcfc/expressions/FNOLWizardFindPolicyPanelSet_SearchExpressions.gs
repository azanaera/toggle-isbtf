package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLWizardFindPolicyPanelSet_SearchExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLWizardFindPolicyPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on DateInput (id=Claim_LossDate_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 214, column 43
    function defaultSetter_103 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimLossDate.LossDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=Claim_lossTime_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 220, column 43
    function defaultSetter_108 (__VALUE_TO_SET :  java.lang.Object) : void {
      claimLossDate.LossTime = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on RangeRadioInput (id=ClaimMode_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 232, column 49
    function defaultSetter_114 (__VALUE_TO_SET :  java.lang.Object) : void {
      Wizard.ClaimMode = (__VALUE_TO_SET as gw.api.claim.NewClaimMode)
    }
    
    // 'value' attribute on TextInput (id=ClaimNumber2_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 204, column 58
    function defaultSetter_95 (__VALUE_TO_SET :  java.lang.Object) : void {
      Claim.ClaimNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'initialValue' attribute on Variable at FNOLWizardFindPolicyPanelSet.Search.pcf: line 17, column 42
    function initialValue_0 () : gw.pcf.FNOLFindPolicyUtils {
      Wizard.FindPolicyUtils = new gw.pcf.FNOLFindPolicyUtils(Wizard, Claim); return Wizard.FindPolicyUtils
    }
    
    // 'initialValue' attribute on Variable at FNOLWizardFindPolicyPanelSet.Search.pcf: line 21, column 47
    function initialValue_1 () : gw.api.claim.ClaimLossDateProxy {
      return new gw.api.claim.ClaimLossDateProxy(Claim)
    }
    
    // 'onChange' attribute on PostOnChange at FNOLWizardFindPolicyPanelSet.Search.pcf: line 234, column 68
    function onChange_111 () : void {
      FindPolicyUtils.onClaimModeSelectionMade()
    }
    
    // 'showConfirmMessage' attribute on DateInput (id=Claim_LossDate_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 214, column 43
    function showConfirmMessage_101 () : java.lang.Boolean {
      return not Wizard.AtHighWaterMark
    }
    
    // 'showConfirmMessage' attribute on RangeRadioInput (id=ClaimMode_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 232, column 49
    function showConfirmMessage_112 () : java.lang.Boolean {
      return !Wizard.AtHighWaterMark
    }
    
    // 'sortBy' attribute on IteratorSort at FNOLWizardFindPolicyPanelSet.Search.pcf: line 255, column 32
    function sortBy_121 (otherClaim :  entity.PriorClaimView) : java.lang.Object {
      return otherClaim.LossDate
    }
    
    // 'value' attribute on TypeKeyCell (id=otherStatus_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 262, column 51
    function sortValue_122 (otherClaim :  entity.PriorClaimView) : java.lang.Object {
      return otherClaim.State
    }
    
    // 'value' attribute on TextCell (id=otherID_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 268, column 33
    function sortValue_123 (otherClaim :  entity.PriorClaimView) : java.lang.Object {
      return otherClaim.ClaimNumber
    }
    
    // 'value' attribute on DateCell (id=otherLossDate_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 273, column 48
    function sortValue_124 (otherClaim :  entity.PriorClaimView) : java.lang.Object {
      return otherClaim.LossDate
    }
    
    // 'value' attribute on TextCell (id=otherInsured_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 277, column 51
    function sortValue_125 (otherClaim :  entity.PriorClaimView) : java.lang.Object {
      return otherClaim.Description
    }
    
    // 'validationExpression' attribute on DateInput (id=Claim_LossDate_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 214, column 43
    function validationExpression_100 () : java.lang.Object {
      return Claim.validateLossDate()
    }
    
    // 'validationExpression' attribute on TextInput (id=ClaimNumber2_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 204, column 58
    function validationExpression_92 () : java.lang.Object {
      return !Claim.DuplicateClaimNumber ? null : DisplayKey.get("Java.NewClaimWizard.Error.ClaimNumberNotUnique", Claim.ClaimNumber)
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=ClaimMode_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 232, column 49
    function valueRange_116 () : java.lang.Object {
      return FindPolicyUtils.ClaimModeArray
    }
    
    // 'value' attribute on DateInput (id=Claim_LossDate_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 214, column 43
    function valueRoot_104 () : java.lang.Object {
      return claimLossDate
    }
    
    // 'value' attribute on RangeRadioInput (id=ClaimMode_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 232, column 49
    function valueRoot_115 () : java.lang.Object {
      return Wizard
    }
    
    // 'value' attribute on TextInput (id=ClaimNumber2_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 204, column 58
    function valueRoot_96 () : java.lang.Object {
      return Claim
    }
    
    // 'value' attribute on DateInput (id=Claim_LossDate_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 214, column 43
    function value_102 () : java.util.Date {
      return claimLossDate.LossDate
    }
    
    // 'value' attribute on DateInput (id=Claim_lossTime_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 220, column 43
    function value_107 () : java.util.Date {
      return claimLossDate.LossTime
    }
    
    // 'value' attribute on RangeRadioInput (id=ClaimMode_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 232, column 49
    function value_113 () : gw.api.claim.NewClaimMode {
      return Wizard.ClaimMode
    }
    
    // 'value' attribute on RowIterator at FNOLWizardFindPolicyPanelSet.Search.pcf: line 251, column 89
    function value_148 () : gw.api.database.IQueryBeanResult<entity.PriorClaimView> {
      return Claim.findPriorClaimsByPolicyNumber(FindPolicyUtils.SelectedPolicySummary.PolicyNumber, {}) as gw.api.database.IQueryBeanResult<PriorClaimView>
    }
    
    // 'value' attribute on TextInput (id=ClaimNumber2_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 204, column 58
    function value_94 () : java.lang.String {
      return Claim.ClaimNumber
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=ClaimMode_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 232, column 49
    function verifyValueRangeIsAllowedType_117 ($$arg :  gw.api.claim.NewClaimMode[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=ClaimMode_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 232, column 49
    function verifyValueRangeIsAllowedType_117 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeRadioInput (id=ClaimMode_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 232, column 49
    function verifyValueRange_118 () : void {
      var __valueRangeArg = FindPolicyUtils.ClaimModeArray
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_117(__valueRangeArg)
    }
    
    // 'visible' attribute on Label at FNOLWizardFindPolicyPanelSet.Search.pcf: line 240, column 62
    function visible_120 () : java.lang.Boolean {
      return FindPolicyUtils.isClaimHistoryVisible()
    }
    
    // 'visible' attribute on DetailViewPanel at FNOLWizardFindPolicyPanelSet.Search.pcf: line 193, column 63
    function visible_150 () : java.lang.Boolean {
      return FindPolicyUtils.SelectedPolicySummary != null
    }
    
    // 'visible' attribute on TextInput (id=ClaimNumber2_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 204, column 58
    function visible_93 () : java.lang.Boolean {
      return !Claim.ClaimNumberGenerationEnabled
    }
    
    property get Claim () : Claim {
      return getRequireValue("Claim", 0) as Claim
    }
    
    property set Claim ($arg :  Claim) {
      setRequireValue("Claim", 0, $arg)
    }
    
    property get FindPolicyUtils () : gw.pcf.FNOLFindPolicyUtils {
      return getVariableValue("FindPolicyUtils", 0) as gw.pcf.FNOLFindPolicyUtils
    }
    
    property set FindPolicyUtils ($arg :  gw.pcf.FNOLFindPolicyUtils) {
      setVariableValue("FindPolicyUtils", 0, $arg)
    }
    
    property get Wizard () : gw.api.claim.NewClaimWizardInfo {
      return getRequireValue("Wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set Wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setRequireValue("Wizard", 0, $arg)
    }
    
    property get claimLossDate () : gw.api.claim.ClaimLossDateProxy {
      return getVariableValue("claimLossDate", 0) as gw.api.claim.ClaimLossDateProxy
    }
    
    property set claimLossDate ($arg :  gw.api.claim.ClaimLossDateProxy) {
      setVariableValue("claimLossDate", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends FNOLWizardFindPolicyPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=otherID_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 268, column 33
    function action_129 () : void {
      FindPolicyUtils.gotoClaimFile(CurrentLocation as pcf.api.Wizard, otherClaim.Claim)
    }
    
    // 'action' attribute on TextCell (id=otherClaimant_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 288, column 63
    function action_142 () : void {
      UserContactDetailPopup.push(otherClaim.Claim.AssignedUser)
    }
    
    // 'action' attribute on TextCell (id=otherClaimant_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 288, column 63
    function action_dest_143 () : pcf.api.Destination {
      return pcf.UserContactDetailPopup.createDestination(otherClaim.Claim.AssignedUser)
    }
    
    // 'highlighted' attribute on Row at FNOLWizardFindPolicyPanelSet.Search.pcf: line 257, column 61
    function highlighted_147 () : java.lang.Boolean {
      return otherClaim.State != TC_CLOSED
    }
    
    // 'value' attribute on TypeKeyCell (id=otherStatus_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 262, column 51
    function valueRoot_127 () : java.lang.Object {
      return otherClaim
    }
    
    // 'value' attribute on TypeKeyCell (id=otherStatus_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 262, column 51
    function value_126 () : typekey.ClaimState {
      return otherClaim.State
    }
    
    // 'value' attribute on TextCell (id=otherID_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 268, column 33
    function value_130 () : java.lang.String {
      return otherClaim.ClaimNumber
    }
    
    // 'value' attribute on DateCell (id=otherLossDate_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 273, column 48
    function value_133 () : java.util.Date {
      return otherClaim.LossDate
    }
    
    // 'value' attribute on TextCell (id=otherInsured_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 277, column 51
    function value_136 () : java.lang.String {
      return otherClaim.Description
    }
    
    // 'value' attribute on DateCell (id=otherPolicyID_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 282, column 52
    function value_139 () : java.util.Date {
      return otherClaim.ReportedDate
    }
    
    // 'value' attribute on TextCell (id=otherClaimant_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 288, column 63
    function value_144 () : java.lang.String {
      return otherClaim.AssignedUserDisplayName
    }
    
    property get otherClaim () : entity.PriorClaimView {
      return getIteratedValue(1) as entity.PriorClaimView
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends SearchPanelExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 2)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=selectButton) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 123, column 76
    function action_49 () : void {
      FindPolicyUtils.selectPolicyRow(PolicySummary, CurrentLocation as pcf.api.Wizard)
    }
    
    // 'action' attribute on Link (id=unselectButton) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 132, column 76
    function action_52 () : void {
      FindPolicyUtils.resetVariables(); Wizard.resetSteps(); gw.api.util.SearchUtil.search();
    }
    
    // 'action' attribute on TextCell (id=PolicyNumber_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 139, column 31
    function action_54 () : void {
      PolicySummaryInfoPopup.push(FindPolicyUtils.SelectedPolicySummary == null ? PolicySummary : FindPolicyUtils.SelectedPolicySummary)
    }
    
    // 'action' attribute on TextCell (id=PolicyNumber_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 139, column 31
    function action_dest_55 () : pcf.api.Destination {
      return pcf.PolicySummaryInfoPopup.createDestination(FindPolicyUtils.SelectedPolicySummary == null ? PolicySummary : FindPolicyUtils.SelectedPolicySummary)
    }
    
    // 'highlighted' attribute on Row at FNOLWizardFindPolicyPanelSet.Search.pcf: line 111, column 103
    function highlighted_87 () : java.lang.Boolean {
      return PolicySummary.isSamePolicySummary( FindPolicyUtils.SelectedPolicySummary)
    }
    
    // 'showConfirmMessage' attribute on Link (id=selectButton) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 123, column 76
    function showConfirmMessage_50 () : java.lang.Boolean {
      return Claim.Policy != null and Claim.Policy.PolicyType != PolicySummary.PolicyType
    }
    
    // 'showConfirmMessage' attribute on Link (id=unselectButton) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 132, column 76
    function showConfirmMessage_53 () : java.lang.Boolean {
      return Claim.Policy != null
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 139, column 31
    function valueRoot_57 () : java.lang.Object {
      return PolicySummary
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 139, column 31
    function value_56 () : java.lang.String {
      return PolicySummary.PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=Insured_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 144, column 31
    function value_59 () : java.lang.String {
      return PolicySummary.InsuredName
    }
    
    // 'value' attribute on TextCell (id=Address_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 150, column 55
    function value_62 () : java.lang.String {
      return PolicySummary.DisplayAddress
    }
    
    // 'value' attribute on TextCell (id=City_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 156, column 31
    function value_65 () : java.lang.String {
      return PolicySummary.DisplayCity
    }
    
    // 'value' attribute on TypeKeyCell (id=State_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 162, column 31
    function value_68 () : typekey.State {
      return PolicySummary.State
    }
    
    // 'value' attribute on TextCell (id=Zip_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 166, column 51
    function value_71 () : java.lang.String {
      return PolicySummary.PostalCode
    }
    
    // 'value' attribute on DateCell (id=Effective_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 170, column 54
    function value_74 () : java.util.Date {
      return PolicySummary.EffectiveDate
    }
    
    // 'value' attribute on DateCell (id=Expiration_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 174, column 55
    function value_77 () : java.util.Date {
      return PolicySummary.ExpirationDate
    }
    
    // 'value' attribute on TypeKeyCell (id=Type_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 180, column 31
    function value_80 () : typekey.PolicyType {
      return PolicySummary.PolicyType
    }
    
    // 'value' attribute on TypeKeyCell (id=Status_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 186, column 34
    function value_83 () : typekey.PolicyStatus {
      return PolicySummary.Status
    }
    
    // 'visible' attribute on Link (id=selectButton) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 123, column 76
    function visible_48 () : java.lang.Boolean {
      return FindPolicyUtils.SelectedPolicySummary == null
    }
    
    // 'visible' attribute on Link (id=unselectButton) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 132, column 76
    function visible_51 () : java.lang.Boolean {
      return FindPolicyUtils.SelectedPolicySummary != null
    }
    
    // 'visible' attribute on TypeKeyCell (id=Status_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 186, column 34
    function visible_85 () : java.lang.Boolean {
      return  true
    }
    
    property get PolicySummary () : entity.PolicySummary {
      return getIteratedValue(2) as entity.PolicySummary
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/FNOL/FNOLWizardFindPolicyPanelSet.Search.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchPanelExpressionsImpl extends FNOLWizardFindPolicyPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on Link (id=Search) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 86, column 33
    function action_34 () : void {
      FindPolicyUtils.resetVariables(); gw.api.util.SearchUtil.search(); if (PolicySummaryList.getCount() == 1) {FindPolicyUtils.selectPolicyRow(PolicySummaryList.getFirstResult(), CurrentLocation as pcf.api.Wizard);}
    }
    
    // 'action' attribute on Link (id=Reset) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 94, column 33
    function action_36 () : void {
      gw.api.util.SearchUtil.reset(); FindPolicyUtils.resetVariables(); FindPolicyUtils.PolicySearchCriteria.resetPolicySearchCriteria(); 
    }
    
    // 'available' attribute on Link (id=Search) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 86, column 33
    function available_33 () : java.lang.Boolean {
      return FindPolicyUtils.SelectedPolicySummary == null
    }
    
    // 'def' attribute on InputSetRef at FNOLWizardFindPolicyPanelSet.Search.pcf: line 47, column 60
    function def_onEnter_11 (def :  pcf.GlobalContactNameInputSet_Japan) : void {
      def.onEnter(new gw.api.name.SearchNameOwner(policySearchCriteria))
    }
    
    // 'def' attribute on InputSetRef at FNOLWizardFindPolicyPanelSet.Search.pcf: line 47, column 60
    function def_onEnter_13 (def :  pcf.GlobalContactNameInputSet_default) : void {
      def.onEnter(new gw.api.name.SearchNameOwner(policySearchCriteria))
    }
    
    // 'def' attribute on InputSetRef at FNOLWizardFindPolicyPanelSet.Search.pcf: line 71, column 200
    function def_onEnter_30 (def :  pcf.FNOLWizard_PolicySearchInputSet_default) : void {
      def.onEnter(Claim, FindPolicyUtils.PolicySearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at FNOLWizardFindPolicyPanelSet.Search.pcf: line 44, column 60
    function def_onEnter_6 (def :  pcf.GlobalPersonNameInputSet_Japan) : void {
      def.onEnter(new gw.api.name.SearchNameOwner(policySearchCriteria))
    }
    
    // 'def' attribute on InputSetRef at FNOLWizardFindPolicyPanelSet.Search.pcf: line 44, column 60
    function def_onEnter_8 (def :  pcf.GlobalPersonNameInputSet_default) : void {
      def.onEnter(new gw.api.name.SearchNameOwner(policySearchCriteria))
    }
    
    // 'def' attribute on InputSetRef at FNOLWizardFindPolicyPanelSet.Search.pcf: line 47, column 60
    function def_refreshVariables_12 (def :  pcf.GlobalContactNameInputSet_Japan) : void {
      def.refreshVariables(new gw.api.name.SearchNameOwner(policySearchCriteria))
    }
    
    // 'def' attribute on InputSetRef at FNOLWizardFindPolicyPanelSet.Search.pcf: line 47, column 60
    function def_refreshVariables_14 (def :  pcf.GlobalContactNameInputSet_default) : void {
      def.refreshVariables(new gw.api.name.SearchNameOwner(policySearchCriteria))
    }
    
    // 'def' attribute on InputSetRef at FNOLWizardFindPolicyPanelSet.Search.pcf: line 71, column 200
    function def_refreshVariables_31 (def :  pcf.FNOLWizard_PolicySearchInputSet_default) : void {
      def.refreshVariables(Claim, FindPolicyUtils.PolicySearchCriteria)
    }
    
    // 'def' attribute on InputSetRef at FNOLWizardFindPolicyPanelSet.Search.pcf: line 44, column 60
    function def_refreshVariables_7 (def :  pcf.GlobalPersonNameInputSet_Japan) : void {
      def.refreshVariables(new gw.api.name.SearchNameOwner(policySearchCriteria))
    }
    
    // 'def' attribute on InputSetRef at FNOLWizardFindPolicyPanelSet.Search.pcf: line 44, column 60
    function def_refreshVariables_9 (def :  pcf.GlobalPersonNameInputSet_default) : void {
      def.refreshVariables(new gw.api.name.SearchNameOwner(policySearchCriteria))
    }
    
    // 'value' attribute on TypeKeyInput (id=PolicyType_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 53, column 45
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      policySearchCriteria.PolicyType = (__VALUE_TO_SET as typekey.PolicyType)
    }
    
    // 'value' attribute on DateInput (id=date_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 60, column 52
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      policySearchCriteria.LossDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludeArchivedPolicies_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 66, column 92
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      policySearchCriteria.IncludeArchived = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'value' attribute on TextInput (id=policyNumber_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 41, column 56
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      policySearchCriteria.PolicyNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'mode' attribute on InputSetRef at FNOLWizardFindPolicyPanelSet.Search.pcf: line 44, column 60
    function mode_10 () : java.lang.Object {
      return gw.api.name.NameLocaleSettings.PCFMode
    }
    
    // 'mode' attribute on InputSetRef at FNOLWizardFindPolicyPanelSet.Search.pcf: line 71, column 200
    function mode_32 () : java.lang.Object {
      return FindPolicyUtils.PolicySearchCriteria.InsuredAddress.Country != null ? FindPolicyUtils.PolicySearchCriteria.InsuredAddress.Country : gw.api.admin.BaseAdminUtil.getDefaultCountry()
    }
    
    // 'searchCriteria' attribute on SearchPanel at FNOLWizardFindPolicyPanelSet.Search.pcf: line 31, column 81
    function searchCriteria_90 () : entity.PolicySearchCriteria {
      return FindPolicyUtils.PolicySearchCriteria
    }
    
    // 'searchOnEnter' attribute on SearchPanel at FNOLWizardFindPolicyPanelSet.Search.pcf: line 31, column 81
    function searchOnEnter_91 () : java.lang.Boolean {
      return Claim.LossType != null
    }
    
    // 'search' attribute on SearchPanel at FNOLWizardFindPolicyPanelSet.Search.pcf: line 31, column 81
    function search_89 () : java.lang.Object {
      return FindPolicyUtils.performSearch()
    }
    
    // 'value' attribute on TextCell (id=PolicyNumber_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 139, column 31
    function sortValue_37 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.PolicyNumber
    }
    
    // 'value' attribute on TextCell (id=Insured_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 144, column 31
    function sortValue_38 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.InsuredName
    }
    
    // 'sortBy' attribute on TextCell (id=Address_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 150, column 55
    function sortValue_39 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.AddressLine1
    }
    
    // 'sortBy' attribute on TextCell (id=City_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 156, column 31
    function sortValue_40 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.City
    }
    
    // 'value' attribute on TypeKeyCell (id=State_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 162, column 31
    function sortValue_41 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.State
    }
    
    // 'value' attribute on TextCell (id=Zip_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 166, column 51
    function sortValue_42 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.PostalCode
    }
    
    // 'value' attribute on DateCell (id=Effective_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 170, column 54
    function sortValue_43 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.EffectiveDate
    }
    
    // 'value' attribute on DateCell (id=Expiration_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 174, column 55
    function sortValue_44 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.ExpirationDate
    }
    
    // 'value' attribute on TypeKeyCell (id=Type_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 180, column 31
    function sortValue_45 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.PolicyType
    }
    
    // 'value' attribute on TypeKeyCell (id=Status_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 186, column 34
    function sortValue_46 (PolicySummary :  entity.PolicySummary) : java.lang.Object {
      return PolicySummary.Status
    }
    
    // 'value' attribute on TextInput (id=policyNumber_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 41, column 56
    function valueRoot_4 () : java.lang.Object {
      return policySearchCriteria
    }
    
    // 'value' attribute on TypeKeyInput (id=PolicyType_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 53, column 45
    function value_16 () : typekey.PolicyType {
      return policySearchCriteria.PolicyType
    }
    
    // 'value' attribute on TextInput (id=policyNumber_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 41, column 56
    function value_2 () : java.lang.String {
      return policySearchCriteria.PolicyNumber
    }
    
    // 'value' attribute on DateInput (id=date_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 60, column 52
    function value_20 () : java.util.Date {
      return policySearchCriteria.LossDate
    }
    
    // 'value' attribute on CheckBoxInput (id=IncludeArchivedPolicies_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 66, column 92
    function value_25 () : java.lang.Boolean {
      return policySearchCriteria.IncludeArchived
    }
    
    // 'value' attribute on RowIterator at FNOLWizardFindPolicyPanelSet.Search.pcf: line 109, column 86
    function value_88 () : gw.api.database.IQueryBeanResult<entity.PolicySummary> {
      FindPolicyUtils.saveSearch(policySearchCriteria, PolicySummaryList); return Wizard.getPolicySummariesOrSelected(PolicySummaryList, FindPolicyUtils.SelectedPolicySummary)
    }
    
    // 'visible' attribute on CheckBoxInput (id=IncludeArchivedPolicies_Input) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 66, column 92
    function visible_24 () : java.lang.Boolean {
      return gw.api.system.CCConfigParameters.PolicySystemArchivingEnabled.Value
    }
    
    // 'visible' attribute on TypeKeyCell (id=Status_Cell) at FNOLWizardFindPolicyPanelSet.Search.pcf: line 186, column 34
    function visible_47 () : java.lang.Boolean {
      return  true
    }
    
    property get PolicySummaryList () : gw.api.database.IQueryBeanResult<PolicySummary> {
      return getResultsValue(1) as gw.api.database.IQueryBeanResult<PolicySummary>
    }
    
    property get policySearchCriteria () : entity.PolicySearchCriteria {
      return getCriteriaValue(1) as entity.PolicySearchCriteria
    }
    
    property set policySearchCriteria ($arg :  entity.PolicySearchCriteria) {
      setCriteriaValue(1, $arg)
    }
    
    
  }
  
  
}