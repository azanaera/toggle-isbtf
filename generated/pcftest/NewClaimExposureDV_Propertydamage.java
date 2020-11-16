package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimExposureDV_Propertydamage.NewClaimExposureCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.Propertydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimExposureDV_Propertydamage extends NewClaimExposureDV {
  public final static String CHECKSUM = "e5ef3d39a11e135871fb1eddc9002415";
  
  public NewClaimExposureDV_Propertydamage(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewClaimExposureCardTab getNewClaimExposureCardTab() {
    return getOrCreateProperty("NewClaimExposureCardTab", "NewClaimExposureCardTab", null, pcftest.NewClaimExposureDV_Propertydamage.NewClaimExposureCardTab.class);
  }
  
  public NewClaimPropertyDamageDV getNewClaimPropertyDamageDV() {
    return getOrCreateProperty("NewClaimPropertyDamageDV", "NewClaimPropertyDamageDV", null, pcftest.NewClaimPropertyDamageDV.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.Propertydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimExposureCardTab extends ClickableActionElement {
    public NewClaimExposureCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}