package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PolicyLocationLDV.LocationDetailCardTab;
import pcftest.PolicyLocationLDV.PolicyLocationRiskDetailPanelSet_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyLocationLDV extends PCFElement {
  public final static String CHECKSUM = "bae8f7459e9572d53397c8783143e4a5";
  
  public PolicyLocationLDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public LocationDetailCardTab getLocationDetailCardTab() {
    return getOrCreateProperty("LocationDetailCardTab", "LocationDetailCardTab", null, pcftest.PolicyLocationLDV.LocationDetailCardTab.class);
  }
  
  public PolicyLocationRiskDetailPanelSet getPolicyLocationRiskDetailPanelSet() {
    return getOrCreateProperty("PolicyLocationRiskDetailPanelSet", "PolicyLocationRiskDetailPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.PolicyLocationRiskDetailPanelSet.class);
  }
  
  public PolicyLocationRiskDetailPanelSet_tb getPolicyLocationRiskDetailPanelSet_tb() {
    return getOrCreateProperty("PolicyLocationRiskDetailPanelSet_tb", "PolicyLocationRiskDetailPanelSet_tb", null, pcftest.PolicyLocationLDV.PolicyLocationRiskDetailPanelSet_tb.class);
  }
  
  public PolicyLocationsLV getPolicyLocationsLV() {
    return getOrCreateProperty("PolicyLocationsLV", "PolicyLocationsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PolicyLocationsLV.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationDetailCardTab extends ClickableActionElement {
    public LocationDetailCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyLocationRiskDetailPanelSet_tb extends PCFElement {
    public PolicyLocationRiskDetailPanelSet_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}