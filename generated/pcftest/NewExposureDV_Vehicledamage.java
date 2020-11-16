package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewExposureDV_Vehicledamage.NewExposureCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newexposure/NewExposureDV.Vehicledamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewExposureDV_Vehicledamage extends NewExposureDV {
  public final static String CHECKSUM = "938311014c7438abdbe916e14f4bc5e6";
  
  public NewExposureDV_Vehicledamage(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewClaimVehicleDamageDV getNewClaimVehicleDamageDV() {
    return getOrCreateProperty("NewClaimVehicleDamageDV", "NewClaimVehicleDamageDV", null, pcftest.NewClaimVehicleDamageDV.class);
  }
  
  public NewExposureCardTab getNewExposureCardTab() {
    return getOrCreateProperty("NewExposureCardTab", "NewExposureCardTab", null, pcftest.NewExposureDV_Vehicledamage.NewExposureCardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewExposureDV.Vehicledamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewExposureCardTab extends ClickableActionElement {
    public NewExposureCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}