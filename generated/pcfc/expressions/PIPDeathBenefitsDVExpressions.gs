package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/exposures/PIPDeathBenefitsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class PIPDeathBenefitsDVExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/exposures/PIPDeathBenefitsDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PIPDeathBenefitsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on DateInput (id=LostWagesBenefits_BenefitsBeginDate_Input) at PIPDeathBenefitsDV.pcf: line 18, column 62
    function defaultSetter_1 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.PIPDeathBenefits.BenefitsBeginDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'value' attribute on CurrencyInput (id=LostWagesBenefits_WeeklyCompRate_Input) at PIPDeathBenefitsDV.pcf: line 30, column 59
    function defaultSetter_11 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.PIPDeathBenefits.WeeklyCompRate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TypeKeyInput (id=LostWagesBenefits_PaymentFrequency_Input) at PIPDeathBenefitsDV.pcf: line 36, column 51
    function defaultSetter_15 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.PIPDeathBenefits.PaymentFrequency = (__VALUE_TO_SET as typekey.PaymentFrequencyType)
    }
    
    // 'value' attribute on CurrencyInput (id=LostWagesBenefits_MaxBurialRate_Input) at PIPDeathBenefitsDV.pcf: line 42, column 58
    function defaultSetter_19 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.PIPDeathBenefits.MaxBurialRate = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextInput (id=LostWagesBenefits_Description_Input) at PIPDeathBenefitsDV.pcf: line 47, column 56
    function defaultSetter_23 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.PIPDeathBenefits.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on DateInput (id=LostWagesBenefits_BenefitsEndDate_Input) at PIPDeathBenefitsDV.pcf: line 24, column 60
    function defaultSetter_6 (__VALUE_TO_SET :  java.lang.Object) : void {
      Exposure.PIPDeathBenefits.BenefitsEndDate = (__VALUE_TO_SET as java.util.Date)
    }
    
    // 'validationExpression' attribute on DateInput (id=LostWagesBenefits_BenefitsEndDate_Input) at PIPDeathBenefitsDV.pcf: line 24, column 60
    function validationExpression_4 () : java.lang.Object {
      return !(Exposure.PIPDeathBenefits.BenefitsBeginDate > Exposure.PIPDeathBenefits.BenefitsEndDate) ? null : DisplayKey.get("JSP.PIPDetail.PIP.Date.ValidationError")
    }
    
    // 'value' attribute on DateInput (id=LostWagesBenefits_BenefitsBeginDate_Input) at PIPDeathBenefitsDV.pcf: line 18, column 62
    function valueRoot_2 () : java.lang.Object {
      return Exposure.PIPDeathBenefits
    }
    
    // 'value' attribute on DateInput (id=LostWagesBenefits_BenefitsBeginDate_Input) at PIPDeathBenefitsDV.pcf: line 18, column 62
    function value_0 () : java.util.Date {
      return Exposure.PIPDeathBenefits.BenefitsBeginDate
    }
    
    // 'value' attribute on CurrencyInput (id=LostWagesBenefits_WeeklyCompRate_Input) at PIPDeathBenefitsDV.pcf: line 30, column 59
    function value_10 () : gw.api.financials.CurrencyAmount {
      return Exposure.PIPDeathBenefits.WeeklyCompRate
    }
    
    // 'value' attribute on TypeKeyInput (id=LostWagesBenefits_PaymentFrequency_Input) at PIPDeathBenefitsDV.pcf: line 36, column 51
    function value_14 () : typekey.PaymentFrequencyType {
      return Exposure.PIPDeathBenefits.PaymentFrequency
    }
    
    // 'value' attribute on CurrencyInput (id=LostWagesBenefits_MaxBurialRate_Input) at PIPDeathBenefitsDV.pcf: line 42, column 58
    function value_18 () : gw.api.financials.CurrencyAmount {
      return Exposure.PIPDeathBenefits.MaxBurialRate
    }
    
    // 'value' attribute on TextInput (id=LostWagesBenefits_Description_Input) at PIPDeathBenefitsDV.pcf: line 47, column 56
    function value_22 () : java.lang.String {
      return Exposure.PIPDeathBenefits.Description
    }
    
    // 'value' attribute on DateInput (id=LostWagesBenefits_BenefitsEndDate_Input) at PIPDeathBenefitsDV.pcf: line 24, column 60
    function value_5 () : java.util.Date {
      return Exposure.PIPDeathBenefits.BenefitsEndDate
    }
    
    property get Exposure () : Exposure {
      return getRequireValue("Exposure", 0) as Exposure
    }
    
    property set Exposure ($arg :  Exposure) {
      setRequireValue("Exposure", 0, $arg)
    }
    
    
  }
  
  
}