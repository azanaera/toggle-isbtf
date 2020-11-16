package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.NewInboundS3ConfigPopup.NewInboundS3ConfigPopup_UpLink;
import pcftest.NewInboundS3ConfigPopup.NewInboundS3ConfigScreen;
import pcftest.NewInboundS3ConfigPopup.NewInboundS3ConfigScreen.Cancel;
import pcftest.NewInboundS3ConfigPopup.NewInboundS3ConfigScreen.ConfigDV;
import pcftest.NewInboundS3ConfigPopup.NewInboundS3ConfigScreen.Edit;
import pcftest.NewInboundS3ConfigPopup.NewInboundS3ConfigScreen.Update;
import pcftest.NewInboundS3ConfigPopup.NewInboundS3ConfigScreen._msgs;
import pcftest.NewInboundS3ConfigPopup._Paging;
import pcftest.NewInboundS3ConfigPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/inbound/NewInboundS3ConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewInboundS3ConfigPopup extends PCFLocation {
  public final static String CHECKSUM = "463ad655c08495e78f5f3f7dd98fb450";
  
  public NewInboundS3ConfigPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewInboundS3ConfigPopup"));
  }
  
  public NewInboundS3ConfigPopup_UpLink getNewInboundS3ConfigPopup_UpLink() {
    return getOrCreateProperty("NewInboundS3ConfigPopup_UpLink", "NewInboundS3ConfigPopup_UpLink", null, pcftest.NewInboundS3ConfigPopup.NewInboundS3ConfigPopup_UpLink.class);
  }
  
  public NewInboundS3ConfigScreen getNewInboundS3ConfigScreen() {
    return getOrCreateProperty("NewInboundS3ConfigScreen", "NewInboundS3ConfigScreen", null, pcftest.NewInboundS3ConfigPopup.NewInboundS3ConfigScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewInboundS3ConfigPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewInboundS3ConfigPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/inbound/NewInboundS3ConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewInboundS3ConfigPopup_UpLink extends ClickableActionElement {
    public NewInboundS3ConfigPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/inbound/NewInboundS3ConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewInboundS3ConfigScreen extends PCFElement {
    public NewInboundS3ConfigScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewInboundS3ConfigPopup.NewInboundS3ConfigScreen.Cancel.class);
    }
    
    public ConfigDV getConfigDV() {
      return getOrCreateProperty("ConfigDV", "ConfigDV", null, pcftest.NewInboundS3ConfigPopup.NewInboundS3ConfigScreen.ConfigDV.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewInboundS3ConfigPopup.NewInboundS3ConfigScreen.Edit.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewInboundS3ConfigPopup.NewInboundS3ConfigScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewInboundS3ConfigPopup.NewInboundS3ConfigScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/inbound/NewInboundS3ConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/inbound/NewInboundS3ConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ConfigDV extends DetailViewElement {
      public ConfigDV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getConfigChunkSize() {
        return getOrCreateProperty("ConfigChunkSize", "ConfigChunkSize", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getConfigName() {
        return getOrCreateProperty("ConfigName", "ConfigName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getDaysTilPurge() {
        return getOrCreateProperty("DaysTilPurge", "DaysTilPurge", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getHandlerClass() {
        return getOrCreateProperty("HandlerClass", "HandlerClass", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/inbound/NewInboundS3ConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/inbound/NewInboundS3ConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/inbound/NewInboundS3ConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/inbound/NewInboundS3ConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/inbound/NewInboundS3ConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}