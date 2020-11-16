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
import pcftest.ClaimPolicyGeneral.ClaimPolicyGeneralScreen;
import pcftest.ClaimPolicyGeneral.ClaimPolicyGeneralScreen.Cancel;
import pcftest.ClaimPolicyGeneral.ClaimPolicyGeneralScreen.ClaimPolicyGeneral_RefreshPolicyButton;
import pcftest.ClaimPolicyGeneral.ClaimPolicyGeneralScreen.ClaimPolicyGeneral_SelectPolicyButton;
import pcftest.ClaimPolicyGeneral.ClaimPolicyGeneralScreen.Edit;
import pcftest.ClaimPolicyGeneral.ClaimPolicyGeneralScreen.Update;
import pcftest.ClaimPolicyGeneral.ClaimPolicyGeneralScreen.ViewInPC;
import pcftest.ClaimPolicyGeneral.ClaimPolicyGeneralScreen._msgs;
import pcftest.ClaimPolicyGeneral.ClaimPolicyGeneral_UpLink;
import pcftest.ClaimPolicyGeneral._Paging;
import pcftest.ClaimPolicyGeneral.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGeneral.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPolicyGeneral extends PCFLocation {
  public final static String CHECKSUM = "2a9c489a1dce783b0767a36bb59bb364";
  
  public ClaimPolicyGeneral(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimPolicyGeneral"));
  }
  
  public ClaimPolicyGeneralScreen getClaimPolicyGeneralScreen() {
    return getOrCreateProperty("ClaimPolicyGeneralScreen", "ClaimPolicyGeneralScreen", null, pcftest.ClaimPolicyGeneral.ClaimPolicyGeneralScreen.class);
  }
  
  public ClaimPolicyGeneral_UpLink getClaimPolicyGeneral_UpLink() {
    return getOrCreateProperty("ClaimPolicyGeneral_UpLink", "ClaimPolicyGeneral_UpLink", null, pcftest.ClaimPolicyGeneral.ClaimPolicyGeneral_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimPolicyGeneral._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimPolicyGeneral.__crumb__.class);
  }
  
  public ClaimPolicyGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPolicyGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGeneral.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyGeneralScreen extends PCFElement {
    public ClaimPolicyGeneralScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ClaimPolicyGeneral.ClaimPolicyGeneralScreen.Cancel.class);
    }
    
    public ClaimPolicyGeneral_RefreshPolicyButton getClaimPolicyGeneral_RefreshPolicyButton() {
      return getOrCreateProperty("ClaimPolicyGeneral_RefreshPolicyButton", "ClaimPolicyGeneral_RefreshPolicyButton", null, pcftest.ClaimPolicyGeneral.ClaimPolicyGeneralScreen.ClaimPolicyGeneral_RefreshPolicyButton.class);
    }
    
    public ClaimPolicyGeneral_SelectPolicyButton getClaimPolicyGeneral_SelectPolicyButton() {
      return getOrCreateProperty("ClaimPolicyGeneral_SelectPolicyButton", "ClaimPolicyGeneral_SelectPolicyButton", null, pcftest.ClaimPolicyGeneral.ClaimPolicyGeneralScreen.ClaimPolicyGeneral_SelectPolicyButton.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.ClaimPolicyGeneral.ClaimPolicyGeneralScreen.Edit.class);
    }
    
    public PolicyGeneralPanelSet_Auto getPolicyGeneralPanelSet_Auto() {
      return getOrCreateProperty("PolicyGeneralPanelSet_Auto", "PolicyGeneralPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.PolicyGeneralPanelSet_Auto.class);
    }
    
    public PolicyGeneralPanelSet_Gl getPolicyGeneralPanelSet_Gl() {
      return getOrCreateProperty("PolicyGeneralPanelSet_Gl", "PolicyGeneralPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.PolicyGeneralPanelSet_Gl.class);
    }
    
    public PolicyGeneralPanelSet_Pr getPolicyGeneralPanelSet_Pr() {
      return getOrCreateProperty("PolicyGeneralPanelSet_Pr", "PolicyGeneralPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.PolicyGeneralPanelSet_Pr.class);
    }
    
    public PolicyGeneralPanelSet_Trav getPolicyGeneralPanelSet_Trav() {
      return getOrCreateProperty("PolicyGeneralPanelSet_Trav", "PolicyGeneralPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.PolicyGeneralPanelSet_Trav.class);
    }
    
    public PolicyGeneralPanelSet_Wc getPolicyGeneralPanelSet_Wc() {
      return getOrCreateProperty("PolicyGeneralPanelSet_Wc", "PolicyGeneralPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.PolicyGeneralPanelSet_Wc.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.ClaimPolicyGeneral.ClaimPolicyGeneralScreen.Update.class);
    }
    
    public ViewInPC getViewInPC() {
      return getOrCreateProperty("ViewInPC", "ViewInPC", null, pcftest.ClaimPolicyGeneral.ClaimPolicyGeneralScreen.ViewInPC.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimPolicyGeneral.ClaimPolicyGeneralScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGeneral.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGeneral.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimPolicyGeneral_RefreshPolicyButton extends ClickableActionElement {
      public ClaimPolicyGeneral_RefreshPolicyButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PolicyRefreshWizard click() {
        return clickThis(pcftest.PolicyRefreshWizard.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGeneral.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimPolicyGeneral_SelectPolicyButton extends ClickableActionElement {
      public ClaimPolicyGeneral_SelectPolicyButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimPolicySelectPolicyPopup click() {
        return clickThis(pcftest.ClaimPolicySelectPolicyPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGeneral.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGeneral.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGeneral.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ViewInPC extends ClickableActionElement {
      public ViewInPC(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ViewPolicy click() {
        return clickThis(pcftest.ViewPolicy.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGeneral.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGeneral.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyGeneral_UpLink extends ClickableActionElement {
    public ClaimPolicyGeneral_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGeneral.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyGeneral.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}