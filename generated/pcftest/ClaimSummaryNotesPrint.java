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
import pcftest.ClaimSummaryNotesPrint.ClaimSummaryNotesPrintScreen;
import pcftest.ClaimSummaryNotesPrint.ClaimSummaryNotesPrintScreen.NotesLV_tb;
import pcftest.ClaimSummaryNotesPrint.ClaimSummaryNotesPrintScreen._msgs;
import pcftest.ClaimSummaryNotesPrint.ClaimSummaryNotesPrint_UpLink;
import pcftest.ClaimSummaryNotesPrint._Paging;
import pcftest.ClaimSummaryNotesPrint.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryNotesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSummaryNotesPrint extends PCFLocation {
  public final static String CHECKSUM = "91a1ec6e4a1b55b0e5aa73359827920c";
  
  public ClaimSummaryNotesPrint(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ClaimSummaryNotesPrint"));
  }
  
  public ClaimSummaryNotesPrintScreen getClaimSummaryNotesPrintScreen() {
    return getOrCreateProperty("ClaimSummaryNotesPrintScreen", "ClaimSummaryNotesPrintScreen", null, pcftest.ClaimSummaryNotesPrint.ClaimSummaryNotesPrintScreen.class);
  }
  
  public ClaimSummaryNotesPrint_UpLink getClaimSummaryNotesPrint_UpLink() {
    return getOrCreateProperty("ClaimSummaryNotesPrint_UpLink", "ClaimSummaryNotesPrint_UpLink", null, pcftest.ClaimSummaryNotesPrint.ClaimSummaryNotesPrint_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ClaimSummaryNotesPrint._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ClaimSummaryNotesPrint.__crumb__.class);
  }
  
  public ClaimPrintout get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimPrintout.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryNotesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryNotesPrintScreen extends PCFElement {
    public ClaimSummaryNotesPrintScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NotesLV getNotesLV() {
      return getOrCreateProperty("NotesLV", "NotesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NotesLV.class);
    }
    
    public NotesLV_tb getNotesLV_tb() {
      return getOrCreateProperty("NotesLV_tb", "NotesLV_tb", null, pcftest.ClaimSummaryNotesPrint.ClaimSummaryNotesPrintScreen.NotesLV_tb.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ClaimSummaryNotesPrint.ClaimSummaryNotesPrintScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryNotesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NotesLV_tb extends PCFElement {
      public NotesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryNotesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryNotesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSummaryNotesPrint_UpLink extends ClickableActionElement {
    public ClaimSummaryNotesPrint_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryNotesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/printing/ClaimSummaryNotesPrint.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}