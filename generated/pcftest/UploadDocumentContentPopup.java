package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.UploadDocumentContentPopup.Cancel;
import pcftest.UploadDocumentContentPopup.Edit;
import pcftest.UploadDocumentContentPopup.Update;
import pcftest.UploadDocumentContentPopup.UploadDV;
import pcftest.UploadDocumentContentPopup.UploadDV.Attachment;
import pcftest.UploadDocumentContentPopup.UploadDocumentContentPopup_UpLink;
import pcftest.UploadDocumentContentPopup._Paging;
import pcftest.UploadDocumentContentPopup.__crumb__;
import pcftest.UploadDocumentContentPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/documents/UploadDocumentContentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UploadDocumentContentPopup extends PCFLocation {
  public final static String CHECKSUM = "70e1c6348ac8557caf781e4a7a30f1a4";
  
  public UploadDocumentContentPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("UploadDocumentContentPopup"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.UploadDocumentContentPopup.Cancel.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.UploadDocumentContentPopup.Edit.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.UploadDocumentContentPopup.Update.class);
  }
  
  public UploadDV getUploadDV() {
    return getOrCreateProperty("UploadDV", "UploadDV", null, pcftest.UploadDocumentContentPopup.UploadDV.class);
  }
  
  public UploadDocumentContentPopup_UpLink getUploadDocumentContentPopup_UpLink() {
    return getOrCreateProperty("UploadDocumentContentPopup_UpLink", "UploadDocumentContentPopup_UpLink", null, pcftest.UploadDocumentContentPopup.UploadDocumentContentPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.UploadDocumentContentPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.UploadDocumentContentPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.UploadDocumentContentPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/documents/UploadDocumentContentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/documents/UploadDocumentContentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/documents/UploadDocumentContentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/documents/UploadDocumentContentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UploadDV extends DetailViewElement {
    public UploadDV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Attachment getAttachment() {
      return getOrCreateProperty("Attachment", "Attachment", null, pcftest.UploadDocumentContentPopup.UploadDV.Attachment.class);
    }
    
    public ValueElement getDocType() {
      return getOrCreateProperty("DocType", "DocType", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/documents/UploadDocumentContentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Attachment extends ValueElement {
      public Attachment(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/documents/UploadDocumentContentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UploadDocumentContentPopup_UpLink extends ClickableActionElement {
    public UploadDocumentContentPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/documents/UploadDocumentContentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/documents/UploadDocumentContentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/documents/UploadDocumentContentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}