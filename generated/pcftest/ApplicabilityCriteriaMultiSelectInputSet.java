package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.MultiSelectElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ApplicabilityCriteriaMultiSelectInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ApplicabilityCriteriaMultiSelectInputSet extends PCFElement {
  public final static String CHECKSUM = "1c5fb01d048b879223925f4187d95429";
  
  public ApplicabilityCriteriaMultiSelectInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BooleanValueElement getAnyOrSelection() {
    return getOrCreateProperty("AnyOrSelection", "AnyOrSelection", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public MultiSelectElement getInputWidget() {
    return getOrCreateProperty("InputWidget", "InputWidget", null, gw.smoketest.platform.web.MultiSelectElement.class);
  }
  
  
}