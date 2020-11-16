package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/AddressBookCompanyVendorSpecialtyInputSet.AutoRepairShop.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookCompanyVendorSpecialtyInputSet_AutoRepairShop extends AddressBookCompanyVendorSpecialtyInputSet {
  public final static String CHECKSUM = "019e5b750f390454cf54d90f4120b36c";
  
  public AddressBookCompanyVendorSpecialtyInputSet_AutoRepairShop(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getBusinessLicense() {
    return getOrCreateProperty("BusinessLicense", "BusinessLicense", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}