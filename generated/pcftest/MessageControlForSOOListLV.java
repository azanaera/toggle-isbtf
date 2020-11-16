package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.MessageControlForSOOListLV.DescriptionHeader;
import pcftest.MessageControlForSOOListLV.DestinationNameHeader;
import pcftest.MessageControlForSOOListLV.MessageNameHeader;
import pcftest.MessageControlForSOOListLV.OrderHeader;
import pcftest.MessageControlForSOOListLV.ResponseHeader;
import pcftest.MessageControlForSOOListLV.RetryCountHeader;
import pcftest.MessageControlForSOOListLV.SendTimeHeader;
import pcftest.MessageControlForSOOListLV.SenderRefHeader;
import pcftest.MessageControlForSOOListLV.StatusHeader;
import pcftest.MessageControlForSOOListLV._ListPaging;
import pcftest.MessageControlForSOOListLV.entry;
import pcftest.MessageControlForSOOListLV.entry.DestinationName;
import pcftest.MessageControlForSOOListLV.entry.MessageName;
import pcftest.MessageControlForSOOListLV.entry._Select;
import pcftest.MessageControlForSOOListLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/messaging/MessageControlForSOOListLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MessageControlForSOOListLV extends PCFElement {
  public final static String CHECKSUM = "bf1c36deae2b18c0f8bd4f2a9c041d82";
  
  public MessageControlForSOOListLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DescriptionHeader getDescriptionHeader() {
    return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MessageControlForSOOListLV.DescriptionHeader.class);
  }
  
  public DestinationNameHeader getDestinationNameHeader() {
    return getOrCreateProperty("DestinationNameHeader", "DestinationNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MessageControlForSOOListLV.DestinationNameHeader.class);
  }
  
  public MessageNameHeader getMessageNameHeader() {
    return getOrCreateProperty("MessageNameHeader", "MessageNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MessageControlForSOOListLV.MessageNameHeader.class);
  }
  
  public OrderHeader getOrderHeader() {
    return getOrCreateProperty("OrderHeader", "OrderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MessageControlForSOOListLV.OrderHeader.class);
  }
  
  public ResponseHeader getResponseHeader() {
    return getOrCreateProperty("ResponseHeader", "ResponseHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MessageControlForSOOListLV.ResponseHeader.class);
  }
  
  public RetryCountHeader getRetryCountHeader() {
    return getOrCreateProperty("RetryCountHeader", "RetryCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MessageControlForSOOListLV.RetryCountHeader.class);
  }
  
  public SendTimeHeader getSendTimeHeader() {
    return getOrCreateProperty("SendTimeHeader", "SendTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MessageControlForSOOListLV.SendTimeHeader.class);
  }
  
  public SenderRefHeader getSenderRefHeader() {
    return getOrCreateProperty("SenderRefHeader", "SenderRefHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MessageControlForSOOListLV.SenderRefHeader.class);
  }
  
  public StatusHeader getStatusHeader() {
    return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MessageControlForSOOListLV.StatusHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.MessageControlForSOOListLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.MessageControlForSOOListLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForSOOListLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DescriptionHeader extends ValueElement {
    public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForSOOListLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DestinationNameHeader extends ValueElement {
    public DestinationNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForSOOListLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MessageNameHeader extends ValueElement {
    public MessageNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForSOOListLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OrderHeader extends ValueElement {
    public OrderHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForSOOListLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ResponseHeader extends ValueElement {
    public ResponseHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForSOOListLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RetryCountHeader extends ValueElement {
    public RetryCountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForSOOListLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SendTimeHeader extends ValueElement {
    public SendTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForSOOListLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SenderRefHeader extends ValueElement {
    public SenderRefHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForSOOListLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatusHeader extends ValueElement {
    public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForSOOListLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForSOOListLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getDescription() {
      return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DestinationName getDestinationName() {
      return getOrCreateProperty("DestinationName", "DestinationName", null, pcftest.MessageControlForSOOListLV.entry.DestinationName.class);
    }
    
    public MessageName getMessageName() {
      return getOrCreateProperty("MessageName", "MessageName", null, pcftest.MessageControlForSOOListLV.entry.MessageName.class);
    }
    
    public ValueElement getOrder() {
      return getOrCreateProperty("Order", "Order", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getResponse() {
      return getOrCreateProperty("Response", "Response", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getRetryCount() {
      return getOrCreateProperty("RetryCount", "RetryCount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getSendTime() {
      return getOrCreateProperty("SendTime", "SendTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getSenderRef() {
      return getOrCreateProperty("SenderRef", "SenderRef", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getStatus() {
      return getOrCreateProperty("Status", "Status", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.MessageControlForSOOListLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.MessageControlForSOOListLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForSOOListLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DestinationName extends ValueElement {
      public DestinationName(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public MessageControlForDestinationList click() {
        return clickThis(pcftest.MessageControlForDestinationList.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForSOOListLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MessageName extends ValueElement {
      public MessageName(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public MessagePayloadPopup click() {
        return clickThis(pcftest.MessagePayloadPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForSOOListLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForSOOListLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}