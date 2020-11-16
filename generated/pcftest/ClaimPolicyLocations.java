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
import pcftest.ClaimPolicyLocations.ClaimPolicyLocationsScreen;
import pcftest.ClaimPolicyLocations.ClaimPolicyLocationsScreen.Add;
import pcftest.ClaimPolicyLocations.ClaimPolicyLocationsScreen.Cancel;
import pcftest.ClaimPolicyLocations.ClaimPolicyLocationsScreen.ClaimPolicyLocations_AddMoreLocationsButton;
import pcftest.ClaimPolicyLocations.ClaimPolicyLocationsScreen.Edit;
import pcftest.ClaimPolicyLocations.ClaimPolicyLocationsScreen.Remove;
import pcftest.ClaimPolicyLocations.ClaimPolicyLocationsScreen.Update;
import pcftest.ClaimPolicyLocations.ClaimPolicyLocationsScreen._msgs;
import pcftest.ClaimPolicyLocations.ClaimPolicyLocations_UpLink;
import pcftest.ClaimPolicyLocations._Paging;
import pcftest.ClaimPolicyLocations.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyLocations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPolicyLocations extends PCFLocation {
  public final static String CHECKSUM = "cbc863a2e8ae910fce08cc6d22d4c199";
  
  public ClaimPolicyLocations(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimPolicyLocations"));
  }
  
  public ClaimPolicyLocationsScreen getClaimPolicyLocationsScreen() {
    return getOrCreateProperty("ClaimPolicyLocationsScreen", "ClaimPolicyLocationsScreen", null, pcftest.ClaimPolicyLocations.ClaimPolicyLocationsScreen.class);
  }
  
  public ClaimPolicyLocations_UpLink getClaimPolicyLocations_UpLink() {
    return getOrCreateProperty("ClaimPolicyLocations_UpLink", "ClaimPolicyLocations_UpLink", null, pcftest.ClaimPolicyLocations.ClaimPolicyLocations_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimPolicyLocations._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimPolicyLocations.__crumb__.class);
  }
  
  public ClaimPolicyGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPolicyGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyLocations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyLocationsScreen extends PCFElement {
    public ClaimPolicyLocationsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.ClaimPolicyLocations.ClaimPolicyLocationsScreen.Add.class);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ClaimPolicyLocations.ClaimPolicyLocationsScreen.Cancel.class);
    }
    
    public ClaimPolicyLocations_AddMoreLocationsButton getClaimPolicyLocations_AddMoreLocationsButton() {
      return getOrCreateProperty("ClaimPolicyLocations_AddMoreLocationsButton", "ClaimPolicyLocations_AddMoreLocationsButton", null, pcftest.ClaimPolicyLocations.ClaimPolicyLocationsScreen.ClaimPolicyLocations_AddMoreLocationsButton.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.ClaimPolicyLocations.ClaimPolicyLocationsScreen.Edit.class);
    }
    
    public PolicyLocationLDV getPolicyLocationLDV() {
      return getOrCreateProperty("PolicyLocationLDV", "PolicyLocationLDV", null, pcftest.PolicyLocationLDV.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.ClaimPolicyLocations.ClaimPolicyLocationsScreen.Remove.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.ClaimPolicyLocations.ClaimPolicyLocationsScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimPolicyLocations.ClaimPolicyLocationsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyLocations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyLocations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyLocations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimPolicyLocations_AddMoreLocationsButton extends ClickableActionElement {
      public ClaimPolicyLocations_AddMoreLocationsButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyLocations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyLocations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyLocations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyLocations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyLocations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyLocations_UpLink extends ClickableActionElement {
    public ClaimPolicyLocations_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyLocations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyLocations.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}