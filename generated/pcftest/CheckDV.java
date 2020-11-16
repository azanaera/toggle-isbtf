package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CheckDV.ApprovalHistoryLV_tb;
import pcftest.CheckDV.BulkInvoice;
import pcftest.CheckDV.CheckGroupChecksLV_tb;
import pcftest.CheckDV.CheckInstructions;
import pcftest.CheckDV.CheckPayeesLV_tb;
import pcftest.CheckDV.CheckSummaryPaymentsLV_tb;
import pcftest.CheckDV.Claimant;
import pcftest.CheckDV.CreateUser;
import pcftest.CheckDV.EFTDataInputSet;
import pcftest.CheckDV.PaymentDeductionsLV_tb;
import pcftest.CheckDV.RecurrenceChecksLV_tb;
import pcftest.CheckDV.ServiceRequestInvoicesLV;
import pcftest.CheckDV.ServiceRequestInvoicesLV.AmountHeader;
import pcftest.CheckDV.ServiceRequestInvoicesLV.DescriptionHeader;
import pcftest.CheckDV.ServiceRequestInvoicesLV.InvoiceReferenceNumberHeader;
import pcftest.CheckDV.ServiceRequestInvoicesLV.ServiceRequestNumberHeader;
import pcftest.CheckDV.ServiceRequestInvoicesLV.SubmittedDateHeader;
import pcftest.CheckDV.ServiceRequestInvoicesLV._ListPaging;
import pcftest.CheckDV.ServiceRequestInvoicesLV.entry;
import pcftest.CheckDV.ServiceRequestInvoicesLV.entry.InvoiceReferenceNumber;
import pcftest.CheckDV.ServiceRequestInvoicesLV.entry._Select;
import pcftest.CheckDV.ServiceRequestInvoicesLV.entry._ViewDetail;
import pcftest.CheckDV.ServiceRequestInvoicesLV_tb;
import pcftest.CheckDV.Status;
import pcftest.CheckDV.TaxReporting;
import pcftest.CheckDV.UnmodifiableTransactionSetDocumentsLV_tb;
import typekey.CheckHandlingInstructions;
import typekey.ReportabilityType;
import typekey.TransactionStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/CheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckDV extends DetailViewElement {
  public final static String CHECKSUM = "160e5927138b9e20598c163211381521";
  
  public CheckDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAmount_Gross() {
    return getOrCreateProperty("Amount_Gross", "Amount_Gross", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getAmount_Net() {
    return getOrCreateProperty("Amount_Net", "Amount_Net", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getAmount_Reportable() {
    return getOrCreateProperty("Amount_Reportable", "Amount_Reportable", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ApprovalHistoryLV getApprovalHistoryLV() {
    return getOrCreateProperty("ApprovalHistoryLV", "ApprovalHistoryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ApprovalHistoryLV.class);
  }
  
  public ApprovalHistoryLV_tb getApprovalHistoryLV_tb() {
    return getOrCreateProperty("ApprovalHistoryLV_tb", "ApprovalHistoryLV_tb", null, pcftest.CheckDV.ApprovalHistoryLV_tb.class);
  }
  
  public pcftest.CheckDV.BankAccount getBankAccount() {
    return getOrCreateProperty("BankAccount", "BankAccount", null, pcftest.CheckDV.BankAccount.class);
  }
  
  public BulkInvoice getBulkInvoice() {
    return getOrCreateProperty("BulkInvoice", "BulkInvoice", null, pcftest.CheckDV.BulkInvoice.class);
  }
  
  public pcftest.CheckDV.CheckBatching getCheckBatching() {
    return getOrCreateProperty("CheckBatching", "CheckBatching", null, pcftest.CheckDV.CheckBatching.class);
  }
  
  public CheckExchangeRateInputSet getCheckExchangeRateInputSet() {
    return getOrCreateProperty("CheckExchangeRateInputSet", "CheckExchangeRateInputSet", null, pcftest.CheckExchangeRateInputSet.class);
  }
  
  public CheckGroupChecksLV getCheckGroupChecksLV() {
    return getOrCreateProperty("CheckGroupChecksLV", "CheckGroupChecksLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.CheckGroupChecksLV.class);
  }
  
  public CheckGroupChecksLV_tb getCheckGroupChecksLV_tb() {
    return getOrCreateProperty("CheckGroupChecksLV_tb", "CheckGroupChecksLV_tb", null, pcftest.CheckDV.CheckGroupChecksLV_tb.class);
  }
  
  public CheckInstructions getCheckInstructions() {
    return getOrCreateProperty("CheckInstructions", "CheckInstructions", null, pcftest.CheckDV.CheckInstructions.class);
  }
  
  public ValueElement getCheckNumber() {
    return getOrCreateProperty("CheckNumber", "CheckNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CheckPayeesLV getCheckPayeesLV() {
    return getOrCreateProperty("CheckPayeesLV", "CheckPayeesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.CheckPayeesLV.class);
  }
  
  public CheckPayeesLV_tb getCheckPayeesLV_tb() {
    return getOrCreateProperty("CheckPayeesLV_tb", "CheckPayeesLV_tb", null, pcftest.CheckDV.CheckPayeesLV_tb.class);
  }
  
  public CheckSummaryPaymentsLV getCheckSummaryPaymentsLV() {
    return getOrCreateProperty("CheckSummaryPaymentsLV", "CheckSummaryPaymentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.CheckSummaryPaymentsLV.class);
  }
  
  public CheckSummaryPaymentsLV_tb getCheckSummaryPaymentsLV_tb() {
    return getOrCreateProperty("CheckSummaryPaymentsLV_tb", "CheckSummaryPaymentsLV_tb", null, pcftest.CheckDV.CheckSummaryPaymentsLV_tb.class);
  }
  
  public Claimant getClaimant() {
    return getOrCreateProperty("Claimant", "Claimant", null, pcftest.CheckDV.Claimant.class);
  }
  
  public ValueElement getComments() {
    return getOrCreateProperty("Comments", "Comments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getCreateTime() {
    return getOrCreateProperty("CreateTime", "CreateTime", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public CreateUser getCreateUser() {
    return getOrCreateProperty("CreateUser", "CreateUser", null, pcftest.CheckDV.CreateUser.class);
  }
  
  public DateElement getDateOfService() {
    return getOrCreateProperty("DateOfService", "DateOfService", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public pcftest.CheckDV.DeliveryMethod getDeliveryMethod() {
    return getOrCreateProperty("DeliveryMethod", "DeliveryMethod", null, pcftest.CheckDV.DeliveryMethod.class);
  }
  
  public EFTDataInputSet getEFTDataInputSet() {
    return getOrCreateProperty("EFTDataInputSet", "EFTDataInputSet", null, pcftest.CheckDV.EFTDataInputSet.class);
  }
  
  public ValueElement getInvoiceNumber() {
    return getOrCreateProperty("InvoiceNumber", "InvoiceNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getIssueDate() {
    return getOrCreateProperty("IssueDate", "IssueDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getMailToContact() {
    return getOrCreateProperty("MailToContact", "MailToContact", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getMailingAddress() {
    return getOrCreateProperty("MailingAddress", "MailingAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getMemo() {
    return getOrCreateProperty("Memo", "Memo", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPayTo() {
    return getOrCreateProperty("PayTo", "PayTo", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PaymentDeductionsLV getPaymentDeductionsLV() {
    return getOrCreateProperty("PaymentDeductionsLV", "PaymentDeductionsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PaymentDeductionsLV.class);
  }
  
  public PaymentDeductionsLV_tb getPaymentDeductionsLV_tb() {
    return getOrCreateProperty("PaymentDeductionsLV_tb", "PaymentDeductionsLV_tb", null, pcftest.CheckDV.PaymentDeductionsLV_tb.class);
  }
  
  public pcftest.CheckDV.PaymentMethod getPaymentMethod() {
    return getOrCreateProperty("PaymentMethod", "PaymentMethod", null, pcftest.CheckDV.PaymentMethod.class);
  }
  
  public ValueElement getPortion_FixedAmount() {
    return getOrCreateProperty("Portion_FixedAmount", "Portion_FixedAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPortion_Percentage() {
    return getOrCreateProperty("Portion_Percentage", "Portion_Percentage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public RecurrenceChecksLV getRecurrenceChecksLV() {
    return getOrCreateProperty("RecurrenceChecksLV", "RecurrenceChecksLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.RecurrenceChecksLV.class);
  }
  
  public RecurrenceChecksLV_tb getRecurrenceChecksLV_tb() {
    return getOrCreateProperty("RecurrenceChecksLV_tb", "RecurrenceChecksLV_tb", null, pcftest.CheckDV.RecurrenceChecksLV_tb.class);
  }
  
  public ValueElement getRecurrence_Description() {
    return getOrCreateProperty("Recurrence_Description", "Recurrence_Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getRecurrence_Total() {
    return getOrCreateProperty("Recurrence_Total", "Recurrence_Total", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getScheduledSendDate() {
    return getOrCreateProperty("ScheduledSendDate", "ScheduledSendDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getServicePeriod() {
    return getOrCreateProperty("ServicePeriod", "ServicePeriod", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ServiceRequestInvoicesLV getServiceRequestInvoicesLV() {
    return getOrCreateProperty("ServiceRequestInvoicesLV", "ServiceRequestInvoicesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.CheckDV.ServiceRequestInvoicesLV.class);
  }
  
  public ServiceRequestInvoicesLV_tb getServiceRequestInvoicesLV_tb() {
    return getOrCreateProperty("ServiceRequestInvoicesLV_tb", "ServiceRequestInvoicesLV_tb", null, pcftest.CheckDV.ServiceRequestInvoicesLV_tb.class);
  }
  
  public Status getStatus() {
    return getOrCreateProperty("Status", "Status", null, pcftest.CheckDV.Status.class);
  }
  
  public TaxReporting getTaxReporting() {
    return getOrCreateProperty("TaxReporting", "TaxReporting", null, pcftest.CheckDV.TaxReporting.class);
  }
  
  public ValueElement getTransfer_Amount() {
    return getOrCreateProperty("Transfer_Amount", "Transfer_Amount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTransfer_Check() {
    return getOrCreateProperty("Transfer_Check", "Transfer_Check", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public UnmodifiableTransactionSetDocumentsLV getUnmodifiableTransactionSetDocumentsLV() {
    return getOrCreateProperty("UnmodifiableTransactionSetDocumentsLV", "UnmodifiableTransactionSetDocumentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.UnmodifiableTransactionSetDocumentsLV.class);
  }
  
  public UnmodifiableTransactionSetDocumentsLV_tb getUnmodifiableTransactionSetDocumentsLV_tb() {
    return getOrCreateProperty("UnmodifiableTransactionSetDocumentsLV_tb", "UnmodifiableTransactionSetDocumentsLV_tb", null, pcftest.CheckDV.UnmodifiableTransactionSetDocumentsLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApprovalHistoryLV_tb extends PCFElement {
    public ApprovalHistoryLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BankAccount extends SelectElement {
    public BankAccount(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.BankAccount arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.BankAccount getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.BankAccount.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.BankAccount arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoice extends ValueElement {
    public BulkInvoice(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EditBulkInvoiceDetail click() {
      return clickThis(pcftest.EditBulkInvoiceDetail.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckBatching extends SelectElement {
    public CheckBatching(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.CheckBatching arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.CheckBatching getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CheckBatching.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.CheckBatching arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckGroupChecksLV_tb extends PCFElement {
    public CheckGroupChecksLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckInstructions extends SelectElement {
    public CheckInstructions(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(CheckHandlingInstructions arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public CheckHandlingInstructions getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CheckHandlingInstructions.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(CheckHandlingInstructions arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckPayeesLV_tb extends PCFElement {
    public CheckPayeesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckSummaryPaymentsLV_tb extends PCFElement {
    public CheckSummaryPaymentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claimant extends SelectElement {
    public Claimant(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.CheckDV.Claimant.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.CheckDV.Claimant.MenuItem_Search.class);
    }
    
    public pcftest.CheckDV.Claimant.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.CheckDV.Claimant.MenuItem_ViewDetails.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_Search extends ClickableActionElement {
      public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookPickerPopup click() {
        return clickThis(pcftest.AddressBookPickerPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_ViewDetails extends ClickableActionElement {
      public MenuItem_ViewDetails(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CreateUser extends SelectElement {
    public CreateUser(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.CheckDV.CreateUser.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.CheckDV.CreateUser.MenuItem_Search.class);
    }
    
    public pcftest.CheckDV.CreateUser.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.CheckDV.CreateUser.MenuItem_ViewDetails.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_Search extends ClickableActionElement {
      public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookPickerPopup click() {
        return clickThis(pcftest.AddressBookPickerPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_ViewDetails extends ClickableActionElement {
      public MenuItem_ViewDetails(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeliveryMethod extends SelectElement {
    public DeliveryMethod(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.DeliveryMethod arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.DeliveryMethod getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.DeliveryMethod.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.DeliveryMethod arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EFTDataInputSet extends PCFElement {
    public EFTDataInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getBankAccountNumber() {
      return getOrCreateProperty("BankAccountNumber", "BankAccountNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public SelectElement getBankAccountType() {
      return getOrCreateProperty("BankAccountType", "BankAccountType", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public ValueElement getBankName() {
      return getOrCreateProperty("BankName", "BankName", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getBankRoutingNumber() {
      return getOrCreateProperty("BankRoutingNumber", "BankRoutingNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public SelectElement getEFTRecords() {
      return getOrCreateProperty("EFTRecords", "EFTRecords", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public ValueElement getPayTo() {
      return getOrCreateProperty("PayTo", "PayTo", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PaymentDeductionsLV_tb extends PCFElement {
    public PaymentDeductionsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PaymentMethod extends SelectElement {
    public PaymentMethod(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.PaymentMethod arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.PaymentMethod getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PaymentMethod.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.PaymentMethod arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecurrenceChecksLV_tb extends PCFElement {
    public RecurrenceChecksLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServiceRequestInvoicesLV extends PCFElement {
    public ServiceRequestInvoicesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AmountHeader getAmountHeader() {
      return getOrCreateProperty("AmountHeader", "AmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckDV.ServiceRequestInvoicesLV.AmountHeader.class);
    }
    
    public DescriptionHeader getDescriptionHeader() {
      return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckDV.ServiceRequestInvoicesLV.DescriptionHeader.class);
    }
    
    public InvoiceReferenceNumberHeader getInvoiceReferenceNumberHeader() {
      return getOrCreateProperty("InvoiceReferenceNumberHeader", "InvoiceReferenceNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckDV.ServiceRequestInvoicesLV.InvoiceReferenceNumberHeader.class);
    }
    
    public ServiceRequestNumberHeader getServiceRequestNumberHeader() {
      return getOrCreateProperty("ServiceRequestNumberHeader", "ServiceRequestNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckDV.ServiceRequestInvoicesLV.ServiceRequestNumberHeader.class);
    }
    
    public SubmittedDateHeader getSubmittedDateHeader() {
      return getOrCreateProperty("SubmittedDateHeader", "SubmittedDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CheckDV.ServiceRequestInvoicesLV.SubmittedDateHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.CheckDV.ServiceRequestInvoicesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.CheckDV.ServiceRequestInvoicesLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AmountHeader extends ValueElement {
      public AmountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DescriptionHeader extends ValueElement {
      public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InvoiceReferenceNumberHeader extends ValueElement {
      public InvoiceReferenceNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ServiceRequestNumberHeader extends ValueElement {
      public ServiceRequestNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SubmittedDateHeader extends ValueElement {
      public SubmittedDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getAmount() {
        return getOrCreateProperty("Amount", "Amount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getDescription() {
        return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public InvoiceReferenceNumber getInvoiceReferenceNumber() {
        return getOrCreateProperty("InvoiceReferenceNumber", "InvoiceReferenceNumber", null, pcftest.CheckDV.ServiceRequestInvoicesLV.entry.InvoiceReferenceNumber.class);
      }
      
      public ValueElement getServiceRequestNumber() {
        return getOrCreateProperty("ServiceRequestNumber", "ServiceRequestNumber", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public DateElement getSubmittedDate() {
        return getOrCreateProperty("SubmittedDate", "SubmittedDate", null, gw.smoketest.platform.web.DateElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.CheckDV.ServiceRequestInvoicesLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.CheckDV.ServiceRequestInvoicesLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class InvoiceReferenceNumber extends ValueElement {
        public InvoiceReferenceNumber(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ClaimServiceRequests click() {
          return clickThis(pcftest.ClaimServiceRequests.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServiceRequestInvoicesLV_tb extends PCFElement {
    public ServiceRequestInvoicesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Status extends SelectElement {
    public Status(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TaxReporting extends SelectElement {
    public TaxReporting(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ReportabilityType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ReportabilityType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ReportabilityType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ReportabilityType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UnmodifiableTransactionSetDocumentsLV_tb extends PCFElement {
    public UnmodifiableTransactionSetDocumentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}