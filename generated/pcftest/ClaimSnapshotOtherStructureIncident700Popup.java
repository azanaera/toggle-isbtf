package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotOtherStructureIncident700Popup.ClaimSnapshotOtherStructureIncident700Popup_UpLink;
import pcftest.ClaimSnapshotOtherStructureIncident700Popup._Paging;
import pcftest.ClaimSnapshotOtherStructureIncident700Popup.__crumb__;
import pcftest.ClaimSnapshotOtherStructureIncident700Popup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotOtherStructureIncident700Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotOtherStructureIncident700Popup extends PCFLocation {
  public final static String CHECKSUM = "b0826b83ec58dfa2eb99dcaef46fcc92";
  
  public ClaimSnapshotOtherStructureIncident700Popup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSnapshotOtherStructureIncident700Popup"));
  }
  
  public ClaimSnapshotOtherStructureIncident700Popup_UpLink getClaimSnapshotOtherStructureIncident700Popup_UpLink() {
    return getOrCreateProperty("ClaimSnapshotOtherStructureIncident700Popup_UpLink", "ClaimSnapshotOtherStructureIncident700Popup_UpLink", null, pcftest.ClaimSnapshotOtherStructureIncident700Popup.ClaimSnapshotOtherStructureIncident700Popup_UpLink.class);
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
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSnapshotOtherStructureIncident700Popup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSnapshotOtherStructureIncident700Popup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotOtherStructureIncident700Popup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotOtherStructureIncident700Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotOtherStructureIncident700Popup_UpLink extends ClickableActionElement {
    public ClaimSnapshotOtherStructureIncident700Popup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotOtherStructureIncident700Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotOtherStructureIncident700Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotOtherStructureIncident700Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}