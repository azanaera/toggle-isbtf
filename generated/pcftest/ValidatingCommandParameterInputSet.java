package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ValidatingCommandParameterInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ValidatingCommandParameterInputSet extends PCFElement {
  public final static String CHECKSUM = "ca2e16772b1259c1d42e761566664816";
  
  public ValidatingCommandParameterInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CommandParameterInputSet_bool getCommandParameterInputSet_bool() {
    return getOrCreateProperty("CommandParameterInputSet_bool", "CommandParameterInputSet", null, pcftest.CommandParameterInputSet_bool.class);
  }
  
  public CommandParameterInputSet_date getCommandParameterInputSet_date() {
    return getOrCreateProperty("CommandParameterInputSet_date", "CommandParameterInputSet", null, pcftest.CommandParameterInputSet_date.class);
  }
  
  public CommandParameterInputSet_formula getCommandParameterInputSet_formula() {
    return getOrCreateProperty("CommandParameterInputSet_formula", "CommandParameterInputSet", null, pcftest.CommandParameterInputSet_formula.class);
  }
  
  public CommandParameterInputSet_nested getCommandParameterInputSet_nested() {
    return getOrCreateProperty("CommandParameterInputSet_nested", "CommandParameterInputSet", null, pcftest.CommandParameterInputSet_nested.class);
  }
  
  public CommandParameterInputSet_template getCommandParameterInputSet_template() {
    return getOrCreateProperty("CommandParameterInputSet_template", "CommandParameterInputSet", null, pcftest.CommandParameterInputSet_template.class);
  }
  
  public CommandParameterInputSet_typekey getCommandParameterInputSet_typekey() {
    return getOrCreateProperty("CommandParameterInputSet_typekey", "CommandParameterInputSet", null, pcftest.CommandParameterInputSet_typekey.class);
  }
  
  public ValidationErrorsInputSet getValidationErrorsInputSet() {
    return getOrCreateProperty("ValidationErrorsInputSet", "ValidationErrorsInputSet", null, pcftest.ValidationErrorsInputSet.class);
  }
  
  
}