package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DocumentDetailsPopup.DocumentDetailsPopup_UpLink;
import pcftest.DocumentDetailsPopup.DocumentDetailsScreen;
import pcftest.DocumentDetailsPopup.DocumentDetailsScreen.Cancel;
import pcftest.DocumentDetailsPopup.DocumentDetailsScreen.ContentlessNoActionsText;
import pcftest.DocumentDetailsPopup.DocumentDetailsScreen.ContentlessNoActionsText.CloseBtn;
import pcftest.DocumentDetailsPopup.DocumentDetailsScreen.DownloadLink;
import pcftest.DocumentDetailsPopup.DocumentDetailsScreen.Edit;
import pcftest.DocumentDetailsPopup.DocumentDetailsScreen.Update;
import pcftest.DocumentDetailsPopup.DocumentDetailsScreen._msgs;
import pcftest.DocumentDetailsPopup._Paging;
import pcftest.DocumentDetailsPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/documents/DocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DocumentDetailsPopup extends PCFLocation {
  public final static String CHECKSUM = "289b23b31a8b644d41b5999d3a3262d9";
  
  public DocumentDetailsPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DocumentDetailsPopup"));
  }
  
  public DocumentDetailsPopup_UpLink getDocumentDetailsPopup_UpLink() {
    return getOrCreateProperty("DocumentDetailsPopup_UpLink", "DocumentDetailsPopup_UpLink", null, pcftest.DocumentDetailsPopup.DocumentDetailsPopup_UpLink.class);
  }
  
  public DocumentDetailsScreen getDocumentDetailsScreen() {
    return getOrCreateProperty("DocumentDetailsScreen", "DocumentDetailsScreen", null, pcftest.DocumentDetailsPopup.DocumentDetailsScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DocumentDetailsPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DocumentDetailsPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/documents/DocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DocumentDetailsPopup_UpLink extends ClickableActionElement {
    public DocumentDetailsPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/documents/DocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DocumentDetailsScreen extends PCFElement {
    public DocumentDetailsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.DocumentDetailsPopup.DocumentDetailsScreen.Cancel.class);
    }
    
    public ContentlessNoActionsText getContentlessNoActionsText() {
      return getOrCreateProperty("ContentlessNoActionsText", "ContentlessNoActionsText", null, pcftest.DocumentDetailsPopup.DocumentDetailsScreen.ContentlessNoActionsText.class);
    }
    
    public DocumentDetailsEditInputSet_default getDocumentDetailsEditInputSet_default() {
      return getOrCreateProperty("DocumentDetailsEditInputSet_default", "DocumentDetailsEditInputSet", null, pcftest.DocumentDetailsEditInputSet_default.class);
    }
    
    public DocumentDetailsEditInputSet_email_sent getDocumentDetailsEditInputSet_email_sent() {
      return getOrCreateProperty("DocumentDetailsEditInputSet_email_sent", "DocumentDetailsEditInputSet", null, pcftest.DocumentDetailsEditInputSet_email_sent.class);
    }
    
    public DocumentDetailsEditSupplementalInputSet getDocumentDetailsEditSupplementalInputSet() {
      return getOrCreateProperty("DocumentDetailsEditSupplementalInputSet", "DocumentDetailsEditSupplementalInputSet", null, pcftest.DocumentDetailsEditSupplementalInputSet.class);
    }
    
    public DownloadLink getDownloadLink() {
      return getOrCreateProperty("DownloadLink", "DownloadLink", null, pcftest.DocumentDetailsPopup.DocumentDetailsScreen.DownloadLink.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.DocumentDetailsPopup.DocumentDetailsScreen.Edit.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.DocumentDetailsPopup.DocumentDetailsScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DocumentDetailsPopup.DocumentDetailsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/documents/DocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/documents/DocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ContentlessNoActionsText extends ClickableActionElement {
      public ContentlessNoActionsText(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CloseBtn getCloseBtn() {
        return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.DocumentDetailsPopup.DocumentDetailsScreen.ContentlessNoActionsText.CloseBtn.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/documents/DocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CloseBtn extends ClickableActionElement {
        public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/documents/DocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DownloadLink extends ClickableActionElement {
      public DownloadLink(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/documents/DocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/documents/DocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/documents/DocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/documents/DocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/documents/DocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}