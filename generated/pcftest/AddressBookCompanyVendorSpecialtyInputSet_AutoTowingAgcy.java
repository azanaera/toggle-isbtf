package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/AddressBookCompanyVendorSpecialtyInputSet.AutoTowingAgcy.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookCompanyVendorSpecialtyInputSet_AutoTowingAgcy extends AddressBookCompanyVendorSpecialtyInputSet {
  public final static String CHECKSUM = "9736ab1d6da006514c80be82cb606c13";
  
  public AddressBookCompanyVendorSpecialtyInputSet_AutoTowingAgcy(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getBusinessLicense() {
    return getOrCreateProperty("BusinessLicense", "BusinessLicense", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}