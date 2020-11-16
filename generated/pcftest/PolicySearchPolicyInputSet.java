package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PolicySearchPolicyInputSet.PropertyState;
import typekey.State;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/PolicySearchPolicyInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicySearchPolicyInputSet extends PCFElement {
  public final static String CHECKSUM = "d57366cf0abe8bef79842f1f6b50ae79";
  
  public PolicySearchPolicyInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CheckboxValueElement getIncludeArchivedPolicies() {
    return getOrCreateProperty("IncludeArchivedPolicies", "IncludeArchivedPolicies", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public DateElement getLossDate() {
    return getOrCreateProperty("LossDate", "LossDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public pcftest.PolicySearchPolicyInputSet.LossType getLossType() {
    return getOrCreateProperty("LossType", "LossType", null, pcftest.PolicySearchPolicyInputSet.LossType.class);
  }
  
  public ValueElement getPolicyNumber() {
    return getOrCreateProperty("PolicyNumber", "PolicyNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SelectElement getPolicyType() {
    return getOrCreateProperty("PolicyType", "PolicyType", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getPropertyCity() {
    return getOrCreateProperty("PropertyCity", "PropertyCity", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PropertyState getPropertyState() {
    return getOrCreateProperty("PropertyState", "PropertyState", null, pcftest.PolicySearchPolicyInputSet.PropertyState.class);
  }
  
  public ValueElement getVin() {
    return getOrCreateProperty("Vin", "Vin", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/PolicySearchPolicyInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossType extends SelectElement {
    public LossType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.LossType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.LossType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.LossType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/PolicySearchPolicyInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyState extends SelectElement {
    public PropertyState(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(State arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public State getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.State.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(State arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}