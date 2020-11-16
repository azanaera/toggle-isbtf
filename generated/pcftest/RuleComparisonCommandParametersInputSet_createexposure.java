package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleComparisonCommandParametersInputSet_createexposure.coveragesubtype;
import pcftest.RuleComparisonCommandParametersInputSet_createexposure.coveragetype;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.createexposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleComparisonCommandParametersInputSet_createexposure extends RuleComparisonCommandParametersInputSet {
  public final static String CHECKSUM = "325d10e92b5125cc8dc56fd69ffeadec";
  
  public RuleComparisonCommandParametersInputSet_createexposure(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public coveragesubtype getcoveragesubtype() {
    return getOrCreateProperty("coveragesubtype", "coveragesubtype", null, pcftest.RuleComparisonCommandParametersInputSet_createexposure.coveragesubtype.class);
  }
  
  public coveragetype getcoveragetype() {
    return getOrCreateProperty("coveragetype", "coveragetype", null, pcftest.RuleComparisonCommandParametersInputSet_createexposure.coveragetype.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.createexposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class coveragesubtype extends PCFElement {
    public coveragesubtype(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.createexposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class coveragetype extends PCFElement {
    public coveragetype(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  
}