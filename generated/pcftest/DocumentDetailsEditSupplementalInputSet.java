package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditSupplementalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentDetailsEditSupplementalInputSet extends PCFElement {
  public final static String CHECKSUM = "49c008e5c4c5787b51799b71ccb5b49d";
  
  public DocumentDetailsEditSupplementalInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BooleanValueElement getObsolete() {
    return getOrCreateProperty("Obsolete", "Obsolete", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  
}