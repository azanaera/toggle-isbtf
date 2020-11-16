package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PaymentTransferDV.PaymentTransferLineItemsLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/PaymentTransferDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PaymentTransferDV extends DetailViewElement {
  public final static String CHECKSUM = "8f6e992a0606ffe1daa6059ced78de5f";
  
  public PaymentTransferDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAvailableReserves() {
    return getOrCreateProperty("AvailableReserves", "AvailableReserves", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public EditTransactionInputSet getEditTransactionInputSet() {
    return getOrCreateProperty("EditTransactionInputSet", "EditTransactionInputSet", null, pcftest.EditTransactionInputSet.class);
  }
  
  public ValueElement getNetTotalIncurred() {
    return getOrCreateProperty("NetTotalIncurred", "NetTotalIncurred", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PaymentTransferLineItemsLV getPaymentTransferLineItemsLV() {
    return getOrCreateProperty("PaymentTransferLineItemsLV", "PaymentTransferLineItemsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PaymentTransferLineItemsLV.class);
  }
  
  public PaymentTransferLineItemsLV_tb getPaymentTransferLineItemsLV_tb() {
    return getOrCreateProperty("PaymentTransferLineItemsLV_tb", "PaymentTransferLineItemsLV_tb", null, pcftest.PaymentTransferDV.PaymentTransferLineItemsLV_tb.class);
  }
  
  public pcftest.PaymentTransferDV.PaymentType getPaymentType() {
    return getOrCreateProperty("PaymentType", "PaymentType", null, pcftest.PaymentTransferDV.PaymentType.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/PaymentTransferDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PaymentTransferLineItemsLV_tb extends PCFElement {
    public PaymentTransferLineItemsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/PaymentTransferDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PaymentType extends SelectElement {
    public PaymentType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.PaymentType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.PaymentType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PaymentType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.PaymentType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}