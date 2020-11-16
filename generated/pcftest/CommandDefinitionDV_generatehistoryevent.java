package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CommandDefinitionDV_generatehistoryevent.Description;
import pcftest.CommandDefinitionDV_generatehistoryevent.RelatedToRef;
import pcftest.CommandDefinitionDV_generatehistoryevent.ValidationErrorsType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.generatehistoryevent.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CommandDefinitionDV_generatehistoryevent extends CommandDefinitionDV {
  public final static String CHECKSUM = "11b9b4de6cb65b1388207fb1aa90c00c";
  
  public CommandDefinitionDV_generatehistoryevent(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Description getDescription() {
    return getOrCreateProperty("Description", "Description", null, pcftest.CommandDefinitionDV_generatehistoryevent.Description.class);
  }
  
  public RelatedToRef getRelatedToRef() {
    return getOrCreateProperty("RelatedToRef", "RelatedToRef", null, pcftest.CommandDefinitionDV_generatehistoryevent.RelatedToRef.class);
  }
  
  public SelectElement getTypeInput() {
    return getOrCreateProperty("TypeInput", "TypeInput", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValidationErrorsType getValidationErrorsType() {
    return getOrCreateProperty("ValidationErrorsType", "ValidationErrorsType", null, pcftest.CommandDefinitionDV_generatehistoryevent.ValidationErrorsType.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.generatehistoryevent.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Description extends PCFElement {
    public Description(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidatingCommandParameterInputSet getValidatingCommandParameterInputSet() {
      return getOrCreateProperty("ValidatingCommandParameterInputSet", "ValidatingCommandParameterInputSet", null, pcftest.ValidatingCommandParameterInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.generatehistoryevent.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RelatedToRef extends PCFElement {
    public RelatedToRef(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RelatedToInputSet getRelatedToInputSet() {
      return getOrCreateProperty("RelatedToInputSet", "RelatedToInputSet", null, pcftest.RelatedToInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.generatehistoryevent.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ValidationErrorsType extends PCFElement {
    public ValidationErrorsType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValidationErrorsInputSet getValidationErrorsInputSet() {
      return getOrCreateProperty("ValidationErrorsInputSet", "ValidationErrorsInputSet", null, pcftest.ValidationErrorsInputSet.class);
    }
    
    
  }
  
  
}