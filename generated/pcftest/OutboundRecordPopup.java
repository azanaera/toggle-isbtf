package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.OutboundRecordPopup.OutboundRecordDV_tb;
import pcftest.OutboundRecordPopup.OutboundRecordDV_tb.Cancel;
import pcftest.OutboundRecordPopup.OutboundRecordDV_tb.Edit;
import pcftest.OutboundRecordPopup.OutboundRecordDV_tb.OutboundRecordPopupSkipButton;
import pcftest.OutboundRecordPopup.OutboundRecordDV_tb.Update;
import pcftest.OutboundRecordPopup.OutboundRecordPopup_UpLink;
import pcftest.OutboundRecordPopup._Paging;
import pcftest.OutboundRecordPopup.__crumb__;
import pcftest.OutboundRecordPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/outboundfile/OutboundRecordPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OutboundRecordPopup extends PCFLocation {
  public final static String CHECKSUM = "ee79ee6e819627b81f2cc3f9db218395";
  
  public OutboundRecordPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("OutboundRecordPopup"));
  }
  
  public OutboundRecordDV getOutboundRecordDV() {
    return getOrCreateProperty("OutboundRecordDV", "OutboundRecordDV", null, pcftest.OutboundRecordDV.class);
  }
  
  public OutboundRecordDV_tb getOutboundRecordDV_tb() {
    return getOrCreateProperty("OutboundRecordDV_tb", "OutboundRecordDV_tb", null, pcftest.OutboundRecordPopup.OutboundRecordDV_tb.class);
  }
  
  public OutboundRecordPopup_UpLink getOutboundRecordPopup_UpLink() {
    return getOrCreateProperty("OutboundRecordPopup_UpLink", "OutboundRecordPopup_UpLink", null, pcftest.OutboundRecordPopup.OutboundRecordPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.OutboundRecordPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.OutboundRecordPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.OutboundRecordPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/outboundfile/OutboundRecordPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OutboundRecordDV_tb extends PCFElement {
    public OutboundRecordDV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.OutboundRecordPopup.OutboundRecordDV_tb.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.OutboundRecordPopup.OutboundRecordDV_tb.Edit.class);
    }
    
    public OutboundRecordPopupSkipButton getOutboundRecordPopupSkipButton() {
      return getOrCreateProperty("OutboundRecordPopupSkipButton", "OutboundRecordPopupSkipButton", null, pcftest.OutboundRecordPopup.OutboundRecordDV_tb.OutboundRecordPopupSkipButton.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.OutboundRecordPopup.OutboundRecordDV_tb.Update.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/outboundfile/OutboundRecordPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/outboundfile/OutboundRecordPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/outboundfile/OutboundRecordPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OutboundRecordPopupSkipButton extends ClickableActionElement {
      public OutboundRecordPopupSkipButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/outboundfile/OutboundRecordPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Update extends ClickableActionElement {
      public Update(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/outboundfile/OutboundRecordPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OutboundRecordPopup_UpLink extends ClickableActionElement {
    public OutboundRecordPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/outboundfile/OutboundRecordPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/outboundfile/OutboundRecordPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/outboundfile/OutboundRecordPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}