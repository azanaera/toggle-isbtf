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
import pcftest.VoidStopCheck.VoidStopCheckScreen;
import pcftest.VoidStopCheck.VoidStopCheckScreen.Cancel;
import pcftest.VoidStopCheck.VoidStopCheckScreen.Edit;
import pcftest.VoidStopCheck.VoidStopCheckScreen.Update;
import pcftest.VoidStopCheck.VoidStopCheckScreen.VoidStopCheck_StopButton;
import pcftest.VoidStopCheck.VoidStopCheckScreen.VoidStopCheck_VoidButton;
import pcftest.VoidStopCheck.VoidStopCheckScreen._msgs;
import pcftest.VoidStopCheck.VoidStopCheck_UpLink;
import pcftest.VoidStopCheck._Paging;
import pcftest.VoidStopCheck.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheck.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class VoidStopCheck extends PCFLocation {
  public final static String CHECKSUM = "f18386dc437a47b430206969d86332b3";
  
  public VoidStopCheck(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("VoidStopCheck"));
  }
  
  public VoidStopCheckScreen getVoidStopCheckScreen() {
    return getOrCreateProperty("VoidStopCheckScreen", "VoidStopCheckScreen", null, pcftest.VoidStopCheck.VoidStopCheckScreen.class);
  }
  
  public VoidStopCheck_UpLink getVoidStopCheck_UpLink() {
    return getOrCreateProperty("VoidStopCheck_UpLink", "VoidStopCheck_UpLink", null, pcftest.VoidStopCheck.VoidStopCheck_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.VoidStopCheck._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.VoidStopCheck.__crumb__.class);
  }
  
  public ClaimFinancialsChecksDetail get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimFinancialsChecksDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheck.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VoidStopCheckScreen extends PCFElement {
    public VoidStopCheckScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.VoidStopCheck.VoidStopCheckScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.VoidStopCheck.VoidStopCheckScreen.Edit.class);
    }
    
    public ValueElement getLinkedServiceRequestInvoicesMessage() {
      return getOrCreateProperty("LinkedServiceRequestInvoicesMessage", "LinkedServiceRequestInvoicesMessage", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.VoidStopCheck.VoidStopCheckScreen.Update.class);
    }
    
    public VoidStopCheckDV getVoidStopCheckDV() {
      return getOrCreateProperty("VoidStopCheckDV", "VoidStopCheckDV", null, pcftest.VoidStopCheckDV.class);
    }
    
    public VoidStopCheckGroupDV getVoidStopCheckGroupDV() {
      return getOrCreateProperty("VoidStopCheckGroupDV", "VoidStopCheckGroupDV", null, pcftest.VoidStopCheckGroupDV.class);
    }
    
    public VoidStopCheck_StopButton getVoidStopCheck_StopButton() {
      return getOrCreateProperty("VoidStopCheck_StopButton", "VoidStopCheck_StopButton", null, pcftest.VoidStopCheck.VoidStopCheckScreen.VoidStopCheck_StopButton.class);
    }
    
    public VoidStopCheck_VoidButton getVoidStopCheck_VoidButton() {
      return getOrCreateProperty("VoidStopCheck_VoidButton", "VoidStopCheck_VoidButton", null, pcftest.VoidStopCheck.VoidStopCheckScreen.VoidStopCheck_VoidButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.VoidStopCheck.VoidStopCheckScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheck.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheck.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheck.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheck.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class VoidStopCheck_StopButton extends ClickableActionElement {
      public VoidStopCheck_StopButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheck.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class VoidStopCheck_VoidButton extends ClickableActionElement {
      public VoidStopCheck_VoidButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheck.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheck.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VoidStopCheck_UpLink extends ClickableActionElement {
    public VoidStopCheck_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheck.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/checks/VoidStopCheck.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}