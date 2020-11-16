package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewPaymentDetailDV_default.EditablePaymentLineItemsLV_tb;
import pcftest.NewPaymentDetailDV_default.EditablePaymentLineItemsLV_tb.Add;
import pcftest.NewPaymentDetailDV_default.EditablePaymentLineItemsLV_tb.ApplyDeductibleButton;
import pcftest.NewPaymentDetailDV_default.EditablePaymentLineItemsLV_tb.Remove;
import pcftest.NewPaymentDetailDV_default.Payment_Currency;
import pcftest.NewPaymentDetailDV_default.Payment_PaymentType;
import typekey.Currency;
import typekey.PaymentType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/shared/NewPaymentDetailDV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewPaymentDetailDV_default extends NewPaymentDetailDV {
  public final static String CHECKSUM = "1e362aeddff51737239c3eb92bb4c313";
  
  public NewPaymentDetailDV_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CheckExchangeRateInputSet getCheckExchangeRateInputSet() {
    return getOrCreateProperty("CheckExchangeRateInputSet", "CheckExchangeRateInputSet", null, pcftest.CheckExchangeRateInputSet.class);
  }
  
  public EditablePaymentLineItemsLV_default getEditablePaymentLineItemsLV_default() {
    return getOrCreateProperty("EditablePaymentLineItemsLV_default", "EditablePaymentLineItemsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditablePaymentLineItemsLV_default.class);
  }
  
  public EditablePaymentLineItemsLV_tb getEditablePaymentLineItemsLV_tb() {
    return getOrCreateProperty("EditablePaymentLineItemsLV_tb", "EditablePaymentLineItemsLV_tb", null, pcftest.NewPaymentDetailDV_default.EditablePaymentLineItemsLV_tb.class);
  }
  
  public Payment_Currency getPayment_Currency() {
    return getOrCreateProperty("Payment_Currency", "Payment_Currency", null, pcftest.NewPaymentDetailDV_default.Payment_Currency.class);
  }
  
  public BooleanValueElement getPayment_Eroding() {
    return getOrCreateProperty("Payment_Eroding", "Payment_Eroding", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Payment_PaymentType getPayment_PaymentType() {
    return getOrCreateProperty("Payment_PaymentType", "Payment_PaymentType", null, pcftest.NewPaymentDetailDV_default.Payment_PaymentType.class);
  }
  
  public ReserveLineInputSet getReserveLineInputSet() {
    return getOrCreateProperty("ReserveLineInputSet", "ReserveLineInputSet", null, pcftest.ReserveLineInputSet.class);
  }
  
  public ServiceRequestInvoiceInputSet_multiple getServiceRequestInvoiceInputSet_multiple() {
    return getOrCreateProperty("ServiceRequestInvoiceInputSet_multiple", "ServiceRequestInvoiceInputSet", null, pcftest.ServiceRequestInvoiceInputSet_multiple.class);
  }
  
  public ServiceRequestInvoiceInputSet_single getServiceRequestInvoiceInputSet_single() {
    return getOrCreateProperty("ServiceRequestInvoiceInputSet_single", "ServiceRequestInvoiceInputSet", null, pcftest.ServiceRequestInvoiceInputSet_single.class);
  }
  
  public ValueElement getTransaction_AvailableReserves() {
    return getOrCreateProperty("Transaction_AvailableReserves", "Transaction_AvailableReserves", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTransaction_Comments() {
    return getOrCreateProperty("Transaction_Comments", "Transaction_Comments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/shared/NewPaymentDetailDV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditablePaymentLineItemsLV_tb extends PCFElement {
    public EditablePaymentLineItemsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.NewPaymentDetailDV_default.EditablePaymentLineItemsLV_tb.Add.class);
    }
    
    public ApplyDeductibleButton getApplyDeductibleButton() {
      return getOrCreateProperty("ApplyDeductibleButton", "ApplyDeductibleButton", null, pcftest.NewPaymentDetailDV_default.EditablePaymentLineItemsLV_tb.ApplyDeductibleButton.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.NewPaymentDetailDV_default.EditablePaymentLineItemsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/shared/NewPaymentDetailDV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/shared/NewPaymentDetailDV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ApplyDeductibleButton extends ClickableActionElement {
      public ApplyDeductibleButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/shared/NewPaymentDetailDV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newtransaction/shared/NewPaymentDetailDV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Payment_Currency extends SelectElement {
    public Payment_Currency(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(Currency arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public Currency getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Currency.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(Currency arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/shared/NewPaymentDetailDV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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