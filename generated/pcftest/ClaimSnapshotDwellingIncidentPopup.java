package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotDwellingIncidentPopup.ClaimSnapshotDwellingIncidentPopup_UpLink;
import pcftest.ClaimSnapshotDwellingIncidentPopup._Paging;
import pcftest.ClaimSnapshotDwellingIncidentPopup.__crumb__;
import pcftest.ClaimSnapshotDwellingIncidentPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotDwellingIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotDwellingIncidentPopup extends PCFLocation {
  public final static String CHECKSUM = "936c5a58e00b03dc8d7d04563865ade7";
  
  public ClaimSnapshotDwellingIncidentPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSnapshotDwellingIncidentPopup"));
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
  
  public ClaimSnapshotDwellingIncidentPopup_UpLink getClaimSnapshotDwellingIncidentPopup_UpLink() {
    return getOrCreateProperty("ClaimSnapshotDwellingIncidentPopup_UpLink", "ClaimSnapshotDwellingIncidentPopup_UpLink", null, pcftest.ClaimSnapshotDwellingIncidentPopup.ClaimSnapshotDwellingIncidentPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSnapshotDwellingIncidentPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSnapshotDwellingIncidentPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotDwellingIncidentPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotDwellingIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotDwellingIncidentPopup_UpLink extends ClickableActionElement {
    public ClaimSnapshotDwellingIncidentPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotDwellingIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotDwellingIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotDwellingIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}