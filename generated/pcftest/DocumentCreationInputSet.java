package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DocumentCreationInputSet.CleanupSavedFile;
import pcftest.DocumentCreationInputSet.ClientUploadedFile;
import pcftest.DocumentCreationInputSet.CreateDocument;
import pcftest.DocumentCreationInputSet.DocumentViewEdit;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/document/DocumentCreationInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentCreationInputSet extends PCFElement {
  public final static String CHECKSUM = "870e2e877ebb036b1078d9c11998a78d";
  
  public DocumentCreationInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CleanupSavedFile getCleanupSavedFile() {
    return getOrCreateProperty("CleanupSavedFile", "CleanupSavedFile", null, pcftest.DocumentCreationInputSet.CleanupSavedFile.class);
  }
  
  public ClientUploadedFile getClientUploadedFile() {
    return getOrCreateProperty("ClientUploadedFile", "ClientUploadedFile", null, pcftest.DocumentCreationInputSet.ClientUploadedFile.class);
  }
  
  public CreateDocument getCreateDocument() {
    return getOrCreateProperty("CreateDocument", "CreateDocument", null, pcftest.DocumentCreationInputSet.CreateDocument.class);
  }
  
  public DocumentViewEdit getDocumentViewEdit() {
    return getOrCreateProperty("DocumentViewEdit", "DocumentViewEdit", null, pcftest.DocumentCreationInputSet.DocumentViewEdit.class);
  }
  
  public ValueElement getUploadStatus() {
    return getOrCreateProperty("UploadStatus", "UploadStatus", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getViewEdit() {
    return getOrCreateProperty("ViewEdit", "ViewEdit", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/document/DocumentCreationInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CleanupSavedFile extends ValueElement {
    public CleanupSavedFile(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/document/DocumentCreationInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClientUploadedFile extends ValueElement {
    public ClientUploadedFile(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/document/DocumentCreationInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CreateDocument extends ValueElement {
    public CreateDocument(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/document/DocumentCreationInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DocumentViewEdit extends ClickableActionElement {
    public DocumentViewEdit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}