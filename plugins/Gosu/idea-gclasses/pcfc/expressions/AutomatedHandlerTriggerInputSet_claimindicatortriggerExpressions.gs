package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/admin/specialhandling/AutomatedHandlerTriggerInputSet.claimindicatortrigger.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AutomatedHandlerTriggerInputSet_claimindicatortriggerExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/admin/specialhandling/AutomatedHandlerTriggerInputSet.claimindicatortrigger.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AutomatedHandlerTriggerInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on RangeInput (id=AutomatedHandlerClaimIndicator_Input) at AutomatedHandlerTriggerInputSet.claimindicatortrigger.pcf: line 23, column 43
    function defaultSetter_2 (__VALUE_TO_SET :  java.lang.Object) : void {
      trigger.ClaimIndicator = (__VALUE_TO_SET as typekey.ClaimIndicator)
    }
    
    // 'value' attribute on BooleanRadioInput (id=AutomatedHandlerClaimIndicatorTriggeringValue_Input) at AutomatedHandlerTriggerInputSet.claimindicatortrigger.pcf: line 33, column 40
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      trigger.TriggeringValue = (__VALUE_TO_SET as java.lang.Boolean)
    }
    
    // 'initialValue' attribute on Variable at AutomatedHandlerTriggerInputSet.claimindicatortrigger.pcf: line 14, column 37
    function initialValue_0 () : ClaimIndicatorTrigger {
      return automatedHandler.Trigger as ClaimIndicatorTrigger
    }
    
    // 'valueRange' attribute on RangeInput (id=AutomatedHandlerClaimIndicator_Input) at AutomatedHandlerTriggerInputSet.claimindicatortrigger.pcf: line 23, column 43
    function valueRange_4 () : java.lang.Object {
      return getClaimIndicatorOptions()
    }
    
    // 'value' attribute on RangeInput (id=AutomatedHandlerClaimIndicator_Input) at AutomatedHandlerTriggerInputSet.claimindicatortrigger.pcf: line 23, column 43
    function valueRoot_3 () : java.lang.Object {
      return trigger
    }
    
    // 'value' attribute on RangeInput (id=AutomatedHandlerClaimIndicator_Input) at AutomatedHandlerTriggerInputSet.claimindicatortrigger.pcf: line 23, column 43
    function value_1 () : typekey.ClaimIndicator {
      return trigger.ClaimIndicator
    }
    
    // 'value' attribute on BooleanRadioInput (id=AutomatedHandlerClaimIndicatorTriggeringValue_Input) at AutomatedHandlerTriggerInputSet.claimindicatortrigger.pcf: line 33, column 40
    function value_8 () : java.lang.Boolean {
      return trigger.TriggeringValue
    }
    
    // 'valueRange' attribute on RangeInput (id=AutomatedHandlerClaimIndicator_Input) at AutomatedHandlerTriggerInputSet.claimindicatortrigger.pcf: line 23, column 43
    function verifyValueRangeIsAllowedType_5 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=AutomatedHandlerClaimIndicator_Input) at AutomatedHandlerTriggerInputSet.claimindicatortrigger.pcf: line 23, column 43
    function verifyValueRangeIsAllowedType_5 ($$arg :  typekey.ClaimIndicator[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on RangeInput (id=AutomatedHandlerClaimIndicator_Input) at AutomatedHandlerTriggerInputSet.claimindicatortrigger.pcf: line 23, column 43
    function verifyValueRange_6 () : void {
      var __valueRangeArg = getClaimIndicatorOptions()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_5(__valueRangeArg)
    }
    
    property get automatedHandler () : AutomatedHandler {
      return getRequireValue("automatedHandler", 0) as AutomatedHandler
    }
    
    property set automatedHandler ($arg :  AutomatedHandler) {
      setRequireValue("automatedHandler", 0, $arg)
    }
    
    property get trigger () : ClaimIndicatorTrigger {
      return getVariableValue("trigger", 0) as ClaimIndicatorTrigger
    }
    
    property set trigger ($arg :  ClaimIndicatorTrigger) {
      setVariableValue("trigger", 0, $arg)
    }
    
    function getClaimIndicatorOptions() : typekey.ClaimIndicator[] {
      var baseSet = typekey.ClaimIndicator.getTypeKeys(false).disjunction({typekey.ClaimIndicator.TC_CLAIMINDICATOR})
      return baseSet.toArray(new typekey.ClaimIndicator[baseSet.Count]).sortBy(\ c -> c.DisplayName)
    }
    
    
  }
  
  
}