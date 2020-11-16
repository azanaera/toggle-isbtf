package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PolicyLocationRiskDetailPanelSet.Add;
import pcftest.PolicyLocationRiskDetailPanelSet.AddLocationRisk;
import pcftest.PolicyLocationRiskDetailPanelSet.AddMiscLocationRisk;
import pcftest.PolicyLocationRiskDetailPanelSet.LocationCoveragesTab;
import pcftest.PolicyLocationRiskDetailPanelSet.Remove;
import pcftest.PolicyLocationRiskDetailPanelSet.RiskDetailTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationRiskDetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyLocationRiskDetailPanelSet extends PCFElement {
  public final static String CHECKSUM = "de43629f6569c29e01e64113d018dde6";
  
  public PolicyLocationRiskDetailPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Add getAdd() {
    return getOrCreateProperty("Add", "Add", null, pcftest.PolicyLocationRiskDetailPanelSet.Add.class);
  }
  
  public AddLocationRisk getAddLocationRisk() {
    return getOrCreateProperty("AddLocationRisk", "AddLocationRisk", null, pcftest.PolicyLocationRiskDetailPanelSet.AddLocationRisk.class);
  }
  
  public AddMiscLocationRisk getAddMiscLocationRisk() {
    return getOrCreateProperty("AddMiscLocationRisk", "AddMiscLocationRisk", null, pcftest.PolicyLocationRiskDetailPanelSet.AddMiscLocationRisk.class);
  }
  
  public LocationBasedRULV getLocationBasedRULV() {
    return getOrCreateProperty("LocationBasedRULV", "LocationBasedRULV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.LocationBasedRULV.class);
  }
  
  public LocationCoverageListDetail getLocationCoverageListDetail() {
    return getOrCreateProperty("LocationCoverageListDetail", "LocationCoverageListDetail", null, pcftest.LocationCoverageListDetail.class);
  }
  
  public LocationCoveragesTab getLocationCoveragesTab() {
    return getOrCreateProperty("LocationCoveragesTab", "LocationCoveragesTab", null, pcftest.PolicyLocationRiskDetailPanelSet.LocationCoveragesTab.class);
  }
  
  public PolicyLocationRUDetailsDV getPolicyLocationRUDetailsDV() {
    return getOrCreateProperty("PolicyLocationRUDetailsDV", "PolicyLocationRUDetailsDV", null, pcftest.PolicyLocationRUDetailsDV.class);
  }
  
  public Remove getRemove() {
    return getOrCreateProperty("Remove", "Remove", null, pcftest.PolicyLocationRiskDetailPanelSet.Remove.class);
  }
  
  public RiskDetailTab getRiskDetailTab() {
    return getOrCreateProperty("RiskDetailTab", "RiskDetailTab", null, pcftest.PolicyLocationRiskDetailPanelSet.RiskDetailTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationRiskDetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Add extends ClickableActionElement {
    public Add(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationRiskDetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddLocationRisk extends ClickableActionElement {
    public AddLocationRisk(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationRiskDetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddMiscLocationRisk extends ClickableActionElement {
    public AddMiscLocationRisk(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationRiskDetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationCoveragesTab extends ClickableActionElement {
    public LocationCoveragesTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationRiskDetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Remove extends ClickableActionElement {
    public Remove(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationRiskDetailPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RiskDetailTab extends ClickableActionElement {
    public RiskDetailTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}