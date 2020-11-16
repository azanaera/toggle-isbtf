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
import pcftest.NewClaimWizard_NewPolicyVehiclePopup.NewClaimWizard_NewPolicyVehiclePopup_UpLink;
import pcftest.NewClaimWizard_NewPolicyVehiclePopup.NewClaimWizard_NewPolicyVehicleScreen;
import pcftest.NewClaimWizard_NewPolicyVehiclePopup.NewClaimWizard_NewPolicyVehicleScreen.Cancel;
import pcftest.NewClaimWizard_NewPolicyVehiclePopup.NewClaimWizard_NewPolicyVehicleScreen.Edit;
import pcftest.NewClaimWizard_NewPolicyVehiclePopup.NewClaimWizard_NewPolicyVehicleScreen.Update;
import pcftest.NewClaimWizard_NewPolicyVehiclePopup.NewClaimWizard_NewPolicyVehicleScreen._msgs;
import pcftest.NewClaimWizard_NewPolicyVehiclePopup._Paging;
import pcftest.NewClaimWizard_NewPolicyVehiclePopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewPolicyVehiclePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimWizard_NewPolicyVehiclePopup extends PCFLocation {
  public final static String CHECKSUM = "cb00b33a0f0c48d7af71abe46cf165f6";
  
  public NewClaimWizard_NewPolicyVehiclePopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewClaimWizard_NewPolicyVehiclePopup"));
  }
  
  public NewClaimWizard_NewPolicyVehiclePopup_UpLink getNewClaimWizard_NewPolicyVehiclePopup_UpLink() {
    return getOrCreateProperty("NewClaimWizard_NewPolicyVehiclePopup_UpLink", "NewClaimWizard_NewPolicyVehiclePopup_UpLink", null, pcftest.NewClaimWizard_NewPolicyVehiclePopup.NewClaimWizard_NewPolicyVehiclePopup_UpLink.class);
  }
  
  public NewClaimWizard_NewPolicyVehicleScreen getNewClaimWizard_NewPolicyVehicleScreen() {
    return getOrCreateProperty("NewClaimWizard_NewPolicyVehicleScreen", "NewClaimWizard_NewPolicyVehicleScreen", null, pcftest.NewClaimWizard_NewPolicyVehiclePopup.NewClaimWizard_NewPolicyVehicleScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewClaimWizard_NewPolicyVehiclePopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewClaimWizard_NewPolicyVehiclePopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewPolicyVehiclePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_NewPolicyVehiclePopup_UpLink extends ClickableActionElement {
    public NewClaimWizard_NewPolicyVehiclePopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewPolicyVehiclePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_NewPolicyVehicleScreen extends PCFElement {
    public NewClaimWizard_NewPolicyVehicleScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewClaimWizard_NewPolicyVehiclePopup.NewClaimWizard_NewPolicyVehicleScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewClaimWizard_NewPolicyVehiclePopup.NewClaimWizard_NewPolicyVehicleScreen.Edit.class);
    }
    
    public PolicyVehicleDetailPanelSet getPolicyVehicleDetailPanelSet() {
      return getOrCreateProperty("PolicyVehicleDetailPanelSet", "PolicyVehicleDetailPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.PolicyVehicleDetailPanelSet.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewClaimWizard_NewPolicyVehiclePopup.NewClaimWizard_NewPolicyVehicleScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewClaimWizard_NewPolicyVehiclePopup.NewClaimWizard_NewPolicyVehicleScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewPolicyVehiclePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewPolicyVehiclePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewPolicyVehiclePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewPolicyVehiclePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewPolicyVehiclePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_NewPolicyVehiclePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}