package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RecoveryReserveBasicsInputSet.Coverage;
import pcftest.RecoveryReserveBasicsInputSet.ReservingCurrency;
import typekey.CoverageType;
import typekey.Currency;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryReserveBasicsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RecoveryReserveBasicsInputSet extends PCFElement {
  public final static String CHECKSUM = "f5da639fbd107a7da44bfea8ec2d0104";
  
  public RecoveryReserveBasicsInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAmount() {
    return getOrCreateProperty("Amount", "Amount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getComments() {
    return getOrCreateProperty("Comments", "Comments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.RecoveryReserveBasicsInputSet.CostCategory getCostCategory() {
    return getOrCreateProperty("CostCategory", "CostCategory", null, pcftest.RecoveryReserveBasicsInputSet.CostCategory.class);
  }
  
  public pcftest.RecoveryReserveBasicsInputSet.CostType getCostType() {
    return getOrCreateProperty("CostType", "CostType", null, pcftest.RecoveryReserveBasicsInputSet.CostType.class);
  }
  
  public Coverage getCoverage() {
    return getOrCreateProperty("Coverage", "Coverage", null, pcftest.RecoveryReserveBasicsInputSet.Coverage.class);
  }
  
  public ValueElement getExposure() {
    return getOrCreateProperty("Exposure", "Exposure", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getOpenRecoveryReserves() {
    return getOrCreateProperty("OpenRecoveryReserves", "OpenRecoveryReserves", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.RecoveryReserveBasicsInputSet.RecoveryCategory getRecoveryCategory() {
    return getOrCreateProperty("RecoveryCategory", "RecoveryCategory", null, pcftest.RecoveryReserveBasicsInputSet.RecoveryCategory.class);
  }
  
  public ReservingCurrency getReservingCurrency() {
    return getOrCreateProperty("ReservingCurrency", "ReservingCurrency", null, pcftest.RecoveryReserveBasicsInputSet.ReservingCurrency.class);
  }
  
  public TransactionExchangeRateInputSet getTransactionExchangeRateInputSet() {
    return getOrCreateProperty("TransactionExchangeRateInputSet", "TransactionExchangeRateInputSet", null, pcftest.TransactionExchangeRateInputSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryReserveBasicsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryReserveBasicsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryReserveBasicsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryReserveBasicsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/transactions/RecoveryReserveBasicsInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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