package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLWizard_ServicesScreen_Pr.PolicyPanelSet;
import pcftest.FNOLWizard_ServicesScreen_Pr._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_ServicesScreen.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_ServicesScreen_Pr extends FNOLWizard_ServicesScreen {
  public final static String CHECKSUM = "6bd3b7dec0949c7c2adc70f3e1ef35e9";
  
  public FNOLWizard_ServicesScreen_Pr(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public PolicyPanelSet getPolicyPanelSet() {
    return getOrCreateProperty("PolicyPanelSet", "PolicyPanelSet", null, pcftest.FNOLWizard_ServicesScreen_Pr.PolicyPanelSet.class);
  }
  
  public ValueElement getServiceRequestSubmitMessage() {
    return getOrCreateProperty("ServiceRequestSubmitMessage", "ServiceRequestSubmitMessage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FNOLWizard_ServicesScreen_Pr._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_ServicesScreen.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyPanelSet extends PCFElement {
    public PolicyPanelSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public FNOLWizard_ServicesPolicyPanelSet_CommercialPackage getFNOLWizard_ServicesPolicyPanelSet_CommercialPackage() {
      return getOrCreateProperty("FNOLWizard_ServicesPolicyPanelSet_CommercialPackage", "FNOLWizard_ServicesPolicyPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.FNOLWizard_ServicesPolicyPanelSet_CommercialPackage.class);
    }
    
    public FNOLWizard_ServicesPolicyPanelSet_CommercialProperty getFNOLWizard_ServicesPolicyPanelSet_CommercialProperty() {
      return getOrCreateProperty("FNOLWizard_ServicesPolicyPanelSet_CommercialProperty", "FNOLWizard_ServicesPolicyPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.FNOLWizard_ServicesPolicyPanelSet_CommercialProperty.class);
    }
    
    public FNOLWizard_ServicesPolicyPanelSet_Homeowners getFNOLWizard_ServicesPolicyPanelSet_Homeowners() {
      return getOrCreateProperty("FNOLWizard_ServicesPolicyPanelSet_Homeowners", "FNOLWizard_ServicesPolicyPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.FNOLWizard_ServicesPolicyPanelSet_Homeowners.class);
    }
    
    public FNOLWizard_ServicesPolicyPanelSet_InlandMarine getFNOLWizard_ServicesPolicyPanelSet_InlandMarine() {
      return getOrCreateProperty("FNOLWizard_ServicesPolicyPanelSet_InlandMarine", "FNOLWizard_ServicesPolicyPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.FNOLWizard_ServicesPolicyPanelSet_InlandMarine.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_ServicesScreen.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}