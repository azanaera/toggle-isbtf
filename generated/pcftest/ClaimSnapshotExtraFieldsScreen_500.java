package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotExtraFieldsScreen_500._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotExtraFieldsScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExtraFieldsScreen_500 extends ClaimSnapshotExtraFieldsScreen {
  public final static String CHECKSUM = "2a6cdb108262ec2ba16697b5f4b7def1";
  
  public ClaimSnapshotExtraFieldsScreen_500(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotExtraFieldsScreen_500._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/500/ClaimSnapshotExtraFieldsScreen.500.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}