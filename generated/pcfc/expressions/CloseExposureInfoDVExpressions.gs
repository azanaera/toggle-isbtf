package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/exposures/CloseExposureInfoDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CloseExposureInfoDVExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/exposures/CloseExposureInfoDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CloseExposureInfoDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextAreaInput (id=Note_Input) at CloseExposureInfoDV.pcf: line 18, column 41
    function defaultSetter_1 (__VALUE_TO_SET :  java.lang.Object) : void {
      CloseExposureInfo.note = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Outcome_Input) at CloseExposureInfoDV.pcf: line 25, column 56
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      CloseExposureInfo.outcome = (__VALUE_TO_SET as typekey.ExposureClosedOutcomeType)
    }
    
    // 'value' attribute on TextAreaInput (id=Note_Input) at CloseExposureInfoDV.pcf: line 18, column 41
    function valueRoot_2 () : java.lang.Object {
      return CloseExposureInfo
    }
    
    // 'value' attribute on TextAreaInput (id=Note_Input) at CloseExposureInfoDV.pcf: line 18, column 41
    function value_0 () : java.lang.String {
      return CloseExposureInfo.note
    }
    
    // 'value' attribute on TypeKeyInput (id=Outcome_Input) at CloseExposureInfoDV.pcf: line 25, column 56
    function value_4 () : typekey.ExposureClosedOutcomeType {
      return CloseExposureInfo.outcome
    }
    
    property get CloseExposureInfo () : CloseExposureInfo {
      return getRequireValue("CloseExposureInfo", 0) as CloseExposureInfo
    }
    
    property set CloseExposureInfo ($arg :  CloseExposureInfo) {
      setRequireValue("CloseExposureInfo", 0, $arg)
    }
    
    
  }
  
  
}