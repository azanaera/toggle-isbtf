package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ExposureDetailDV_OtherStructure.Exposure_ISOCardTab;
import pcftest.ExposureDetailDV_OtherStructure.PropertyDamage_DetailsCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.OtherStructure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ExposureDetailDV_OtherStructure extends ExposureDetailDV {
  public final static String CHECKSUM = "4789c46484284a719a70d41fe7abf5fe";
  
  public ExposureDetailDV_OtherStructure(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Exposure_ISOCardTab getExposure_ISOCardTab() {
    return getOrCreateProperty("Exposure_ISOCardTab", "Exposure_ISOCardTab", null, pcftest.ExposureDetailDV_OtherStructure.Exposure_ISOCardTab.class);
  }
  
  public ISODetailsDV getISODetailsDV() {
    return getOrCreateProperty("ISODetailsDV", "ISODetailsDV", null, pcftest.ISODetailsDV.class);
  }
  
  public OtherStructureDamageDV getOtherStructureDamageDV() {
    return getOrCreateProperty("OtherStructureDamageDV", "OtherStructureDamageDV", null, pcftest.OtherStructureDamageDV.class);
  }
  
  public PropertyDamage_DetailsCardTab getPropertyDamage_DetailsCardTab() {
    return getOrCreateProperty("PropertyDamage_DetailsCardTab", "PropertyDamage_DetailsCardTab", null, pcftest.ExposureDetailDV_OtherStructure.PropertyDamage_DetailsCardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.OtherStructure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposure_ISOCardTab extends ClickableActionElement {
    public Exposure_ISOCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.OtherStructure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyDamage_DetailsCardTab extends ClickableActionElement {
    public PropertyDamage_DetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}