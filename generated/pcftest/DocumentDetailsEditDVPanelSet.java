package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/document/DocumentDetailsEditDVPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentDetailsEditDVPanelSet extends PCFElement {
  public final static String CHECKSUM = "9bef6ac82f0318d0a4d788c94ace3090";
  
  public DocumentDetailsEditDVPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DocumentDetailsEditInputSet_default getDocumentDetailsEditInputSet_default() {
    return getOrCreateProperty("DocumentDetailsEditInputSet_default", "DocumentDetailsEditInputSet", null, pcftest.DocumentDetailsEditInputSet_default.class);
  }
  
  public DocumentDetailsEditInputSet_email_sent getDocumentDetailsEditInputSet_email_sent() {
    return getOrCreateProperty("DocumentDetailsEditInputSet_email_sent", "DocumentDetailsEditInputSet", null, pcftest.DocumentDetailsEditInputSet_email_sent.class);
  }
  
  
}