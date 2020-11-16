package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLWizard_NewQuickClaimScreen.NewClaimWizard_QuickClaimScreen_ReturnFromQuickClaimButton;
import pcftest.FNOLWizard_NewQuickClaimScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewQuickClaimScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_NewQuickClaimScreen extends PCFElement {
  public final static String CHECKSUM = "7446e1bc73767521cbe77641148bbd8d";
  
  public FNOLWizard_NewQuickClaimScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public NewClaimWizard_QuickClaimScreen_ReturnFromQuickClaimButton getNewClaimWizard_QuickClaimScreen_ReturnFromQuickClaimButton() {
    return getOrCreateProperty("NewClaimWizard_QuickClaimScreen_ReturnFromQuickClaimButton", "NewClaimWizard_QuickClaimScreen_ReturnFromQuickClaimButton", null, pcftest.FNOLWizard_NewQuickClaimScreen.NewClaimWizard_QuickClaimScreen_ReturnFromQuickClaimButton.class);
  }
  
  public QuickClaimDV_GL getQuickClaimDV_GL() {
    return getOrCreateProperty("QuickClaimDV_GL", "QuickClaimDV", null, pcftest.QuickClaimDV_GL.class);
  }
  
  public QuickClaimDV_QuickClaimAuto getQuickClaimDV_QuickClaimAuto() {
    return getOrCreateProperty("QuickClaimDV_QuickClaimAuto", "QuickClaimDV", null, pcftest.QuickClaimDV_QuickClaimAuto.class);
  }
  
  public QuickClaimDV_QuickClaimProperty getQuickClaimDV_QuickClaimProperty() {
    return getOrCreateProperty("QuickClaimDV_QuickClaimProperty", "QuickClaimDV", null, pcftest.QuickClaimDV_QuickClaimProperty.class);
  }
  
  public QuickClaimDV_TravelBaggageOnly getQuickClaimDV_TravelBaggageOnly() {
    return getOrCreateProperty("QuickClaimDV_TravelBaggageOnly", "QuickClaimDV", null, pcftest.QuickClaimDV_TravelBaggageOnly.class);
  }
  
  public QuickClaimDV_TravelCancelOnly getQuickClaimDV_TravelCancelOnly() {
    return getOrCreateProperty("QuickClaimDV_TravelCancelOnly", "QuickClaimDV", null, pcftest.QuickClaimDV_TravelCancelOnly.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FNOLWizard_NewQuickClaimScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewQuickClaimScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_QuickClaimScreen_ReturnFromQuickClaimButton extends ClickableActionElement {
    public NewClaimWizard_QuickClaimScreen_ReturnFromQuickClaimButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewQuickClaimScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}