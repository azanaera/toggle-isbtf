package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DocumentDetailsEditInputSet_email_sent.Section;
import pcftest.DocumentDetailsEditInputSet_email_sent.SecurityType;
import typekey.DocumentSection;
import typekey.DocumentSecurityType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditInputSet.email_sent.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentDetailsEditInputSet_email_sent extends DocumentDetailsEditInputSet {
  public final static String CHECKSUM = "6f2e0565197a7c4d4a332fa564081765";
  
  public DocumentDetailsEditInputSet_email_sent(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAuthor() {
    return getOrCreateProperty("Author", "Author", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getCreateTime() {
    return getOrCreateProperty("CreateTime", "CreateTime", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SelectElement getLanguage() {
    return getOrCreateProperty("Language", "Language", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getName() {
    return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getRecipient() {
    return getOrCreateProperty("Recipient", "Recipient", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Section getSection() {
    return getOrCreateProperty("Section", "Section", null, pcftest.DocumentDetailsEditInputSet_email_sent.Section.class);
  }
  
  public SecurityType getSecurityType() {
    return getOrCreateProperty("SecurityType", "SecurityType", null, pcftest.DocumentDetailsEditInputSet_email_sent.SecurityType.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditInputSet.email_sent.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Section extends SelectElement {
    public Section(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(DocumentSection arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public DocumentSection getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.DocumentSection.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(DocumentSection arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/DocumentDetailsEditInputSet.email_sent.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SecurityType extends SelectElement {
    public SecurityType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(DocumentSecurityType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public DocumentSecurityType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.DocumentSecurityType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(DocumentSecurityType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}