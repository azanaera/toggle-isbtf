package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimExposureDV_Baggage.NewExposureCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.Baggage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimExposureDV_Baggage extends NewClaimExposureDV {
  public final static String CHECKSUM = "b3078dbd968a0b0484e39e61746b29f2";
  
  public NewClaimExposureDV_Baggage(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewClaimBaggageDamageDV getNewClaimBaggageDamageDV() {
    return getOrCreateProperty("NewClaimBaggageDamageDV", "NewClaimBaggageDamageDV", null, pcftest.NewClaimBaggageDamageDV.class);
  }
  
  public NewExposureCardTab getNewExposureCardTab() {
    return getOrCreateProperty("NewExposureCardTab", "NewExposureCardTab", null, pcftest.NewClaimExposureDV_Baggage.NewExposureCardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.Baggage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewExposureCardTab extends ClickableActionElement {
    public NewExposureCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}