package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/document/DocumentTemplateContextObjectInputSet.text.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentTemplateContextObjectInputSet_text extends DocumentTemplateContextObjectInputSet {
  public final static String CHECKSUM = "6381747aff6ae09fb5108d19c93b63eb";
  
  public DocumentTemplateContextObjectInputSet_text(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getDynamicInput() {
    return getOrCreateProperty("DynamicInput", "DynamicInput", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}