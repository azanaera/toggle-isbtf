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
import pcftest.PaymentSearchOptionalInputSet.DateSearch;
import pcftest.PaymentSearchOptionalInputSet.DateSearch.DateSearchDirectChoice_Choice;
import pcftest.PaymentSearchOptionalInputSet.DateSearch.DateSearchRangeChoice_Choice;
import pcftest.PaymentSearchOptionalInputSet.DateSearch.DateSearchRangeValue;
import pcftest.PaymentSearchOptionalInputSet.FinancialCurrency;
import pcftest.PaymentSearchOptionalInputSet.Status;
import typekey.Currency;
import typekey.DateRangeChoiceType;
import typekey.TransactionStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/checks/PaymentSearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PaymentSearchOptionalInputSet extends PCFElement {
  public final static String CHECKSUM = "9541f62a3970d6998e229c84b448abb2";
  
  public PaymentSearchOptionalInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DateSearch getDateSearch() {
    return getOrCreateProperty("DateSearch", "DateSearch", null, pcftest.PaymentSearchOptionalInputSet.DateSearch.class);
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
    return getOrCreateProperty("FinancialCurrency", "FinancialCurrency", null, pcftest.PaymentSearchOptionalInputSet.FinancialCurrency.class);
  }
  
  public ValueElement getFinancialCurrencyLabel() {
    return getOrCreateProperty("FinancialCurrencyLabel", "FinancialCurrencyLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getFinancialExpressionTypeLabel() {
    return getOrCreateProperty("FinancialExpressionTypeLabel", "FinancialExpressionTypeLabel", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPayTo() {
    return getOrCreateProperty("PayTo", "PayTo", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Status getStatus() {
    return getOrCreateProperty("Status", "Status", null, pcftest.PaymentSearchOptionalInputSet.Status.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/checks/PaymentSearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DateSearch extends ValueElement {
    public DateSearch(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectElement getDateSearchChosenOption() {
      return getOrCreateProperty("DateSearchChosenOption", "DateSearchChosenOption", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public DateSearchDirectChoice_Choice getDateSearchDirectChoice_Choice() {
      return getOrCreateProperty("DateSearchDirectChoice_Choice", "DateSearchDirectChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.PaymentSearchOptionalInputSet.DateSearch.DateSearchDirectChoice_Choice.class);
    }
    
    public DateElement getDateSearchEndDate() {
      return getOrCreateProperty("DateSearchEndDate", "DateSearchEndDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateSearchRangeChoice_Choice getDateSearchRangeChoice_Choice() {
      return getOrCreateProperty("DateSearchRangeChoice_Choice", "DateSearchRangeChoice_Choice", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRadioButton, pcftest.PaymentSearchOptionalInputSet.DateSearch.DateSearchRangeChoice_Choice.class);
    }
    
    public DateSearchRangeValue getDateSearchRangeValue() {
      return getOrCreateProperty("DateSearchRangeValue", "DateSearchRangeValue", null, pcftest.PaymentSearchOptionalInputSet.DateSearch.DateSearchRangeValue.class);
    }
    
    public DateElement getDateSearchStartDate() {
      return getOrCreateProperty("DateSearchStartDate", "DateSearchStartDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/checks/PaymentSearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DateSearchDirectChoice_Choice extends RadioButtonValueElement {
      public DateSearchDirectChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/checks/PaymentSearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DateSearchRangeChoice_Choice extends RadioButtonValueElement {
      public DateSearchRangeChoice_Choice(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/search/checks/PaymentSearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/search/checks/PaymentSearchOptionalInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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