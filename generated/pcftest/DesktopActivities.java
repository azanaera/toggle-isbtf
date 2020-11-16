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
import pcftest.DesktopActivities.DesktopActivitiesScreen;
import pcftest.DesktopActivities.DesktopActivitiesScreen.DesktopActivities_ApproveButton;
import pcftest.DesktopActivities.DesktopActivitiesScreen.DesktopActivities_AssignButton;
import pcftest.DesktopActivities.DesktopActivitiesScreen.DesktopActivities_CompleteButton;
import pcftest.DesktopActivities.DesktopActivitiesScreen.DesktopActivities_PrintButton;
import pcftest.DesktopActivities.DesktopActivitiesScreen.DesktopActivities_RejectButton;
import pcftest.DesktopActivities.DesktopActivitiesScreen.DesktopActivities_SkipButton;
import pcftest.DesktopActivities.DesktopActivitiesScreen._msgs;
import pcftest.DesktopActivities.DesktopActivities_UpLink;
import pcftest.DesktopActivities._Paging;
import pcftest.DesktopActivities.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/desktop/activities/DesktopActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DesktopActivities extends PCFLocation {
  public final static String CHECKSUM = "d05c04f2c91c638b98968d430cd77625";
  
  public DesktopActivities(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DesktopActivities"));
  }
  
  public DesktopActivitiesScreen getDesktopActivitiesScreen() {
    return getOrCreateProperty("DesktopActivitiesScreen", "DesktopActivitiesScreen", null, pcftest.DesktopActivities.DesktopActivitiesScreen.class);
  }
  
  public DesktopActivities_UpLink getDesktopActivities_UpLink() {
    return getOrCreateProperty("DesktopActivities_UpLink", "DesktopActivities_UpLink", null, pcftest.DesktopActivities.DesktopActivities_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DesktopActivities._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DesktopActivities.__crumb__.class);
  }
  
  public Desktop get_parent() {
    return getOrCreateProperty("_parent", pcftest.Desktop.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/activities/DesktopActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopActivitiesScreen extends PCFElement {
    public DesktopActivitiesScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DesktopActivitiesLV getDesktopActivitiesLV() {
      return getOrCreateProperty("DesktopActivitiesLV", "DesktopActivitiesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DesktopActivitiesLV.class);
    }
    
    public DesktopActivities_ApproveButton getDesktopActivities_ApproveButton() {
      return getOrCreateProperty("DesktopActivities_ApproveButton", "DesktopActivities_ApproveButton", null, pcftest.DesktopActivities.DesktopActivitiesScreen.DesktopActivities_ApproveButton.class);
    }
    
    public DesktopActivities_AssignButton getDesktopActivities_AssignButton() {
      return getOrCreateProperty("DesktopActivities_AssignButton", "DesktopActivities_AssignButton", null, pcftest.DesktopActivities.DesktopActivitiesScreen.DesktopActivities_AssignButton.class);
    }
    
    public DesktopActivities_CompleteButton getDesktopActivities_CompleteButton() {
      return getOrCreateProperty("DesktopActivities_CompleteButton", "DesktopActivities_CompleteButton", null, pcftest.DesktopActivities.DesktopActivitiesScreen.DesktopActivities_CompleteButton.class);
    }
    
    public DesktopActivities_PrintButton getDesktopActivities_PrintButton() {
      return getOrCreateProperty("DesktopActivities_PrintButton", "DesktopActivities_PrintButton", null, pcftest.DesktopActivities.DesktopActivitiesScreen.DesktopActivities_PrintButton.class);
    }
    
    public DesktopActivities_RejectButton getDesktopActivities_RejectButton() {
      return getOrCreateProperty("DesktopActivities_RejectButton", "DesktopActivities_RejectButton", null, pcftest.DesktopActivities.DesktopActivitiesScreen.DesktopActivities_RejectButton.class);
    }
    
    public DesktopActivities_SkipButton getDesktopActivities_SkipButton() {
      return getOrCreateProperty("DesktopActivities_SkipButton", "DesktopActivities_SkipButton", null, pcftest.DesktopActivities.DesktopActivitiesScreen.DesktopActivities_SkipButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DesktopActivities.DesktopActivitiesScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/activities/DesktopActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DesktopActivities_ApproveButton extends ClickableActionElement {
      public DesktopActivities_ApproveButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/activities/DesktopActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DesktopActivities_AssignButton extends ClickableActionElement {
      public DesktopActivities_AssignButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/activities/DesktopActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DesktopActivities_CompleteButton extends ClickableActionElement {
      public DesktopActivities_CompleteButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/activities/DesktopActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DesktopActivities_PrintButton extends ClickableActionElement {
      public DesktopActivities_PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/activities/DesktopActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DesktopActivities_RejectButton extends ClickableActionElement {
      public DesktopActivities_RejectButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/activities/DesktopActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DesktopActivities_SkipButton extends ClickableActionElement {
      public DesktopActivities_SkipButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/activities/DesktopActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/desktop/activities/DesktopActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopActivities_UpLink extends ClickableActionElement {
    public DesktopActivities_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/activities/DesktopActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/activities/DesktopActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}