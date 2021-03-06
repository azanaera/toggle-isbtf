package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/workspace/activity/ActivityOwnerInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class ActivityOwnerInputSetExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/workspace/activity/ActivityOwnerInputSet.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityOwnerInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'action' attribute on GroupInput (id=AssignedGroup_Input) at GroupWidget.xml: line 10, column 49
    function action_3 () : void {
      pcf.GroupSearchPopup.push()
    }
    
    // 'action' attribute on GroupInput (id=AssignedGroup_Input) at GroupWidget.xml: line 13, column 49
    function action_5 () : void {
      pcf.OrganizationGroupTreePopup.push()
    }
    
    // 'action' attribute on GroupInput (id=AssignedGroup_Input) at GroupWidget.xml: line 10, column 49
    function action_dest_4 () : pcf.api.Destination {
      return pcf.GroupSearchPopup.createDestination()
    }
    
    // 'action' attribute on GroupInput (id=AssignedGroup_Input) at GroupWidget.xml: line 13, column 49
    function action_dest_6 () : pcf.api.Destination {
      return pcf.OrganizationGroupTreePopup.createDestination()
    }
    
    // 'valueRange' attribute on GroupInput (id=AssignedGroup_Input) at GroupWidget.xml: line 7, column 52
    function valueRange_9 () : java.lang.Object {
      return gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
    }
    
    // 'value' attribute on TextInput (id=InternalOwner_Input) at ActivityOwnerInputSet.pcf: line 19, column 47
    function valueRoot_1 () : java.lang.Object {
      return Activity
    }
    
    // 'value' attribute on TextInput (id=InternalOwner_Input) at ActivityOwnerInputSet.pcf: line 19, column 47
    function value_0 () : java.lang.String {
      return Activity.AssigneeDisplayString
    }
    
    // 'value' attribute on TextInput (id=AssignedBy_Input) at ActivityOwnerInputSet.pcf: line 27, column 154
    function value_15 () : java.lang.String {
      return Activity.AssignedByUser != null ? Activity.AssignedByUser as String : DisplayKey.get("Java.Activity.AssignedByUser.SystemUser")
    }
    
    // 'value' attribute on DateInput (id=AssignDate_Input) at ActivityOwnerInputSet.pcf: line 32, column 40
    function value_17 () : java.util.Date {
      return Activity.AssignmentDate
    }
    
    // 'value' attribute on GroupInput (id=AssignedGroup_Input) at GroupWidget.xml: line 7, column 52
    function value_7 () : entity.Group {
      return Activity.AssignedGroup
    }
    
    // 'valueRange' attribute on GroupInput (id=AssignedGroup_Input) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_10 ($$arg :  entity.Group[]) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupInput (id=AssignedGroup_Input) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_10 ($$arg :  gw.api.database.IQueryBeanResult<entity.Group>) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupInput (id=AssignedGroup_Input) at GroupWidget.xml: line 7, column 52
    function verifyValueRangeIsAllowedType_10 ($$arg :  java.util.List) : void {
      // No-op:  This method is only for verification purposes and is never actually executed
    }
    
    // 'valueRange' attribute on GroupInput (id=AssignedGroup_Input) at GroupWidget.xml: line 7, column 52
    function verifyValueRange_11 () : void {
      var __valueRangeArg = gw.api.admin.BaseAdminUtil.getGroupsForCurrentUser()
      // If this call fails to compile, possibly with an error saying it's an ambiguous method call,
      // that means that the type of the valueRange is not compatible with the valueType 
      // The valueRange must be an array, list or query whose member type matches the valueType
      verifyValueRangeIsAllowedType_10(__valueRangeArg)
    }
    
    property get Activity () : Activity {
      return getRequireValue("Activity", 0) as Activity
    }
    
    property set Activity ($arg :  Activity) {
      setRequireValue("Activity", 0, $arg)
    }
    
    
  }
  
  
}