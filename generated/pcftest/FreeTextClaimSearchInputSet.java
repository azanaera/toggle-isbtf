package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FreeTextClaimSearchInputSet.Role;
import typekey.FreTxtClmSrchNameSrchTyp;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearchInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FreeTextClaimSearchInputSet extends PCFElement {
  public final static String CHECKSUM = "7880a42e7fcdc3e9dc932645cc0c656f";
  
  public FreeTextClaimSearchInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAddress() {
    return getOrCreateProperty("Address", "Address", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCity() {
    return getOrCreateProperty("City", "City", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getFullName() {
    return getOrCreateProperty("FullName", "FullName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPhone() {
    return getOrCreateProperty("Phone", "Phone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Role getRole() {
    return getOrCreateProperty("Role", "Role", null, pcftest.FreeTextClaimSearchInputSet.Role.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/search/claims/FreeTextClaimSearchInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Role extends SelectElement {
    public Role(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(FreTxtClmSrchNameSrchTyp arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public FreTxtClmSrchNameSrchTyp getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.FreTxtClmSrchNameSrchTyp.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(FreTxtClmSrchNameSrchTyp arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}