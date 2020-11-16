package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.GlobalPhoneInputSet.CountryCode;
import typekey.PhoneCountryCode;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/phone/GlobalPhoneInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GlobalPhoneInputSet extends PCFElement {
  public final static String CHECKSUM = "f0f65192d80d0950f8a131513a22a50b";
  
  public GlobalPhoneInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CountryCode getCountryCode() {
    return getOrCreateProperty("CountryCode", "CountryCode", null, pcftest.GlobalPhoneInputSet.CountryCode.class);
  }
  
  public ValueElement getExtension() {
    return getOrCreateProperty("Extension", "Extension", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNationalSubscriberNumber() {
    return getOrCreateProperty("NationalSubscriberNumber", "NationalSubscriberNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPhoneDisplay() {
    return getOrCreateProperty("PhoneDisplay", "PhoneDisplay", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/phone/GlobalPhoneInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CountryCode extends SelectElement {
    public CountryCode(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PhoneCountryCode arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PhoneCountryCode getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PhoneCountryCode.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PhoneCountryCode arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}