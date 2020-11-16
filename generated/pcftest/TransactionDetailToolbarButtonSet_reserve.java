package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.TransactionDetailToolbarButtonSet_reserve.TransactionDetailToolbarButtons_CreateCheckButton;
import pcftest.TransactionDetailToolbarButtonSet_reserve.TransactionDetailToolbarButtons_DeleteButton;
import pcftest.TransactionDetailToolbarButtonSet_reserve.TransactionDetailToolbarButtons_EditButton;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionDetailToolbarButtonSet.reserve.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionDetailToolbarButtonSet_reserve extends TransactionDetailToolbarButtonSet {
  public final static String CHECKSUM = "330ce9c0e6c02024eef1856fd6695ba6";
  
  public TransactionDetailToolbarButtonSet_reserve(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public TransactionDetailToolbarButtons_CreateCheckButton getTransactionDetailToolbarButtons_CreateCheckButton() {
    return getOrCreateProperty("TransactionDetailToolbarButtons_CreateCheckButton", "TransactionDetailToolbarButtons_CreateCheckButton", null, pcftest.TransactionDetailToolbarButtonSet_reserve.TransactionDetailToolbarButtons_CreateCheckButton.class);
  }
  
  public TransactionDetailToolbarButtons_DeleteButton getTransactionDetailToolbarButtons_DeleteButton() {
    return getOrCreateProperty("TransactionDetailToolbarButtons_DeleteButton", "TransactionDetailToolbarButtons_DeleteButton", null, pcftest.TransactionDetailToolbarButtonSet_reserve.TransactionDetailToolbarButtons_DeleteButton.class);
  }
  
  public TransactionDetailToolbarButtons_EditButton getTransactionDetailToolbarButtons_EditButton() {
    return getOrCreateProperty("TransactionDetailToolbarButtons_EditButton", "TransactionDetailToolbarButtons_EditButton", null, pcftest.TransactionDetailToolbarButtonSet_reserve.TransactionDetailToolbarButtons_EditButton.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionDetailToolbarButtonSet.reserve.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionDetailToolbarButtons_CreateCheckButton extends ClickableActionElement {
    public TransactionDetailToolbarButtons_CreateCheckButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionDetailToolbarButtonSet.reserve.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionDetailToolbarButtons_DeleteButton extends ClickableActionElement {
    public TransactionDetailToolbarButtons_DeleteButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DeleteReserveSet click() {
      return clickThis(pcftest.DeleteReserveSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionDetailToolbarButtonSet.reserve.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionDetailToolbarButtons_EditButton extends ClickableActionElement {
    public TransactionDetailToolbarButtons_EditButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NewReserveSet click() {
      return clickThis(pcftest.NewReserveSet.class);
    }
    
    
  }
  
  
}