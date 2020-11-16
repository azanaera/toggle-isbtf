package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLWizard_NewLossDetailsScreen_PR.LossDetailsPanel;
import pcftest.FNOLWizard_NewLossDetailsScreen_PR._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.PR.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_NewLossDetailsScreen_PR extends FNOLWizard_NewLossDetailsScreen {
  public final static String CHECKSUM = "7d0ddc818e161c1a81d858c242d69354";
  
  public FNOLWizard_NewLossDetailsScreen_PR(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public LossDetailsPanel getLossDetailsPanel() {
    return getOrCreateProperty("LossDetailsPanel", "LossDetailsPanel", null, pcftest.FNOLWizard_NewLossDetailsScreen_PR.LossDetailsPanel.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FNOLWizard_NewLossDetailsScreen_PR._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.PR.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossDetailsPanel extends PCFElement {
    public LossDetailsPanel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public FNOLWizard_NewLossDetailsPanelSet_CommercialPackage getFNOLWizard_NewLossDetailsPanelSet_CommercialPackage() {
      return getOrCreateProperty("FNOLWizard_NewLossDetailsPanelSet_CommercialPackage", "FNOLWizard_NewLossDetailsPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.FNOLWizard_NewLossDetailsPanelSet_CommercialPackage.class);
    }
    
    public FNOLWizard_NewLossDetailsPanelSet_CommercialProperty getFNOLWizard_NewLossDetailsPanelSet_CommercialProperty() {
      return getOrCreateProperty("FNOLWizard_NewLossDetailsPanelSet_CommercialProperty", "FNOLWizard_NewLossDetailsPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.FNOLWizard_NewLossDetailsPanelSet_CommercialProperty.class);
    }
    
    public FNOLWizard_NewLossDetailsPanelSet_InlandMarine getFNOLWizard_NewLossDetailsPanelSet_InlandMarine() {
      return getOrCreateProperty("FNOLWizard_NewLossDetailsPanelSet_InlandMarine", "FNOLWizard_NewLossDetailsPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.FNOLWizard_NewLossDetailsPanelSet_InlandMarine.class);
    }
    
    public FNOLWizard_NewLossDetailsPanelSet_homeowners getFNOLWizard_NewLossDetailsPanelSet_homeowners() {
      return getOrCreateProperty("FNOLWizard_NewLossDetailsPanelSet_homeowners", "FNOLWizard_NewLossDetailsPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.FNOLWizard_NewLossDetailsPanelSet_homeowners.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.PR.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}