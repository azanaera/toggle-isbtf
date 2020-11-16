package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ActivityDetailScreen_readonly.Close;
import pcftest.ActivityDetailScreen_readonly.ReadOnlyActivityDetailWorksheet_AssignButton;
import pcftest.ActivityDetailScreen_readonly.ReadOnlyActivityDetailWorksheet_NotesButton;
import pcftest.ActivityDetailScreen_readonly._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailScreen.readonly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityDetailScreen_readonly extends ActivityDetailScreen {
  public final static String CHECKSUM = "1146a02e0562ed277b02f4c59b2a2bd7";
  
  public ActivityDetailScreen_readonly(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ActivitySansNoteDV_catastrophe_review getActivitySansNoteDV_catastrophe_review() {
    return getOrCreateProperty("ActivitySansNoteDV_catastrophe_review", "ActivitySansNoteDV", null, pcftest.ActivitySansNoteDV_catastrophe_review.class);
  }
  
  public ActivitySansNoteDV_default getActivitySansNoteDV_default() {
    return getOrCreateProperty("ActivitySansNoteDV_default", "ActivitySansNoteDV", null, pcftest.ActivitySansNoteDV_default.class);
  }
  
  public Close getClose() {
    return getOrCreateProperty("Close", "Close", null, pcftest.ActivityDetailScreen_readonly.Close.class);
  }
  
  public ReadOnlyActivityDetailWorksheet_AssignButton getReadOnlyActivityDetailWorksheet_AssignButton() {
    return getOrCreateProperty("ReadOnlyActivityDetailWorksheet_AssignButton", "ReadOnlyActivityDetailWorksheet_AssignButton", null, pcftest.ActivityDetailScreen_readonly.ReadOnlyActivityDetailWorksheet_AssignButton.class);
  }
  
  public ReadOnlyActivityDetailWorksheet_NotesButton getReadOnlyActivityDetailWorksheet_NotesButton() {
    return getOrCreateProperty("ReadOnlyActivityDetailWorksheet_NotesButton", "ReadOnlyActivityDetailWorksheet_NotesButton", null, pcftest.ActivityDetailScreen_readonly.ReadOnlyActivityDetailWorksheet_NotesButton.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ActivityDetailScreen_readonly._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailScreen.readonly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Close extends ClickableActionElement {
    public Close(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailScreen.readonly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReadOnlyActivityDetailWorksheet_AssignButton extends ClickableActionElement {
    public ReadOnlyActivityDetailWorksheet_AssignButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailScreen.readonly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReadOnlyActivityDetailWorksheet_NotesButton extends ClickableActionElement {
    public ReadOnlyActivityDetailWorksheet_NotesButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ActivityNotesPage click() {
      return clickThis(pcftest.ActivityNotesPage.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/workspace/activity/ActivityDetailScreen.readonly.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}