package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.GlobalPersonNameInputSet_default.Prefix;
import pcftest.GlobalPersonNameInputSet_default.Suffix;
import typekey.NamePrefix;
import typekey.NameSuffix;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/name/GlobalPersonNameInputSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GlobalPersonNameInputSet_default extends GlobalPersonNameInputSet {
  public final static String CHECKSUM = "d7af515dff8022c0e97e456f72e90fb1";
  
  public GlobalPersonNameInputSet_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getFirstName() {
    return getOrCreateProperty("FirstName", "FirstName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLastName() {
    return getOrCreateProperty("LastName", "LastName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getMiddleName() {
    return getOrCreateProperty("MiddleName", "MiddleName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNameSummary() {
    return getOrCreateProperty("NameSummary", "NameSummary", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getParticle() {
    return getOrCreateProperty("Particle", "Particle", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Prefix getPrefix() {
    return getOrCreateProperty("Prefix", "Prefix", null, pcftest.GlobalPersonNameInputSet_default.Prefix.class);
  }
  
  public Suffix getSuffix() {
    return getOrCreateProperty("Suffix", "Suffix", null, pcftest.GlobalPersonNameInputSet_default.Suffix.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/name/GlobalPersonNameInputSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Prefix extends SelectElement {
    public Prefix(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(NamePrefix arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public NamePrefix getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.NamePrefix.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(NamePrefix arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/name/GlobalPersonNameInputSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Suffix extends SelectElement {
    public Suffix(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(NameSuffix arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public NameSuffix getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.NameSuffix.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(NameSuffix arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  
}