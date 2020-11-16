package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotNotes.ClaimSnapshotNotes_UpLink;
import pcftest.ClaimSnapshotNotes._Paging;
import pcftest.ClaimSnapshotNotes.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotNotes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotNotes extends PCFLocation {
  public final static String CHECKSUM = "23f037c5a7ad30841159e03e121b3b15";
  
  public ClaimSnapshotNotes(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSnapshotNotes"));
  }
  
  public ClaimSnapshotNotesScreen_300 getClaimSnapshotNotesScreen_300() {
    return getOrCreateProperty("ClaimSnapshotNotesScreen_300", "ClaimSnapshotNotesScreen", null, pcftest.ClaimSnapshotNotesScreen_300.class);
  }
  
  public ClaimSnapshotNotesScreen_310 getClaimSnapshotNotesScreen_310() {
    return getOrCreateProperty("ClaimSnapshotNotesScreen_310", "ClaimSnapshotNotesScreen", null, pcftest.ClaimSnapshotNotesScreen_310.class);
  }
  
  public ClaimSnapshotNotesScreen_400 getClaimSnapshotNotesScreen_400() {
    return getOrCreateProperty("ClaimSnapshotNotesScreen_400", "ClaimSnapshotNotesScreen", null, pcftest.ClaimSnapshotNotesScreen_400.class);
  }
  
  public ClaimSnapshotNotesScreen_500 getClaimSnapshotNotesScreen_500() {
    return getOrCreateProperty("ClaimSnapshotNotesScreen_500", "ClaimSnapshotNotesScreen", null, pcftest.ClaimSnapshotNotesScreen_500.class);
  }
  
  public ClaimSnapshotNotesScreen_600 getClaimSnapshotNotesScreen_600() {
    return getOrCreateProperty("ClaimSnapshotNotesScreen_600", "ClaimSnapshotNotesScreen", null, pcftest.ClaimSnapshotNotesScreen_600.class);
  }
  
  public ClaimSnapshotNotesScreen_700 getClaimSnapshotNotesScreen_700() {
    return getOrCreateProperty("ClaimSnapshotNotesScreen_700", "ClaimSnapshotNotesScreen", null, pcftest.ClaimSnapshotNotesScreen_700.class);
  }
  
  public ClaimSnapshotNotesScreen_800 getClaimSnapshotNotesScreen_800() {
    return getOrCreateProperty("ClaimSnapshotNotesScreen_800", "ClaimSnapshotNotesScreen", null, pcftest.ClaimSnapshotNotesScreen_800.class);
  }
  
  public ClaimSnapshotNotesScreen_default getClaimSnapshotNotesScreen_default() {
    return getOrCreateProperty("ClaimSnapshotNotesScreen_default", "ClaimSnapshotNotesScreen", null, pcftest.ClaimSnapshotNotesScreen_default.class);
  }
  
  public ClaimSnapshotNotes_UpLink getClaimSnapshotNotes_UpLink() {
    return getOrCreateProperty("ClaimSnapshotNotes_UpLink", "ClaimSnapshotNotes_UpLink", null, pcftest.ClaimSnapshotNotes.ClaimSnapshotNotes_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSnapshotNotes._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSnapshotNotes.__crumb__.class);
  }
  
  public ClaimSnapshotGroup get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimSnapshotGroup.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotNotes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotNotes_UpLink extends ClickableActionElement {
    public ClaimSnapshotNotes_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotNotes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/ClaimSnapshotNotes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}