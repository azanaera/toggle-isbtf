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
import pcftest.ClaimPolicyTrips.ClaimPolicyTripsSegmentsScreen;
import pcftest.ClaimPolicyTrips.ClaimPolicyTripsSegmentsScreen.Add;
import pcftest.ClaimPolicyTrips.ClaimPolicyTripsSegmentsScreen.Cancel;
import pcftest.ClaimPolicyTrips.ClaimPolicyTripsSegmentsScreen.ClaimPolicyTrip_DeverifyPolicy;
import pcftest.ClaimPolicyTrips.ClaimPolicyTripsSegmentsScreen.ClaimPolicyTrip_EditButton;
import pcftest.ClaimPolicyTrips.ClaimPolicyTripsSegmentsScreen.Edit;
import pcftest.ClaimPolicyTrips.ClaimPolicyTripsSegmentsScreen.Remove;
import pcftest.ClaimPolicyTrips.ClaimPolicyTripsSegmentsScreen.Update;
import pcftest.ClaimPolicyTrips.ClaimPolicyTripsSegmentsScreen._msgs;
import pcftest.ClaimPolicyTrips.ClaimPolicyTrips_UpLink;
import pcftest.ClaimPolicyTrips._Paging;
import pcftest.ClaimPolicyTrips.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyTrips.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimPolicyTrips extends PCFLocation {
  public final static String CHECKSUM = "d77b8a60242e1b1e470c2fdcc5087efa";
  
  public ClaimPolicyTrips(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimPolicyTrips"));
  }
  
  public ClaimPolicyTripsSegmentsScreen getClaimPolicyTripsSegmentsScreen() {
    return getOrCreateProperty("ClaimPolicyTripsSegmentsScreen", "ClaimPolicyTripsSegmentsScreen", null, pcftest.ClaimPolicyTrips.ClaimPolicyTripsSegmentsScreen.class);
  }
  
  public ClaimPolicyTrips_UpLink getClaimPolicyTrips_UpLink() {
    return getOrCreateProperty("ClaimPolicyTrips_UpLink", "ClaimPolicyTrips_UpLink", null, pcftest.ClaimPolicyTrips.ClaimPolicyTrips_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimPolicyTrips._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimPolicyTrips.__crumb__.class);
  }
  
  public ClaimPolicyGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPolicyGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyTrips.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyTripsSegmentsScreen extends PCFElement {
    public ClaimPolicyTripsSegmentsScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.ClaimPolicyTrips.ClaimPolicyTripsSegmentsScreen.Add.class);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ClaimPolicyTrips.ClaimPolicyTripsSegmentsScreen.Cancel.class);
    }
    
    public ClaimPolicyTrip_DeverifyPolicy getClaimPolicyTrip_DeverifyPolicy() {
      return getOrCreateProperty("ClaimPolicyTrip_DeverifyPolicy", "ClaimPolicyTrip_DeverifyPolicy", null, pcftest.ClaimPolicyTrips.ClaimPolicyTripsSegmentsScreen.ClaimPolicyTrip_DeverifyPolicy.class);
    }
    
    public ClaimPolicyTrip_EditButton getClaimPolicyTrip_EditButton() {
      return getOrCreateProperty("ClaimPolicyTrip_EditButton", "ClaimPolicyTrip_EditButton", null, pcftest.ClaimPolicyTrips.ClaimPolicyTripsSegmentsScreen.ClaimPolicyTrip_EditButton.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.ClaimPolicyTrips.ClaimPolicyTripsSegmentsScreen.Edit.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.ClaimPolicyTrips.ClaimPolicyTripsSegmentsScreen.Remove.class);
    }
    
    public TripLDV getTripLDV() {
      return getOrCreateProperty("TripLDV", "TripLDV", null, pcftest.TripLDV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.ClaimPolicyTrips.ClaimPolicyTripsSegmentsScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimPolicyTrips.ClaimPolicyTripsSegmentsScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyTrips.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyTrips.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyTrips.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimPolicyTrip_DeverifyPolicy extends ClickableActionElement {
      public ClaimPolicyTrip_DeverifyPolicy(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyTrips.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimPolicyTrip_EditButton extends ClickableActionElement {
      public ClaimPolicyTrip_EditButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyTrips.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyTrips.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyTrips.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyTrips.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyTrips.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimPolicyTrips_UpLink extends ClickableActionElement {
    public ClaimPolicyTrips_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyTrips.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/ClaimPolicyTrips.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}