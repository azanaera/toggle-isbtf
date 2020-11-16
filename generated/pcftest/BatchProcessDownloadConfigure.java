package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.BatchProcessDownloadConfigure.BatchProcessDownloadConfigureScreen;
import pcftest.BatchProcessDownloadConfigure.BatchProcessDownloadConfigureScreen.BackButton;
import pcftest.BatchProcessDownloadConfigure.BatchProcessDownloadConfigureScreen._msgs;
import pcftest.BatchProcessDownloadConfigure.BatchProcessDownloadConfigureScreen.download;
import pcftest.BatchProcessDownloadConfigure.BatchProcessDownloadConfigure_UpLink;
import pcftest.BatchProcessDownloadConfigure._Paging;
import pcftest.BatchProcessDownloadConfigure.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/BatchProcessDownloadConfigure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BatchProcessDownloadConfigure extends PCFLocation {
  public final static String CHECKSUM = "32f3632cf6c69f16ca4baf9e3977bad2";
  
  public BatchProcessDownloadConfigure(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("BatchProcessDownloadConfigure"));
  }
  
  public BatchProcessDownloadConfigureScreen getBatchProcessDownloadConfigureScreen() {
    return getOrCreateProperty("BatchProcessDownloadConfigureScreen", "BatchProcessDownloadConfigureScreen", null, pcftest.BatchProcessDownloadConfigure.BatchProcessDownloadConfigureScreen.class);
  }
  
  public BatchProcessDownloadConfigure_UpLink getBatchProcessDownloadConfigure_UpLink() {
    return getOrCreateProperty("BatchProcessDownloadConfigure_UpLink", "BatchProcessDownloadConfigure_UpLink", null, pcftest.BatchProcessDownloadConfigure.BatchProcessDownloadConfigure_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.BatchProcessDownloadConfigure._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.BatchProcessDownloadConfigure.__crumb__.class);
  }
  
  public BatchProcessInfo get_parent() {
    return getOrCreateProperty("_parent", pcftest.BatchProcessInfo.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/BatchProcessDownloadConfigure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BatchProcessDownloadConfigureScreen extends PCFElement {
    public BatchProcessDownloadConfigureScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BackButton getBackButton() {
      return getOrCreateProperty("BackButton", "BackButton", null, pcftest.BatchProcessDownloadConfigure.BatchProcessDownloadConfigureScreen.BackButton.class);
    }
    
    public DateElement getStartDate() {
      return getOrCreateProperty("StartDate", "StartDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getStopDate() {
      return getOrCreateProperty("StopDate", "StopDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.BatchProcessDownloadConfigure.BatchProcessDownloadConfigureScreen._msgs.class);
    }
    
    public download getdownload() {
      return getOrCreateProperty("download", "download", null, pcftest.BatchProcessDownloadConfigure.BatchProcessDownloadConfigureScreen.download.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/BatchProcessDownloadConfigure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BackButton extends ValueElement {
      public BackButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public BatchProcessInfo click() {
        return clickThis(pcftest.BatchProcessInfo.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/BatchProcessDownloadConfigure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/BatchProcessDownloadConfigure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class download extends ValueElement {
      public download(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/BatchProcessDownloadConfigure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BatchProcessDownloadConfigure_UpLink extends ClickableActionElement {
    public BatchProcessDownloadConfigure_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/BatchProcessDownloadConfigure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/BatchProcessDownloadConfigure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}