package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewClaimWizard_PolicyVehicleDetailPopup.NewClaimWizard_PolicyVehicleDetailPopup_UpLink;
import pcftest.NewClaimWizard_PolicyVehicleDetailPopup.NewClaimWizard_PolicyVehicleDetailScreen;
import pcftest.NewClaimWizard_PolicyVehicleDetailPopup.NewClaimWizard_PolicyVehicleDetailScreen.Cancel;
import pcftest.NewClaimWizard_PolicyVehicleDetailPopup.NewClaimWizard_PolicyVehicleDetailScreen.Edit;
import pcftest.NewClaimWizard_PolicyVehicleDetailPopup.NewClaimWizard_PolicyVehicleDetailScreen.NotOnPolicyDV;
import pcftest.NewClaimWizard_PolicyVehicleDetailPopup.NewClaimWizard_PolicyVehicleDetailScreen.NotOnPolicyDV.NotOnPolicy;
import pcftest.NewClaimWizard_PolicyVehicleDetailPopup.NewClaimWizard_PolicyVehicleDetailScreen.Update;
import pcftest.NewClaimWizard_PolicyVehicleDetailPopup.NewClaimWizard_PolicyVehicleDetailScreen._msgs;
import pcftest.NewClaimWizard_PolicyVehicleDetailPopup._Paging;
import pcftest.NewClaimWizard_PolicyVehicleDetailPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyVehicleDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimWizard_PolicyVehicleDetailPopup extends PCFLocation {
  public final static String CHECKSUM = "0a974e830aeef1c1c29b8638ac692b94";
  
  public NewClaimWizard_PolicyVehicleDetailPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewClaimWizard_PolicyVehicleDetailPopup"));
  }
  
  public NewClaimWizard_PolicyVehicleDetailPopup_UpLink getNewClaimWizard_PolicyVehicleDetailPopup_UpLink() {
    return getOrCreateProperty("NewClaimWizard_PolicyVehicleDetailPopup_UpLink", "NewClaimWizard_PolicyVehicleDetailPopup_UpLink", null, pcftest.NewClaimWizard_PolicyVehicleDetailPopup.NewClaimWizard_PolicyVehicleDetailPopup_UpLink.class);
  }
  
  public NewClaimWizard_PolicyVehicleDetailScreen getNewClaimWizard_PolicyVehicleDetailScreen() {
    return getOrCreateProperty("NewClaimWizard_PolicyVehicleDetailScreen", "NewClaimWizard_PolicyVehicleDetailScreen", null, pcftest.NewClaimWizard_PolicyVehicleDetailPopup.NewClaimWizard_PolicyVehicleDetailScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewClaimWizard_PolicyVehicleDetailPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewClaimWizard_PolicyVehicleDetailPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyVehicleDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_PolicyVehicleDetailPopup_UpLink extends ClickableActionElement {
    public NewClaimWizard_PolicyVehicleDetailPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyVehicleDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizard_PolicyVehicleDetailScreen extends PCFElement {
    public NewClaimWizard_PolicyVehicleDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewClaimWizard_PolicyVehicleDetailPopup.NewClaimWizard_PolicyVehicleDetailScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewClaimWizard_PolicyVehicleDetailPopup.NewClaimWizard_PolicyVehicleDetailScreen.Edit.class);
    }
    
    public NotOnPolicyDV getNotOnPolicyDV() {
      return getOrCreateProperty("NotOnPolicyDV", "NotOnPolicyDV", null, pcftest.NewClaimWizard_PolicyVehicleDetailPopup.NewClaimWizard_PolicyVehicleDetailScreen.NotOnPolicyDV.class);
    }
    
    public PolicyVehicleDetailPanelSet getPolicyVehicleDetailPanelSet() {
      return getOrCreateProperty("PolicyVehicleDetailPanelSet", "PolicyVehicleDetailPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.PolicyVehicleDetailPanelSet.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewClaimWizard_PolicyVehicleDetailPopup.NewClaimWizard_PolicyVehicleDetailScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewClaimWizard_PolicyVehicleDetailPopup.NewClaimWizard_PolicyVehicleDetailScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyVehicleDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyVehicleDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyVehicleDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NotOnPolicyDV extends DetailViewElement {
      public NotOnPolicyDV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NotOnPolicy getNotOnPolicy() {
        return getOrCreateProperty("NotOnPolicy", "NotOnPolicy", null, pcftest.NewClaimWizard_PolicyVehicleDetailPopup.NewClaimWizard_PolicyVehicleDetailScreen.NotOnPolicyDV.NotOnPolicy.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyVehicleDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NotOnPolicy extends ValueElement {
        public NotOnPolicy(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyVehicleDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyVehicleDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyVehicleDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimWizard_PolicyVehicleDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}