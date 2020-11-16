package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.UserPreferencesInputSet.DefaultCountry;
import pcftest.UserPreferencesInputSet.DefaultPhoneCountry;
import pcftest.UserPreferencesInputSet.Language;
import pcftest.UserPreferencesInputSet.RegionalFormats;
import typekey.Country;
import typekey.LanguageType;
import typekey.LocaleType;
import typekey.PhoneCountryCode;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/preferences/UserPreferencesInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UserPreferencesInputSet extends PCFElement {
  public final static String CHECKSUM = "b3d30cf3859d1bdca4e65ba9ae4f59dc";
  
  public UserPreferencesInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DefaultCountry getDefaultCountry() {
    return getOrCreateProperty("DefaultCountry", "DefaultCountry", null, pcftest.UserPreferencesInputSet.DefaultCountry.class);
  }
  
  public DefaultPhoneCountry getDefaultPhoneCountry() {
    return getOrCreateProperty("DefaultPhoneCountry", "DefaultPhoneCountry", null, pcftest.UserPreferencesInputSet.DefaultPhoneCountry.class);
  }
  
  public Language getLanguage() {
    return getOrCreateProperty("Language", "Language", null, pcftest.UserPreferencesInputSet.Language.class);
  }
  
  public RegionalFormats getRegionalFormats() {
    return getOrCreateProperty("RegionalFormats", "RegionalFormats", null, pcftest.UserPreferencesInputSet.RegionalFormats.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/preferences/UserPreferencesInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DefaultCountry extends SelectElement {
    public DefaultCountry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(Country arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public Country getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Country.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(Country arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/preferences/UserPreferencesInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DefaultPhoneCountry extends SelectElement {
    public DefaultPhoneCountry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PhoneCountryCode arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PhoneCountryCode getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PhoneCountryCode.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PhoneCountryCode arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/preferences/UserPreferencesInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Language extends SelectElement {
    public Language(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(LanguageType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public LanguageType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LanguageType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(LanguageType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/preferences/UserPreferencesInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RegionalFormats extends SelectElement {
    public RegionalFormats(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(LocaleType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public LocaleType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LocaleType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(LocaleType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}