package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLWizard_BasicInfoRightPanelSet_Pr.PolicyPanelSet;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_BasicInfoRightPanelSet_Pr extends FNOLWizard_BasicInfoRightPanelSet {
  public final static String CHECKSUM = "64a78b74a88e45c79778e7851f606095";
  
  public FNOLWizard_BasicInfoRightPanelSet_Pr(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public PolicyPanelSet getPolicyPanelSet() {
    return getOrCreateProperty("PolicyPanelSet", "PolicyPanelSet", null, pcftest.FNOLWizard_BasicInfoRightPanelSet_Pr.PolicyPanelSet.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_BasicInfoRightPanelSet.Pr.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyPanelSet extends PCFElement {
    public PolicyPanelSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public FNOLWizard_BasicInfoPolicyPanelSet_Homeowners getFNOLWizard_BasicInfoPolicyPanelSet_Homeowners() {
      return getOrCreateProperty("FNOLWizard_BasicInfoPolicyPanelSet_Homeowners", "FNOLWizard_BasicInfoPolicyPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.FNOLWizard_BasicInfoPolicyPanelSet_Homeowners.class);
    }
    
    public FNOLWizard_BasicInfoPolicyPanelSet_default getFNOLWizard_BasicInfoPolicyPanelSet_default() {
      return getOrCreateProperty("FNOLWizard_BasicInfoPolicyPanelSet_default", "FNOLWizard_BasicInfoPolicyPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.FNOLWizard_BasicInfoPolicyPanelSet_default.class);
    }
    
    
  }
  
  
}