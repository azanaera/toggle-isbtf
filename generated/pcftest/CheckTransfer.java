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
import pcftest.CheckTransfer.CheckTransferScreen;
import pcftest.CheckTransfer.CheckTransferScreen.Cancel;
import pcftest.CheckTransfer.CheckTransferScreen.CheckTransfer_TransferButton;
import pcftest.CheckTransfer.CheckTransferScreen.Edit;
import pcftest.CheckTransfer.CheckTransferScreen.Update;
import pcftest.CheckTransfer.CheckTransferScreen._msgs;
import pcftest.CheckTransfer.CheckTransfer_UpLink;
import pcftest.CheckTransfer._Paging;
import pcftest.CheckTransfer.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/CheckTransfer.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckTransfer extends PCFLocation {
  public final static String CHECKSUM = "8ab8f90df7e0cc8b46d5d07ce538e86b";
  
  public CheckTransfer(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CheckTransfer"));
  }
  
  public CheckTransferScreen getCheckTransferScreen() {
    return getOrCreateProperty("CheckTransferScreen", "CheckTransferScreen", null, pcftest.CheckTransfer.CheckTransferScreen.class);
  }
  
  public CheckTransfer_UpLink getCheckTransfer_UpLink() {
    return getOrCreateProperty("CheckTransfer_UpLink", "CheckTransfer_UpLink", null, pcftest.CheckTransfer.CheckTransfer_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CheckTransfer._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CheckTransfer.__crumb__.class);
  }
  
  public ClaimFinancialsChecksDetail get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimFinancialsChecksDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckTransfer.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckTransferScreen extends PCFElement {
    public CheckTransferScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.CheckTransfer.CheckTransferScreen.Cancel.class);
    }
    
    public CheckTransferDV getCheckTransferDV() {
      return getOrCreateProperty("CheckTransferDV", "CheckTransferDV", null, pcftest.CheckTransferDV.class);
    }
    
    public CheckTransfer_TransferButton getCheckTransfer_TransferButton() {
      return getOrCreateProperty("CheckTransfer_TransferButton", "CheckTransfer_TransferButton", null, pcftest.CheckTransfer.CheckTransferScreen.CheckTransfer_TransferButton.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.CheckTransfer.CheckTransferScreen.Edit.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.CheckTransfer.CheckTransferScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CheckTransfer.CheckTransferScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/CheckTransfer.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/CheckTransfer.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CheckTransfer_TransferButton extends ClickableActionElement {
      public CheckTransfer_TransferButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/CheckTransfer.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/CheckTransfer.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/CheckTransfer.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckTransfer.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckTransfer_UpLink extends ClickableActionElement {
    public CheckTransfer_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckTransfer.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/CheckTransfer.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}