package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ManualCheckWizard_CheckPaymentsScreen.Add;
import pcftest.ManualCheckWizard_CheckPaymentsScreen.Remove;
import pcftest.ManualCheckWizard_CheckPaymentsScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/ManualCheckWizard_CheckPaymentsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ManualCheckWizard_CheckPaymentsScreen extends PCFElement {
  public final static String CHECKSUM = "06f925d1bd648c9dbe32b873d1aa031f";
  
  public ManualCheckWizard_CheckPaymentsScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Add getAdd() {
    return getOrCreateProperty("Add", "Add", null, pcftest.ManualCheckWizard_CheckPaymentsScreen.Add.class);
  }
  
  public NewCheckPaymentPanelSet_Multi getNewCheckPaymentPanelSet_Multi() {
    return getOrCreateProperty("NewCheckPaymentPanelSet_Multi", "NewCheckPaymentPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.NewCheckPaymentPanelSet_Multi.class);
  }
  
  public NewCheckPaymentPanelSet_Single getNewCheckPaymentPanelSet_Single() {
    return getOrCreateProperty("NewCheckPaymentPanelSet_Single", "NewCheckPaymentPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.NewCheckPaymentPanelSet_Single.class);
  }
  
  public Remove getRemove() {
    return getOrCreateProperty("Remove", "Remove", null, pcftest.ManualCheckWizard_CheckPaymentsScreen.Remove.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ManualCheckWizard_CheckPaymentsScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/ManualCheckWizard_CheckPaymentsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Add extends ClickableActionElement {
    public Add(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/ManualCheckWizard_CheckPaymentsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Remove extends ClickableActionElement {
    public Remove(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/ManualCheckWizard_CheckPaymentsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}