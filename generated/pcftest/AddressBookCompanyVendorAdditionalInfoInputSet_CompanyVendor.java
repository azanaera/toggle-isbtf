package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/AddressBookCompanyVendorAdditionalInfoInputSet.CompanyVendor.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookCompanyVendorAdditionalInfoInputSet_CompanyVendor extends AddressBookCompanyVendorAdditionalInfoInputSet {
  public final static String CHECKSUM = "09232bc316fe5d3aa599ef0efa99dc74";
  
  public AddressBookCompanyVendorAdditionalInfoInputSet_CompanyVendor(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddressBookCompanyVendorSpecialtyInputSet_AutoRepairShop getAddressBookCompanyVendorSpecialtyInputSet_AutoRepairShop() {
    return getOrCreateProperty("AddressBookCompanyVendorSpecialtyInputSet_AutoRepairShop", "AddressBookCompanyVendorSpecialtyInputSet", null, pcftest.AddressBookCompanyVendorSpecialtyInputSet_AutoRepairShop.class);
  }
  
  public AddressBookCompanyVendorSpecialtyInputSet_AutoTowingAgcy getAddressBookCompanyVendorSpecialtyInputSet_AutoTowingAgcy() {
    return getOrCreateProperty("AddressBookCompanyVendorSpecialtyInputSet_AutoTowingAgcy", "AddressBookCompanyVendorSpecialtyInputSet", null, pcftest.AddressBookCompanyVendorSpecialtyInputSet_AutoTowingAgcy.class);
  }
  
  public AddressBookCompanyVendorSpecialtyInputSet_LawFirm getAddressBookCompanyVendorSpecialtyInputSet_LawFirm() {
    return getOrCreateProperty("AddressBookCompanyVendorSpecialtyInputSet_LawFirm", "AddressBookCompanyVendorSpecialtyInputSet", null, pcftest.AddressBookCompanyVendorSpecialtyInputSet_LawFirm.class);
  }
  
  public AddressBookCompanyVendorSpecialtyInputSet_MedicalCareOrg getAddressBookCompanyVendorSpecialtyInputSet_MedicalCareOrg() {
    return getOrCreateProperty("AddressBookCompanyVendorSpecialtyInputSet_MedicalCareOrg", "AddressBookCompanyVendorSpecialtyInputSet", null, pcftest.AddressBookCompanyVendorSpecialtyInputSet_MedicalCareOrg.class);
  }
  
  public AddressBookCompanyVendorSpecialtyInputSet_default getAddressBookCompanyVendorSpecialtyInputSet_default() {
    return getOrCreateProperty("AddressBookCompanyVendorSpecialtyInputSet_default", "AddressBookCompanyVendorSpecialtyInputSet", null, pcftest.AddressBookCompanyVendorSpecialtyInputSet_default.class);
  }
  
  public BooleanValueElement getIsPreferredVendor() {
    return getOrCreateProperty("IsPreferredVendor", "IsPreferredVendor", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getVendorID_Ext() {
    return getOrCreateProperty("VendorID_Ext", "VendorID_Ext", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}