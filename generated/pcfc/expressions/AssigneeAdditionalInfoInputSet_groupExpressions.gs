package pcfc.expressions

uses pcf.*
uses entity.*
uses typekey.*
uses gw.api.locale.DisplayKey
@javax.annotation.processing.Generated("config/web/pcf/bizrules/ActivityRules/activityassignee/AssigneeAdditionalInfoInputSet.group.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
class AssigneeAdditionalInfoInputSet_groupExpressions {
  @javax.annotation.processing.Generated("config/web/pcf/bizrules/ActivityRules/activityassignee/AssigneeAdditionalInfoInputSet.group.pcf", "", "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssigneeAdditionalInfoInputSetExpressionsImpl extends gw.api.web.ScopeBaseClass {
    public construct(widget :  Object) {
      super(widget, 0)
    }
    
    protected construct(widget :  Object, scopeDepth :  int) {
      super(widget, scopeDepth)
    }
    
    // 'pickLocation' attribute on PickerInput (id=GroupPicker_Input) at AssigneeAdditionalInfoInputSet.group.pcf: line 25, column 25
    function action_0 () : void {
      AssigneePickerPopup.push(new gw.bizrules.ruleaction.generateactivity.GenerateActivityAssigneePicker(AssignmentSearchType.TC_GROUP))
    }
    
    // 'pickLocation' attribute on PickerInput (id=GroupPicker_Input) at AssigneeAdditionalInfoInputSet.group.pcf: line 25, column 25
    function action_dest_1 () : pcf.api.Destination {
      return pcf.AssigneePickerPopup.createDestination(new gw.bizrules.ruleaction.generateactivity.GenerateActivityAssigneePicker(AssignmentSearchType.TC_GROUP))
    }
    
    // 'conversionExpression' attribute on PickerInput (id=GroupPicker_Input) at AssigneeAdditionalInfoInputSet.group.pcf: line 25, column 25
    function conversionExpression_2 (PickedValue :  gw.api.assignment.Assignee) : Group {
      return PickedValue as Group
    }
    
    // 'value' attribute on PickerInput (id=GroupPicker_Input) at AssigneeAdditionalInfoInputSet.group.pcf: line 25, column 25
    function defaultSetter_4 (__VALUE_TO_SET :  java.lang.Object) : void {
      state.Group = (__VALUE_TO_SET as Group)
    }
    
    // 'value' attribute on PickerInput (id=GroupPicker_Input) at AssigneeAdditionalInfoInputSet.group.pcf: line 25, column 25
    function valueRoot_5 () : java.lang.Object {
      return state
    }
    
    // 'value' attribute on PickerInput (id=GroupPicker_Input) at AssigneeAdditionalInfoInputSet.group.pcf: line 25, column 25
    function value_3 () : Group {
      return state.Group
    }
    
    property get commandDefinition () : gw.bizrules.pcf.RuleCommandDefinitionHolder {
      return getRequireValue("commandDefinition", 0) as gw.bizrules.pcf.RuleCommandDefinitionHolder
    }
    
    property set commandDefinition ($arg :  gw.bizrules.pcf.RuleCommandDefinitionHolder) {
      setRequireValue("commandDefinition", 0, $arg)
    }
    
    property get config () : gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterConfig {
      return getRequireValue("config", 0) as gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterConfig
    }
    
    property set config ($arg :  gw.bizrules.ruleaction.generateactivity.config.GenerateActivityCommandParameterConfig) {
      setRequireValue("config", 0, $arg)
    }
    
    property get state () : gw.bizrules.ruleaction.generateactivity.GenerateActivityCommandDefinitionState {
      return getRequireValue("state", 0) as gw.bizrules.ruleaction.generateactivity.GenerateActivityCommandDefinitionState
    }
    
    property set state ($arg :  gw.bizrules.ruleaction.generateactivity.GenerateActivityCommandDefinitionState) {
      setRequireValue("state", 0, $arg)
    }
    
    
  }
  
  
}