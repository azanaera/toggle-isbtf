package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleComparisonCommandSequenceInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleComparisonCommandSequenceInputSet extends PCFElement {
  public final static String CHECKSUM = "5b2b2a05510756beab175b7f04c4b82d";
  
  public RuleComparisonCommandSequenceInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public RuleComparisonRowIntegerInputSet getRuleComparisonRowIntegerInputSet() {
    return getOrCreateProperty("RuleComparisonRowIntegerInputSet", "RuleComparisonRowIntegerInputSet", null, pcftest.RuleComparisonRowIntegerInputSet.class);
  }
  
  
}