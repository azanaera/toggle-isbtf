package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.UserPreferencesDV.GlobalizationPreferences;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/workspace/preferences/UserPreferencesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserPreferencesDV extends DetailViewElement {
  public final static String CHECKSUM = "b495a2abdf60b64c4ca7e72fda877eb9";
  
  public UserPreferencesDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getConfirmInputWidget() {
    return getOrCreateProperty("ConfirmInputWidget", "ConfirmInputWidget", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public GlobalizationPreferences getGlobalizationPreferences() {
    return getOrCreateProperty("GlobalizationPreferences", "GlobalizationPreferences", null, pcftest.UserPreferencesDV.GlobalizationPreferences.class);
  }
  
  public ValueElement getNumClaims() {
    return getOrCreateProperty("NumClaims", "NumClaims", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getOldPasswordInputWidget() {
    return getOrCreateProperty("OldPasswordInputWidget", "OldPasswordInputWidget", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPasswordInputWidget() {
    return getOrCreateProperty("PasswordInputWidget", "PasswordInputWidget", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SelectElement getStartupPage() {
    return getOrCreateProperty("StartupPage", "StartupPage", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/preferences/UserPreferencesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GlobalizationPreferences extends PCFElement {
    public GlobalizationPreferences(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UserPreferencesInputSet getUserPreferencesInputSet() {
      return getOrCreateProperty("UserPreferencesInputSet", "UserPreferencesInputSet", null, pcftest.UserPreferencesInputSet.class);
    }
    
    
  }
  
  
}