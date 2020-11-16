package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotExtraFieldsScreen_300._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotExtraFieldsScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExtraFieldsScreen_300 extends ClaimSnapshotExtraFieldsScreen {
  public final static String CHECKSUM = "832bbd559870d290fb0564fcc86ebb3e";
  
  public ClaimSnapshotExtraFieldsScreen_300(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotExtraFieldsScreen_300._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotExtraFieldsScreen.300.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}