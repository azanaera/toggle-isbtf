package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RecoveryBasicsInputSet.Coverage;
import pcftest.RecoveryBasicsInputSet.ReservingCurrency;
import pcftest.RecoveryBasicsInputSet.TransactionLineItemsLV_tb;
import typekey.CoverageType;
import typekey.Currency;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryBasicsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RecoveryBasicsInputSet extends PCFElement {
  public final static String CHECKSUM = "f5bae51cb588f777bc1981c9e10292cb";
  
  public RecoveryBasicsInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAmount() {
    return getOrCreateProperty("Amount", "Amount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getComments() {
    return getOrCreateProperty("Comments", "Comments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.RecoveryBasicsInputSet.CostCategory getCostCategory() {
    return getOrCreateProperty("CostCategory", "CostCategory", null, pcftest.RecoveryBasicsInputSet.CostCategory.class);
  }
  
  public pcftest.RecoveryBasicsInputSet.CostType getCostType() {
    return getOrCreateProperty("CostType", "CostType", null, pcftest.RecoveryBasicsInputSet.CostType.class);
  }
  
  public Coverage getCoverage() {
    return getOrCreateProperty("Coverage", "Coverage", null, pcftest.RecoveryBasicsInputSet.Coverage.class);
  }
  
  public ValueElement getExposure() {
    return getOrCreateProperty("Exposure", "Exposure", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNVV_Financials_TransactionRecovery_Recovery_OnBehalfOf() {
    return getOrCreateProperty("NVV_Financials_TransactionRecovery_Recovery_OnBehalfOf", "NVV_Financials_TransactionRecovery_Recovery_OnBehalfOf", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNVV_Financials_TransactionRecovery_Recovery_Payer() {
    return getOrCreateProperty("NVV_Financials_TransactionRecovery_Recovery_Payer", "NVV_Financials_TransactionRecovery_Recovery_Payer", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.RecoveryBasicsInputSet.RecoveryCategory getRecoveryCategory() {
    return getOrCreateProperty("RecoveryCategory", "RecoveryCategory", null, pcftest.RecoveryBasicsInputSet.RecoveryCategory.class);
  }
  
  public ReservingCurrency getReservingCurrency() {
    return getOrCreateProperty("ReservingCurrency", "ReservingCurrency", null, pcftest.RecoveryBasicsInputSet.ReservingCurrency.class);
  }
  
  public TransactionExchangeRateInputSet getTransactionExchangeRateInputSet() {
    return getOrCreateProperty("TransactionExchangeRateInputSet", "TransactionExchangeRateInputSet", null, pcftest.TransactionExchangeRateInputSet.class);
  }
  
  public TransactionLineItemsLV getTransactionLineItemsLV() {
    return getOrCreateProperty("TransactionLineItemsLV", "TransactionLineItemsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.TransactionLineItemsLV.class);
  }
  
  public TransactionLineItemsLV_tb getTransactionLineItemsLV_tb() {
    return getOrCreateProperty("TransactionLineItemsLV_tb", "TransactionLineItemsLV_tb", null, pcftest.RecoveryBasicsInputSet.TransactionLineItemsLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryBasicsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryBasicsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryBasicsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryBasicsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecoveryCategory extends SelectElement {
    public RecoveryCategory(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.RecoveryCategory arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.RecoveryCategory getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.RecoveryCategory.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.RecoveryCategory arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryBasicsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryBasicsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TransactionLineItemsLV_tb extends PCFElement {
    public TransactionLineItemsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}