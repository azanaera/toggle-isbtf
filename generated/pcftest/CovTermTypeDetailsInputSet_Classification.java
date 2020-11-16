package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/CovTerm/CovTermTypeDetailsInputSet.Classification.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CovTermTypeDetailsInputSet_Classification extends CovTermTypeDetailsInputSet {
  public final static String CHECKSUM = "b56c0cd4445dc457145c2604f3cd6a19";
  
  public CovTermTypeDetailsInputSet_Classification(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getCode() {
    return getOrCreateProperty("Code", "Code", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}