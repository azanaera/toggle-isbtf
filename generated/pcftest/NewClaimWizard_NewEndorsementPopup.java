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
import pcftest.NewClaimWizard_NewEndorsementPopup.NewClaimWizard_NewEndorsementDetailScreen;
import pcftest.NewClaimWizard_NewEndorsementPopup.NewClaimWizard_NewEndorsementDetailScreen.Cancel;
import pcftest.NewClaimWizard_NewEndorsementPopup.NewClaimWizard_NewEndorsementDetailScreen.Edit;
import pcftest.NewClaimWizard_NewEndorsementPopup.NewClaimWizard_NewEndorsementDetailScreen.Update;
import pcftest.NewClaimWizard_NewEndorsementPopup.NewClaimWizard_NewEndorsementDetailScreen._msgs;
import pcftest.NewClaimWizard_NewEndorsementPopup.NewClaimWizard_NewEndorsementPopup_UpLink;
import pcftest.NewClaimWizard_NewEndorsementPopup._Paging;
import pcftest.NewClaimWizard_NewEndorsementPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewEndorsementPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimWizard_NewEndorsementPopup extends PCFLocation {
  public final static String CHECKSUM = "3050605f294e1bd5a111b49cc38d9f2a";
  
  public NewClaimWizard_NewEndorsementPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewClaimWizard_NewEndorsementPopup"));
  }
  
  public NewClaimWizard_NewEndorsementDetailScreen getNewClaimWizard_NewEndorsementDetailScreen() {
    return getOrCreateProperty("NewClaimWizard_NewEndorsementDetailScreen", "NewClaimWizard_NewEndorsementDetailScreen", null, pcftest.NewClaimWizard_NewEndorsementPopup.NewClaimWizard_NewEndorsementDetailScreen.class);
  }
  
  public NewClaimWizard_NewEndorsementPopup_UpLink getNewClaimWizard_NewEndorsementPopup_UpLink() {
    return getOrCreateProperty("NewClaimWizard_NewEndorsementPopup_UpLink", "NewClaimWizard_NewEndorsementPopup_UpLink", null, pcftest.NewClaimWizard_NewEndorsementPopup.NewClaimWizard_NewEndorsementPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewClaimWizard_NewEndorsementPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewClaimWizard_NewEndorsementPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewEndorsementPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_NewEndorsementDetailScreen extends PCFElement {
    public NewClaimWizard_NewEndorsementDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewClaimWizard_NewEndorsementPopup.NewClaimWizard_NewEndorsementDetailScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewClaimWizard_NewEndorsementPopup.NewClaimWizard_NewEndorsementDetailScreen.Edit.class);
    }
    
    public EndorsementDetailDV getEndorsementDetailDV() {
      return getOrCreateProperty("EndorsementDetailDV", "EndorsementDetailDV", null, pcftest.EndorsementDetailDV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewClaimWizard_NewEndorsementPopup.NewClaimWizard_NewEndorsementDetailScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewClaimWizard_NewEndorsementPopup.NewClaimWizard_NewEndorsementDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewEndorsementPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewEndorsementPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewEndorsementPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewEndorsementPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewEndorsementPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_NewEndorsementPopup_UpLink extends ClickableActionElement {
    public NewClaimWizard_NewEndorsementPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewEndorsementPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewEndorsementPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}