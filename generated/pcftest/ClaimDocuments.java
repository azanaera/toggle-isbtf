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
import pcftest.ClaimDocuments.ClaimDocuments_UpLink;
import pcftest.ClaimDocuments.Claim_DocumentsScreen;
import pcftest.ClaimDocuments.Claim_DocumentsScreen.DocumentsLV_tb;
import pcftest.ClaimDocuments.Claim_DocumentsScreen.DocumentsLV_tb.AddDocuments;
import pcftest.ClaimDocuments.Claim_DocumentsScreen.DocumentsLV_tb.ClaimDocuments_DeobsolesceButton;
import pcftest.ClaimDocuments.Claim_DocumentsScreen.DocumentsLV_tb.ClaimDocuments_ObsolesceButton;
import pcftest.ClaimDocuments.Claim_DocumentsScreen.DocumentsLV_tb.RefreshAsyncContent;
import pcftest.ClaimDocuments.Claim_DocumentsScreen.IDCSDisabledAlert;
import pcftest.ClaimDocuments.Claim_DocumentsScreen.IDCSUnavailableAlert;
import pcftest.ClaimDocuments.Claim_DocumentsScreen.IDMSUnavailableAlert;
import pcftest.ClaimDocuments.Claim_DocumentsScreen._msgs;
import pcftest.ClaimDocuments._Paging;
import pcftest.ClaimDocuments.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/documents/ClaimDocuments.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimDocuments extends PCFLocation {
  public final static String CHECKSUM = "b5c8401a1fc14f624a65bc056d4306fd";
  
  public ClaimDocuments(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimDocuments"));
  }
  
  public ClaimDocuments_UpLink getClaimDocuments_UpLink() {
    return getOrCreateProperty("ClaimDocuments_UpLink", "ClaimDocuments_UpLink", null, pcftest.ClaimDocuments.ClaimDocuments_UpLink.class);
  }
  
  public Claim_DocumentsScreen getClaim_DocumentsScreen() {
    return getOrCreateProperty("Claim_DocumentsScreen", "Claim_DocumentsScreen", null, pcftest.ClaimDocuments.Claim_DocumentsScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimDocuments._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimDocuments.__crumb__.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/documents/ClaimDocuments.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimDocuments_UpLink extends ClickableActionElement {
    public ClaimDocuments_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/documents/ClaimDocuments.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim_DocumentsScreen extends PCFElement {
    public Claim_DocumentsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimDocumentSearchDV getClaimDocumentSearchDV() {
      return getOrCreateProperty("ClaimDocumentSearchDV", "ClaimDocumentSearchDV", null, pcftest.ClaimDocumentSearchDV.class);
    }
    
    public DocumentsLV getDocumentsLV() {
      return getOrCreateProperty("DocumentsLV", "DocumentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DocumentsLV.class);
    }
    
    public DocumentsLV_tb getDocumentsLV_tb() {
      return getOrCreateProperty("DocumentsLV_tb", "DocumentsLV_tb", null, pcftest.ClaimDocuments.Claim_DocumentsScreen.DocumentsLV_tb.class);
    }
    
    public IDCSDisabledAlert getIDCSDisabledAlert() {
      return getOrCreateProperty("IDCSDisabledAlert", "IDCSDisabledAlert", null, pcftest.ClaimDocuments.Claim_DocumentsScreen.IDCSDisabledAlert.class);
    }
    
    public IDCSUnavailableAlert getIDCSUnavailableAlert() {
      return getOrCreateProperty("IDCSUnavailableAlert", "IDCSUnavailableAlert", null, pcftest.ClaimDocuments.Claim_DocumentsScreen.IDCSUnavailableAlert.class);
    }
    
    public IDMSUnavailableAlert getIDMSUnavailableAlert() {
      return getOrCreateProperty("IDMSUnavailableAlert", "IDMSUnavailableAlert", null, pcftest.ClaimDocuments.Claim_DocumentsScreen.IDMSUnavailableAlert.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimDocuments.Claim_DocumentsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/documents/ClaimDocuments.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DocumentsLV_tb extends PCFElement {
      public DocumentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddDocuments getAddDocuments() {
        return getOrCreateProperty("AddDocuments", "AddDocuments", null, pcftest.ClaimDocuments.Claim_DocumentsScreen.DocumentsLV_tb.AddDocuments.class);
      }
      
      public ClaimDocuments_DeobsolesceButton getClaimDocuments_DeobsolesceButton() {
        return getOrCreateProperty("ClaimDocuments_DeobsolesceButton", "ClaimDocuments_DeobsolesceButton", null, pcftest.ClaimDocuments.Claim_DocumentsScreen.DocumentsLV_tb.ClaimDocuments_DeobsolesceButton.class);
      }
      
      public ClaimDocuments_ObsolesceButton getClaimDocuments_ObsolesceButton() {
        return getOrCreateProperty("ClaimDocuments_ObsolesceButton", "ClaimDocuments_ObsolesceButton", null, pcftest.ClaimDocuments.Claim_DocumentsScreen.DocumentsLV_tb.ClaimDocuments_ObsolesceButton.class);
      }
      
      public RefreshAsyncContent getRefreshAsyncContent() {
        return getOrCreateProperty("RefreshAsyncContent", "RefreshAsyncContent", null, pcftest.ClaimDocuments.Claim_DocumentsScreen.DocumentsLV_tb.RefreshAsyncContent.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/documents/ClaimDocuments.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AddDocuments extends ClickableActionElement {
        public AddDocuments(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimNewDocumentMenuItemSet getClaimNewDocumentMenuItemSet() {
          return getOrCreateProperty("ClaimNewDocumentMenuItemSet", "ClaimNewDocumentMenuItemSet", null, pcftest.ClaimNewDocumentMenuItemSet.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/documents/ClaimDocuments.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimDocuments_DeobsolesceButton extends ClickableActionElement {
        public ClaimDocuments_DeobsolesceButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/documents/ClaimDocuments.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ClaimDocuments_ObsolesceButton extends ClickableActionElement {
        public ClaimDocuments_ObsolesceButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/documents/ClaimDocuments.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class RefreshAsyncContent extends ClickableActionElement {
        public RefreshAsyncContent(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/documents/ClaimDocuments.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class IDCSDisabledAlert extends ClickableActionElement {
      public IDCSDisabledAlert(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.ClaimDocuments.Claim_DocumentsScreen.IDCSDisabledAlert.CloseBtn getCloseBtn() {
        return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.ClaimDocuments.Claim_DocumentsScreen.IDCSDisabledAlert.CloseBtn.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/documents/ClaimDocuments.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/documents/ClaimDocuments.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class IDCSUnavailableAlert extends ClickableActionElement {
      public IDCSUnavailableAlert(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.ClaimDocuments.Claim_DocumentsScreen.IDCSUnavailableAlert.CloseBtn getCloseBtn() {
        return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.ClaimDocuments.Claim_DocumentsScreen.IDCSUnavailableAlert.CloseBtn.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/documents/ClaimDocuments.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/documents/ClaimDocuments.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class IDMSUnavailableAlert extends ClickableActionElement {
      public IDMSUnavailableAlert(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.ClaimDocuments.Claim_DocumentsScreen.IDMSUnavailableAlert.CloseBtn getCloseBtn() {
        return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.ClaimDocuments.Claim_DocumentsScreen.IDMSUnavailableAlert.CloseBtn.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/documents/ClaimDocuments.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/documents/ClaimDocuments.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/documents/ClaimDocuments.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/documents/ClaimDocuments.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}