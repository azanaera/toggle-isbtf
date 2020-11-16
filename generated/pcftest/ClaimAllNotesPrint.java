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
import pcftest.ClaimAllNotesPrint.ClaimAllNotesPrintScreen;
import pcftest.ClaimAllNotesPrint.ClaimAllNotesPrintScreen.NotesLV_tb;
import pcftest.ClaimAllNotesPrint.ClaimAllNotesPrintScreen._msgs;
import pcftest.ClaimAllNotesPrint.ClaimAllNotesPrint_UpLink;
import pcftest.ClaimAllNotesPrint._Paging;
import pcftest.ClaimAllNotesPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/printing/ClaimAllNotesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimAllNotesPrint extends PCFLocation {
  public final static String CHECKSUM = "b078d3ecf4bcc3099ee6dfa3981cbb9d";
  
  public ClaimAllNotesPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimAllNotesPrint"));
  }
  
  public ClaimAllNotesPrintScreen getClaimAllNotesPrintScreen() {
    return getOrCreateProperty("ClaimAllNotesPrintScreen", "ClaimAllNotesPrintScreen", null, pcftest.ClaimAllNotesPrint.ClaimAllNotesPrintScreen.class);
  }
  
  public ClaimAllNotesPrint_UpLink getClaimAllNotesPrint_UpLink() {
    return getOrCreateProperty("ClaimAllNotesPrint_UpLink", "ClaimAllNotesPrint_UpLink", null, pcftest.ClaimAllNotesPrint.ClaimAllNotesPrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimAllNotesPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimAllNotesPrint.__crumb__.class);
  }
  
  public ClaimNotes get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimNotes.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimAllNotesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimAllNotesPrintScreen extends PCFElement {
    public ClaimAllNotesPrintScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NotesLV getNotesLV() {
      return getOrCreateProperty("NotesLV", "NotesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NotesLV.class);
    }
    
    public NotesLV_tb getNotesLV_tb() {
      return getOrCreateProperty("NotesLV_tb", "NotesLV_tb", null, pcftest.ClaimAllNotesPrint.ClaimAllNotesPrintScreen.NotesLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimAllNotesPrint.ClaimAllNotesPrintScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/printing/ClaimAllNotesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NotesLV_tb extends PCFElement {
      public NotesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/printing/ClaimAllNotesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/printing/ClaimAllNotesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimAllNotesPrint_UpLink extends ClickableActionElement {
    public ClaimAllNotesPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimAllNotesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimAllNotesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}