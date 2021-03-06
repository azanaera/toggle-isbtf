package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/FNOL/NewClaimWageBenefitsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class NewClaimWageBenefitsDVExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/FNOL/NewClaimWageBenefitsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWageBenefitsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at NewClaimWageBenefitsDV.pcf: line 36, column 48
    function def_onEnter_18 (def :  pcf.PIPEmploymentInputSet) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at NewClaimWageBenefitsDV.pcf: line 40, column 57
    function def_onEnter_20 (def :  pcf.PIPWorkersCompensationInputSet) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at NewClaimWageBenefitsDV.pcf: line 42, column 48
    function def_onEnter_22 (def :  pcf.PIPSSBenefitsInputSet) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at NewClaimWageBenefitsDV.pcf: line 45, column 50
    function def_onEnter_24 (def :  pcf.PIPWageBenefitsInputSet) : void {
      def.onEnter(Exposure)
    }
    
    // 'def' attribute on InputSetRef at NewClaimWageBenefitsDV.pcf: line 36, column 48
    function def_refreshVariables_19 (def :  pcf.PIPEmploymentInputSet) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at NewClaimWageBenefitsDV.pcf: line 40, column 57
    function def_refreshVariables_21 (def :  pcf.PIPWorkersCompensationInputSet) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at NewClaimWageBenefitsDV.pcf: line 42, column 48
    function def_refreshVariables_23 (def :  pcf.PIPSSBenefitsInputSet) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'def' attribute on InputSetRef at NewClaimWageBenefitsDV.pcf: line 45, column 50
    function def_refreshVariables_25 (def :  pcf.PIPWageBenefitsInputSet) : void {
      def.refreshVariables(Exposure)
    }
    
    // 'value' attribute on DateInput (id=CompBenefits_BenefitsBeginDate_Input) at NewClaimWageBenefitsDV.pcf: line 17, column 58
    function defaultSetter_1 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.CompBenefits.BenefitsBeginDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on CurrencyInput (id=CompBenefits_WeeklyCompRate_Input) at NewClaimWageBenefitsDV.pcf: line 28, column 55
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.CompBenefits.WeeklyCompRate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TypeKeyInput (id=CompBenefits_PaymentFrequency_Input) at NewClaimWageBenefitsDV.pcf: line 34, column 51
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.CompBenefits.PaymentFrequency = (__VALUE_TO_SET as typekey.PaymentFrequencyType)
    }
    
    // 'value' attribute on DateInput (id=CompBenefits_BenefitsEndDate_Input) at NewClaimWageBenefitsDV.pcf: line 23, column 56
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.CompBenefits.BenefitsEndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'validationExpression' attribute on DateInput (id=CompBenefits_BenefitsEndDate_Input) at NewClaimWageBenefitsDV.pcf: line 23, column 56
    function validationExpression_4 () : java.lang.Object {
      return !(Exposure.CompBenefits.BenefitsBeginDate > Exposure.CompBenefits.BenefitsEndDate) ? null : DisplayKey.get("JSP.PIPDetail.PIP.Date.ValidationError")
    }
    
    // 'value' attribute on DateInput (id=CompBenefits_BenefitsBeginDate_Input) at NewClaimWageBenefitsDV.pcf: line 17, column 58
    function valueRoot_2 () : java.lang.Object {
      return Exposure.CompBenefits
    }
    
    // 'value' attribute on DateInput (id=CompBenefits_BenefitsBeginDate_Input) at NewClaimWageBenefitsDV.pcf: line 17, column 58
    function value_0 () : java.util.Date {
      return Exposure.CompBenefits.BenefitsBeginDate
    }
    
    // 'value' attribute on CurrencyInput (id=CompBenefits_WeeklyCompRate_Input) at NewClaimWageBenefitsDV.pcf: line 28, column 55
    function value_10 () : gw.api.financials.CurrencyAmount {
      return Exposure.CompBenefits.WeeklyCompRate
    }
    
    // 'value' attribute on TypeKeyInput (id=CompBenefits_PaymentFrequency_Input) at NewClaimWageBenefitsDV.pcf: line 34, column 51
    function value_14 () : typekey.PaymentFrequencyType {
      return Exposure.CompBenefits.PaymentFrequency
    }
    
    // 'value' attribute on DateInput (id=CompBenefits_BenefitsEndDate_Input) at NewClaimWageBenefitsDV.pcf: line 23, column 56
    function value_5 () : java.util.Date {
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