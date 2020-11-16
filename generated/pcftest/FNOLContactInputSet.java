package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLContactInputSet.DriverLicenseState;
import pcftest.FNOLContactInputSet.DriverRelationToOwner;
import pcftest.FNOLContactInputSet.reason;
import pcftest.FNOLContactInputSet.reporter_businessphone;
import pcftest.FNOLContactInputSet.reporter_homephone;
import pcftest.FNOLContactInputSet.reporter_mobile;
import pcftest.FNOLContactInputSet.reporter_primarytype;
import typekey.Jurisdiction;
import typekey.PersonRelationType;
import typekey.PrimaryPhoneType;
import typekey.ReasonForUse;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLContactInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLContactInputSet extends PCFElement {
  public final static String CHECKSUM = "c02b506888a1c66f422a498cdd91366c";
  
  public FNOLContactInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CCAddressInputSet getCCAddressInputSet() {
    return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
  }
  
  public ValueElement getDriverLicense() {
    return getOrCreateProperty("DriverLicense", "DriverLicense", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DriverLicenseState getDriverLicenseState() {
    return getOrCreateProperty("DriverLicenseState", "DriverLicenseState", null, pcftest.FNOLContactInputSet.DriverLicenseState.class);
  }
  
  public DriverRelationToOwner getDriverRelationToOwner() {
    return getOrCreateProperty("DriverRelationToOwner", "DriverRelationToOwner", null, pcftest.FNOLContactInputSet.DriverRelationToOwner.class);
  }
  
  public ValueElement getEmail2() {
    return getOrCreateProperty("Email2", "Email2", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public GlobalPersonNameInputSet_Japan getGlobalPersonNameInputSet_Japan() {
    return getOrCreateProperty("GlobalPersonNameInputSet_Japan", "GlobalPersonNameInputSet", null, pcftest.GlobalPersonNameInputSet_Japan.class);
  }
  
  public GlobalPersonNameInputSet_default getGlobalPersonNameInputSet_default() {
    return getOrCreateProperty("GlobalPersonNameInputSet_default", "GlobalPersonNameInputSet", null, pcftest.GlobalPersonNameInputSet_default.class);
  }
  
  public ValueElement getNotes() {
    return getOrCreateProperty("Notes", "Notes", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public reason getreason() {
    return getOrCreateProperty("reason", "reason", null, pcftest.FNOLContactInputSet.reason.class);
  }
  
  public reporter_businessphone getreporter_businessphone() {
    return getOrCreateProperty("reporter_businessphone", "reporter_businessphone", null, pcftest.FNOLContactInputSet.reporter_businessphone.class);
  }
  
  public ValueElement getreporter_email() {
    return getOrCreateProperty("reporter_email", "reporter_email", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public reporter_homephone getreporter_homephone() {
    return getOrCreateProperty("reporter_homephone", "reporter_homephone", null, pcftest.FNOLContactInputSet.reporter_homephone.class);
  }
  
  public reporter_mobile getreporter_mobile() {
    return getOrCreateProperty("reporter_mobile", "reporter_mobile", null, pcftest.FNOLContactInputSet.reporter_mobile.class);
  }
  
  public reporter_primarytype getreporter_primarytype() {
    return getOrCreateProperty("reporter_primarytype", "reporter_primarytype", null, pcftest.FNOLContactInputSet.reporter_primarytype.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLContactInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DriverLicenseState extends SelectElement {
    public DriverLicenseState(ISmokeTest helper, PCFElementId componentId)  {
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLContactInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DriverRelationToOwner extends SelectElement {
    public DriverRelationToOwner(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PersonRelationType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PersonRelationType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PersonRelationType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PersonRelationType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLContactInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class reason extends SelectElement {
    public reason(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ReasonForUse arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ReasonForUse getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ReasonForUse.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ReasonForUse arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLContactInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class reporter_businessphone extends PCFElement {
    public reporter_businessphone(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalPhoneInputSet getGlobalPhoneInputSet() {
      return getOrCreateProperty("GlobalPhoneInputSet", "GlobalPhoneInputSet", null, pcftest.GlobalPhoneInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLContactInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class reporter_homephone extends PCFElement {
    public reporter_homephone(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalPhoneInputSet getGlobalPhoneInputSet() {
      return getOrCreateProperty("GlobalPhoneInputSet", "GlobalPhoneInputSet", null, pcftest.GlobalPhoneInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLContactInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class reporter_mobile extends PCFElement {
    public reporter_mobile(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalPhoneInputSet getGlobalPhoneInputSet() {
      return getOrCreateProperty("GlobalPhoneInputSet", "GlobalPhoneInputSet", null, pcftest.GlobalPhoneInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLContactInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class reporter_primarytype extends SelectElement {
    public reporter_primarytype(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PrimaryPhoneType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PrimaryPhoneType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PrimaryPhoneType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PrimaryPhoneType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}