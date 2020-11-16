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
import pcftest.ClaimNoConfidentialNotesPrint.ClaimNoConfidentialNotesPrintScreen;
import pcftest.ClaimNoConfidentialNotesPrint.ClaimNoConfidentialNotesPrintScreen.NotesLV_tb;
import pcftest.ClaimNoConfidentialNotesPrint.ClaimNoConfidentialNotesPrintScreen._msgs;
import pcftest.ClaimNoConfidentialNotesPrint.ClaimNoConfidentialNotesPrint_UpLink;
import pcftest.ClaimNoConfidentialNotesPrint._Paging;
import pcftest.ClaimNoConfidentialNotesPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/printing/ClaimNoConfidentialNotesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimNoConfidentialNotesPrint extends PCFLocation {
  public final static String CHECKSUM = "59ed0da98802f92860b29c69d61a0dd8";
  
  public ClaimNoConfidentialNotesPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimNoConfidentialNotesPrint"));
  }
  
  public ClaimNoConfidentialNotesPrintScreen getClaimNoConfidentialNotesPrintScreen() {
    return getOrCreateProperty("ClaimNoConfidentialNotesPrintScreen", "ClaimNoConfidentialNotesPrintScreen", null, pcftest.ClaimNoConfidentialNotesPrint.ClaimNoConfidentialNotesPrintScreen.class);
  }
  
  public ClaimNoConfidentialNotesPrint_UpLink getClaimNoConfidentialNotesPrint_UpLink() {
    return getOrCreateProperty("ClaimNoConfidentialNotesPrint_UpLink", "ClaimNoConfidentialNotesPrint_UpLink", null, pcftest.ClaimNoConfidentialNotesPrint.ClaimNoConfidentialNotesPrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimNoConfidentialNotesPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimNoConfidentialNotesPrint.__crumb__.class);
  }
  
  public ClaimNotes get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimNotes.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimNoConfidentialNotesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNoConfidentialNotesPrintScreen extends PCFElement {
    public ClaimNoConfidentialNotesPrintScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NotesLV getNotesLV() {
      return getOrCreateProperty("NotesLV", "NotesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NotesLV.class);
    }
    
    public NotesLV_tb getNotesLV_tb() {
      return getOrCreateProperty("NotesLV_tb", "NotesLV_tb", null, pcftest.ClaimNoConfidentialNotesPrint.ClaimNoConfidentialNotesPrintScreen.NotesLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimNoConfidentialNotesPrint.ClaimNoConfidentialNotesPrintScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/printing/ClaimNoConfidentialNotesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NotesLV_tb extends PCFElement {
      public NotesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/printing/ClaimNoConfidentialNotesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/printing/ClaimNoConfidentialNotesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimNoConfidentialNotesPrint_UpLink extends ClickableActionElement {
    public ClaimNoConfidentialNotesPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimNoConfidentialNotesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimNoConfidentialNotesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}