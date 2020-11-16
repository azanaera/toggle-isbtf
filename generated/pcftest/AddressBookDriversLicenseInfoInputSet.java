package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AddressBookDriversLicenseInfoInputSet.LicenseState;
import typekey.Jurisdiction;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/AddressBookDriversLicenseInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookDriversLicenseInfoInputSet extends PCFElement {
  public final static String CHECKSUM = "c34cd4778c59a1a06aea26c7a2c3482c";
  
  public AddressBookDriversLicenseInfoInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getLicenseNumber() {
    return getOrCreateProperty("LicenseNumber", "LicenseNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public LicenseState getLicenseState() {
    return getOrCreateProperty("LicenseState", "LicenseState", null, pcftest.AddressBookDriversLicenseInfoInputSet.LicenseState.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookDriversLicenseInfoInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LicenseState extends SelectElement {
    public LicenseState(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(Jurisdiction arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public Jurisdiction getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Jurisdiction.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(Jurisdiction arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}