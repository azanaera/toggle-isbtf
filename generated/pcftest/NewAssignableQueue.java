package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewAssignableQueue.NewAssignableQueue_UpLink;
import pcftest.NewAssignableQueue._Paging;
import pcftest.NewAssignableQueue.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/groups/NewAssignableQueue.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewAssignableQueue extends PCFLocation {
  public final static String CHECKSUM = "1176540eaba538130cc4ee5fb5fbc419";
  
  public NewAssignableQueue(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewAssignableQueue"));
  }
  
  public GroupDetail_QueueDetailScreen getGroupDetail_QueueDetailScreen() {
    return getOrCreateProperty("GroupDetail_QueueDetailScreen", "GroupDetail_QueueDetailScreen", null, pcftest.GroupDetail_QueueDetailScreen.class);
  }
  
  public NewAssignableQueue_UpLink getNewAssignableQueue_UpLink() {
    return getOrCreateProperty("NewAssignableQueue_UpLink", "NewAssignableQueue_UpLink", null, pcftest.NewAssignableQueue.NewAssignableQueue_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewAssignableQueue._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewAssignableQueue.__crumb__.class);
  }
  
  public GroupDetailPage get_parent() {
    return getOrCreateProperty("_parent", pcftest.GroupDetailPage.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/NewAssignableQueue.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewAssignableQueue_UpLink extends ClickableActionElement {
    public NewAssignableQueue_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/NewAssignableQueue.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/NewAssignableQueue.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}