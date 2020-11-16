package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedHandlerTriggerInputSet.financialthresholdtrigger.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AutomatedHandlerTriggerInputSet_financialthresholdtrigger extends AutomatedHandlerTriggerInputSet {
  public final static String CHECKSUM = "0d0ac0c4a6d4453dc8c612e71f63746b";
  
  public AutomatedHandlerTriggerInputSet_financialthresholdtrigger(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAmount() {
    return getOrCreateProperty("Amount", "Amount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SelectElement getAutomatedHandlerFinancialThreshold() {
    return getOrCreateProperty("AutomatedHandlerFinancialThreshold", "AutomatedHandlerFinancialThreshold", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getCause() {
    return getOrCreateProperty("Cause", "Cause", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.AutomatedHandlerTriggerInputSet_financialthresholdtrigger.Currency getCurrency() {
    return getOrCreateProperty("Currency", "Currency", null, pcftest.AutomatedHandlerTriggerInputSet_financialthresholdtrigger.Currency.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedHandlerTriggerInputSet.financialthresholdtrigger.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Currency extends SelectElement {
    public Currency(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.Currency arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.Currency getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Currency.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.Currency arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}