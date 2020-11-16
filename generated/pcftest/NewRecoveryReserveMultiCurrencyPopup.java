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
import pcftest.NewRecoveryReserveMultiCurrencyPopup.NewRecoveryReserveMultiCurrencyPopupScreen;
import pcftest.NewRecoveryReserveMultiCurrencyPopup.NewRecoveryReserveMultiCurrencyPopupScreen.Cancel;
import pcftest.NewRecoveryReserveMultiCurrencyPopup.NewRecoveryReserveMultiCurrencyPopupScreen.Edit;
import pcftest.NewRecoveryReserveMultiCurrencyPopup.NewRecoveryReserveMultiCurrencyPopupScreen.EditableMultiCurrencyRecoveryReservesLV_tb;
import pcftest.NewRecoveryReserveMultiCurrencyPopup.NewRecoveryReserveMultiCurrencyPopupScreen.Update;
import pcftest.NewRecoveryReserveMultiCurrencyPopup.NewRecoveryReserveMultiCurrencyPopupScreen._msgs;
import pcftest.NewRecoveryReserveMultiCurrencyPopup.NewRecoveryReserveMultiCurrencyPopup_UpLink;
import pcftest.NewRecoveryReserveMultiCurrencyPopup._Paging;
import pcftest.NewRecoveryReserveMultiCurrencyPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/NewRecoveryReserveMultiCurrencyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewRecoveryReserveMultiCurrencyPopup extends PCFLocation {
  public final static String CHECKSUM = "1582f1c1047cdf0c6b2d130d1bc49118";
  
  public NewRecoveryReserveMultiCurrencyPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewRecoveryReserveMultiCurrencyPopup"));
  }
  
  public NewRecoveryReserveMultiCurrencyPopupScreen getNewRecoveryReserveMultiCurrencyPopupScreen() {
    return getOrCreateProperty("NewRecoveryReserveMultiCurrencyPopupScreen", "NewRecoveryReserveMultiCurrencyPopupScreen", null, pcftest.NewRecoveryReserveMultiCurrencyPopup.NewRecoveryReserveMultiCurrencyPopupScreen.class);
  }
  
  public NewRecoveryReserveMultiCurrencyPopup_UpLink getNewRecoveryReserveMultiCurrencyPopup_UpLink() {
    return getOrCreateProperty("NewRecoveryReserveMultiCurrencyPopup_UpLink", "NewRecoveryReserveMultiCurrencyPopup_UpLink", null, pcftest.NewRecoveryReserveMultiCurrencyPopup.NewRecoveryReserveMultiCurrencyPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewRecoveryReserveMultiCurrencyPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewRecoveryReserveMultiCurrencyPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/NewRecoveryReserveMultiCurrencyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewRecoveryReserveMultiCurrencyPopupScreen extends PCFElement {
    public NewRecoveryReserveMultiCurrencyPopupScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewRecoveryReserveMultiCurrencyPopup.NewRecoveryReserveMultiCurrencyPopupScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewRecoveryReserveMultiCurrencyPopup.NewRecoveryReserveMultiCurrencyPopupScreen.Edit.class);
    }
    
    public EditableMultiCurrencyRecoveryReservesLV getEditableMultiCurrencyRecoveryReservesLV() {
      return getOrCreateProperty("EditableMultiCurrencyRecoveryReservesLV", "EditableMultiCurrencyRecoveryReservesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableMultiCurrencyRecoveryReservesLV.class);
    }
    
    public EditableMultiCurrencyRecoveryReservesLV_tb getEditableMultiCurrencyRecoveryReservesLV_tb() {
      return getOrCreateProperty("EditableMultiCurrencyRecoveryReservesLV_tb", "EditableMultiCurrencyRecoveryReservesLV_tb", null, pcftest.NewRecoveryReserveMultiCurrencyPopup.NewRecoveryReserveMultiCurrencyPopupScreen.EditableMultiCurrencyRecoveryReservesLV_tb.class);
    }
    
    public TransactionEditWrapperExchangeRateInputSet getTransactionEditWrapperExchangeRateInputSet() {
      return getOrCreateProperty("TransactionEditWrapperExchangeRateInputSet", "TransactionEditWrapperExchangeRateInputSet", null, pcftest.TransactionEditWrapperExchangeRateInputSet.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewRecoveryReserveMultiCurrencyPopup.NewRecoveryReserveMultiCurrencyPopupScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewRecoveryReserveMultiCurrencyPopup.NewRecoveryReserveMultiCurrencyPopupScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/NewRecoveryReserveMultiCurrencyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/NewRecoveryReserveMultiCurrencyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/NewRecoveryReserveMultiCurrencyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableMultiCurrencyRecoveryReservesLV_tb extends PCFElement {
      public EditableMultiCurrencyRecoveryReservesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/NewRecoveryReserveMultiCurrencyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/NewRecoveryReserveMultiCurrencyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/NewRecoveryReserveMultiCurrencyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewRecoveryReserveMultiCurrencyPopup_UpLink extends ClickableActionElement {
    public NewRecoveryReserveMultiCurrencyPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/NewRecoveryReserveMultiCurrencyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/NewRecoveryReserveMultiCurrencyPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}