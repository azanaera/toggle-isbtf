package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClusterComponentsDownloadConfigurePopup.ClusterComponentsDownloadConfigurePopup_UpLink;
import pcftest.ClusterComponentsDownloadConfigurePopup._Paging;
import pcftest.ClusterComponentsDownloadConfigurePopup.__crumb__;
import pcftest.ClusterComponentsDownloadConfigurePopup._msgs;
import pcftest.ClusterComponentsDownloadConfigurePopup.download;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClusterComponentsDownloadConfigurePopup extends PCFLocation {
  public final static String CHECKSUM = "869d66f496742a66d5c2f83d163fb069";
  
  public ClusterComponentsDownloadConfigurePopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClusterComponentsDownloadConfigurePopup"));
  }
  
  public ClusterComponentsDownloadConfigurePopup_UpLink getClusterComponentsDownloadConfigurePopup_UpLink() {
    return getOrCreateProperty("ClusterComponentsDownloadConfigurePopup_UpLink", "ClusterComponentsDownloadConfigurePopup_UpLink", null, pcftest.ClusterComponentsDownloadConfigurePopup.ClusterComponentsDownloadConfigurePopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClusterComponentsDownloadConfigurePopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClusterComponentsDownloadConfigurePopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClusterComponentsDownloadConfigurePopup._msgs.class);
  }
  
  public download getdownload() {
    return getOrCreateProperty("download", "download", null, pcftest.ClusterComponentsDownloadConfigurePopup.download.class);
  }
  
  public ValueElement getmaxDays() {
    return getOrCreateProperty("maxDays", "maxDays", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClusterComponentsDownloadConfigurePopup_UpLink extends ClickableActionElement {
    public ClusterComponentsDownloadConfigurePopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/cluster/ClusterComponentsDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class download extends ValueElement {
    public download(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}