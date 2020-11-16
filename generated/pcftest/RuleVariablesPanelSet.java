package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleVariablesPanelSet.RuleVariableLV;
import pcftest.RuleVariablesPanelSet.RuleVariableLV.entry;
import pcftest.RuleVariablesPanelSet.RuleVariableLV.entry.ExpressionErrorIcon;
import pcftest.RuleVariablesPanelSet.RuleVariableLV.entry.ExpressionOperandCell;
import pcftest.RuleVariablesPanelSet.RuleVariableLV.entry.ExpressionValidationErrors;
import pcftest.RuleVariablesPanelSet.RuleVariableLV.entry.ExpressionValidationLabel;
import pcftest.RuleVariablesPanelSet.RuleVariableLV.entry.NameValidationErrorIcon;
import pcftest.RuleVariablesPanelSet.RuleVariableLV.entry.NameValidationErrors;
import pcftest.RuleVariablesPanelSet.RuleVariableLV.entry.NameValidationLabel;
import pcftest.RuleVariablesPanelSet.RuleVariableLV_tb;
import pcftest.RuleVariablesPanelSet.RuleVariableLV_tb.Add;
import pcftest.RuleVariablesPanelSet.RuleVariableLV_tb.Remove;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleVariablesPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleVariablesPanelSet extends PCFElement {
  public final static String CHECKSUM = "179d45d400029f64664c3b6fc9fdccc0";
  
  public RuleVariablesPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getNoVariableText() {
    return getOrCreateProperty("NoVariableText", "NoVariableText", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public RuleVariableLV getRuleVariableLV() {
    return getOrCreateProperty("RuleVariableLV", "RuleVariableLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.RuleVariablesPanelSet.RuleVariableLV.class);
  }
  
  public RuleVariableLV_tb getRuleVariableLV_tb() {
    return getOrCreateProperty("RuleVariableLV_tb", "RuleVariableLV_tb", null, pcftest.RuleVariablesPanelSet.RuleVariableLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleVariablesPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleVariableLV extends PCFElement {
    public RuleVariableLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getExpressionID() {
      return getOrCreateProperty("ExpressionID", "ExpressionID", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTypeId() {
      return getOrCreateProperty("TypeId", "TypeId", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getVariableDescriptionID() {
      return getOrCreateProperty("VariableDescriptionID", "VariableDescriptionID", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getVariableNameID() {
      return getOrCreateProperty("VariableNameID", "VariableNameID", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.RuleVariablesPanelSet.RuleVariableLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    public pcftest.RuleVariablesPanelSet.RuleVariableLV._Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.RuleVariablesPanelSet.RuleVariableLV._Select.class);
    }
    
    public pcftest.RuleVariablesPanelSet.RuleVariableLV._ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.RuleVariablesPanelSet.RuleVariableLV._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleVariablesPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleVariablesPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleVariablesPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ExpressionErrorIcon getExpressionErrorIcon() {
        return getOrCreateProperty("ExpressionErrorIcon", "ExpressionErrorIcon", null, pcftest.RuleVariablesPanelSet.RuleVariableLV.entry.ExpressionErrorIcon.class);
      }
      
      public ExpressionOperandCell getExpressionOperandCell() {
        return getOrCreateProperty("ExpressionOperandCell", "ExpressionOperandCell", null, pcftest.RuleVariablesPanelSet.RuleVariableLV.entry.ExpressionOperandCell.class);
      }
      
      public ExpressionValidationErrors getExpressionValidationErrors() {
        return getOrCreateProperty("ExpressionValidationErrors", "ExpressionValidationErrors", null, pcftest.RuleVariablesPanelSet.RuleVariableLV.entry.ExpressionValidationErrors.class);
      }
      
      public ExpressionValidationLabel getExpressionValidationLabel() {
        return getOrCreateProperty("ExpressionValidationLabel", "ExpressionValidationLabel", null, pcftest.RuleVariablesPanelSet.RuleVariableLV.entry.ExpressionValidationLabel.class);
      }
      
      public NameValidationErrorIcon getNameValidationErrorIcon() {
        return getOrCreateProperty("NameValidationErrorIcon", "NameValidationErrorIcon", null, pcftest.RuleVariablesPanelSet.RuleVariableLV.entry.NameValidationErrorIcon.class);
      }
      
      public NameValidationErrors getNameValidationErrors() {
        return getOrCreateProperty("NameValidationErrors", "NameValidationErrors", null, pcftest.RuleVariablesPanelSet.RuleVariableLV.entry.NameValidationErrors.class);
      }
      
      public NameValidationLabel getNameValidationLabel() {
        return getOrCreateProperty("NameValidationLabel", "NameValidationLabel", null, pcftest.RuleVariablesPanelSet.RuleVariableLV.entry.NameValidationLabel.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.RuleVariablesPanelSet.RuleVariableLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.RuleVariablesPanelSet.RuleVariableLV.entry._Select.class);
      }
      
      public pcftest.RuleVariablesPanelSet.RuleVariableLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.RuleVariablesPanelSet.RuleVariableLV.entry._ViewDetail.class);
      }
      
      public ValueElement getvariableDescription() {
        return getOrCreateProperty("variableDescription", "variableDescription", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getvariableName() {
        return getOrCreateProperty("variableName", "variableName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getvariableType() {
        return getOrCreateProperty("variableType", "variableType", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/RuleVariablesPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ExpressionErrorIcon extends ClickableActionElement {
        public ExpressionErrorIcon(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/RuleVariablesPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ExpressionOperandCell extends PCFElement {
        public ExpressionOperandCell(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getExpressionOperandCell() {
          return getOrCreateProperty("ExpressionOperandCell", "ExpressionOperandCell", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public VariableExpressionFragCell_formula getVariableExpressionFragCell_formula() {
          return getOrCreateProperty("VariableExpressionFragCell_formula", "VariableExpressionFragCell", null, pcftest.VariableExpressionFragCell_formula.class);
        }
        
        public VariableExpressionFragCell_nested getVariableExpressionFragCell_nested() {
          return getOrCreateProperty("VariableExpressionFragCell_nested", "VariableExpressionFragCell", null, pcftest.VariableExpressionFragCell_nested.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/RuleVariablesPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ExpressionValidationErrors extends PCFElement {
        public ExpressionValidationErrors(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntries<pcftest.RuleVariablesPanelSet.RuleVariableLV.entry.ExpressionValidationErrors.entry2> get_Entries() {
          return getOrCreateEntries(null, pcftest.RuleVariablesPanelSet.RuleVariableLV.entry.ExpressionValidationErrors.entry2.class, gw.smoketest.platform.web.IteratorEntries.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/bizrules/RuleVariablesPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class entry2 extends PCFElement {
          public entry2(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ValueElement getExpressionValidationError() {
            return getOrCreateProperty("ExpressionValidationError", "ExpressionValidationError", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/RuleVariablesPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ExpressionValidationLabel extends ClickableActionElement {
        public ExpressionValidationLabel(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/RuleVariablesPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NameValidationErrorIcon extends ClickableActionElement {
        public NameValidationErrorIcon(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/RuleVariablesPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NameValidationErrors extends PCFElement {
        public NameValidationErrors(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntries<pcftest.RuleVariablesPanelSet.RuleVariableLV.entry.NameValidationErrors.entry2> get_Entries() {
          return getOrCreateEntries(null, pcftest.RuleVariablesPanelSet.RuleVariableLV.entry.NameValidationErrors.entry2.class, gw.smoketest.platform.web.IteratorEntries.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/bizrules/RuleVariablesPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class entry2 extends PCFElement {
          public entry2(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ValueElement getNameValidationError() {
            return getOrCreateProperty("NameValidationError", "NameValidationError", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/RuleVariablesPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NameValidationLabel extends ClickableActionElement {
        public NameValidationLabel(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/RuleVariablesPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/RuleVariablesPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleVariablesPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleVariableLV_tb extends PCFElement {
    public RuleVariableLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.RuleVariablesPanelSet.RuleVariableLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.RuleVariablesPanelSet.RuleVariableLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleVariablesPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleVariablesPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}