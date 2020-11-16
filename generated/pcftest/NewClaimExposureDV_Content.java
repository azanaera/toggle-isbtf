package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimExposureDV_Content.NewClaimExposureCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.Content.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimExposureDV_Content extends NewClaimExposureDV {
  public final static String CHECKSUM = "e00a2ec2ed3a7792e0530d6dca9a6109";
  
  public NewClaimExposureDV_Content(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewClaimContentsDamageDV getNewClaimContentsDamageDV() {
    return getOrCreateProperty("NewClaimContentsDamageDV", "NewClaimContentsDamageDV", null, pcftest.NewClaimContentsDamageDV.class);
  }
  
  public NewClaimExposureCardTab getNewClaimExposureCardTab() {
    return getOrCreateProperty("NewClaimExposureCardTab", "NewClaimExposureCardTab", null, pcftest.NewClaimExposureDV_Content.NewClaimExposureCardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimExposureDV.Content.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimExposureCardTab extends ClickableActionElement {
    public NewClaimExposureCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}