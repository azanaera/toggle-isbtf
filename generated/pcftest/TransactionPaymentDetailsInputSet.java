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
import pcftest.TransactionPaymentDetailsInputSet.Check_BankAccount;
import pcftest.TransactionPaymentDetailsInputSet.Check_PaymentMethod;
import pcftest.TransactionPaymentDetailsInputSet.Check_Status;
import typekey.BankAccount;
import typekey.PaymentMethod;
import typekey.TransactionStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionPaymentDetailsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionPaymentDetailsInputSet extends PCFElement {
  public final static String CHECKSUM = "4c8770d498fa8168b6a41b6a5dfe410b";
  
  public TransactionPaymentDetailsInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Check_BankAccount getCheck_BankAccount() {
    return getOrCreateProperty("Check_BankAccount", "Check_BankAccount", null, pcftest.TransactionPaymentDetailsInputSet.Check_BankAccount.class);
  }
  
  public ValueElement getCheck_CheckNumber() {
    return getOrCreateProperty("Check_CheckNumber", "Check_CheckNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getCheck_DateOfService() {
    return getOrCreateProperty("Check_DateOfService", "Check_DateOfService", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getCheck_InvoiceNumber() {
    return getOrCreateProperty("Check_InvoiceNumber", "Check_InvoiceNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getCheck_IssueDate() {
    return getOrCreateProperty("Check_IssueDate", "Check_IssueDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getCheck_NetAmount() {
    return getOrCreateProperty("Check_NetAmount", "Check_NetAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCheck_PayTo() {
    return getOrCreateProperty("Check_PayTo", "Check_PayTo", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Check_PaymentMethod getCheck_PaymentMethod() {
    return getOrCreateProperty("Check_PaymentMethod", "Check_PaymentMethod", null, pcftest.TransactionPaymentDetailsInputSet.Check_PaymentMethod.class);
  }
  
  public DateElement getCheck_ScheduledSendDate() {
    return getOrCreateProperty("Check_ScheduledSendDate", "Check_ScheduledSendDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getCheck_ServicePeriod() {
    return getOrCreateProperty("Check_ServicePeriod", "Check_ServicePeriod", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Check_Status getCheck_Status() {
    return getOrCreateProperty("Check_Status", "Check_Status", null, pcftest.TransactionPaymentDetailsInputSet.Check_Status.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionPaymentDetailsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_BankAccount extends SelectElement {
    public Check_BankAccount(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(BankAccount arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public BankAccount getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.BankAccount.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(BankAccount arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionPaymentDetailsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_PaymentMethod extends SelectElement {
    public Check_PaymentMethod(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PaymentMethod arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PaymentMethod getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PaymentMethod.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PaymentMethod arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionPaymentDetailsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_Status extends SelectElement {
    public Check_Status(ISmokeTest helper, PCFElementId componentId)  {
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