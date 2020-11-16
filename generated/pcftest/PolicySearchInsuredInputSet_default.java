package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PolicySearchInsuredInputSet_default.Policy_ContactType;
import typekey.SearchContactType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/PolicySearchInsuredInputSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicySearchInsuredInputSet_default extends PolicySearchInsuredInputSet {
  public final static String CHECKSUM = "bb20bb810b2db592481ab1440ac17aa2";
  
  public PolicySearchInsuredInputSet_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CCAddressInputSet getCCAddressInputSet() {
    return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
  }
  
  public GlobalContactNameInputSet_Japan getGlobalContactNameInputSet_Japan() {
    return getOrCreateProperty("GlobalContactNameInputSet_Japan", "GlobalContactNameInputSet", null, pcftest.GlobalContactNameInputSet_Japan.class);
  }
  
  public GlobalContactNameInputSet_default getGlobalContactNameInputSet_default() {
    return getOrCreateProperty("GlobalContactNameInputSet_default", "GlobalContactNameInputSet", null, pcftest.GlobalContactNameInputSet_default.class);
  }
  
  public GlobalPersonNameInputSet_Japan getGlobalPersonNameInputSet_Japan() {
    return getOrCreateProperty("GlobalPersonNameInputSet_Japan", "GlobalPersonNameInputSet", null, pcftest.GlobalPersonNameInputSet_Japan.class);
  }
  
  public GlobalPersonNameInputSet_default getGlobalPersonNameInputSet_default() {
    return getOrCreateProperty("GlobalPersonNameInputSet_default", "GlobalPersonNameInputSet", null, pcftest.GlobalPersonNameInputSet_default.class);
  }
  
  public Policy_ContactType getPolicy_ContactType() {
    return getOrCreateProperty("Policy_ContactType", "Policy_ContactType", null, pcftest.PolicySearchInsuredInputSet_default.Policy_ContactType.class);
  }
  
  public ValueElement getPolicy_TaxId() {
    return getOrCreateProperty("Policy_TaxId", "Policy_TaxId", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/PolicySearchInsuredInputSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Policy_ContactType extends SelectElement {
    public Policy_ContactType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(SearchContactType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public SearchContactType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SearchContactType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(SearchContactType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}