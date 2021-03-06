package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/reinsurance/AgreementDetailsDV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AgreementDetailsDV_defaultExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/reinsurance/AgreementDetailsDV.default.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AgreementDetailsDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'def' attribute on InputSetRef at AgreementDetailsDV.default.pcf: line 26, column 35
    function def_onEnter_9 (def :  pcf.RISubtypeAndGroupInputSet) : void {
      def.onEnter( agreement.Claim, agreement )
    }
    
    // 'def' attribute on InputSetRef at AgreementDetailsDV.default.pcf: line 26, column 35
    function def_refreshVariables_10 (def :  pcf.RISubtypeAndGroupInputSet) : void {
      def.refreshVariables( agreement.Claim, agreement )
    }
    
    // 'value' attribute on TextInput (id=AgreementNumber_Input) at AgreementDetailsDV.default.pcf: line 17, column 44
    function defaultSetter_1 (__VALUE_TO_SET :  java.lang.Object) : void {
      agreement.AgreementNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=AgreementCurrency_Input) at AgreementDetailsDV.default.pcf: line 36, column 62
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      agreement.Currency = (__VALUE_TO_SET as typekey.Currency)
    }
    
    // 'value' attribute on CurrencyInput (id=AttachmentPoint_Input) at AgreementDetailsDV.default.pcf: line 45, column 44
    function defaultSetter_18 (__VALUE_TO_SET :  java.lang.Object) : void {
      agreement.AttachmentPoint = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=TopOfLayer_Input) at AgreementDetailsDV.default.pcf: line 52, column 39
    function defaultSetter_22 (__VALUE_TO_SET :  java.lang.Object) : void {
      agreement.TopOfLayer = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on CurrencyInput (id=RecoveryLimit_Input) at AgreementDetailsDV.default.pcf: line 59, column 42
    function defaultSetter_26 (__VALUE_TO_SET :  java.lang.Object) : void {
      agreement.RecoveryLimit = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextInput (id=CededShare_Input) at AgreementDetailsDV.default.pcf: line 67, column 43
    function defaultSetter_30 (__VALUE_TO_SET :  java.lang.Object) : void {
      agreement.CededShare = (__VALUE_TO_SET as java.math.BigDecimal)
    }
    
    // 'value' attribute on CurrencyInput (id=NotificationThreshold_Input) at AgreementDetailsDV.default.pcf: line 74, column 50
    function defaultSetter_34 (__VALUE_TO_SET :  java.lang.Object) : void {
      agreement.NotificationThreshold = (__VALUE_TO_SET as gw.api.financials.CurrencyAmount)
    }
    
    // 'value' attribute on TextInput (id=AgreementName_Input) at AgreementDetailsDV.default.pcf: line 23, column 42
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      agreement.AgreementName = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=AgreementNumber_Input) at AgreementDetailsDV.default.pcf: line 17, column 44
    function valueRoot_2 () : java.lang.Object {
      return agreement
    }
    
    // 'value' attribute on TextInput (id=AgreementNumber_Input) at AgreementDetailsDV.default.pcf: line 17, column 44
    function value_0 () : java.lang.String {
      return agreement.AgreementNumber
    }
    
    // 'value' attribute on TypeKeyInput (id=AgreementCurrency_Input) at AgreementDetailsDV.default.pcf: line 36, column 62
    function value_12 () : typekey.Currency {
      return agreement.Currency
    }
    
    // 'value' attribute on CurrencyInput (id=AttachmentPoint_Input) at AgreementDetailsDV.default.pcf: line 45, column 44
    function value_17 () : gw.api.financials.CurrencyAmount {
      return agreement.AttachmentPoint
    }
    
    // 'value' attribute on CurrencyInput (id=TopOfLayer_Input) at AgreementDetailsDV.default.pcf: line 52, column 39
    function value_21 () : gw.api.financials.CurrencyAmount {
      return agreement.TopOfLayer
    }
    
    // 'value' attribute on CurrencyInput (id=RecoveryLimit_Input) at AgreementDetailsDV.default.pcf: line 59, column 42
    function value_25 () : gw.api.financials.CurrencyAmount {
      return agreement.RecoveryLimit
    }
    
    // 'value' attribute on TextInput (id=CededShare_Input) at AgreementDetailsDV.default.pcf: line 67, column 43
    function value_29 () : java.math.BigDecimal {
      return agreement.CededShare
    }
    
    // 'value' attribute on CurrencyInput (id=NotificationThreshold_Input) at AgreementDetailsDV.default.pcf: line 74, column 50
    function value_33 () : gw.api.financials.CurrencyAmount {
      return agreement.NotificationThreshold
    }
    
    // 'value' attribute on BooleanRadioInput (id=ExceedsNotificationThreshold_Input) at AgreementDetailsDV.default.pcf: line 78, column 57
    function value_37 () : java.lang.Boolean {
      return agreement.ExceedsNotificationThreshold
    }
    
    // 'value' attribute on TextInput (id=AgreementName_Input) at AgreementDetailsDV.default.pcf: line 23, column 42
    function value_4 () : java.lang.String {
      return agreement.AgreementName
    }
    
    // 'visible' attribute on TypeKeyInput (id=AgreementCurrency_Input) at AgreementDetailsDV.default.pcf: line 36, column 62
    function visible_11 () : java.lang.Boolean {
      return gw.api.util.CurrencyUtil.MultiCurrencyMode
    }
    
    // 'visible' attribute on InputSetRef at AgreementDetailsDV.default.pcf: line 26, column 35
    function visible_8 () : java.lang.Boolean {
      return !agreement.New
    }
    
    property get agreement () : RIAgreement {
      return getRequireValue("agreement", 0) as RIAgreement
    }
    
    property set agreement ($arg :  RIAgreement) {
      setRequireValue("agreement", 0, $arg)
    }
    
    
  }
  
  
}