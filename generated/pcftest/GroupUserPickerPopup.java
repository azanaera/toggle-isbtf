package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.GroupUserPickerPopup.GroupUserPickerPopup_UpLink;
import pcftest.GroupUserPickerPopup.GroupUserPickerScreen;
import pcftest.GroupUserPickerPopup.GroupUserPickerScreen.GroupUserLV_tb;
import pcftest.GroupUserPickerPopup.GroupUserPickerScreen._msgs;
import pcftest.GroupUserPickerPopup._Paging;
import pcftest.GroupUserPickerPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/assignment/GroupUserPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupUserPickerPopup extends PCFLocation {
  public final static String CHECKSUM = "e595e89c9d068b670c1dd6b494b8dd60";
  
  public GroupUserPickerPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("GroupUserPickerPopup"));
  }
  
  public GroupUserPickerPopup_UpLink getGroupUserPickerPopup_UpLink() {
    return getOrCreateProperty("GroupUserPickerPopup_UpLink", "GroupUserPickerPopup_UpLink", null, pcftest.GroupUserPickerPopup.GroupUserPickerPopup_UpLink.class);
  }
  
  public GroupUserPickerScreen getGroupUserPickerScreen() {
    return getOrCreateProperty("GroupUserPickerScreen", "GroupUserPickerScreen", null, pcftest.GroupUserPickerPopup.GroupUserPickerScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.GroupUserPickerPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.GroupUserPickerPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/assignment/GroupUserPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupUserPickerPopup_UpLink extends ClickableActionElement {
    public GroupUserPickerPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/assignment/GroupUserPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupUserPickerScreen extends PCFElement {
    public GroupUserPickerScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public GroupUserLV getGroupUserLV() {
      return getOrCreateProperty("GroupUserLV", "GroupUserLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.GroupUserLV.class);
    }
    
    public GroupUserLV_tb getGroupUserLV_tb() {
      return getOrCreateProperty("GroupUserLV_tb", "GroupUserLV_tb", null, pcftest.GroupUserPickerPopup.GroupUserPickerScreen.GroupUserLV_tb.class);
    }
    
    public GroupUserSearchDV getGroupUserSearchDV() {
      return getOrCreateProperty("GroupUserSearchDV", "GroupUserSearchDV", null, pcftest.GroupUserSearchDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.GroupUserPickerPopup.GroupUserPickerScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/assignment/GroupUserPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class GroupUserLV_tb extends PCFElement {
      public GroupUserLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/assignment/GroupUserPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/assignment/GroupUserPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/assignment/GroupUserPickerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}