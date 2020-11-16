package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CheckWizardCheckSummaryInputSet.Check_Claimant;
import pcftest.CheckWizardCheckSummaryInputSet.Check_Claimant.MenuItem_Search;
import pcftest.CheckWizardCheckSummaryInputSet.Check_Claimant.MenuItem_ViewDetails;
import pcftest.CheckWizardCheckSummaryInputSet.Check_Deductions;
import pcftest.CheckWizardCheckSummaryInputSet.NewCheckGroupChecksLV_tb;
import pcftest.CheckWizardCheckSummaryInputSet.TransactionSetDocumentsLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/shared/CheckWizardCheckSummaryInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckWizardCheckSummaryInputSet extends PCFElement {
  public final static String CHECKSUM = "ffd53aaa8b3fe7b090892ea330bba342";
  
  public CheckWizardCheckSummaryInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAmount_Gross() {
    return getOrCreateProperty("Amount_Gross", "Amount_Gross", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getAmount_Net() {
    return getOrCreateProperty("Amount_Net", "Amount_Net", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Check_Claimant getCheck_Claimant() {
    return getOrCreateProperty("Check_Claimant", "Check_Claimant", null, pcftest.CheckWizardCheckSummaryInputSet.Check_Claimant.class);
  }
  
  public DateElement getCheck_DateOfService() {
    return getOrCreateProperty("Check_DateOfService", "Check_DateOfService", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Check_Deductions getCheck_Deductions() {
    return getOrCreateProperty("Check_Deductions", "Check_Deductions", null, pcftest.CheckWizardCheckSummaryInputSet.Check_Deductions.class);
  }
  
  public ValueElement getCheck_InvoiceNumber() {
    return getOrCreateProperty("Check_InvoiceNumber", "Check_InvoiceNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCheck_MailTo() {
    return getOrCreateProperty("Check_MailTo", "Check_MailTo", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCheck_Memo() {
    return getOrCreateProperty("Check_Memo", "Check_Memo", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCheck_PayTo() {
    return getOrCreateProperty("Check_PayTo", "Check_PayTo", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCheck_PrevServiceDate() {
    return getOrCreateProperty("Check_PrevServiceDate", "Check_PrevServiceDate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public NewCheckGroupChecksLV getNewCheckGroupChecksLV() {
    return getOrCreateProperty("NewCheckGroupChecksLV", "NewCheckGroupChecksLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NewCheckGroupChecksLV.class);
  }
  
  public NewCheckGroupChecksLV_tb getNewCheckGroupChecksLV_tb() {
    return getOrCreateProperty("NewCheckGroupChecksLV_tb", "NewCheckGroupChecksLV_tb", null, pcftest.CheckWizardCheckSummaryInputSet.NewCheckGroupChecksLV_tb.class);
  }
  
  public ValueElement getPayTo_AccountName() {
    return getOrCreateProperty("PayTo_AccountName", "PayTo_AccountName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getServicePeriod_End() {
    return getOrCreateProperty("ServicePeriod_End", "ServicePeriod_End", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getServicePeriod_Start() {
    return getOrCreateProperty("ServicePeriod_Start", "ServicePeriod_Start", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public TransactionSetDocumentsLV getTransactionSetDocumentsLV() {
    return getOrCreateProperty("TransactionSetDocumentsLV", "TransactionSetDocumentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TransactionSetDocumentsLV.class);
  }
  
  public TransactionSetDocumentsLV_tb getTransactionSetDocumentsLV_tb() {
    return getOrCreateProperty("TransactionSetDocumentsLV_tb", "TransactionSetDocumentsLV_tb", null, pcftest.CheckWizardCheckSummaryInputSet.TransactionSetDocumentsLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_Claimant extends SelectElement {
    public Check_Claimant(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.CheckWizardCheckSummaryInputSet.Check_Claimant.MenuItem_Search.class);
    }
    
    public MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.CheckWizardCheckSummaryInputSet.Check_Claimant.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/newtransaction/shared/CheckWizardCheckSummaryInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Check_Deductions extends ValueElement {
    public Check_Deductions(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CheckWizard_PaymentDeductionsPagePopup click() {
      return clickThis(pcftest.CheckWizard_PaymentDeductionsPagePopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/shared/CheckWizardCheckSummaryInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewCheckGroupChecksLV_tb extends PCFElement {
    public NewCheckGroupChecksLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/shared/CheckWizardCheckSummaryInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionSetDocumentsLV_tb extends PCFElement {
    public TransactionSetDocumentsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}