package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClusterComponentHistoryPopup.ClusterComponentHistoryPopup_UpLink;
import pcftest.ClusterComponentHistoryPopup.RefreshButton;
import pcftest.ClusterComponentHistoryPopup._Paging;
import pcftest.ClusterComponentHistoryPopup.__crumb__;
import pcftest.ClusterComponentHistoryPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentHistoryPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClusterComponentHistoryPopup extends PCFLocation {
  public final static String CHECKSUM = "0ec32891eebf0c14d3efc54f8094469a";
  
  public ClusterComponentHistoryPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClusterComponentHistoryPopup"));
  }
  
  public ClusterComponentHistoryPopup_UpLink getClusterComponentHistoryPopup_UpLink() {
    return getOrCreateProperty("ClusterComponentHistoryPopup_UpLink", "ClusterComponentHistoryPopup_UpLink", null, pcftest.ClusterComponentHistoryPopup.ClusterComponentHistoryPopup_UpLink.class);
  }
  
  public ClusterComponentsLV getClusterComponentsLV() {
    return getOrCreateProperty("ClusterComponentsLV", "ClusterComponentsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClusterComponentsLV.class);
  }
  
  public RefreshButton getRefreshButton() {
    return getOrCreateProperty("RefreshButton", "RefreshButton", null, pcftest.ClusterComponentHistoryPopup.RefreshButton.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClusterComponentHistoryPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClusterComponentHistoryPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClusterComponentHistoryPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentHistoryPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClusterComponentHistoryPopup_UpLink extends ClickableActionElement {
    public ClusterComponentHistoryPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentHistoryPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RefreshButton extends ClickableActionElement {
    public RefreshButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentHistoryPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentHistoryPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentHistoryPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}