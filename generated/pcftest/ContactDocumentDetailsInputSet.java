package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ContactDocumentDetailsInputSet.NameLink;
import pcftest.ContactDocumentDetailsInputSet.SecurityType;
import pcftest.ContactDocumentDetailsInputSet.Status;
import pcftest.ContactDocumentDetailsInputSet.Type;
import typekey.DocumentSecurityType;
import typekey.DocumentStatusType;
import typekey.DocumentType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/documents/ContactDocumentDetailsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ContactDocumentDetailsInputSet extends PCFElement {
  public final static String CHECKSUM = "300ee840631d1e1d25a7fdef9401af24";
  
  public ContactDocumentDetailsInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAuthor() {
    return getOrCreateProperty("Author", "Author", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SelectElement getLanguage() {
    return getOrCreateProperty("Language", "Language", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getMimeType() {
    return getOrCreateProperty("MimeType", "MimeType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public NameLink getNameLink() {
    return getOrCreateProperty("NameLink", "NameLink", null, pcftest.ContactDocumentDetailsInputSet.NameLink.class);
  }
  
  public BooleanValueElement getObsolete() {
    return getOrCreateProperty("Obsolete", "Obsolete", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getRecipient() {
    return getOrCreateProperty("Recipient", "Recipient", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SecurityType getSecurityType() {
    return getOrCreateProperty("SecurityType", "SecurityType", null, pcftest.ContactDocumentDetailsInputSet.SecurityType.class);
  }
  
  public Status getStatus() {
    return getOrCreateProperty("Status", "Status", null, pcftest.ContactDocumentDetailsInputSet.Status.class);
  }
  
  public Type getType() {
    return getOrCreateProperty("Type", "Type", null, pcftest.ContactDocumentDetailsInputSet.Type.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/ContactDocumentDetailsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NameLink extends ClickableActionElement {
    public NameLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/ContactDocumentDetailsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/ContactDocumentDetailsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Status extends SelectElement {
    public Status(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(DocumentStatusType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public DocumentStatusType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.DocumentStatusType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(DocumentStatusType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/ContactDocumentDetailsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Type extends SelectElement {
    public Type(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(DocumentType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public DocumentType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.DocumentType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(DocumentType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}