package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RadioButtonValueElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RecoverySearchOptionalInputSet.DateSearch;
import pcftest.RecoverySearchOptionalInputSet.DateSearch.DateSearchDirectChoice_Choice;
import pcftest.RecoverySearchOptionalInputSet.DateSearch.DateSearchRangeChoice_Choice;
import pcftest.RecoverySearchOptionalInputSet.DateSearch.DateSearchRangeValue;
import pcftest.RecoverySearchOptionalInputSet.FinancialCurrency;
import pcftest.RecoverySearchOptionalInputSet.Status;
import typekey.Currency;
import typekey.DateRangeChoiceType;
import typekey.TransactionStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/recoveries/RecoverySearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RecoverySearchOptionalInputSet extends PCFElement {
  public final static String CHECKSUM = "c746804ea5870d1f0dfb7c643ccc29ab";
  
  public RecoverySearchOptionalInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public pcftest.RecoverySearchOptionalInputSet.CostType getCostType() {
    return getOrCreateProperty("CostType", "CostType", null, pcftest.RecoverySearchOptionalInputSet.CostType.class);
  }
  
  public DateSearch getDateSearch() {
    return getOrCreateProperty("DateSearch", "DateSearch", null, pcftest.RecoverySearchOptionalInputSet.DateSearch.class);
  }
  
  public ValueElement getFinancialAmountEnd() {
    return getOrCreateProperty("FinancialAmountEnd", "FinancialAmountEnd", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getFinancialAmountEndLabel() {
    return getOrCreateProperty("FinancialAmountEndLabel", "FinancialAmountEndLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getFinancialAmountStart() {
    return getOrCreateProperty("FinancialAmountStart", "FinancialAmountStart", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getFinancialAmountStartLabel() {
    return getOrCreateProperty("FinancialAmountStartLabel", "FinancialAmountStartLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SelectElement getFinancialChosenOption() {
    return getOrCreateProperty("FinancialChosenOption", "FinancialChosenOption", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public FinancialCurrency getFinancialCurrency() {
    return getOrCreateProperty("FinancialCurrency", "FinancialCurrency", null, pcftest.RecoverySearchOptionalInputSet.FinancialCurrency.class);
  }
  
  public ValueElement getFinancialCurrencyLabel() {
    return getOrCreateProperty("FinancialCurrencyLabel", "FinancialCurrencyLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getFinancialExpressionTypeLabel() {
    return getOrCreateProperty("FinancialExpressionTypeLabel", "FinancialExpressionTypeLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.RecoverySearchOptionalInputSet.RecoveryCategory getRecoveryCategory() {
    return getOrCreateProperty("RecoveryCategory", "RecoveryCategory", null, pcftest.RecoverySearchOptionalInputSet.RecoveryCategory.class);
  }
  
  public Status getStatus() {
    return getOrCreateProperty("Status", "Status", null, pcftest.RecoverySearchOptionalInputSet.Status.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/recoveries/RecoverySearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/search/recoveries/RecoverySearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DateSearch extends ValueElement {
    public DateSearch(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectElement getDateSearchChosenOption() {
      return getOrCreateProperty("DateSearchChosenOption", "DateSearchChosenOption", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public DateSearchDirectChoice_Choice getDateSearchDirectChoice_Choice() {
      return getOrCreateProperty("DateSearchDirectChoice_Choice", "DateSearchDirectChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.RecoverySearchOptionalInputSet.DateSearch.DateSearchDirectChoice_Choice.class);
    }
    
    public DateElement getDateSearchEndDate() {
      return getOrCreateProperty("DateSearchEndDate", "DateSearchEndDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateSearchRangeChoice_Choice getDateSearchRangeChoice_Choice() {
      return getOrCreateProperty("DateSearchRangeChoice_Choice", "DateSearchRangeChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.RecoverySearchOptionalInputSet.DateSearch.DateSearchRangeChoice_Choice.class);
    }
    
    public DateSearchRangeValue getDateSearchRangeValue() {
      return getOrCreateProperty("DateSearchRangeValue", "DateSearchRangeValue", null, pcftest.RecoverySearchOptionalInputSet.DateSearch.DateSearchRangeValue.class);
    }
    
    public DateElement getDateSearchStartDate() {
      return getOrCreateProperty("DateSearchStartDate", "DateSearchStartDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/recoveries/RecoverySearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DateSearchDirectChoice_Choice extends RadioButtonValueElement {
      public DateSearchDirectChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/recoveries/RecoverySearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DateSearchRangeChoice_Choice extends RadioButtonValueElement {
      public DateSearchRangeChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/recoveries/RecoverySearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DateSearchRangeValue extends SelectElement {
      public DateSearchRangeValue(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(DateRangeChoiceType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public DateRangeChoiceType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.DateRangeChoiceType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(DateRangeChoiceType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/FinancialCriterionMultiCurrencyChoiceWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FinancialCurrency extends SelectElement {
    public FinancialCurrency(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/pcf/search/recoveries/RecoverySearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/search/recoveries/RecoverySearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Status extends SelectElement {
    public Status(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(TransactionStatus arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public TransactionStatus getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.TransactionStatus.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(TransactionStatus arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}