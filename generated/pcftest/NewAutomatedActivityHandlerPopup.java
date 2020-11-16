package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewAutomatedActivityHandlerPopup.Cancel;
import pcftest.NewAutomatedActivityHandlerPopup.Edit;
import pcftest.NewAutomatedActivityHandlerPopup.NewAutomatedActivityHandlerPopup_UpLink;
import pcftest.NewAutomatedActivityHandlerPopup.Update;
import pcftest.NewAutomatedActivityHandlerPopup._Paging;
import pcftest.NewAutomatedActivityHandlerPopup.__crumb__;
import pcftest.NewAutomatedActivityHandlerPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/specialhandling/NewAutomatedActivityHandlerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewAutomatedActivityHandlerPopup extends PCFLocation {
  public final static String CHECKSUM = "1dd0ebe43da589165597f21ccf2a5881";
  
  public NewAutomatedActivityHandlerPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewAutomatedActivityHandlerPopup"));
  }
  
  public Cancel getCancel() {
    return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewAutomatedActivityHandlerPopup.Cancel.class);
  }
  
  public Edit getEdit() {
    return getOrCreateProperty("Edit", "Edit", null, pcftest.NewAutomatedActivityHandlerPopup.Edit.class);
  }
  
  public NewAutomatedActivityHandlerPopup_UpLink getNewAutomatedActivityHandlerPopup_UpLink() {
    return getOrCreateProperty("NewAutomatedActivityHandlerPopup_UpLink", "NewAutomatedActivityHandlerPopup_UpLink", null, pcftest.NewAutomatedActivityHandlerPopup.NewAutomatedActivityHandlerPopup_UpLink.class);
  }
  
  public NewAutomatedHandlerDV getNewAutomatedHandlerDV() {
    return getOrCreateProperty("NewAutomatedHandlerDV", "NewAutomatedHandlerDV", null, pcftest.NewAutomatedHandlerDV.class);
  }
  
  public Update getUpdate() {
    return getOrCreateProperty("Update", "Update", null, pcftest.NewAutomatedActivityHandlerPopup.Update.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewAutomatedActivityHandlerPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewAutomatedActivityHandlerPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewAutomatedActivityHandlerPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/NewAutomatedActivityHandlerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Cancel extends ClickableActionElement {
    public Cancel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/NewAutomatedActivityHandlerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Edit extends ClickableActionElement {
    public Edit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/NewAutomatedActivityHandlerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewAutomatedActivityHandlerPopup_UpLink extends ClickableActionElement {
    public NewAutomatedActivityHandlerPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/NewAutomatedActivityHandlerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Update extends ClickableActionElement {
    public Update(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/NewAutomatedActivityHandlerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/NewAutomatedActivityHandlerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/NewAutomatedActivityHandlerPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}