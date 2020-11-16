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
import pcftest.NewRecoverySet.NewRecoveryScreen;
import pcftest.NewRecoverySet.NewRecoveryScreen.Cancel;
import pcftest.NewRecoverySet.NewRecoveryScreen.Edit;
import pcftest.NewRecoverySet.NewRecoveryScreen.Update;
import pcftest.NewRecoverySet.NewRecoveryScreen._msgs;
import pcftest.NewRecoverySet.NewRecoverySet_UpLink;
import pcftest.NewRecoverySet._Paging;
import pcftest.NewRecoverySet.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/recovery/NewRecoverySet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewRecoverySet extends PCFLocation {
  public final static String CHECKSUM = "062086a25f9a53fb0aafb97e51d9850c";
  
  public NewRecoverySet(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewRecoverySet"));
  }
  
  public NewRecoveryScreen getNewRecoveryScreen() {
    return getOrCreateProperty("NewRecoveryScreen", "NewRecoveryScreen", null, pcftest.NewRecoverySet.NewRecoveryScreen.class);
  }
  
  public NewRecoverySet_UpLink getNewRecoverySet_UpLink() {
    return getOrCreateProperty("NewRecoverySet_UpLink", "NewRecoverySet_UpLink", null, pcftest.NewRecoverySet.NewRecoverySet_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewRecoverySet._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewRecoverySet.__crumb__.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recovery/NewRecoverySet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewRecoveryScreen extends PCFElement {
    public NewRecoveryScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewRecoverySet.NewRecoveryScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewRecoverySet.NewRecoveryScreen.Edit.class);
    }
    
    public RecoveryDetailDV getRecoveryDetailDV() {
      return getOrCreateProperty("RecoveryDetailDV", "RecoveryDetailDV", null, pcftest.RecoveryDetailDV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewRecoverySet.NewRecoveryScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewRecoverySet.NewRecoveryScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/recovery/NewRecoverySet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/recovery/NewRecoverySet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/recovery/NewRecoverySet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/recovery/NewRecoverySet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newtransaction/recovery/NewRecoverySet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewRecoverySet_UpLink extends ClickableActionElement {
    public NewRecoverySet_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recovery/NewRecoverySet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recovery/NewRecoverySet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}