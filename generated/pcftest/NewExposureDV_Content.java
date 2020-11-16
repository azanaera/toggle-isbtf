package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewExposureDV_Content.NewExposureCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newexposure/NewExposureDV.Content.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewExposureDV_Content extends NewExposureDV {
  public final static String CHECKSUM = "99d369db87b65e54eafc1b6aca48bbcd";
  
  public NewExposureDV_Content(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewClaimContentsDamageDV getNewClaimContentsDamageDV() {
    return getOrCreateProperty("NewClaimContentsDamageDV", "NewClaimContentsDamageDV", null, pcftest.NewClaimContentsDamageDV.class);
  }
  
  public NewExposureCardTab getNewExposureCardTab() {
    return getOrCreateProperty("NewExposureCardTab", "NewExposureCardTab", null, pcftest.NewExposureDV_Content.NewExposureCardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewExposureDV.Content.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewExposureCardTab extends ClickableActionElement {
    public NewExposureCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}