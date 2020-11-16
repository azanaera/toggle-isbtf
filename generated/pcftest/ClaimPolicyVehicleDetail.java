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
import pcftest.ClaimPolicyVehicleDetail.ClaimPolicyVehicleDetail_UpLink;
import pcftest.ClaimPolicyVehicleDetail.ClaimPolicyVehiclesScreen;
import pcftest.ClaimPolicyVehicleDetail.ClaimPolicyVehiclesScreen.Cancel;
import pcftest.ClaimPolicyVehicleDetail.ClaimPolicyVehiclesScreen.Edit;
import pcftest.ClaimPolicyVehicleDetail.ClaimPolicyVehiclesScreen.Update;
import pcftest.ClaimPolicyVehicleDetail.ClaimPolicyVehiclesScreen._msgs;
import pcftest.ClaimPolicyVehicleDetail._Paging;
import pcftest.ClaimPolicyVehicleDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyVehicleDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPolicyVehicleDetail extends PCFLocation {
  public final static String CHECKSUM = "8f565634085d519846f325156893a658";
  
  public ClaimPolicyVehicleDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimPolicyVehicleDetail"));
  }
  
  public ClaimPolicyVehicleDetail_UpLink getClaimPolicyVehicleDetail_UpLink() {
    return getOrCreateProperty("ClaimPolicyVehicleDetail_UpLink", "ClaimPolicyVehicleDetail_UpLink", null, pcftest.ClaimPolicyVehicleDetail.ClaimPolicyVehicleDetail_UpLink.class);
  }
  
  public ClaimPolicyVehiclesScreen getClaimPolicyVehiclesScreen() {
    return getOrCreateProperty("ClaimPolicyVehiclesScreen", "ClaimPolicyVehiclesScreen", null, pcftest.ClaimPolicyVehicleDetail.ClaimPolicyVehiclesScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimPolicyVehicleDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimPolicyVehicleDetail.__crumb__.class);
  }
  
  public ClaimPolicyVehicles get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPolicyVehicles.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyVehicleDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyVehicleDetail_UpLink extends ClickableActionElement {
    public ClaimPolicyVehicleDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyVehicleDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyVehiclesScreen extends PCFElement {
    public ClaimPolicyVehiclesScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ClaimPolicyVehicleDetail.ClaimPolicyVehiclesScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.ClaimPolicyVehicleDetail.ClaimPolicyVehiclesScreen.Edit.class);
    }
    
    public PolicyVehicleDetailPanelSet getPolicyVehicleDetailPanelSet() {
      return getOrCreateProperty("PolicyVehicleDetailPanelSet", "PolicyVehicleDetailPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.PolicyVehicleDetailPanelSet.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.ClaimPolicyVehicleDetail.ClaimPolicyVehiclesScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimPolicyVehicleDetail.ClaimPolicyVehiclesScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyVehicleDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyVehicleDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyVehicleDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyVehicleDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyVehicleDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyVehicleDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}