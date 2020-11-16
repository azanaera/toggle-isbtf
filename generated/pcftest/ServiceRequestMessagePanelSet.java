package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ServiceRequestMessagePanelSet.entry;
import pcftest.ServiceRequestMessagePanelSet.entry.ServiceRequestMessageDV_tb;
import pcftest.ServiceRequestMessagePanelSet.entry.ServiceRequestMessageDV_tb.ReplyMessage;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestMessagePanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ServiceRequestMessagePanelSet extends PCFElement {
  public final static String CHECKSUM = "33e0b5ba60e382a541679840b06c6a14";
  
  public ServiceRequestMessagePanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.ServiceRequestMessagePanelSet.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestMessagePanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ServiceRequestMessageDV getServiceRequestMessageDV() {
      return getOrCreateProperty("ServiceRequestMessageDV", "ServiceRequestMessageDV", null, pcftest.ServiceRequestMessageDV.class);
    }
    
    public ServiceRequestMessageDV_tb getServiceRequestMessageDV_tb() {
      return getOrCreateProperty("ServiceRequestMessageDV_tb", "ServiceRequestMessageDV_tb", null, pcftest.ServiceRequestMessagePanelSet.entry.ServiceRequestMessageDV_tb.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestMessagePanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ServiceRequestMessageDV_tb extends PCFElement {
      public ServiceRequestMessageDV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ReplyMessage getReplyMessage() {
        return getOrCreateProperty("ReplyMessage", "ReplyMessage", null, pcftest.ServiceRequestMessagePanelSet.entry.ServiceRequestMessageDV_tb.ReplyMessage.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/servicerequests/ServiceRequestMessagePanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ReplyMessage extends ClickableActionElement {
        public ReplyMessage(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ServiceRequestMessagePopup click() {
          return clickThis(pcftest.ServiceRequestMessagePopup.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  
}