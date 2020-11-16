package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/admin/attributes/AttributeDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AttributeDetailDVExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/admin/attributes/AttributeDetailDV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AttributeDetailDVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextInput (id=Name_Input) at AttributeDetailDV.pcf: line 18, column 33
    function defaultSetter_1 (__VALUE_TO_SET :  java.lang.Object) : void {
      Attribute.Name = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TextAreaInput (id=Description_Input) at AttributeDetailDV.pcf: line 24, column 40
    function defaultSetter_5 (__VALUE_TO_SET :  java.lang.Object) : void {
      Attribute.Description = (__VALUE_TO_SET as java.lang.String)
    }
    
    // 'value' attribute on TypeKeyInput (id=Type_Input) at AttributeDetailDV.pcf: line 31, column 48
    function defaultSetter_9 (__VALUE_TO_SET :  java.lang.Object) : void {
      Attribute.Type = (__VALUE_TO_SET as typekey.UserAttributeType)
    }
    
    // 'value' attribute on TextInput (id=Name_Input) at AttributeDetailDV.pcf: line 18, column 33
    function valueRoot_2 () : java.lang.Object {
      return Attribute
    }
    
    // 'value' attribute on TextInput (id=Name_Input) at AttributeDetailDV.pcf: line 18, column 33
    function value_0 () : java.lang.String {
      return Attribute.Name
    }
    
    // 'value' attribute on TextAreaInput (id=Description_Input) at AttributeDetailDV.pcf: line 24, column 40
    function value_4 () : java.lang.String {
      return Attribute.Description
    }
    
    // 'value' attribute on TypeKeyInput (id=Type_Input) at AttributeDetailDV.pcf: line 31, column 48
    function value_8 () : typekey.UserAttributeType {
      return Attribute.Type
    }
    
    property get Attribute () : Attribute {
      return getRequireValue("Attribute", 0) as Attribute
    }
    
    property set Attribute ($arg :  Attribute) {
      setRequireValue("Attribute", 0, $arg)
    }
    
    
  }
  
  
}