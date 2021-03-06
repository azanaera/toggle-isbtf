package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class SubrogationDetailExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntry2ExpressionsImpl extends SubrogationDetailExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Party_Cell) at SubrogationDetail.pcf: line 181, column 49
    function action_107 () : void {
      SubroAdversePartyDetail.go(party.SubroAdverseParty)
    }
    
    // 'action' attribute on TextCell (id=Party_Cell) at SubrogationDetail.pcf: line 181, column 49
    function action_dest_108 () : pcf.api.Destination {
      return pcf.SubroAdversePartyDetail.createDestination(party.SubroAdverseParty)
    }
    
    // 'value' attribute on TextCell (id=LiabilityPercentage_Cell) at SubrogationDetail.pcf: line 193, column 39
    function defaultSetter_113 (__VALUE_TO_SET :  java.lang.Object) : void {
      party.Fault = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextCell (id=ExpectedRecoveryPercentage_Cell) at SubrogationDetail.pcf: line 203, column 39
    function defaultSetter_117 (__VALUE_TO_SET :  java.lang.Object) : void {
      party.ExpectedRecovery = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on TextCell (id=Party_Cell) at SubrogationDetail.pcf: line 181, column 49
    function valueRoot_110 () : java.lang.Object {
      return party.SubroAdverseParty
    }
    
    // 'value' attribute on TextCell (id=LiabilityPercentage_Cell) at SubrogationDetail.pcf: line 193, column 39
    function valueRoot_114 () : java.lang.Object {
      return party
    }
    
    // 'value' attribute on TextCell (id=Party_Cell) at SubrogationDetail.pcf: line 181, column 49
    function value_109 () : entity.Contact {
      return party.SubroAdverseParty.AdverseParty
    }
    
    // 'value' attribute on TextCell (id=LiabilityPercentage_Cell) at SubrogationDetail.pcf: line 193, column 39
    function value_112 () : java.math.BigDecimal {
      return party.Fault
    }
    
    // 'value' attribute on TextCell (id=ExpectedRecoveryPercentage_Cell) at SubrogationDetail.pcf: line 203, column 39
    function value_116 () : java.math.BigDecimal {
      return party.ExpectedRecovery
    }
    
    // 'value' attribute on CurrencyCell (id=ExpectedRecoveryAmount_Cell) at SubrogationDetail.pcf: line 209, column 105
    function value_120 () : gw.api.financials.CurrencyAmount {
      return cache.getExpectedRecoveryAmount(party.SubroAdverseParty)
    }
    
    // 'value' attribute on CurrencyCell (id=Recovered_Cell) at SubrogationDetail.pcf: line 215, column 105
    function value_123 () : gw.api.financials.CurrencyAmount {
      return cache.getRecovered(party.SubroAdverseParty)
    }
    
    // 'value' attribute on CurrencyCell (id=Pending_Cell) at SubrogationDetail.pcf: line 221, column 105
    function value_126 () : gw.api.financials.CurrencyAmount {
      return cache.getPending(party.SubroAdverseParty)
    }
    
    // 'visible' attribute on CurrencyCell (id=ExpectedRecoveryAmount_Cell) at SubrogationDetail.pcf: line 209, column 105
    function visible_121 () : java.lang.Boolean {
      return gw.api.print.PrintUtil.isPrintingPDF() or not CurrentLocation.InEditMode
    }
    
    property get party () : SubroAdversePartyOverride {
      return getIteratedValue(1) as SubroAdversePartyOverride
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends SubrogationDetailExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Party_Cell) at SubrogationDetail.pcf: line 113, column 49
    function action_66 () : void {
      SubroAdversePartyDetail.drilldown(party)
    }
    
    // 'action' attribute on TextCell (id=Party_Cell) at SubrogationDetail.pcf: line 113, column 49
    function action_dest_67 () : pcf.api.Destination {
      return pcf.SubroAdversePartyDetail.createDestination(party)
    }
    
    // 'value' attribute on TextCell (id=Party_Cell) at SubrogationDetail.pcf: line 113, column 49
    function valueRoot_69 () : java.lang.Object {
      return party
    }
    
    // 'value' attribute on TextCell (id=Party_Cell) at SubrogationDetail.pcf: line 113, column 49
    function value_68 () : entity.Contact {
      return party.AdverseParty
    }
    
    // 'value' attribute on TextCell (id=LiabilityPercentage_Cell) at SubrogationDetail.pcf: line 125, column 39
    function value_71 () : java.math.BigDecimal {
      return party.Fault
    }
    
    // 'value' attribute on TextCell (id=ExpectedRecoveryPercentage_Cell) at SubrogationDetail.pcf: line 135, column 39
    function value_74 () : java.math.BigDecimal {
      return party.ExpectedRecovery
    }
    
    // 'value' attribute on CurrencyCell (id=ExpectedRecoveryAmount_Cell) at SubrogationDetail.pcf: line 141, column 105
    function value_77 () : gw.api.financials.CurrencyAmount {
      return cache.getExpectedRecoveryAmount(party)
    }
    
    // 'value' attribute on CurrencyCell (id=Recovered_Cell) at SubrogationDetail.pcf: line 147, column 105
    function value_80 () : gw.api.financials.CurrencyAmount {
      return cache.getRecovered(party)
    }
    
    // 'value' attribute on CurrencyCell (id=Pending_Cell) at SubrogationDetail.pcf: line 153, column 105
    function value_83 () : gw.api.financials.CurrencyAmount {
      return cache.getPending(party)
    }
    
    // 'visible' attribute on CurrencyCell (id=ExpectedRecoveryAmount_Cell) at SubrogationDetail.pcf: line 141, column 105
    function visible_78 () : java.lang.Boolean {
      return gw.api.print.PrintUtil.isPrintingPDF() or not CurrentLocation.InEditMode
    }
    
    property get party () : SubroAdverseParty {
      return getIteratedValue(1) as SubroAdverseParty
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/subrogation/General/SubrogationDetail.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SubrogationDetailExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (subrogation :  Subrogation) : int {
      return 0
    }
    
    // 'action' attribute on ToolbarButton (id=AssignSubrogation) at SubrogationDetail.pcf: line 34, column 146
    function action_5 () : void {
      AssignSubrogationPopup.push(new gw.api.subrogation.SubrogationAssignmentPopup({subrogation}))
    }
    
    // 'action' attribute on ToolbarButton (id=AssignSubrogation) at SubrogationDetail.pcf: line 34, column 146
    function action_dest_6 () : pcf.api.Destination {
      return pcf.AssignSubrogationPopup.createDestination(new gw.api.subrogation.SubrogationAssignmentPopup({subrogation}))
    }
    
    // 'available' attribute on ToolbarButton (id=AssignSubrogation) at SubrogationDetail.pcf: line 34, column 146
    function available_3 () : java.lang.Boolean {
      return perm.System.editsubrodetails
    }
    
    // 'available' attribute on CheckBoxInput (id=CustomizeLiability_Input) at SubrogationDetail.pcf: line 87, column 86
    function available_39 () : java.lang.Boolean {
      return subrogation.Status != TC_CLOSED
    }
    
    // 'value' attribute on TypeKeyInput (id=Status_Input) at SubrogationDetail.pcf: line 52, column 51
    function defaultSetter_12 (__VALUE_TO_SET :  java.lang.Object) : void {
      subrogation.Status = (__VALUE_TO_SET as typekey.SubrogationStatus)
    }
    
    // 'value' attribute on TextInput (id=CloseComment_Input) at SubrogationDetail.pcf: line 66, column 40
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      subrogation.CloseComment = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Outcome_Input) at SubrogationDetail.pcf: line 74, column 40
    function defaultSetter_31 (__VALUE_TO_SET :  java.lang.Object) : void {
      subrogation.Outcome = (__VALUE_TO_SET as typekey.SubroClosedOutcome)
    }
    
    // 'value' attribute on CheckBoxInput (id=CustomizeLiability_Input) at SubrogationDetail.pcf: line 87, column 86
    function defaultSetter_42 (__VALUE_TO_SET :  java.lang.Object) : void {
      subrogation.CustomizedLiability = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'editable' attribute on TextInput (id=CloseComment_Input) at SubrogationDetail.pcf: line 66, column 40
    function editable_20 () : java.lang.Boolean {
      return subrogation.isFieldChanged(entity.Subrogation#Status)
    }
    
    // 'initialValue' attribute on Variable at SubrogationDetail.pcf: line 20, column 23
    function initialValue_0 () : boolean {
      return subrogation.Status == TC_CLOSED
    }
    
    // 'initialValue' attribute on Variable at SubrogationDetail.pcf: line 25, column 64
    function initialValue_1 () : gw.subrogation.financials.SubrogationAmountCache {
      return new gw.subrogation.financials.SubrogationAmountCache(subrogation)
    }
    
    // EditButtons at SubrogationDetail.pcf: line 28, column 23
    function label_2 () : java.lang.Object {
      return gw.api.util.LocationUtil.hasOwnBundle(CurrentLocation) ? DisplayKey.get("Button.Update") : DisplayKey.get("Button.OK")
    }
    
    // 'parent' attribute on Page (id=SubrogationDetail) at SubrogationDetail.pcf: line 10, column 37
    static function parent_133 (subrogation :  Subrogation) : pcf.api.Destination {
      return pcf.SubrogationGeneral.createDestination(subrogation.SubrogationSummary.Claim)
    }
    
    // 'value' attribute on TextCell (id=Party_Cell) at SubrogationDetail.pcf: line 113, column 49
    function sortValue_47 (party :  SubroAdverseParty) : java.lang.Object {
      return party.AdverseParty
    }
    
    // 'value' attribute on TextCell (id=LiabilityPercentage_Cell) at SubrogationDetail.pcf: line 125, column 39
    function sortValue_48 (party :  SubroAdverseParty) : java.lang.Object {
      return party.Fault
    }
    
    // 'value' attribute on TextCell (id=ExpectedRecoveryPercentage_Cell) at SubrogationDetail.pcf: line 135, column 39
    function sortValue_49 (party :  SubroAdverseParty) : java.lang.Object {
      return party.ExpectedRecovery
    }
    
    // 'value' attribute on CurrencyCell (id=ExpectedRecoveryAmount_Cell) at SubrogationDetail.pcf: line 141, column 105
    function sortValue_50 (party :  SubroAdverseParty) : java.lang.Object {
      return cache.getExpectedRecoveryAmount(party)
    }
    
    // 'value' attribute on CurrencyCell (id=Recovered_Cell) at SubrogationDetail.pcf: line 147, column 105
    function sortValue_52 (party :  SubroAdverseParty) : java.lang.Object {
      return cache.getRecovered(party)
    }
    
    // 'value' attribute on CurrencyCell (id=Pending_Cell) at SubrogationDetail.pcf: line 153, column 105
    function sortValue_54 (party :  SubroAdverseParty) : java.lang.Object {
      return cache.getPending(party)
    }
    
    // 'value' attribute on TextCell (id=Party_Cell) at SubrogationDetail.pcf: line 181, column 49
    function sortValue_88 (party :  SubroAdversePartyOverride) : java.lang.Object {
      return party.SubroAdverseParty.AdverseParty
    }
    
    // 'value' attribute on TextCell (id=LiabilityPercentage_Cell) at SubrogationDetail.pcf: line 193, column 39
    function sortValue_89 (party :  SubroAdversePartyOverride) : java.lang.Object {
      return party.Fault
    }
    
    // 'value' attribute on TextCell (id=ExpectedRecoveryPercentage_Cell) at SubrogationDetail.pcf: line 203, column 39
    function sortValue_90 (party :  SubroAdversePartyOverride) : java.lang.Object {
      return party.ExpectedRecovery
    }
    
    // 'value' attribute on CurrencyCell (id=ExpectedRecoveryAmount_Cell) at SubrogationDetail.pcf: line 209, column 105
    function sortValue_91 (party :  SubroAdversePartyOverride) : java.lang.Object {
      return cache.getExpectedRecoveryAmount(party.SubroAdverseParty)
    }
    
    // 'value' attribute on CurrencyCell (id=Recovered_Cell) at SubrogationDetail.pcf: line 215, column 105
    function sortValue_93 (party :  SubroAdversePartyOverride) : java.lang.Object {
      return cache.getRecovered(party.SubroAdverseParty)
    }
    
    // 'value' attribute on CurrencyCell (id=Pending_Cell) at SubrogationDetail.pcf: line 221, column 105
    function sortValue_95 (party :  SubroAdversePartyOverride) : java.lang.Object {
      return cache.getPending(party.SubroAdverseParty)
    }
    
    // '$$sumValue' attribute on RowIterator (id=Parties) at SubrogationDetail.pcf: line 125, column 39
    function sumValueRoot_57 (party :  SubroAdverseParty) : java.lang.Object {
      return party
    }
    
    // '$$sumValue' attribute on RowIterator (id=PartyOverrides) at SubrogationDetail.pcf: line 193, column 39
    function sumValueRoot_98 (party :  SubroAdversePartyOverride) : java.lang.Object {
      return party
    }
    
    // 'footerSumValue' attribute on RowIterator (id=PartyOverrides) at SubrogationDetail.pcf: line 209, column 105
    function sumValue_101 (party :  SubroAdversePartyOverride) : java.lang.Object {
      return cache.getExpectedRecoveryAmount(party.SubroAdverseParty)
    }
    
    // 'footerSumValue' attribute on RowIterator (id=PartyOverrides) at SubrogationDetail.pcf: line 215, column 105
    function sumValue_103 (party :  SubroAdversePartyOverride) : java.lang.Object {
      return cache.getRecovered(party.SubroAdverseParty)
    }
    
    // 'footerSumValue' attribute on RowIterator (id=PartyOverrides) at SubrogationDetail.pcf: line 221, column 105
    function sumValue_105 (party :  SubroAdversePartyOverride) : java.lang.Object {
      return cache.getPending(party.SubroAdverseParty)
    }
    
    // 'footerSumValue' attribute on RowIterator (id=Parties) at SubrogationDetail.pcf: line 125, column 39
    function sumValue_56 (party :  SubroAdverseParty) : java.lang.Object {
      return party.Fault
    }
    
    // 'footerSumValue' attribute on RowIterator (id=Parties) at SubrogationDetail.pcf: line 135, column 39
    function sumValue_58 (party :  SubroAdverseParty) : java.lang.Object {
      return party.ExpectedRecovery
    }
    
    // 'footerSumValue' attribute on RowIterator (id=Parties) at SubrogationDetail.pcf: line 141, column 105
    function sumValue_60 (party :  SubroAdverseParty) : java.lang.Object {
      return cache.getExpectedRecoveryAmount(party)
    }
    
    // 'footerSumValue' attribute on RowIterator (id=Parties) at SubrogationDetail.pcf: line 147, column 105
    function sumValue_62 (party :  SubroAdverseParty) : java.lang.Object {
      return cache.getRecovered(party)
    }
    
    // 'footerSumValue' attribute on RowIterator (id=Parties) at SubrogationDetail.pcf: line 153, column 105
    function sumValue_64 (party :  SubroAdverseParty) : java.lang.Object {
      return cache.getPending(party)
    }
    
    // 'footerSumValue' attribute on RowIterator (id=PartyOverrides) at SubrogationDetail.pcf: line 193, column 39
    function sumValue_97 (party :  SubroAdversePartyOverride) : java.lang.Object {
      return party.Fault
    }
    
    // 'footerSumValue' attribute on RowIterator (id=PartyOverrides) at SubrogationDetail.pcf: line 203, column 39
    function sumValue_99 (party :  SubroAdversePartyOverride) : java.lang.Object {
      return party.ExpectedRecovery
    }
    
    // 'title' attribute on Page (id=SubrogationDetail) at SubrogationDetail.pcf: line 10, column 37
    static function title_134 (subrogation :  Subrogation) : java.lang.Object {
      return subrogation.DisplayName
    }
    
    // 'value' attribute on TypeKeyInput (id=Status_Input) at SubrogationDetail.pcf: line 52, column 51
    function valueRoot_13 () : java.lang.Object {
      return subrogation
    }
    
    // 'value' attribute on TextInput (id=Exposure_Input) at SubrogationDetail.pcf: line 46, column 55
    function valueRoot_9 () : java.lang.Object {
      return subrogation.Exposure
    }
    
    // 'value' attribute on TypeKeyInput (id=Status_Input) at SubrogationDetail.pcf: line 52, column 51
    function value_11 () : typekey.SubrogationStatus {
      return subrogation.Status
    }
    
    // 'value' attribute on RowIterator (id=PartyOverrides) at SubrogationDetail.pcf: line 173, column 64
    function value_129 () : entity.SubroAdversePartyOverride[] {
      return subrogation.OverridesForAllParties
    }
    
    // 'value' attribute on DateInput (id=CloseDate_Input) at SubrogationDetail.pcf: line 60, column 40
    function value_16 () : java.util.Date {
      return subrogation.CloseDate
    }
    
    // 'value' attribute on TextInput (id=CloseComment_Input) at SubrogationDetail.pcf: line 66, column 40
    function value_22 () : java.lang.String {
      return subrogation.CloseComment
    }
    
    // 'value' attribute on TypeKeyInput (id=Outcome_Input) at SubrogationDetail.pcf: line 74, column 40
    function value_30 () : typekey.SubroClosedOutcome {
      return subrogation.Outcome
    }
    
    // 'value' attribute on TextInput (id=Owner_Input) at SubrogationDetail.pcf: line 79, column 38
    function value_36 () : entity.User {
      return subrogation.AssignedUser
    }
    
    // 'value' attribute on TextInput (id=Exposure_Input) at SubrogationDetail.pcf: line 46, column 55
    function value_8 () : java.lang.String {
      return subrogation.Exposure.DisplayName
    }
    
    // 'value' attribute on RowIterator (id=Parties) at SubrogationDetail.pcf: line 105, column 56
    function value_86 () : entity.SubroAdverseParty[] {
      return subrogation.SubrogationSummary.SubroAdverseParties
    }
    
    // 'visible' attribute on DateInput (id=CloseDate_Input) at SubrogationDetail.pcf: line 60, column 40
    function visible_15 () : java.lang.Boolean {
      return showCloseFields
    }
    
    // 'visible' attribute on ToolbarButton (id=AssignSubrogation) at SubrogationDetail.pcf: line 34, column 146
    function visible_4 () : java.lang.Boolean {
      return (gw.api.print.PrintUtil.isPrintingPDF() or not CurrentLocation.InEditMode) and subrogation.SubrogationSummary.EscalateSubro
    }
    
    // 'visible' attribute on CheckBoxInput (id=CustomizeLiability_Input) at SubrogationDetail.pcf: line 87, column 86
    function visible_40 () : java.lang.Boolean {
      return not subrogation.SubrogationSummary.SubroAdverseParties.IsEmpty
    }
    
    // 'visible' attribute on CurrencyCell (id=ExpectedRecoveryAmount_Cell) at SubrogationDetail.pcf: line 141, column 105
    function visible_51 () : java.lang.Boolean {
      return gw.api.print.PrintUtil.isPrintingPDF() or not CurrentLocation.InEditMode
    }
    
    // 'visible' attribute on AlertBar (id=CustomizeLiabilityAlert) at SubrogationDetail.pcf: line 40, column 52
    function visible_7 () : java.lang.Boolean {
      return subrogation.CustomizedLiability
    }
    
    // 'visible' attribute on ListViewInput (id=ResponsibleParties) at SubrogationDetail.pcf: line 96, column 59
    function visible_87 () : java.lang.Boolean {
      return not subrogation.CustomizedLiability
    }
    
    override property get CurrentLocation () : pcf.SubrogationDetail {
      return super.CurrentLocation as pcf.SubrogationDetail
    }
    
    property get cache () : gw.subrogation.financials.SubrogationAmountCache {
      return getVariableValue("cache", 0) as gw.subrogation.financials.SubrogationAmountCache
    }
    
    property set cache ($arg :  gw.subrogation.financials.SubrogationAmountCache) {
      setVariableValue("cache", 0, $arg)
    }
    
    property get showCloseFields () : boolean {
      return getVariableValue("showCloseFields", 0) as java.lang.Boolean
    }
    
    property set showCloseFields ($arg :  boolean) {
      setVariableValue("showCloseFields", 0, $arg)
    }
    
    property get subrogation () : Subrogation {
      return getVariableValue("subrogation", 0) as Subrogation
    }
    
    property set subrogation ($arg :  Subrogation) {
      setVariableValue("subrogation", 0, $arg)
    }
    
    
  }
  
  
}