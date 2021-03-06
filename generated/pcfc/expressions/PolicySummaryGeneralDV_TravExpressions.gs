package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/policy/PolicySummaryGeneralDV.Trav.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PolicySummaryGeneralDV_TravExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/policy/PolicySummaryGeneralDV.Trav.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicySummaryGeneralDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=Insured_Input) at PolicySummaryGeneralDV.Trav.pcf: line 17, column 44
    function valueRoot_1 () : java.lang.Object {
      return PolicySummary
    }
    
    // 'value' attribute on TextInput (id=Insured_Input) at PolicySummaryGeneralDV.Trav.pcf: line 17, column 44
    function value_0 () : java.lang.String {
      return PolicySummary.InsuredName
    }
    
    // 'value' attribute on DateInput (id=ExpirationDate_Input) at PolicySummaryGeneralDV.Trav.pcf: line 34, column 47
    function value_12 () : java.util.Date {
      return PolicySummary.ExpirationDate
    }
    
    // 'value' attribute on TypeKeyInput (id=Status_Input) at PolicySummaryGeneralDV.Trav.pcf: line 39, column 43
    function value_15 () : typekey.PolicyStatus {
      return PolicySummary.Status
    }
    
    // 'value' attribute on TextInput (id=PolicyNumber_Input) at PolicySummaryGeneralDV.Trav.pcf: line 21, column 45
    function value_3 () : java.lang.String {
      return PolicySummary.PolicyNumber
    }
    
    // 'value' attribute on TypeKeyInput (id=Type_Input) at PolicySummaryGeneralDV.Trav.pcf: line 26, column 41
    function value_6 () : typekey.PolicyType {
      return PolicySummary.PolicyType
    }
    
    // 'value' attribute on DateInput (id=EffectiveDate_Input) at PolicySummaryGeneralDV.Trav.pcf: line 30, column 46
    function value_9 () : java.util.Date {
      return PolicySummary.EffectiveDate
    }
    
    property get PolicySummary () : PolicySummary {
      return getRequireValue("PolicySummary", 0) as PolicySummary
    }
    
    property set PolicySummary ($arg :  PolicySummary) {
      setRequireValue("PolicySummary", 0, $arg)
    }
    
    
  }
  
  
}