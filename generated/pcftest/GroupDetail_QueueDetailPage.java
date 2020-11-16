package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.GroupDetail_QueueDetailPage.GroupDetail_QueueDetailPage_UpLink;
import pcftest.GroupDetail_QueueDetailPage._Paging;
import pcftest.GroupDetail_QueueDetailPage.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/groups/GroupDetail_QueueDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GroupDetail_QueueDetailPage extends PCFLocation {
  public final static String CHECKSUM = "4a1fc8b104beead6bf4586c5f9cee72b";
  
  public GroupDetail_QueueDetailPage(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("GroupDetail_QueueDetailPage"));
  }
  
  public GroupDetail_QueueDetailPage_UpLink getGroupDetail_QueueDetailPage_UpLink() {
    return getOrCreateProperty("GroupDetail_QueueDetailPage_UpLink", "GroupDetail_QueueDetailPage_UpLink", null, pcftest.GroupDetail_QueueDetailPage.GroupDetail_QueueDetailPage_UpLink.class);
  }
  
  public GroupDetail_QueueDetailScreen getGroupDetail_QueueDetailScreen() {
    return getOrCreateProperty("GroupDetail_QueueDetailScreen", "GroupDetail_QueueDetailScreen", null, pcftest.GroupDetail_QueueDetailScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.GroupDetail_QueueDetailPage._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.GroupDetail_QueueDetailPage.__crumb__.class);
  }
  
  public GroupDetailPage get_parent() {
    return getOrCreateProperty("_parent", pcftest.GroupDetailPage.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/GroupDetail_QueueDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class GroupDetail_QueueDetailPage_UpLink extends ClickableActionElement {
    public GroupDetail_QueueDetailPage_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/GroupDetail_QueueDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/groups/GroupDetail_QueueDetailPage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}