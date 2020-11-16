package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.smoketest.platform.web.WorksheetTabBarElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ApprovalDetailWorksheet.ApprovalDetailScreen;
import pcftest.ApprovalDetailWorksheet.ApprovalDetailScreen.ApprovalDetailWorksheet_ApproveButton;
import pcftest.ApprovalDetailWorksheet.ApprovalDetailScreen.ApprovalDetailWorksheet_CancelButton;
import pcftest.ApprovalDetailWorksheet.ApprovalDetailScreen.ApprovalDetailWorksheet_RejectButton;
import pcftest.ApprovalDetailWorksheet.ApprovalDetailScreen.ApprovalDetailWorksheet_ViewAllReservesButton;
import pcftest.ApprovalDetailWorksheet.ApprovalDetailScreen.ApprovalDetailWorksheet_ViewCheckButton;
import pcftest.ApprovalDetailWorksheet.ApprovalDetailScreen.ApprovalDetailWorksheet_ViewReserveRequestButton;
import pcftest.ApprovalDetailWorksheet.ApprovalDetailScreen._msgs;
import pcftest.ApprovalDetailWorksheet.ApprovalDetailWorksheet_UpLink;
import pcftest.ApprovalDetailWorksheet._Paging;
import pcftest.ApprovalDetailWorksheet.__crumb__;
import pcftest.ApprovalDetailWorksheet.wsTabBar;
import pcftest.ApprovalDetailWorksheet.wsTabBar.wsTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ApprovalDetailWorksheet extends PCFLocation {
  public final static String CHECKSUM = "5e866855f8b69b9524e0785fb1d1055d";
  
  public ApprovalDetailWorksheet(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ApprovalDetailWorksheet"));
  }
  
  public ApprovalDetailScreen getApprovalDetailScreen() {
    return getOrCreateProperty("ApprovalDetailScreen", "ApprovalDetailScreen", null, pcftest.ApprovalDetailWorksheet.ApprovalDetailScreen.class);
  }
  
  public ApprovalDetailWorksheet_UpLink getApprovalDetailWorksheet_UpLink() {
    return getOrCreateProperty("ApprovalDetailWorksheet_UpLink", "ApprovalDetailWorksheet_UpLink", null, pcftest.ApprovalDetailWorksheet.ApprovalDetailWorksheet_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ApprovalDetailWorksheet._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ApprovalDetailWorksheet.__crumb__.class);
  }
  
  public wsTabBar getwsTabBar() {
    return getOrCreateProperty("wsTabBar", pcftest.ApprovalDetailWorksheet.wsTabBar.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApprovalDetailScreen extends PCFElement {
    public ApprovalDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ApprovalDetailDV_CheckSet getApprovalDetailDV_CheckSet() {
      return getOrCreateProperty("ApprovalDetailDV_CheckSet", "ApprovalDetailDV", null, pcftest.ApprovalDetailDV_CheckSet.class);
    }
    
    public ApprovalDetailDV_RecoveryReserveSet getApprovalDetailDV_RecoveryReserveSet() {
      return getOrCreateProperty("ApprovalDetailDV_RecoveryReserveSet", "ApprovalDetailDV", null, pcftest.ApprovalDetailDV_RecoveryReserveSet.class);
    }
    
    public ApprovalDetailDV_RecoverySet getApprovalDetailDV_RecoverySet() {
      return getOrCreateProperty("ApprovalDetailDV_RecoverySet", "ApprovalDetailDV", null, pcftest.ApprovalDetailDV_RecoverySet.class);
    }
    
    public ApprovalDetailDV_ReserveSet getApprovalDetailDV_ReserveSet() {
      return getOrCreateProperty("ApprovalDetailDV_ReserveSet", "ApprovalDetailDV", null, pcftest.ApprovalDetailDV_ReserveSet.class);
    }
    
    public ApprovalDetailWorksheet_ApproveButton getApprovalDetailWorksheet_ApproveButton() {
      return getOrCreateProperty("ApprovalDetailWorksheet_ApproveButton", "ApprovalDetailWorksheet_ApproveButton", null, pcftest.ApprovalDetailWorksheet.ApprovalDetailScreen.ApprovalDetailWorksheet_ApproveButton.class);
    }
    
    public ApprovalDetailWorksheet_CancelButton getApprovalDetailWorksheet_CancelButton() {
      return getOrCreateProperty("ApprovalDetailWorksheet_CancelButton", "ApprovalDetailWorksheet_CancelButton", null, pcftest.ApprovalDetailWorksheet.ApprovalDetailScreen.ApprovalDetailWorksheet_CancelButton.class);
    }
    
    public ApprovalDetailWorksheet_RejectButton getApprovalDetailWorksheet_RejectButton() {
      return getOrCreateProperty("ApprovalDetailWorksheet_RejectButton", "ApprovalDetailWorksheet_RejectButton", null, pcftest.ApprovalDetailWorksheet.ApprovalDetailScreen.ApprovalDetailWorksheet_RejectButton.class);
    }
    
    public ApprovalDetailWorksheet_ViewAllReservesButton getApprovalDetailWorksheet_ViewAllReservesButton() {
      return getOrCreateProperty("ApprovalDetailWorksheet_ViewAllReservesButton", "ApprovalDetailWorksheet_ViewAllReservesButton", null, pcftest.ApprovalDetailWorksheet.ApprovalDetailScreen.ApprovalDetailWorksheet_ViewAllReservesButton.class);
    }
    
    public ApprovalDetailWorksheet_ViewCheckButton getApprovalDetailWorksheet_ViewCheckButton() {
      return getOrCreateProperty("ApprovalDetailWorksheet_ViewCheckButton", "ApprovalDetailWorksheet_ViewCheckButton", null, pcftest.ApprovalDetailWorksheet.ApprovalDetailScreen.ApprovalDetailWorksheet_ViewCheckButton.class);
    }
    
    public ApprovalDetailWorksheet_ViewReserveRequestButton getApprovalDetailWorksheet_ViewReserveRequestButton() {
      return getOrCreateProperty("ApprovalDetailWorksheet_ViewReserveRequestButton", "ApprovalDetailWorksheet_ViewReserveRequestButton", null, pcftest.ApprovalDetailWorksheet.ApprovalDetailScreen.ApprovalDetailWorksheet_ViewReserveRequestButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ApprovalDetailWorksheet.ApprovalDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ApprovalDetailWorksheet_ApproveButton extends ClickableActionElement {
      public ApprovalDetailWorksheet_ApproveButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ApprovalDetailWorksheet_CancelButton extends ClickableActionElement {
      public ApprovalDetailWorksheet_CancelButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ApprovalDetailWorksheet_RejectButton extends ClickableActionElement {
      public ApprovalDetailWorksheet_RejectButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ApprovalDetailWorksheet_ViewAllReservesButton extends ClickableActionElement {
      public ApprovalDetailWorksheet_ViewAllReservesButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ApprovalDetailWorksheet_ViewCheckButton extends ClickableActionElement {
      public ApprovalDetailWorksheet_ViewCheckButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ApprovalDetailWorksheet_ViewReserveRequestButton extends ClickableActionElement {
      public ApprovalDetailWorksheet_ViewReserveRequestButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApprovalDetailWorksheet_UpLink extends ClickableActionElement {
    public ApprovalDetailWorksheet_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class wsTabBar extends WorksheetTabBarElement {
    public wsTabBar(ISmokeTest helper)  {
      super(helper, new gw.smoketest.platform.web.PCFElementId("wsTabBar"));
    }
    
    public wsTab getwsTab() {
      return getOrCreateProperty("wsTab", "wsTab", null, pcftest.ApprovalDetailWorksheet.wsTabBar.wsTab.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/ApprovalDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class wsTab extends ClickableActionElement {
      public wsTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}