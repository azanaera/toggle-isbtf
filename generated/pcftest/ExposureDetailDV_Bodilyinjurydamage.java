package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ExposureDetailDV_Bodilyinjurydamage.BodilyInjuryDamage_DetailsCardTab;
import pcftest.ExposureDetailDV_Bodilyinjurydamage.Exposure_ISOCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Bodilyinjurydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ExposureDetailDV_Bodilyinjurydamage extends ExposureDetailDV {
  public final static String CHECKSUM = "9296ec226cb677e84fa727168dcedc71";
  
  public ExposureDetailDV_Bodilyinjurydamage(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BodilyInjuryDamageDV getBodilyInjuryDamageDV() {
    return getOrCreateProperty("BodilyInjuryDamageDV", "BodilyInjuryDamageDV", null, pcftest.BodilyInjuryDamageDV.class);
  }
  
  public BodilyInjuryDamage_DetailsCardTab getBodilyInjuryDamage_DetailsCardTab() {
    return getOrCreateProperty("BodilyInjuryDamage_DetailsCardTab", "BodilyInjuryDamage_DetailsCardTab", null, pcftest.ExposureDetailDV_Bodilyinjurydamage.BodilyInjuryDamage_DetailsCardTab.class);
  }
  
  public Exposure_ISOCardTab getExposure_ISOCardTab() {
    return getOrCreateProperty("Exposure_ISOCardTab", "Exposure_ISOCardTab", null, pcftest.ExposureDetailDV_Bodilyinjurydamage.Exposure_ISOCardTab.class);
  }
  
  public ISODetailsDV getISODetailsDV() {
    return getOrCreateProperty("ISODetailsDV", "ISODetailsDV", null, pcftest.ISODetailsDV.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Bodilyinjurydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BodilyInjuryDamage_DetailsCardTab extends ClickableActionElement {
    public BodilyInjuryDamage_DetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Bodilyinjurydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposure_ISOCardTab extends ClickableActionElement {
    public Exposure_ISOCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}