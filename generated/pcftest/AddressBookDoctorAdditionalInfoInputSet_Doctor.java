package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AddressBookDoctorAdditionalInfoInputSet_Doctor.DoctorSpecialty;
import typekey.SpecialtyType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/AddressBookDoctorAdditionalInfoInputSet.Doctor.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AddressBookDoctorAdditionalInfoInputSet_Doctor extends AddressBookDoctorAdditionalInfoInputSet {
  public final static String CHECKSUM = "2261c6fdae90dc4c76da354c489fa631";
  
  public AddressBookDoctorAdditionalInfoInputSet_Doctor(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DoctorSpecialty getDoctorSpecialty() {
    return getOrCreateProperty("DoctorSpecialty", "DoctorSpecialty", null, pcftest.AddressBookDoctorAdditionalInfoInputSet_Doctor.DoctorSpecialty.class);
  }
  
  public ValueElement getMedicalLicense() {
    return getOrCreateProperty("MedicalLicense", "MedicalLicense", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/addressbook/AddressBookDoctorAdditionalInfoInputSet.Doctor.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DoctorSpecialty extends SelectElement {
    public DoctorSpecialty(ISmokeTest helper, PCFElementId componentId)  {
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