package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/CCAddressBookSearchLocationInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CCAddressBookSearchLocationInputSet extends PCFElement {
  public final static String CHECKSUM = "b6b184a4e916d6eaea15d66bcaea5718";
  
  public CCAddressBookSearchLocationInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CCAddressInputSet getCCAddressInputSet() {
    return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
  }
  
  
}