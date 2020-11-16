package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RecodePaymentDV.EditableRecodeLineItemsLV_tb;
import pcftest.RecodePaymentDV.EditableRecodeLineItemsLV_tb.Add;
import pcftest.RecodePaymentDV.EditableRecodeLineItemsLV_tb.Remove;
import pcftest.RecodePaymentDV.Payment_PaymentType;
import typekey.PaymentType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/RecodePaymentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RecodePaymentDV extends DetailViewElement {
  public final static String CHECKSUM = "7c9064cddc8c0f54e24064050193a0cc";
  
  public RecodePaymentDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public EditTransactionInputSet getEditTransactionInputSet() {
    return getOrCreateProperty("EditTransactionInputSet", "EditTransactionInputSet", null, pcftest.EditTransactionInputSet.class);
  }
  
  public EditableRecodeLineItemsLV getEditableRecodeLineItemsLV() {
    return getOrCreateProperty("EditableRecodeLineItemsLV", "EditableRecodeLineItemsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableRecodeLineItemsLV.class);
  }
  
  public EditableRecodeLineItemsLV_tb getEditableRecodeLineItemsLV_tb() {
    return getOrCreateProperty("EditableRecodeLineItemsLV_tb", "EditableRecodeLineItemsLV_tb", null, pcftest.RecodePaymentDV.EditableRecodeLineItemsLV_tb.class);
  }
  
  public Payment_PaymentType getPayment_PaymentType() {
    return getOrCreateProperty("Payment_PaymentType", "Payment_PaymentType", null, pcftest.RecodePaymentDV.Payment_PaymentType.class);
  }
  
  public ValueElement getTransaction_AvailableReserves() {
    return getOrCreateProperty("Transaction_AvailableReserves", "Transaction_AvailableReserves", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecodePaymentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableRecodeLineItemsLV_tb extends PCFElement {
    public EditableRecodeLineItemsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.RecodePaymentDV.EditableRecodeLineItemsLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.RecodePaymentDV.EditableRecodeLineItemsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/RecodePaymentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/RecodePaymentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecodePaymentDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Payment_PaymentType extends SelectElement {
    public Payment_PaymentType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PaymentType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PaymentType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PaymentType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PaymentType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}