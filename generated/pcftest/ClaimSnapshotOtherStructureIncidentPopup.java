package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotOtherStructureIncidentPopup.ClaimSnapshotOtherStructureIncidentPopup_UpLink;
import pcftest.ClaimSnapshotOtherStructureIncidentPopup._Paging;
import pcftest.ClaimSnapshotOtherStructureIncidentPopup.__crumb__;
import pcftest.ClaimSnapshotOtherStructureIncidentPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotOtherStructureIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotOtherStructureIncidentPopup extends PCFLocation {
  public final static String CHECKSUM = "14f29a5a222225f7ecd6591119fb8ac7";
  
  public ClaimSnapshotOtherStructureIncidentPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSnapshotOtherStructureIncidentPopup"));
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
  
  public ClaimSnapshotOtherStructureIncidentPopup_UpLink getClaimSnapshotOtherStructureIncidentPopup_UpLink() {
    return getOrCreateProperty("ClaimSnapshotOtherStructureIncidentPopup_UpLink", "ClaimSnapshotOtherStructureIncidentPopup_UpLink", null, pcftest.ClaimSnapshotOtherStructureIncidentPopup.ClaimSnapshotOtherStructureIncidentPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSnapshotOtherStructureIncidentPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSnapshotOtherStructureIncidentPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSnapshotOtherStructureIncidentPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotOtherStructureIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotOtherStructureIncidentPopup_UpLink extends ClickableActionElement {
    public ClaimSnapshotOtherStructureIncidentPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotOtherStructureIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotOtherStructureIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotOtherStructureIncidentPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}