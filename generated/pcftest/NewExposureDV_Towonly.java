package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewExposureDV_Towonly.NewExposureCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newexposure/NewExposureDV.Towonly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewExposureDV_Towonly extends NewExposureDV {
  public final static String CHECKSUM = "eeaee4c56cf15061378850e4fa72778e";
  
  public NewExposureDV_Towonly(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewClaimTowOnlyDV getNewClaimTowOnlyDV() {
    return getOrCreateProperty("NewClaimTowOnlyDV", "NewClaimTowOnlyDV", null, pcftest.NewClaimTowOnlyDV.class);
  }
  
  public NewExposureCardTab getNewExposureCardTab() {
    return getOrCreateProperty("NewExposureCardTab", "NewExposureCardTab", null, pcftest.NewExposureDV_Towonly.NewExposureCardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newexposure/NewExposureDV.Towonly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewExposureCardTab extends ClickableActionElement {
    public NewExposureCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}