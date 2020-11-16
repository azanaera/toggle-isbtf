package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CommandParameterInputSet_formula.Expression;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/CommandParameterInputSet.formula.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CommandParameterInputSet_formula extends CommandParameterInputSet {
  public final static String CHECKSUM = "401dd8f1cd7916b7a6ea060ab30de5cd";
  
  public CommandParameterInputSet_formula(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Expression getExpression() {
    return getOrCreateProperty("Expression", "Expression", null, pcftest.CommandParameterInputSet_formula.Expression.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandParameterInputSet.formula.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Expression extends ValueElement {
    public Expression(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CommandParameterMenuItemSet getCommandParameterMenuItemSet() {
      return getOrCreateProperty("CommandParameterMenuItemSet", "CommandParameterMenuItemSet", null, pcftest.CommandParameterMenuItemSet.class);
    }
    
    
  }
  
  
}