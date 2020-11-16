package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ActivityDetailScreen_editable.ActivityDetailScreen_ActionButton;
import pcftest.ActivityDetailScreen_editable.ActivityDetailScreen_AddDocumentButton;
import pcftest.ActivityDetailScreen_editable.ActivityDetailScreen_AssignButton;
import pcftest.ActivityDetailScreen_editable.ActivityDetailScreen_CompleteButton;
import pcftest.ActivityDetailScreen_editable.ActivityDetailScreen_CreateEMailButton;
import pcftest.ActivityDetailScreen_editable.ActivityDetailScreen_NotesButton;
import pcftest.ActivityDetailScreen_editable.ActivityDetailScreen_RecurButton;
import pcftest.ActivityDetailScreen_editable.ActivityDetailScreen_SkipButton;
import pcftest.ActivityDetailScreen_editable.Cancel;
import pcftest.ActivityDetailScreen_editable.Close;
import pcftest.ActivityDetailScreen_editable.Edit;
import pcftest.ActivityDetailScreen_editable.IDCSDisabledAlert;
import pcftest.ActivityDetailScreen_editable.IDCSUnavailableAlert;
import pcftest.ActivityDetailScreen_editable.IDMSUnavailableAlert;
import pcftest.ActivityDetailScreen_editable.Update;
import pcftest.ActivityDetailScreen_editable._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailScreen.editable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityDetailScreen_editable extends ActivityDetailScreen {
  public final static String CHECKSUM = "05675757b6c3be589c56c3d43688270d";
  
  public ActivityDetailScreen_editable(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ActivityDV_catastrophe_review getActivityDV_catastrophe_review() {
    return getOrCreateProperty("ActivityDV_catastrophe_review", "ActivityDV", null, pcftest.ActivityDV_catastrophe_review.class);
  }
  
  public ActivityDV_default getActivityDV_default() {
    return getOrCreateProperty("ActivityDV_default", "ActivityDV", null, pcftest.ActivityDV_default.class);
  }
  
  public ActivityDetailScreen_ActionButton getActivityDetailScreen_ActionButton() {
    return getOrCreateProperty("ActivityDetailScreen_ActionButton", "ActivityDetailScreen_ActionButton", null, pcftest.ActivityDetailScreen_editable.ActivityDetailScreen_ActionButton.class);
  }
  
  public ActivityDetailScreen_AddDocumentButton getActivityDetailScreen_AddDocumentButton() {
    return getOrCreateProperty("ActivityDetailScreen_AddDocumentButton", "ActivityDetailScreen_AddDocumentButton", null, pcftest.ActivityDetailScreen_editable.ActivityDetailScreen_AddDocumentButton.class);
  }
  
  public ActivityDetailScreen_AssignButton getActivityDetailScreen_AssignButton() {
    return getOrCreateProperty("ActivityDetailScreen_AssignButton", "ActivityDetailScreen_AssignButton", null, pcftest.ActivityDetailScreen_editable.ActivityDetailScreen_AssignButton.class);
  }
  
  public ActivityDetailScreen_CompleteButton getActivityDetailScreen_CompleteButton() {
    return getOrCreateProperty("ActivityDetailScreen_CompleteButton", "ActivityDetailScreen_CompleteButton", null, pcftest.ActivityDetailScreen_editable.ActivityDetailScreen_CompleteButton.class);
  }
  
  public ActivityDetailScreen_CreateEMailButton getActivityDetailScreen_CreateEMailButton() {
    return getOrCreateProperty("ActivityDetailScreen_CreateEMailButton", "ActivityDetailScreen_CreateEMailButton", null, pcftest.ActivityDetailScreen_editable.ActivityDetailScreen_CreateEMailButton.class);
  }
  
  public ActivityDetailScreen_NotesButton getActivityDetailScreen_NotesButton() {
    return getOrCreateProperty("ActivityDetailScreen_NotesButton", "ActivityDetailScreen_NotesButton", null, pcftest.ActivityDetailScreen_editable.ActivityDetailScreen_NotesButton.class);
  }
  
  public ActivityDetailScreen_RecurButton getActivityDetailScreen_RecurButton() {
    return getOrCreateProperty("ActivityDetailScreen_RecurButton", "ActivityDetailScreen_RecurButton", null, pcftest.ActivityDetailScreen_editable.ActivityDetailScreen_RecurButton.class);
  }
  
  public ActivityDetailScreen_SkipButton getActivityDetailScreen_SkipButton() {
    return getOrCreateProperty("ActivityDetailScreen_SkipButton", "ActivityDetailScreen_SkipButton", null, pcftest.ActivityDetailScreen_editable.ActivityDetailScreen_SkipButton.class);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ActivityDetailScreen_editable.Cancel.class);
  }
  
  public Close getClose() {
    return getOrCreateProperty("Close", "Close", null, pcftest.ActivityDetailScreen_editable.Close.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.ActivityDetailScreen_editable.Edit.class);
  }
  
  public IDCSDisabledAlert getIDCSDisabledAlert() {
    return getOrCreateProperty("IDCSDisabledAlert", "IDCSDisabledAlert", null, pcftest.ActivityDetailScreen_editable.IDCSDisabledAlert.class);
  }
  
  public IDCSUnavailableAlert getIDCSUnavailableAlert() {
    return getOrCreateProperty("IDCSUnavailableAlert", "IDCSUnavailableAlert", null, pcftest.ActivityDetailScreen_editable.IDCSUnavailableAlert.class);
  }
  
  public IDMSUnavailableAlert getIDMSUnavailableAlert() {
    return getOrCreateProperty("IDMSUnavailableAlert", "IDMSUnavailableAlert", null, pcftest.ActivityDetailScreen_editable.IDMSUnavailableAlert.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.ActivityDetailScreen_editable.Update.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ActivityDetailScreen_editable._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailScreen.editable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityDetailScreen_ActionButton extends ClickableActionElement {
    public ActivityDetailScreen_ActionButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailScreen.editable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityDetailScreen_AddDocumentButton extends ClickableActionElement {
    public ActivityDetailScreen_AddDocumentButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PickExistingDocumentPopup click() {
      return clickThis(pcftest.PickExistingDocumentPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailScreen.editable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityDetailScreen_AssignButton extends ClickableActionElement {
    public ActivityDetailScreen_AssignButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailScreen.editable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityDetailScreen_CompleteButton extends ClickableActionElement {
    public ActivityDetailScreen_CompleteButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailScreen.editable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityDetailScreen_CreateEMailButton extends ClickableActionElement {
    public ActivityDetailScreen_CreateEMailButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EmailWorksheet click() {
      return clickThis(pcftest.EmailWorksheet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailScreen.editable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityDetailScreen_NotesButton extends ClickableActionElement {
    public ActivityDetailScreen_NotesButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ActivityNotesPage click() {
      return clickThis(pcftest.ActivityNotesPage.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailScreen.editable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityDetailScreen_RecurButton extends ClickableActionElement {
    public ActivityDetailScreen_RecurButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailScreen.editable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityDetailScreen_SkipButton extends ClickableActionElement {
    public ActivityDetailScreen_SkipButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailScreen.editable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailScreen.editable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Close extends ClickableActionElement {
    public Close(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailScreen.editable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailScreen.editable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IDCSDisabledAlert extends ClickableActionElement {
    public IDCSDisabledAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.ActivityDetailScreen_editable.IDCSDisabledAlert.CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.ActivityDetailScreen_editable.IDCSDisabledAlert.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailScreen.editable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CloseBtn extends ClickableActionElement {
      public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailScreen.editable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IDCSUnavailableAlert extends ClickableActionElement {
    public IDCSUnavailableAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.ActivityDetailScreen_editable.IDCSUnavailableAlert.CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.ActivityDetailScreen_editable.IDCSUnavailableAlert.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailScreen.editable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CloseBtn extends ClickableActionElement {
      public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailScreen.editable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IDMSUnavailableAlert extends ClickableActionElement {
    public IDMSUnavailableAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.ActivityDetailScreen_editable.IDMSUnavailableAlert.CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.ActivityDetailScreen_editable.IDMSUnavailableAlert.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailScreen.editable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CloseBtn extends ClickableActionElement {
      public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailScreen.editable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailScreen.editable.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}