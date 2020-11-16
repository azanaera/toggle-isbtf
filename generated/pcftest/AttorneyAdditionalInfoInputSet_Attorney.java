package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AttorneyAdditionalInfoInputSet_Attorney.AttorneySpecialty;
import typekey.LegalSpecialty;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/contacts/AttorneyAdditionalInfoInputSet.Attorney.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AttorneyAdditionalInfoInputSet_Attorney extends AttorneyAdditionalInfoInputSet {
  public final static String CHECKSUM = "1c5e27102ec0c9d32f5f1989a255a1cf";
  
  public AttorneyAdditionalInfoInputSet_Attorney(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAttorneyLicense() {
    return getOrCreateProperty("AttorneyLicense", "AttorneyLicense", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public AttorneySpecialty getAttorneySpecialty() {
    return getOrCreateProperty("AttorneySpecialty", "AttorneySpecialty", null, pcftest.AttorneyAdditionalInfoInputSet_Attorney.AttorneySpecialty.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/contacts/AttorneyAdditionalInfoInputSet.Attorney.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AttorneySpecialty extends SelectElement {
    public AttorneySpecialty(ISmokeTest helper, PCFElementId componentId)  {
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