package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AutomatedActivityHandlerDetailPopup.AutomatedActivityHandlerDetailPopup_UpLink;
import pcftest.AutomatedActivityHandlerDetailPopup.Cancel;
import pcftest.AutomatedActivityHandlerDetailPopup.Edit;
import pcftest.AutomatedActivityHandlerDetailPopup.Update;
import pcftest.AutomatedActivityHandlerDetailPopup._Paging;
import pcftest.AutomatedActivityHandlerDetailPopup.__crumb__;
import pcftest.AutomatedActivityHandlerDetailPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedActivityHandlerDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AutomatedActivityHandlerDetailPopup extends PCFLocation {
  public final static String CHECKSUM = "11376cefbb2dc42201ca16dadeeb86f2";
  
  public AutomatedActivityHandlerDetailPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("AutomatedActivityHandlerDetailPopup"));
  }
  
  public AutomatedActivityHandlerDetailPopup_UpLink getAutomatedActivityHandlerDetailPopup_UpLink() {
    return getOrCreateProperty("AutomatedActivityHandlerDetailPopup_UpLink", "AutomatedActivityHandlerDetailPopup_UpLink", null, pcftest.AutomatedActivityHandlerDetailPopup.AutomatedActivityHandlerDetailPopup_UpLink.class);
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
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.AutomatedActivityHandlerDetailPopup.Cancel.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.AutomatedActivityHandlerDetailPopup.Edit.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.AutomatedActivityHandlerDetailPopup.Update.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.AutomatedActivityHandlerDetailPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.AutomatedActivityHandlerDetailPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.AutomatedActivityHandlerDetailPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedActivityHandlerDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AutomatedActivityHandlerDetailPopup_UpLink extends ClickableActionElement {
    public AutomatedActivityHandlerDetailPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedActivityHandlerDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedActivityHandlerDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedActivityHandlerDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedActivityHandlerDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedActivityHandlerDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedActivityHandlerDetailPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}