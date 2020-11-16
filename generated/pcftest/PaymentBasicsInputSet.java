package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PaymentBasicsInputSet.Coverage;
import pcftest.PaymentBasicsInputSet.ReservingCurrency;
import pcftest.PaymentBasicsInputSet.TransactionLineItemsLV_tb;
import typekey.CoverageType;
import typekey.Currency;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/PaymentBasicsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PaymentBasicsInputSet extends PCFElement {
  public final static String CHECKSUM = "6b765ffab03b7373192ae9f56466f6b6";
  
  public PaymentBasicsInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAmount() {
    return getOrCreateProperty("Amount", "Amount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getComments() {
    return getOrCreateProperty("Comments", "Comments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.PaymentBasicsInputSet.CostCategory getCostCategory() {
    return getOrCreateProperty("CostCategory", "CostCategory", null, pcftest.PaymentBasicsInputSet.CostCategory.class);
  }
  
  public pcftest.PaymentBasicsInputSet.CostType getCostType() {
    return getOrCreateProperty("CostType", "CostType", null, pcftest.PaymentBasicsInputSet.CostType.class);
  }
  
  public Coverage getCoverage() {
    return getOrCreateProperty("Coverage", "Coverage", null, pcftest.PaymentBasicsInputSet.Coverage.class);
  }
  
  public BooleanValueElement getEroding() {
    return getOrCreateProperty("Eroding", "Eroding", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getExposure() {
    return getOrCreateProperty("Exposure", "Exposure", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SelectElement getMatter() {
    return getOrCreateProperty("Matter", "Matter", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getOpenReserves() {
    return getOrCreateProperty("OpenReserves", "OpenReserves", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.PaymentBasicsInputSet.PaymentType getPaymentType() {
    return getOrCreateProperty("PaymentType", "PaymentType", null, pcftest.PaymentBasicsInputSet.PaymentType.class);
  }
  
  public ReservingCurrency getReservingCurrency() {
    return getOrCreateProperty("ReservingCurrency", "ReservingCurrency", null, pcftest.PaymentBasicsInputSet.ReservingCurrency.class);
  }
  
  public TransactionExchangeRateInputSet getTransactionExchangeRateInputSet() {
    return getOrCreateProperty("TransactionExchangeRateInputSet", "TransactionExchangeRateInputSet", null, pcftest.TransactionExchangeRateInputSet.class);
  }
  
  public TransactionLineItemsLV getTransactionLineItemsLV() {
    return getOrCreateProperty("TransactionLineItemsLV", "TransactionLineItemsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TransactionLineItemsLV.class);
  }
  
  public TransactionLineItemsLV_tb getTransactionLineItemsLV_tb() {
    return getOrCreateProperty("TransactionLineItemsLV_tb", "TransactionLineItemsLV_tb", null, pcftest.PaymentBasicsInputSet.TransactionLineItemsLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/PaymentBasicsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CostCategory extends SelectElement {
    public CostCategory(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.CostCategory arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.CostCategory getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CostCategory.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.CostCategory arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/PaymentBasicsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CostType extends SelectElement {
    public CostType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.CostType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.CostType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CostType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.CostType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/PaymentBasicsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Coverage extends SelectElement {
    public Coverage(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(CoverageType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public CoverageType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CoverageType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(CoverageType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/PaymentBasicsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/PaymentBasicsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReservingCurrency extends SelectElement {
    public ReservingCurrency(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/pcf/claim/financials/transactions/PaymentBasicsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionLineItemsLV_tb extends PCFElement {
    public TransactionLineItemsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}