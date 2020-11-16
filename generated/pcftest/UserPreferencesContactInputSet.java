package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.UserPreferencesContactInputSet.PrimaryPhone;
import pcftest.UserPreferencesContactInputSet.UserAddress;
import pcftest.UserPreferencesContactInputSet.UserCellPhone;
import pcftest.UserPreferencesContactInputSet.UserFaxPhone;
import pcftest.UserPreferencesContactInputSet.UserHomePhone;
import pcftest.UserPreferencesContactInputSet.UserWorkPhone;
import typekey.PrimaryPhoneType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/preferences/UserPreferencesContactInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserPreferencesContactInputSet extends PCFElement {
  public final static String CHECKSUM = "41697586966453ba954a054e7767ebfd";
  
  public UserPreferencesContactInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getDepartment() {
    return getOrCreateProperty("Department", "Department", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEmail() {
    return getOrCreateProperty("Email", "Email", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getJobTitle() {
    return getOrCreateProperty("JobTitle", "JobTitle", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public PrimaryPhone getPrimaryPhone() {
    return getOrCreateProperty("PrimaryPhone", "PrimaryPhone", null, pcftest.UserPreferencesContactInputSet.PrimaryPhone.class);
  }
  
  public UserAddress getUserAddress() {
    return getOrCreateProperty("UserAddress", "UserAddress", null, pcftest.UserPreferencesContactInputSet.UserAddress.class);
  }
  
  public UserCellPhone getUserCellPhone() {
    return getOrCreateProperty("UserCellPhone", "UserCellPhone", null, pcftest.UserPreferencesContactInputSet.UserCellPhone.class);
  }
  
  public UserFaxPhone getUserFaxPhone() {
    return getOrCreateProperty("UserFaxPhone", "UserFaxPhone", null, pcftest.UserPreferencesContactInputSet.UserFaxPhone.class);
  }
  
  public UserHomePhone getUserHomePhone() {
    return getOrCreateProperty("UserHomePhone", "UserHomePhone", null, pcftest.UserPreferencesContactInputSet.UserHomePhone.class);
  }
  
  public UserWorkPhone getUserWorkPhone() {
    return getOrCreateProperty("UserWorkPhone", "UserWorkPhone", null, pcftest.UserPreferencesContactInputSet.UserWorkPhone.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/preferences/UserPreferencesContactInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PrimaryPhone extends SelectElement {
    public PrimaryPhone(ISmokeTest helper, PCFElementId componentId)  {
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/preferences/UserPreferencesContactInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserAddress extends PCFElement {
    public UserAddress(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalAddressInputSet_BigToSmall getGlobalAddressInputSet_BigToSmall() {
      return getOrCreateProperty("GlobalAddressInputSet_BigToSmall", "GlobalAddressInputSet", null, pcftest.GlobalAddressInputSet_BigToSmall.class);
    }
    
    public GlobalAddressInputSet_PostCodeBeforeCity getGlobalAddressInputSet_PostCodeBeforeCity() {
      return getOrCreateProperty("GlobalAddressInputSet_PostCodeBeforeCity", "GlobalAddressInputSet", null, pcftest.GlobalAddressInputSet_PostCodeBeforeCity.class);
    }
    
    public GlobalAddressInputSet_default getGlobalAddressInputSet_default() {
      return getOrCreateProperty("GlobalAddressInputSet_default", "GlobalAddressInputSet", null, pcftest.GlobalAddressInputSet_default.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/preferences/UserPreferencesContactInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserCellPhone extends PCFElement {
    public UserCellPhone(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalPhoneInputSet getGlobalPhoneInputSet() {
      return getOrCreateProperty("GlobalPhoneInputSet", "GlobalPhoneInputSet", null, pcftest.GlobalPhoneInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/preferences/UserPreferencesContactInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserFaxPhone extends PCFElement {
    public UserFaxPhone(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalPhoneInputSet getGlobalPhoneInputSet() {
      return getOrCreateProperty("GlobalPhoneInputSet", "GlobalPhoneInputSet", null, pcftest.GlobalPhoneInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/preferences/UserPreferencesContactInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserHomePhone extends PCFElement {
    public UserHomePhone(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalPhoneInputSet getGlobalPhoneInputSet() {
      return getOrCreateProperty("GlobalPhoneInputSet", "GlobalPhoneInputSet", null, pcftest.GlobalPhoneInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/preferences/UserPreferencesContactInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserWorkPhone extends PCFElement {
    public UserWorkPhone(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GlobalPhoneInputSet getGlobalPhoneInputSet() {
      return getOrCreateProperty("GlobalPhoneInputSet", "GlobalPhoneInputSet", null, pcftest.GlobalPhoneInputSet.class);
    }
    
    
  }
  
  
}