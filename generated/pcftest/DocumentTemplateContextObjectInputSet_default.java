package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/document/DocumentTemplateContextObjectInputSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentTemplateContextObjectInputSet_default extends DocumentTemplateContextObjectInputSet {
  public final static String CHECKSUM = "c941b42ee4f770d56cf14cc3b14bfebe";
  
  public DocumentTemplateContextObjectInputSet_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SelectElement getDynamicInput() {
    return getOrCreateProperty("DynamicInput", "DynamicInput", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  
}