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
import pcftest.ClaimLossDetails.ClaimLossDetailsScreen;
import pcftest.ClaimLossDetails.ClaimLossDetailsScreen.Cancel;
import pcftest.ClaimLossDetails.ClaimLossDetailsScreen.ClaimLossDetails_RefreshButton;
import pcftest.ClaimLossDetails.ClaimLossDetailsScreen.ClaimLossDetails_SendToISOButton;
import pcftest.ClaimLossDetails.ClaimLossDetailsScreen.Edit;
import pcftest.ClaimLossDetails.ClaimLossDetailsScreen.Update;
import pcftest.ClaimLossDetails.ClaimLossDetailsScreen._msgs;
import pcftest.ClaimLossDetails.ClaimLossDetails_UpLink;
import pcftest.ClaimLossDetails._Paging;
import pcftest.ClaimLossDetails.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/ClaimLossDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimLossDetails extends PCFLocation {
  public final static String CHECKSUM = "1e9bae99e360c0315723bf1bb921dc4c";
  
  public ClaimLossDetails(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimLossDetails"));
  }
  
  public ClaimLossDetailsScreen getClaimLossDetailsScreen() {
    return getOrCreateProperty("ClaimLossDetailsScreen", "ClaimLossDetailsScreen", null, pcftest.ClaimLossDetails.ClaimLossDetailsScreen.class);
  }
  
  public ClaimLossDetails_UpLink getClaimLossDetails_UpLink() {
    return getOrCreateProperty("ClaimLossDetails_UpLink", "ClaimLossDetails_UpLink", null, pcftest.ClaimLossDetails.ClaimLossDetails_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimLossDetails._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimLossDetails.__crumb__.class);
  }
  
  public ClaimLossDetailsGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimLossDetailsGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/ClaimLossDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimLossDetailsScreen extends PCFElement {
    public ClaimLossDetailsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ClaimLossDetails.ClaimLossDetailsScreen.Cancel.class);
    }
    
    public ClaimLossDetails_RefreshButton getClaimLossDetails_RefreshButton() {
      return getOrCreateProperty("ClaimLossDetails_RefreshButton", "ClaimLossDetails_RefreshButton", null, pcftest.ClaimLossDetails.ClaimLossDetailsScreen.ClaimLossDetails_RefreshButton.class);
    }
    
    public ClaimLossDetails_SendToISOButton getClaimLossDetails_SendToISOButton() {
      return getOrCreateProperty("ClaimLossDetails_SendToISOButton", "ClaimLossDetails_SendToISOButton", null, pcftest.ClaimLossDetails.ClaimLossDetailsScreen.ClaimLossDetails_SendToISOButton.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.ClaimLossDetails.ClaimLossDetailsScreen.Edit.class);
    }
    
    public LossDetailsPanelSet_Homeowners getLossDetailsPanelSet_Homeowners() {
      return getOrCreateProperty("LossDetailsPanelSet_Homeowners", "LossDetailsPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.LossDetailsPanelSet_Homeowners.class);
    }
    
    public LossDetailsPanelSet_default getLossDetailsPanelSet_default() {
      return getOrCreateProperty("LossDetailsPanelSet_default", "LossDetailsPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.LossDetailsPanelSet_default.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.ClaimLossDetails.ClaimLossDetailsScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimLossDetails.ClaimLossDetailsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/ClaimLossDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/ClaimLossDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimLossDetails_RefreshButton extends ClickableActionElement {
      public ClaimLossDetails_RefreshButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/ClaimLossDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimLossDetails_SendToISOButton extends ClickableActionElement {
      public ClaimLossDetails_SendToISOButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/ClaimLossDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/ClaimLossDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/ClaimLossDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/ClaimLossDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimLossDetails_UpLink extends ClickableActionElement {
    public ClaimLossDetails_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/ClaimLossDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/ClaimLossDetails.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}