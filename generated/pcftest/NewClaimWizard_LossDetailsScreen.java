package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimWizard_LossDetailsScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_LossDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimWizard_LossDetailsScreen extends PCFElement {
  public final static String CHECKSUM = "8204db297129b0a3506e4773fbd3d46e";
  
  public NewClaimWizard_LossDetailsScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewClaimLossDetailsDV_Gl getNewClaimLossDetailsDV_Gl() {
    return getOrCreateProperty("NewClaimLossDetailsDV_Gl", "NewClaimLossDetailsDV", null, pcftest.NewClaimLossDetailsDV_Gl.class);
  }
  
  public NewClaimLossDetailsDV_Pr getNewClaimLossDetailsDV_Pr() {
    return getOrCreateProperty("NewClaimLossDetailsDV_Pr", "NewClaimLossDetailsDV", null, pcftest.NewClaimLossDetailsDV_Pr.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewClaimWizard_LossDetailsScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_LossDetailsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}