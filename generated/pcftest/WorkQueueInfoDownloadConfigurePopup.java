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
import pcftest.WorkQueueInfoDownloadConfigurePopup.WorkQueueInfoDownloadConfigurePopup_UpLink;
import pcftest.WorkQueueInfoDownloadConfigurePopup._Paging;
import pcftest.WorkQueueInfoDownloadConfigurePopup.__crumb__;
import pcftest.WorkQueueInfoDownloadConfigurePopup._msgs;
import pcftest.WorkQueueInfoDownloadConfigurePopup.download;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/WorkQueueInfoDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkQueueInfoDownloadConfigurePopup extends PCFLocation {
  public final static String CHECKSUM = "fdf367eb20fbc7549dffd54d1839bacc";
  
  public WorkQueueInfoDownloadConfigurePopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("WorkQueueInfoDownloadConfigurePopup"));
  }
  
  public WorkQueueInfoDownloadConfigurePopup_UpLink getWorkQueueInfoDownloadConfigurePopup_UpLink() {
    return getOrCreateProperty("WorkQueueInfoDownloadConfigurePopup_UpLink", "WorkQueueInfoDownloadConfigurePopup_UpLink", null, pcftest.WorkQueueInfoDownloadConfigurePopup.WorkQueueInfoDownloadConfigurePopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.WorkQueueInfoDownloadConfigurePopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.WorkQueueInfoDownloadConfigurePopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.WorkQueueInfoDownloadConfigurePopup._msgs.class);
  }
  
  public download getdownload() {
    return getOrCreateProperty("download", "download", null, pcftest.WorkQueueInfoDownloadConfigurePopup.download.class);
  }
  
  public ValueElement getmaxBatches() {
    return getOrCreateProperty("maxBatches", "maxBatches", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getmaxExecutors() {
    return getOrCreateProperty("maxExecutors", "maxExecutors", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getmaxHours() {
    return getOrCreateProperty("maxHours", "maxHours", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getmaxWriters() {
    return getOrCreateProperty("maxWriters", "maxWriters", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueInfoDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkQueueInfoDownloadConfigurePopup_UpLink extends ClickableActionElement {
    public WorkQueueInfoDownloadConfigurePopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueInfoDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueInfoDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueInfoDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueInfoDownloadConfigurePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class download extends ValueElement {
    public download(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}