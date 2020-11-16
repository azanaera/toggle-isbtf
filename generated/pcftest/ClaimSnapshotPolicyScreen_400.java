package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotPolicyScreen_400.ClaimSnapshotPolicyEndorsements400CardTab;
import pcftest.ClaimSnapshotPolicyScreen_400.ClaimSnapshotPolicyEndorsements400LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_400.ClaimSnapshotPolicyGeneral400CardTab;
import pcftest.ClaimSnapshotPolicyScreen_400.ClaimSnapshotPolicyLocations400LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_400.ClaimSnapshotPolicyLocations400ScreenTab;
import pcftest.ClaimSnapshotPolicyScreen_400.ClaimSnapshotPolicyStatCodes400CardTab;
import pcftest.ClaimSnapshotPolicyScreen_400.ClaimSnapshotPolicyStatCodes400LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_400.ClaimSnapshotPolicyVehicles400CardTab;
import pcftest.ClaimSnapshotPolicyScreen_400.ClaimSnapshotPolicyVehicles400LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_400.PolicyPropertyCardTab;
import pcftest.ClaimSnapshotPolicyScreen_400.PolicyVehicleCardTab;
import pcftest.ClaimSnapshotPolicyScreen_400._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyScreen_400 extends ClaimSnapshotPolicyScreen {
  public final static String CHECKSUM = "bb7eb4d1c98b2592b97b6636699e3f81";
  
  public ClaimSnapshotPolicyScreen_400(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotPolicyEndorsements400CardTab getClaimSnapshotPolicyEndorsements400CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyEndorsements400CardTab", "ClaimSnapshotPolicyEndorsements400CardTab", null, pcftest.ClaimSnapshotPolicyScreen_400.ClaimSnapshotPolicyEndorsements400CardTab.class);
  }
  
  public ClaimSnapshotPolicyEndorsements400LV getClaimSnapshotPolicyEndorsements400LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyEndorsements400LV", "ClaimSnapshotPolicyEndorsements400LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyEndorsements400LV.class);
  }
  
  public ClaimSnapshotPolicyEndorsements400LV_tb getClaimSnapshotPolicyEndorsements400LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyEndorsements400LV_tb", "ClaimSnapshotPolicyEndorsements400LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_400.ClaimSnapshotPolicyEndorsements400LV_tb.class);
  }
  
  public ClaimSnapshotPolicyGeneral400CardTab getClaimSnapshotPolicyGeneral400CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyGeneral400CardTab", "ClaimSnapshotPolicyGeneral400CardTab", null, pcftest.ClaimSnapshotPolicyScreen_400.ClaimSnapshotPolicyGeneral400CardTab.class);
  }
  
  public ClaimSnapshotPolicyGeneral400DV getClaimSnapshotPolicyGeneral400DV() {
    return getOrCreateProperty("ClaimSnapshotPolicyGeneral400DV", "ClaimSnapshotPolicyGeneral400DV", null, pcftest.ClaimSnapshotPolicyGeneral400DV.class);
  }
  
  public ClaimSnapshotPolicyLocation400DV getClaimSnapshotPolicyLocation400DV() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocation400DV", "ClaimSnapshotPolicyLocation400DV", null, pcftest.ClaimSnapshotPolicyLocation400DV.class);
  }
  
  public ClaimSnapshotPolicyLocations400LV getClaimSnapshotPolicyLocations400LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocations400LV", "ClaimSnapshotPolicyLocations400LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyLocations400LV.class);
  }
  
  public ClaimSnapshotPolicyLocations400LV_tb getClaimSnapshotPolicyLocations400LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocations400LV_tb", "ClaimSnapshotPolicyLocations400LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_400.ClaimSnapshotPolicyLocations400LV_tb.class);
  }
  
  public ClaimSnapshotPolicyLocations400ScreenTab getClaimSnapshotPolicyLocations400ScreenTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocations400ScreenTab", "ClaimSnapshotPolicyLocations400ScreenTab", null, pcftest.ClaimSnapshotPolicyScreen_400.ClaimSnapshotPolicyLocations400ScreenTab.class);
  }
  
  public ClaimSnapshotPolicyStatCodes400CardTab getClaimSnapshotPolicyStatCodes400CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyStatCodes400CardTab", "ClaimSnapshotPolicyStatCodes400CardTab", null, pcftest.ClaimSnapshotPolicyScreen_400.ClaimSnapshotPolicyStatCodes400CardTab.class);
  }
  
  public ClaimSnapshotPolicyStatCodes400LV getClaimSnapshotPolicyStatCodes400LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyStatCodes400LV", "ClaimSnapshotPolicyStatCodes400LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyStatCodes400LV.class);
  }
  
  public ClaimSnapshotPolicyStatCodes400LV_tb getClaimSnapshotPolicyStatCodes400LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyStatCodes400LV_tb", "ClaimSnapshotPolicyStatCodes400LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_400.ClaimSnapshotPolicyStatCodes400LV_tb.class);
  }
  
  public ClaimSnapshotPolicyVehicle400DV getClaimSnapshotPolicyVehicle400DV() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehicle400DV", "ClaimSnapshotPolicyVehicle400DV", null, pcftest.ClaimSnapshotPolicyVehicle400DV.class);
  }
  
  public ClaimSnapshotPolicyVehicles400CardTab getClaimSnapshotPolicyVehicles400CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehicles400CardTab", "ClaimSnapshotPolicyVehicles400CardTab", null, pcftest.ClaimSnapshotPolicyScreen_400.ClaimSnapshotPolicyVehicles400CardTab.class);
  }
  
  public ClaimSnapshotPolicyVehicles400LV getClaimSnapshotPolicyVehicles400LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehicles400LV", "ClaimSnapshotPolicyVehicles400LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyVehicles400LV.class);
  }
  
  public ClaimSnapshotPolicyVehicles400LV_tb getClaimSnapshotPolicyVehicles400LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehicles400LV_tb", "ClaimSnapshotPolicyVehicles400LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_400.ClaimSnapshotPolicyVehicles400LV_tb.class);
  }
  
  public PolicyPropertyCardTab getPolicyPropertyCardTab() {
    return getOrCreateProperty("PolicyPropertyCardTab", "PolicyPropertyCardTab", null, pcftest.ClaimSnapshotPolicyScreen_400.PolicyPropertyCardTab.class);
  }
  
  public PolicyVehicleCardTab getPolicyVehicleCardTab() {
    return getOrCreateProperty("PolicyVehicleCardTab", "PolicyVehicleCardTab", null, pcftest.ClaimSnapshotPolicyScreen_400.PolicyVehicleCardTab.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotPolicyScreen_400._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyEndorsements400CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyEndorsements400CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyEndorsements400LV_tb extends PCFElement {
    public ClaimSnapshotPolicyEndorsements400LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyGeneral400CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyGeneral400CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocations400LV_tb extends PCFElement {
    public ClaimSnapshotPolicyLocations400LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocations400ScreenTab extends ClickableActionElement {
    public ClaimSnapshotPolicyLocations400ScreenTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyStatCodes400CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyStatCodes400CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyStatCodes400LV_tb extends PCFElement {
    public ClaimSnapshotPolicyStatCodes400LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyVehicles400CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyVehicles400CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyVehicles400LV_tb extends PCFElement {
    public ClaimSnapshotPolicyVehicles400LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyPropertyCardTab extends ClickableActionElement {
    public PolicyPropertyCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PolicyVehicleCardTab extends ClickableActionElement {
    public PolicyVehicleCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/400/ClaimSnapshotPolicyScreen.400.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}