package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/PrimaryAddressInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PrimaryAddressInputSet extends PCFElement {
  public final static String CHECKSUM = "85a29317f08c9733f2c6fbf95fd355f5";
  
  public PrimaryAddressInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CCAddressInputSet getCCAddressInputSet() {
    return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
  }
  
  
}