package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotPolicyScreen_300.ClaimSnapshotPolicyEndorsements300CardTab;
import pcftest.ClaimSnapshotPolicyScreen_300.ClaimSnapshotPolicyEndorsements300LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_300.ClaimSnapshotPolicyGeneral300CardTab;
import pcftest.ClaimSnapshotPolicyScreen_300.ClaimSnapshotPolicyLocations300LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_300.ClaimSnapshotPolicyLocations300ScreenTab;
import pcftest.ClaimSnapshotPolicyScreen_300.ClaimSnapshotPolicyStatCodes300CardTab;
import pcftest.ClaimSnapshotPolicyScreen_300.ClaimSnapshotPolicyStatCodes300LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_300.ClaimSnapshotPolicyVehicles300CardTab;
import pcftest.ClaimSnapshotPolicyScreen_300.ClaimSnapshotPolicyVehicles300LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_300._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotPolicyScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyScreen_300 extends ClaimSnapshotPolicyScreen {
  public final static String CHECKSUM = "02fec7758c11cb4a8d2e2f210086cac6";
  
  public ClaimSnapshotPolicyScreen_300(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotPolicyEndorsements300CardTab getClaimSnapshotPolicyEndorsements300CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyEndorsements300CardTab", "ClaimSnapshotPolicyEndorsements300CardTab", null, pcftest.ClaimSnapshotPolicyScreen_300.ClaimSnapshotPolicyEndorsements300CardTab.class);
  }
  
  public ClaimSnapshotPolicyEndorsements300LV getClaimSnapshotPolicyEndorsements300LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyEndorsements300LV", "ClaimSnapshotPolicyEndorsements300LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyEndorsements300LV.class);
  }
  
  public ClaimSnapshotPolicyEndorsements300LV_tb getClaimSnapshotPolicyEndorsements300LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyEndorsements300LV_tb", "ClaimSnapshotPolicyEndorsements300LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_300.ClaimSnapshotPolicyEndorsements300LV_tb.class);
  }
  
  public ClaimSnapshotPolicyGeneral300CardTab getClaimSnapshotPolicyGeneral300CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyGeneral300CardTab", "ClaimSnapshotPolicyGeneral300CardTab", null, pcftest.ClaimSnapshotPolicyScreen_300.ClaimSnapshotPolicyGeneral300CardTab.class);
  }
  
  public ClaimSnapshotPolicyGeneral300DV getClaimSnapshotPolicyGeneral300DV() {
    return getOrCreateProperty("ClaimSnapshotPolicyGeneral300DV", "ClaimSnapshotPolicyGeneral300DV", null, pcftest.ClaimSnapshotPolicyGeneral300DV.class);
  }
  
  public ClaimSnapshotPolicyLocations300LV getClaimSnapshotPolicyLocations300LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocations300LV", "ClaimSnapshotPolicyLocations300LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyLocations300LV.class);
  }
  
  public ClaimSnapshotPolicyLocations300LV_tb getClaimSnapshotPolicyLocations300LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocations300LV_tb", "ClaimSnapshotPolicyLocations300LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_300.ClaimSnapshotPolicyLocations300LV_tb.class);
  }
  
  public ClaimSnapshotPolicyLocations300ScreenTab getClaimSnapshotPolicyLocations300ScreenTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocations300ScreenTab", "ClaimSnapshotPolicyLocations300ScreenTab", null, pcftest.ClaimSnapshotPolicyScreen_300.ClaimSnapshotPolicyLocations300ScreenTab.class);
  }
  
  public ClaimSnapshotPolicyStatCodes300CardTab getClaimSnapshotPolicyStatCodes300CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyStatCodes300CardTab", "ClaimSnapshotPolicyStatCodes300CardTab", null, pcftest.ClaimSnapshotPolicyScreen_300.ClaimSnapshotPolicyStatCodes300CardTab.class);
  }
  
  public ClaimSnapshotPolicyStatCodes300LV getClaimSnapshotPolicyStatCodes300LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyStatCodes300LV", "ClaimSnapshotPolicyStatCodes300LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyStatCodes300LV.class);
  }
  
  public ClaimSnapshotPolicyStatCodes300LV_tb getClaimSnapshotPolicyStatCodes300LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyStatCodes300LV_tb", "ClaimSnapshotPolicyStatCodes300LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_300.ClaimSnapshotPolicyStatCodes300LV_tb.class);
  }
  
  public ClaimSnapshotPolicyVehicles300CardTab getClaimSnapshotPolicyVehicles300CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehicles300CardTab", "ClaimSnapshotPolicyVehicles300CardTab", null, pcftest.ClaimSnapshotPolicyScreen_300.ClaimSnapshotPolicyVehicles300CardTab.class);
  }
  
  public ClaimSnapshotPolicyVehicles300LV getClaimSnapshotPolicyVehicles300LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehicles300LV", "ClaimSnapshotPolicyVehicles300LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyVehicles300LV.class);
  }
  
  public ClaimSnapshotPolicyVehicles300LV_tb getClaimSnapshotPolicyVehicles300LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehicles300LV_tb", "ClaimSnapshotPolicyVehicles300LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_300.ClaimSnapshotPolicyVehicles300LV_tb.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotPolicyScreen_300._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotPolicyScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyEndorsements300CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyEndorsements300CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotPolicyScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyEndorsements300LV_tb extends PCFElement {
    public ClaimSnapshotPolicyEndorsements300LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotPolicyScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyGeneral300CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyGeneral300CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotPolicyScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocations300LV_tb extends PCFElement {
    public ClaimSnapshotPolicyLocations300LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotPolicyScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocations300ScreenTab extends ClickableActionElement {
    public ClaimSnapshotPolicyLocations300ScreenTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotPolicyScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyStatCodes300CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyStatCodes300CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotPolicyScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyStatCodes300LV_tb extends PCFElement {
    public ClaimSnapshotPolicyStatCodes300LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotPolicyScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyVehicles300CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyVehicles300CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotPolicyScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyVehicles300LV_tb extends PCFElement {
    public ClaimSnapshotPolicyVehicles300LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotPolicyScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}