package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/document/DocumentDetailsEditLVPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentDetailsEditLVPanelSet extends PCFElement {
  public final static String CHECKSUM = "ca389f34a519fedd9d61fbe6902dcda7";
  
  public DocumentDetailsEditLVPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DocumentDetailsEditLV getDocumentDetailsEditLV() {
    return getOrCreateProperty("DocumentDetailsEditLV", "DocumentDetailsEditLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DocumentDetailsEditLV.class);
  }
  
  
}