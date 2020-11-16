package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLWizard_EditNoteScreen.Cancel;
import pcftest.FNOLWizard_EditNoteScreen.Edit;
import pcftest.FNOLWizard_EditNoteScreen.EditNote_DeleteButton;
import pcftest.FNOLWizard_EditNoteScreen.Update;
import pcftest.FNOLWizard_EditNoteScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_EditNoteScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_EditNoteScreen extends PCFElement {
  public final static String CHECKSUM = "97533ca19dfaff16cb96f0d3e09a1a4d";
  
  public FNOLWizard_EditNoteScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.FNOLWizard_EditNoteScreen.Cancel.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.FNOLWizard_EditNoteScreen.Edit.class);
  }
  
  public EditNote_DeleteButton getEditNote_DeleteButton() {
    return getOrCreateProperty("EditNote_DeleteButton", "EditNote_DeleteButton", null, pcftest.FNOLWizard_EditNoteScreen.EditNote_DeleteButton.class);
  }
  
  public NoteDetailDV getNoteDetailDV() {
    return getOrCreateProperty("NoteDetailDV", "NoteDetailDV", null, pcftest.NoteDetailDV.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.FNOLWizard_EditNoteScreen.Update.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FNOLWizard_EditNoteScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_EditNoteScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_EditNoteScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_EditNoteScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditNote_DeleteButton extends ClickableActionElement {
    public EditNote_DeleteButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_EditNoteScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_EditNoteScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}