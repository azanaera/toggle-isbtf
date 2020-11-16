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
import pcftest.CheckWizard_PaymentDeductionsPagePopup.CheckWizard_AddPayeeScreen;
import pcftest.CheckWizard_PaymentDeductionsPagePopup.CheckWizard_AddPayeeScreen.Cancel;
import pcftest.CheckWizard_PaymentDeductionsPagePopup.CheckWizard_AddPayeeScreen.CheckWizard_PaymentDeductionsPagePopup_RecalculateButton;
import pcftest.CheckWizard_PaymentDeductionsPagePopup.CheckWizard_AddPayeeScreen.Edit;
import pcftest.CheckWizard_PaymentDeductionsPagePopup.CheckWizard_AddPayeeScreen.Update;
import pcftest.CheckWizard_PaymentDeductionsPagePopup.CheckWizard_AddPayeeScreen._msgs;
import pcftest.CheckWizard_PaymentDeductionsPagePopup.CheckWizard_PaymentDeductionsPagePopup_UpLink;
import pcftest.CheckWizard_PaymentDeductionsPagePopup._Paging;
import pcftest.CheckWizard_PaymentDeductionsPagePopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_PaymentDeductionsPagePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckWizard_PaymentDeductionsPagePopup extends PCFLocation {
  public final static String CHECKSUM = "127f936f77692b2711300d103377904c";
  
  public CheckWizard_PaymentDeductionsPagePopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CheckWizard_PaymentDeductionsPagePopup"));
  }
  
  public CheckWizard_AddPayeeScreen getCheckWizard_AddPayeeScreen() {
    return getOrCreateProperty("CheckWizard_AddPayeeScreen", "CheckWizard_AddPayeeScreen", null, pcftest.CheckWizard_PaymentDeductionsPagePopup.CheckWizard_AddPayeeScreen.class);
  }
  
  public CheckWizard_PaymentDeductionsPagePopup_UpLink getCheckWizard_PaymentDeductionsPagePopup_UpLink() {
    return getOrCreateProperty("CheckWizard_PaymentDeductionsPagePopup_UpLink", "CheckWizard_PaymentDeductionsPagePopup_UpLink", null, pcftest.CheckWizard_PaymentDeductionsPagePopup.CheckWizard_PaymentDeductionsPagePopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CheckWizard_PaymentDeductionsPagePopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CheckWizard_PaymentDeductionsPagePopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_PaymentDeductionsPagePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckWizard_AddPayeeScreen extends PCFElement {
    public CheckWizard_AddPayeeScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.CheckWizard_PaymentDeductionsPagePopup.CheckWizard_AddPayeeScreen.Cancel.class);
    }
    
    public CheckWizard_PaymentDeductionsPagePopup_RecalculateButton getCheckWizard_PaymentDeductionsPagePopup_RecalculateButton() {
      return getOrCreateProperty("CheckWizard_PaymentDeductionsPagePopup_RecalculateButton", "CheckWizard_PaymentDeductionsPagePopup_RecalculateButton", null, pcftest.CheckWizard_PaymentDeductionsPagePopup.CheckWizard_AddPayeeScreen.CheckWizard_PaymentDeductionsPagePopup_RecalculateButton.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.CheckWizard_PaymentDeductionsPagePopup.CheckWizard_AddPayeeScreen.Edit.class);
    }
    
    public PaymentDeductionsDV getPaymentDeductionsDV() {
      return getOrCreateProperty("PaymentDeductionsDV", "PaymentDeductionsDV", null, pcftest.PaymentDeductionsDV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.CheckWizard_PaymentDeductionsPagePopup.CheckWizard_AddPayeeScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CheckWizard_PaymentDeductionsPagePopup.CheckWizard_AddPayeeScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_PaymentDeductionsPagePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_PaymentDeductionsPagePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CheckWizard_PaymentDeductionsPagePopup_RecalculateButton extends ClickableActionElement {
      public CheckWizard_PaymentDeductionsPagePopup_RecalculateButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_PaymentDeductionsPagePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_PaymentDeductionsPagePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_PaymentDeductionsPagePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_PaymentDeductionsPagePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CheckWizard_PaymentDeductionsPagePopup_UpLink extends ClickableActionElement {
    public CheckWizard_PaymentDeductionsPagePopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_PaymentDeductionsPagePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_PaymentDeductionsPagePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}