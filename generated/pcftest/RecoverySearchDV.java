package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/recoveries/RecoverySearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RecoverySearchDV extends DetailViewElement {
  public final static String CHECKSUM = "e68c34f31acda62de2dac11f33cccfdb";
  
  public RecoverySearchDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public RecoverySearchOptionalInputSet getRecoverySearchOptionalInputSet() {
    return getOrCreateProperty("RecoverySearchOptionalInputSet", "RecoverySearchOptionalInputSet", null, pcftest.RecoverySearchOptionalInputSet.class);
  }
  
  public RecoverySearchRequiredInputSet getRecoverySearchRequiredInputSet() {
    return getOrCreateProperty("RecoverySearchRequiredInputSet", "RecoverySearchRequiredInputSet", null, pcftest.RecoverySearchRequiredInputSet.class);
  }
  
  public SearchAndResetInputSet getSearchAndResetInputSet() {
    return getOrCreateProperty("SearchAndResetInputSet", "SearchAndResetInputSet", null, pcftest.SearchAndResetInputSet.class);
  }
  
  
}