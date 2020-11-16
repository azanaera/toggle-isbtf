package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClusterMembersDownloadConfigurePopup.ClusterMembersDownloadConfigurePopup_UpLink;
import pcftest.ClusterMembersDownloadConfigurePopup.CompleteDownload;
import pcftest.ClusterMembersDownloadConfigurePopup._Paging;
import pcftest.ClusterMembersDownloadConfigurePopup.__crumb__;
import pcftest.ClusterMembersDownloadConfigurePopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/cluster/ClusterMembersDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClusterMembersDownloadConfigurePopup extends PCFLocation {
  public final static String CHECKSUM = "b96773a89f5156fba497b7f970b26e11";
  
  public ClusterMembersDownloadConfigurePopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClusterMembersDownloadConfigurePopup"));
  }
  
  public ClusterMembersDownloadConfigurePopup_UpLink getClusterMembersDownloadConfigurePopup_UpLink() {
    return getOrCreateProperty("ClusterMembersDownloadConfigurePopup_UpLink", "ClusterMembersDownloadConfigurePopup_UpLink", null, pcftest.ClusterMembersDownloadConfigurePopup.ClusterMembersDownloadConfigurePopup_UpLink.class);
  }
  
  public CompleteDownload getCompleteDownload() {
    return getOrCreateProperty("CompleteDownload", "CompleteDownload", null, pcftest.ClusterMembersDownloadConfigurePopup.CompleteDownload.class);
  }
  
  public CheckboxValueElement getIncludeHistory() {
    return getOrCreateProperty("IncludeHistory", "IncludeHistory", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public ValueElement getMaxHistoryRecords() {
    return getOrCreateProperty("MaxHistoryRecords", "MaxHistoryRecords", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClusterMembersDownloadConfigurePopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClusterMembersDownloadConfigurePopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClusterMembersDownloadConfigurePopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembersDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClusterMembersDownloadConfigurePopup_UpLink extends ClickableActionElement {
    public ClusterMembersDownloadConfigurePopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembersDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CompleteDownload extends ValueElement {
    public CompleteDownload(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembersDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembersDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterMembersDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}