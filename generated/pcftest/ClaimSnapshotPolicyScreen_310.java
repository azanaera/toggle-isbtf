package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotPolicyScreen_310.ClaimSnapshotPolicyEndorsements310CardTab;
import pcftest.ClaimSnapshotPolicyScreen_310.ClaimSnapshotPolicyEndorsements310LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_310.ClaimSnapshotPolicyGeneral310CardTab;
import pcftest.ClaimSnapshotPolicyScreen_310.ClaimSnapshotPolicyLocations310LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_310.ClaimSnapshotPolicyLocations310ScreenTab;
import pcftest.ClaimSnapshotPolicyScreen_310.ClaimSnapshotPolicyStatCodes310CardTab;
import pcftest.ClaimSnapshotPolicyScreen_310.ClaimSnapshotPolicyStatCodes310LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_310.ClaimSnapshotPolicyVehicles310CardTab;
import pcftest.ClaimSnapshotPolicyScreen_310.ClaimSnapshotPolicyVehicles310LV_tb;
import pcftest.ClaimSnapshotPolicyScreen_310._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyScreen.310.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyScreen_310 extends ClaimSnapshotPolicyScreen {
  public final static String CHECKSUM = "45b5c356d3ee5aace1555b907f115433";
  
  public ClaimSnapshotPolicyScreen_310(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotPolicyEndorsements310CardTab getClaimSnapshotPolicyEndorsements310CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyEndorsements310CardTab", "ClaimSnapshotPolicyEndorsements310CardTab", null, pcftest.ClaimSnapshotPolicyScreen_310.ClaimSnapshotPolicyEndorsements310CardTab.class);
  }
  
  public ClaimSnapshotPolicyEndorsements310LV getClaimSnapshotPolicyEndorsements310LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyEndorsements310LV", "ClaimSnapshotPolicyEndorsements310LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyEndorsements310LV.class);
  }
  
  public ClaimSnapshotPolicyEndorsements310LV_tb getClaimSnapshotPolicyEndorsements310LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyEndorsements310LV_tb", "ClaimSnapshotPolicyEndorsements310LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_310.ClaimSnapshotPolicyEndorsements310LV_tb.class);
  }
  
  public ClaimSnapshotPolicyGeneral310CardTab getClaimSnapshotPolicyGeneral310CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyGeneral310CardTab", "ClaimSnapshotPolicyGeneral310CardTab", null, pcftest.ClaimSnapshotPolicyScreen_310.ClaimSnapshotPolicyGeneral310CardTab.class);
  }
  
  public ClaimSnapshotPolicyGeneral310DV getClaimSnapshotPolicyGeneral310DV() {
    return getOrCreateProperty("ClaimSnapshotPolicyGeneral310DV", "ClaimSnapshotPolicyGeneral310DV", null, pcftest.ClaimSnapshotPolicyGeneral310DV.class);
  }
  
  public ClaimSnapshotPolicyLocations310LV getClaimSnapshotPolicyLocations310LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocations310LV", "ClaimSnapshotPolicyLocations310LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyLocations310LV.class);
  }
  
  public ClaimSnapshotPolicyLocations310LV_tb getClaimSnapshotPolicyLocations310LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocations310LV_tb", "ClaimSnapshotPolicyLocations310LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_310.ClaimSnapshotPolicyLocations310LV_tb.class);
  }
  
  public ClaimSnapshotPolicyLocations310ScreenTab getClaimSnapshotPolicyLocations310ScreenTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyLocations310ScreenTab", "ClaimSnapshotPolicyLocations310ScreenTab", null, pcftest.ClaimSnapshotPolicyScreen_310.ClaimSnapshotPolicyLocations310ScreenTab.class);
  }
  
  public ClaimSnapshotPolicyStatCodes310CardTab getClaimSnapshotPolicyStatCodes310CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyStatCodes310CardTab", "ClaimSnapshotPolicyStatCodes310CardTab", null, pcftest.ClaimSnapshotPolicyScreen_310.ClaimSnapshotPolicyStatCodes310CardTab.class);
  }
  
  public ClaimSnapshotPolicyStatCodes310LV getClaimSnapshotPolicyStatCodes310LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyStatCodes310LV", "ClaimSnapshotPolicyStatCodes310LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyStatCodes310LV.class);
  }
  
  public ClaimSnapshotPolicyStatCodes310LV_tb getClaimSnapshotPolicyStatCodes310LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyStatCodes310LV_tb", "ClaimSnapshotPolicyStatCodes310LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_310.ClaimSnapshotPolicyStatCodes310LV_tb.class);
  }
  
  public ClaimSnapshotPolicyVehicles310CardTab getClaimSnapshotPolicyVehicles310CardTab() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehicles310CardTab", "ClaimSnapshotPolicyVehicles310CardTab", null, pcftest.ClaimSnapshotPolicyScreen_310.ClaimSnapshotPolicyVehicles310CardTab.class);
  }
  
  public ClaimSnapshotPolicyVehicles310LV getClaimSnapshotPolicyVehicles310LV() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehicles310LV", "ClaimSnapshotPolicyVehicles310LV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotPolicyVehicles310LV.class);
  }
  
  public ClaimSnapshotPolicyVehicles310LV_tb getClaimSnapshotPolicyVehicles310LV_tb() {
    return getOrCreateProperty("ClaimSnapshotPolicyVehicles310LV_tb", "ClaimSnapshotPolicyVehicles310LV_tb", null, pcftest.ClaimSnapshotPolicyScreen_310.ClaimSnapshotPolicyVehicles310LV_tb.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotPolicyScreen_310._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyScreen.310.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyEndorsements310CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyEndorsements310CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyScreen.310.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyEndorsements310LV_tb extends PCFElement {
    public ClaimSnapshotPolicyEndorsements310LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyScreen.310.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyGeneral310CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyGeneral310CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyScreen.310.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocations310LV_tb extends PCFElement {
    public ClaimSnapshotPolicyLocations310LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyScreen.310.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyLocations310ScreenTab extends ClickableActionElement {
    public ClaimSnapshotPolicyLocations310ScreenTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyScreen.310.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyStatCodes310CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyStatCodes310CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyScreen.310.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyStatCodes310LV_tb extends PCFElement {
    public ClaimSnapshotPolicyStatCodes310LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyScreen.310.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyVehicles310CardTab extends ClickableActionElement {
    public ClaimSnapshotPolicyVehicles310CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyScreen.310.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotPolicyVehicles310LV_tb extends PCFElement {
    public ClaimSnapshotPolicyVehicles310LV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyScreen.310.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}