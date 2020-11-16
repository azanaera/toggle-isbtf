package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.UploadDocumentScreen.Cancel;
import pcftest.UploadDocumentScreen.CustomUpdate;
import pcftest.UploadDocumentScreen.DocumentDetailsEditLVPanelToolbar;
import pcftest.UploadDocumentScreen.DocumentDetailsEditLVPanelToolbar.EditDocumentCreationInfo;
import pcftest.UploadDocumentScreen.DocumentDetailsEditLVPanelToolbar.RemoveDocumentCreationInfo;
import pcftest.UploadDocumentScreen.Edit;
import pcftest.UploadDocumentScreen.FileInput;
import pcftest.UploadDocumentScreen.Update;
import pcftest.UploadDocumentScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/document/UploadDocumentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UploadDocumentScreen extends PCFElement {
  public final static String CHECKSUM = "8ab085968df0ee2bc2ad01b4b1749eac";
  
  public UploadDocumentScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.UploadDocumentScreen.Cancel.class);
  }
  
  public CustomUpdate getCustomUpdate() {
    return getOrCreateProperty("CustomUpdate", "CustomUpdate", null, pcftest.UploadDocumentScreen.CustomUpdate.class);
  }
  
  public DocumentDetailsEditLVPanelSet getDocumentDetailsEditLVPanelSet() {
    return getOrCreateProperty("DocumentDetailsEditLVPanelSet", "DocumentDetailsEditLVPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.DocumentDetailsEditLVPanelSet.class);
  }
  
  public DocumentDetailsEditLVPanelToolbar getDocumentDetailsEditLVPanelToolbar() {
    return getOrCreateProperty("DocumentDetailsEditLVPanelToolbar", "DocumentDetailsEditLVPanelToolbar", null, pcftest.UploadDocumentScreen.DocumentDetailsEditLVPanelToolbar.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.UploadDocumentScreen.Edit.class);
  }
  
  public FileInput getFileInput() {
    return getOrCreateProperty("FileInput", "FileInput", null, pcftest.UploadDocumentScreen.FileInput.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.UploadDocumentScreen.Update.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.UploadDocumentScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/document/UploadDocumentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/document/UploadDocumentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CustomUpdate extends ClickableActionElement {
    public CustomUpdate(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/document/UploadDocumentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DocumentDetailsEditLVPanelToolbar extends PCFElement {
    public DocumentDetailsEditLVPanelToolbar(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EditDocumentCreationInfo getEditDocumentCreationInfo() {
      return getOrCreateProperty("EditDocumentCreationInfo", "EditDocumentCreationInfo", null, pcftest.UploadDocumentScreen.DocumentDetailsEditLVPanelToolbar.EditDocumentCreationInfo.class);
    }
    
    public RemoveDocumentCreationInfo getRemoveDocumentCreationInfo() {
      return getOrCreateProperty("RemoveDocumentCreationInfo", "RemoveDocumentCreationInfo", null, pcftest.UploadDocumentScreen.DocumentDetailsEditLVPanelToolbar.RemoveDocumentCreationInfo.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/document/UploadDocumentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditDocumentCreationInfo extends ClickableActionElement {
      public EditDocumentCreationInfo(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/document/UploadDocumentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RemoveDocumentCreationInfo extends ClickableActionElement {
      public RemoveDocumentCreationInfo(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/document/UploadDocumentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/document/UploadDocumentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FileInput extends ValueElement {
    public FileInput(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/document/UploadDocumentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/document/UploadDocumentScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}