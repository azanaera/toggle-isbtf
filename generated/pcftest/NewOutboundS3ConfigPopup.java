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
import pcftest.NewOutboundS3ConfigPopup.NewOutboundConfigScreen;
import pcftest.NewOutboundS3ConfigPopup.NewOutboundConfigScreen.Cancel;
import pcftest.NewOutboundS3ConfigPopup.NewOutboundConfigScreen.Edit;
import pcftest.NewOutboundS3ConfigPopup.NewOutboundConfigScreen.OutboundConfigDV;
import pcftest.NewOutboundS3ConfigPopup.NewOutboundConfigScreen.Update;
import pcftest.NewOutboundS3ConfigPopup.NewOutboundConfigScreen._msgs;
import pcftest.NewOutboundS3ConfigPopup.NewOutboundS3ConfigPopup_UpLink;
import pcftest.NewOutboundS3ConfigPopup._Paging;
import pcftest.NewOutboundS3ConfigPopup.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/outboundfile/NewOutboundS3ConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewOutboundS3ConfigPopup extends PCFLocation {
  public final static String CHECKSUM = "dbc1b54147c81aac8686bae608d5e96d";
  
  public NewOutboundS3ConfigPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("NewOutboundS3ConfigPopup"));
  }
  
  public NewOutboundConfigScreen getNewOutboundConfigScreen() {
    return getOrCreateProperty("NewOutboundConfigScreen", "NewOutboundConfigScreen", null, pcftest.NewOutboundS3ConfigPopup.NewOutboundConfigScreen.class);
  }
  
  public NewOutboundS3ConfigPopup_UpLink getNewOutboundS3ConfigPopup_UpLink() {
    return getOrCreateProperty("NewOutboundS3ConfigPopup_UpLink", "NewOutboundS3ConfigPopup_UpLink", null, pcftest.NewOutboundS3ConfigPopup.NewOutboundS3ConfigPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.NewOutboundS3ConfigPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.NewOutboundS3ConfigPopup.__crumb__.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/outboundfile/NewOutboundS3ConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewOutboundConfigScreen extends PCFElement {
    public NewOutboundConfigScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.NewOutboundS3ConfigPopup.NewOutboundConfigScreen.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.NewOutboundS3ConfigPopup.NewOutboundConfigScreen.Edit.class);
    }
    
    public OutboundConfigDV getOutboundConfigDV() {
      return getOrCreateProperty("OutboundConfigDV", "OutboundConfigDV", null, pcftest.NewOutboundS3ConfigPopup.NewOutboundConfigScreen.OutboundConfigDV.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.NewOutboundS3ConfigPopup.NewOutboundConfigScreen.Update.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.NewOutboundS3ConfigPopup.NewOutboundConfigScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/outboundfile/NewOutboundS3ConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/outboundfile/NewOutboundS3ConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/outboundfile/NewOutboundS3ConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public ValueElement getConfigPrefix() {
        return getOrCreateProperty("ConfigPrefix", "ConfigPrefix", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getDaysTilPurge() {
        return getOrCreateProperty("DaysTilPurge", "DaysTilPurge", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getHandlerClass() {
        return getOrCreateProperty("HandlerClass", "HandlerClass", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/outboundfile/NewOutboundS3ConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/outboundfile/NewOutboundS3ConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/outboundfile/NewOutboundS3ConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewOutboundS3ConfigPopup_UpLink extends ClickableActionElement {
    public NewOutboundS3ConfigPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/outboundfile/NewOutboundS3ConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/outboundfile/NewOutboundS3ConfigPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}