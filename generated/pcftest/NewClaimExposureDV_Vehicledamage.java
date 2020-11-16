package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimExposureDV_Vehicledamage.NewClaimExposureCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.Vehicledamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimExposureDV_Vehicledamage extends NewClaimExposureDV {
  public final static String CHECKSUM = "371ba379ad1e2f778454dff84a9ea0fb";
  
  public NewClaimExposureDV_Vehicledamage(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewClaimExposureCardTab getNewClaimExposureCardTab() {
    return getOrCreateProperty("NewClaimExposureCardTab", "NewClaimExposureCardTab", null, pcftest.NewClaimExposureDV_Vehicledamage.NewClaimExposureCardTab.class);
  }
  
  public NewClaimVehicleDamageDV getNewClaimVehicleDamageDV() {
    return getOrCreateProperty("NewClaimVehicleDamageDV", "NewClaimVehicleDamageDV", null, pcftest.NewClaimVehicleDamageDV.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.Vehicledamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimExposureCardTab extends ClickableActionElement {
    public NewClaimExposureCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}