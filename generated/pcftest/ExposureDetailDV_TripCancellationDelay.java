package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ExposureDetailDV_TripCancellationDelay.Exposure_ISOCardTab;
import pcftest.ExposureDetailDV_TripCancellationDelay.TripCancellation_DetailsCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.TripCancellationDelay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ExposureDetailDV_TripCancellationDelay extends ExposureDetailDV {
  public final static String CHECKSUM = "a5b9a93cc1088f2ac3f835dd9711ab5e";
  
  public ExposureDetailDV_TripCancellationDelay(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Exposure_ISOCardTab getExposure_ISOCardTab() {
    return getOrCreateProperty("Exposure_ISOCardTab", "Exposure_ISOCardTab", null, pcftest.ExposureDetailDV_TripCancellationDelay.Exposure_ISOCardTab.class);
  }
  
  public ISODetailsDV getISODetailsDV() {
    return getOrCreateProperty("ISODetailsDV", "ISODetailsDV", null, pcftest.ISODetailsDV.class);
  }
  
  public TripCancellationDV getTripCancellationDV() {
    return getOrCreateProperty("TripCancellationDV", "TripCancellationDV", null, pcftest.TripCancellationDV.class);
  }
  
  public TripCancellation_DetailsCardTab getTripCancellation_DetailsCardTab() {
    return getOrCreateProperty("TripCancellation_DetailsCardTab", "TripCancellation_DetailsCardTab", null, pcftest.ExposureDetailDV_TripCancellationDelay.TripCancellation_DetailsCardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.TripCancellationDelay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposure_ISOCardTab extends ClickableActionElement {
    public Exposure_ISOCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.TripCancellationDelay.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TripCancellation_DetailsCardTab extends ClickableActionElement {
    public TripCancellation_DetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}