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
import pcftest.NewClaimWizard_NewStatCodePopup.NewClaimWizard_NewStatCodePopup_UpLink;
import pcftest.NewClaimWizard_NewStatCodePopup.NewClaimWizard_NewStatCodeScreen;
import pcftest.NewClaimWizard_NewStatCodePopup.NewClaimWizard_NewStatCodeScreen.Cancel;
import pcftest.NewClaimWizard_NewStatCodePopup.NewClaimWizard_NewStatCodeScreen.Edit;
import pcftest.NewClaimWizard_NewStatCodePopup.NewClaimWizard_NewStatCodeScreen.Update;
import pcftest.NewClaimWizard_NewStatCodePopup.NewClaimWizard_NewStatCodeScreen._msgs;
import pcftest.NewClaimWizard_NewStatCodePopup._Paging;
import pcftest.NewClaimWizard_NewStatCodePopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewStatCodePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimWizard_NewStatCodePopup extends PCFLocation {
  public final static String CHECKSUM = "bff374b707ae1de6d037da7ff14ee327";
  
  public NewClaimWizard_NewStatCodePopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewClaimWizard_NewStatCodePopup"));
  }
  
  public NewClaimWizard_NewStatCodePopup_UpLink getNewClaimWizard_NewStatCodePopup_UpLink() {
    return getOrCreateProperty("NewClaimWizard_NewStatCodePopup_UpLink", "NewClaimWizard_NewStatCodePopup_UpLink", null, pcftest.NewClaimWizard_NewStatCodePopup.NewClaimWizard_NewStatCodePopup_UpLink.class);
  }
  
  public NewClaimWizard_NewStatCodeScreen getNewClaimWizard_NewStatCodeScreen() {
    return getOrCreateProperty("NewClaimWizard_NewStatCodeScreen", "NewClaimWizard_NewStatCodeScreen", null, pcftest.NewClaimWizard_NewStatCodePopup.NewClaimWizard_NewStatCodeScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewClaimWizard_NewStatCodePopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewClaimWizard_NewStatCodePopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewStatCodePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_NewStatCodePopup_UpLink extends ClickableActionElement {
    public NewClaimWizard_NewStatCodePopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewStatCodePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_NewStatCodeScreen extends PCFElement {
    public NewClaimWizard_NewStatCodeScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewClaimWizard_NewStatCodePopup.NewClaimWizard_NewStatCodeScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewClaimWizard_NewStatCodePopup.NewClaimWizard_NewStatCodeScreen.Edit.class);
    }
    
    public StatCodeDetailDV getStatCodeDetailDV() {
      return getOrCreateProperty("StatCodeDetailDV", "StatCodeDetailDV", null, pcftest.StatCodeDetailDV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewClaimWizard_NewStatCodePopup.NewClaimWizard_NewStatCodeScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewClaimWizard_NewStatCodePopup.NewClaimWizard_NewStatCodeScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewStatCodePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewStatCodePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewStatCodePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewStatCodePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewStatCodePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewStatCodePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}