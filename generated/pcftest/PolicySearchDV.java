package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/PolicySearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicySearchDV extends DetailViewElement {
  public final static String CHECKSUM = "31d5c9e5a881a7e8c0fda7d4f3767d6a";
  
  public PolicySearchDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public PolicySearchInsuredInputSet_default getPolicySearchInsuredInputSet_default() {
    return getOrCreateProperty("PolicySearchInsuredInputSet_default", "PolicySearchInsuredInputSet", null, pcftest.PolicySearchInsuredInputSet_default.class);
  }
  
  public PolicySearchPolicyInputSet getPolicySearchPolicyInputSet() {
    return getOrCreateProperty("PolicySearchPolicyInputSet", "PolicySearchPolicyInputSet", null, pcftest.PolicySearchPolicyInputSet.class);
  }
  
  public SearchAndResetInputSet getSearchAndResetInputSet() {
    return getOrCreateProperty("SearchAndResetInputSet", "SearchAndResetInputSet", null, pcftest.SearchAndResetInputSet.class);
  }
  
  
}