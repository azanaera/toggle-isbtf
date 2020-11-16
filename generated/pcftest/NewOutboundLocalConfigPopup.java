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
import pcftest.NewOutboundLocalConfigPopup.NewOutboundConfigScreen;
import pcftest.NewOutboundLocalConfigPopup.NewOutboundConfigScreen.Cancel;
import pcftest.NewOutboundLocalConfigPopup.NewOutboundConfigScreen.Edit;
import pcftest.NewOutboundLocalConfigPopup.NewOutboundConfigScreen.OutboundConfigDV;
import pcftest.NewOutboundLocalConfigPopup.NewOutboundConfigScreen.Update;
import pcftest.NewOutboundLocalConfigPopup.NewOutboundConfigScreen._msgs;
import pcftest.NewOutboundLocalConfigPopup.NewOutboundLocalConfigPopup_UpLink;
import pcftest.NewOutboundLocalConfigPopup._Paging;
import pcftest.NewOutboundLocalConfigPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/outboundfile/NewOutboundLocalConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewOutboundLocalConfigPopup extends PCFLocation {
  public final static String CHECKSUM = "50665da1fad8f902e48b7accc0e60f87";
  
  public NewOutboundLocalConfigPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewOutboundLocalConfigPopup"));
  }
  
  public NewOutboundConfigScreen getNewOutboundConfigScreen() {
    return getOrCreateProperty("NewOutboundConfigScreen", "NewOutboundConfigScreen", null, pcftest.NewOutboundLocalConfigPopup.NewOutboundConfigScreen.class);
  }
  
  public NewOutboundLocalConfigPopup_UpLink getNewOutboundLocalConfigPopup_UpLink() {
    return getOrCreateProperty("NewOutboundLocalConfigPopup_UpLink", "NewOutboundLocalConfigPopup_UpLink", null, pcftest.NewOutboundLocalConfigPopup.NewOutboundLocalConfigPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewOutboundLocalConfigPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewOutboundLocalConfigPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/outboundfile/NewOutboundLocalConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewOutboundConfigScreen extends PCFElement {
    public NewOutboundConfigScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewOutboundLocalConfigPopup.NewOutboundConfigScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewOutboundLocalConfigPopup.NewOutboundConfigScreen.Edit.class);
    }
    
    public OutboundConfigDV getOutboundConfigDV() {
      return getOrCreateProperty("OutboundConfigDV", "OutboundConfigDV", null, pcftest.NewOutboundLocalConfigPopup.NewOutboundConfigScreen.OutboundConfigDV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewOutboundLocalConfigPopup.NewOutboundConfigScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewOutboundLocalConfigPopup.NewOutboundConfigScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/outboundfile/NewOutboundLocalConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/outboundfile/NewOutboundLocalConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/outboundfile/NewOutboundLocalConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OutboundConfigDV extends DetailViewElement {
      public OutboundConfigDV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getConfigExtension() {
        return getOrCreateProperty("ConfigExtension", "ConfigExtension", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getConfigName() {
        return getOrCreateProperty("ConfigName", "ConfigName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getConfigPermanentDir() {
        return getOrCreateProperty("ConfigPermanentDir", "ConfigPermanentDir", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getConfigPrefix() {
        return getOrCreateProperty("ConfigPrefix", "ConfigPrefix", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getConfigTemporaryDir() {
        return getOrCreateProperty("ConfigTemporaryDir", "ConfigTemporaryDir", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getDaysTilPurge() {
        return getOrCreateProperty("DaysTilPurge", "DaysTilPurge", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getHandlerClass() {
        return getOrCreateProperty("HandlerClass", "HandlerClass", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/outboundfile/NewOutboundLocalConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/outboundfile/NewOutboundLocalConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/outboundfile/NewOutboundLocalConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewOutboundLocalConfigPopup_UpLink extends ClickableActionElement {
    public NewOutboundLocalConfigPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/outboundfile/NewOutboundLocalConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/outboundfile/NewOutboundLocalConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}