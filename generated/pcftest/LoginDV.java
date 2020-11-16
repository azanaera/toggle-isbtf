package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.LoginDV.entry;
import pcftest.LoginDV.submit;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/login/LoginDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LoginDV extends DetailViewElement {
  public final static String CHECKSUM = "aac3e8a2b897b4e91c1f4e88fb2c6f52";
  
  public LoginDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.LoginDV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  public ValueElement getpassword() {
    return getOrCreateProperty("password", "password", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public submit getsubmit() {
    return getOrCreateProperty("submit", "submit", null, pcftest.LoginDV.submit.class);
  }
  
  public ValueElement getusername() {
    return getOrCreateProperty("username", "username", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/login/LoginDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getFactor() {
      return getOrCreateProperty("Factor", "Factor", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/login/LoginDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class submit extends ValueElement {
    public submit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}