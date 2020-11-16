package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotExtraFieldsScreen_310._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotExtraFieldsScreen.310.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExtraFieldsScreen_310 extends ClaimSnapshotExtraFieldsScreen {
  public final static String CHECKSUM = "ca7214452a96a695f1aa48386d057ce9";
  
  public ClaimSnapshotExtraFieldsScreen_310(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotExtraFieldsScreen_310._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotExtraFieldsScreen.310.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}