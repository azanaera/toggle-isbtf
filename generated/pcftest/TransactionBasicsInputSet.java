package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.TransactionBasicsInputSet.Coverage;
import pcftest.TransactionBasicsInputSet.ReservingCurrency;
import typekey.CoverageType;
import typekey.Currency;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionBasicsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionBasicsInputSet extends PCFElement {
  public final static String CHECKSUM = "9c607a08e525c03dffff78e10dabc35c";
  
  public TransactionBasicsInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAmount() {
    return getOrCreateProperty("Amount", "Amount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getComments() {
    return getOrCreateProperty("Comments", "Comments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.TransactionBasicsInputSet.CostCategory getCostCategory() {
    return getOrCreateProperty("CostCategory", "CostCategory", null, pcftest.TransactionBasicsInputSet.CostCategory.class);
  }
  
  public pcftest.TransactionBasicsInputSet.CostType getCostType() {
    return getOrCreateProperty("CostType", "CostType", null, pcftest.TransactionBasicsInputSet.CostType.class);
  }
  
  public Coverage getCoverage() {
    return getOrCreateProperty("Coverage", "Coverage", null, pcftest.TransactionBasicsInputSet.Coverage.class);
  }
  
  public ValueElement getExposure() {
    return getOrCreateProperty("Exposure", "Exposure", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getOpenReserves() {
    return getOrCreateProperty("OpenReserves", "OpenReserves", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ReservingCurrency getReservingCurrency() {
    return getOrCreateProperty("ReservingCurrency", "ReservingCurrency", null, pcftest.TransactionBasicsInputSet.ReservingCurrency.class);
  }
  
  public TransactionExchangeRateInputSet getTransactionExchangeRateInputSet() {
    return getOrCreateProperty("TransactionExchangeRateInputSet", "TransactionExchangeRateInputSet", null, pcftest.TransactionExchangeRateInputSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionBasicsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionBasicsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionBasicsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionBasicsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  
}