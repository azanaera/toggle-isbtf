package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.DeleteSinglePayment.DeleteSinglePaymentScreen;
import pcftest.DeleteSinglePayment.DeleteSinglePaymentScreen.DeleteSinglePayment_CancelButton;
import pcftest.DeleteSinglePayment.DeleteSinglePaymentScreen.DeleteSinglePayment_DeleteButton;
import pcftest.DeleteSinglePayment.DeleteSinglePaymentScreen._msgs;
import pcftest.DeleteSinglePayment.DeleteSinglePayment_UpLink;
import pcftest.DeleteSinglePayment._Paging;
import pcftest.DeleteSinglePayment.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/DeleteSinglePayment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DeleteSinglePayment extends PCFLocation {
  public final static String CHECKSUM = "bacbd9ae34b97417a1588f69da77c112";
  
  public DeleteSinglePayment(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("DeleteSinglePayment"));
  }
  
  public DeleteSinglePaymentScreen getDeleteSinglePaymentScreen() {
    return getOrCreateProperty("DeleteSinglePaymentScreen", "DeleteSinglePaymentScreen", null, pcftest.DeleteSinglePayment.DeleteSinglePaymentScreen.class);
  }
  
  public DeleteSinglePayment_UpLink getDeleteSinglePayment_UpLink() {
    return getOrCreateProperty("DeleteSinglePayment_UpLink", "DeleteSinglePayment_UpLink", null, pcftest.DeleteSinglePayment.DeleteSinglePayment_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.DeleteSinglePayment._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.DeleteSinglePayment.__crumb__.class);
  }
  
  public ClaimFinancialsChecksDetail get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimFinancialsChecksDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/DeleteSinglePayment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeleteSinglePaymentScreen extends PCFElement {
    public DeleteSinglePaymentScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CheckDV getCheckDV() {
      return getOrCreateProperty("CheckDV", "CheckDV", null, pcftest.CheckDV.class);
    }
    
    public ValueElement getDeletePaymentWarningMessage() {
      return getOrCreateProperty("DeletePaymentWarningMessage", "DeletePaymentWarningMessage", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DeleteSinglePayment_CancelButton getDeleteSinglePayment_CancelButton() {
      return getOrCreateProperty("DeleteSinglePayment_CancelButton", "DeleteSinglePayment_CancelButton", null, pcftest.DeleteSinglePayment.DeleteSinglePaymentScreen.DeleteSinglePayment_CancelButton.class);
    }
    
    public DeleteSinglePayment_DeleteButton getDeleteSinglePayment_DeleteButton() {
      return getOrCreateProperty("DeleteSinglePayment_DeleteButton", "DeleteSinglePayment_DeleteButton", null, pcftest.DeleteSinglePayment.DeleteSinglePaymentScreen.DeleteSinglePayment_DeleteButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.DeleteSinglePayment.DeleteSinglePaymentScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/DeleteSinglePayment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DeleteSinglePayment_CancelButton extends ClickableActionElement {
      public DeleteSinglePayment_CancelButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimFinancialsTransactionsDetail click() {
        return clickThis(pcftest.ClaimFinancialsTransactionsDetail.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/DeleteSinglePayment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DeleteSinglePayment_DeleteButton extends ClickableActionElement {
      public DeleteSinglePayment_DeleteButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/DeleteSinglePayment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/DeleteSinglePayment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeleteSinglePayment_UpLink extends ClickableActionElement {
    public DeleteSinglePayment_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/DeleteSinglePayment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/DeleteSinglePayment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}