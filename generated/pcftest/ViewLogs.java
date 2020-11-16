package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ViewLogs.ViewLogsScreen;
import pcftest.ViewLogs.ViewLogsScreen.StreamLogs;
import pcftest.ViewLogs.ViewLogsScreen.ViewLogs2;
import pcftest.ViewLogs.ViewLogsScreen._msgs;
import pcftest.ViewLogs.ViewLogs_UpLink;
import pcftest.ViewLogs._Paging;
import pcftest.ViewLogs.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/ViewLogs.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ViewLogs extends PCFLocation {
  public final static String CHECKSUM = "ee23136c1efbb6ba7082b0d1c4cb6796";
  
  public ViewLogs(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ViewLogs"));
  }
  
  public ViewLogsScreen getViewLogsScreen() {
    return getOrCreateProperty("ViewLogsScreen", "ViewLogsScreen", null, pcftest.ViewLogs.ViewLogsScreen.class);
  }
  
  public ViewLogs_UpLink getViewLogs_UpLink() {
    return getOrCreateProperty("ViewLogs_UpLink", "ViewLogs_UpLink", null, pcftest.ViewLogs.ViewLogs_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ViewLogs._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ViewLogs.__crumb__.class);
  }
  
  public ServerTools get_parent() {
    return getOrCreateProperty("_parent", pcftest.ServerTools.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/ViewLogs.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ViewLogsScreen extends PCFElement {
    public ViewLogsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getLogDisplay() {
      return getOrCreateProperty("LogDisplay", "LogDisplay", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public SelectElement getLogFile() {
      return getOrCreateProperty("LogFile", "LogFile", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public ValueElement getLogFilter() {
      return getOrCreateProperty("LogFilter", "LogFilter", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMaxLines() {
      return getOrCreateProperty("MaxLines", "MaxLines", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public StreamLogs getStreamLogs() {
      return getOrCreateProperty("StreamLogs", "StreamLogs", null, pcftest.ViewLogs.ViewLogsScreen.StreamLogs.class);
    }
    
    public ViewLogs2 getViewLogs() {
      return getOrCreateProperty("ViewLogs", "ViewLogs", null, pcftest.ViewLogs.ViewLogsScreen.ViewLogs2.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ViewLogs.ViewLogsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/ViewLogs.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StreamLogs extends ValueElement {
      public StreamLogs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public LogViewer click() {
        return clickThis(pcftest.LogViewer.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/ViewLogs.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ViewLogs2 extends ValueElement {
      public ViewLogs2(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/ViewLogs.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/ViewLogs.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ViewLogs_UpLink extends ClickableActionElement {
    public ViewLogs_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/ViewLogs.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/ViewLogs.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}