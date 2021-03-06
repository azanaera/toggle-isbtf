package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/admin/attributes/AttributesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AttributesLVExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/admin/attributes/AttributesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AttributesLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'value' attribute on TextCell (id=Name_Cell) at AttributesLV.pcf: line 30, column 35
    function sortValue_0 (Attribute :  entity.Attribute) : java.lang.Object {
      return Attribute.Name
    }
    
    // 'value' attribute on TypeKeyCell (id=Type_Cell) at AttributesLV.pcf: line 36, column 50
    function sortValue_1 (Attribute :  entity.Attribute) : java.lang.Object {
      return Attribute.Type
    }
    
    // 'value' attribute on TextCell (id=Description_Cell) at AttributesLV.pcf: line 41, column 42
    function sortValue_2 (Attribute :  entity.Attribute) : java.lang.Object {
      return Attribute.Description
    }
    
    // 'value' attribute on RowIterator at AttributesLV.pcf: line 21, column 76
    function value_14 () : gw.api.database.IQueryBeanResult<entity.Attribute> {
      return AttributeList
    }
    
    property get AttributeList () : gw.api.database.IQueryBeanResult<Attribute> {
      return getRequireValue("AttributeList", 0) as gw.api.database.IQueryBeanResult<Attribute>
    }
    
    property set AttributeList ($arg :  gw.api.database.IQueryBeanResult<Attribute>) {
      setRequireValue("AttributeList", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/admin/attributes/AttributesLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends AttributesLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Name_Cell) at AttributesLV.pcf: line 30, column 35
    function action_3 () : void {
      AttributeDetail.go(Attribute)
    }
    
    // 'action' attribute on TextCell (id=Name_Cell) at AttributesLV.pcf: line 30, column 35
    function action_dest_4 () : pcf.api.Destination {
      return pcf.AttributeDetail.createDestination(Attribute)
    }
    
    // 'value' attribute on TextCell (id=Name_Cell) at AttributesLV.pcf: line 30, column 35
    function valueRoot_6 () : java.lang.Object {
      return Attribute
    }
    
    // 'value' attribute on TextCell (id=Description_Cell) at AttributesLV.pcf: line 41, column 42
    function value_11 () : java.lang.String {
      return Attribute.Description
    }
    
    // 'value' attribute on TextCell (id=Name_Cell) at AttributesLV.pcf: line 30, column 35
    function value_5 () : java.lang.String {
      return Attribute.Name
    }
    
    // 'value' attribute on TypeKeyCell (id=Type_Cell) at AttributesLV.pcf: line 36, column 50
    function value_8 () : typekey.UserAttributeType {
      return Attribute.Type
    }
    
    property get Attribute () : entity.Attribute {
      return getIteratedValue(1) as entity.Attribute
    }
    
    
  }
  
  
}