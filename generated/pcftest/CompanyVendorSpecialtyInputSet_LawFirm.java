package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CompanyVendorSpecialtyInputSet_LawFirm.LawFirmSpecialty;
import typekey.LegalSpecialty;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/CompanyVendorSpecialtyInputSet.LawFirm.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CompanyVendorSpecialtyInputSet_LawFirm extends CompanyVendorSpecialtyInputSet {
  public final static String CHECKSUM = "e4209bfee86e50ea85f0c6e0e4c09540";
  
  public CompanyVendorSpecialtyInputSet_LawFirm(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public LawFirmSpecialty getLawFirmSpecialty() {
    return getOrCreateProperty("LawFirmSpecialty", "LawFirmSpecialty", null, pcftest.CompanyVendorSpecialtyInputSet_LawFirm.LawFirmSpecialty.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/CompanyVendorSpecialtyInputSet.LawFirm.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LawFirmSpecialty extends SelectElement {
    public LawFirmSpecialty(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(LegalSpecialty arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public LegalSpecialty getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LegalSpecialty.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(LegalSpecialty arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}