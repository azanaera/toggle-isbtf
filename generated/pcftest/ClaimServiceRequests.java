package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimServiceRequests.ActivitiesTab;
import pcftest.ClaimServiceRequests.ClaimServiceRequests_UpLink;
import pcftest.ClaimServiceRequests.DetailsTab;
import pcftest.ClaimServiceRequests.DocumentsTab;
import pcftest.ClaimServiceRequests.HistoryTab;
import pcftest.ClaimServiceRequests.InvoiceDetailsTab;
import pcftest.ClaimServiceRequests.InvoiceTabToolbar;
import pcftest.ClaimServiceRequests.InvoicesTab;
import pcftest.ClaimServiceRequests.MessageTabToolbar;
import pcftest.ClaimServiceRequests.MessageTabToolbar.SendMessage;
import pcftest.ClaimServiceRequests.MessagesTab;
import pcftest.ClaimServiceRequests.NotesTab;
import pcftest.ClaimServiceRequests.ServiceRequestActivityLV_tb;
import pcftest.ClaimServiceRequests.ServiceRequestActivityLV_tb.ApproveButton;
import pcftest.ClaimServiceRequests.ServiceRequestActivityLV_tb.AssignButton;
import pcftest.ClaimServiceRequests.ServiceRequestActivityLV_tb.CompleteButton;
import pcftest.ClaimServiceRequests.ServiceRequestActivityLV_tb.RejectButton;
import pcftest.ClaimServiceRequests.ServiceRequestActivityLV_tb.SkipButton;
import pcftest.ClaimServiceRequests.ServiceRequestDocumentsLV_tb;
import pcftest.ClaimServiceRequests.ServiceRequestDocumentsLV_tb.AssociateOnlyButton;
import pcftest.ClaimServiceRequests.ServiceRequestDocumentsLV_tb.AssociateOnlyButton.AttachDocument;
import pcftest.ClaimServiceRequests.ServiceRequestDocumentsLV_tb.AssociateOnlyButton.Link;
import pcftest.ClaimServiceRequests.ServiceRequestDocumentsLV_tb.SendToSpecialistButton;
import pcftest.ClaimServiceRequests.ServiceRequestDocumentsLV_tb.SendToSpecialistButton.AttachAndSendDocument;
import pcftest.ClaimServiceRequests.ServiceRequestDocumentsLV_tb.SendToSpecialistButton.LinkAndSend;
import pcftest.ClaimServiceRequests.ServiceRequestHistoryLV_tb;
import pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV;
import pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV.ActionRequiredHeader;
import pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV.AmountHeader;
import pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV.CheckAmountHeader;
import pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV.CheckNumberHeader;
import pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV.CheckStatusHeader;
import pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV.DescriptionHeader;
import pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV.ReferenceNumberHeader;
import pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV.StatusHeader;
import pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV.SubmittedDateHeader;
import pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV._ListPaging;
import pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV.entry.CheckStatus;
import pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV.entry.Status;
import pcftest.ClaimServiceRequests.ServiceRequestList;
import pcftest.ClaimServiceRequests.ServiceRequestList.ServiceRequestLV_tb;
import pcftest.ClaimServiceRequests.ServiceRequestPanelRow;
import pcftest.ClaimServiceRequests.ServiceRequestPanelRow.InvoiceWithNoQuoteAlert;
import pcftest.ClaimServiceRequests.ServiceRequestPanelRow.InvoiceWithNoQuoteMessage;
import pcftest.ClaimServiceRequests.ServiceRequestPanelRow.InvoiceWithWaitingForApprovalQuoteAlert;
import pcftest.ClaimServiceRequests.ServiceRequestPanelRow.InvoiceWithWaitingForApprovalQuoteMessage;
import pcftest.ClaimServiceRequests.ServiceRequestPanelRow.InvoiceWithWaitingForRevisedQuoteAlert;
import pcftest.ClaimServiceRequests.ServiceRequestPanelRow.InvoiceWithWaitingForRevisedQuoteMessage;
import pcftest.ClaimServiceRequests.ServiceRequestPanelRow.MetricsDV;
import pcftest.ClaimServiceRequests.ServiceRequestPanelRow.MetricsDV.MetricsLV;
import pcftest.ClaimServiceRequests.ServiceRequestPanelRow.MetricsDV.MetricsLV.MetricNameHeader;
import pcftest.ClaimServiceRequests.ServiceRequestPanelRow.MetricsDV.MetricsLV.MetricStatusHeader;
import pcftest.ClaimServiceRequests.ServiceRequestPanelRow.MetricsDV.MetricsLV.MetricTargetValueHeader;
import pcftest.ClaimServiceRequests.ServiceRequestPanelRow.MetricsDV.MetricsLV.MetricValueHeader;
import pcftest.ClaimServiceRequests.ServiceRequestPanelRow.MetricsDV.MetricsLV.entry.MetricName;
import pcftest.ClaimServiceRequests.ServiceRequestPanelRow.MetricsDV.MetricsLV_tb;
import pcftest.ClaimServiceRequests.ServiceRequestPanelRow.QuotePanelSet;
import pcftest.ClaimServiceRequests.ServiceRequestPanelRow.QuotePanelSet.AddQuote;
import pcftest.ClaimServiceRequests.ServiceRequestPanelRow.QuotePanelSet.ApproveQuote;
import pcftest.ClaimServiceRequests.ServiceRequestPanelRow.QuotePanelSet.RequestRequote;
import pcftest.ClaimServiceRequests.ServiceRequestPanelRow.QuotePanelSet.ReviseQuote;
import pcftest.ClaimServiceRequests.ServiceRequestPanelRow.QuotePanelSet.StatementDocumentsLV_tb;
import pcftest.ClaimServiceRequests.ServiceRequestPanelRow.QuotePanelSet.WaitingForQuoteApprovalAlert;
import pcftest.ClaimServiceRequests.ServiceRequestPanelRow.QuotePanelSet.WaitingForQuoteApprovalAlertText;
import pcftest.ClaimServiceRequests.ServiceRequestPanelRow.ViewInvoices;
import pcftest.ClaimServiceRequests.ServiceRequestPanelRow.WaitingForInvoiceAlert;
import pcftest.ClaimServiceRequests.ServiceRequestPanelRow.WaitingForInvoiceAlertText;
import pcftest.ClaimServiceRequests.StateToolbar;
import pcftest.ClaimServiceRequests.StateToolbar.AssignService;
import pcftest.ClaimServiceRequests.StateToolbar.Cancel;
import pcftest.ClaimServiceRequests.StateToolbar.CreateNewService;
import pcftest.ClaimServiceRequests.StateToolbar.SubmitInstruction;
import pcftest.ClaimServiceRequests.StateToolbar.UpdateStateButton;
import pcftest.ClaimServiceRequests.StateToolbar.UpdateStateButton.AddDelay;
import pcftest.ClaimServiceRequests.StateToolbar.UpdateStateButton.SpecialistAcceptedWork;
import pcftest.ClaimServiceRequests.StateToolbar.UpdateStateButton.SpecialistCanceled;
import pcftest.ClaimServiceRequests.StateToolbar.UpdateStateButton.SpecialistCompletedWork;
import pcftest.ClaimServiceRequests.StateToolbar.UpdateStateButton.SpecialistDeclined;
import pcftest.ClaimServiceRequests.StateToolbar.UpdateStateButton.SpecialistResumedWork;
import pcftest.ClaimServiceRequests.StateToolbar.UpdateStateButton.SpecialistWaiting;
import pcftest.ClaimServiceRequests.StateToolbar.UpdateStateButton.UpdateReferenceNumber;
import pcftest.ClaimServiceRequests.WideNotesLV_tb;
import pcftest.ClaimServiceRequests.WideNotesLV_tb.AddNote;
import pcftest.ClaimServiceRequests.WideNotesLV_tb.DeleteButton;
import pcftest.ClaimServiceRequests.WideNotesLV_tb.EditButton;
import pcftest.ClaimServiceRequests.WideNotesLV_tb.PrintButton;
import pcftest.ClaimServiceRequests._Paging;
import pcftest.ClaimServiceRequests.__crumb__;
import pcftest.ClaimServiceRequests._msgs;
import typekey.ServiceRequestInvoiceStatus;
import typekey.ServiceRequestMetric;
import typekey.TransactionStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimServiceRequests extends PCFLocation {
  public final static String CHECKSUM = "63cd22078cda03ad94ffaf8dd16ced7a";
  
  public ClaimServiceRequests(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimServiceRequests"));
  }
  
  public ActivitiesTab getActivitiesTab() {
    return getOrCreateProperty("ActivitiesTab", "ActivitiesTab", null, pcftest.ClaimServiceRequests.ActivitiesTab.class);
  }
  
  public ClaimServiceRequests_UpLink getClaimServiceRequests_UpLink() {
    return getOrCreateProperty("ClaimServiceRequests_UpLink", "ClaimServiceRequests_UpLink", null, pcftest.ClaimServiceRequests.ClaimServiceRequests_UpLink.class);
  }
  
  public DetailsTab getDetailsTab() {
    return getOrCreateProperty("DetailsTab", "DetailsTab", null, pcftest.ClaimServiceRequests.DetailsTab.class);
  }
  
  public DocumentAlertPanelSet getDocumentAlertPanelSet() {
    return getOrCreateProperty("DocumentAlertPanelSet", "DocumentAlertPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.DocumentAlertPanelSet.class);
  }
  
  public DocumentsTab getDocumentsTab() {
    return getOrCreateProperty("DocumentsTab", "DocumentsTab", null, pcftest.ClaimServiceRequests.DocumentsTab.class);
  }
  
  public HistoryTab getHistoryTab() {
    return getOrCreateProperty("HistoryTab", "HistoryTab", null, pcftest.ClaimServiceRequests.HistoryTab.class);
  }
  
  public InvoiceDetailsTab getInvoiceDetailsTab() {
    return getOrCreateProperty("InvoiceDetailsTab", "InvoiceDetailsTab", null, pcftest.ClaimServiceRequests.InvoiceDetailsTab.class);
  }
  
  public InvoicePanelSet getInvoicePanelSet() {
    return getOrCreateProperty("InvoicePanelSet", "InvoicePanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.InvoicePanelSet.class);
  }
  
  public ValueElement getInvoiceTabNoInvoicesMessage() {
    return getOrCreateProperty("InvoiceTabNoInvoicesMessage", "InvoiceTabNoInvoicesMessage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public InvoiceTabToolbar getInvoiceTabToolbar() {
    return getOrCreateProperty("InvoiceTabToolbar", "InvoiceTabToolbar", null, pcftest.ClaimServiceRequests.InvoiceTabToolbar.class);
  }
  
  public InvoicesTab getInvoicesTab() {
    return getOrCreateProperty("InvoicesTab", "InvoicesTab", null, pcftest.ClaimServiceRequests.InvoicesTab.class);
  }
  
  public MessageTabToolbar getMessageTabToolbar() {
    return getOrCreateProperty("MessageTabToolbar", "MessageTabToolbar", null, pcftest.ClaimServiceRequests.MessageTabToolbar.class);
  }
  
  public MessagesTab getMessagesTab() {
    return getOrCreateProperty("MessagesTab", "MessagesTab", null, pcftest.ClaimServiceRequests.MessagesTab.class);
  }
  
  public pcftest.ClaimServiceRequests.NewServiceRequest getNewServiceRequest() {
    return getOrCreateProperty("NewServiceRequest", "NewServiceRequest", null, pcftest.ClaimServiceRequests.NewServiceRequest.class);
  }
  
  public NotesTab getNotesTab() {
    return getOrCreateProperty("NotesTab", "NotesTab", null, pcftest.ClaimServiceRequests.NotesTab.class);
  }
  
  public ServiceRequestActivityLV getServiceRequestActivityLV() {
    return getOrCreateProperty("ServiceRequestActivityLV", "ServiceRequestActivityLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ServiceRequestActivityLV.class);
  }
  
  public ServiceRequestActivityLV_tb getServiceRequestActivityLV_tb() {
    return getOrCreateProperty("ServiceRequestActivityLV_tb", "ServiceRequestActivityLV_tb", null, pcftest.ClaimServiceRequests.ServiceRequestActivityLV_tb.class);
  }
  
  public ServiceRequestDocumentsLV getServiceRequestDocumentsLV() {
    return getOrCreateProperty("ServiceRequestDocumentsLV", "ServiceRequestDocumentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ServiceRequestDocumentsLV.class);
  }
  
  public ServiceRequestDocumentsLV_tb getServiceRequestDocumentsLV_tb() {
    return getOrCreateProperty("ServiceRequestDocumentsLV_tb", "ServiceRequestDocumentsLV_tb", null, pcftest.ClaimServiceRequests.ServiceRequestDocumentsLV_tb.class);
  }
  
  public ServiceRequestHistoryLV getServiceRequestHistoryLV() {
    return getOrCreateProperty("ServiceRequestHistoryLV", "ServiceRequestHistoryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ServiceRequestHistoryLV.class);
  }
  
  public ServiceRequestHistoryLV_tb getServiceRequestHistoryLV_tb() {
    return getOrCreateProperty("ServiceRequestHistoryLV_tb", "ServiceRequestHistoryLV_tb", null, pcftest.ClaimServiceRequests.ServiceRequestHistoryLV_tb.class);
  }
  
  public ServiceRequestInvoicesLV getServiceRequestInvoicesLV() {
    return getOrCreateProperty("ServiceRequestInvoicesLV", "ServiceRequestInvoicesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV.class);
  }
  
  public ServiceRequestList getServiceRequestList() {
    return getOrCreateProperty("ServiceRequestList", "ServiceRequestList", null, pcftest.ClaimServiceRequests.ServiceRequestList.class);
  }
  
  public ServiceRequestMessagePanelSet getServiceRequestMessagePanelSet() {
    return getOrCreateProperty("ServiceRequestMessagePanelSet", "ServiceRequestMessagePanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ServiceRequestMessagePanelSet.class);
  }
  
  public ServiceRequestPanelRow getServiceRequestPanelRow() {
    return getOrCreateProperty("ServiceRequestPanelRow", "ServiceRequestPanelRow", null, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.class);
  }
  
  public StateToolbar getStateToolbar() {
    return getOrCreateProperty("StateToolbar", "StateToolbar", null, pcftest.ClaimServiceRequests.StateToolbar.class);
  }
  
  public WideNotesLV getWideNotesLV() {
    return getOrCreateProperty("WideNotesLV", "WideNotesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.WideNotesLV.class);
  }
  
  public WideNotesLV_tb getWideNotesLV_tb() {
    return getOrCreateProperty("WideNotesLV_tb", "WideNotesLV_tb", null, pcftest.ClaimServiceRequests.WideNotesLV_tb.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimServiceRequests._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimServiceRequests.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimServiceRequests._msgs.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivitiesTab extends ClickableActionElement {
    public ActivitiesTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimServiceRequests_UpLink extends ClickableActionElement {
    public ClaimServiceRequests_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DetailsTab extends ClickableActionElement {
    public DetailsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DocumentsTab extends ClickableActionElement {
    public DocumentsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class HistoryTab extends ClickableActionElement {
    public HistoryTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InvoiceDetailsTab extends ClickableActionElement {
    public InvoiceDetailsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InvoiceTabToolbar extends PCFElement {
    public InvoiceTabToolbar(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.ClaimServiceRequests.InvoiceTabToolbar.AddInvoice getAddInvoice() {
      return getOrCreateProperty("AddInvoice", "AddInvoice", null, pcftest.ClaimServiceRequests.InvoiceTabToolbar.AddInvoice.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddInvoice extends ClickableActionElement {
      public AddInvoice(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewInvoice click() {
        return clickThis(pcftest.NewInvoice.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InvoicesTab extends ClickableActionElement {
    public InvoicesTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MessageTabToolbar extends PCFElement {
    public MessageTabToolbar(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SendMessage getSendMessage() {
      return getOrCreateProperty("SendMessage", "SendMessage", null, pcftest.ClaimServiceRequests.MessageTabToolbar.SendMessage.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SendMessage extends ClickableActionElement {
      public SendMessage(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ServiceRequestMessagePopup click() {
        return clickThis(pcftest.ServiceRequestMessagePopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MessagesTab extends ClickableActionElement {
    public MessagesTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewServiceRequest extends ClickableActionElement {
    public NewServiceRequest(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.NewServiceRequest click() {
      return clickThis(pcftest.NewServiceRequest.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NotesTab extends ClickableActionElement {
    public NotesTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServiceRequestActivityLV_tb extends PCFElement {
    public ServiceRequestActivityLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ApproveButton getApproveButton() {
      return getOrCreateProperty("ApproveButton", "ApproveButton", null, pcftest.ClaimServiceRequests.ServiceRequestActivityLV_tb.ApproveButton.class);
    }
    
    public AssignButton getAssignButton() {
      return getOrCreateProperty("AssignButton", "AssignButton", null, pcftest.ClaimServiceRequests.ServiceRequestActivityLV_tb.AssignButton.class);
    }
    
    public CompleteButton getCompleteButton() {
      return getOrCreateProperty("CompleteButton", "CompleteButton", null, pcftest.ClaimServiceRequests.ServiceRequestActivityLV_tb.CompleteButton.class);
    }
    
    public RejectButton getRejectButton() {
      return getOrCreateProperty("RejectButton", "RejectButton", null, pcftest.ClaimServiceRequests.ServiceRequestActivityLV_tb.RejectButton.class);
    }
    
    public SkipButton getSkipButton() {
      return getOrCreateProperty("SkipButton", "SkipButton", null, pcftest.ClaimServiceRequests.ServiceRequestActivityLV_tb.SkipButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ApproveButton extends ClickableActionElement {
      public ApproveButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AssignButton extends ClickableActionElement {
      public AssignButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CompleteButton extends ClickableActionElement {
      public CompleteButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RejectButton extends ClickableActionElement {
      public RejectButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SkipButton extends ClickableActionElement {
      public SkipButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServiceRequestDocumentsLV_tb extends PCFElement {
    public ServiceRequestDocumentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AssociateOnlyButton getAssociateOnlyButton() {
      return getOrCreateProperty("AssociateOnlyButton", "AssociateOnlyButton", null, pcftest.ClaimServiceRequests.ServiceRequestDocumentsLV_tb.AssociateOnlyButton.class);
    }
    
    public pcftest.ClaimServiceRequests.ServiceRequestDocumentsLV_tb.RefreshAsyncContent getRefreshAsyncContent() {
      return getOrCreateProperty("RefreshAsyncContent", "RefreshAsyncContent", null, pcftest.ClaimServiceRequests.ServiceRequestDocumentsLV_tb.RefreshAsyncContent.class);
    }
    
    public SendToSpecialistButton getSendToSpecialistButton() {
      return getOrCreateProperty("SendToSpecialistButton", "SendToSpecialistButton", null, pcftest.ClaimServiceRequests.ServiceRequestDocumentsLV_tb.SendToSpecialistButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AssociateOnlyButton extends ClickableActionElement {
      public AssociateOnlyButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AttachDocument getAttachDocument() {
        return getOrCreateProperty("AttachDocument", "AttachDocument", null, pcftest.ClaimServiceRequests.ServiceRequestDocumentsLV_tb.AssociateOnlyButton.AttachDocument.class);
      }
      
      public Link getLink() {
        return getOrCreateProperty("Link", "Link", null, pcftest.ClaimServiceRequests.ServiceRequestDocumentsLV_tb.AssociateOnlyButton.Link.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AttachDocument extends ClickableActionElement {
        public AttachDocument(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public AttachDocumentsPopup click() {
          return clickThis(pcftest.AttachDocumentsPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RefreshAsyncContent extends ClickableActionElement {
      public RefreshAsyncContent(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SendToSpecialistButton extends ClickableActionElement {
      public SendToSpecialistButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AttachAndSendDocument getAttachAndSendDocument() {
        return getOrCreateProperty("AttachAndSendDocument", "AttachAndSendDocument", null, pcftest.ClaimServiceRequests.ServiceRequestDocumentsLV_tb.SendToSpecialistButton.AttachAndSendDocument.class);
      }
      
      public LinkAndSend getLinkAndSend() {
        return getOrCreateProperty("LinkAndSend", "LinkAndSend", null, pcftest.ClaimServiceRequests.ServiceRequestDocumentsLV_tb.SendToSpecialistButton.LinkAndSend.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AttachAndSendDocument extends ClickableActionElement {
        public AttachAndSendDocument(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public AttachDocumentsPopup click() {
          return clickThis(pcftest.AttachDocumentsPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LinkAndSend extends ClickableActionElement {
        public LinkAndSend(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PickExistingDocumentPopup click() {
          return clickThis(pcftest.PickExistingDocumentPopup.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServiceRequestHistoryLV_tb extends PCFElement {
    public ServiceRequestHistoryLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServiceRequestInvoicesLV extends PCFElement {
    public ServiceRequestInvoicesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ActionRequiredHeader getActionRequiredHeader() {
      return getOrCreateProperty("ActionRequiredHeader", "ActionRequiredHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV.ActionRequiredHeader.class);
    }
    
    public AmountHeader getAmountHeader() {
      return getOrCreateProperty("AmountHeader", "AmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV.AmountHeader.class);
    }
    
    public CheckAmountHeader getCheckAmountHeader() {
      return getOrCreateProperty("CheckAmountHeader", "CheckAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV.CheckAmountHeader.class);
    }
    
    public CheckNumberHeader getCheckNumberHeader() {
      return getOrCreateProperty("CheckNumberHeader", "CheckNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV.CheckNumberHeader.class);
    }
    
    public CheckStatusHeader getCheckStatusHeader() {
      return getOrCreateProperty("CheckStatusHeader", "CheckStatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV.CheckStatusHeader.class);
    }
    
    public DescriptionHeader getDescriptionHeader() {
      return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV.DescriptionHeader.class);
    }
    
    public ReferenceNumberHeader getReferenceNumberHeader() {
      return getOrCreateProperty("ReferenceNumberHeader", "ReferenceNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV.ReferenceNumberHeader.class);
    }
    
    public StatusHeader getStatusHeader() {
      return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV.StatusHeader.class);
    }
    
    public SubmittedDateHeader getSubmittedDateHeader() {
      return getOrCreateProperty("SubmittedDateHeader", "SubmittedDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV.SubmittedDateHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ActionRequiredHeader extends ValueElement {
      public ActionRequiredHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AmountHeader extends ValueElement {
      public AmountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CheckAmountHeader extends ValueElement {
      public CheckAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CheckNumberHeader extends ValueElement {
      public CheckNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CheckStatusHeader extends ValueElement {
      public CheckStatusHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DescriptionHeader extends ValueElement {
      public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ReferenceNumberHeader extends ValueElement {
      public ReferenceNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatusHeader extends ValueElement {
      public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SubmittedDateHeader extends ValueElement {
      public SubmittedDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public BooleanValueElement getActionRequired() {
        return getOrCreateProperty("ActionRequired", "ActionRequired", null, gw.smoketest.platform.web.BooleanValueElement.class);
      }
      
      public ValueElement getAmount() {
        return getOrCreateProperty("Amount", "Amount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getCheckAmount() {
        return getOrCreateProperty("CheckAmount", "CheckAmount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getCheckNumber() {
        return getOrCreateProperty("CheckNumber", "CheckNumber", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public CheckStatus getCheckStatus() {
        return getOrCreateProperty("CheckStatus", "CheckStatus", null, pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV.entry.CheckStatus.class);
      }
      
      public ValueElement getDescription() {
        return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getReferenceNumber() {
        return getOrCreateProperty("ReferenceNumber", "ReferenceNumber", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public Status getStatus() {
        return getOrCreateProperty("Status", "Status", null, pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV.entry.Status.class);
      }
      
      public DateElement getSubmittedDate() {
        return getOrCreateProperty("SubmittedDate", "SubmittedDate", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV.entry._Select.class);
      }
      
      public pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimServiceRequests.ServiceRequestInvoicesLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CheckStatus extends SelectElement {
        public CheckStatus(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(TransactionStatus arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public TransactionStatus getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.TransactionStatus.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(TransactionStatus arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Status extends SelectElement {
        public Status(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(ServiceRequestInvoiceStatus arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public ServiceRequestInvoiceStatus getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ServiceRequestInvoiceStatus.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(ServiceRequestInvoiceStatus arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServiceRequestList extends PCFElement {
    public ServiceRequestList(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ServiceRequestLV getServiceRequestLV() {
      return getOrCreateProperty("ServiceRequestLV", "ServiceRequestLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ServiceRequestLV.class);
    }
    
    public ServiceRequestLV_tb getServiceRequestLV_tb() {
      return getOrCreateProperty("ServiceRequestLV_tb", "ServiceRequestLV_tb", null, pcftest.ClaimServiceRequests.ServiceRequestList.ServiceRequestLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ServiceRequestLV_tb extends PCFElement {
      public ServiceRequestLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServiceRequestPanelRow extends PCFElement {
    public ServiceRequestPanelRow(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getActiveChecksAmount() {
      return getOrCreateProperty("ActiveChecksAmount", "ActiveChecksAmount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getActiveChecksAmountIncludesNonExclusiveChecksMessage() {
      return getOrCreateProperty("ActiveChecksAmountIncludesNonExclusiveChecksMessage", "ActiveChecksAmountIncludesNonExclusiveChecksMessage", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.ClaimServiceRequests.ServiceRequestPanelRow.AddInvoice getAddInvoice() {
      return getOrCreateProperty("AddInvoice", "AddInvoice", null, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.AddInvoice.class);
    }
    
    public InvoiceWithNoQuoteAlert getInvoiceWithNoQuoteAlert() {
      return getOrCreateProperty("InvoiceWithNoQuoteAlert", "InvoiceWithNoQuoteAlert", null, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.InvoiceWithNoQuoteAlert.class);
    }
    
    public InvoiceWithNoQuoteMessage getInvoiceWithNoQuoteMessage() {
      return getOrCreateProperty("InvoiceWithNoQuoteMessage", "InvoiceWithNoQuoteMessage", null, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.InvoiceWithNoQuoteMessage.class);
    }
    
    public InvoiceWithWaitingForApprovalQuoteAlert getInvoiceWithWaitingForApprovalQuoteAlert() {
      return getOrCreateProperty("InvoiceWithWaitingForApprovalQuoteAlert", "InvoiceWithWaitingForApprovalQuoteAlert", null, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.InvoiceWithWaitingForApprovalQuoteAlert.class);
    }
    
    public InvoiceWithWaitingForApprovalQuoteMessage getInvoiceWithWaitingForApprovalQuoteMessage() {
      return getOrCreateProperty("InvoiceWithWaitingForApprovalQuoteMessage", "InvoiceWithWaitingForApprovalQuoteMessage", null, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.InvoiceWithWaitingForApprovalQuoteMessage.class);
    }
    
    public InvoiceWithWaitingForRevisedQuoteAlert getInvoiceWithWaitingForRevisedQuoteAlert() {
      return getOrCreateProperty("InvoiceWithWaitingForRevisedQuoteAlert", "InvoiceWithWaitingForRevisedQuoteAlert", null, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.InvoiceWithWaitingForRevisedQuoteAlert.class);
    }
    
    public InvoiceWithWaitingForRevisedQuoteMessage getInvoiceWithWaitingForRevisedQuoteMessage() {
      return getOrCreateProperty("InvoiceWithWaitingForRevisedQuoteMessage", "InvoiceWithWaitingForRevisedQuoteMessage", null, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.InvoiceWithWaitingForRevisedQuoteMessage.class);
    }
    
    public ValueElement getInvoicesLabel() {
      return getOrCreateProperty("InvoicesLabel", "InvoicesLabel", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public MetricsDV getMetricsDV() {
      return getOrCreateProperty("MetricsDV", "MetricsDV", null, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.MetricsDV.class);
    }
    
    public ValueElement getNoInvoicesMessage() {
      return getOrCreateProperty("NoInvoicesMessage", "NoInvoicesMessage", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getOutstandingInvoicesAmount() {
      return getOrCreateProperty("OutstandingInvoicesAmount", "OutstandingInvoicesAmount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public QuotePanelSet getQuotePanelSet() {
      return getOrCreateProperty("QuotePanelSet", "QuotePanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.QuotePanelSet.class);
    }
    
    public ServiceRequestDV getServiceRequestDV() {
      return getOrCreateProperty("ServiceRequestDV", "ServiceRequestDV", null, pcftest.ServiceRequestDV.class);
    }
    
    public ValueElement getTotalInvoiced() {
      return getOrCreateProperty("TotalInvoiced", "TotalInvoiced", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ViewInvoices getViewInvoices() {
      return getOrCreateProperty("ViewInvoices", "ViewInvoices", null, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.ViewInvoices.class);
    }
    
    public WaitingForInvoiceAlert getWaitingForInvoiceAlert() {
      return getOrCreateProperty("WaitingForInvoiceAlert", "WaitingForInvoiceAlert", null, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.WaitingForInvoiceAlert.class);
    }
    
    public WaitingForInvoiceAlertText getWaitingForInvoiceAlertText() {
      return getOrCreateProperty("WaitingForInvoiceAlertText", "WaitingForInvoiceAlertText", null, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.WaitingForInvoiceAlertText.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddInvoice extends ClickableActionElement {
      public AddInvoice(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewInvoice click() {
        return clickThis(pcftest.NewInvoice.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InvoiceWithNoQuoteAlert extends ClickableActionElement {
      public InvoiceWithNoQuoteAlert(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InvoiceWithNoQuoteMessage extends ClickableActionElement {
      public InvoiceWithNoQuoteMessage(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InvoiceWithWaitingForApprovalQuoteAlert extends ClickableActionElement {
      public InvoiceWithWaitingForApprovalQuoteAlert(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InvoiceWithWaitingForApprovalQuoteMessage extends ClickableActionElement {
      public InvoiceWithWaitingForApprovalQuoteMessage(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InvoiceWithWaitingForRevisedQuoteAlert extends ClickableActionElement {
      public InvoiceWithWaitingForRevisedQuoteAlert(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InvoiceWithWaitingForRevisedQuoteMessage extends ClickableActionElement {
      public InvoiceWithWaitingForRevisedQuoteMessage(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MetricsDV extends DetailViewElement {
      public MetricsDV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public MetricsLV getMetricsLV() {
        return getOrCreateProperty("MetricsLV", "MetricsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.MetricsDV.MetricsLV.class);
      }
      
      public MetricsLV_tb getMetricsLV_tb() {
        return getOrCreateProperty("MetricsLV_tb", "MetricsLV_tb", null, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.MetricsDV.MetricsLV_tb.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class MetricsLV extends PCFElement {
        public MetricsLV(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public MetricNameHeader getMetricNameHeader() {
          return getOrCreateProperty("MetricNameHeader", "MetricNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.MetricsDV.MetricsLV.MetricNameHeader.class);
        }
        
        public MetricStatusHeader getMetricStatusHeader() {
          return getOrCreateProperty("MetricStatusHeader", "MetricStatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.MetricsDV.MetricsLV.MetricStatusHeader.class);
        }
        
        public MetricTargetValueHeader getMetricTargetValueHeader() {
          return getOrCreateProperty("MetricTargetValueHeader", "MetricTargetValueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.MetricsDV.MetricsLV.MetricTargetValueHeader.class);
        }
        
        public MetricValueHeader getMetricValueHeader() {
          return getOrCreateProperty("MetricValueHeader", "MetricValueHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.MetricsDV.MetricsLV.MetricValueHeader.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        @SuppressWarnings(value = "unchecked")
        public IteratorEntries<pcftest.ClaimServiceRequests.ServiceRequestPanelRow.MetricsDV.MetricsLV.entry> get_Entries() {
          return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.MetricsDV.MetricsLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class MetricNameHeader extends ValueElement {
          public MetricNameHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class MetricStatusHeader extends ValueElement {
          public MetricStatusHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class MetricTargetValueHeader extends ValueElement {
          public MetricTargetValueHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class MetricValueHeader extends ValueElement {
          public MetricValueHeader(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class entry extends RowElement {
          public entry(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public MetricName getMetricName() {
            return getOrCreateProperty("MetricName", "MetricName", null, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.MetricsDV.MetricsLV.entry.MetricName.class);
          }
          
          public BooleanValueElement getMetricStatus() {
            return getOrCreateProperty("MetricStatus", "MetricStatus", null, gw.smoketest.platform.web.BooleanValueElement.class);
          }
          
          public ValueElement getMetricTargetValue() {
            return getOrCreateProperty("MetricTargetValue", "MetricTargetValue", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public ValueElement getMetricValue() {
            return getOrCreateProperty("MetricValue", "MetricValue", null, gw.smoketest.platform.web.ValueElement.class);
          }
          
          public IteratorEntryCheckboxElement get_Checkbox() {
            return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
          }
          
          public pcftest.ClaimServiceRequests.ServiceRequestPanelRow.MetricsDV.MetricsLV.entry._Select get_Select() {
            return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.MetricsDV.MetricsLV.entry._Select.class);
          }
          
          public pcftest.ClaimServiceRequests.ServiceRequestPanelRow.MetricsDV.MetricsLV.entry._ViewDetail get_ViewDetail() {
            return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.MetricsDV.MetricsLV.entry._ViewDetail.class);
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class MetricName extends SelectElement {
            public MetricName(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public OptionElement getOptionByTypeKey(ServiceRequestMetric arg) {
              return getOptionByValue(arg == null ? null : arg.getCode());
            }
            
            public ServiceRequestMetric getTypeKeyValue() {
              String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ServiceRequestMetric.getTypeKey(myValue);
            }
            
            public void setTypeKeyValue(ServiceRequestMetric arg) {
              setValue(arg == null ? null : arg.getCode());
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class _Select extends SelectorCellElement {
            public _Select(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          @SimplePropertyProcessing
          @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
          public static class _ViewDetail extends BooleanValueElement {
            public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
              super(helper, componentId);
            }
            
            public PCFLocation click() {
              return clickThis(gw.smoketest.platform.web.PCFLocation.class);
            }
            
            
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class MetricsLV_tb extends PCFElement {
        public MetricsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class QuotePanelSet extends PCFElement {
      public QuotePanelSet(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getActiveQuoteLabel() {
        return getOrCreateProperty("ActiveQuoteLabel", "ActiveQuoteLabel", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public AddQuote getAddQuote() {
        return getOrCreateProperty("AddQuote", "AddQuote", null, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.QuotePanelSet.AddQuote.class);
      }
      
      public ApproveQuote getApproveQuote() {
        return getOrCreateProperty("ApproveQuote", "ApproveQuote", null, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.QuotePanelSet.ApproveQuote.class);
      }
      
      public RequestRequote getRequestRequote() {
        return getOrCreateProperty("RequestRequote", "RequestRequote", null, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.QuotePanelSet.RequestRequote.class);
      }
      
      public ReviseQuote getReviseQuote() {
        return getOrCreateProperty("ReviseQuote", "ReviseQuote", null, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.QuotePanelSet.ReviseQuote.class);
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
        return getOrCreateProperty("StatementDocumentsLV_tb", "StatementDocumentsLV_tb", null, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.QuotePanelSet.StatementDocumentsLV_tb.class);
      }
      
      public WaitingForQuoteApprovalAlert getWaitingForQuoteApprovalAlert() {
        return getOrCreateProperty("WaitingForQuoteApprovalAlert", "WaitingForQuoteApprovalAlert", null, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.QuotePanelSet.WaitingForQuoteApprovalAlert.class);
      }
      
      public WaitingForQuoteApprovalAlertText getWaitingForQuoteApprovalAlertText() {
        return getOrCreateProperty("WaitingForQuoteApprovalAlertText", "WaitingForQuoteApprovalAlertText", null, pcftest.ClaimServiceRequests.ServiceRequestPanelRow.QuotePanelSet.WaitingForQuoteApprovalAlertText.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AddQuote extends ClickableActionElement {
        public AddQuote(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public AddReviseQuotePopup click() {
          return clickThis(pcftest.AddReviseQuotePopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ApproveQuote extends ClickableActionElement {
        public ApproveQuote(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ApproveQuotePopup click() {
          return clickThis(pcftest.ApproveQuotePopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class RequestRequote extends ClickableActionElement {
        public RequestRequote(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public RequestRequotePopup click() {
          return clickThis(pcftest.RequestRequotePopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ReviseQuote extends ClickableActionElement {
        public ReviseQuote(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public AddReviseQuotePopup click() {
          return clickThis(pcftest.AddReviseQuotePopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class StatementDocumentsLV_tb extends PCFElement {
        public StatementDocumentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class WaitingForQuoteApprovalAlert extends ClickableActionElement {
        public WaitingForQuoteApprovalAlert(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class WaitingForQuoteApprovalAlertText extends ClickableActionElement {
        public WaitingForQuoteApprovalAlertText(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ViewInvoices extends ClickableActionElement {
      public ViewInvoices(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WaitingForInvoiceAlert extends ClickableActionElement {
      public WaitingForInvoiceAlert(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WaitingForInvoiceAlertText extends ClickableActionElement {
      public WaitingForInvoiceAlertText(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StateToolbar extends PCFElement {
    public StateToolbar(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AssignService getAssignService() {
      return getOrCreateProperty("AssignService", "AssignService", null, pcftest.ClaimServiceRequests.StateToolbar.AssignService.class);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ClaimServiceRequests.StateToolbar.Cancel.class);
    }
    
    public CreateNewService getCreateNewService() {
      return getOrCreateProperty("CreateNewService", "CreateNewService", null, pcftest.ClaimServiceRequests.StateToolbar.CreateNewService.class);
    }
    
    public pcftest.ClaimServiceRequests.StateToolbar.RefreshAsyncContent getRefreshAsyncContent() {
      return getOrCreateProperty("RefreshAsyncContent", "RefreshAsyncContent", null, pcftest.ClaimServiceRequests.StateToolbar.RefreshAsyncContent.class);
    }
    
    public SubmitInstruction getSubmitInstruction() {
      return getOrCreateProperty("SubmitInstruction", "SubmitInstruction", null, pcftest.ClaimServiceRequests.StateToolbar.SubmitInstruction.class);
    }
    
    public UpdateStateButton getUpdateStateButton() {
      return getOrCreateProperty("UpdateStateButton", "UpdateStateButton", null, pcftest.ClaimServiceRequests.StateToolbar.UpdateStateButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AssignService extends ClickableActionElement {
      public AssignService(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AssignServiceRequestPopup click() {
        return clickThis(pcftest.AssignServiceRequestPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OperationReasonPromptPopup click() {
        return clickThis(pcftest.OperationReasonPromptPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CreateNewService extends ClickableActionElement {
      public CreateNewService(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RefreshAsyncContent extends ClickableActionElement {
      public RefreshAsyncContent(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SubmitInstruction extends ClickableActionElement {
      public SubmitInstruction(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UpdateStateButton extends ClickableActionElement {
      public UpdateStateButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddDelay getAddDelay() {
        return getOrCreateProperty("AddDelay", "AddDelay", null, pcftest.ClaimServiceRequests.StateToolbar.UpdateStateButton.AddDelay.class);
      }
      
      public SpecialistAcceptedWork getSpecialistAcceptedWork() {
        return getOrCreateProperty("SpecialistAcceptedWork", "SpecialistAcceptedWork", null, pcftest.ClaimServiceRequests.StateToolbar.UpdateStateButton.SpecialistAcceptedWork.class);
      }
      
      public SpecialistCanceled getSpecialistCanceled() {
        return getOrCreateProperty("SpecialistCanceled", "SpecialistCanceled", null, pcftest.ClaimServiceRequests.StateToolbar.UpdateStateButton.SpecialistCanceled.class);
      }
      
      public SpecialistCompletedWork getSpecialistCompletedWork() {
        return getOrCreateProperty("SpecialistCompletedWork", "SpecialistCompletedWork", null, pcftest.ClaimServiceRequests.StateToolbar.UpdateStateButton.SpecialistCompletedWork.class);
      }
      
      public SpecialistDeclined getSpecialistDeclined() {
        return getOrCreateProperty("SpecialistDeclined", "SpecialistDeclined", null, pcftest.ClaimServiceRequests.StateToolbar.UpdateStateButton.SpecialistDeclined.class);
      }
      
      public SpecialistResumedWork getSpecialistResumedWork() {
        return getOrCreateProperty("SpecialistResumedWork", "SpecialistResumedWork", null, pcftest.ClaimServiceRequests.StateToolbar.UpdateStateButton.SpecialistResumedWork.class);
      }
      
      public SpecialistWaiting getSpecialistWaiting() {
        return getOrCreateProperty("SpecialistWaiting", "SpecialistWaiting", null, pcftest.ClaimServiceRequests.StateToolbar.UpdateStateButton.SpecialistWaiting.class);
      }
      
      public UpdateReferenceNumber getUpdateReferenceNumber() {
        return getOrCreateProperty("UpdateReferenceNumber", "UpdateReferenceNumber", null, pcftest.ClaimServiceRequests.StateToolbar.UpdateStateButton.UpdateReferenceNumber.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class AddDelay extends ClickableActionElement {
        public AddDelay(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public AddDelayPopup click() {
          return clickThis(pcftest.AddDelayPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SpecialistAcceptedWork extends ClickableActionElement {
        public SpecialistAcceptedWork(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public AcceptedWorkPopup click() {
          return clickThis(pcftest.AcceptedWorkPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SpecialistCanceled extends ClickableActionElement {
        public SpecialistCanceled(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OperationReasonPromptPopup click() {
          return clickThis(pcftest.OperationReasonPromptPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SpecialistCompletedWork extends ClickableActionElement {
        public SpecialistCompletedWork(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SpecialistDeclined extends ClickableActionElement {
        public SpecialistDeclined(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OperationReasonPromptPopup click() {
          return clickThis(pcftest.OperationReasonPromptPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SpecialistResumedWork extends ClickableActionElement {
        public SpecialistResumedWork(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class SpecialistWaiting extends ClickableActionElement {
        public SpecialistWaiting(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OperationReasonPromptPopup click() {
          return clickThis(pcftest.OperationReasonPromptPopup.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class UpdateReferenceNumber extends ClickableActionElement {
        public UpdateReferenceNumber(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public EditReferenceNumberPopup click() {
          return clickThis(pcftest.EditReferenceNumberPopup.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WideNotesLV_tb extends PCFElement {
    public WideNotesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AddNote getAddNote() {
      return getOrCreateProperty("AddNote", "AddNote", null, pcftest.ClaimServiceRequests.WideNotesLV_tb.AddNote.class);
    }
    
    public DeleteButton getDeleteButton() {
      return getOrCreateProperty("DeleteButton", "DeleteButton", null, pcftest.ClaimServiceRequests.WideNotesLV_tb.DeleteButton.class);
    }
    
    public EditButton getEditButton() {
      return getOrCreateProperty("EditButton", "EditButton", null, pcftest.ClaimServiceRequests.WideNotesLV_tb.EditButton.class);
    }
    
    public PrintButton getPrintButton() {
      return getOrCreateProperty("PrintButton", "PrintButton", null, pcftest.ClaimServiceRequests.WideNotesLV_tb.PrintButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AddNote extends ClickableActionElement {
      public AddNote(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewNotePopup click() {
        return clickThis(pcftest.NewNotePopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DeleteButton extends ClickableActionElement {
      public DeleteButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditButton extends ClickableActionElement {
      public EditButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PrintButton extends ClickableActionElement {
      public PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ClaimServiceRequests.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}