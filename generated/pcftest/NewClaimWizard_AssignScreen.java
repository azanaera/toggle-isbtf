package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimWizard_AssignScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_AssignScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimWizard_AssignScreen extends PCFElement {
  public final static String CHECKSUM = "177d5e587bcc2c11e997dec31940bf28";
  
  public NewClaimWizard_AssignScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewClaimWizard_AssignDV getNewClaimWizard_AssignDV() {
    return getOrCreateProperty("NewClaimWizard_AssignDV", "NewClaimWizard_AssignDV", null, pcftest.NewClaimWizard_AssignDV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewClaimWizard_AssignScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_AssignScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}