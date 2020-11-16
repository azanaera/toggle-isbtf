package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ConditionBuilderPanelSet.AdvancedConditionsLV;
import pcftest.ConditionBuilderPanelSet.AdvancedConditionsLV.AdvancedConditionToolbar;
import pcftest.ConditionBuilderPanelSet.AdvancedConditionsLV.AdvancedConditionToolbar.AdvancedAdd;
import pcftest.ConditionBuilderPanelSet.AdvancedConditionsLV.AdvancedConditionToolbar.AdvancedContextHelp;
import pcftest.ConditionBuilderPanelSet.AdvancedConditionsLV.AdvancedConditionToolbar.AdvancedHidePrettyPrint;
import pcftest.ConditionBuilderPanelSet.AdvancedConditionsLV.AdvancedConditionToolbar.AdvancedInsert;
import pcftest.ConditionBuilderPanelSet.AdvancedConditionsLV.AdvancedConditionToolbar.AdvancedMoveDown;
import pcftest.ConditionBuilderPanelSet.AdvancedConditionsLV.AdvancedConditionToolbar.AdvancedMoveUp;
import pcftest.ConditionBuilderPanelSet.AdvancedConditionsLV.AdvancedConditionToolbar.AdvancedRemove;
import pcftest.ConditionBuilderPanelSet.AdvancedConditionsLV.AdvancedConditionToolbar.AdvancedShowPrettyPrint;
import pcftest.ConditionBuilderPanelSet.ConditionValidationErrorsWhenReadOnlyDV;
import pcftest.ConditionBuilderPanelSet.PrettyPrintWrapperPanelSet;
import pcftest.ConditionBuilderPanelSet.RuleConditionTypeDV;
import pcftest.ConditionBuilderPanelSet.RuleConditionTypeDV.ConditionType;
import pcftest.ConditionBuilderPanelSet.SimpleConditionsLV;
import pcftest.ConditionBuilderPanelSet.SimpleConditionsLV.SimpleConditionToolbar;
import pcftest.ConditionBuilderPanelSet.SimpleConditionsLV.SimpleConditionToolbar.SimpleAdd;
import pcftest.ConditionBuilderPanelSet.SimpleConditionsLV.SimpleConditionToolbar.SimpleContextHelp;
import pcftest.ConditionBuilderPanelSet.SimpleConditionsLV.SimpleConditionToolbar.SimpleHidePrettyPrint;
import pcftest.ConditionBuilderPanelSet.SimpleConditionsLV.SimpleConditionToolbar.SimpleInsert;
import pcftest.ConditionBuilderPanelSet.SimpleConditionsLV.SimpleConditionToolbar.SimpleMoveDown;
import pcftest.ConditionBuilderPanelSet.SimpleConditionsLV.SimpleConditionToolbar.SimpleMoveUp;
import pcftest.ConditionBuilderPanelSet.SimpleConditionsLV.SimpleConditionToolbar.SimpleRemove;
import pcftest.ConditionBuilderPanelSet.SimpleConditionsLV.SimpleConditionToolbar.SimpleShowPrettyPrint;
import pcftest.ConditionBuilderPanelSet.ValidationErrorsDV;
import typekey.RuleConditionType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ConditionBuilderPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ConditionBuilderPanelSet extends PCFElement {
  public final static String CHECKSUM = "fb79314bf60eb9b59ae77be199b78e37";
  
  public ConditionBuilderPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AdvancedConditionsLV getAdvancedConditionsLV() {
    return getOrCreateProperty("AdvancedConditionsLV", "AdvancedConditionsLV", null, pcftest.ConditionBuilderPanelSet.AdvancedConditionsLV.class);
  }
  
  public ConditionValidationErrorsWhenReadOnlyDV getConditionValidationErrorsWhenReadOnlyDV() {
    return getOrCreateProperty("ConditionValidationErrorsWhenReadOnlyDV", "ConditionValidationErrorsWhenReadOnlyDV", null, pcftest.ConditionBuilderPanelSet.ConditionValidationErrorsWhenReadOnlyDV.class);
  }
  
  public PrettyPrintWrapperPanelSet getPrettyPrintWrapperPanelSet() {
    return getOrCreateProperty("PrettyPrintWrapperPanelSet", "PrettyPrintWrapperPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ConditionBuilderPanelSet.PrettyPrintWrapperPanelSet.class);
  }
  
  public RuleConditionTypeDV getRuleConditionTypeDV() {
    return getOrCreateProperty("RuleConditionTypeDV", "RuleConditionTypeDV", null, pcftest.ConditionBuilderPanelSet.RuleConditionTypeDV.class);
  }
  
  public SimpleConditionsLV getSimpleConditionsLV() {
    return getOrCreateProperty("SimpleConditionsLV", "SimpleConditionsLV", null, pcftest.ConditionBuilderPanelSet.SimpleConditionsLV.class);
  }
  
  public ValidationErrorsDV getValidationErrorsDV() {
    return getOrCreateProperty("ValidationErrorsDV", "ValidationErrorsDV", null, pcftest.ConditionBuilderPanelSet.ValidationErrorsDV.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AdvancedConditionsLV extends PCFElement {
    public AdvancedConditionsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AdvancedConditionToolbar getAdvancedConditionToolbar() {
      return getOrCreateProperty("AdvancedConditionToolbar", "AdvancedConditionToolbar", null, pcftest.ConditionBuilderPanelSet.AdvancedConditionsLV.AdvancedConditionToolbar.class);
    }
    
    public ConditionBuilderLV getConditionBuilderLV() {
      return getOrCreateProperty("ConditionBuilderLV", "ConditionBuilderLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ConditionBuilderLV.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AdvancedConditionToolbar extends PCFElement {
      public AdvancedConditionToolbar(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AdvancedAdd getAdvancedAdd() {
        return getOrCreateProperty("AdvancedAdd", "AdvancedAdd", null, pcftest.ConditionBuilderPanelSet.AdvancedConditionsLV.AdvancedConditionToolbar.AdvancedAdd.class);
      }
      
      public AdvancedContextHelp getAdvancedContextHelp() {
        return getOrCreateProperty("AdvancedContextHelp", "AdvancedContextHelp", null, pcftest.ConditionBuilderPanelSet.AdvancedConditionsLV.AdvancedConditionToolbar.AdvancedContextHelp.class);
      }
      
      public AdvancedHidePrettyPrint getAdvancedHidePrettyPrint() {
        return getOrCreateProperty("AdvancedHidePrettyPrint", "AdvancedHidePrettyPrint", null, pcftest.ConditionBuilderPanelSet.AdvancedConditionsLV.AdvancedConditionToolbar.AdvancedHidePrettyPrint.class);
      }
      
      public AdvancedInsert getAdvancedInsert() {
        return getOrCreateProperty("AdvancedInsert", "AdvancedInsert", null, pcftest.ConditionBuilderPanelSet.AdvancedConditionsLV.AdvancedConditionToolbar.AdvancedInsert.class);
      }
      
      public AdvancedMoveDown getAdvancedMoveDown() {
        return getOrCreateProperty("AdvancedMoveDown", "AdvancedMoveDown", null, pcftest.ConditionBuilderPanelSet.AdvancedConditionsLV.AdvancedConditionToolbar.AdvancedMoveDown.class);
      }
      
      public AdvancedMoveUp getAdvancedMoveUp() {
        return getOrCreateProperty("AdvancedMoveUp", "AdvancedMoveUp", null, pcftest.ConditionBuilderPanelSet.AdvancedConditionsLV.AdvancedConditionToolbar.AdvancedMoveUp.class);
      }
      
      public AdvancedRemove getAdvancedRemove() {
        return getOrCreateProperty("AdvancedRemove", "AdvancedRemove", null, pcftest.ConditionBuilderPanelSet.AdvancedConditionsLV.AdvancedConditionToolbar.AdvancedRemove.class);
      }
      
      public AdvancedShowPrettyPrint getAdvancedShowPrettyPrint() {
        return getOrCreateProperty("AdvancedShowPrettyPrint", "AdvancedShowPrettyPrint", null, pcftest.ConditionBuilderPanelSet.AdvancedConditionsLV.AdvancedConditionToolbar.AdvancedShowPrettyPrint.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AdvancedAdd extends ClickableActionElement {
        public AdvancedAdd(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AdvancedContextHelp extends ClickableActionElement {
        public AdvancedContextHelp(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ContextHelp click() {
          return clickThis(pcftest.ContextHelp.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AdvancedHidePrettyPrint extends ClickableActionElement {
        public AdvancedHidePrettyPrint(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AdvancedInsert extends ClickableActionElement {
        public AdvancedInsert(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AdvancedMoveDown extends ClickableActionElement {
        public AdvancedMoveDown(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AdvancedMoveUp extends ClickableActionElement {
        public AdvancedMoveUp(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AdvancedRemove extends ClickableActionElement {
        public AdvancedRemove(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AdvancedShowPrettyPrint extends ClickableActionElement {
        public AdvancedShowPrettyPrint(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ConditionValidationErrorsWhenReadOnlyDV extends DetailViewElement {
    public ConditionValidationErrorsWhenReadOnlyDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidationErrorsInputSet getValidationErrorsInputSet() {
      return getOrCreateProperty("ValidationErrorsInputSet", "ValidationErrorsInputSet", null, pcftest.ValidationErrorsInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PrettyPrintWrapperPanelSet extends PCFElement {
    public PrettyPrintWrapperPanelSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleConditionTypeDV extends DetailViewElement {
    public RuleConditionTypeDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ConditionType getConditionType() {
      return getOrCreateProperty("ConditionType", "ConditionType", null, pcftest.ConditionBuilderPanelSet.RuleConditionTypeDV.ConditionType.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ConditionType extends SelectElement {
      public ConditionType(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(RuleConditionType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public RuleConditionType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.RuleConditionType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(RuleConditionType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SimpleConditionsLV extends PCFElement {
    public SimpleConditionsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ConditionBuilderLV getConditionBuilderLV() {
      return getOrCreateProperty("ConditionBuilderLV", "ConditionBuilderLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ConditionBuilderLV.class);
    }
    
    public SimpleConditionToolbar getSimpleConditionToolbar() {
      return getOrCreateProperty("SimpleConditionToolbar", "SimpleConditionToolbar", null, pcftest.ConditionBuilderPanelSet.SimpleConditionsLV.SimpleConditionToolbar.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SimpleConditionToolbar extends PCFElement {
      public SimpleConditionToolbar(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public SimpleAdd getSimpleAdd() {
        return getOrCreateProperty("SimpleAdd", "SimpleAdd", null, pcftest.ConditionBuilderPanelSet.SimpleConditionsLV.SimpleConditionToolbar.SimpleAdd.class);
      }
      
      public SimpleContextHelp getSimpleContextHelp() {
        return getOrCreateProperty("SimpleContextHelp", "SimpleContextHelp", null, pcftest.ConditionBuilderPanelSet.SimpleConditionsLV.SimpleConditionToolbar.SimpleContextHelp.class);
      }
      
      public SimpleHidePrettyPrint getSimpleHidePrettyPrint() {
        return getOrCreateProperty("SimpleHidePrettyPrint", "SimpleHidePrettyPrint", null, pcftest.ConditionBuilderPanelSet.SimpleConditionsLV.SimpleConditionToolbar.SimpleHidePrettyPrint.class);
      }
      
      public SimpleInsert getSimpleInsert() {
        return getOrCreateProperty("SimpleInsert", "SimpleInsert", null, pcftest.ConditionBuilderPanelSet.SimpleConditionsLV.SimpleConditionToolbar.SimpleInsert.class);
      }
      
      public SimpleMoveDown getSimpleMoveDown() {
        return getOrCreateProperty("SimpleMoveDown", "SimpleMoveDown", null, pcftest.ConditionBuilderPanelSet.SimpleConditionsLV.SimpleConditionToolbar.SimpleMoveDown.class);
      }
      
      public SimpleMoveUp getSimpleMoveUp() {
        return getOrCreateProperty("SimpleMoveUp", "SimpleMoveUp", null, pcftest.ConditionBuilderPanelSet.SimpleConditionsLV.SimpleConditionToolbar.SimpleMoveUp.class);
      }
      
      public SimpleRemove getSimpleRemove() {
        return getOrCreateProperty("SimpleRemove", "SimpleRemove", null, pcftest.ConditionBuilderPanelSet.SimpleConditionsLV.SimpleConditionToolbar.SimpleRemove.class);
      }
      
      public SimpleShowPrettyPrint getSimpleShowPrettyPrint() {
        return getOrCreateProperty("SimpleShowPrettyPrint", "SimpleShowPrettyPrint", null, pcftest.ConditionBuilderPanelSet.SimpleConditionsLV.SimpleConditionToolbar.SimpleShowPrettyPrint.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SimpleAdd extends ClickableActionElement {
        public SimpleAdd(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SimpleContextHelp extends ClickableActionElement {
        public SimpleContextHelp(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ContextHelp click() {
          return clickThis(pcftest.ContextHelp.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SimpleHidePrettyPrint extends ClickableActionElement {
        public SimpleHidePrettyPrint(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SimpleInsert extends ClickableActionElement {
        public SimpleInsert(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SimpleMoveDown extends ClickableActionElement {
        public SimpleMoveDown(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SimpleMoveUp extends ClickableActionElement {
        public SimpleMoveUp(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SimpleRemove extends ClickableActionElement {
        public SimpleRemove(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SimpleShowPrettyPrint extends ClickableActionElement {
        public SimpleShowPrettyPrint(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ValidationErrorsDV extends DetailViewElement {
    public ValidationErrorsDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidationErrorsInputSet getValidationErrorsInputSet() {
      return getOrCreateProperty("ValidationErrorsInputSet", "ValidationErrorsInputSet", null, pcftest.ValidationErrorsInputSet.class);
    }
    
    
  }
  
  
}