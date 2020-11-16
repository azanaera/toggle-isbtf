package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.StartupPageError.StartupPageErrorScreen;
import pcftest.StartupPageError.StartupPageErrorScreen.StartupPageErrorScreenDV;
import pcftest.StartupPageError.StartupPageErrorScreen._msgs;
import pcftest.StartupPageError.StartupPageError_UpLink;
import pcftest.StartupPageError._Paging;
import pcftest.StartupPageError.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/util/StartupPageError.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class StartupPageError extends PCFLocation {
  public final static String CHECKSUM = "bf518d3f64ed87f69392a9bf82a6fe32";
  
  public StartupPageError(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("StartupPageError"));
  }
  
  public StartupPageErrorScreen getStartupPageErrorScreen() {
    return getOrCreateProperty("StartupPageErrorScreen", "StartupPageErrorScreen", null, pcftest.StartupPageError.StartupPageErrorScreen.class);
  }
  
  public StartupPageError_UpLink getStartupPageError_UpLink() {
    return getOrCreateProperty("StartupPageError_UpLink", "StartupPageError_UpLink", null, pcftest.StartupPageError.StartupPageError_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.StartupPageError._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.StartupPageError.__crumb__.class);
  }
  
  public StartupPageErrorGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.StartupPageErrorGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/StartupPageError.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartupPageErrorScreen extends PCFElement {
    public StartupPageErrorScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public StartupPageErrorScreenDV getStartupPageErrorScreenDV() {
      return getOrCreateProperty("StartupPageErrorScreenDV", "StartupPageErrorScreenDV", null, pcftest.StartupPageError.StartupPageErrorScreen.StartupPageErrorScreenDV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.StartupPageError.StartupPageErrorScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/util/StartupPageError.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StartupPageErrorScreenDV extends DetailViewElement {
      public StartupPageErrorScreenDV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/util/StartupPageError.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/util/StartupPageError.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartupPageError_UpLink extends ClickableActionElement {
    public StartupPageError_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/StartupPageError.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/util/StartupPageError.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}