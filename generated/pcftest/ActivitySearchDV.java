package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/activities/ActivitySearchDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivitySearchDV extends DetailViewElement {
  public final static String CHECKSUM = "e73bc152a07a6f1ba6df600cea5111ec";
  
  public ActivitySearchDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ActivitySearchOptionalInputSet getActivitySearchOptionalInputSet() {
    return getOrCreateProperty("ActivitySearchOptionalInputSet", "ActivitySearchOptionalInputSet", null, pcftest.ActivitySearchOptionalInputSet.class);
  }
  
  public ActivitySearchRequiredInputSet getActivitySearchRequiredInputSet() {
    return getOrCreateProperty("ActivitySearchRequiredInputSet", "ActivitySearchRequiredInputSet", null, pcftest.ActivitySearchRequiredInputSet.class);
  }
  
  public SearchAndResetInputSet getSearchAndResetInputSet() {
    return getOrCreateProperty("SearchAndResetInputSet", "SearchAndResetInputSet", null, pcftest.SearchAndResetInputSet.class);
  }
  
  
}