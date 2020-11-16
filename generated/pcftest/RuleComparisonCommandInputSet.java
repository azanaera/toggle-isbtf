package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleComparisonCommandInputSet.RuleActionParameters;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleComparisonCommandInputSet extends PCFElement {
  public final static String CHECKSUM = "366c1bae93aae666fb6d45feff69caf1";
  
  public RuleComparisonCommandInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public RuleActionParameters getRuleActionParameters() {
    return getOrCreateProperty("RuleActionParameters", "RuleActionParameters", null, pcftest.RuleComparisonCommandInputSet.RuleActionParameters.class);
  }
  
  public RuleComparisonCommandLabelInputSet getRuleComparisonCommandLabelInputSet() {
    return getOrCreateProperty("RuleComparisonCommandLabelInputSet", "RuleComparisonCommandLabelInputSet", null, pcftest.RuleComparisonCommandLabelInputSet.class);
  }
  
  public RuleComparisonCommandSequenceInputSet getRuleComparisonCommandSequenceInputSet() {
    return getOrCreateProperty("RuleComparisonCommandSequenceInputSet", "RuleComparisonCommandSequenceInputSet", null, pcftest.RuleComparisonCommandSequenceInputSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleActionParameters extends PCFElement {
    public RuleActionParameters(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonCommandParametersInputSet_createexposure getRuleComparisonCommandParametersInputSet_createexposure() {
      return getOrCreateProperty("RuleComparisonCommandParametersInputSet_createexposure", "RuleComparisonCommandParametersInputSet", null, pcftest.RuleComparisonCommandParametersInputSet_createexposure.class);
    }
    
    public RuleComparisonCommandParametersInputSet_createreserve getRuleComparisonCommandParametersInputSet_createreserve() {
      return getOrCreateProperty("RuleComparisonCommandParametersInputSet_createreserve", "RuleComparisonCommandParametersInputSet", null, pcftest.RuleComparisonCommandParametersInputSet_createreserve.class);
    }
    
    public RuleComparisonCommandParametersInputSet_default getRuleComparisonCommandParametersInputSet_default() {
      return getOrCreateProperty("RuleComparisonCommandParametersInputSet_default", "RuleComparisonCommandParametersInputSet", null, pcftest.RuleComparisonCommandParametersInputSet_default.class);
    }
    
    public RuleComparisonCommandParametersInputSet_generateactivity getRuleComparisonCommandParametersInputSet_generateactivity() {
      return getOrCreateProperty("RuleComparisonCommandParametersInputSet_generateactivity", "RuleComparisonCommandParametersInputSet", null, pcftest.RuleComparisonCommandParametersInputSet_generateactivity.class);
    }
    
    public RuleComparisonCommandParametersInputSet_generatehistoryevent getRuleComparisonCommandParametersInputSet_generatehistoryevent() {
      return getOrCreateProperty("RuleComparisonCommandParametersInputSet_generatehistoryevent", "RuleComparisonCommandParametersInputSet", null, pcftest.RuleComparisonCommandParametersInputSet_generatehistoryevent.class);
    }
    
    public RuleComparisonCommandParametersInputSet_setfield getRuleComparisonCommandParametersInputSet_setfield() {
      return getOrCreateProperty("RuleComparisonCommandParametersInputSet_setfield", "RuleComparisonCommandParametersInputSet", null, pcftest.RuleComparisonCommandParametersInputSet_setfield.class);
    }
    
    
  }
  
  
}