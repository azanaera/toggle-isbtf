package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.LocalizedCommandDefinitionParameterInputSet.multipleLocales;
import pcftest.LocalizedCommandDefinitionParameterInputSet.multipleLocales.currentLocale;
import pcftest.LocalizedCommandDefinitionParameterInputSet.multipleLocales.localesPopup;
import pcftest.LocalizedCommandDefinitionParameterInputSet.soleLocale;
import pcftest.LocalizedCommandDefinitionParameterInputSet.soleLocale.setToDefaultValue;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/LocalizedCommandDefinitionParameterInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LocalizedCommandDefinitionParameterInputSet extends PCFElement {
  public final static String CHECKSUM = "cdc6e6379198c6d8bda54b1093d18c59";
  
  public LocalizedCommandDefinitionParameterInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public multipleLocales getmultipleLocales() {
    return getOrCreateProperty("multipleLocales", "multipleLocales", null, pcftest.LocalizedCommandDefinitionParameterInputSet.multipleLocales.class);
  }
  
  public soleLocale getsoleLocale() {
    return getOrCreateProperty("soleLocale", "soleLocale", null, pcftest.LocalizedCommandDefinitionParameterInputSet.soleLocale.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/LocalizedCommandDefinitionParameterInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class multipleLocales extends PCFElement {
    public multipleLocales(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public currentLocale getcurrentLocale() {
      return getOrCreateProperty("currentLocale", "currentLocale", null, pcftest.LocalizedCommandDefinitionParameterInputSet.multipleLocales.currentLocale.class);
    }
    
    public localesPopup getlocalesPopup() {
      return getOrCreateProperty("localesPopup", "localesPopup", null, pcftest.LocalizedCommandDefinitionParameterInputSet.multipleLocales.localesPopup.class);
    }
    
    public ValueElement getoverridesMessage() {
      return getOrCreateProperty("overridesMessage", "overridesMessage", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/LocalizedCommandDefinitionParameterInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class currentLocale extends ClickableActionElement {
      public currentLocale(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/LocalizedCommandDefinitionParameterInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class localesPopup extends ClickableActionElement {
      public localesPopup(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CommandDefinitionParameterLocalizationsPopup click() {
        return clickThis(pcftest.CommandDefinitionParameterLocalizationsPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/LocalizedCommandDefinitionParameterInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class soleLocale extends ValueElement {
    public soleLocale(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public setToDefaultValue getsetToDefaultValue() {
      return getOrCreateProperty("setToDefaultValue", "setToDefaultValue", null, pcftest.LocalizedCommandDefinitionParameterInputSet.soleLocale.setToDefaultValue.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/LocalizedCommandDefinitionParameterInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class setToDefaultValue extends ClickableActionElement {
      public setToDefaultValue(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}