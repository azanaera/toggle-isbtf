package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ExposureDetailDV_Baggage.BaggageDamage_DetailsCardTab;
import pcftest.ExposureDetailDV_Baggage.Exposure_ISOCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Baggage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ExposureDetailDV_Baggage extends ExposureDetailDV {
  public final static String CHECKSUM = "51db2d5eba7b46a88b4637cc2d4485c6";
  
  public ExposureDetailDV_Baggage(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BaggageDamageDV getBaggageDamageDV() {
    return getOrCreateProperty("BaggageDamageDV", "BaggageDamageDV", null, pcftest.BaggageDamageDV.class);
  }
  
  public BaggageDamage_DetailsCardTab getBaggageDamage_DetailsCardTab() {
    return getOrCreateProperty("BaggageDamage_DetailsCardTab", "BaggageDamage_DetailsCardTab", null, pcftest.ExposureDetailDV_Baggage.BaggageDamage_DetailsCardTab.class);
  }
  
  public Exposure_ISOCardTab getExposure_ISOCardTab() {
    return getOrCreateProperty("Exposure_ISOCardTab", "Exposure_ISOCardTab", null, pcftest.ExposureDetailDV_Baggage.Exposure_ISOCardTab.class);
  }
  
  public ISODetailsDV getISODetailsDV() {
    return getOrCreateProperty("ISODetailsDV", "ISODetailsDV", null, pcftest.ISODetailsDV.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Baggage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BaggageDamage_DetailsCardTab extends ClickableActionElement {
    public BaggageDamage_DetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Baggage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposure_ISOCardTab extends ClickableActionElement {
    public Exposure_ISOCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}