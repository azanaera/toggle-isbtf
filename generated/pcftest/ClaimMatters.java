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
import pcftest.ClaimMatters.ClaimMatterScreen;
import pcftest.ClaimMatters.ClaimMatterScreen.ClaimMatters_AssignButton;
import pcftest.ClaimMatters.ClaimMatterScreen.ClaimMatters_CalendarButton;
import pcftest.ClaimMatters.ClaimMatterScreen.ClaimMatters_CloseMatterButton;
import pcftest.ClaimMatters.ClaimMatterScreen.ClaimMatters_NewMatterButton;
import pcftest.ClaimMatters.ClaimMatterScreen.ClaimMatters_RefreshButton;
import pcftest.ClaimMatters.ClaimMatterScreen.ClaimMatters_SupervisorCalendarButton;
import pcftest.ClaimMatters.ClaimMatterScreen._msgs;
import pcftest.ClaimMatters.ClaimMatters_UpLink;
import pcftest.ClaimMatters._Paging;
import pcftest.ClaimMatters.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/litigation/ClaimMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimMatters extends PCFLocation {
  public final static String CHECKSUM = "2a175b5ed0d0c63817e4dc498a27bd07";
  
  public ClaimMatters(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimMatters"));
  }
  
  public ClaimMatterScreen getClaimMatterScreen() {
    return getOrCreateProperty("ClaimMatterScreen", "ClaimMatterScreen", null, pcftest.ClaimMatters.ClaimMatterScreen.class);
  }
  
  public ClaimMatters_UpLink getClaimMatters_UpLink() {
    return getOrCreateProperty("ClaimMatters_UpLink", "ClaimMatters_UpLink", null, pcftest.ClaimMatters.ClaimMatters_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimMatters._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimMatters.__crumb__.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/ClaimMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimMatterScreen extends PCFElement {
    public ClaimMatterScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimMatters_AssignButton getClaimMatters_AssignButton() {
      return getOrCreateProperty("ClaimMatters_AssignButton", "ClaimMatters_AssignButton", null, pcftest.ClaimMatters.ClaimMatterScreen.ClaimMatters_AssignButton.class);
    }
    
    public ClaimMatters_CalendarButton getClaimMatters_CalendarButton() {
      return getOrCreateProperty("ClaimMatters_CalendarButton", "ClaimMatters_CalendarButton", null, pcftest.ClaimMatters.ClaimMatterScreen.ClaimMatters_CalendarButton.class);
    }
    
    public ClaimMatters_CloseMatterButton getClaimMatters_CloseMatterButton() {
      return getOrCreateProperty("ClaimMatters_CloseMatterButton", "ClaimMatters_CloseMatterButton", null, pcftest.ClaimMatters.ClaimMatterScreen.ClaimMatters_CloseMatterButton.class);
    }
    
    public ClaimMatters_NewMatterButton getClaimMatters_NewMatterButton() {
      return getOrCreateProperty("ClaimMatters_NewMatterButton", "ClaimMatters_NewMatterButton", null, pcftest.ClaimMatters.ClaimMatterScreen.ClaimMatters_NewMatterButton.class);
    }
    
    public ClaimMatters_RefreshButton getClaimMatters_RefreshButton() {
      return getOrCreateProperty("ClaimMatters_RefreshButton", "ClaimMatters_RefreshButton", null, pcftest.ClaimMatters.ClaimMatterScreen.ClaimMatters_RefreshButton.class);
    }
    
    public ClaimMatters_SupervisorCalendarButton getClaimMatters_SupervisorCalendarButton() {
      return getOrCreateProperty("ClaimMatters_SupervisorCalendarButton", "ClaimMatters_SupervisorCalendarButton", null, pcftest.ClaimMatters.ClaimMatterScreen.ClaimMatters_SupervisorCalendarButton.class);
    }
    
    public MattersLV getMattersLV() {
      return getOrCreateProperty("MattersLV", "MattersLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.MattersLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimMatters.ClaimMatterScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/ClaimMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimMatters_AssignButton extends ClickableActionElement {
      public ClaimMatters_AssignButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/ClaimMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimMatters_CalendarButton extends ClickableActionElement {
      public ClaimMatters_CalendarButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimAllMattersCalendar click() {
        return clickThis(pcftest.ClaimAllMattersCalendar.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/ClaimMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimMatters_CloseMatterButton extends ClickableActionElement {
      public ClaimMatters_CloseMatterButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/ClaimMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimMatters_NewMatterButton extends ClickableActionElement {
      public ClaimMatters_NewMatterButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewMatter click() {
        return clickThis(pcftest.NewMatter.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/ClaimMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimMatters_RefreshButton extends ClickableActionElement {
      public ClaimMatters_RefreshButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/ClaimMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimMatters_SupervisorCalendarButton extends ClickableActionElement {
      public ClaimMatters_SupervisorCalendarButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public SupervisorClaimAllMattersCalendar click() {
        return clickThis(pcftest.SupervisorClaimAllMattersCalendar.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/litigation/ClaimMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/litigation/ClaimMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimMatters_UpLink extends ClickableActionElement {
    public ClaimMatters_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/ClaimMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/litigation/ClaimMatters.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}