package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.TransactionDetailToolbarButtonSet_payment.TransactionDetailToolbarButtonSet_CreateRecoveryButton;
import pcftest.TransactionDetailToolbarButtonSet_payment.TransactionDetailToolbarButtonSet_DeleteButton;
import pcftest.TransactionDetailToolbarButtonSet_payment.TransactionDetailToolbarButtonSet_EditButton;
import pcftest.TransactionDetailToolbarButtonSet_payment.TransactionDetailToolbarButtonSet_RecodeButton;
import pcftest.TransactionDetailToolbarButtonSet_payment.TransactionDetailToolbarButtonSet_ViewButton;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionDetailToolbarButtonSet.payment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionDetailToolbarButtonSet_payment extends TransactionDetailToolbarButtonSet {
  public final static String CHECKSUM = "a41efea9f796a7fe8e91bc4586151077";
  
  public TransactionDetailToolbarButtonSet_payment(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public TransactionDetailToolbarButtonSet_CreateRecoveryButton getTransactionDetailToolbarButtonSet_CreateRecoveryButton() {
    return getOrCreateProperty("TransactionDetailToolbarButtonSet_CreateRecoveryButton", "TransactionDetailToolbarButtonSet_CreateRecoveryButton", null, pcftest.TransactionDetailToolbarButtonSet_payment.TransactionDetailToolbarButtonSet_CreateRecoveryButton.class);
  }
  
  public TransactionDetailToolbarButtonSet_DeleteButton getTransactionDetailToolbarButtonSet_DeleteButton() {
    return getOrCreateProperty("TransactionDetailToolbarButtonSet_DeleteButton", "TransactionDetailToolbarButtonSet_DeleteButton", null, pcftest.TransactionDetailToolbarButtonSet_payment.TransactionDetailToolbarButtonSet_DeleteButton.class);
  }
  
  public TransactionDetailToolbarButtonSet_EditButton getTransactionDetailToolbarButtonSet_EditButton() {
    return getOrCreateProperty("TransactionDetailToolbarButtonSet_EditButton", "TransactionDetailToolbarButtonSet_EditButton", null, pcftest.TransactionDetailToolbarButtonSet_payment.TransactionDetailToolbarButtonSet_EditButton.class);
  }
  
  public TransactionDetailToolbarButtonSet_RecodeButton getTransactionDetailToolbarButtonSet_RecodeButton() {
    return getOrCreateProperty("TransactionDetailToolbarButtonSet_RecodeButton", "TransactionDetailToolbarButtonSet_RecodeButton", null, pcftest.TransactionDetailToolbarButtonSet_payment.TransactionDetailToolbarButtonSet_RecodeButton.class);
  }
  
  public TransactionDetailToolbarButtonSet_ViewButton getTransactionDetailToolbarButtonSet_ViewButton() {
    return getOrCreateProperty("TransactionDetailToolbarButtonSet_ViewButton", "TransactionDetailToolbarButtonSet_ViewButton", null, pcftest.TransactionDetailToolbarButtonSet_payment.TransactionDetailToolbarButtonSet_ViewButton.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionDetailToolbarButtonSet.payment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionDetailToolbarButtonSet_CreateRecoveryButton extends ClickableActionElement {
    public TransactionDetailToolbarButtonSet_CreateRecoveryButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewRecoverySet click() {
      return clickThis(pcftest.NewRecoverySet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionDetailToolbarButtonSet.payment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionDetailToolbarButtonSet_DeleteButton extends ClickableActionElement {
    public TransactionDetailToolbarButtonSet_DeleteButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DeleteSinglePayment click() {
      return clickThis(pcftest.DeleteSinglePayment.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionDetailToolbarButtonSet.payment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionDetailToolbarButtonSet_EditButton extends ClickableActionElement {
    public TransactionDetailToolbarButtonSet_EditButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EditCheckWizard click() {
      return clickThis(pcftest.EditCheckWizard.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionDetailToolbarButtonSet.payment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionDetailToolbarButtonSet_RecodeButton extends ClickableActionElement {
    public TransactionDetailToolbarButtonSet_RecodeButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RecodePayment click() {
      return clickThis(pcftest.RecodePayment.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionDetailToolbarButtonSet.payment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionDetailToolbarButtonSet_ViewButton extends ClickableActionElement {
    public TransactionDetailToolbarButtonSet_ViewButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimFinancialsChecksDetail click() {
      return clickThis(pcftest.ClaimFinancialsChecksDetail.class);
    }
    
    
  }
  
  
}