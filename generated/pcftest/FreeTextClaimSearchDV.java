package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FreeTextClaimSearchDV extends DetailViewElement {
  public final static String CHECKSUM = "77c12e023614d869b4dc848c3f57865a";
  
  public FreeTextClaimSearchDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSearchAndResetInputSet getClaimSearchAndResetInputSet() {
    return getOrCreateProperty("ClaimSearchAndResetInputSet", "ClaimSearchAndResetInputSet", null, pcftest.ClaimSearchAndResetInputSet.class);
  }
  
  public FreeTextClaimSearchFilterInputSet getFreeTextClaimSearchFilterInputSet() {
    return getOrCreateProperty("FreeTextClaimSearchFilterInputSet", "FreeTextClaimSearchFilterInputSet", null, pcftest.FreeTextClaimSearchFilterInputSet.class);
  }
  
  public FreeTextClaimSearchInputSet getFreeTextClaimSearchInputSet() {
    return getOrCreateProperty("FreeTextClaimSearchInputSet", "FreeTextClaimSearchInputSet", null, pcftest.FreeTextClaimSearchInputSet.class);
  }
  
  
}