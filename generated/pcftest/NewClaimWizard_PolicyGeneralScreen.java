package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimWizard_PolicyGeneralScreen.NewClaimWizard_PolicyGeneralScreen_EditExternalFieldsButton;
import pcftest.NewClaimWizard_PolicyGeneralScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyGeneralScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimWizard_PolicyGeneralScreen extends PCFElement {
  public final static String CHECKSUM = "59d9032a4647500f3e52e88b0aa803a6";
  
  public NewClaimWizard_PolicyGeneralScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewClaimPolicyGeneralPanelSet_Auto getNewClaimPolicyGeneralPanelSet_Auto() {
    return getOrCreateProperty("NewClaimPolicyGeneralPanelSet_Auto", "NewClaimPolicyGeneralPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.NewClaimPolicyGeneralPanelSet_Auto.class);
  }
  
  public NewClaimPolicyGeneralPanelSet_Gl getNewClaimPolicyGeneralPanelSet_Gl() {
    return getOrCreateProperty("NewClaimPolicyGeneralPanelSet_Gl", "NewClaimPolicyGeneralPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.NewClaimPolicyGeneralPanelSet_Gl.class);
  }
  
  public NewClaimPolicyGeneralPanelSet_Pr getNewClaimPolicyGeneralPanelSet_Pr() {
    return getOrCreateProperty("NewClaimPolicyGeneralPanelSet_Pr", "NewClaimPolicyGeneralPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.NewClaimPolicyGeneralPanelSet_Pr.class);
  }
  
  public NewClaimPolicyGeneralPanelSet_Trav getNewClaimPolicyGeneralPanelSet_Trav() {
    return getOrCreateProperty("NewClaimPolicyGeneralPanelSet_Trav", "NewClaimPolicyGeneralPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.NewClaimPolicyGeneralPanelSet_Trav.class);
  }
  
  public NewClaimPolicyGeneralPanelSet_Wc getNewClaimPolicyGeneralPanelSet_Wc() {
    return getOrCreateProperty("NewClaimPolicyGeneralPanelSet_Wc", "NewClaimPolicyGeneralPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.NewClaimPolicyGeneralPanelSet_Wc.class);
  }
  
  public NewClaimWizard_PolicyGeneralScreen_EditExternalFieldsButton getNewClaimWizard_PolicyGeneralScreen_EditExternalFieldsButton() {
    return getOrCreateProperty("NewClaimWizard_PolicyGeneralScreen_EditExternalFieldsButton", "NewClaimWizard_PolicyGeneralScreen_EditExternalFieldsButton", null, pcftest.NewClaimWizard_PolicyGeneralScreen.NewClaimWizard_PolicyGeneralScreen_EditExternalFieldsButton.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewClaimWizard_PolicyGeneralScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyGeneralScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_PolicyGeneralScreen_EditExternalFieldsButton extends ClickableActionElement {
    public NewClaimWizard_PolicyGeneralScreen_EditExternalFieldsButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyGeneralScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}