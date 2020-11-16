package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CommandParameterInputSet_template.TemplateExpression;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/CommandParameterInputSet.template.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CommandParameterInputSet_template extends CommandParameterInputSet {
  public final static String CHECKSUM = "b9fc455c93861d2d9e42aa56d4930b60";
  
  public CommandParameterInputSet_template(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public TemplateExpression getTemplateExpression() {
    return getOrCreateProperty("TemplateExpression", "TemplateExpression", null, pcftest.CommandParameterInputSet_template.TemplateExpression.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandParameterInputSet.template.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TemplateExpression extends ValueElement {
    public TemplateExpression(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CommandParameterMenuItemSet getCommandParameterMenuItemSet() {
      return getOrCreateProperty("CommandParameterMenuItemSet", "CommandParameterMenuItemSet", null, pcftest.CommandParameterMenuItemSet.class);
    }
    
    
  }
  
  
}