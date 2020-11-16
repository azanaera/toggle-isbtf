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
import pcftest.NewInvoice.Cancel;
import pcftest.NewInvoice.Edit;
import pcftest.NewInvoice.IDCSDisabledAlert;
import pcftest.NewInvoice.IDCSUnavailableAlert;
import pcftest.NewInvoice.IDMSUnavailableAlert;
import pcftest.NewInvoice.NewInvoice_UpLink;
import pcftest.NewInvoice.StatementDocumentsLV_tb;
import pcftest.NewInvoice.StatementDocumentsLV_tb.AttachDocument;
import pcftest.NewInvoice.StatementDocumentsLV_tb.Link;
import pcftest.NewInvoice.Update;
import pcftest.NewInvoice._Paging;
import pcftest.NewInvoice.__crumb__;
import pcftest.NewInvoice._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/servicerequests/NewInvoice.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewInvoice extends PCFLocation {
  public final static String CHECKSUM = "8226bd01108e12f1ddbbe456d7dc55c8";
  
  public NewInvoice(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewInvoice"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewInvoice.Cancel.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.NewInvoice.Edit.class);
  }
  
  public IDCSDisabledAlert getIDCSDisabledAlert() {
    return getOrCreateProperty("IDCSDisabledAlert", "IDCSDisabledAlert", null, pcftest.NewInvoice.IDCSDisabledAlert.class);
  }
  
  public IDCSUnavailableAlert getIDCSUnavailableAlert() {
    return getOrCreateProperty("IDCSUnavailableAlert", "IDCSUnavailableAlert", null, pcftest.NewInvoice.IDCSUnavailableAlert.class);
  }
  
  public IDMSUnavailableAlert getIDMSUnavailableAlert() {
    return getOrCreateProperty("IDMSUnavailableAlert", "IDMSUnavailableAlert", null, pcftest.NewInvoice.IDMSUnavailableAlert.class);
  }
  
  public NewInvoice_UpLink getNewInvoice_UpLink() {
    return getOrCreateProperty("NewInvoice_UpLink", "NewInvoice_UpLink", null, pcftest.NewInvoice.NewInvoice_UpLink.class);
  }
  
  public StatementDV_invoice getStatementDV_invoice() {
    return getOrCreateProperty("StatementDV_invoice", "StatementDV", null, pcftest.StatementDV_invoice.class);
  }
  
  public StatementDV_quote getStatementDV_quote() {
    return getOrCreateProperty("StatementDV_quote", "StatementDV", null, pcftest.StatementDV_quote.class);
  }
  
  public StatementDV_quoterevision getStatementDV_quoterevision() {
    return getOrCreateProperty("StatementDV_quoterevision", "StatementDV", null, pcftest.StatementDV_quoterevision.class);
  }
  
  public StatementDocumentsLV getStatementDocumentsLV() {
    return getOrCreateProperty("StatementDocumentsLV", "StatementDocumentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.StatementDocumentsLV.class);
  }
  
  public StatementDocumentsLV_tb getStatementDocumentsLV_tb() {
    return getOrCreateProperty("StatementDocumentsLV_tb", "StatementDocumentsLV_tb", null, pcftest.NewInvoice.StatementDocumentsLV_tb.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.NewInvoice.Update.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewInvoice._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewInvoice.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewInvoice._msgs.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/NewInvoice.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/NewInvoice.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/NewInvoice.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IDCSDisabledAlert extends ClickableActionElement {
    public IDCSDisabledAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.NewInvoice.IDCSDisabledAlert.CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.NewInvoice.IDCSDisabledAlert.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/NewInvoice.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/servicerequests/NewInvoice.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IDCSUnavailableAlert extends ClickableActionElement {
    public IDCSUnavailableAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.NewInvoice.IDCSUnavailableAlert.CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.NewInvoice.IDCSUnavailableAlert.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/NewInvoice.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/servicerequests/NewInvoice.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IDMSUnavailableAlert extends ClickableActionElement {
    public IDMSUnavailableAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.NewInvoice.IDMSUnavailableAlert.CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.NewInvoice.IDMSUnavailableAlert.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/NewInvoice.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/servicerequests/NewInvoice.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewInvoice_UpLink extends ClickableActionElement {
    public NewInvoice_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/NewInvoice.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatementDocumentsLV_tb extends PCFElement {
    public StatementDocumentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AttachDocument getAttachDocument() {
      return getOrCreateProperty("AttachDocument", "AttachDocument", null, pcftest.NewInvoice.StatementDocumentsLV_tb.AttachDocument.class);
    }
    
    public Link getLink() {
      return getOrCreateProperty("Link", "Link", null, pcftest.NewInvoice.StatementDocumentsLV_tb.Link.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/NewInvoice.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AttachDocument extends ClickableActionElement {
      public AttachDocument(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AttachStatementDocumentsPopup click() {
        return clickThis(pcftest.AttachStatementDocumentsPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/NewInvoice.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Link extends ClickableActionElement {
      public Link(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PickExistingDocumentPopup click() {
        return clickThis(pcftest.PickExistingDocumentPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/NewInvoice.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/NewInvoice.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/NewInvoice.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/NewInvoice.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}