package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ApprovalDetailDV_CheckSet.ApprovalHistoryLV_tb;
import pcftest.ApprovalDetailDV_CheckSet.CheckInstructions;
import pcftest.ApprovalDetailDV_CheckSet.CheckSummaryPaymentsLV_tb;
import pcftest.ApprovalDetailDV_CheckSet.TaxReporting;
import pcftest.ApprovalDetailDV_CheckSet.UnmodifiableTransactionSetDocumentsLV_tb;
import typekey.CheckHandlingInstructions;
import typekey.ReportabilityType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailDV.CheckSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ApprovalDetailDV_CheckSet extends ApprovalDetailDV {
  public final static String CHECKSUM = "ce6404756815393099586cbce96e5d39";
  
  public ApprovalDetailDV_CheckSet(ISmokeTest helper, PCFElementId componentId)  {
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
    return getOrCreateProperty("ApprovalHistoryLV_tb", "ApprovalHistoryLV_tb", null, pcftest.ApprovalDetailDV_CheckSet.ApprovalHistoryLV_tb.class);
  }
  
  public ValueElement getApprovalRationale() {
    return getOrCreateProperty("ApprovalRationale", "ApprovalRationale", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.ApprovalDetailDV_CheckSet.BankAccount getBankAccount() {
    return getOrCreateProperty("BankAccount", "BankAccount", null, pcftest.ApprovalDetailDV_CheckSet.BankAccount.class);
  }
  
  public pcftest.ApprovalDetailDV_CheckSet.CheckBatching getCheckBatching() {
    return getOrCreateProperty("CheckBatching", "CheckBatching", null, pcftest.ApprovalDetailDV_CheckSet.CheckBatching.class);
  }
  
  public CheckInstructions getCheckInstructions() {
    return getOrCreateProperty("CheckInstructions", "CheckInstructions", null, pcftest.ApprovalDetailDV_CheckSet.CheckInstructions.class);
  }
  
  public ValueElement getCheckNumber() {
    return getOrCreateProperty("CheckNumber", "CheckNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CheckSummaryPaymentsLV getCheckSummaryPaymentsLV() {
    return getOrCreateProperty("CheckSummaryPaymentsLV", "CheckSummaryPaymentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.CheckSummaryPaymentsLV.class);
  }
  
  public CheckSummaryPaymentsLV_tb getCheckSummaryPaymentsLV_tb() {
    return getOrCreateProperty("CheckSummaryPaymentsLV_tb", "CheckSummaryPaymentsLV_tb", null, pcftest.ApprovalDetailDV_CheckSet.CheckSummaryPaymentsLV_tb.class);
  }
  
  public ValueElement getClaimant() {
    return getOrCreateProperty("Claimant", "Claimant", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getCreateTime() {
    return getOrCreateProperty("CreateTime", "CreateTime", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getCreateUser() {
    return getOrCreateProperty("CreateUser", "CreateUser", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getDateOfService() {
    return getOrCreateProperty("DateOfService", "DateOfService", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getDeductions() {
    return getOrCreateProperty("Deductions", "Deductions", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.ApprovalDetailDV_CheckSet.DeliveryMethod getDeliveryMethod() {
    return getOrCreateProperty("DeliveryMethod", "DeliveryMethod", null, pcftest.ApprovalDetailDV_CheckSet.DeliveryMethod.class);
  }
  
  public ValueElement getInvoiceNumber() {
    return getOrCreateProperty("InvoiceNumber", "InvoiceNumber", null, gw.smoketest.platform.web.ValueElement.class);
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
  
  public pcftest.ApprovalDetailDV_CheckSet.PaymentMethod getPaymentMethod() {
    return getOrCreateProperty("PaymentMethod", "PaymentMethod", null, pcftest.ApprovalDetailDV_CheckSet.PaymentMethod.class);
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
  
  public TaxReporting getTaxReporting() {
    return getOrCreateProperty("TaxReporting", "TaxReporting", null, pcftest.ApprovalDetailDV_CheckSet.TaxReporting.class);
  }
  
  public UnmodifiableTransactionSetDocumentsLV getUnmodifiableTransactionSetDocumentsLV() {
    return getOrCreateProperty("UnmodifiableTransactionSetDocumentsLV", "UnmodifiableTransactionSetDocumentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.UnmodifiableTransactionSetDocumentsLV.class);
  }
  
  public UnmodifiableTransactionSetDocumentsLV_tb getUnmodifiableTransactionSetDocumentsLV_tb() {
    return getOrCreateProperty("UnmodifiableTransactionSetDocumentsLV_tb", "UnmodifiableTransactionSetDocumentsLV_tb", null, pcftest.ApprovalDetailDV_CheckSet.UnmodifiableTransactionSetDocumentsLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailDV.CheckSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApprovalHistoryLV_tb extends PCFElement {
    public ApprovalHistoryLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailDV.CheckSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailDV.CheckSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailDV.CheckSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailDV.CheckSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckSummaryPaymentsLV_tb extends PCFElement {
    public CheckSummaryPaymentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailDV.CheckSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailDV.CheckSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailDV.CheckSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailDV.CheckSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UnmodifiableTransactionSetDocumentsLV_tb extends PCFElement {
    public UnmodifiableTransactionSetDocumentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}