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
import pcftest.NewInboundLocalConfigPopup.NewInboundLocalConfigPopup_UpLink;
import pcftest.NewInboundLocalConfigPopup.NewInboundLocalConfigScreen;
import pcftest.NewInboundLocalConfigPopup.NewInboundLocalConfigScreen.Cancel;
import pcftest.NewInboundLocalConfigPopup.NewInboundLocalConfigScreen.ConfigDV;
import pcftest.NewInboundLocalConfigPopup.NewInboundLocalConfigScreen.Edit;
import pcftest.NewInboundLocalConfigPopup.NewInboundLocalConfigScreen.Update;
import pcftest.NewInboundLocalConfigPopup.NewInboundLocalConfigScreen._msgs;
import pcftest.NewInboundLocalConfigPopup._Paging;
import pcftest.NewInboundLocalConfigPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/inbound/NewInboundLocalConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewInboundLocalConfigPopup extends PCFLocation {
  public final static String CHECKSUM = "f244324369d715afd2cd636f699b3781";
  
  public NewInboundLocalConfigPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewInboundLocalConfigPopup"));
  }
  
  public NewInboundLocalConfigPopup_UpLink getNewInboundLocalConfigPopup_UpLink() {
    return getOrCreateProperty("NewInboundLocalConfigPopup_UpLink", "NewInboundLocalConfigPopup_UpLink", null, pcftest.NewInboundLocalConfigPopup.NewInboundLocalConfigPopup_UpLink.class);
  }
  
  public NewInboundLocalConfigScreen getNewInboundLocalConfigScreen() {
    return getOrCreateProperty("NewInboundLocalConfigScreen", "NewInboundLocalConfigScreen", null, pcftest.NewInboundLocalConfigPopup.NewInboundLocalConfigScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewInboundLocalConfigPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewInboundLocalConfigPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/inbound/NewInboundLocalConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewInboundLocalConfigPopup_UpLink extends ClickableActionElement {
    public NewInboundLocalConfigPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/inbound/NewInboundLocalConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewInboundLocalConfigScreen extends PCFElement {
    public NewInboundLocalConfigScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewInboundLocalConfigPopup.NewInboundLocalConfigScreen.Cancel.class);
    }
    
    public ConfigDV getConfigDV() {
      return getOrCreateProperty("ConfigDV", "ConfigDV", null, pcftest.NewInboundLocalConfigPopup.NewInboundLocalConfigScreen.ConfigDV.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewInboundLocalConfigPopup.NewInboundLocalConfigScreen.Edit.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewInboundLocalConfigPopup.NewInboundLocalConfigScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewInboundLocalConfigPopup.NewInboundLocalConfigScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/inbound/NewInboundLocalConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/inbound/NewInboundLocalConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ConfigDV extends DetailViewElement {
      public ConfigDV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getConfigArchiveDir() {
        return getOrCreateProperty("ConfigArchiveDir", "ConfigArchiveDir", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getConfigChunkSize() {
        return getOrCreateProperty("ConfigChunkSize", "ConfigChunkSize", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getConfigInputDir() {
        return getOrCreateProperty("ConfigInputDir", "ConfigInputDir", null, gw.smoketest.platform.web.ValueElement.class);
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
    @Generated(comments = "config/web/pcf/inbound/NewInboundLocalConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/inbound/NewInboundLocalConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/inbound/NewInboundLocalConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/inbound/NewInboundLocalConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/inbound/NewInboundLocalConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}