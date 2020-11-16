package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.UserProfileDV.Experience;
import pcftest.UserProfileDV.GlobalizationPreferences;
import pcftest.UserProfileDV.QuickClaim;
import pcftest.UserProfileDV.UserContactInputSet;
import typekey.QuickClaimDefault;
import typekey.UserExperienceType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/users/UserProfileDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserProfileDV extends DetailViewElement {
  public final static String CHECKSUM = "c1755dfe4a99e3da50686422665bb891";
  
  public UserProfileDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getEmployeeID() {
    return getOrCreateProperty("EmployeeID", "EmployeeID", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Experience getExperience() {
    return getOrCreateProperty("Experience", "Experience", null, pcftest.UserProfileDV.Experience.class);
  }
  
  public BooleanValueElement getExternalUser() {
    return getOrCreateProperty("ExternalUser", "ExternalUser", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public GlobalizationPreferences getGlobalizationPreferences() {
    return getOrCreateProperty("GlobalizationPreferences", "GlobalizationPreferences", null, pcftest.UserProfileDV.GlobalizationPreferences.class);
  }
  
  public pcftest.UserProfileDV.LossType getLossType() {
    return getOrCreateProperty("LossType", "LossType", null, pcftest.UserProfileDV.LossType.class);
  }
  
  public pcftest.UserProfileDV.PolicyType getPolicyType() {
    return getOrCreateProperty("PolicyType", "PolicyType", null, pcftest.UserProfileDV.PolicyType.class);
  }
  
  public pcftest.UserProfileDV.ProximitySearchStatus getProximitySearchStatus() {
    return getOrCreateProperty("ProximitySearchStatus", "ProximitySearchStatus", null, pcftest.UserProfileDV.ProximitySearchStatus.class);
  }
  
  public QuickClaim getQuickClaim() {
    return getOrCreateProperty("QuickClaim", "QuickClaim", null, pcftest.UserProfileDV.QuickClaim.class);
  }
  
  public UserContactInputSet getUserContactInputSet() {
    return getOrCreateProperty("UserContactInputSet", "UserContactInputSet", null, pcftest.UserProfileDV.UserContactInputSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserProfileDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Experience extends SelectElement {
    public Experience(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(UserExperienceType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public UserExperienceType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.UserExperienceType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(UserExperienceType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserProfileDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GlobalizationPreferences extends PCFElement {
    public GlobalizationPreferences(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UserPreferencesInputSet getUserPreferencesInputSet() {
      return getOrCreateProperty("UserPreferencesInputSet", "UserPreferencesInputSet", null, pcftest.UserPreferencesInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserProfileDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossType extends SelectElement {
    public LossType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.LossType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.LossType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.LossType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserProfileDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyType extends SelectElement {
    public PolicyType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.PolicyType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.PolicyType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PolicyType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.PolicyType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserProfileDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProximitySearchStatus extends SelectElement {
    public ProximitySearchStatus(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.ProximitySearchStatus arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.ProximitySearchStatus getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ProximitySearchStatus.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.ProximitySearchStatus arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserProfileDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuickClaim extends SelectElement {
    public QuickClaim(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(QuickClaimDefault arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public QuickClaimDefault getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.QuickClaimDefault.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(QuickClaimDefault arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/users/UserProfileDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UserContactInputSet extends PCFElement {
    public UserContactInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UserPreferencesContactInputSet getUserPreferencesContactInputSet() {
      return getOrCreateProperty("UserPreferencesContactInputSet", "UserPreferencesContactInputSet", null, pcftest.UserPreferencesContactInputSet.class);
    }
    
    
  }
  
  
}