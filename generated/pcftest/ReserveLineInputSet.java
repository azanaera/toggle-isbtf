package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ReserveLineInputSet.Coverage;
import pcftest.ReserveLineInputSet.ReservingCurrency;
import typekey.CoverageType;
import typekey.Currency;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/ReserveLineInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ReserveLineInputSet extends PCFElement {
  public final static String CHECKSUM = "395ac9273841fd91e484cb3bf726be23";
  
  public ReserveLineInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SelectElement getCostCategory() {
    return getOrCreateProperty("CostCategory", "CostCategory", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public SelectElement getCostType() {
    return getOrCreateProperty("CostType", "CostType", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public Coverage getCoverage() {
    return getOrCreateProperty("Coverage", "Coverage", null, pcftest.ReserveLineInputSet.Coverage.class);
  }
  
  public SelectElement getExposure() {
    return getOrCreateProperty("Exposure", "Exposure", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public SelectElement getMatter() {
    return getOrCreateProperty("Matter", "Matter", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public SelectElement getReserveLine() {
    return getOrCreateProperty("ReserveLine", "ReserveLine", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ReservingCurrency getReservingCurrency() {
    return getOrCreateProperty("ReservingCurrency", "ReservingCurrency", null, pcftest.ReserveLineInputSet.ReservingCurrency.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/ReserveLineInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/transactions/ReserveLineInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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