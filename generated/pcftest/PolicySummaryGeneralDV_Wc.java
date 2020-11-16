package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PolicySummaryGeneralDV_Wc.Status;
import pcftest.PolicySummaryGeneralDV_Wc.Type;
import typekey.PolicyStatus;
import typekey.PolicyType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/PolicySummaryGeneralDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicySummaryGeneralDV_Wc extends PolicySummaryGeneralDV {
  public final static String CHECKSUM = "3a63ec8b0175c734a38a4533541875d9";
  
  public PolicySummaryGeneralDV_Wc(ISmokeTest helper, PCFElementId componentId)  {
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
    return getOrCreateProperty("Status", "Status", null, pcftest.PolicySummaryGeneralDV_Wc.Status.class);
  }
  
  public Type getType() {
    return getOrCreateProperty("Type", "Type", null, pcftest.PolicySummaryGeneralDV_Wc.Type.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/PolicySummaryGeneralDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/policy/PolicySummaryGeneralDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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