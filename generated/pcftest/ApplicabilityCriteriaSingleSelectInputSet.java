package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ApplicabilityCriteriaSingleSelectInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ApplicabilityCriteriaSingleSelectInputSet extends PCFElement {
  public final static String CHECKSUM = "294c1cb37929362b24bbb706484e9a8c";
  
  public ApplicabilityCriteriaSingleSelectInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SelectElement getInputWidget() {
    return getOrCreateProperty("InputWidget", "InputWidget", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getReadonlyDisplay() {
    return getOrCreateProperty("ReadonlyDisplay", "ReadonlyDisplay", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}