package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AddressBookCompanyVendorSpecialtyInputSet_MedicalCareOrg.MedicalSpecialty;
import typekey.SpecialtyType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/AddressBookCompanyVendorSpecialtyInputSet.MedicalCareOrg.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookCompanyVendorSpecialtyInputSet_MedicalCareOrg extends AddressBookCompanyVendorSpecialtyInputSet {
  public final static String CHECKSUM = "30f72fa7a57b63748ca5de654c10d10a";
  
  public AddressBookCompanyVendorSpecialtyInputSet_MedicalCareOrg(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public MedicalSpecialty getMedicalSpecialty() {
    return getOrCreateProperty("MedicalSpecialty", "MedicalSpecialty", null, pcftest.AddressBookCompanyVendorSpecialtyInputSet_MedicalCareOrg.MedicalSpecialty.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookCompanyVendorSpecialtyInputSet.MedicalCareOrg.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedicalSpecialty extends SelectElement {
    public MedicalSpecialty(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(SpecialtyType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public SpecialtyType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SpecialtyType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(SpecialtyType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}