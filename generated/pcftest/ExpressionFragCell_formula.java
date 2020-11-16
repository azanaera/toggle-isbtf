package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ExpressionFragCell_formula.Expression;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ExpressionFragCell.formula.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ExpressionFragCell_formula extends ExpressionFragCell {
  public final static String CHECKSUM = "3dfb76d37839ca446bd5ad97d2de194f";
  
  public ExpressionFragCell_formula(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Expression getExpression() {
    return getOrCreateProperty("Expression", "Expression", null, pcftest.ExpressionFragCell_formula.Expression.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ExpressionFragCell.formula.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Expression extends ValueElement {
    public Expression(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ConditionBuilderExpressionMenuItemSet getConditionBuilderExpressionMenuItemSet() {
      return getOrCreateProperty("ConditionBuilderExpressionMenuItemSet", "ConditionBuilderExpressionMenuItemSet", null, pcftest.ConditionBuilderExpressionMenuItemSet.class);
    }
    
    
  }
  
  
}