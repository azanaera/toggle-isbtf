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
import pcftest.NewReserveMultiCurrencyPopup.NewReserveMultiCurrencyPopupScreen;
import pcftest.NewReserveMultiCurrencyPopup.NewReserveMultiCurrencyPopupScreen.Cancel;
import pcftest.NewReserveMultiCurrencyPopup.NewReserveMultiCurrencyPopupScreen.Edit;
import pcftest.NewReserveMultiCurrencyPopup.NewReserveMultiCurrencyPopupScreen.EditableMultiCurrencyReservesLV_tb;
import pcftest.NewReserveMultiCurrencyPopup.NewReserveMultiCurrencyPopupScreen.Update;
import pcftest.NewReserveMultiCurrencyPopup.NewReserveMultiCurrencyPopupScreen._msgs;
import pcftest.NewReserveMultiCurrencyPopup.NewReserveMultiCurrencyPopup_UpLink;
import pcftest.NewReserveMultiCurrencyPopup._Paging;
import pcftest.NewReserveMultiCurrencyPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveMultiCurrencyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewReserveMultiCurrencyPopup extends PCFLocation {
  public final static String CHECKSUM = "c1114eeaa13fc327c1dfd3632738ca7a";
  
  public NewReserveMultiCurrencyPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewReserveMultiCurrencyPopup"));
  }
  
  public NewReserveMultiCurrencyPopupScreen getNewReserveMultiCurrencyPopupScreen() {
    return getOrCreateProperty("NewReserveMultiCurrencyPopupScreen", "NewReserveMultiCurrencyPopupScreen", null, pcftest.NewReserveMultiCurrencyPopup.NewReserveMultiCurrencyPopupScreen.class);
  }
  
  public NewReserveMultiCurrencyPopup_UpLink getNewReserveMultiCurrencyPopup_UpLink() {
    return getOrCreateProperty("NewReserveMultiCurrencyPopup_UpLink", "NewReserveMultiCurrencyPopup_UpLink", null, pcftest.NewReserveMultiCurrencyPopup.NewReserveMultiCurrencyPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewReserveMultiCurrencyPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewReserveMultiCurrencyPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveMultiCurrencyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewReserveMultiCurrencyPopupScreen extends PCFElement {
    public NewReserveMultiCurrencyPopupScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewReserveMultiCurrencyPopup.NewReserveMultiCurrencyPopupScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewReserveMultiCurrencyPopup.NewReserveMultiCurrencyPopupScreen.Edit.class);
    }
    
    public EditableMultiCurrencyReservesLV getEditableMultiCurrencyReservesLV() {
      return getOrCreateProperty("EditableMultiCurrencyReservesLV", "EditableMultiCurrencyReservesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableMultiCurrencyReservesLV.class);
    }
    
    public EditableMultiCurrencyReservesLV_tb getEditableMultiCurrencyReservesLV_tb() {
      return getOrCreateProperty("EditableMultiCurrencyReservesLV_tb", "EditableMultiCurrencyReservesLV_tb", null, pcftest.NewReserveMultiCurrencyPopup.NewReserveMultiCurrencyPopupScreen.EditableMultiCurrencyReservesLV_tb.class);
    }
    
    public TransactionEditWrapperExchangeRateInputSet getTransactionEditWrapperExchangeRateInputSet() {
      return getOrCreateProperty("TransactionEditWrapperExchangeRateInputSet", "TransactionEditWrapperExchangeRateInputSet", null, pcftest.TransactionEditWrapperExchangeRateInputSet.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewReserveMultiCurrencyPopup.NewReserveMultiCurrencyPopupScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewReserveMultiCurrencyPopup.NewReserveMultiCurrencyPopupScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveMultiCurrencyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveMultiCurrencyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveMultiCurrencyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableMultiCurrencyReservesLV_tb extends PCFElement {
      public EditableMultiCurrencyReservesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveMultiCurrencyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveMultiCurrencyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveMultiCurrencyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewReserveMultiCurrencyPopup_UpLink extends ClickableActionElement {
    public NewReserveMultiCurrencyPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveMultiCurrencyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/reserve/NewReserveMultiCurrencyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}