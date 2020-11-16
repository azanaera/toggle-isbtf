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
import pcftest.NewClaimWizard_EndorsementDetailPopup.NewClaimWizard_EndorsementDetailPopup_UpLink;
import pcftest.NewClaimWizard_EndorsementDetailPopup.NewClaimWizard_EndorsementDetailScreen;
import pcftest.NewClaimWizard_EndorsementDetailPopup.NewClaimWizard_EndorsementDetailScreen.Cancel;
import pcftest.NewClaimWizard_EndorsementDetailPopup.NewClaimWizard_EndorsementDetailScreen.Edit;
import pcftest.NewClaimWizard_EndorsementDetailPopup.NewClaimWizard_EndorsementDetailScreen.Update;
import pcftest.NewClaimWizard_EndorsementDetailPopup.NewClaimWizard_EndorsementDetailScreen._msgs;
import pcftest.NewClaimWizard_EndorsementDetailPopup._Paging;
import pcftest.NewClaimWizard_EndorsementDetailPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_EndorsementDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimWizard_EndorsementDetailPopup extends PCFLocation {
  public final static String CHECKSUM = "aa1d117716fb23679a7492f4b211e082";
  
  public NewClaimWizard_EndorsementDetailPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewClaimWizard_EndorsementDetailPopup"));
  }
  
  public NewClaimWizard_EndorsementDetailPopup_UpLink getNewClaimWizard_EndorsementDetailPopup_UpLink() {
    return getOrCreateProperty("NewClaimWizard_EndorsementDetailPopup_UpLink", "NewClaimWizard_EndorsementDetailPopup_UpLink", null, pcftest.NewClaimWizard_EndorsementDetailPopup.NewClaimWizard_EndorsementDetailPopup_UpLink.class);
  }
  
  public NewClaimWizard_EndorsementDetailScreen getNewClaimWizard_EndorsementDetailScreen() {
    return getOrCreateProperty("NewClaimWizard_EndorsementDetailScreen", "NewClaimWizard_EndorsementDetailScreen", null, pcftest.NewClaimWizard_EndorsementDetailPopup.NewClaimWizard_EndorsementDetailScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewClaimWizard_EndorsementDetailPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewClaimWizard_EndorsementDetailPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_EndorsementDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_EndorsementDetailPopup_UpLink extends ClickableActionElement {
    public NewClaimWizard_EndorsementDetailPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_EndorsementDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_EndorsementDetailScreen extends PCFElement {
    public NewClaimWizard_EndorsementDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewClaimWizard_EndorsementDetailPopup.NewClaimWizard_EndorsementDetailScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewClaimWizard_EndorsementDetailPopup.NewClaimWizard_EndorsementDetailScreen.Edit.class);
    }
    
    public EndorsementDetailDV getEndorsementDetailDV() {
      return getOrCreateProperty("EndorsementDetailDV", "EndorsementDetailDV", null, pcftest.EndorsementDetailDV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewClaimWizard_EndorsementDetailPopup.NewClaimWizard_EndorsementDetailScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewClaimWizard_EndorsementDetailPopup.NewClaimWizard_EndorsementDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_EndorsementDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_EndorsementDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_EndorsementDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_EndorsementDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_EndorsementDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_EndorsementDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}