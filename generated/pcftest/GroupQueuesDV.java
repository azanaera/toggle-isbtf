package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.GroupQueuesDV.GroupQueuesLV_tb;
import pcftest.GroupQueuesDV.GroupQueuesLV_tb.Add;
import pcftest.GroupQueuesDV.GroupQueuesLV_tb.Remove;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/groups/GroupQueuesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupQueuesDV extends DetailViewElement {
  public final static String CHECKSUM = "710889371ae43d1f781e02730062b5a6";
  
  public GroupQueuesDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public GroupQueuesLV getGroupQueuesLV() {
    return getOrCreateProperty("GroupQueuesLV", "GroupQueuesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.GroupQueuesLV.class);
  }
  
  public GroupQueuesLV_tb getGroupQueuesLV_tb() {
    return getOrCreateProperty("GroupQueuesLV_tb", "GroupQueuesLV_tb", null, pcftest.GroupQueuesDV.GroupQueuesLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/GroupQueuesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupQueuesLV_tb extends PCFElement {
    public GroupQueuesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.GroupQueuesDV.GroupQueuesLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.GroupQueuesDV.GroupQueuesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/groups/GroupQueuesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/groups/GroupQueuesDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}