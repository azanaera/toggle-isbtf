package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotFixedPropertyIncidentScreen_default._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotFixedPropertyIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotFixedPropertyIncidentScreen_default extends ClaimSnapshotFixedPropertyIncidentScreen {
  public final static String CHECKSUM = "d33ab8e26358e8890824c248ce45475d";
  
  public ClaimSnapshotFixedPropertyIncidentScreen_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotFixedPropertyIncidentDV getClaimSnapshotFixedPropertyIncidentDV() {
    return getOrCreateProperty("ClaimSnapshotFixedPropertyIncidentDV", "ClaimSnapshotFixedPropertyIncidentDV", null, pcftest.ClaimSnapshotFixedPropertyIncidentDV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotFixedPropertyIncidentScreen_default._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotFixedPropertyIncidentScreen.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}