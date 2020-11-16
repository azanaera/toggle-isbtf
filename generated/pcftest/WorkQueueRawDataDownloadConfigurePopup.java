package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.WorkQueueRawDataDownloadConfigurePopup.WorkQueueRawDataDownloadConfigurePopup_UpLink;
import pcftest.WorkQueueRawDataDownloadConfigurePopup._Paging;
import pcftest.WorkQueueRawDataDownloadConfigurePopup.__crumb__;
import pcftest.WorkQueueRawDataDownloadConfigurePopup._msgs;
import pcftest.WorkQueueRawDataDownloadConfigurePopup.download;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/WorkQueueRawDataDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkQueueRawDataDownloadConfigurePopup extends PCFLocation {
  public final static String CHECKSUM = "6198f362a09ed8774ca020766f67f27a";
  
  public WorkQueueRawDataDownloadConfigurePopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("WorkQueueRawDataDownloadConfigurePopup"));
  }
  
  public DateElement getEndDate() {
    return getOrCreateProperty("EndDate", "EndDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getStartDate() {
    return getOrCreateProperty("StartDate", "StartDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public WorkQueueRawDataDownloadConfigurePopup_UpLink getWorkQueueRawDataDownloadConfigurePopup_UpLink() {
    return getOrCreateProperty("WorkQueueRawDataDownloadConfigurePopup_UpLink", "WorkQueueRawDataDownloadConfigurePopup_UpLink", null, pcftest.WorkQueueRawDataDownloadConfigurePopup.WorkQueueRawDataDownloadConfigurePopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.WorkQueueRawDataDownloadConfigurePopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.WorkQueueRawDataDownloadConfigurePopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.WorkQueueRawDataDownloadConfigurePopup._msgs.class);
  }
  
  public download getdownload() {
    return getOrCreateProperty("download", "download", null, pcftest.WorkQueueRawDataDownloadConfigurePopup.download.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueRawDataDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkQueueRawDataDownloadConfigurePopup_UpLink extends ClickableActionElement {
    public WorkQueueRawDataDownloadConfigurePopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueRawDataDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueRawDataDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueRawDataDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueRawDataDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class download extends ValueElement {
    public download(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}