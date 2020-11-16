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
import pcftest.RecodePayment.RecodePaymentScreen;
import pcftest.RecodePayment.RecodePaymentScreen.Add;
import pcftest.RecodePayment.RecodePaymentScreen.Cancel;
import pcftest.RecodePayment.RecodePaymentScreen.Edit;
import pcftest.RecodePayment.RecodePaymentScreen.RecodePayment_RecodeButton;
import pcftest.RecodePayment.RecodePaymentScreen.Remove;
import pcftest.RecodePayment.RecodePaymentScreen.Update;
import pcftest.RecodePayment.RecodePaymentScreen._msgs;
import pcftest.RecodePayment.RecodePayment_UpLink;
import pcftest.RecodePayment._Paging;
import pcftest.RecodePayment.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/RecodePayment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RecodePayment extends PCFLocation {
  public final static String CHECKSUM = "66305cf50fb301c2fe79c60774aa89cf";
  
  public RecodePayment(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("RecodePayment"));
  }
  
  public RecodePaymentScreen getRecodePaymentScreen() {
    return getOrCreateProperty("RecodePaymentScreen", "RecodePaymentScreen", null, pcftest.RecodePayment.RecodePaymentScreen.class);
  }
  
  public RecodePayment_UpLink getRecodePayment_UpLink() {
    return getOrCreateProperty("RecodePayment_UpLink", "RecodePayment_UpLink", null, pcftest.RecodePayment.RecodePayment_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.RecodePayment._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.RecodePayment.__crumb__.class);
  }
  
  public ClaimFinancialsTransactionsDetail get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimFinancialsTransactionsDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/RecodePayment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecodePaymentScreen extends PCFElement {
    public RecodePaymentScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.RecodePayment.RecodePaymentScreen.Add.class);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.RecodePayment.RecodePaymentScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.RecodePayment.RecodePaymentScreen.Edit.class);
    }
    
    public RecodePaymentPanelSet_multi getRecodePaymentPanelSet_multi() {
      return getOrCreateProperty("RecodePaymentPanelSet_multi", "RecodePaymentPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.RecodePaymentPanelSet_multi.class);
    }
    
    public RecodePaymentPanelSet_single getRecodePaymentPanelSet_single() {
      return getOrCreateProperty("RecodePaymentPanelSet_single", "RecodePaymentPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.RecodePaymentPanelSet_single.class);
    }
    
    public RecodePayment_RecodeButton getRecodePayment_RecodeButton() {
      return getOrCreateProperty("RecodePayment_RecodeButton", "RecodePayment_RecodeButton", null, pcftest.RecodePayment.RecodePaymentScreen.RecodePayment_RecodeButton.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.RecodePayment.RecodePaymentScreen.Remove.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.RecodePayment.RecodePaymentScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.RecodePayment.RecodePaymentScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/RecodePayment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/RecodePayment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/RecodePayment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/RecodePayment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RecodePayment_RecodeButton extends ClickableActionElement {
      public RecodePayment_RecodeButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/RecodePayment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/RecodePayment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/RecodePayment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/checks/RecodePayment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecodePayment_UpLink extends ClickableActionElement {
    public RecodePayment_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/RecodePayment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/RecodePayment.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}