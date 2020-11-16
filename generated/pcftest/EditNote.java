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
import pcftest.EditNote.EditNoteScreen;
import pcftest.EditNote.EditNoteScreen.Cancel;
import pcftest.EditNote.EditNoteScreen.Edit;
import pcftest.EditNote.EditNoteScreen.EditNote_DeleteButton;
import pcftest.EditNote.EditNoteScreen.Update;
import pcftest.EditNote.EditNoteScreen._msgs;
import pcftest.EditNote.EditNote_UpLink;
import pcftest.EditNote._Paging;
import pcftest.EditNote.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/notes/EditNote.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditNote extends PCFLocation {
  public final static String CHECKSUM = "daeaeceefc783901d1bd8b395321f575";
  
  public EditNote(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("EditNote"));
  }
  
  public EditNoteScreen getEditNoteScreen() {
    return getOrCreateProperty("EditNoteScreen", "EditNoteScreen", null, pcftest.EditNote.EditNoteScreen.class);
  }
  
  public EditNote_UpLink getEditNote_UpLink() {
    return getOrCreateProperty("EditNote_UpLink", "EditNote_UpLink", null, pcftest.EditNote.EditNote_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.EditNote._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.EditNote.__crumb__.class);
  }
  
  public ClaimNotes get_parent() {
    return getOrCreateProperty("_parent", pcftest.ClaimNotes.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/notes/EditNote.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditNoteScreen extends PCFElement {
    public EditNoteScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.EditNote.EditNoteScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.EditNote.EditNoteScreen.Edit.class);
    }
    
    public EditNote_DeleteButton getEditNote_DeleteButton() {
      return getOrCreateProperty("EditNote_DeleteButton", "EditNote_DeleteButton", null, pcftest.EditNote.EditNoteScreen.EditNote_DeleteButton.class);
    }
    
    public NoteDetailDV getNoteDetailDV() {
      return getOrCreateProperty("NoteDetailDV", "NoteDetailDV", null, pcftest.NoteDetailDV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.EditNote.EditNoteScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.EditNote.EditNoteScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/notes/EditNote.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/notes/EditNote.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/notes/EditNote.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditNote_DeleteButton extends ClickableActionElement {
      public EditNote_DeleteButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/notes/EditNote.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/notes/EditNote.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/notes/EditNote.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditNote_UpLink extends ClickableActionElement {
    public EditNote_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/notes/EditNote.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/notes/EditNote.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}