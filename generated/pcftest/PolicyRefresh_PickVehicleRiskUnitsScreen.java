package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PolicyRefresh_PickVehicleRiskUnitsScreen.PolicyRefreshExistingVehicleRULV_tb;
import pcftest.PolicyRefresh_PickVehicleRiskUnitsScreen.PolicySummaryVehicleLV_tb;
import pcftest.PolicyRefresh_PickVehicleRiskUnitsScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefresh_PickVehicleRiskUnitsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyRefresh_PickVehicleRiskUnitsScreen extends PCFElement {
  public final static String CHECKSUM = "dac5b86f20fee25b8c8be83ed7583c37";
  
  public PolicyRefresh_PickVehicleRiskUnitsScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public PolicyRefreshExistingVehicleRULV getPolicyRefreshExistingVehicleRULV() {
    return getOrCreateProperty("PolicyRefreshExistingVehicleRULV", "PolicyRefreshExistingVehicleRULV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PolicyRefreshExistingVehicleRULV.class);
  }
  
  public PolicyRefreshExistingVehicleRULV_tb getPolicyRefreshExistingVehicleRULV_tb() {
    return getOrCreateProperty("PolicyRefreshExistingVehicleRULV_tb", "PolicyRefreshExistingVehicleRULV_tb", null, pcftest.PolicyRefresh_PickVehicleRiskUnitsScreen.PolicyRefreshExistingVehicleRULV_tb.class);
  }
  
  public PolicySummaryVehicleLV getPolicySummaryVehicleLV() {
    return getOrCreateProperty("PolicySummaryVehicleLV", "PolicySummaryVehicleLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PolicySummaryVehicleLV.class);
  }
  
  public PolicySummaryVehicleLV_tb getPolicySummaryVehicleLV_tb() {
    return getOrCreateProperty("PolicySummaryVehicleLV_tb", "PolicySummaryVehicleLV_tb", null, pcftest.PolicyRefresh_PickVehicleRiskUnitsScreen.PolicySummaryVehicleLV_tb.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.PolicyRefresh_PickVehicleRiskUnitsScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefresh_PickVehicleRiskUnitsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyRefreshExistingVehicleRULV_tb extends PCFElement {
    public PolicyRefreshExistingVehicleRULV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefresh_PickVehicleRiskUnitsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicySummaryVehicleLV_tb extends PCFElement {
    public PolicySummaryVehicleLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefresh_PickVehicleRiskUnitsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}