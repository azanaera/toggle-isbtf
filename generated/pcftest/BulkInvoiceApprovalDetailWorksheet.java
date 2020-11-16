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
import pcftest.BulkInvoiceApprovalDetailWorksheet.ApprovalDetailScreen;
import pcftest.BulkInvoiceApprovalDetailWorksheet.ApprovalDetailScreen.BulkInvoiceApprovalDetailWorksheet_ApproveButton;
import pcftest.BulkInvoiceApprovalDetailWorksheet.ApprovalDetailScreen.BulkInvoiceApprovalDetailWorksheet_CancelButton;
import pcftest.BulkInvoiceApprovalDetailWorksheet.ApprovalDetailScreen.BulkInvoiceApprovalDetailWorksheet_RejectButton;
import pcftest.BulkInvoiceApprovalDetailWorksheet.ApprovalDetailScreen.Cancel;
import pcftest.BulkInvoiceApprovalDetailWorksheet.ApprovalDetailScreen.Edit;
import pcftest.BulkInvoiceApprovalDetailWorksheet.ApprovalDetailScreen.Update;
import pcftest.BulkInvoiceApprovalDetailWorksheet.ApprovalDetailScreen._msgs;
import pcftest.BulkInvoiceApprovalDetailWorksheet.BulkInvoiceApprovalDetailWorksheet_UpLink;
import pcftest.BulkInvoiceApprovalDetailWorksheet._Paging;
import pcftest.BulkInvoiceApprovalDetailWorksheet.__crumb__;
import pcftest.BulkInvoiceApprovalDetailWorksheet.wsTabBar;
import pcftest.BulkInvoiceApprovalDetailWorksheet.wsTabBar.wsTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BulkInvoiceApprovalDetailWorksheet extends PCFLocation {
  public final static String CHECKSUM = "74df57f3926b12bd7be9adddec2d748b";
  
  public BulkInvoiceApprovalDetailWorksheet(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("BulkInvoiceApprovalDetailWorksheet"));
  }
  
  public ApprovalDetailScreen getApprovalDetailScreen() {
    return getOrCreateProperty("ApprovalDetailScreen", "ApprovalDetailScreen", null, pcftest.BulkInvoiceApprovalDetailWorksheet.ApprovalDetailScreen.class);
  }
  
  public BulkInvoiceApprovalDetailWorksheet_UpLink getBulkInvoiceApprovalDetailWorksheet_UpLink() {
    return getOrCreateProperty("BulkInvoiceApprovalDetailWorksheet_UpLink", "BulkInvoiceApprovalDetailWorksheet_UpLink", null, pcftest.BulkInvoiceApprovalDetailWorksheet.BulkInvoiceApprovalDetailWorksheet_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.BulkInvoiceApprovalDetailWorksheet._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.BulkInvoiceApprovalDetailWorksheet.__crumb__.class);
  }
  
  public wsTabBar getwsTabBar() {
    return getOrCreateProperty("wsTabBar", pcftest.BulkInvoiceApprovalDetailWorksheet.wsTabBar.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ApprovalDetailScreen extends PCFElement {
    public ApprovalDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BulkInvoiceApprovalDetailDV getBulkInvoiceApprovalDetailDV() {
      return getOrCreateProperty("BulkInvoiceApprovalDetailDV", "BulkInvoiceApprovalDetailDV", null, pcftest.BulkInvoiceApprovalDetailDV.class);
    }
    
    public BulkInvoiceApprovalDetailWorksheet_ApproveButton getBulkInvoiceApprovalDetailWorksheet_ApproveButton() {
      return getOrCreateProperty("BulkInvoiceApprovalDetailWorksheet_ApproveButton", "BulkInvoiceApprovalDetailWorksheet_ApproveButton", null, pcftest.BulkInvoiceApprovalDetailWorksheet.ApprovalDetailScreen.BulkInvoiceApprovalDetailWorksheet_ApproveButton.class);
    }
    
    public BulkInvoiceApprovalDetailWorksheet_CancelButton getBulkInvoiceApprovalDetailWorksheet_CancelButton() {
      return getOrCreateProperty("BulkInvoiceApprovalDetailWorksheet_CancelButton", "BulkInvoiceApprovalDetailWorksheet_CancelButton", null, pcftest.BulkInvoiceApprovalDetailWorksheet.ApprovalDetailScreen.BulkInvoiceApprovalDetailWorksheet_CancelButton.class);
    }
    
    public BulkInvoiceApprovalDetailWorksheet_RejectButton getBulkInvoiceApprovalDetailWorksheet_RejectButton() {
      return getOrCreateProperty("BulkInvoiceApprovalDetailWorksheet_RejectButton", "BulkInvoiceApprovalDetailWorksheet_RejectButton", null, pcftest.BulkInvoiceApprovalDetailWorksheet.ApprovalDetailScreen.BulkInvoiceApprovalDetailWorksheet_RejectButton.class);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.BulkInvoiceApprovalDetailWorksheet.ApprovalDetailScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.BulkInvoiceApprovalDetailWorksheet.ApprovalDetailScreen.Edit.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.BulkInvoiceApprovalDetailWorksheet.ApprovalDetailScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.BulkInvoiceApprovalDetailWorksheet.ApprovalDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BulkInvoiceApprovalDetailWorksheet_ApproveButton extends ClickableActionElement {
      public BulkInvoiceApprovalDetailWorksheet_ApproveButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BulkInvoiceApprovalDetailWorksheet_CancelButton extends ClickableActionElement {
      public BulkInvoiceApprovalDetailWorksheet_CancelButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BulkInvoiceApprovalDetailWorksheet_RejectButton extends ClickableActionElement {
      public BulkInvoiceApprovalDetailWorksheet_RejectButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkInvoiceApprovalDetailWorksheet_UpLink extends ClickableActionElement {
    public BulkInvoiceApprovalDetailWorksheet_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class wsTabBar extends WorksheetTabBarElement {
    public wsTabBar(ISmokeTest helper)  {
      super(helper, new gw.smoketest.platform.web.PCFElementId("wsTabBar"));
    }
    
    public wsTab getwsTab() {
      return getOrCreateProperty("wsTab", "wsTab", null, pcftest.BulkInvoiceApprovalDetailWorksheet.wsTabBar.wsTab.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/BulkInvoiceApprovalDetailWorksheet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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