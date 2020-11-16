package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ExposureDetailDV_Lossofusedamage.Exposure_ISOCardTab;
import pcftest.ExposureDetailDV_Lossofusedamage.LossOfUseDamage_DetailsCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Lossofusedamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ExposureDetailDV_Lossofusedamage extends ExposureDetailDV {
  public final static String CHECKSUM = "c9608857a7e1020f1b50f8e47dd20113";
  
  public ExposureDetailDV_Lossofusedamage(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Exposure_ISOCardTab getExposure_ISOCardTab() {
    return getOrCreateProperty("Exposure_ISOCardTab", "Exposure_ISOCardTab", null, pcftest.ExposureDetailDV_Lossofusedamage.Exposure_ISOCardTab.class);
  }
  
  public ISODetailsDV getISODetailsDV() {
    return getOrCreateProperty("ISODetailsDV", "ISODetailsDV", null, pcftest.ISODetailsDV.class);
  }
  
  public LossOfUseDamageDV getLossOfUseDamageDV() {
    return getOrCreateProperty("LossOfUseDamageDV", "LossOfUseDamageDV", null, pcftest.LossOfUseDamageDV.class);
  }
  
  public LossOfUseDamage_DetailsCardTab getLossOfUseDamage_DetailsCardTab() {
    return getOrCreateProperty("LossOfUseDamage_DetailsCardTab", "LossOfUseDamage_DetailsCardTab", null, pcftest.ExposureDetailDV_Lossofusedamage.LossOfUseDamage_DetailsCardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Lossofusedamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposure_ISOCardTab extends ClickableActionElement {
    public Exposure_ISOCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Lossofusedamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossOfUseDamage_DetailsCardTab extends ClickableActionElement {
    public LossOfUseDamage_DetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}