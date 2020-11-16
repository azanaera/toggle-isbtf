package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DocumentTemplateContextObjectIteratorInputSet_default.entry;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/document/DocumentTemplateContextObjectIteratorInputSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentTemplateContextObjectIteratorInputSet_default extends DocumentTemplateContextObjectIteratorInputSet {
  public final static String CHECKSUM = "4e380b884a21345dffa1fb1f52f37d68";
  
  public DocumentTemplateContextObjectIteratorInputSet_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.DocumentTemplateContextObjectIteratorInputSet_default.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/document/DocumentTemplateContextObjectIteratorInputSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DocumentTemplateContextObjectInputSet_contact getDocumentTemplateContextObjectInputSet_contact() {
      return getOrCreateProperty("DocumentTemplateContextObjectInputSet_contact", "DocumentTemplateContextObjectInputSet", null, pcftest.DocumentTemplateContextObjectInputSet_contact.class);
    }
    
    public DocumentTemplateContextObjectInputSet_default getDocumentTemplateContextObjectInputSet_default() {
      return getOrCreateProperty("DocumentTemplateContextObjectInputSet_default", "DocumentTemplateContextObjectInputSet", null, pcftest.DocumentTemplateContextObjectInputSet_default.class);
    }
    
    public DocumentTemplateContextObjectInputSet_string getDocumentTemplateContextObjectInputSet_string() {
      return getOrCreateProperty("DocumentTemplateContextObjectInputSet_string", "DocumentTemplateContextObjectInputSet", null, pcftest.DocumentTemplateContextObjectInputSet_string.class);
    }
    
    public DocumentTemplateContextObjectInputSet_text getDocumentTemplateContextObjectInputSet_text() {
      return getOrCreateProperty("DocumentTemplateContextObjectInputSet_text", "DocumentTemplateContextObjectInputSet", null, pcftest.DocumentTemplateContextObjectInputSet_text.class);
    }
    
    
  }
  
  
}