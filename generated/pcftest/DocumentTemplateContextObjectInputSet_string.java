package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/document/DocumentTemplateContextObjectInputSet.string.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentTemplateContextObjectInputSet_string extends DocumentTemplateContextObjectInputSet {
  public final static String CHECKSUM = "c1dfdb20b5fc7535e351f414d9f3207e";
  
  public DocumentTemplateContextObjectInputSet_string(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getDynamicInput() {
    return getOrCreateProperty("DynamicInput", "DynamicInput", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}