package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CheckWizard_CheckPaymentsScreen.Add;
import pcftest.CheckWizard_CheckPaymentsScreen.LineItemsNotCopiedAlert;
import pcftest.CheckWizard_CheckPaymentsScreen.LineItemsNotCopiedAlert.CloseBtn;
import pcftest.CheckWizard_CheckPaymentsScreen.Remove;
import pcftest.CheckWizard_CheckPaymentsScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_CheckPaymentsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CheckWizard_CheckPaymentsScreen extends PCFElement {
  public final static String CHECKSUM = "5782210af97a9bb9d6f3fadd95476ba0";
  
  public CheckWizard_CheckPaymentsScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Add getAdd() {
    return getOrCreateProperty("Add", "Add", null, pcftest.CheckWizard_CheckPaymentsScreen.Add.class);
  }
  
  public LineItemsNotCopiedAlert getLineItemsNotCopiedAlert() {
    return getOrCreateProperty("LineItemsNotCopiedAlert", "LineItemsNotCopiedAlert", null, pcftest.CheckWizard_CheckPaymentsScreen.LineItemsNotCopiedAlert.class);
  }
  
  public NewCheckPaymentPanelSet_Multi getNewCheckPaymentPanelSet_Multi() {
    return getOrCreateProperty("NewCheckPaymentPanelSet_Multi", "NewCheckPaymentPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.NewCheckPaymentPanelSet_Multi.class);
  }
  
  public NewCheckPaymentPanelSet_Single getNewCheckPaymentPanelSet_Single() {
    return getOrCreateProperty("NewCheckPaymentPanelSet_Single", "NewCheckPaymentPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.NewCheckPaymentPanelSet_Single.class);
  }
  
  public Remove getRemove() {
    return getOrCreateProperty("Remove", "Remove", null, pcftest.CheckWizard_CheckPaymentsScreen.Remove.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CheckWizard_CheckPaymentsScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_CheckPaymentsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Add extends ClickableActionElement {
    public Add(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_CheckPaymentsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LineItemsNotCopiedAlert extends ClickableActionElement {
    public LineItemsNotCopiedAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.CheckWizard_CheckPaymentsScreen.LineItemsNotCopiedAlert.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_CheckPaymentsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_CheckPaymentsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Remove extends ClickableActionElement {
    public Remove(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/check/CheckWizard_CheckPaymentsScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}