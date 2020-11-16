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
import pcftest.SetLogLevel.SetLogLevelScreen;
import pcftest.SetLogLevel.SetLogLevelScreen.SetLevel;
import pcftest.SetLogLevel.SetLogLevelScreen._msgs;
import pcftest.SetLogLevel.SetLogLevel_UpLink;
import pcftest.SetLogLevel._Paging;
import pcftest.SetLogLevel.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/SetLogLevel.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SetLogLevel extends PCFLocation {
  public final static String CHECKSUM = "a48c7b713383c0626fe1c89789273aa8";
  
  public SetLogLevel(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("SetLogLevel"));
  }
  
  public SetLogLevelScreen getSetLogLevelScreen() {
    return getOrCreateProperty("SetLogLevelScreen", "SetLogLevelScreen", null, pcftest.SetLogLevel.SetLogLevelScreen.class);
  }
  
  public SetLogLevel_UpLink getSetLogLevel_UpLink() {
    return getOrCreateProperty("SetLogLevel_UpLink", "SetLogLevel_UpLink", null, pcftest.SetLogLevel.SetLogLevel_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.SetLogLevel._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.SetLogLevel.__crumb__.class);
  }
  
  public ServerTools get_parent() {
    return getOrCreateProperty("_parent", pcftest.ServerTools.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/SetLogLevel.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SetLogLevelScreen extends PCFElement {
    public SetLogLevelScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getCurActualLevel() {
      return getOrCreateProperty("CurActualLevel", "CurActualLevel", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getCurConfigLevel() {
      return getOrCreateProperty("CurConfigLevel", "CurConfigLevel", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public SelectElement getLogger() {
      return getOrCreateProperty("Logger", "Logger", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public SelectElement getNewLevel() {
      return getOrCreateProperty("NewLevel", "NewLevel", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public SetLevel getSetLevel() {
      return getOrCreateProperty("SetLevel", "SetLevel", null, pcftest.SetLogLevel.SetLogLevelScreen.SetLevel.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.SetLogLevel.SetLogLevelScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/SetLogLevel.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SetLevel extends ValueElement {
      public SetLevel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/SetLogLevel.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/SetLogLevel.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SetLogLevel_UpLink extends ClickableActionElement {
    public SetLogLevel_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/SetLogLevel.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/SetLogLevel.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}