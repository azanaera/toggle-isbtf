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
import pcftest.InboundRecordPopup.InboundRecordDV_tb;
import pcftest.InboundRecordPopup.InboundRecordDV_tb.Cancel;
import pcftest.InboundRecordPopup.InboundRecordDV_tb.Edit;
import pcftest.InboundRecordPopup.InboundRecordDV_tb.InboundRecordPopupSkipButton;
import pcftest.InboundRecordPopup.InboundRecordDV_tb.Update;
import pcftest.InboundRecordPopup.InboundRecordPopup_UpLink;
import pcftest.InboundRecordPopup._Paging;
import pcftest.InboundRecordPopup.__crumb__;
import pcftest.InboundRecordPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/inbound/InboundRecordPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class InboundRecordPopup extends PCFLocation {
  public final static String CHECKSUM = "70661253947e2e583e4ad4d746b9b764";
  
  public InboundRecordPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("InboundRecordPopup"));
  }
  
  public InboundRecordDV_InboundRecord getInboundRecordDV_InboundRecord() {
    return getOrCreateProperty("InboundRecordDV_InboundRecord", "InboundRecordDV", null, pcftest.InboundRecordDV_InboundRecord.class);
  }
  
  public InboundRecordDV_InboundRecordView getInboundRecordDV_InboundRecordView() {
    return getOrCreateProperty("InboundRecordDV_InboundRecordView", "InboundRecordDV", null, pcftest.InboundRecordDV_InboundRecordView.class);
  }
  
  public InboundRecordDV_InboundSubRecord getInboundRecordDV_InboundSubRecord() {
    return getOrCreateProperty("InboundRecordDV_InboundSubRecord", "InboundRecordDV", null, pcftest.InboundRecordDV_InboundSubRecord.class);
  }
  
  public InboundRecordDV_InboundSubRecordView getInboundRecordDV_InboundSubRecordView() {
    return getOrCreateProperty("InboundRecordDV_InboundSubRecordView", "InboundRecordDV", null, pcftest.InboundRecordDV_InboundSubRecordView.class);
  }
  
  public InboundRecordDV_tb getInboundRecordDV_tb() {
    return getOrCreateProperty("InboundRecordDV_tb", "InboundRecordDV_tb", null, pcftest.InboundRecordPopup.InboundRecordDV_tb.class);
  }
  
  public InboundRecordPopup_UpLink getInboundRecordPopup_UpLink() {
    return getOrCreateProperty("InboundRecordPopup_UpLink", "InboundRecordPopup_UpLink", null, pcftest.InboundRecordPopup.InboundRecordPopup_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.InboundRecordPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.InboundRecordPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.InboundRecordPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/inbound/InboundRecordPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InboundRecordDV_tb extends PCFElement {
    public InboundRecordDV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Cancel getCancel() {
      return getOrCreateProperty("Cancel", "Cancel", null, pcftest.InboundRecordPopup.InboundRecordDV_tb.Cancel.class);
    }
    
    public Edit getEdit() {
      return getOrCreateProperty("Edit", "Edit", null, pcftest.InboundRecordPopup.InboundRecordDV_tb.Edit.class);
    }
    
    public InboundRecordPopupSkipButton getInboundRecordPopupSkipButton() {
      return getOrCreateProperty("InboundRecordPopupSkipButton", "InboundRecordPopupSkipButton", null, pcftest.InboundRecordPopup.InboundRecordDV_tb.InboundRecordPopupSkipButton.class);
    }
    
    public Update getUpdate() {
      return getOrCreateProperty("Update", "Update", null, pcftest.InboundRecordPopup.InboundRecordDV_tb.Update.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/inbound/InboundRecordPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Cancel extends ClickableActionElement {
      public Cancel(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/inbound/InboundRecordPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Edit extends ClickableActionElement {
      public Edit(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/inbound/InboundRecordPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InboundRecordPopupSkipButton extends ClickableActionElement {
      public InboundRecordPopupSkipButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/inbound/InboundRecordPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/inbound/InboundRecordPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InboundRecordPopup_UpLink extends ClickableActionElement {
    public InboundRecordPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/inbound/InboundRecordPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/inbound/InboundRecordPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/inbound/InboundRecordPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}