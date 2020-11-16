package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsEmptyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ProfilerResultsEmptyDV extends DetailViewElement {
  public final static String CHECKSUM = "146900b2d320d7101e62861df860fb7f";
  
  public ProfilerResultsEmptyDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getNotFound() {
    return getOrCreateProperty("NotFound", "NotFound", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}