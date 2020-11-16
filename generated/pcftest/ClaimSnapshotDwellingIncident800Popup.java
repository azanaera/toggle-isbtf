package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotDwellingIncident800Popup.ClaimSnapshotDwellingIncident800Popup_UpLink;
import pcftest.ClaimSnapshotDwellingIncident800Popup._Paging;
import pcftest.ClaimSnapshotDwellingIncident800Popup.__crumb__;
import pcftest.ClaimSnapshotDwellingIncident800Popup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotDwellingIncident800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotDwellingIncident800Popup extends PCFLocation {
  public final static String CHECKSUM = "6c680aabd55f950851b878b835d9edca";
  
  public ClaimSnapshotDwellingIncident800Popup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSnapshotDwellingIncident800Popup"));
  }
  
  public ClaimSnapshotDwellingIncident800Popup_UpLink getClaimSnapshotDwellingIncident800Popup_UpLink() {
    return getOrCreateProperty("ClaimSnapshotDwellingIncident800Popup_UpLink", "ClaimSnapshotDwellingIncident800Popup_UpLink", null, pcftest.ClaimSnapshotDwellingIncident800Popup.ClaimSnapshotDwellingIncident800Popup_UpLink.class);
  }
  
  public ClaimSnapshotDwellingIncidentCV_600 getClaimSnapshotDwellingIncidentCV_600() {
    return getOrCreateProperty("ClaimSnapshotDwellingIncidentCV_600", "ClaimSnapshotDwellingIncidentCV", null, pcftest.ClaimSnapshotDwellingIncidentCV_600.class);
  }
  
  public ClaimSnapshotDwellingIncidentCV_700 getClaimSnapshotDwellingIncidentCV_700() {
    return getOrCreateProperty("ClaimSnapshotDwellingIncidentCV_700", "ClaimSnapshotDwellingIncidentCV", null, pcftest.ClaimSnapshotDwellingIncidentCV_700.class);
  }
  
  public ClaimSnapshotDwellingIncidentCV_800 getClaimSnapshotDwellingIncidentCV_800() {
    return getOrCreateProperty("ClaimSnapshotDwellingIncidentCV_800", "ClaimSnapshotDwellingIncidentCV", null, pcftest.ClaimSnapshotDwellingIncidentCV_800.class);
  }
  
  public ClaimSnapshotDwellingIncidentCV_default getClaimSnapshotDwellingIncidentCV_default() {
    return getOrCreateProperty("ClaimSnapshotDwellingIncidentCV_default", "ClaimSnapshotDwellingIncidentCV", null, pcftest.ClaimSnapshotDwellingIncidentCV_default.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSnapshotDwellingIncident800Popup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSnapshotDwellingIncident800Popup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotDwellingIncident800Popup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotDwellingIncident800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotDwellingIncident800Popup_UpLink extends ClickableActionElement {
    public ClaimSnapshotDwellingIncident800Popup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotDwellingIncident800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotDwellingIncident800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/800/ClaimSnapshotDwellingIncident800Popup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}