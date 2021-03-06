package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/exposures/WageBenefitsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class WageBenefitsDVExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/exposures/WageBenefitsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WageBenefitsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at WageBenefitsDV.pcf: line 12, column 48
    function def_onEnter_0 (def :  pcf.PIPEmploymentInputSet) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at WageBenefitsDV.pcf: line 41, column 57
    function def_onEnter_20 (def :  pcf.PIPWorkersCompensationInputSet) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at WageBenefitsDV.pcf: line 44, column 48
    function def_onEnter_22 (def :  pcf.PIPSSBenefitsInputSet) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at WageBenefitsDV.pcf: line 47, column 50
    function def_onEnter_24 (def :  pcf.PIPWageBenefitsInputSet) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at WageBenefitsDV.pcf: line 12, column 48
    function def_refreshVariables_1 (def :  pcf.PIPEmploymentInputSet) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at WageBenefitsDV.pcf: line 41, column 57
    function def_refreshVariables_21 (def :  pcf.PIPWorkersCompensationInputSet) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at WageBenefitsDV.pcf: line 44, column 48
    function def_refreshVariables_23 (def :  pcf.PIPSSBenefitsInputSet) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at WageBenefitsDV.pcf: line 47, column 50
    function def_refreshVariables_25 (def :  pcf.PIPWageBenefitsInputSet) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'value' attribute on CurrencyInput (id=CompBenefits_WeeklyCompRate_Input) at WageBenefitsDV.pcf: line 32, column 55
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.CompBenefits.WeeklyCompRate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TypeKeyInput (id=CompBenefits_PaymentFrequency_Input) at WageBenefitsDV.pcf: line 38, column 51
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.CompBenefits.PaymentFrequency = (__VALUE_TO_SET as typekey.PaymentFrequencyType)
    }
    
    // 'value' attribute on DateInput (id=CompBenefits_BenefitsBeginDate_Input) at WageBenefitsDV.pcf: line 21, column 58
    function defaultSetter_3 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.CompBenefits.BenefitsBeginDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on DateInput (id=CompBenefits_BenefitsEndDate_Input) at WageBenefitsDV.pcf: line 27, column 56
    function defaultSetter_8 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.CompBenefits.BenefitsEndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'validationExpression' attribute on DateInput (id=CompBenefits_BenefitsEndDate_Input) at WageBenefitsDV.pcf: line 27, column 56
    function validationExpression_6 () : java.lang.Object {
      return !(Exposure.CompBenefits.BenefitsBeginDate > Exposure.CompBenefits.BenefitsEndDate) ? null : DisplayKey.get("JSP.PIPDetail.PIP.Date.ValidationError")
    }
    
    // 'value' attribute on DateInput (id=CompBenefits_BenefitsBeginDate_Input) at WageBenefitsDV.pcf: line 21, column 58
    function valueRoot_4 () : java.lang.Object {
      return Exposure.CompBenefits
    }
    
    // 'value' attribute on CurrencyInput (id=CompBenefits_WeeklyCompRate_Input) at WageBenefitsDV.pcf: line 32, column 55
    function value_12 () : gw.api.financials.CurrencyAmount {
      return Exposure.CompBenefits.WeeklyCompRate
    }
    
    // 'value' attribute on TypeKeyInput (id=CompBenefits_PaymentFrequency_Input) at WageBenefitsDV.pcf: line 38, column 51
    function value_16 () : typekey.PaymentFrequencyType {
      return Exposure.CompBenefits.PaymentFrequency
    }
    
    // 'value' attribute on DateInput (id=CompBenefits_BenefitsBeginDate_Input) at WageBenefitsDV.pcf: line 21, column 58
    function value_2 () : java.util.Date {
      return Exposure.CompBenefits.BenefitsBeginDate
    }
    
    // 'value' attribute on DateInput (id=CompBenefits_BenefitsEndDate_Input) at WageBenefitsDV.pcf: line 27, column 56
    function value_7 () : java.util.Date {
      return Exposure.CompBenefits.BenefitsEndDate
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  
}