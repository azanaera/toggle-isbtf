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
import pcftest.DesktopSubrogations.DesktopSubrogationsScreen;
import pcftest.DesktopSubrogations.DesktopSubrogationsScreen.DesktopSubrogations_AssignButton;
import pcftest.DesktopSubrogations.DesktopSubrogationsScreen.DesktopSubrogations_PrintButton;
import pcftest.DesktopSubrogations.DesktopSubrogationsScreen._msgs;
import pcftest.DesktopSubrogations.DesktopSubrogations_UpLink;
import pcftest.DesktopSubrogations._Paging;
import pcftest.DesktopSubrogations.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/desktop/subrogations/DesktopSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DesktopSubrogations extends PCFLocation {
  public final static String CHECKSUM = "e720327e5c6eb3e2a65d6373424ee9b6";
  
  public DesktopSubrogations(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DesktopSubrogations"));
  }
  
  public DesktopSubrogationsScreen getDesktopSubrogationsScreen() {
    return getOrCreateProperty("DesktopSubrogationsScreen", "DesktopSubrogationsScreen", null, pcftest.DesktopSubrogations.DesktopSubrogationsScreen.class);
  }
  
  public DesktopSubrogations_UpLink getDesktopSubrogations_UpLink() {
    return getOrCreateProperty("DesktopSubrogations_UpLink", "DesktopSubrogations_UpLink", null, pcftest.DesktopSubrogations.DesktopSubrogations_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DesktopSubrogations._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DesktopSubrogations.__crumb__.class);
  }
  
  public Desktop get_parent() {
    return getOrCreateProperty("_parent", pcftest.Desktop.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/subrogations/DesktopSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopSubrogationsScreen extends PCFElement {
    public DesktopSubrogationsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DesktopSubrogations_AssignButton getDesktopSubrogations_AssignButton() {
      return getOrCreateProperty("DesktopSubrogations_AssignButton", "DesktopSubrogations_AssignButton", null, pcftest.DesktopSubrogations.DesktopSubrogationsScreen.DesktopSubrogations_AssignButton.class);
    }
    
    public DesktopSubrogations_PrintButton getDesktopSubrogations_PrintButton() {
      return getOrCreateProperty("DesktopSubrogations_PrintButton", "DesktopSubrogations_PrintButton", null, pcftest.DesktopSubrogations.DesktopSubrogationsScreen.DesktopSubrogations_PrintButton.class);
    }
    
    public SubrogationsLV getSubrogationsLV() {
      return getOrCreateProperty("SubrogationsLV", "SubrogationsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.SubrogationsLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DesktopSubrogations.DesktopSubrogationsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/subrogations/DesktopSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DesktopSubrogations_AssignButton extends ClickableActionElement {
      public DesktopSubrogations_AssignButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/subrogations/DesktopSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DesktopSubrogations_PrintButton extends ClickableActionElement {
      public DesktopSubrogations_PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/subrogations/DesktopSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/desktop/subrogations/DesktopSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopSubrogations_UpLink extends ClickableActionElement {
    public DesktopSubrogations_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/subrogations/DesktopSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/subrogations/DesktopSubrogations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}