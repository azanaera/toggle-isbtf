package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.VariableExpressionFragCell_formula.Expression;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/VariableExpressionFragCell.formula.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class VariableExpressionFragCell_formula extends VariableExpressionFragCell {
  public final static String CHECKSUM = "756b292cf274aa53ea90864063a40c8d";
  
  public VariableExpressionFragCell_formula(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Expression getExpression() {
    return getOrCreateProperty("Expression", "Expression", null, pcftest.VariableExpressionFragCell_formula.Expression.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/VariableExpressionFragCell.formula.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Expression extends ValueElement {
    public Expression(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleVariableBuilderExpressionMenuItemSet getRuleVariableBuilderExpressionMenuItemSet() {
      return getOrCreateProperty("RuleVariableBuilderExpressionMenuItemSet", "RuleVariableBuilderExpressionMenuItemSet", null, pcftest.RuleVariableBuilderExpressionMenuItemSet.class);
    }
    
    
  }
  
  
}