package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleComparisonCommandParametersInputSet_setfield.only_if_null;
import pcftest.RuleComparisonCommandParametersInputSet_setfield.property2;
import pcftest.RuleComparisonCommandParametersInputSet_setfield.value;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.setfield.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleComparisonCommandParametersInputSet_setfield extends RuleComparisonCommandParametersInputSet {
  public final static String CHECKSUM = "32998b0703f3b2505b8156e0a0cff6fc";
  
  public RuleComparisonCommandParametersInputSet_setfield(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public only_if_null getonly_if_null() {
    return getOrCreateProperty("only_if_null", "only_if_null", null, pcftest.RuleComparisonCommandParametersInputSet_setfield.only_if_null.class);
  }
  
  public property2 getproperty() {
    return getOrCreateProperty("property", "property", null, pcftest.RuleComparisonCommandParametersInputSet_setfield.property2.class);
  }
  
  public value getvalue() {
    return getOrCreateProperty("value", "value", null, pcftest.RuleComparisonCommandParametersInputSet_setfield.value.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.setfield.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class only_if_null extends PCFElement {
    public only_if_null(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowBooleanInputSet getRuleComparisonRowBooleanInputSet() {
      return getOrCreateProperty("RuleComparisonRowBooleanInputSet", "RuleComparisonRowBooleanInputSet", null, pcftest.RuleComparisonRowBooleanInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.setfield.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class property2 extends PCFElement {
    public property2(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandParametersInputSet.setfield.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class value extends PCFElement {
    public value(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  
}