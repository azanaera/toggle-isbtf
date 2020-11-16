package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PolicySummaryGeneralDV_Auto.Status;
import pcftest.PolicySummaryGeneralDV_Auto.Type;
import typekey.PolicyStatus;
import typekey.PolicyType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/PolicySummaryGeneralDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicySummaryGeneralDV_Auto extends PolicySummaryGeneralDV {
  public final static String CHECKSUM = "6d087ee53a438758a6351711a73d4d24";
  
  public PolicySummaryGeneralDV_Auto(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DateElement getEffectiveDate() {
    return getOrCreateProperty("EffectiveDate", "EffectiveDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getExpirationDate() {
    return getOrCreateProperty("ExpirationDate", "ExpirationDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getInsured() {
    return getOrCreateProperty("Insured", "Insured", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPolicyNumber() {
    return getOrCreateProperty("PolicyNumber", "PolicyNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Status getStatus() {
    return getOrCreateProperty("Status", "Status", null, pcftest.PolicySummaryGeneralDV_Auto.Status.class);
  }
  
  public Type getType() {
    return getOrCreateProperty("Type", "Type", null, pcftest.PolicySummaryGeneralDV_Auto.Type.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/PolicySummaryGeneralDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Status extends SelectElement {
    public Status(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PolicyStatus arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PolicyStatus getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PolicyStatus.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PolicyStatus arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/PolicySummaryGeneralDV.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Type extends SelectElement {
    public Type(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PolicyType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PolicyType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PolicyType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PolicyType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}