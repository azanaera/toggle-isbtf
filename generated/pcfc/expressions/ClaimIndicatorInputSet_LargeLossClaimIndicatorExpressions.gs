package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.LargeLossClaimIndicator.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ClaimIndicatorInputSet_LargeLossClaimIndicatorExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/claim/summary/indicator/ClaimIndicatorInputSet.LargeLossClaimIndicator.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimIndicatorInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'iconColor' attribute on Link (id=LargeLossIcon) at ClaimIndicatorInputSet.LargeLossClaimIndicator.pcf: line 19, column 35
    function iconColor_2 () : gw.api.web.color.GWColor {
      return indicator.IconColor
    }
    
    // 'icon' attribute on Link (id=LargeLossIcon) at ClaimIndicatorInputSet.LargeLossClaimIndicator.pcf: line 19, column 35
    function icon_1 () : java.lang.String {
      return indicator.Icon
    }
    
    // 'label' attribute on Link (id=LargeLossText) at ClaimIndicatorInputSet.LargeLossClaimIndicator.pcf: line 22, column 33
    function label_3 () : java.lang.Object {
      return indicator.Text
    }
    
    // 'value' attribute on TextInput (id=NetTotalIncurred_Input) at ClaimIndicatorInputSet.LargeLossClaimIndicator.pcf: line 27, column 50
    function value_4 () : java.lang.String {
      return getNetTotalIncurredDisplayValue()
    }
    
    // 'visible' attribute on Link (id=LargeLossIcon) at ClaimIndicatorInputSet.LargeLossClaimIndicator.pcf: line 19, column 35
    function visible_0 () : java.lang.Boolean {
      return indicator.IsOn
    }
    
    property get indicator () : ClaimIndicator {
      return getRequireValue("indicator", 0) as ClaimIndicator
    }
    
    property set indicator ($arg :  ClaimIndicator) {
      setRequireValue("indicator", 0, $arg)
    }
    
    
    function getNetTotalIncurredDisplayValue() : String {
      var value = (indicator as LargeLossClaimIndicator).NetTotalIncurred
      if (value == null) {
        return DisplayKey.get("Web.NA")
      }
      return gw.api.util.CurrencyUtil.renderAsCurrency(value)
    }
          
        
    
    
  }
  
  
}