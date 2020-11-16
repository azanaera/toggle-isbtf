package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.GroupSearchPickerScreen.GroupSearchPickerResultsLV_tb;
import pcftest.GroupSearchPickerScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/groupsearch/GroupSearchPickerScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupSearchPickerScreen extends PCFElement {
  public final static String CHECKSUM = "fccced2256e252e0ae7e7287784096f1";
  
  public GroupSearchPickerScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public GroupSearchDV getGroupSearchDV() {
    return getOrCreateProperty("GroupSearchDV", "GroupSearchDV", null, pcftest.GroupSearchDV.class);
  }
  
  public GroupSearchPickerResultsLV getGroupSearchPickerResultsLV() {
    return getOrCreateProperty("GroupSearchPickerResultsLV", "GroupSearchPickerResultsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.GroupSearchPickerResultsLV.class);
  }
  
  public GroupSearchPickerResultsLV_tb getGroupSearchPickerResultsLV_tb() {
    return getOrCreateProperty("GroupSearchPickerResultsLV_tb", "GroupSearchPickerResultsLV_tb", null, pcftest.GroupSearchPickerScreen.GroupSearchPickerResultsLV_tb.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.GroupSearchPickerScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/groupsearch/GroupSearchPickerScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupSearchPickerResultsLV_tb extends PCFElement {
    public GroupSearchPickerResultsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/groupsearch/GroupSearchPickerScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}