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
import pcftest.ConditionBuilderLV.entry;
import pcftest.ConditionBuilderLV.entry.AndOr;
import pcftest.ConditionBuilderLV.entry.LeftOperandCell;
import pcftest.ConditionBuilderLV.entry.LeftOperandErrorIcon;
import pcftest.ConditionBuilderLV.entry.LeftOperandErrors;
import pcftest.ConditionBuilderLV.entry.LeftOperandValidationLabel;
import pcftest.ConditionBuilderLV.entry.LeftParens;
import pcftest.ConditionBuilderLV.entry.LineErrorIcon;
import pcftest.ConditionBuilderLV.entry.LineErrors;
import pcftest.ConditionBuilderLV.entry.LineValidationLabel;
import pcftest.ConditionBuilderLV.entry.Operator;
import pcftest.ConditionBuilderLV.entry.RightOperandCell;
import pcftest.ConditionBuilderLV.entry.RightOperandErrorIcon;
import pcftest.ConditionBuilderLV.entry.RightOperandErrors;
import pcftest.ConditionBuilderLV.entry.RightOperandValidationLabel;
import pcftest.ConditionBuilderLV.entry.RightParens;
import typekey.Parentheses;
import typekey.RuleBooleanOperator;
import typekey.RuleOperator;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ConditionBuilderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ConditionBuilderLV extends PCFElement {
  public final static String CHECKSUM = "3dfa55ba8d5b59f27cffdbde28112228";
  
  public ConditionBuilderLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAndOrLabel() {
    return getOrCreateProperty("AndOrLabel", "AndOrLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLeftOperandLabel() {
    return getOrCreateProperty("LeftOperandLabel", "LeftOperandLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLeftParensLabel() {
    return getOrCreateProperty("LeftParensLabel", "LeftParensLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getOperatorLabel() {
    return getOrCreateProperty("OperatorLabel", "OperatorLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getRightOperandLabel() {
    return getOrCreateProperty("RightOperandLabel", "RightOperandLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getRightParensLabel() {
    return getOrCreateProperty("RightParensLabel", "RightParensLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ConditionBuilderLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  public pcftest.ConditionBuilderLV._Select get_Select() {
    return getOrCreateProperty("_Select", "_Select", null, pcftest.ConditionBuilderLV._Select.class);
  }
  
  public pcftest.ConditionBuilderLV._ViewDetail get_ViewDetail() {
    return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ConditionBuilderLV._ViewDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Select extends SelectorCellElement {
    public _Select(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ViewDetail extends BooleanValueElement {
    public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AndOr getAndOr() {
      return getOrCreateProperty("AndOr", "AndOr", null, pcftest.ConditionBuilderLV.entry.AndOr.class);
    }
    
    public LeftOperandCell getLeftOperandCell() {
      return getOrCreateProperty("LeftOperandCell", "LeftOperandCell", null, pcftest.ConditionBuilderLV.entry.LeftOperandCell.class);
    }
    
    public LeftOperandErrorIcon getLeftOperandErrorIcon() {
      return getOrCreateProperty("LeftOperandErrorIcon", "LeftOperandErrorIcon", null, pcftest.ConditionBuilderLV.entry.LeftOperandErrorIcon.class);
    }
    
    public LeftOperandErrors getLeftOperandErrors() {
      return getOrCreateProperty("LeftOperandErrors", "LeftOperandErrors", null, pcftest.ConditionBuilderLV.entry.LeftOperandErrors.class);
    }
    
    public LeftOperandValidationLabel getLeftOperandValidationLabel() {
      return getOrCreateProperty("LeftOperandValidationLabel", "LeftOperandValidationLabel", null, pcftest.ConditionBuilderLV.entry.LeftOperandValidationLabel.class);
    }
    
    public LeftParens getLeftParens() {
      return getOrCreateProperty("LeftParens", "LeftParens", null, pcftest.ConditionBuilderLV.entry.LeftParens.class);
    }
    
    public ValueElement getLeftParensValidationLine() {
      return getOrCreateProperty("LeftParensValidationLine", "LeftParensValidationLine", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getLeftParensValidationLine2() {
      return getOrCreateProperty("LeftParensValidationLine2", "LeftParensValidationLine2", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public LineErrorIcon getLineErrorIcon() {
      return getOrCreateProperty("LineErrorIcon", "LineErrorIcon", null, pcftest.ConditionBuilderLV.entry.LineErrorIcon.class);
    }
    
    public LineErrors getLineErrors() {
      return getOrCreateProperty("LineErrors", "LineErrors", null, pcftest.ConditionBuilderLV.entry.LineErrors.class);
    }
    
    public LineValidationLabel getLineValidationLabel() {
      return getOrCreateProperty("LineValidationLabel", "LineValidationLabel", null, pcftest.ConditionBuilderLV.entry.LineValidationLabel.class);
    }
    
    public Operator getOperator() {
      return getOrCreateProperty("Operator", "Operator", null, pcftest.ConditionBuilderLV.entry.Operator.class);
    }
    
    public ValueElement getOperatorValidationLine() {
      return getOrCreateProperty("OperatorValidationLine", "OperatorValidationLine", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getOperatorValidationLines() {
      return getOrCreateProperty("OperatorValidationLines", "OperatorValidationLines", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public RightOperandCell getRightOperandCell() {
      return getOrCreateProperty("RightOperandCell", "RightOperandCell", null, pcftest.ConditionBuilderLV.entry.RightOperandCell.class);
    }
    
    public RightOperandErrorIcon getRightOperandErrorIcon() {
      return getOrCreateProperty("RightOperandErrorIcon", "RightOperandErrorIcon", null, pcftest.ConditionBuilderLV.entry.RightOperandErrorIcon.class);
    }
    
    public RightOperandErrors getRightOperandErrors() {
      return getOrCreateProperty("RightOperandErrors", "RightOperandErrors", null, pcftest.ConditionBuilderLV.entry.RightOperandErrors.class);
    }
    
    public RightOperandValidationLabel getRightOperandValidationLabel() {
      return getOrCreateProperty("RightOperandValidationLabel", "RightOperandValidationLabel", null, pcftest.ConditionBuilderLV.entry.RightOperandValidationLabel.class);
    }
    
    public ValueElement getRightOperandValidationLines() {
      return getOrCreateProperty("RightOperandValidationLines", "RightOperandValidationLines", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public RightParens getRightParens() {
      return getOrCreateProperty("RightParens", "RightParens", null, pcftest.ConditionBuilderLV.entry.RightParens.class);
    }
    
    public ValueElement getRightParensValidationLine() {
      return getOrCreateProperty("RightParensValidationLine", "RightParensValidationLine", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getRightParensValidationLine2() {
      return getOrCreateProperty("RightParensValidationLine2", "RightParensValidationLine2", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public pcftest.ConditionBuilderLV.entry._Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ConditionBuilderLV.entry._Select.class);
    }
    
    public pcftest.ConditionBuilderLV.entry._ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ConditionBuilderLV.entry._ViewDetail.class);
    }
    
    public ValueElement getempty() {
      return getOrCreateProperty("empty", "empty", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getempty2() {
      return getOrCreateProperty("empty2", "empty2", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AndOr extends SelectElement {
      public AndOr(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(RuleBooleanOperator arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public RuleBooleanOperator getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.RuleBooleanOperator.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(RuleBooleanOperator arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LeftOperandCell extends PCFElement {
      public LeftOperandCell(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ExpressionFragCell_empty getExpressionFragCell_empty() {
        return getOrCreateProperty("ExpressionFragCell_empty", "ExpressionFragCell", null, pcftest.ExpressionFragCell_empty.class);
      }
      
      public ExpressionFragCell_formula getExpressionFragCell_formula() {
        return getOrCreateProperty("ExpressionFragCell_formula", "ExpressionFragCell", null, pcftest.ExpressionFragCell_formula.class);
      }
      
      public ExpressionFragCell_nested getExpressionFragCell_nested() {
        return getOrCreateProperty("ExpressionFragCell_nested", "ExpressionFragCell", null, pcftest.ExpressionFragCell_nested.class);
      }
      
      public ValueElement getLeftOperandCell() {
        return getOrCreateProperty("LeftOperandCell", "LeftOperandCell", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LeftOperandErrorIcon extends ClickableActionElement {
      public LeftOperandErrorIcon(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LeftOperandErrors extends PCFElement {
      public LeftOperandErrors(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.ConditionBuilderLV.entry.LeftOperandErrors.entry2> get_Entries() {
        return getOrCreateEntries(null, pcftest.ConditionBuilderLV.entry.LeftOperandErrors.entry2.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry2 extends PCFElement {
        public entry2(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getLeftOperandError() {
          return getOrCreateProperty("LeftOperandError", "LeftOperandError", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LeftOperandValidationLabel extends ClickableActionElement {
      public LeftOperandValidationLabel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LeftParens extends SelectElement {
      public LeftParens(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(Parentheses arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public Parentheses getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Parentheses.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(Parentheses arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineErrorIcon extends ClickableActionElement {
      public LineErrorIcon(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineErrors extends PCFElement {
      public LineErrors(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.ConditionBuilderLV.entry.LineErrors.entry2> get_Entries() {
        return getOrCreateEntries(null, pcftest.ConditionBuilderLV.entry.LineErrors.entry2.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry2 extends PCFElement {
        public entry2(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getLineError() {
          return getOrCreateProperty("LineError", "LineError", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineValidationLabel extends ClickableActionElement {
      public LineValidationLabel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Operator extends SelectElement {
      public Operator(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(RuleOperator arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public RuleOperator getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.RuleOperator.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(RuleOperator arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RightOperandCell extends PCFElement {
      public RightOperandCell(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ExpressionFragCell_empty getExpressionFragCell_empty() {
        return getOrCreateProperty("ExpressionFragCell_empty", "ExpressionFragCell", null, pcftest.ExpressionFragCell_empty.class);
      }
      
      public ExpressionFragCell_formula getExpressionFragCell_formula() {
        return getOrCreateProperty("ExpressionFragCell_formula", "ExpressionFragCell", null, pcftest.ExpressionFragCell_formula.class);
      }
      
      public ExpressionFragCell_nested getExpressionFragCell_nested() {
        return getOrCreateProperty("ExpressionFragCell_nested", "ExpressionFragCell", null, pcftest.ExpressionFragCell_nested.class);
      }
      
      public ValueElement getRightOperandCell() {
        return getOrCreateProperty("RightOperandCell", "RightOperandCell", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RightOperandErrorIcon extends ClickableActionElement {
      public RightOperandErrorIcon(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RightOperandErrors extends PCFElement {
      public RightOperandErrors(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.ConditionBuilderLV.entry.RightOperandErrors.entry2> get_Entries() {
        return getOrCreateEntries(null, pcftest.ConditionBuilderLV.entry.RightOperandErrors.entry2.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry2 extends PCFElement {
        public entry2(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getRightOperandError() {
          return getOrCreateProperty("RightOperandError", "RightOperandError", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RightOperandValidationLabel extends ClickableActionElement {
      public RightOperandValidationLabel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RightParens extends SelectElement {
      public RightParens(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(Parentheses arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public Parentheses getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Parentheses.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(Parentheses arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/ConditionBuilderLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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