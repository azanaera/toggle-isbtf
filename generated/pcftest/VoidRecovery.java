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
import pcftest.VoidRecovery.VoidRecoveryScreen;
import pcftest.VoidRecovery.VoidRecoveryScreen.Cancel;
import pcftest.VoidRecovery.VoidRecoveryScreen.Edit;
import pcftest.VoidRecovery.VoidRecoveryScreen.Update;
import pcftest.VoidRecovery.VoidRecoveryScreen.VoidRecovery_VoidButton;
import pcftest.VoidRecovery.VoidRecoveryScreen._msgs;
import pcftest.VoidRecovery.VoidRecovery_UpLink;
import pcftest.VoidRecovery._Paging;
import pcftest.VoidRecovery.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/financials/transactions/VoidRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class VoidRecovery extends PCFLocation {
  public final static String CHECKSUM = "15c73890830a662e4dc75a37ee8ef559";
  
  public VoidRecovery(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("VoidRecovery"));
  }
  
  public VoidRecoveryScreen getVoidRecoveryScreen() {
    return getOrCreateProperty("VoidRecoveryScreen", "VoidRecoveryScreen", null, pcftest.VoidRecovery.VoidRecoveryScreen.class);
  }
  
  public VoidRecovery_UpLink getVoidRecovery_UpLink() {
    return getOrCreateProperty("VoidRecovery_UpLink", "VoidRecovery_UpLink", null, pcftest.VoidRecovery.VoidRecovery_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.VoidRecovery._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.VoidRecovery.__crumb__.class);
  }
  
  public ClaimFinancialsTransactionsDetail get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimFinancialsTransactionsDetail.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/VoidRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VoidRecoveryScreen extends PCFElement {
    public VoidRecoveryScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.VoidRecovery.VoidRecoveryScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.VoidRecovery.VoidRecoveryScreen.Edit.class);
    }
    
    public RecoveryBasicsInputSet getRecoveryBasicsInputSet() {
      return getOrCreateProperty("RecoveryBasicsInputSet", "RecoveryBasicsInputSet", null, pcftest.RecoveryBasicsInputSet.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.VoidRecovery.VoidRecoveryScreen.Update.class);
    }
    
    public VoidRecovery_VoidButton getVoidRecovery_VoidButton() {
      return getOrCreateProperty("VoidRecovery_VoidButton", "VoidRecovery_VoidButton", null, pcftest.VoidRecovery.VoidRecoveryScreen.VoidRecovery_VoidButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.VoidRecovery.VoidRecoveryScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/VoidRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/VoidRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/VoidRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/VoidRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class VoidRecovery_VoidButton extends ClickableActionElement {
      public VoidRecovery_VoidButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/financials/transactions/VoidRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/financials/transactions/VoidRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VoidRecovery_UpLink extends ClickableActionElement {
    public VoidRecovery_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/VoidRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/financials/transactions/VoidRecovery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}