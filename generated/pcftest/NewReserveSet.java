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
import pcftest.NewReserveSet.NewReserveSetScreen;
import pcftest.NewReserveSet.NewReserveSetScreen.Add;
import pcftest.NewReserveSet.NewReserveSetScreen.Button_Reserve_LinkDocument;
import pcftest.NewReserveSet.NewReserveSetScreen.Cancel;
import pcftest.NewReserveSet.NewReserveSetScreen.Edit;
import pcftest.NewReserveSet.NewReserveSetScreen.IDCSDisabledAlert;
import pcftest.NewReserveSet.NewReserveSetScreen.IDCSUnavailableAlert;
import pcftest.NewReserveSet.NewReserveSetScreen.IDMSUnavailableAlert;
import pcftest.NewReserveSet.NewReserveSetScreen.NewReserveSet_ShowAllReservesButton;
import pcftest.NewReserveSet.NewReserveSetScreen.NewReserveSet_ShowGroupedReservesButton;
import pcftest.NewReserveSet.NewReserveSetScreen.Remove;
import pcftest.NewReserveSet.NewReserveSetScreen.Update;
import pcftest.NewReserveSet.NewReserveSetScreen._msgs;
import pcftest.NewReserveSet.NewReserveSet_UpLink;
import pcftest.NewReserveSet._Paging;
import pcftest.NewReserveSet.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewReserveSet extends PCFLocation {
  public final static String CHECKSUM = "a1f7a112e7ad076852c2c1042a706f34";
  
  public NewReserveSet(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewReserveSet"));
  }
  
  public NewReserveSetScreen getNewReserveSetScreen() {
    return getOrCreateProperty("NewReserveSetScreen", "NewReserveSetScreen", null, pcftest.NewReserveSet.NewReserveSetScreen.class);
  }
  
  public NewReserveSet_UpLink getNewReserveSet_UpLink() {
    return getOrCreateProperty("NewReserveSet_UpLink", "NewReserveSet_UpLink", null, pcftest.NewReserveSet.NewReserveSet_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewReserveSet._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewReserveSet.__crumb__.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewReserveSetScreen extends PCFElement {
    public NewReserveSetScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.NewReserveSet.NewReserveSetScreen.Add.class);
    }
    
    public Button_Reserve_LinkDocument getButton_Reserve_LinkDocument() {
      return getOrCreateProperty("Button_Reserve_LinkDocument", "Button_Reserve_LinkDocument", null, pcftest.NewReserveSet.NewReserveSetScreen.Button_Reserve_LinkDocument.class);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewReserveSet.NewReserveSetScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewReserveSet.NewReserveSetScreen.Edit.class);
    }
    
    public IDCSDisabledAlert getIDCSDisabledAlert() {
      return getOrCreateProperty("IDCSDisabledAlert", "IDCSDisabledAlert", null, pcftest.NewReserveSet.NewReserveSetScreen.IDCSDisabledAlert.class);
    }
    
    public IDCSUnavailableAlert getIDCSUnavailableAlert() {
      return getOrCreateProperty("IDCSUnavailableAlert", "IDCSUnavailableAlert", null, pcftest.NewReserveSet.NewReserveSetScreen.IDCSUnavailableAlert.class);
    }
    
    public IDMSUnavailableAlert getIDMSUnavailableAlert() {
      return getOrCreateProperty("IDMSUnavailableAlert", "IDMSUnavailableAlert", null, pcftest.NewReserveSet.NewReserveSetScreen.IDMSUnavailableAlert.class);
    }
    
    public NewReserveSet_ShowAllReservesButton getNewReserveSet_ShowAllReservesButton() {
      return getOrCreateProperty("NewReserveSet_ShowAllReservesButton", "NewReserveSet_ShowAllReservesButton", null, pcftest.NewReserveSet.NewReserveSetScreen.NewReserveSet_ShowAllReservesButton.class);
    }
    
    public NewReserveSet_ShowGroupedReservesButton getNewReserveSet_ShowGroupedReservesButton() {
      return getOrCreateProperty("NewReserveSet_ShowGroupedReservesButton", "NewReserveSet_ShowGroupedReservesButton", null, pcftest.NewReserveSet.NewReserveSetScreen.NewReserveSet_ShowGroupedReservesButton.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.NewReserveSet.NewReserveSetScreen.Remove.class);
    }
    
    public ReservesSummaryDV getReservesSummaryDV() {
      return getOrCreateProperty("ReservesSummaryDV", "ReservesSummaryDV", null, pcftest.ReservesSummaryDV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewReserveSet.NewReserveSetScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewReserveSet.NewReserveSetScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Button_Reserve_LinkDocument extends ClickableActionElement {
      public Button_Reserve_LinkDocument(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PickExistingDocumentPopup click() {
        return clickThis(pcftest.PickExistingDocumentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class IDCSDisabledAlert extends ClickableActionElement {
      public IDCSDisabledAlert(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.NewReserveSet.NewReserveSetScreen.IDCSDisabledAlert.CloseBtn getCloseBtn() {
        return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.NewReserveSet.NewReserveSetScreen.IDCSDisabledAlert.CloseBtn.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CloseBtn extends ClickableActionElement {
        public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class IDCSUnavailableAlert extends ClickableActionElement {
      public IDCSUnavailableAlert(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.NewReserveSet.NewReserveSetScreen.IDCSUnavailableAlert.CloseBtn getCloseBtn() {
        return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.NewReserveSet.NewReserveSetScreen.IDCSUnavailableAlert.CloseBtn.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CloseBtn extends ClickableActionElement {
        public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class IDMSUnavailableAlert extends ClickableActionElement {
      public IDMSUnavailableAlert(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.NewReserveSet.NewReserveSetScreen.IDMSUnavailableAlert.CloseBtn getCloseBtn() {
        return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.NewReserveSet.NewReserveSetScreen.IDMSUnavailableAlert.CloseBtn.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CloseBtn extends ClickableActionElement {
        public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewReserveSet_ShowAllReservesButton extends ClickableActionElement {
      public NewReserveSet_ShowAllReservesButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NewReserveSet_ShowGroupedReservesButton extends ClickableActionElement {
      public NewReserveSet_ShowGroupedReservesButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewReserveSet_UpLink extends ClickableActionElement {
    public NewReserveSet_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}