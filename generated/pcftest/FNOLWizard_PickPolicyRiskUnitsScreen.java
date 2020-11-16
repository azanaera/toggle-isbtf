package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLWizard_PickPolicyRiskUnitsScreen.PolicySummaryPropertyLV_tb;
import pcftest.FNOLWizard_PickPolicyRiskUnitsScreen.PolicySummaryPropertyLV_tb.EditSelectionsProperty;
import pcftest.FNOLWizard_PickPolicyRiskUnitsScreen.PolicySummaryVehicleLV_tb;
import pcftest.FNOLWizard_PickPolicyRiskUnitsScreen.PolicySummaryVehicleLV_tb.EditSelectionsVehicle;
import pcftest.FNOLWizard_PickPolicyRiskUnitsScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_PickPolicyRiskUnitsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_PickPolicyRiskUnitsScreen extends PCFElement {
  public final static String CHECKSUM = "bf32ea634d34ee2765957371c5657f96";
  
  public FNOLWizard_PickPolicyRiskUnitsScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public PolicySummaryPropertyLV getPolicySummaryPropertyLV() {
    return getOrCreateProperty("PolicySummaryPropertyLV", "PolicySummaryPropertyLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PolicySummaryPropertyLV.class);
  }
  
  public PolicySummaryPropertyLV_tb getPolicySummaryPropertyLV_tb() {
    return getOrCreateProperty("PolicySummaryPropertyLV_tb", "PolicySummaryPropertyLV_tb", null, pcftest.FNOLWizard_PickPolicyRiskUnitsScreen.PolicySummaryPropertyLV_tb.class);
  }
  
  public PolicySummaryVehicleLV getPolicySummaryVehicleLV() {
    return getOrCreateProperty("PolicySummaryVehicleLV", "PolicySummaryVehicleLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PolicySummaryVehicleLV.class);
  }
  
  public PolicySummaryVehicleLV_tb getPolicySummaryVehicleLV_tb() {
    return getOrCreateProperty("PolicySummaryVehicleLV_tb", "PolicySummaryVehicleLV_tb", null, pcftest.FNOLWizard_PickPolicyRiskUnitsScreen.PolicySummaryVehicleLV_tb.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FNOLWizard_PickPolicyRiskUnitsScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_PickPolicyRiskUnitsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicySummaryPropertyLV_tb extends PCFElement {
    public PolicySummaryPropertyLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EditSelectionsProperty getEditSelectionsProperty() {
      return getOrCreateProperty("EditSelectionsProperty", "EditSelectionsProperty", null, pcftest.FNOLWizard_PickPolicyRiskUnitsScreen.PolicySummaryPropertyLV_tb.EditSelectionsProperty.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_PickPolicyRiskUnitsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditSelectionsProperty extends ClickableActionElement {
      public EditSelectionsProperty(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_PickPolicyRiskUnitsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicySummaryVehicleLV_tb extends PCFElement {
    public PolicySummaryVehicleLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EditSelectionsVehicle getEditSelectionsVehicle() {
      return getOrCreateProperty("EditSelectionsVehicle", "EditSelectionsVehicle", null, pcftest.FNOLWizard_PickPolicyRiskUnitsScreen.PolicySummaryVehicleLV_tb.EditSelectionsVehicle.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_PickPolicyRiskUnitsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditSelectionsVehicle extends ClickableActionElement {
      public EditSelectionsVehicle(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_PickPolicyRiskUnitsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}