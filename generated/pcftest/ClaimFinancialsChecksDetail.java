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
import pcftest.ClaimFinancialsChecksDetail.ClaimFinancialsChecksDetailScreen;
import pcftest.ClaimFinancialsChecksDetail.ClaimFinancialsChecksDetailScreen.ClaimFinancialsChecksDetail_ChangeRecurrenceScheduleButton;
import pcftest.ClaimFinancialsChecksDetail.ClaimFinancialsChecksDetailScreen.ClaimFinancialsChecksDetail_CloneButton;
import pcftest.ClaimFinancialsChecksDetail.ClaimFinancialsChecksDetailScreen.ClaimFinancialsChecksDetail_DeleteButton;
import pcftest.ClaimFinancialsChecksDetail.ClaimFinancialsChecksDetailScreen.ClaimFinancialsChecksDetail_EditAllButton;
import pcftest.ClaimFinancialsChecksDetail.ClaimFinancialsChecksDetailScreen.ClaimFinancialsChecksDetail_EditButton;
import pcftest.ClaimFinancialsChecksDetail.ClaimFinancialsChecksDetailScreen.ClaimFinancialsChecksDetail_ReissueButton;
import pcftest.ClaimFinancialsChecksDetail.ClaimFinancialsChecksDetailScreen.ClaimFinancialsChecksDetail_ResubmitButton;
import pcftest.ClaimFinancialsChecksDetail.ClaimFinancialsChecksDetailScreen.ClaimFinancialsChecksDetail_TransferButton;
import pcftest.ClaimFinancialsChecksDetail.ClaimFinancialsChecksDetailScreen.ClaimFinancialsChecksDetail_VoidStopButton;
import pcftest.ClaimFinancialsChecksDetail.ClaimFinancialsChecksDetailScreen.InvoiceWasAutoPaid;
import pcftest.ClaimFinancialsChecksDetail.ClaimFinancialsChecksDetailScreen.InvoiceWasAutoPaid.CloseBtn;
import pcftest.ClaimFinancialsChecksDetail.ClaimFinancialsChecksDetailScreen._msgs;
import pcftest.ClaimFinancialsChecksDetail.ClaimFinancialsChecksDetail_UpLink;
import pcftest.ClaimFinancialsChecksDetail._Paging;
import pcftest.ClaimFinancialsChecksDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/ClaimFinancialsChecksDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimFinancialsChecksDetail extends PCFLocation {
  public final static String CHECKSUM = "f4122c27549551958d0a4885d70efbda";
  
  public ClaimFinancialsChecksDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimFinancialsChecksDetail"));
  }
  
  public ClaimFinancialsChecksDetailScreen getClaimFinancialsChecksDetailScreen() {
    return getOrCreateProperty("ClaimFinancialsChecksDetailScreen", "ClaimFinancialsChecksDetailScreen", null, pcftest.ClaimFinancialsChecksDetail.ClaimFinancialsChecksDetailScreen.class);
  }
  
  public ClaimFinancialsChecksDetail_UpLink getClaimFinancialsChecksDetail_UpLink() {
    return getOrCreateProperty("ClaimFinancialsChecksDetail_UpLink", "ClaimFinancialsChecksDetail_UpLink", null, pcftest.ClaimFinancialsChecksDetail.ClaimFinancialsChecksDetail_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimFinancialsChecksDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimFinancialsChecksDetail.__crumb__.class);
  }
  
  public ClaimFinancialsChecks get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimFinancialsChecks.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/ClaimFinancialsChecksDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimFinancialsChecksDetailScreen extends PCFElement {
    public ClaimFinancialsChecksDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CheckDV getCheckDV() {
      return getOrCreateProperty("CheckDV", "CheckDV", null, pcftest.CheckDV.class);
    }
    
    public ClaimFinancialsChecksDetail_ChangeRecurrenceScheduleButton getClaimFinancialsChecksDetail_ChangeRecurrenceScheduleButton() {
      return getOrCreateProperty("ClaimFinancialsChecksDetail_ChangeRecurrenceScheduleButton", "ClaimFinancialsChecksDetail_ChangeRecurrenceScheduleButton", null, pcftest.ClaimFinancialsChecksDetail.ClaimFinancialsChecksDetailScreen.ClaimFinancialsChecksDetail_ChangeRecurrenceScheduleButton.class);
    }
    
    public ClaimFinancialsChecksDetail_CloneButton getClaimFinancialsChecksDetail_CloneButton() {
      return getOrCreateProperty("ClaimFinancialsChecksDetail_CloneButton", "ClaimFinancialsChecksDetail_CloneButton", null, pcftest.ClaimFinancialsChecksDetail.ClaimFinancialsChecksDetailScreen.ClaimFinancialsChecksDetail_CloneButton.class);
    }
    
    public ClaimFinancialsChecksDetail_DeleteButton getClaimFinancialsChecksDetail_DeleteButton() {
      return getOrCreateProperty("ClaimFinancialsChecksDetail_DeleteButton", "ClaimFinancialsChecksDetail_DeleteButton", null, pcftest.ClaimFinancialsChecksDetail.ClaimFinancialsChecksDetailScreen.ClaimFinancialsChecksDetail_DeleteButton.class);
    }
    
    public ClaimFinancialsChecksDetail_EditAllButton getClaimFinancialsChecksDetail_EditAllButton() {
      return getOrCreateProperty("ClaimFinancialsChecksDetail_EditAllButton", "ClaimFinancialsChecksDetail_EditAllButton", null, pcftest.ClaimFinancialsChecksDetail.ClaimFinancialsChecksDetailScreen.ClaimFinancialsChecksDetail_EditAllButton.class);
    }
    
    public ClaimFinancialsChecksDetail_EditButton getClaimFinancialsChecksDetail_EditButton() {
      return getOrCreateProperty("ClaimFinancialsChecksDetail_EditButton", "ClaimFinancialsChecksDetail_EditButton", null, pcftest.ClaimFinancialsChecksDetail.ClaimFinancialsChecksDetailScreen.ClaimFinancialsChecksDetail_EditButton.class);
    }
    
    public ClaimFinancialsChecksDetail_ReissueButton getClaimFinancialsChecksDetail_ReissueButton() {
      return getOrCreateProperty("ClaimFinancialsChecksDetail_ReissueButton", "ClaimFinancialsChecksDetail_ReissueButton", null, pcftest.ClaimFinancialsChecksDetail.ClaimFinancialsChecksDetailScreen.ClaimFinancialsChecksDetail_ReissueButton.class);
    }
    
    public ClaimFinancialsChecksDetail_ResubmitButton getClaimFinancialsChecksDetail_ResubmitButton() {
      return getOrCreateProperty("ClaimFinancialsChecksDetail_ResubmitButton", "ClaimFinancialsChecksDetail_ResubmitButton", null, pcftest.ClaimFinancialsChecksDetail.ClaimFinancialsChecksDetailScreen.ClaimFinancialsChecksDetail_ResubmitButton.class);
    }
    
    public ClaimFinancialsChecksDetail_TransferButton getClaimFinancialsChecksDetail_TransferButton() {
      return getOrCreateProperty("ClaimFinancialsChecksDetail_TransferButton", "ClaimFinancialsChecksDetail_TransferButton", null, pcftest.ClaimFinancialsChecksDetail.ClaimFinancialsChecksDetailScreen.ClaimFinancialsChecksDetail_TransferButton.class);
    }
    
    public ClaimFinancialsChecksDetail_VoidStopButton getClaimFinancialsChecksDetail_VoidStopButton() {
      return getOrCreateProperty("ClaimFinancialsChecksDetail_VoidStopButton", "ClaimFinancialsChecksDetail_VoidStopButton", null, pcftest.ClaimFinancialsChecksDetail.ClaimFinancialsChecksDetailScreen.ClaimFinancialsChecksDetail_VoidStopButton.class);
    }
    
    public InvoiceWasAutoPaid getInvoiceWasAutoPaid() {
      return getOrCreateProperty("InvoiceWasAutoPaid", "InvoiceWasAutoPaid", null, pcftest.ClaimFinancialsChecksDetail.ClaimFinancialsChecksDetailScreen.InvoiceWasAutoPaid.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimFinancialsChecksDetail.ClaimFinancialsChecksDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ClaimFinancialsChecksDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimFinancialsChecksDetail_ChangeRecurrenceScheduleButton extends ClickableActionElement {
      public ClaimFinancialsChecksDetail_ChangeRecurrenceScheduleButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ChangeCheckRecurrence click() {
        return clickThis(pcftest.ChangeCheckRecurrence.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ClaimFinancialsChecksDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimFinancialsChecksDetail_CloneButton extends ClickableActionElement {
      public ClaimFinancialsChecksDetail_CloneButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CloneCheckWizard click() {
        return clickThis(pcftest.CloneCheckWizard.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ClaimFinancialsChecksDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimFinancialsChecksDetail_DeleteButton extends ClickableActionElement {
      public ClaimFinancialsChecksDetail_DeleteButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ClaimFinancialsChecksDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimFinancialsChecksDetail_EditAllButton extends ClickableActionElement {
      public ClaimFinancialsChecksDetail_EditAllButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditRecurrenceCheckWizard click() {
        return clickThis(pcftest.EditRecurrenceCheckWizard.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ClaimFinancialsChecksDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimFinancialsChecksDetail_EditButton extends ClickableActionElement {
      public ClaimFinancialsChecksDetail_EditButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditCheckWizard click() {
        return clickThis(pcftest.EditCheckWizard.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ClaimFinancialsChecksDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimFinancialsChecksDetail_ReissueButton extends ClickableActionElement {
      public ClaimFinancialsChecksDetail_ReissueButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ReissueCheck click() {
        return clickThis(pcftest.ReissueCheck.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ClaimFinancialsChecksDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimFinancialsChecksDetail_ResubmitButton extends ClickableActionElement {
      public ClaimFinancialsChecksDetail_ResubmitButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ClaimFinancialsChecksDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimFinancialsChecksDetail_TransferButton extends ClickableActionElement {
      public ClaimFinancialsChecksDetail_TransferButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CheckTransfer click() {
        return clickThis(pcftest.CheckTransfer.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ClaimFinancialsChecksDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimFinancialsChecksDetail_VoidStopButton extends ClickableActionElement {
      public ClaimFinancialsChecksDetail_VoidStopButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public VoidStopCheck click() {
        return clickThis(pcftest.VoidStopCheck.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/ClaimFinancialsChecksDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InvoiceWasAutoPaid extends ClickableActionElement {
      public InvoiceWasAutoPaid(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CloseBtn getCloseBtn() {
        return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.ClaimFinancialsChecksDetail.ClaimFinancialsChecksDetailScreen.InvoiceWasAutoPaid.CloseBtn.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/financials/checks/ClaimFinancialsChecksDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/financials/checks/ClaimFinancialsChecksDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/checks/ClaimFinancialsChecksDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimFinancialsChecksDetail_UpLink extends ClickableActionElement {
    public ClaimFinancialsChecksDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/ClaimFinancialsChecksDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/ClaimFinancialsChecksDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}