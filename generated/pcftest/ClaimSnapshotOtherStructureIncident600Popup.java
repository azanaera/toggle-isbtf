package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotOtherStructureIncident600Popup.ClaimSnapshotOtherStructureIncident600Popup_UpLink;
import pcftest.ClaimSnapshotOtherStructureIncident600Popup._Paging;
import pcftest.ClaimSnapshotOtherStructureIncident600Popup.__crumb__;
import pcftest.ClaimSnapshotOtherStructureIncident600Popup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotOtherStructureIncident600Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotOtherStructureIncident600Popup extends PCFLocation {
  public final static String CHECKSUM = "01801bc7e4675f3682d276d0b33858fc";
  
  public ClaimSnapshotOtherStructureIncident600Popup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSnapshotOtherStructureIncident600Popup"));
  }
  
  public ClaimSnapshotOtherStructureIncident600Popup_UpLink getClaimSnapshotOtherStructureIncident600Popup_UpLink() {
    return getOrCreateProperty("ClaimSnapshotOtherStructureIncident600Popup_UpLink", "ClaimSnapshotOtherStructureIncident600Popup_UpLink", null, pcftest.ClaimSnapshotOtherStructureIncident600Popup.ClaimSnapshotOtherStructureIncident600Popup_UpLink.class);
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
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSnapshotOtherStructureIncident600Popup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSnapshotOtherStructureIncident600Popup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotOtherStructureIncident600Popup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotOtherStructureIncident600Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotOtherStructureIncident600Popup_UpLink extends ClickableActionElement {
    public ClaimSnapshotOtherStructureIncident600Popup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotOtherStructureIncident600Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotOtherStructureIncident600Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotOtherStructureIncident600Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}