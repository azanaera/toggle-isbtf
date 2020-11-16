package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimNotes.ClaimNotes_UpLink;
import pcftest.ClaimNotes._Paging;
import pcftest.ClaimNotes.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/notes/ClaimNotes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimNotes extends PCFLocation {
  public final static String CHECKSUM = "32fab36ab1703f539aafaff6b981843b";
  
  public ClaimNotes(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimNotes"));
  }
  
  public ClaimNotes_UpLink getClaimNotes_UpLink() {
    return getOrCreateProperty("ClaimNotes_UpLink", "ClaimNotes_UpLink", null, pcftest.ClaimNotes.ClaimNotes_UpLink.class);
  }
  
  public NotesSearchScreen getNotesSearchScreen() {
    return getOrCreateProperty("NotesSearchScreen", "NotesSearchScreen", null, pcftest.NotesSearchScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimNotes._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimNotes.__crumb__.class);
  }
  
  public Claim get_parent() {
    return getOrCreateProperty("_parent", pcftest.Claim.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/notes/ClaimNotes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNotes_UpLink extends ClickableActionElement {
    public ClaimNotes_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/notes/ClaimNotes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/notes/ClaimNotes.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}