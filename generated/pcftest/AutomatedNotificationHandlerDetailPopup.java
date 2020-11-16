package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AutomatedNotificationHandlerDetailPopup.AutomatedNotificationHandlerDetailPopup_UpLink;
import pcftest.AutomatedNotificationHandlerDetailPopup.Cancel;
import pcftest.AutomatedNotificationHandlerDetailPopup.Edit;
import pcftest.AutomatedNotificationHandlerDetailPopup.Update;
import pcftest.AutomatedNotificationHandlerDetailPopup._Paging;
import pcftest.AutomatedNotificationHandlerDetailPopup.__crumb__;
import pcftest.AutomatedNotificationHandlerDetailPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedNotificationHandlerDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AutomatedNotificationHandlerDetailPopup extends PCFLocation {
  public final static String CHECKSUM = "a4023027f2b039851acf3eb7d9c9f045";
  
  public AutomatedNotificationHandlerDetailPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AutomatedNotificationHandlerDetailPopup"));
  }
  
  public AutomatedHandlerActionInputSet_activity getAutomatedHandlerActionInputSet_activity() {
    return getOrCreateProperty("AutomatedHandlerActionInputSet_activity", "AutomatedHandlerActionInputSet", null, pcftest.AutomatedHandlerActionInputSet_activity.class);
  }
  
  public AutomatedHandlerActionInputSet_notification getAutomatedHandlerActionInputSet_notification() {
    return getOrCreateProperty("AutomatedHandlerActionInputSet_notification", "AutomatedHandlerActionInputSet", null, pcftest.AutomatedHandlerActionInputSet_notification.class);
  }
  
  public AutomatedHandlerBaseInputSet getAutomatedHandlerBaseInputSet() {
    return getOrCreateProperty("AutomatedHandlerBaseInputSet", "AutomatedHandlerBaseInputSet", null, pcftest.AutomatedHandlerBaseInputSet.class);
  }
  
  public AutomatedHandlerTriggerInputSet_claimindicatortrigger getAutomatedHandlerTriggerInputSet_claimindicatortrigger() {
    return getOrCreateProperty("AutomatedHandlerTriggerInputSet_claimindicatortrigger", "AutomatedHandlerTriggerInputSet", null, pcftest.AutomatedHandlerTriggerInputSet_claimindicatortrigger.class);
  }
  
  public AutomatedHandlerTriggerInputSet_financialthresholdtrigger getAutomatedHandlerTriggerInputSet_financialthresholdtrigger() {
    return getOrCreateProperty("AutomatedHandlerTriggerInputSet_financialthresholdtrigger", "AutomatedHandlerTriggerInputSet", null, pcftest.AutomatedHandlerTriggerInputSet_financialthresholdtrigger.class);
  }
  
  public AutomatedNotificationHandlerDetailPopup_UpLink getAutomatedNotificationHandlerDetailPopup_UpLink() {
    return getOrCreateProperty("AutomatedNotificationHandlerDetailPopup_UpLink", "AutomatedNotificationHandlerDetailPopup_UpLink", null, pcftest.AutomatedNotificationHandlerDetailPopup.AutomatedNotificationHandlerDetailPopup_UpLink.class);
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.AutomatedNotificationHandlerDetailPopup.Cancel.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.AutomatedNotificationHandlerDetailPopup.Edit.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.AutomatedNotificationHandlerDetailPopup.Update.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AutomatedNotificationHandlerDetailPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AutomatedNotificationHandlerDetailPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.AutomatedNotificationHandlerDetailPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedNotificationHandlerDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AutomatedNotificationHandlerDetailPopup_UpLink extends ClickableActionElement {
    public AutomatedNotificationHandlerDetailPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedNotificationHandlerDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedNotificationHandlerDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedNotificationHandlerDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedNotificationHandlerDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedNotificationHandlerDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedNotificationHandlerDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}