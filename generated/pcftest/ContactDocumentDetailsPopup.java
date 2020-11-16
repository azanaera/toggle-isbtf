package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ContactDocumentDetailsPopup.ContactDocumentDetailsPopup_UpLink;
import pcftest.ContactDocumentDetailsPopup.ContentlessNoActionsText;
import pcftest.ContactDocumentDetailsPopup.ContentlessNoActionsText.CloseBtn;
import pcftest.ContactDocumentDetailsPopup.DownloadLink;
import pcftest.ContactDocumentDetailsPopup._Paging;
import pcftest.ContactDocumentDetailsPopup.__crumb__;
import pcftest.ContactDocumentDetailsPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/contacts/ContactDocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ContactDocumentDetailsPopup extends PCFLocation {
  public final static String CHECKSUM = "db463c8829ed86e6624f8a0c37e49b1f";
  
  public ContactDocumentDetailsPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ContactDocumentDetailsPopup"));
  }
  
  public ContactDocumentDetailsInputSet getContactDocumentDetailsInputSet() {
    return getOrCreateProperty("ContactDocumentDetailsInputSet", "ContactDocumentDetailsInputSet", null, pcftest.ContactDocumentDetailsInputSet.class);
  }
  
  public ContactDocumentDetailsPopup_UpLink getContactDocumentDetailsPopup_UpLink() {
    return getOrCreateProperty("ContactDocumentDetailsPopup_UpLink", "ContactDocumentDetailsPopup_UpLink", null, pcftest.ContactDocumentDetailsPopup.ContactDocumentDetailsPopup_UpLink.class);
  }
  
  public ContentlessNoActionsText getContentlessNoActionsText() {
    return getOrCreateProperty("ContentlessNoActionsText", "ContentlessNoActionsText", null, pcftest.ContactDocumentDetailsPopup.ContentlessNoActionsText.class);
  }
  
  public DownloadLink getDownloadLink() {
    return getOrCreateProperty("DownloadLink", "DownloadLink", null, pcftest.ContactDocumentDetailsPopup.DownloadLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ContactDocumentDetailsPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ContactDocumentDetailsPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ContactDocumentDetailsPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/ContactDocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContactDocumentDetailsPopup_UpLink extends ClickableActionElement {
    public ContactDocumentDetailsPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/ContactDocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContentlessNoActionsText extends ClickableActionElement {
    public ContentlessNoActionsText(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.ContactDocumentDetailsPopup.ContentlessNoActionsText.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/contacts/ContactDocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/contacts/ContactDocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DownloadLink extends ClickableActionElement {
    public DownloadLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/ContactDocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/ContactDocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/contacts/ContactDocumentDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}