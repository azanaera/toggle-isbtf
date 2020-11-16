package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DesktopQueuedActivities.DesktopQueuedActivitiesScreen;
import pcftest.DesktopQueuedActivities.DesktopQueuedActivitiesScreen.DesktopQueuedActivities_AssignButton;
import pcftest.DesktopQueuedActivities.DesktopQueuedActivitiesScreen.DesktopQueuedActivities_AssignNextButton;
import pcftest.DesktopQueuedActivities.DesktopQueuedActivitiesScreen.DesktopQueuedActivities_AssignNextButton2;
import pcftest.DesktopQueuedActivities.DesktopQueuedActivitiesScreen.DesktopQueuedActivities_AssignSelectedButton;
import pcftest.DesktopQueuedActivities.DesktopQueuedActivitiesScreen.DesktopQueuedActivities_PrintButton;
import pcftest.DesktopQueuedActivities.DesktopQueuedActivitiesScreen.DesktopQueuedActivities_RefreshButton;
import pcftest.DesktopQueuedActivities.DesktopQueuedActivitiesScreen._msgs;
import pcftest.DesktopQueuedActivities.DesktopQueuedActivities_UpLink;
import pcftest.DesktopQueuedActivities._Paging;
import pcftest.DesktopQueuedActivities.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DesktopQueuedActivities extends PCFLocation {
  public final static String CHECKSUM = "e106f9fe731b435dc5d0f9a8b7128d04";
  
  public DesktopQueuedActivities(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DesktopQueuedActivities"));
  }
  
  public DesktopQueuedActivitiesScreen getDesktopQueuedActivitiesScreen() {
    return getOrCreateProperty("DesktopQueuedActivitiesScreen", "DesktopQueuedActivitiesScreen", null, pcftest.DesktopQueuedActivities.DesktopQueuedActivitiesScreen.class);
  }
  
  public DesktopQueuedActivities_UpLink getDesktopQueuedActivities_UpLink() {
    return getOrCreateProperty("DesktopQueuedActivities_UpLink", "DesktopQueuedActivities_UpLink", null, pcftest.DesktopQueuedActivities.DesktopQueuedActivities_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DesktopQueuedActivities._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DesktopQueuedActivities.__crumb__.class);
  }
  
  public Desktop get_parent() {
    return getOrCreateProperty("_parent", pcftest.Desktop.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopQueuedActivitiesScreen extends PCFElement {
    public DesktopQueuedActivitiesScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectElement getAvailableQueues() {
      return getOrCreateProperty("AvailableQueues", "AvailableQueues", null, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public DesktopQueuedActivitiesLV getDesktopQueuedActivitiesLV() {
      return getOrCreateProperty("DesktopQueuedActivitiesLV", "DesktopQueuedActivitiesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.DesktopQueuedActivitiesLV.class);
    }
    
    public DesktopQueuedActivities_AssignButton getDesktopQueuedActivities_AssignButton() {
      return getOrCreateProperty("DesktopQueuedActivities_AssignButton", "DesktopQueuedActivities_AssignButton", null, pcftest.DesktopQueuedActivities.DesktopQueuedActivitiesScreen.DesktopQueuedActivities_AssignButton.class);
    }
    
    public DesktopQueuedActivities_AssignNextButton getDesktopQueuedActivities_AssignNextButton() {
      return getOrCreateProperty("DesktopQueuedActivities_AssignNextButton", "DesktopQueuedActivities_AssignNextButton", null, pcftest.DesktopQueuedActivities.DesktopQueuedActivitiesScreen.DesktopQueuedActivities_AssignNextButton.class);
    }
    
    public DesktopQueuedActivities_AssignNextButton2 getDesktopQueuedActivities_AssignNextButton2() {
      return getOrCreateProperty("DesktopQueuedActivities_AssignNextButton2", "DesktopQueuedActivities_AssignNextButton2", null, pcftest.DesktopQueuedActivities.DesktopQueuedActivitiesScreen.DesktopQueuedActivities_AssignNextButton2.class);
    }
    
    public DesktopQueuedActivities_AssignSelectedButton getDesktopQueuedActivities_AssignSelectedButton() {
      return getOrCreateProperty("DesktopQueuedActivities_AssignSelectedButton", "DesktopQueuedActivities_AssignSelectedButton", null, pcftest.DesktopQueuedActivities.DesktopQueuedActivitiesScreen.DesktopQueuedActivities_AssignSelectedButton.class);
    }
    
    public DesktopQueuedActivities_PrintButton getDesktopQueuedActivities_PrintButton() {
      return getOrCreateProperty("DesktopQueuedActivities_PrintButton", "DesktopQueuedActivities_PrintButton", null, pcftest.DesktopQueuedActivities.DesktopQueuedActivitiesScreen.DesktopQueuedActivities_PrintButton.class);
    }
    
    public DesktopQueuedActivities_RefreshButton getDesktopQueuedActivities_RefreshButton() {
      return getOrCreateProperty("DesktopQueuedActivities_RefreshButton", "DesktopQueuedActivities_RefreshButton", null, pcftest.DesktopQueuedActivities.DesktopQueuedActivitiesScreen.DesktopQueuedActivities_RefreshButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DesktopQueuedActivities.DesktopQueuedActivitiesScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DesktopQueuedActivities_AssignButton extends ClickableActionElement {
      public DesktopQueuedActivities_AssignButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DesktopQueuedActivities_AssignNextButton extends ClickableActionElement {
      public DesktopQueuedActivities_AssignNextButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DesktopQueuedActivities_AssignNextButton2 extends ClickableActionElement {
      public DesktopQueuedActivities_AssignNextButton2(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DesktopQueuedActivities_AssignSelectedButton extends ClickableActionElement {
      public DesktopQueuedActivities_AssignSelectedButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DesktopQueuedActivities_PrintButton extends ClickableActionElement {
      public DesktopQueuedActivities_PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DesktopQueuedActivities_RefreshButton extends ClickableActionElement {
      public DesktopQueuedActivities_RefreshButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DesktopQueuedActivities_UpLink extends ClickableActionElement {
    public DesktopQueuedActivities_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/desktop/queues/DesktopQueuedActivities.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}