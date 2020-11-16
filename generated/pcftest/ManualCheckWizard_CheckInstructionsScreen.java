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
import pcftest.ManualCheckWizard_CheckInstructionsScreen.Button_Reserve_LinkDocument;
import pcftest.ManualCheckWizard_CheckInstructionsScreen.DeductionsChangedWarning;
import pcftest.ManualCheckWizard_CheckInstructionsScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/ManualCheckWizard_CheckInstructionsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ManualCheckWizard_CheckInstructionsScreen extends PCFElement {
  public final static String CHECKSUM = "c0e095a217a724f210af8dc259f330d9";
  
  public ManualCheckWizard_CheckInstructionsScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Button_Reserve_LinkDocument getButton_Reserve_LinkDocument() {
    return getOrCreateProperty("Button_Reserve_LinkDocument", "Button_Reserve_LinkDocument", null, pcftest.ManualCheckWizard_CheckInstructionsScreen.Button_Reserve_LinkDocument.class);
  }
  
  public DeductionsChangedWarning getDeductionsChangedWarning() {
    return getOrCreateProperty("DeductionsChangedWarning", "DeductionsChangedWarning", null, pcftest.ManualCheckWizard_CheckInstructionsScreen.DeductionsChangedWarning.class);
  }
  
  public ManualCheckPaymentInstructionsDV getManualCheckPaymentInstructionsDV() {
    return getOrCreateProperty("ManualCheckPaymentInstructionsDV", "ManualCheckPaymentInstructionsDV", null, pcftest.ManualCheckPaymentInstructionsDV.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ManualCheckWizard_CheckInstructionsScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/ManualCheckWizard_CheckInstructionsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Button_Reserve_LinkDocument extends ClickableActionElement {
    public Button_Reserve_LinkDocument(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PickExistingDocumentPopup click() {
      return clickThis(pcftest.PickExistingDocumentPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/ManualCheckWizard_CheckInstructionsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeductionsChangedWarning extends ValueElement {
    public DeductionsChangedWarning(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/ManualCheckWizard_CheckInstructionsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}