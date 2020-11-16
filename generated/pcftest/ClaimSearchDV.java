package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/claims/ClaimSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSearchDV extends DetailViewElement {
  public final static String CHECKSUM = "65cbf9dfe687a71ae4271052b76efac4";
  
  public ClaimSearchDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSearchAndResetInputSet getClaimSearchAndResetInputSet() {
    return getOrCreateProperty("ClaimSearchAndResetInputSet", "ClaimSearchAndResetInputSet", null, pcftest.ClaimSearchAndResetInputSet.class);
  }
  
  public ClaimSearchOptionalInputSet getClaimSearchOptionalInputSet() {
    return getOrCreateProperty("ClaimSearchOptionalInputSet", "ClaimSearchOptionalInputSet", null, pcftest.ClaimSearchOptionalInputSet.class);
  }
  
  public ClaimSearchRequiredInputSet getClaimSearchRequiredInputSet() {
    return getOrCreateProperty("ClaimSearchRequiredInputSet", "ClaimSearchRequiredInputSet", null, pcftest.ClaimSearchRequiredInputSet.class);
  }
  
  public SelectElement getClaimSearchType() {
    return getOrCreateProperty("ClaimSearchType", "ClaimSearchType", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  
}