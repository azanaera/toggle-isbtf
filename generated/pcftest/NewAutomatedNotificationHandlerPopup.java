package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewAutomatedNotificationHandlerPopup.Cancel;
import pcftest.NewAutomatedNotificationHandlerPopup.Edit;
import pcftest.NewAutomatedNotificationHandlerPopup.NewAutomatedNotificationHandlerPopup_UpLink;
import pcftest.NewAutomatedNotificationHandlerPopup.Update;
import pcftest.NewAutomatedNotificationHandlerPopup._Paging;
import pcftest.NewAutomatedNotificationHandlerPopup.__crumb__;
import pcftest.NewAutomatedNotificationHandlerPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/specialhandling/NewAutomatedNotificationHandlerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewAutomatedNotificationHandlerPopup extends PCFLocation {
  public final static String CHECKSUM = "e970c4f545a31f1e7b0961c0b28c30e3";
  
  public NewAutomatedNotificationHandlerPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewAutomatedNotificationHandlerPopup"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewAutomatedNotificationHandlerPopup.Cancel.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.NewAutomatedNotificationHandlerPopup.Edit.class);
  }
  
  public NewAutomatedHandlerDV getNewAutomatedHandlerDV() {
    return getOrCreateProperty("NewAutomatedHandlerDV", "NewAutomatedHandlerDV", null, pcftest.NewAutomatedHandlerDV.class);
  }
  
  public NewAutomatedNotificationHandlerPopup_UpLink getNewAutomatedNotificationHandlerPopup_UpLink() {
    return getOrCreateProperty("NewAutomatedNotificationHandlerPopup_UpLink", "NewAutomatedNotificationHandlerPopup_UpLink", null, pcftest.NewAutomatedNotificationHandlerPopup.NewAutomatedNotificationHandlerPopup_UpLink.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.NewAutomatedNotificationHandlerPopup.Update.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewAutomatedNotificationHandlerPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewAutomatedNotificationHandlerPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewAutomatedNotificationHandlerPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/NewAutomatedNotificationHandlerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/NewAutomatedNotificationHandlerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/NewAutomatedNotificationHandlerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewAutomatedNotificationHandlerPopup_UpLink extends ClickableActionElement {
    public NewAutomatedNotificationHandlerPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/NewAutomatedNotificationHandlerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/NewAutomatedNotificationHandlerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/NewAutomatedNotificationHandlerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/NewAutomatedNotificationHandlerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}