package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimExposureDV_Personalpropertydamage.NewClaimExposureCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.Personalpropertydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimExposureDV_Personalpropertydamage extends NewClaimExposureDV {
  public final static String CHECKSUM = "01c2280475ad131e0250993d463e8fa8";
  
  public NewClaimExposureDV_Personalpropertydamage(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewClaimExposureCardTab getNewClaimExposureCardTab() {
    return getOrCreateProperty("NewClaimExposureCardTab", "NewClaimExposureCardTab", null, pcftest.NewClaimExposureDV_Personalpropertydamage.NewClaimExposureCardTab.class);
  }
  
  public NewClaimThirdPartyPropertyDamageDV getNewClaimThirdPartyPropertyDamageDV() {
    return getOrCreateProperty("NewClaimThirdPartyPropertyDamageDV", "NewClaimThirdPartyPropertyDamageDV", null, pcftest.NewClaimThirdPartyPropertyDamageDV.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.Personalpropertydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimExposureCardTab extends ClickableActionElement {
    public NewClaimExposureCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}