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
import pcftest.NewRecoveryReserveSet.NewRecoveryReserveSet_UpLink;
import pcftest.NewRecoveryReserveSet.NewReserveSetScreen;
import pcftest.NewRecoveryReserveSet.NewReserveSetScreen.Add;
import pcftest.NewRecoveryReserveSet.NewReserveSetScreen.Button_Reserve_LinkDocument;
import pcftest.NewRecoveryReserveSet.NewReserveSetScreen.Cancel;
import pcftest.NewRecoveryReserveSet.NewReserveSetScreen.Edit;
import pcftest.NewRecoveryReserveSet.NewReserveSetScreen.Remove;
import pcftest.NewRecoveryReserveSet.NewReserveSetScreen.Update;
import pcftest.NewRecoveryReserveSet.NewReserveSetScreen._msgs;
import pcftest.NewRecoveryReserveSet._Paging;
import pcftest.NewRecoveryReserveSet.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/NewRecoveryReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewRecoveryReserveSet extends PCFLocation {
  public final static String CHECKSUM = "45b56b0e284e5e6c3934052e6948d861";
  
  public NewRecoveryReserveSet(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewRecoveryReserveSet"));
  }
  
  public NewRecoveryReserveSet_UpLink getNewRecoveryReserveSet_UpLink() {
    return getOrCreateProperty("NewRecoveryReserveSet_UpLink", "NewRecoveryReserveSet_UpLink", null, pcftest.NewRecoveryReserveSet.NewRecoveryReserveSet_UpLink.class);
  }
  
  public NewReserveSetScreen getNewReserveSetScreen() {
    return getOrCreateProperty("NewReserveSetScreen", "NewReserveSetScreen", null, pcftest.NewRecoveryReserveSet.NewReserveSetScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewRecoveryReserveSet._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewRecoveryReserveSet.__crumb__.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/NewRecoveryReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewRecoveryReserveSet_UpLink extends ClickableActionElement {
    public NewRecoveryReserveSet_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/NewRecoveryReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewReserveSetScreen extends PCFElement {
    public NewReserveSetScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.NewRecoveryReserveSet.NewReserveSetScreen.Add.class);
    }
    
    public Button_Reserve_LinkDocument getButton_Reserve_LinkDocument() {
      return getOrCreateProperty("Button_Reserve_LinkDocument", "Button_Reserve_LinkDocument", null, pcftest.NewRecoveryReserveSet.NewReserveSetScreen.Button_Reserve_LinkDocument.class);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewRecoveryReserveSet.NewReserveSetScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewRecoveryReserveSet.NewReserveSetScreen.Edit.class);
    }
    
    public RecoveryReservesSummaryDV getRecoveryReservesSummaryDV() {
      return getOrCreateProperty("RecoveryReservesSummaryDV", "RecoveryReservesSummaryDV", null, pcftest.RecoveryReservesSummaryDV.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.NewRecoveryReserveSet.NewReserveSetScreen.Remove.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewRecoveryReserveSet.NewReserveSetScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewRecoveryReserveSet.NewReserveSetScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/NewRecoveryReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/NewRecoveryReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Button_Reserve_LinkDocument extends ClickableActionElement {
      public Button_Reserve_LinkDocument(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PickExistingDocumentPopup click() {
        return clickThis(pcftest.PickExistingDocumentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/NewRecoveryReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/NewRecoveryReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/NewRecoveryReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/NewRecoveryReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/NewRecoveryReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/NewRecoveryReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newtransaction/recoveryreserve/NewRecoveryReserveSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}