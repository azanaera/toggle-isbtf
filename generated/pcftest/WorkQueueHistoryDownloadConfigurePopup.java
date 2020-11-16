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
import pcftest.WorkQueueHistoryDownloadConfigurePopup.NoHistoryText;
import pcftest.WorkQueueHistoryDownloadConfigurePopup.WorkQueueHistoryDownloadConfigurePopup_UpLink;
import pcftest.WorkQueueHistoryDownloadConfigurePopup._Paging;
import pcftest.WorkQueueHistoryDownloadConfigurePopup.__crumb__;
import pcftest.WorkQueueHistoryDownloadConfigurePopup._msgs;
import pcftest.WorkQueueHistoryDownloadConfigurePopup.download;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/WorkQueueHistoryDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkQueueHistoryDownloadConfigurePopup extends PCFLocation {
  public final static String CHECKSUM = "6e078cc24cf7ecfcf6efd56803415e98";
  
  public WorkQueueHistoryDownloadConfigurePopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("WorkQueueHistoryDownloadConfigurePopup"));
  }
  
  public DateElement getEndDate() {
    return getOrCreateProperty("EndDate", "EndDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public NoHistoryText getNoHistoryText() {
    return getOrCreateProperty("NoHistoryText", "NoHistoryText", null, pcftest.WorkQueueHistoryDownloadConfigurePopup.NoHistoryText.class);
  }
  
  public DateElement getStartDate() {
    return getOrCreateProperty("StartDate", "StartDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public WorkQueueHistoryDownloadConfigurePopup_UpLink getWorkQueueHistoryDownloadConfigurePopup_UpLink() {
    return getOrCreateProperty("WorkQueueHistoryDownloadConfigurePopup_UpLink", "WorkQueueHistoryDownloadConfigurePopup_UpLink", null, pcftest.WorkQueueHistoryDownloadConfigurePopup.WorkQueueHistoryDownloadConfigurePopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.WorkQueueHistoryDownloadConfigurePopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.WorkQueueHistoryDownloadConfigurePopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.WorkQueueHistoryDownloadConfigurePopup._msgs.class);
  }
  
  public download getdownload() {
    return getOrCreateProperty("download", "download", null, pcftest.WorkQueueHistoryDownloadConfigurePopup.download.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueHistoryDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NoHistoryText extends ValueElement {
    public NoHistoryText(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueHistoryDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkQueueHistoryDownloadConfigurePopup_UpLink extends ClickableActionElement {
    public WorkQueueHistoryDownloadConfigurePopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueHistoryDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueHistoryDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueHistoryDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueHistoryDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class download extends ValueElement {
    public download(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}