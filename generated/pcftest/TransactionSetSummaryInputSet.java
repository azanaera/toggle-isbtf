package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionSetSummaryInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TransactionSetSummaryInputSet extends PCFElement {
  public final static String CHECKSUM = "6567a4cfe2704f51e166ffb8ae94d57a";
  
  public TransactionSetSummaryInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DateElement getApprovableBean_CreateTime() {
    return getOrCreateProperty("ApprovableBean_CreateTime", "ApprovableBean_CreateTime", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getApprovableBean_CreateUser() {
    return getOrCreateProperty("ApprovableBean_CreateUser", "ApprovableBean_CreateUser", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.TransactionSetSummaryInputSet.CreatedVia getCreatedVia() {
    return getOrCreateProperty("CreatedVia", "CreatedVia", null, pcftest.TransactionSetSummaryInputSet.CreatedVia.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/TransactionSetSummaryInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CreatedVia extends SelectElement {
    public CreatedVia(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.CreatedVia arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.CreatedVia getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CreatedVia.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.CreatedVia arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}