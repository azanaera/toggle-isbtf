package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleCommandDefinitionsListDetailView.Add;
import pcftest.RuleCommandDefinitionsListDetailView.CommandDefinitionDV;
import pcftest.RuleCommandDefinitionsListDetailView.CommandDefinitionValidationErrors;
import pcftest.RuleCommandDefinitionsListDetailView.MoveDown;
import pcftest.RuleCommandDefinitionsListDetailView.MoveUp;
import pcftest.RuleCommandDefinitionsListDetailView.Remove;
import pcftest.RuleCommandDefinitionsListDetailView.actionDescriptionHeader;
import pcftest.RuleCommandDefinitionsListDetailView.actionSequenceHeader;
import pcftest.RuleCommandDefinitionsListDetailView.actionTypeHeader;
import pcftest.RuleCommandDefinitionsListDetailView.cardTab;
import pcftest.RuleCommandDefinitionsListDetailView.entry;
import pcftest.RuleCommandDefinitionsListDetailView.entry._Select;
import pcftest.RuleCommandDefinitionsListDetailView.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleCommandDefinitionsListDetailView.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleCommandDefinitionsListDetailView extends PCFElement {
  public final static String CHECKSUM = "19cc01c22cc687a8e9e1ab3fde5dd3c1";
  
  public RuleCommandDefinitionsListDetailView(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Add getAdd() {
    return getOrCreateProperty("Add", "Add", null, pcftest.RuleCommandDefinitionsListDetailView.Add.class);
  }
  
  public CommandDefinitionDV getCommandDefinitionDV() {
    return getOrCreateProperty("CommandDefinitionDV", "CommandDefinitionDV", null, pcftest.RuleCommandDefinitionsListDetailView.CommandDefinitionDV.class);
  }
  
  public CommandDefinitionValidationErrors getCommandDefinitionValidationErrors() {
    return getOrCreateProperty("CommandDefinitionValidationErrors", "CommandDefinitionValidationErrors", null, pcftest.RuleCommandDefinitionsListDetailView.CommandDefinitionValidationErrors.class);
  }
  
  public MoveDown getMoveDown() {
    return getOrCreateProperty("MoveDown", "MoveDown", null, pcftest.RuleCommandDefinitionsListDetailView.MoveDown.class);
  }
  
  public MoveUp getMoveUp() {
    return getOrCreateProperty("MoveUp", "MoveUp", null, pcftest.RuleCommandDefinitionsListDetailView.MoveUp.class);
  }
  
  public Remove getRemove() {
    return getOrCreateProperty("Remove", "Remove", null, pcftest.RuleCommandDefinitionsListDetailView.Remove.class);
  }
  
  public pcftest.RuleCommandDefinitionsListDetailView.RuleActionKey getRuleActionKey() {
    return getOrCreateProperty("RuleActionKey", "RuleActionKey", null, pcftest.RuleCommandDefinitionsListDetailView.RuleActionKey.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.RuleCommandDefinitionsListDetailView.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  public actionDescriptionHeader getactionDescriptionHeader() {
    return getOrCreateProperty("actionDescriptionHeader", "actionDescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuleCommandDefinitionsListDetailView.actionDescriptionHeader.class);
  }
  
  public actionSequenceHeader getactionSequenceHeader() {
    return getOrCreateProperty("actionSequenceHeader", "actionSequenceHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuleCommandDefinitionsListDetailView.actionSequenceHeader.class);
  }
  
  public actionTypeHeader getactionTypeHeader() {
    return getOrCreateProperty("actionTypeHeader", "actionTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuleCommandDefinitionsListDetailView.actionTypeHeader.class);
  }
  
  public cardTab getcardTab() {
    return getOrCreateProperty("cardTab", "cardTab", null, pcftest.RuleCommandDefinitionsListDetailView.cardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleCommandDefinitionsListDetailView.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Add extends ClickableActionElement {
    public Add(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleCommandDefinitionsListDetailView.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommandDefinitionDV extends PCFElement {
    public CommandDefinitionDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CommandDefinitionDV_createexposure getCommandDefinitionDV_createexposure() {
      return getOrCreateProperty("CommandDefinitionDV_createexposure", "CommandDefinitionDV", null, pcftest.CommandDefinitionDV_createexposure.class);
    }
    
    public CommandDefinitionDV_createreserve getCommandDefinitionDV_createreserve() {
      return getOrCreateProperty("CommandDefinitionDV_createreserve", "CommandDefinitionDV", null, pcftest.CommandDefinitionDV_createreserve.class);
    }
    
    public CommandDefinitionDV_default getCommandDefinitionDV_default() {
      return getOrCreateProperty("CommandDefinitionDV_default", "CommandDefinitionDV", null, pcftest.CommandDefinitionDV_default.class);
    }
    
    public CommandDefinitionDV_generateactivity getCommandDefinitionDV_generateactivity() {
      return getOrCreateProperty("CommandDefinitionDV_generateactivity", "CommandDefinitionDV", null, pcftest.CommandDefinitionDV_generateactivity.class);
    }
    
    public CommandDefinitionDV_generatehistoryevent getCommandDefinitionDV_generatehistoryevent() {
      return getOrCreateProperty("CommandDefinitionDV_generatehistoryevent", "CommandDefinitionDV", null, pcftest.CommandDefinitionDV_generatehistoryevent.class);
    }
    
    public CommandDefinitionDV_setfield getCommandDefinitionDV_setfield() {
      return getOrCreateProperty("CommandDefinitionDV_setfield", "CommandDefinitionDV", null, pcftest.CommandDefinitionDV_setfield.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleCommandDefinitionsListDetailView.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommandDefinitionValidationErrors extends PCFElement {
    public CommandDefinitionValidationErrors(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidationErrorsInputSet getValidationErrorsInputSet() {
      return getOrCreateProperty("ValidationErrorsInputSet", "ValidationErrorsInputSet", null, pcftest.ValidationErrorsInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleCommandDefinitionsListDetailView.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MoveDown extends ClickableActionElement {
    public MoveDown(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleCommandDefinitionsListDetailView.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MoveUp extends ClickableActionElement {
    public MoveUp(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleCommandDefinitionsListDetailView.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Remove extends ClickableActionElement {
    public Remove(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleCommandDefinitionsListDetailView.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleActionKey extends SelectElement {
    public RuleActionKey(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.RuleActionKey arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.RuleActionKey getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.RuleActionKey.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.RuleActionKey arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleCommandDefinitionsListDetailView.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actionDescriptionHeader extends ValueElement {
    public actionDescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleCommandDefinitionsListDetailView.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actionSequenceHeader extends ValueElement {
    public actionSequenceHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleCommandDefinitionsListDetailView.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class actionTypeHeader extends ValueElement {
    public actionTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleCommandDefinitionsListDetailView.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class cardTab extends ClickableActionElement {
    public cardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleCommandDefinitionsListDetailView.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.RuleCommandDefinitionsListDetailView.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.RuleCommandDefinitionsListDetailView.entry._ViewDetail.class);
    }
    
    public ValueElement getactionDescription() {
      return getOrCreateProperty("actionDescription", "actionDescription", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getactionSequence() {
      return getOrCreateProperty("actionSequence", "actionSequence", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getactionType() {
      return getOrCreateProperty("actionType", "actionType", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleCommandDefinitionsListDetailView.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleCommandDefinitionsListDetailView.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}