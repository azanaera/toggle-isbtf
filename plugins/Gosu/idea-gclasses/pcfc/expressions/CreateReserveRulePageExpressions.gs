package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/bizrules/ReserveRules/CreateReserveRulePage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CreateReserveRulePageExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/bizrules/ReserveRules/CreateReserveRulePage.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CreateReserveRulePageExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    static function __constructorIndex (context :  gw.bizrules.CCRulesNavigationContext, title :  String, ruleToClone :  CCRule, token :  String) : int {
      return 1
    }
    
    static function __constructorIndex (context :  gw.bizrules.CCRulesNavigationContext, title :  String, token :  String) : int {
      return 0
    }
    
    // 'afterCancel' attribute on Page (id=CreateReserveRulePage) at CreateReserveRulePage.pcf: line 14, column 19
    function afterCancel_3 () : void {
      context.goToRulesListPage(typekey.Rule.TC_RESERVERULE)
    }
    
    // 'afterCommit' attribute on Page (id=CreateReserveRulePage) at CreateReserveRulePage.pcf: line 14, column 19
    function afterCommit_4 (TopLocation :  pcf.api.Location) : void {
      context.goToRulesListPage(typekey.Rule.TC_RESERVERULE)
    }
    
    // 'def' attribute on ScreenRef at CreateReserveRulePage.pcf: line 36, column 63
    function def_onEnter_1 (def :  pcf.CCRuleCreationScreen) : void {
      def.onEnter(context, ruleToClone, head)
    }
    
    // 'def' attribute on ScreenRef at CreateReserveRulePage.pcf: line 36, column 63
    function def_refreshVariables_2 (def :  pcf.CCRuleCreationScreen) : void {
      def.refreshVariables(context, ruleToClone, head)
    }
    
    // 'initialValue' attribute on Variable at CreateReserveRulePage.pcf: line 34, column 117
    function initialValue_0 () : RuleHead {
      return context.RuleFactory.createRuleHead(com.google.common.base.Optional.fromNullable(ruleToClone))
    }
    
    // 'parent' attribute on Page (id=CreateReserveRulePage) at CreateReserveRulePage.pcf: line 14, column 19
    static function parent_5 (context :  gw.bizrules.CCRulesNavigationContext, ruleToClone :  CCRule, title :  String, token :  String) : pcf.api.Destination {
      return pcf.ReserveRules.createDestination()
    }
    
    // 'title' attribute on Page (id=CreateReserveRulePage) at CreateReserveRulePage.pcf: line 14, column 19
    static function title_6 (context :  gw.bizrules.CCRulesNavigationContext, ruleToClone :  CCRule, title :  String, token :  String) : java.lang.Object {
      return title
    }
    
    override property get CurrentLocation () : pcf.CreateReserveRulePage {
      return super.CurrentLocation as pcf.CreateReserveRulePage
    }
    
    property get context () : gw.bizrules.CCRulesNavigationContext {
      return getVariableValue("context", 0) as gw.bizrules.CCRulesNavigationContext
    }
    
    property set context ($arg :  gw.bizrules.CCRulesNavigationContext) {
      setVariableValue("context", 0, $arg)
    }
    
    property get head () : RuleHead {
      return getVariableValue("head", 0) as RuleHead
    }
    
    property set head ($arg :  RuleHead) {
      setVariableValue("head", 0, $arg)
    }
    
    property get ruleToClone () : CCRule {
      return getVariableValue("ruleToClone", 0) as CCRule
    }
    
    property set ruleToClone ($arg :  CCRule) {
      setVariableValue("ruleToClone", 0, $arg)
    }
    
    property get title () : String {
      return getVariableValue("title", 0) as String
    }
    
    property set title ($arg :  String) {
      setVariableValue("title", 0, $arg)
    }
    
    property get token () : String {
      return getVariableValue("token", 0) as String
    }
    
    property set token ($arg :  String) {
      setVariableValue("token", 0, $arg)
    }
    
    
  }
  
  
}