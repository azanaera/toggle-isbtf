package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class FNOLWizard_BasicInfoPolicyPanelSet_HomeownersExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FNOLWizard_BasicInfoPolicyPanelSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'initialValue' attribute on Variable at FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf: line 17, column 41
    function initialValue_0 () : entity.PropertyCoverage[] {
      return claim.Policy.getOrderedPrimaryLocationCoverages({wizard.HomeownersHelper.DwellingCoverageType, wizard.HomeownersHelper.OtherStructuresCoverageType, wizard.HomeownersHelper.PersonalPropertyCoverageType, wizard.HomeownersHelper.LossOfUseCoverageType, wizard.HomeownersHelper.PersonalLiabilityCoverageType})
    }
    
    // 'initialValue' attribute on Variable at FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf: line 21, column 36
    function initialValue_1 () : entity.Endorsement[] {
      return claim.Policy.Endorsements.sortBy(\ e -> e.FormNumber)
    }
    
    // 'value' attribute on TextInput (id=PropertyAddress_Input) at FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf: line 32, column 71
    function valueRoot_3 () : java.lang.Object {
      return claim.Policy.PrimaryLocation.Address
    }
    
    // 'value' attribute on InputIterator at FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf: line 45, column 44
    function value_11 () : entity.Endorsement[] {
      return endorsements
    }
    
    // 'value' attribute on TextInput (id=PropertyAddress_Input) at FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf: line 32, column 71
    function value_2 () : java.lang.String {
      return claim.Policy.PrimaryLocation.Address.DisplayName
    }
    
    // 'visible' attribute on DetailViewPanel (id=endorsementDV) at FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf: line 38, column 39
    function visible_12 () : java.lang.Boolean {
      return !endorsements.IsEmpty
    }
    
    // 'visible' attribute on InputSet (id=AddressInputSet) at FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf: line 26, column 58
    function visible_5 () : java.lang.Boolean {
      return claim.Policy.PrimaryLocation != null
    }
    
    property get claim () : Claim {
      return getRequireValue("claim", 0) as Claim
    }
    
    property set claim ($arg :  Claim) {
      setRequireValue("claim", 0, $arg)
    }
    
    property get coverages () : entity.PropertyCoverage[] {
      return getVariableValue("coverages", 0) as entity.PropertyCoverage[]
    }
    
    property set coverages ($arg :  entity.PropertyCoverage[]) {
      setVariableValue("coverages", 0, $arg)
    }
    
    property get endorsements () : entity.Endorsement[] {
      return getVariableValue("endorsements", 0) as entity.Endorsement[]
    }
    
    property set endorsements ($arg :  entity.Endorsement[]) {
      setVariableValue("endorsements", 0, $arg)
    }
    
    property get wizard () : gw.api.claim.NewClaimWizardInfo {
      return getRequireValue("wizard", 0) as gw.api.claim.NewClaimWizardInfo
    }
    
    property set wizard ($arg :  gw.api.claim.NewClaimWizardInfo) {
      setRequireValue("wizard", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends FNOLWizard_BasicInfoPolicyPanelSetExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'label' attribute on TextInput (id=endorsement_Input) at FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf: line 49, column 46
    function label_6 () : java.lang.Object {
      return endorsement.FormNumber
    }
    
    // 'value' attribute on TextInput (id=endorsement_Input) at FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf: line 49, column 46
    function valueRoot_8 () : java.lang.Object {
      return endorsement
    }
    
    // 'value' attribute on TextInput (id=endorsement_Input) at FNOLWizard_BasicInfoPolicyPanelSet.Homeowners.pcf: line 49, column 46
    function value_7 () : java.lang.String {
      return endorsement.Description
    }
    
    property get endorsement () : entity.Endorsement {
      return getIteratedValue(1) as entity.Endorsement
    }
    
    
  }
  
  
}