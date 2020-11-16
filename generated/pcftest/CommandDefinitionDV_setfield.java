package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CommandDefinitionDV_setfield.Field;
import pcftest.CommandDefinitionDV_setfield.NonNull;
import pcftest.CommandDefinitionDV_setfield.ObjectFieldToSetWarnings;
import pcftest.CommandDefinitionDV_setfield.Value;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.setfield.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CommandDefinitionDV_setfield extends CommandDefinitionDV {
  public final static String CHECKSUM = "8ef394bcfcc2c3ffa0c42b33d61d63eb";
  
  public CommandDefinitionDV_setfield(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Field getField() {
    return getOrCreateProperty("Field", "Field", null, pcftest.CommandDefinitionDV_setfield.Field.class);
  }
  
  public NonNull getNonNull() {
    return getOrCreateProperty("NonNull", "NonNull", null, pcftest.CommandDefinitionDV_setfield.NonNull.class);
  }
  
  public ObjectFieldToSetWarnings getObjectFieldToSetWarnings() {
    return getOrCreateProperty("ObjectFieldToSetWarnings", "ObjectFieldToSetWarnings", null, pcftest.CommandDefinitionDV_setfield.ObjectFieldToSetWarnings.class);
  }
  
  public Value getValue() {
    return getOrCreateProperty("Value", "Value", null, pcftest.CommandDefinitionDV_setfield.Value.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.setfield.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Field extends PCFElement {
    public Field(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidatingCommandParameterInputSet getValidatingCommandParameterInputSet() {
      return getOrCreateProperty("ValidatingCommandParameterInputSet", "ValidatingCommandParameterInputSet", null, pcftest.ValidatingCommandParameterInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.setfield.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NonNull extends PCFElement {
    public NonNull(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidatingCommandParameterInputSet getValidatingCommandParameterInputSet() {
      return getOrCreateProperty("ValidatingCommandParameterInputSet", "ValidatingCommandParameterInputSet", null, pcftest.ValidatingCommandParameterInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.setfield.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ObjectFieldToSetWarnings extends PCFElement {
    public ObjectFieldToSetWarnings(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidationWarningsInputSet getValidationWarningsInputSet() {
      return getOrCreateProperty("ValidationWarningsInputSet", "ValidationWarningsInputSet", null, pcftest.ValidationWarningsInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.setfield.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Value extends PCFElement {
    public Value(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidatingCommandParameterInputSet getValidatingCommandParameterInputSet() {
      return getOrCreateProperty("ValidatingCommandParameterInputSet", "ValidatingCommandParameterInputSet", null, pcftest.ValidatingCommandParameterInputSet.class);
    }
    
    
  }
  
  
}