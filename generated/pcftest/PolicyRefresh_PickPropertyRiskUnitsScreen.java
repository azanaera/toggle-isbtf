package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PolicyRefresh_PickPropertyRiskUnitsScreen.PolicyRefreshExistingPropertyRULV_tb;
import pcftest.PolicyRefresh_PickPropertyRiskUnitsScreen.PolicySummaryPropertyLV_tb;
import pcftest.PolicyRefresh_PickPropertyRiskUnitsScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefresh_PickPropertyRiskUnitsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyRefresh_PickPropertyRiskUnitsScreen extends PCFElement {
  public final static String CHECKSUM = "05dff70a1856603e7b06718bf061ecae";
  
  public PolicyRefresh_PickPropertyRiskUnitsScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public PolicyRefreshExistingPropertyRULV getPolicyRefreshExistingPropertyRULV() {
    return getOrCreateProperty("PolicyRefreshExistingPropertyRULV", "PolicyRefreshExistingPropertyRULV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PolicyRefreshExistingPropertyRULV.class);
  }
  
  public PolicyRefreshExistingPropertyRULV_tb getPolicyRefreshExistingPropertyRULV_tb() {
    return getOrCreateProperty("PolicyRefreshExistingPropertyRULV_tb", "PolicyRefreshExistingPropertyRULV_tb", null, pcftest.PolicyRefresh_PickPropertyRiskUnitsScreen.PolicyRefreshExistingPropertyRULV_tb.class);
  }
  
  public PolicySummaryPropertyLV getPolicySummaryPropertyLV() {
    return getOrCreateProperty("PolicySummaryPropertyLV", "PolicySummaryPropertyLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PolicySummaryPropertyLV.class);
  }
  
  public PolicySummaryPropertyLV_tb getPolicySummaryPropertyLV_tb() {
    return getOrCreateProperty("PolicySummaryPropertyLV_tb", "PolicySummaryPropertyLV_tb", null, pcftest.PolicyRefresh_PickPropertyRiskUnitsScreen.PolicySummaryPropertyLV_tb.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.PolicyRefresh_PickPropertyRiskUnitsScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefresh_PickPropertyRiskUnitsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyRefreshExistingPropertyRULV_tb extends PCFElement {
    public PolicyRefreshExistingPropertyRULV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefresh_PickPropertyRiskUnitsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicySummaryPropertyLV_tb extends PCFElement {
    public PolicySummaryPropertyLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefresh_PickPropertyRiskUnitsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}