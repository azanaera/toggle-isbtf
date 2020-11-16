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
import pcftest.PickNoteTemplatePopup.PickNoteTemplatePopup_UpLink;
import pcftest.PickNoteTemplatePopup.PickNoteTemplateScreen;
import pcftest.PickNoteTemplatePopup.PickNoteTemplateScreen.PickNoteTemplatePopup_CancelButton;
import pcftest.PickNoteTemplatePopup.PickNoteTemplateScreen._msgs;
import pcftest.PickNoteTemplatePopup._Paging;
import pcftest.PickNoteTemplatePopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newnote/PickNoteTemplatePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PickNoteTemplatePopup extends PCFLocation {
  public final static String CHECKSUM = "08bae3066fbc20de8dbb42f0d77932b0";
  
  public PickNoteTemplatePopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("PickNoteTemplatePopup"));
  }
  
  public PickNoteTemplatePopup_UpLink getPickNoteTemplatePopup_UpLink() {
    return getOrCreateProperty("PickNoteTemplatePopup_UpLink", "PickNoteTemplatePopup_UpLink", null, pcftest.PickNoteTemplatePopup.PickNoteTemplatePopup_UpLink.class);
  }
  
  public PickNoteTemplateScreen getPickNoteTemplateScreen() {
    return getOrCreateProperty("PickNoteTemplateScreen", "PickNoteTemplateScreen", null, pcftest.PickNoteTemplatePopup.PickNoteTemplateScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.PickNoteTemplatePopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.PickNoteTemplatePopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newnote/PickNoteTemplatePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PickNoteTemplatePopup_UpLink extends ClickableActionElement {
    public PickNoteTemplatePopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newnote/PickNoteTemplatePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PickNoteTemplateScreen extends PCFElement {
    public PickNoteTemplateScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NoteTemplateSearchDV getNoteTemplateSearchDV() {
      return getOrCreateProperty("NoteTemplateSearchDV", "NoteTemplateSearchDV", null, pcftest.NoteTemplateSearchDV.class);
    }
    
    public NoteTemplateSearchResultLV getNoteTemplateSearchResultLV() {
      return getOrCreateProperty("NoteTemplateSearchResultLV", "NoteTemplateSearchResultLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NoteTemplateSearchResultLV.class);
    }
    
    public PickNoteTemplatePopup_CancelButton getPickNoteTemplatePopup_CancelButton() {
      return getOrCreateProperty("PickNoteTemplatePopup_CancelButton", "PickNoteTemplatePopup_CancelButton", null, pcftest.PickNoteTemplatePopup.PickNoteTemplateScreen.PickNoteTemplatePopup_CancelButton.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.PickNoteTemplatePopup.PickNoteTemplateScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newnote/PickNoteTemplatePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PickNoteTemplatePopup_CancelButton extends ClickableActionElement {
      public PickNoteTemplatePopup_CancelButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/newnote/PickNoteTemplatePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/newnote/PickNoteTemplatePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/newnote/PickNoteTemplatePopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}