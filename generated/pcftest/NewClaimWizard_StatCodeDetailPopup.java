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
import pcftest.NewClaimWizard_StatCodeDetailPopup.NewClaimWizard_StatCodeDetailPopup_UpLink;
import pcftest.NewClaimWizard_StatCodeDetailPopup.NewClaimWizard_StatCodeDetailScreen;
import pcftest.NewClaimWizard_StatCodeDetailPopup.NewClaimWizard_StatCodeDetailScreen.Cancel;
import pcftest.NewClaimWizard_StatCodeDetailPopup.NewClaimWizard_StatCodeDetailScreen.Edit;
import pcftest.NewClaimWizard_StatCodeDetailPopup.NewClaimWizard_StatCodeDetailScreen.Update;
import pcftest.NewClaimWizard_StatCodeDetailPopup.NewClaimWizard_StatCodeDetailScreen._msgs;
import pcftest.NewClaimWizard_StatCodeDetailPopup._Paging;
import pcftest.NewClaimWizard_StatCodeDetailPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_StatCodeDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimWizard_StatCodeDetailPopup extends PCFLocation {
  public final static String CHECKSUM = "12be4640aca14599e049494fed946ee4";
  
  public NewClaimWizard_StatCodeDetailPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewClaimWizard_StatCodeDetailPopup"));
  }
  
  public NewClaimWizard_StatCodeDetailPopup_UpLink getNewClaimWizard_StatCodeDetailPopup_UpLink() {
    return getOrCreateProperty("NewClaimWizard_StatCodeDetailPopup_UpLink", "NewClaimWizard_StatCodeDetailPopup_UpLink", null, pcftest.NewClaimWizard_StatCodeDetailPopup.NewClaimWizard_StatCodeDetailPopup_UpLink.class);
  }
  
  public NewClaimWizard_StatCodeDetailScreen getNewClaimWizard_StatCodeDetailScreen() {
    return getOrCreateProperty("NewClaimWizard_StatCodeDetailScreen", "NewClaimWizard_StatCodeDetailScreen", null, pcftest.NewClaimWizard_StatCodeDetailPopup.NewClaimWizard_StatCodeDetailScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewClaimWizard_StatCodeDetailPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewClaimWizard_StatCodeDetailPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_StatCodeDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_StatCodeDetailPopup_UpLink extends ClickableActionElement {
    public NewClaimWizard_StatCodeDetailPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_StatCodeDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_StatCodeDetailScreen extends PCFElement {
    public NewClaimWizard_StatCodeDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewClaimWizard_StatCodeDetailPopup.NewClaimWizard_StatCodeDetailScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewClaimWizard_StatCodeDetailPopup.NewClaimWizard_StatCodeDetailScreen.Edit.class);
    }
    
    public StatCodeDetailDV getStatCodeDetailDV() {
      return getOrCreateProperty("StatCodeDetailDV", "StatCodeDetailDV", null, pcftest.StatCodeDetailDV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewClaimWizard_StatCodeDetailPopup.NewClaimWizard_StatCodeDetailScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewClaimWizard_StatCodeDetailPopup.NewClaimWizard_StatCodeDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_StatCodeDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_StatCodeDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_StatCodeDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_StatCodeDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_StatCodeDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_StatCodeDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}