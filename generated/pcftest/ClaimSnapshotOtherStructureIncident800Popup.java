package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotOtherStructureIncident800Popup.ClaimSnapshotOtherStructureIncident800Popup_UpLink;
import pcftest.ClaimSnapshotOtherStructureIncident800Popup._Paging;
import pcftest.ClaimSnapshotOtherStructureIncident800Popup.__crumb__;
import pcftest.ClaimSnapshotOtherStructureIncident800Popup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotOtherStructureIncident800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotOtherStructureIncident800Popup extends PCFLocation {
  public final static String CHECKSUM = "5e4b1d2b9fb27b3c26fa990d2ee7fbb4";
  
  public ClaimSnapshotOtherStructureIncident800Popup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSnapshotOtherStructureIncident800Popup"));
  }
  
  public ClaimSnapshotOtherStructureIncident800Popup_UpLink getClaimSnapshotOtherStructureIncident800Popup_UpLink() {
    return getOrCreateProperty("ClaimSnapshotOtherStructureIncident800Popup_UpLink", "ClaimSnapshotOtherStructureIncident800Popup_UpLink", null, pcftest.ClaimSnapshotOtherStructureIncident800Popup.ClaimSnapshotOtherStructureIncident800Popup_UpLink.class);
  }
  
  public ClaimSnapshotOtherStructureIncidentCV_600 getClaimSnapshotOtherStructureIncidentCV_600() {
    return getOrCreateProperty("ClaimSnapshotOtherStructureIncidentCV_600", "ClaimSnapshotOtherStructureIncidentCV", null, pcftest.ClaimSnapshotOtherStructureIncidentCV_600.class);
  }
  
  public ClaimSnapshotOtherStructureIncidentCV_700 getClaimSnapshotOtherStructureIncidentCV_700() {
    return getOrCreateProperty("ClaimSnapshotOtherStructureIncidentCV_700", "ClaimSnapshotOtherStructureIncidentCV", null, pcftest.ClaimSnapshotOtherStructureIncidentCV_700.class);
  }
  
  public ClaimSnapshotOtherStructureIncidentCV_800 getClaimSnapshotOtherStructureIncidentCV_800() {
    return getOrCreateProperty("ClaimSnapshotOtherStructureIncidentCV_800", "ClaimSnapshotOtherStructureIncidentCV", null, pcftest.ClaimSnapshotOtherStructureIncidentCV_800.class);
  }
  
  public ClaimSnapshotOtherStructureIncidentCV_default getClaimSnapshotOtherStructureIncidentCV_default() {
    return getOrCreateProperty("ClaimSnapshotOtherStructureIncidentCV_default", "ClaimSnapshotOtherStructureIncidentCV", null, pcftest.ClaimSnapshotOtherStructureIncidentCV_default.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSnapshotOtherStructureIncident800Popup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSnapshotOtherStructureIncident800Popup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotOtherStructureIncident800Popup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotOtherStructureIncident800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotOtherStructureIncident800Popup_UpLink extends ClickableActionElement {
    public ClaimSnapshotOtherStructureIncident800Popup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotOtherStructureIncident800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotOtherStructureIncident800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotOtherStructureIncident800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}