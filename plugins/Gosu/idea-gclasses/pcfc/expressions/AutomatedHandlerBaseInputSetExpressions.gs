package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/admin/specialhandling/AutomatedHandlerBaseInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AutomatedHandlerBaseInputSetExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/admin/specialhandling/AutomatedHandlerBaseInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AutomatedHandlerBaseInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TypeKeyInput (id=AutomatedHandlerPolicyType_Input) at AutomatedHandlerBaseInputSet.pcf: line 23, column 39
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      automatedHandler.PolicyType = (__VALUE_TO_SET as typekey.PolicyType)
    }
    
    // 'outputConversion' attribute on TextInput (id=AutomatedHandlerPolicyTypeReadOnly_Input) at AutomatedHandlerBaseInputSet.pcf: line 32, column 39
    function outputConversion_6 (VALUE :  typekey.PolicyType) : java.lang.String {
      if (null == VALUE) {return DisplayKey.get("Web.Admin.AutomatedHandlerBase.AllPolicyTypes")} else {return VALUE.DisplayName}
    }
    
    // 'value' attribute on TypeKeyInput (id=AutomatedHandlerPolicyType_Input) at AutomatedHandlerBaseInputSet.pcf: line 23, column 39
    function valueRoot_4 () : java.lang.Object {
      return automatedHandler
    }
    
    // 'value' attribute on TextInput (id=AutomatedHandlerType_Input) at AutomatedHandlerBaseInputSet.pcf: line 14, column 108
    function value_0 () : java.lang.String {
      return gw.api.specialhandling.SpecialHandlingHelper.getAutomatedHandlerTypeLabel(automatedHandler)
    }
    
    // 'value' attribute on TypeKeyInput (id=AutomatedHandlerPolicyType_Input) at AutomatedHandlerBaseInputSet.pcf: line 23, column 39
    function value_2 () : typekey.PolicyType {
      return automatedHandler.PolicyType
    }
    
    property get automatedHandler () : AutomatedHandler {
      return getRequireValue("automatedHandler", 0) as AutomatedHandler
    }
    
    property set automatedHandler ($arg :  AutomatedHandler) {
      setRequireValue("automatedHandler", 0, $arg)
    }
    
    
  }
  
  
}