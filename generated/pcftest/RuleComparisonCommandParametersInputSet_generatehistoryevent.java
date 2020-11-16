package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleComparisonCommandParametersInputSet_generatehistoryevent.description;
import pcftest.RuleComparisonCommandParametersInputSet_generatehistoryevent.related_to;
import pcftest.RuleComparisonCommandParametersInputSet_generatehistoryevent.type;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.generatehistoryevent.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleComparisonCommandParametersInputSet_generatehistoryevent extends RuleComparisonCommandParametersInputSet {
  public final static String CHECKSUM = "09bc3e2f4f73a4c44d12611921a0c461";
  
  public RuleComparisonCommandParametersInputSet_generatehistoryevent(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public description getdescription() {
    return getOrCreateProperty("description", "description", null, pcftest.RuleComparisonCommandParametersInputSet_generatehistoryevent.description.class);
  }
  
  public related_to getrelated_to() {
    return getOrCreateProperty("related_to", "related_to", null, pcftest.RuleComparisonCommandParametersInputSet_generatehistoryevent.related_to.class);
  }
  
  public type gettype() {
    return getOrCreateProperty("type", "type", null, pcftest.RuleComparisonCommandParametersInputSet_generatehistoryevent.type.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.generatehistoryevent.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class description extends PCFElement {
    public description(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.generatehistoryevent.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class related_to extends PCFElement {
    public related_to(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.generatehistoryevent.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class type extends PCFElement {
    public type(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowTypeKeyInputSet getRuleComparisonRowTypeKeyInputSet() {
      return getOrCreateProperty("RuleComparisonRowTypeKeyInputSet", "RuleComparisonRowTypeKeyInputSet", null, pcftest.RuleComparisonRowTypeKeyInputSet.class);
    }
    
    
  }
  
  
}