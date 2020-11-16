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
import pcftest.ClaimPolicyVehicles.ClaimPolicyVehiclesScreen;
import pcftest.ClaimPolicyVehicles.ClaimPolicyVehiclesScreen.ClaimPolicyVehicles_PartialListAlertBar;
import pcftest.ClaimPolicyVehicles.ClaimPolicyVehiclesScreen.ClaimPolicyVehicles_PartialListAlertBar.CloseBtn;
import pcftest.ClaimPolicyVehicles.ClaimPolicyVehiclesScreen.VehicleDetailCardTab;
import pcftest.ClaimPolicyVehicles.ClaimPolicyVehiclesScreen._msgs;
import pcftest.ClaimPolicyVehicles.ClaimPolicyVehicles_UpLink;
import pcftest.ClaimPolicyVehicles._Paging;
import pcftest.ClaimPolicyVehicles.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyVehicles.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPolicyVehicles extends PCFLocation {
  public final static String CHECKSUM = "ea43e3fbd047b43f62b3c4ca1e82e1c6";
  
  public ClaimPolicyVehicles(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimPolicyVehicles"));
  }
  
  public ClaimPolicyVehiclesScreen getClaimPolicyVehiclesScreen() {
    return getOrCreateProperty("ClaimPolicyVehiclesScreen", "ClaimPolicyVehiclesScreen", null, pcftest.ClaimPolicyVehicles.ClaimPolicyVehiclesScreen.class);
  }
  
  public ClaimPolicyVehicles_UpLink getClaimPolicyVehicles_UpLink() {
    return getOrCreateProperty("ClaimPolicyVehicles_UpLink", "ClaimPolicyVehicles_UpLink", null, pcftest.ClaimPolicyVehicles.ClaimPolicyVehicles_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimPolicyVehicles._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimPolicyVehicles.__crumb__.class);
  }
  
  public ClaimPolicyGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPolicyGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyVehicles.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyVehiclesScreen extends PCFElement {
    public ClaimPolicyVehiclesScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimPolicyVehicles_PartialListAlertBar getClaimPolicyVehicles_PartialListAlertBar() {
      return getOrCreateProperty("ClaimPolicyVehicles_PartialListAlertBar", "ClaimPolicyVehicles_PartialListAlertBar", null, pcftest.ClaimPolicyVehicles.ClaimPolicyVehiclesScreen.ClaimPolicyVehicles_PartialListAlertBar.class);
    }
    
    public PolicyVehicleDetailPanelSet getPolicyVehicleDetailPanelSet() {
      return getOrCreateProperty("PolicyVehicleDetailPanelSet", "PolicyVehicleDetailPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.PolicyVehicleDetailPanelSet.class);
    }
    
    public VehicleDetailCardTab getVehicleDetailCardTab() {
      return getOrCreateProperty("VehicleDetailCardTab", "VehicleDetailCardTab", null, pcftest.ClaimPolicyVehicles.ClaimPolicyVehiclesScreen.VehicleDetailCardTab.class);
    }
    
    public VehiclesLV getVehiclesLV() {
      return getOrCreateProperty("VehiclesLV", "VehiclesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.VehiclesLV.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimPolicyVehicles.ClaimPolicyVehiclesScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyVehicles.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimPolicyVehicles_PartialListAlertBar extends ClickableActionElement {
      public ClaimPolicyVehicles_PartialListAlertBar(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CloseBtn getCloseBtn() {
        return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.ClaimPolicyVehicles.ClaimPolicyVehiclesScreen.ClaimPolicyVehicles_PartialListAlertBar.CloseBtn.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyVehicles.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CloseBtn extends ClickableActionElement {
        public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyVehicles.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class VehicleDetailCardTab extends ClickableActionElement {
      public VehicleDetailCardTab(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyVehicles.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyVehicles.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyVehicles_UpLink extends ClickableActionElement {
    public ClaimPolicyVehicles_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyVehicles.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyVehicles.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}