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
import pcftest.PickExistingDocumentPopup.Claim_DocumentsScreen;
import pcftest.PickExistingDocumentPopup.Claim_DocumentsScreen.PickExistingDocumentPopup_CancelButton;
import pcftest.PickExistingDocumentPopup.Claim_DocumentsScreen.PickExistingDocumentsLV_tb;
import pcftest.PickExistingDocumentPopup.Claim_DocumentsScreen._msgs;
import pcftest.PickExistingDocumentPopup.PickExistingDocumentPopup_UpLink;
import pcftest.PickExistingDocumentPopup._Paging;
import pcftest.PickExistingDocumentPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/documents/PickExistingDocumentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PickExistingDocumentPopup extends PCFLocation {
  public final static String CHECKSUM = "67e9178ad4aece351bacf3ed0faa2466";
  
  public PickExistingDocumentPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("PickExistingDocumentPopup"));
  }
  
  public Claim_DocumentsScreen getClaim_DocumentsScreen() {
    return getOrCreateProperty("Claim_DocumentsScreen", "Claim_DocumentsScreen", null, pcftest.PickExistingDocumentPopup.Claim_DocumentsScreen.class);
  }
  
  public PickExistingDocumentPopup_UpLink getPickExistingDocumentPopup_UpLink() {
    return getOrCreateProperty("PickExistingDocumentPopup_UpLink", "PickExistingDocumentPopup_UpLink", null, pcftest.PickExistingDocumentPopup.PickExistingDocumentPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.PickExistingDocumentPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.PickExistingDocumentPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/PickExistingDocumentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim_DocumentsScreen extends PCFElement {
    public Claim_DocumentsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimDocumentSearchDV getClaimDocumentSearchDV() {
      return getOrCreateProperty("ClaimDocumentSearchDV", "ClaimDocumentSearchDV", null, pcftest.ClaimDocumentSearchDV.class);
    }
    
    public PickExistingDocumentPopup_CancelButton getPickExistingDocumentPopup_CancelButton() {
      return getOrCreateProperty("PickExistingDocumentPopup_CancelButton", "PickExistingDocumentPopup_CancelButton", null, pcftest.PickExistingDocumentPopup.Claim_DocumentsScreen.PickExistingDocumentPopup_CancelButton.class);
    }
    
    public PickExistingDocumentsLV getPickExistingDocumentsLV() {
      return getOrCreateProperty("PickExistingDocumentsLV", "PickExistingDocumentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PickExistingDocumentsLV.class);
    }
    
    public PickExistingDocumentsLV_tb getPickExistingDocumentsLV_tb() {
      return getOrCreateProperty("PickExistingDocumentsLV_tb", "PickExistingDocumentsLV_tb", null, pcftest.PickExistingDocumentPopup.Claim_DocumentsScreen.PickExistingDocumentsLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.PickExistingDocumentPopup.Claim_DocumentsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/documents/PickExistingDocumentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PickExistingDocumentPopup_CancelButton extends ClickableActionElement {
      public PickExistingDocumentPopup_CancelButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/documents/PickExistingDocumentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PickExistingDocumentsLV_tb extends PCFElement {
      public PickExistingDocumentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/documents/PickExistingDocumentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/documents/PickExistingDocumentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PickExistingDocumentPopup_UpLink extends ClickableActionElement {
    public PickExistingDocumentPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/PickExistingDocumentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/documents/PickExistingDocumentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}