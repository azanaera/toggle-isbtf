package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DesktopExposures.DesktopExposuresScreen;
import pcftest.DesktopExposures.DesktopExposuresScreen.DesktopExposures_AssignButton;
import pcftest.DesktopExposures.DesktopExposuresScreen.DesktopExposures_PrintButton;
import pcftest.DesktopExposures.DesktopExposuresScreen._msgs;
import pcftest.DesktopExposures.DesktopExposures_UpLink;
import pcftest.DesktopExposures._Paging;
import pcftest.DesktopExposures.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/desktop/exposures/DesktopExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DesktopExposures extends PCFLocation {
  public final static String CHECKSUM = "2f7b18caf4da0771effb8ee8ad71d1ef";
  
  public DesktopExposures(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DesktopExposures"));
  }
  
  public DesktopExposuresScreen getDesktopExposuresScreen() {
    return getOrCreateProperty("DesktopExposuresScreen", "DesktopExposuresScreen", null, pcftest.DesktopExposures.DesktopExposuresScreen.class);
  }
  
  public DesktopExposures_UpLink getDesktopExposures_UpLink() {
    return getOrCreateProperty("DesktopExposures_UpLink", "DesktopExposures_UpLink", null, pcftest.DesktopExposures.DesktopExposures_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DesktopExposures._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DesktopExposures.__crumb__.class);
  }
  
  public Desktop get_parent() {
    return getOrCreateProperty("_parent", pcftest.Desktop.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/exposures/DesktopExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopExposuresScreen extends PCFElement {
    public DesktopExposuresScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DesktopExposuresLV getDesktopExposuresLV() {
      return getOrCreateProperty("DesktopExposuresLV", "DesktopExposuresLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DesktopExposuresLV.class);
    }
    
    public DesktopExposures_AssignButton getDesktopExposures_AssignButton() {
      return getOrCreateProperty("DesktopExposures_AssignButton", "DesktopExposures_AssignButton", null, pcftest.DesktopExposures.DesktopExposuresScreen.DesktopExposures_AssignButton.class);
    }
    
    public DesktopExposures_PrintButton getDesktopExposures_PrintButton() {
      return getOrCreateProperty("DesktopExposures_PrintButton", "DesktopExposures_PrintButton", null, pcftest.DesktopExposures.DesktopExposuresScreen.DesktopExposures_PrintButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DesktopExposures.DesktopExposuresScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/exposures/DesktopExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DesktopExposures_AssignButton extends ClickableActionElement {
      public DesktopExposures_AssignButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/exposures/DesktopExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DesktopExposures_PrintButton extends ClickableActionElement {
      public DesktopExposures_PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/exposures/DesktopExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/desktop/exposures/DesktopExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopExposures_UpLink extends ClickableActionElement {
    public DesktopExposures_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/exposures/DesktopExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/exposures/DesktopExposures.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}