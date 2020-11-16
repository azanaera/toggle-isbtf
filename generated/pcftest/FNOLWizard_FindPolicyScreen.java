package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLWizard_FindPolicyScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_FindPolicyScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_FindPolicyScreen extends PCFElement {
  public final static String CHECKSUM = "8d18a151cfbc559bcc8ca3f0512cfd99";
  
  public FNOLWizard_FindPolicyScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public FNOLWizardFindPolicyPanelSet_Create getFNOLWizardFindPolicyPanelSet_Create() {
    return getOrCreateProperty("FNOLWizardFindPolicyPanelSet_Create", "FNOLWizardFindPolicyPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.FNOLWizardFindPolicyPanelSet_Create.class);
  }
  
  public FNOLWizardFindPolicyPanelSet_Search getFNOLWizardFindPolicyPanelSet_Search() {
    return getOrCreateProperty("FNOLWizardFindPolicyPanelSet_Search", "FNOLWizardFindPolicyPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.FNOLWizardFindPolicyPanelSet_Search.class);
  }
  
  public BooleanValueElement getScreenMode() {
    return getOrCreateProperty("ScreenMode", "ScreenMode", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FNOLWizard_FindPolicyScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_FindPolicyScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}