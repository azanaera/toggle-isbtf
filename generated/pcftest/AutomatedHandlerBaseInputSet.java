package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AutomatedHandlerBaseInputSet.AutomatedHandlerPolicyType;
import typekey.PolicyType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedHandlerBaseInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AutomatedHandlerBaseInputSet extends PCFElement {
  public final static String CHECKSUM = "9fc63da70de8ebdd7c81007b2d2b0647";
  
  public AutomatedHandlerBaseInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AutomatedHandlerPolicyType getAutomatedHandlerPolicyType() {
    return getOrCreateProperty("AutomatedHandlerPolicyType", "AutomatedHandlerPolicyType", null, pcftest.AutomatedHandlerBaseInputSet.AutomatedHandlerPolicyType.class);
  }
  
  public ValueElement getAutomatedHandlerPolicyTypeReadOnly() {
    return getOrCreateProperty("AutomatedHandlerPolicyTypeReadOnly", "AutomatedHandlerPolicyTypeReadOnly", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getAutomatedHandlerType() {
    return getOrCreateProperty("AutomatedHandlerType", "AutomatedHandlerType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedHandlerBaseInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AutomatedHandlerPolicyType extends SelectElement {
    public AutomatedHandlerPolicyType(ISmokeTest helper, PCFElementId componentId)  {
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