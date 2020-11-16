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
import pcftest.BaggageIncidentPopup.BaggageIncidentPopup_UpLink;
import pcftest.BaggageIncidentPopup.EditBaggageIncidentScreen;
import pcftest.BaggageIncidentPopup.EditBaggageIncidentScreen.BaggageIncident_PrintButton;
import pcftest.BaggageIncidentPopup.EditBaggageIncidentScreen.Cancel;
import pcftest.BaggageIncidentPopup.EditBaggageIncidentScreen.Edit;
import pcftest.BaggageIncidentPopup.EditBaggageIncidentScreen.Update;
import pcftest.BaggageIncidentPopup.EditBaggageIncidentScreen._msgs;
import pcftest.BaggageIncidentPopup._Paging;
import pcftest.BaggageIncidentPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class BaggageIncidentPopup extends PCFLocation {
  public final static String CHECKSUM = "55eeb7d570cdb0e5301bcc08f9a29640";
  
  public BaggageIncidentPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("BaggageIncidentPopup"));
  }
  
  public BaggageIncidentPopup_UpLink getBaggageIncidentPopup_UpLink() {
    return getOrCreateProperty("BaggageIncidentPopup_UpLink", "BaggageIncidentPopup_UpLink", null, pcftest.BaggageIncidentPopup.BaggageIncidentPopup_UpLink.class);
  }
  
  public ClaimInfoBar getClaimInfoBar() {
    return getOrCreateProperty("ClaimInfoBar", "ClaimInfoBar", null, pcftest.ClaimInfoBar.class);
  }
  
  public EditBaggageIncidentScreen getEditBaggageIncidentScreen() {
    return getOrCreateProperty("EditBaggageIncidentScreen", "EditBaggageIncidentScreen", null, pcftest.BaggageIncidentPopup.EditBaggageIncidentScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.BaggageIncidentPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.BaggageIncidentPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BaggageIncidentPopup_UpLink extends ClickableActionElement {
    public BaggageIncidentPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditBaggageIncidentScreen extends PCFElement {
    public EditBaggageIncidentScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BaggageIncidentDetailDV getBaggageIncidentDetailDV() {
      return getOrCreateProperty("BaggageIncidentDetailDV", "BaggageIncidentDetailDV", null, pcftest.BaggageIncidentDetailDV.class);
    }
    
    public BaggageIncident_PrintButton getBaggageIncident_PrintButton() {
      return getOrCreateProperty("BaggageIncident_PrintButton", "BaggageIncident_PrintButton", null, pcftest.BaggageIncidentPopup.EditBaggageIncidentScreen.BaggageIncident_PrintButton.class);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.BaggageIncidentPopup.EditBaggageIncidentScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.BaggageIncidentPopup.EditBaggageIncidentScreen.Edit.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.BaggageIncidentPopup.EditBaggageIncidentScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.BaggageIncidentPopup.EditBaggageIncidentScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BaggageIncident_PrintButton extends ClickableActionElement {
      public BaggageIncident_PrintButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/BaggageIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}