package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CheckWizard_CheckInstructionsScreen.AmountDiffersFromInvoiceWarning;
import pcftest.CheckWizard_CheckInstructionsScreen.Button_Reserve_LinkDocument;
import pcftest.CheckWizard_CheckInstructionsScreen.DeductionsChangedWarning;
import pcftest.CheckWizard_CheckInstructionsScreen.IDCSDisabledAlert;
import pcftest.CheckWizard_CheckInstructionsScreen.IDCSUnavailableAlert;
import pcftest.CheckWizard_CheckInstructionsScreen.IDMSUnavailableAlert;
import pcftest.CheckWizard_CheckInstructionsScreen.InvoiceWithNoQuoteAlert;
import pcftest.CheckWizard_CheckInstructionsScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_CheckInstructionsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckWizard_CheckInstructionsScreen extends PCFElement {
  public final static String CHECKSUM = "f0663222f8aa9f6c684ae04002561f47";
  
  public CheckWizard_CheckInstructionsScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AmountDiffersFromInvoiceWarning getAmountDiffersFromInvoiceWarning() {
    return getOrCreateProperty("AmountDiffersFromInvoiceWarning", "AmountDiffersFromInvoiceWarning", null, pcftest.CheckWizard_CheckInstructionsScreen.AmountDiffersFromInvoiceWarning.class);
  }
  
  public Button_Reserve_LinkDocument getButton_Reserve_LinkDocument() {
    return getOrCreateProperty("Button_Reserve_LinkDocument", "Button_Reserve_LinkDocument", null, pcftest.CheckWizard_CheckInstructionsScreen.Button_Reserve_LinkDocument.class);
  }
  
  public DeductionsChangedWarning getDeductionsChangedWarning() {
    return getOrCreateProperty("DeductionsChangedWarning", "DeductionsChangedWarning", null, pcftest.CheckWizard_CheckInstructionsScreen.DeductionsChangedWarning.class);
  }
  
  public IDCSDisabledAlert getIDCSDisabledAlert() {
    return getOrCreateProperty("IDCSDisabledAlert", "IDCSDisabledAlert", null, pcftest.CheckWizard_CheckInstructionsScreen.IDCSDisabledAlert.class);
  }
  
  public IDCSUnavailableAlert getIDCSUnavailableAlert() {
    return getOrCreateProperty("IDCSUnavailableAlert", "IDCSUnavailableAlert", null, pcftest.CheckWizard_CheckInstructionsScreen.IDCSUnavailableAlert.class);
  }
  
  public IDMSUnavailableAlert getIDMSUnavailableAlert() {
    return getOrCreateProperty("IDMSUnavailableAlert", "IDMSUnavailableAlert", null, pcftest.CheckWizard_CheckInstructionsScreen.IDMSUnavailableAlert.class);
  }
  
  public InvoiceWithNoQuoteAlert getInvoiceWithNoQuoteAlert() {
    return getOrCreateProperty("InvoiceWithNoQuoteAlert", "InvoiceWithNoQuoteAlert", null, pcftest.CheckWizard_CheckInstructionsScreen.InvoiceWithNoQuoteAlert.class);
  }
  
  public NewPaymentInstructionsDV_default getNewPaymentInstructionsDV_default() {
    return getOrCreateProperty("NewPaymentInstructionsDV_default", "NewPaymentInstructionsDV", null, pcftest.NewPaymentInstructionsDV_default.class);
  }
  
  public NewPaymentInstructionsDV_single getNewPaymentInstructionsDV_single() {
    return getOrCreateProperty("NewPaymentInstructionsDV_single", "NewPaymentInstructionsDV", null, pcftest.NewPaymentInstructionsDV_single.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CheckWizard_CheckInstructionsScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_CheckInstructionsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AmountDiffersFromInvoiceWarning extends ClickableActionElement {
    public AmountDiffersFromInvoiceWarning(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_CheckInstructionsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Button_Reserve_LinkDocument extends ClickableActionElement {
    public Button_Reserve_LinkDocument(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PickExistingDocumentPopup click() {
      return clickThis(pcftest.PickExistingDocumentPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_CheckInstructionsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeductionsChangedWarning extends ValueElement {
    public DeductionsChangedWarning(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_CheckInstructionsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IDCSDisabledAlert extends ClickableActionElement {
    public IDCSDisabledAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.CheckWizard_CheckInstructionsScreen.IDCSDisabledAlert.CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.CheckWizard_CheckInstructionsScreen.IDCSDisabledAlert.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_CheckInstructionsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_CheckInstructionsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IDCSUnavailableAlert extends ClickableActionElement {
    public IDCSUnavailableAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.CheckWizard_CheckInstructionsScreen.IDCSUnavailableAlert.CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.CheckWizard_CheckInstructionsScreen.IDCSUnavailableAlert.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_CheckInstructionsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_CheckInstructionsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IDMSUnavailableAlert extends ClickableActionElement {
    public IDMSUnavailableAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.CheckWizard_CheckInstructionsScreen.IDMSUnavailableAlert.CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.CheckWizard_CheckInstructionsScreen.IDMSUnavailableAlert.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_CheckInstructionsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_CheckInstructionsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InvoiceWithNoQuoteAlert extends ClickableActionElement {
    public InvoiceWithNoQuoteAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_CheckInstructionsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}