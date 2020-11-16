package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ActivityPatternDetailScreen.ActivityPatternDetailScreen_DeleteButton;
import pcftest.ActivityPatternDetailScreen.Cancel;
import pcftest.ActivityPatternDetailScreen.Edit;
import pcftest.ActivityPatternDetailScreen.LocalizedValues;
import pcftest.ActivityPatternDetailScreen.Update;
import pcftest.ActivityPatternDetailScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/activitypatterns/ActivityPatternDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityPatternDetailScreen extends PCFElement {
  public final static String CHECKSUM = "2e2be55abe94bf489aca3dbc302f9cbc";
  
  public ActivityPatternDetailScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ActivityPatternDetailScreen_DeleteButton getActivityPatternDetailScreen_DeleteButton() {
    return getOrCreateProperty("ActivityPatternDetailScreen_DeleteButton", "ActivityPatternDetailScreen_DeleteButton", null, pcftest.ActivityPatternDetailScreen.ActivityPatternDetailScreen_DeleteButton.class);
  }
  
  public AdminActivityPatternDV getAdminActivityPatternDV() {
    return getOrCreateProperty("AdminActivityPatternDV", "AdminActivityPatternDV", null, pcftest.AdminActivityPatternDV.class);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.ActivityPatternDetailScreen.Cancel.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.ActivityPatternDetailScreen.Edit.class);
  }
  
  public LocalizedValues getLocalizedValues() {
    return getOrCreateProperty("LocalizedValues", "LocalizedValues", null, pcftest.ActivityPatternDetailScreen.LocalizedValues.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.ActivityPatternDetailScreen.Update.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ActivityPatternDetailScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/ActivityPatternDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityPatternDetailScreen_DeleteButton extends ClickableActionElement {
    public ActivityPatternDetailScreen_DeleteButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/ActivityPatternDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/ActivityPatternDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/ActivityPatternDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocalizedValues extends PCFElement {
    public LocalizedValues(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LocalizedValuesDV getLocalizedValuesDV() {
      return getOrCreateProperty("LocalizedValuesDV", "LocalizedValuesDV", null, pcftest.LocalizedValuesDV.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/ActivityPatternDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/activitypatterns/ActivityPatternDetailScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}