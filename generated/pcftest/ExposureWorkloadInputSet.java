package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/shared/ExposureWorkloadInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ExposureWorkloadInputSet extends PCFElement {
  public final static String CHECKSUM = "403d8eeb6bd7b1d9c5f8ff1903b08b31";
  
  public ExposureWorkloadInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getClassification() {
    return getOrCreateProperty("Classification", "Classification", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClassificationWorkload() {
    return getOrCreateProperty("ClassificationWorkload", "ClassificationWorkload", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getSupplementalWorkloadWeight() {
    return getOrCreateProperty("SupplementalWorkloadWeight", "SupplementalWorkloadWeight", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTotalWorkloadWeight() {
    return getOrCreateProperty("TotalWorkloadWeight", "TotalWorkloadWeight", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}