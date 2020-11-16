package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.InvoicePanelSet.ApproveInvoice;
import pcftest.InvoicePanelSet.ApprovedBy;
import pcftest.InvoicePanelSet.ApprovedBy.ApprovedByUserSearchMenuItem;
import pcftest.InvoicePanelSet.ApprovedBy.ApprovedByUserSelectMenuItem;
import pcftest.InvoicePanelSet.CheckDetails;
import pcftest.InvoicePanelSet.CheckDetails.CheckLabel;
import pcftest.InvoicePanelSet.CheckDetails.CheckStatus;
import pcftest.InvoicePanelSet.InvoiceDocuments;
import pcftest.InvoicePanelSet.InvoiceDocuments.StatementDocumentsLV_tb;
import pcftest.InvoicePanelSet.InvoiceDocuments.StatementDocumentsLV_tb.RefreshAsyncContent;
import pcftest.InvoicePanelSet.InvoiceTabWaitingForInvoiceAlert;
import pcftest.InvoicePanelSet.InvoiceTabWaitingForInvoiceAlertText;
import pcftest.InvoicePanelSet.InvoiceWithNoQuoteAlert;
import pcftest.InvoicePanelSet.InvoiceWithNoQuoteMessage;
import pcftest.InvoicePanelSet.InvoiceWithWaitingForApprovalQuoteAlert;
import pcftest.InvoicePanelSet.InvoiceWithWaitingForApprovalQuoteMessage;
import pcftest.InvoicePanelSet.InvoiceWithWaitingForRevisedQuoteAlert;
import pcftest.InvoicePanelSet.InvoiceWithWaitingForRevisedQuoteMessage;
import pcftest.InvoicePanelSet.MarkAsPaid;
import pcftest.InvoicePanelSet.MarkAsUnpaid;
import pcftest.InvoicePanelSet.PaidBy;
import pcftest.InvoicePanelSet.PaidBy.PaidByUserSearchMenuItem;
import pcftest.InvoicePanelSet.PaidBy.PaidByUserSelectMenuItem;
import pcftest.InvoicePanelSet.PayInvoice;
import pcftest.InvoicePanelSet.RejectInvoice;
import pcftest.InvoicePanelSet.StatementLineItemLV_tb;
import pcftest.InvoicePanelSet.StatementLineItemLV_tb.Add;
import pcftest.InvoicePanelSet.StatementLineItemLV_tb.Remove;
import pcftest.InvoicePanelSet.Status;
import pcftest.InvoicePanelSet.WithdrawInvoice;
import typekey.ServiceRequestInvoiceStatus;
import typekey.TransactionStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/servicerequests/InvoicePanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class InvoicePanelSet extends PCFElement {
  public final static String CHECKSUM = "08ad8758c2ef58c17af12507634dbdf6";
  
  public InvoicePanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DateElement getApprovalDate() {
    return getOrCreateProperty("ApprovalDate", "ApprovalDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ApproveInvoice getApproveInvoice() {
    return getOrCreateProperty("ApproveInvoice", "ApproveInvoice", null, pcftest.InvoicePanelSet.ApproveInvoice.class);
  }
  
  public ApprovedBy getApprovedBy() {
    return getOrCreateProperty("ApprovedBy", "ApprovedBy", null, pcftest.InvoicePanelSet.ApprovedBy.class);
  }
  
  public CheckDetails getCheckDetails() {
    return getOrCreateProperty("CheckDetails", "CheckDetails", null, pcftest.InvoicePanelSet.CheckDetails.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public InvoiceDocuments getInvoiceDocuments() {
    return getOrCreateProperty("InvoiceDocuments", "InvoiceDocuments", null, pcftest.InvoicePanelSet.InvoiceDocuments.class);
  }
  
  public InvoiceTabWaitingForInvoiceAlert getInvoiceTabWaitingForInvoiceAlert() {
    return getOrCreateProperty("InvoiceTabWaitingForInvoiceAlert", "InvoiceTabWaitingForInvoiceAlert", null, pcftest.InvoicePanelSet.InvoiceTabWaitingForInvoiceAlert.class);
  }
  
  public InvoiceTabWaitingForInvoiceAlertText getInvoiceTabWaitingForInvoiceAlertText() {
    return getOrCreateProperty("InvoiceTabWaitingForInvoiceAlertText", "InvoiceTabWaitingForInvoiceAlertText", null, pcftest.InvoicePanelSet.InvoiceTabWaitingForInvoiceAlertText.class);
  }
  
  public InvoiceWithNoQuoteAlert getInvoiceWithNoQuoteAlert() {
    return getOrCreateProperty("InvoiceWithNoQuoteAlert", "InvoiceWithNoQuoteAlert", null, pcftest.InvoicePanelSet.InvoiceWithNoQuoteAlert.class);
  }
  
  public InvoiceWithNoQuoteMessage getInvoiceWithNoQuoteMessage() {
    return getOrCreateProperty("InvoiceWithNoQuoteMessage", "InvoiceWithNoQuoteMessage", null, pcftest.InvoicePanelSet.InvoiceWithNoQuoteMessage.class);
  }
  
  public InvoiceWithWaitingForApprovalQuoteAlert getInvoiceWithWaitingForApprovalQuoteAlert() {
    return getOrCreateProperty("InvoiceWithWaitingForApprovalQuoteAlert", "InvoiceWithWaitingForApprovalQuoteAlert", null, pcftest.InvoicePanelSet.InvoiceWithWaitingForApprovalQuoteAlert.class);
  }
  
  public InvoiceWithWaitingForApprovalQuoteMessage getInvoiceWithWaitingForApprovalQuoteMessage() {
    return getOrCreateProperty("InvoiceWithWaitingForApprovalQuoteMessage", "InvoiceWithWaitingForApprovalQuoteMessage", null, pcftest.InvoicePanelSet.InvoiceWithWaitingForApprovalQuoteMessage.class);
  }
  
  public InvoiceWithWaitingForRevisedQuoteAlert getInvoiceWithWaitingForRevisedQuoteAlert() {
    return getOrCreateProperty("InvoiceWithWaitingForRevisedQuoteAlert", "InvoiceWithWaitingForRevisedQuoteAlert", null, pcftest.InvoicePanelSet.InvoiceWithWaitingForRevisedQuoteAlert.class);
  }
  
  public InvoiceWithWaitingForRevisedQuoteMessage getInvoiceWithWaitingForRevisedQuoteMessage() {
    return getOrCreateProperty("InvoiceWithWaitingForRevisedQuoteMessage", "InvoiceWithWaitingForRevisedQuoteMessage", null, pcftest.InvoicePanelSet.InvoiceWithWaitingForRevisedQuoteMessage.class);
  }
  
  public MarkAsPaid getMarkAsPaid() {
    return getOrCreateProperty("MarkAsPaid", "MarkAsPaid", null, pcftest.InvoicePanelSet.MarkAsPaid.class);
  }
  
  public MarkAsUnpaid getMarkAsUnpaid() {
    return getOrCreateProperty("MarkAsUnpaid", "MarkAsUnpaid", null, pcftest.InvoicePanelSet.MarkAsUnpaid.class);
  }
  
  public PaidBy getPaidBy() {
    return getOrCreateProperty("PaidBy", "PaidBy", null, pcftest.InvoicePanelSet.PaidBy.class);
  }
  
  public PayInvoice getPayInvoice() {
    return getOrCreateProperty("PayInvoice", "PayInvoice", null, pcftest.InvoicePanelSet.PayInvoice.class);
  }
  
  public DateElement getPaymentDate() {
    return getOrCreateProperty("PaymentDate", "PaymentDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getReferenceNumber() {
    return getOrCreateProperty("ReferenceNumber", "ReferenceNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public RejectInvoice getRejectInvoice() {
    return getOrCreateProperty("RejectInvoice", "RejectInvoice", null, pcftest.InvoicePanelSet.RejectInvoice.class);
  }
  
  public ValueElement getRejectedReason() {
    return getOrCreateProperty("RejectedReason", "RejectedReason", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public StatementLineItemLV getStatementLineItemLV() {
    return getOrCreateProperty("StatementLineItemLV", "StatementLineItemLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.StatementLineItemLV.class);
  }
  
  public StatementLineItemLV_tb getStatementLineItemLV_tb() {
    return getOrCreateProperty("StatementLineItemLV_tb", "StatementLineItemLV_tb", null, pcftest.InvoicePanelSet.StatementLineItemLV_tb.class);
  }
  
  public Status getStatus() {
    return getOrCreateProperty("Status", "Status", null, pcftest.InvoicePanelSet.Status.class);
  }
  
  public DateElement getSubmittedDate() {
    return getOrCreateProperty("SubmittedDate", "SubmittedDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public WithdrawInvoice getWithdrawInvoice() {
    return getOrCreateProperty("WithdrawInvoice", "WithdrawInvoice", null, pcftest.InvoicePanelSet.WithdrawInvoice.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/InvoicePanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApproveInvoice extends ClickableActionElement {
    public ApproveInvoice(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApprovedBy extends SelectElement {
    public ApprovedBy(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ApprovedByUserSearchMenuItem getApprovedByUserSearchMenuItem() {
      return getOrCreateProperty("ApprovedByUserSearchMenuItem", "ApprovedByUserSearchMenuItem", null, pcftest.InvoicePanelSet.ApprovedBy.ApprovedByUserSearchMenuItem.class);
    }
    
    public ApprovedByUserSelectMenuItem getApprovedByUserSelectMenuItem() {
      return getOrCreateProperty("ApprovedByUserSelectMenuItem", "ApprovedByUserSelectMenuItem", null, pcftest.InvoicePanelSet.ApprovedBy.ApprovedByUserSelectMenuItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ApprovedByUserSearchMenuItem extends ClickableActionElement {
      public ApprovedByUserSearchMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserSearchPopup click() {
        return clickThis(pcftest.UserSearchPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ApprovedByUserSelectMenuItem extends ClickableActionElement {
      public ApprovedByUserSelectMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserSelectPopup click() {
        return clickThis(pcftest.UserSelectPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/InvoicePanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckDetails extends PCFElement {
    public CheckDetails(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getCheckAmount() {
      return getOrCreateProperty("CheckAmount", "CheckAmount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public CheckLabel getCheckLabel() {
      return getOrCreateProperty("CheckLabel", "CheckLabel", null, pcftest.InvoicePanelSet.CheckDetails.CheckLabel.class);
    }
    
    public ValueElement getCheckNumber() {
      return getOrCreateProperty("CheckNumber", "CheckNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getCheckScheduledSendDate() {
      return getOrCreateProperty("CheckScheduledSendDate", "CheckScheduledSendDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public CheckStatus getCheckStatus() {
      return getOrCreateProperty("CheckStatus", "CheckStatus", null, pcftest.InvoicePanelSet.CheckDetails.CheckStatus.class);
    }
    
    public ValueElement getInvoiceLinkedToMultipleInvoices() {
      return getOrCreateProperty("InvoiceLinkedToMultipleInvoices", "InvoiceLinkedToMultipleInvoices", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/InvoicePanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CheckLabel extends ValueElement {
      public CheckLabel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimFinancialsChecksDetail click() {
        return clickThis(pcftest.ClaimFinancialsChecksDetail.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/InvoicePanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/InvoicePanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InvoiceDocuments extends PCFElement {
    public InvoiceDocuments(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public StatementDocumentsLV getStatementDocumentsLV() {
      return getOrCreateProperty("StatementDocumentsLV", "StatementDocumentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.StatementDocumentsLV.class);
    }
    
    public StatementDocumentsLV_tb getStatementDocumentsLV_tb() {
      return getOrCreateProperty("StatementDocumentsLV_tb", "StatementDocumentsLV_tb", null, pcftest.InvoicePanelSet.InvoiceDocuments.StatementDocumentsLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/InvoicePanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatementDocumentsLV_tb extends PCFElement {
      public StatementDocumentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public RefreshAsyncContent getRefreshAsyncContent() {
        return getOrCreateProperty("RefreshAsyncContent", "RefreshAsyncContent", null, pcftest.InvoicePanelSet.InvoiceDocuments.StatementDocumentsLV_tb.RefreshAsyncContent.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/InvoicePanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class RefreshAsyncContent extends ClickableActionElement {
        public RefreshAsyncContent(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/InvoicePanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InvoiceTabWaitingForInvoiceAlert extends ClickableActionElement {
    public InvoiceTabWaitingForInvoiceAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/InvoicePanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InvoiceTabWaitingForInvoiceAlertText extends ClickableActionElement {
    public InvoiceTabWaitingForInvoiceAlertText(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/InvoicePanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InvoiceWithNoQuoteAlert extends ClickableActionElement {
    public InvoiceWithNoQuoteAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/InvoicePanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InvoiceWithNoQuoteMessage extends ClickableActionElement {
    public InvoiceWithNoQuoteMessage(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/InvoicePanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InvoiceWithWaitingForApprovalQuoteAlert extends ClickableActionElement {
    public InvoiceWithWaitingForApprovalQuoteAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/InvoicePanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InvoiceWithWaitingForApprovalQuoteMessage extends ClickableActionElement {
    public InvoiceWithWaitingForApprovalQuoteMessage(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/InvoicePanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InvoiceWithWaitingForRevisedQuoteAlert extends ClickableActionElement {
    public InvoiceWithWaitingForRevisedQuoteAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/InvoicePanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InvoiceWithWaitingForRevisedQuoteMessage extends ClickableActionElement {
    public InvoiceWithWaitingForRevisedQuoteMessage(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/InvoicePanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MarkAsPaid extends ClickableActionElement {
    public MarkAsPaid(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public MarkInvoicePaidPopup click() {
      return clickThis(pcftest.MarkInvoicePaidPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/InvoicePanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MarkAsUnpaid extends ClickableActionElement {
    public MarkAsUnpaid(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OperationReasonPromptPopup click() {
      return clickThis(pcftest.OperationReasonPromptPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PaidBy extends SelectElement {
    public PaidBy(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PaidByUserSearchMenuItem getPaidByUserSearchMenuItem() {
      return getOrCreateProperty("PaidByUserSearchMenuItem", "PaidByUserSearchMenuItem", null, pcftest.InvoicePanelSet.PaidBy.PaidByUserSearchMenuItem.class);
    }
    
    public PaidByUserSelectMenuItem getPaidByUserSelectMenuItem() {
      return getOrCreateProperty("PaidByUserSelectMenuItem", "PaidByUserSelectMenuItem", null, pcftest.InvoicePanelSet.PaidBy.PaidByUserSelectMenuItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PaidByUserSearchMenuItem extends ClickableActionElement {
      public PaidByUserSearchMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserSearchPopup click() {
        return clickThis(pcftest.UserSearchPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/UserWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PaidByUserSelectMenuItem extends ClickableActionElement {
      public PaidByUserSelectMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public UserSelectPopup click() {
        return clickThis(pcftest.UserSelectPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/InvoicePanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PayInvoice extends ClickableActionElement {
    public PayInvoice(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/InvoicePanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RejectInvoice extends ClickableActionElement {
    public RejectInvoice(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RejectInvoicePopup click() {
      return clickThis(pcftest.RejectInvoicePopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/InvoicePanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatementLineItemLV_tb extends PCFElement {
    public StatementLineItemLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.InvoicePanelSet.StatementLineItemLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.InvoicePanelSet.StatementLineItemLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/InvoicePanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/InvoicePanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/InvoicePanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/servicerequests/InvoicePanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WithdrawInvoice extends ClickableActionElement {
    public WithdrawInvoice(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OperationReasonPromptPopup click() {
      return clickThis(pcftest.OperationReasonPromptPopup.class);
    }
    
    
  }
  
  
}