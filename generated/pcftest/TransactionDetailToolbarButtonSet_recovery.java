package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.TransactionDetailToolbarButtonSet_recovery.TransactionDetailToolbarButtons_DeleteButton;
import pcftest.TransactionDetailToolbarButtonSet_recovery.TransactionDetailToolbarButtons_RecodeButton;
import pcftest.TransactionDetailToolbarButtonSet_recovery.TransactionDetailToolbarButtons_ResubmitButton;
import pcftest.TransactionDetailToolbarButtonSet_recovery.TransactionDetailToolbarButtons_TransferButton;
import pcftest.TransactionDetailToolbarButtonSet_recovery.TransactionDetailToolbarButtons_VoidButton;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionDetailToolbarButtonSet.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionDetailToolbarButtonSet_recovery extends TransactionDetailToolbarButtonSet {
  public final static String CHECKSUM = "eea39b7de8c8465b0cbf80e7924cad54";
  
  public TransactionDetailToolbarButtonSet_recovery(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public TransactionDetailToolbarButtons_DeleteButton getTransactionDetailToolbarButtons_DeleteButton() {
    return getOrCreateProperty("TransactionDetailToolbarButtons_DeleteButton", "TransactionDetailToolbarButtons_DeleteButton", null, pcftest.TransactionDetailToolbarButtonSet_recovery.TransactionDetailToolbarButtons_DeleteButton.class);
  }
  
  public TransactionDetailToolbarButtons_RecodeButton getTransactionDetailToolbarButtons_RecodeButton() {
    return getOrCreateProperty("TransactionDetailToolbarButtons_RecodeButton", "TransactionDetailToolbarButtons_RecodeButton", null, pcftest.TransactionDetailToolbarButtonSet_recovery.TransactionDetailToolbarButtons_RecodeButton.class);
  }
  
  public TransactionDetailToolbarButtons_ResubmitButton getTransactionDetailToolbarButtons_ResubmitButton() {
    return getOrCreateProperty("TransactionDetailToolbarButtons_ResubmitButton", "TransactionDetailToolbarButtons_ResubmitButton", null, pcftest.TransactionDetailToolbarButtonSet_recovery.TransactionDetailToolbarButtons_ResubmitButton.class);
  }
  
  public TransactionDetailToolbarButtons_TransferButton getTransactionDetailToolbarButtons_TransferButton() {
    return getOrCreateProperty("TransactionDetailToolbarButtons_TransferButton", "TransactionDetailToolbarButtons_TransferButton", null, pcftest.TransactionDetailToolbarButtonSet_recovery.TransactionDetailToolbarButtons_TransferButton.class);
  }
  
  public TransactionDetailToolbarButtons_VoidButton getTransactionDetailToolbarButtons_VoidButton() {
    return getOrCreateProperty("TransactionDetailToolbarButtons_VoidButton", "TransactionDetailToolbarButtons_VoidButton", null, pcftest.TransactionDetailToolbarButtonSet_recovery.TransactionDetailToolbarButtons_VoidButton.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionDetailToolbarButtonSet.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionDetailToolbarButtons_DeleteButton extends ClickableActionElement {
    public TransactionDetailToolbarButtons_DeleteButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionDetailToolbarButtonSet.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionDetailToolbarButtons_RecodeButton extends ClickableActionElement {
    public TransactionDetailToolbarButtons_RecodeButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RecodeRecovery click() {
      return clickThis(pcftest.RecodeRecovery.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionDetailToolbarButtonSet.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionDetailToolbarButtons_ResubmitButton extends ClickableActionElement {
    public TransactionDetailToolbarButtons_ResubmitButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionDetailToolbarButtonSet.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionDetailToolbarButtons_TransferButton extends ClickableActionElement {
    public TransactionDetailToolbarButtons_TransferButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TransferRecovery click() {
      return clickThis(pcftest.TransferRecovery.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionDetailToolbarButtonSet.recovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionDetailToolbarButtons_VoidButton extends ClickableActionElement {
    public TransactionDetailToolbarButtons_VoidButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public VoidRecovery click() {
      return clickThis(pcftest.VoidRecovery.class);
    }
    
    
  }
  
  
}