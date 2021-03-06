package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/shared/policy/StatCodeDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class StatCodeDetailDVExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/shared/policy/StatCodeDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatCodeDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=LineNumber_Input) at StatCodeDetailDV.pcf: line 18, column 40
    function defaultSetter_1 (__VALUE_TO_SET :  java.lang.Object) : void {
      StatCode.LineNumber = (__VALUE_TO_SET as java.lang.Integer)
    }
    
    // 'value' attribute on TextInput (id=LocationNumber_Input) at StatCodeDetailDV.pcf: line 37, column 42
    function defaultSetter_13 (__VALUE_TO_SET :  java.lang.Object) : void {
      StatCode.LocationNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=BuildingNumber_Input) at StatCodeDetailDV.pcf: line 42, column 42
    function defaultSetter_17 (__VALUE_TO_SET :  java.lang.Object) : void {
      StatCode.BuildingNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=VehicleNumber_Input) at StatCodeDetailDV.pcf: line 47, column 41
    function defaultSetter_21 (__VALUE_TO_SET :  java.lang.Object) : void {
      StatCode.VehicleNumber = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextInput (id=ClassCode_Input) at StatCodeDetailDV.pcf: line 52, column 37
    function defaultSetter_25 (__VALUE_TO_SET :  java.lang.Object) : void {
      StatCode.ClassCode = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=State_Input) at StatCodeDetailDV.pcf: line 58, column 36
    function defaultSetter_29 (__VALUE_TO_SET :  java.lang.Object) : void {
      StatCode.State = (__VALUE_TO_SET as typekey.State)
    }
    
    // 'value' attribute on TypeKeyInput (id=MajorPeril_Input) at StatCodeDetailDV.pcf: line 64, column 42
    function defaultSetter_33 (__VALUE_TO_SET :  java.lang.Object) : void {
      StatCode.MajorPeril = (__VALUE_TO_SET as typekey.MajorPerils)
    }
    
    // 'value' attribute on TextInput (id=Notes_Input) at StatCodeDetailDV.pcf: line 69, column 33
    function defaultSetter_37 (__VALUE_TO_SET :  java.lang.Object) : void {
      StatCode.Notes = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=InsuranceLine_Input) at StatCodeDetailDV.pcf: line 25, column 44
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      StatCode.InsuranceLine = (__VALUE_TO_SET as typekey.InsuranceLine)
    }
    
    // 'value' attribute on TypeKeyInput (id=InsuranceSubLine_Input) at StatCodeDetailDV.pcf: line 32, column 47
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      StatCode.InsuranceSubLine = (__VALUE_TO_SET as typekey.InsuranceSubLine)
    }
    
    // 'value' attribute on TextInput (id=LineNumber_Input) at StatCodeDetailDV.pcf: line 18, column 40
    function valueRoot_2 () : java.lang.Object {
      return StatCode
    }
    
    // 'value' attribute on TextInput (id=LineNumber_Input) at StatCodeDetailDV.pcf: line 18, column 40
    function value_0 () : java.lang.Integer {
      return StatCode.LineNumber
    }
    
    // 'value' attribute on TextInput (id=LocationNumber_Input) at StatCodeDetailDV.pcf: line 37, column 42
    function value_12 () : java.lang.String {
      return StatCode.LocationNumber
    }
    
    // 'value' attribute on TextInput (id=BuildingNumber_Input) at StatCodeDetailDV.pcf: line 42, column 42
    function value_16 () : java.lang.String {
      return StatCode.BuildingNumber
    }
    
    // 'value' attribute on TextInput (id=VehicleNumber_Input) at StatCodeDetailDV.pcf: line 47, column 41
    function value_20 () : java.lang.String {
      return StatCode.VehicleNumber
    }
    
    // 'value' attribute on TextInput (id=ClassCode_Input) at StatCodeDetailDV.pcf: line 52, column 37
    function value_24 () : java.lang.String {
      return StatCode.ClassCode
    }
    
    // 'value' attribute on TypeKeyInput (id=State_Input) at StatCodeDetailDV.pcf: line 58, column 36
    function value_28 () : typekey.State {
      return StatCode.State
    }
    
    // 'value' attribute on TypeKeyInput (id=MajorPeril_Input) at StatCodeDetailDV.pcf: line 64, column 42
    function value_32 () : typekey.MajorPerils {
      return StatCode.MajorPeril
    }
    
    // 'value' attribute on TextInput (id=Notes_Input) at StatCodeDetailDV.pcf: line 69, column 33
    function value_36 () : java.lang.String {
      return StatCode.Notes
    }
    
    // 'value' attribute on TypeKeyInput (id=InsuranceLine_Input) at StatCodeDetailDV.pcf: line 25, column 44
    function value_4 () : typekey.InsuranceLine {
      return StatCode.InsuranceLine
    }
    
    // 'value' attribute on TypeKeyInput (id=InsuranceSubLine_Input) at StatCodeDetailDV.pcf: line 32, column 47
    function value_8 () : typekey.InsuranceSubLine {
      return StatCode.InsuranceSubLine
    }
    
    property get StatCode () : StatCode {
      return getRequireValue("StatCode", 0) as StatCode
    }
    
    property set StatCode ($arg :  StatCode) {
      setRequireValue("StatCode", 0, $arg)
    }
    
    
  }
  
  
}