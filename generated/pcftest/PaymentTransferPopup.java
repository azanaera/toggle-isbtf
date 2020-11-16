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
import pcftest.PaymentTransferPopup.PaymentTransferPopupScreen;
import pcftest.PaymentTransferPopup.PaymentTransferPopupScreen.Cancel;
import pcftest.PaymentTransferPopup.PaymentTransferPopupScreen.Edit;
import pcftest.PaymentTransferPopup.PaymentTransferPopupScreen.Update;
import pcftest.PaymentTransferPopup.PaymentTransferPopupScreen._msgs;
import pcftest.PaymentTransferPopup.PaymentTransferPopup_UpLink;
import pcftest.PaymentTransferPopup._Paging;
import pcftest.PaymentTransferPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/PaymentTransferPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PaymentTransferPopup extends PCFLocation {
  public final static String CHECKSUM = "5820b85c6e7a34f03507632e13accc66";
  
  public PaymentTransferPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("PaymentTransferPopup"));
  }
  
  public PaymentTransferPopupScreen getPaymentTransferPopupScreen() {
    return getOrCreateProperty("PaymentTransferPopupScreen", "PaymentTransferPopupScreen", null, pcftest.PaymentTransferPopup.PaymentTransferPopupScreen.class);
  }
  
  public PaymentTransferPopup_UpLink getPaymentTransferPopup_UpLink() {
    return getOrCreateProperty("PaymentTransferPopup_UpLink", "PaymentTransferPopup_UpLink", null, pcftest.PaymentTransferPopup.PaymentTransferPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.PaymentTransferPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.PaymentTransferPopup.__crumb__.class);
  }
  
  public CheckTransfer get_parent() {
    return getOrCreateProperty("_parent", pcftest.CheckTransfer.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/PaymentTransferPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PaymentTransferPopupScreen extends PCFElement {
    public PaymentTransferPopupScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.PaymentTransferPopup.PaymentTransferPopupScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.PaymentTransferPopup.PaymentTransferPopupScreen.Edit.class);
    }
    
    public PaymentTransferDV getPaymentTransferDV() {
      return getOrCreateProperty("PaymentTransferDV", "PaymentTransferDV", null, pcftest.PaymentTransferDV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.PaymentTransferPopup.PaymentTransferPopupScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.PaymentTransferPopup.PaymentTransferPopupScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/PaymentTransferPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/PaymentTransferPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/PaymentTransferPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/PaymentTransferPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/checks/PaymentTransferPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PaymentTransferPopup_UpLink extends ClickableActionElement {
    public PaymentTransferPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/PaymentTransferPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/PaymentTransferPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}