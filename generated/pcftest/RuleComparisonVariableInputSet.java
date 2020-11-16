package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleComparisonVariableInputSet.DescriptionRow;
import pcftest.RuleComparisonVariableInputSet.ExpressionRow;
import pcftest.RuleComparisonVariableInputSet.NameRow;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleComparisonVariableInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleComparisonVariableInputSet extends PCFElement {
  public final static String CHECKSUM = "164d0476b7cb4b28c62324064f6f4b34";
  
  public RuleComparisonVariableInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DescriptionRow getDescriptionRow() {
    return getOrCreateProperty("DescriptionRow", "DescriptionRow", null, pcftest.RuleComparisonVariableInputSet.DescriptionRow.class);
  }
  
  public ExpressionRow getExpressionRow() {
    return getOrCreateProperty("ExpressionRow", "ExpressionRow", null, pcftest.RuleComparisonVariableInputSet.ExpressionRow.class);
  }
  
  public NameRow getNameRow() {
    return getOrCreateProperty("NameRow", "NameRow", null, pcftest.RuleComparisonVariableInputSet.NameRow.class);
  }
  
  public RuleComparisonCommandLabelInputSet getRuleComparisonCommandLabelInputSet() {
    return getOrCreateProperty("RuleComparisonCommandLabelInputSet", "RuleComparisonCommandLabelInputSet", null, pcftest.RuleComparisonCommandLabelInputSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonVariableInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DescriptionRow extends PCFElement {
    public DescriptionRow(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowTextAreaInputSet getRuleComparisonRowTextAreaInputSet() {
      return getOrCreateProperty("RuleComparisonRowTextAreaInputSet", "RuleComparisonRowTextAreaInputSet", null, pcftest.RuleComparisonRowTextAreaInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonVariableInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExpressionRow extends PCFElement {
    public ExpressionRow(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonVariableInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NameRow extends PCFElement {
    public NameRow(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  
}