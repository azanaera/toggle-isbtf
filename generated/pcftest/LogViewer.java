package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.LogViewer.LogViewer_UpLink;
import pcftest.LogViewer._Paging;
import pcftest.LogViewer.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/LogViewer.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LogViewer extends PCFLocation {
  public final static String CHECKSUM = "9443378d13f2102a1b7bf35ecbdb896f";
  
  public LogViewer(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("LogViewer"));
  }
  
  public LogViewer_UpLink getLogViewer_UpLink() {
    return getOrCreateProperty("LogViewer_UpLink", "LogViewer_UpLink", null, pcftest.LogViewer.LogViewer_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.LogViewer._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.LogViewer.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/LogViewer.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LogViewer_UpLink extends ClickableActionElement {
    public LogViewer_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/LogViewer.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/LogViewer.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}