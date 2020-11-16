package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/admin/catastrophes/CatastropheAdminLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class CatastropheAdminLVExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/admin/catastrophes/CatastropheAdminLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CatastropheAdminLVExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'sortBy' attribute on TextCell (id=Status_Cell) at CatastropheAdminLV.pcf: line 32, column 151
    function sortValue_0 (Catastrophe :  entity.Catastrophe) : java.lang.Object {
      return Catastrophe.Active
    }
    
    // 'value' attribute on TextCell (id=Name_Cell) at CatastropheAdminLV.pcf: line 37, column 37
    function sortValue_1 (Catastrophe :  entity.Catastrophe) : java.lang.Object {
      return Catastrophe.Name
    }
    
    // 'value' attribute on TextCell (id=CatastropheNumber_Cell) at CatastropheAdminLV.pcf: line 42, column 50
    function sortValue_2 (Catastrophe :  entity.Catastrophe) : java.lang.Object {
      return Catastrophe.CatastropheNumber
    }
    
    // 'value' attribute on TypeKeyCell (id=Type_Cell) at CatastropheAdminLV.pcf: line 57, column 48
    function sortValue_3 (Catastrophe :  entity.Catastrophe) : java.lang.Object {
      return Catastrophe.Type
    }
    
    // 'value' attribute on TextCell (id=Description_Cell) at CatastropheAdminLV.pcf: line 61, column 44
    function sortValue_4 (Catastrophe :  entity.Catastrophe) : java.lang.Object {
      return Catastrophe.Description
    }
    
    // 'value' attribute on RowIterator at CatastropheAdminLV.pcf: line 20, column 78
    function value_35 () : gw.api.database.IQueryBeanResult<entity.Catastrophe> {
      return CatastropheList
    }
    
    property get CatastropheList () : gw.api.database.IQueryBeanResult<Catastrophe> {
      return getRequireValue("CatastropheList", 0) as gw.api.database.IQueryBeanResult<Catastrophe>
    }
    
    property set CatastropheList ($arg :  gw.api.database.IQueryBeanResult<Catastrophe>) {
      setRequireValue("CatastropheList", 0, $arg)
    }
    
    
  }
  
  @javax.annotation.processing.Generated("config/web/pcf/admin/catastrophes/CatastropheAdminLV.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IteratorEntryExpressionsImpl extends CatastropheAdminLVExpressionsImpl {
    public construct(widget :  Object) {
      super(widget, 1)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on TextCell (id=Name_Cell) at CatastropheAdminLV.pcf: line 37, column 37
    function action_9 () : void {
      CatastropheDetailPage.go(Catastrophe)
    }
    
    // 'action' attribute on TextCell (id=Name_Cell) at CatastropheAdminLV.pcf: line 37, column 37
    function action_dest_10 () : pcf.api.Destination {
      return pcf.CatastropheDetailPage.createDestination(Catastrophe)
    }
    
    // 'condition' attribute on ToolbarFlag at CatastropheAdminLV.pcf: line 23, column 35
    function condition_5 () : java.lang.Boolean {
      return Catastrophe.Active
    }
    
    // 'condition' attribute on ToolbarFlag at CatastropheAdminLV.pcf: line 26, column 37
    function condition_6 () : java.lang.Boolean {
      return !Catastrophe.Active
    }
    
    // 'value' attribute on TextCell (id=Name_Cell) at CatastropheAdminLV.pcf: line 37, column 37
    function valueRoot_12 () : java.lang.Object {
      return Catastrophe
    }
    
    // 'value' attribute on TextCell (id=CreateUser_Cell) at CatastropheAdminLV.pcf: line 71, column 55
    function valueRoot_33 () : java.lang.Object {
      return Catastrophe.UpdateUser
    }
    
    // 'value' attribute on TextCell (id=Name_Cell) at CatastropheAdminLV.pcf: line 37, column 37
    function value_11 () : java.lang.String {
      return Catastrophe.Name
    }
    
    // 'value' attribute on TextCell (id=CatastropheNumber_Cell) at CatastropheAdminLV.pcf: line 42, column 50
    function value_14 () : java.lang.String {
      return Catastrophe.CatastropheNumber
    }
    
    // 'value' attribute on DateCell (id=CatastropheValidFrom_Cell) at CatastropheAdminLV.pcf: line 47, column 53
    function value_17 () : java.util.Date {
      return Catastrophe.CatastropheValidFrom
    }
    
    // 'value' attribute on DateCell (id=CatastropheValidTo_Cell) at CatastropheAdminLV.pcf: line 52, column 51
    function value_20 () : java.util.Date {
      return Catastrophe.CatastropheValidTo
    }
    
    // 'value' attribute on TypeKeyCell (id=Type_Cell) at CatastropheAdminLV.pcf: line 57, column 48
    function value_23 () : typekey.CatastropheType {
      return Catastrophe.Type
    }
    
    // 'value' attribute on TextCell (id=Description_Cell) at CatastropheAdminLV.pcf: line 61, column 44
    function value_26 () : java.lang.String {
      return Catastrophe.Description
    }
    
    // 'value' attribute on DateCell (id=CreateTime_Cell) at CatastropheAdminLV.pcf: line 66, column 43
    function value_29 () : java.util.Date {
      return Catastrophe.UpdateTime
    }
    
    // 'value' attribute on TextCell (id=CreateUser_Cell) at CatastropheAdminLV.pcf: line 71, column 55
    function value_32 () : java.lang.String {
      return Catastrophe.UpdateUser.DisplayName
    }
    
    // 'value' attribute on TextCell (id=Status_Cell) at CatastropheAdminLV.pcf: line 32, column 151
    function value_7 () : java.lang.String {
      return Catastrophe.Active ? DisplayKey.get("Java.ClientAction.Active") : DisplayKey.get("Java.ClientAction.Inactive")
    }
    
    property get Catastrophe () : entity.Catastrophe {
      return getIteratedValue(1) as entity.Catastrophe
    }
    
    
  }
  
  
}