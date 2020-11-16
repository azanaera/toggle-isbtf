package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.LocalizedValuesDV.LocalizedValuesLV.LocalizedValuesLV_tb;
import pcftest.LocalizedValuesDV.LocalizedValuesLV.LocalizedValuesLV_tb.Add;
import pcftest.LocalizedValuesDV.LocalizedValuesLV.LocalizedValuesLV_tb.Remove;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/i18n/LocalizedValuesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LocalizedValuesDV extends DetailViewElement {
  public final static String CHECKSUM = "bf65ddcab135faa7f9d35d86eed575f4";
  
  public LocalizedValuesDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public pcftest.LocalizedValuesDV.LocalizedValuesLV getLocalizedValuesLV() {
    return getOrCreateProperty("LocalizedValuesLV", "LocalizedValuesLV", null, pcftest.LocalizedValuesDV.LocalizedValuesLV.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/i18n/LocalizedValuesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocalizedValuesLV extends PCFElement {
    public LocalizedValuesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.LocalizedValuesLV getLocalizedValuesLV() {
      return getOrCreateProperty("LocalizedValuesLV", "LocalizedValuesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LocalizedValuesLV.class);
    }
    
    public LocalizedValuesLV_tb getLocalizedValuesLV_tb() {
      return getOrCreateProperty("LocalizedValuesLV_tb", "LocalizedValuesLV_tb", null, pcftest.LocalizedValuesDV.LocalizedValuesLV.LocalizedValuesLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/i18n/LocalizedValuesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LocalizedValuesLV_tb extends PCFElement {
      public LocalizedValuesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.LocalizedValuesDV.LocalizedValuesLV.LocalizedValuesLV_tb.Add.class);
      }
      
      public Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.LocalizedValuesDV.LocalizedValuesLV.LocalizedValuesLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/i18n/LocalizedValuesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/i18n/LocalizedValuesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Remove extends ClickableActionElement {
        public Remove(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  
}