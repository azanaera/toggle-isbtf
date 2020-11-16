package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CommandDefinitionDV_default.entry;
import pcftest.CommandDefinitionDV_default.entry.RuleCommandParameter;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CommandDefinitionDV_default extends CommandDefinitionDV {
  public final static String CHECKSUM = "d672e166ea9d49def04f74cabeb1a659";
  
  public CommandDefinitionDV_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.CommandDefinitionDV_default.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleCommandParameter getRuleCommandParameter() {
      return getOrCreateProperty("RuleCommandParameter", "RuleCommandParameter", null, pcftest.CommandDefinitionDV_default.entry.RuleCommandParameter.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RuleCommandParameter extends PCFElement {
      public RuleCommandParameter(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValidatingCommandParameterInputSet getValidatingCommandParameterInputSet() {
        return getOrCreateProperty("ValidatingCommandParameterInputSet", "ValidatingCommandParameterInputSet", null, pcftest.ValidatingCommandParameterInputSet.class);
      }
      
      
    }
    
    
  }
  
  
}