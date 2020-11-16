package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
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
import pcftest.MessagingDestinationsControlLV.DestinationIDHeader;
import pcftest.MessagingDestinationsControlLV.DestinationNameHeader;
import pcftest.MessagingDestinationsControlLV.ServerIdHeader;
import pcftest.MessagingDestinationsControlLV.StatusHeader;
import pcftest.MessagingDestinationsControlLV._ListPaging;
import pcftest.MessagingDestinationsControlLV.entry;
import pcftest.MessagingDestinationsControlLV.entry.DestinationID;
import pcftest.MessagingDestinationsControlLV.entry.DestinationName;
import pcftest.MessagingDestinationsControlLV.entry.DestinationName.entry2;
import pcftest.MessagingDestinationsControlLV.entry.DestinationName.entry2.option;
import pcftest.MessagingDestinationsControlLV.entry._Select;
import pcftest.MessagingDestinationsControlLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/messaging/MessagingDestinationsControlLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MessagingDestinationsControlLV extends PCFElement {
  public final static String CHECKSUM = "60f3c90f9e1f51b20fe34d27a2167be3";
  
  public MessagingDestinationsControlLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DestinationIDHeader getDestinationIDHeader() {
    return getOrCreateProperty("DestinationIDHeader", "DestinationIDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MessagingDestinationsControlLV.DestinationIDHeader.class);
  }
  
  public DestinationNameHeader getDestinationNameHeader() {
    return getOrCreateProperty("DestinationNameHeader", "DestinationNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MessagingDestinationsControlLV.DestinationNameHeader.class);
  }
  
  public ServerIdHeader getServerIdHeader() {
    return getOrCreateProperty("ServerIdHeader", "ServerIdHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MessagingDestinationsControlLV.ServerIdHeader.class);
  }
  
  public StatusHeader getStatusHeader() {
    return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MessagingDestinationsControlLV.StatusHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.MessagingDestinationsControlLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.MessagingDestinationsControlLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessagingDestinationsControlLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DestinationIDHeader extends ValueElement {
    public DestinationIDHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessagingDestinationsControlLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DestinationNameHeader extends ValueElement {
    public DestinationNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessagingDestinationsControlLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ServerIdHeader extends ValueElement {
    public ServerIdHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessagingDestinationsControlLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatusHeader extends ValueElement {
    public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessagingDestinationsControlLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessagingDestinationsControlLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DestinationID getDestinationID() {
      return getOrCreateProperty("DestinationID", "DestinationID", null, pcftest.MessagingDestinationsControlLV.entry.DestinationID.class);
    }
    
    public DestinationName getDestinationName() {
      return getOrCreateProperty("DestinationName", "DestinationName", null, pcftest.MessagingDestinationsControlLV.entry.DestinationName.class);
    }
    
    public ValueElement getServerId() {
      return getOrCreateProperty("ServerId", "ServerId", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getStatus() {
      return getOrCreateProperty("Status", "Status", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.MessagingDestinationsControlLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.MessagingDestinationsControlLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/messaging/MessagingDestinationsControlLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DestinationID extends ValueElement {
      public DestinationID(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public MessageControlForDestinationList click() {
        return clickThis(pcftest.MessageControlForDestinationList.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/messaging/MessagingDestinationsControlLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DestinationName extends ValueElement {
      public DestinationName(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public MessageControlForDestinationList click() {
        return clickThis(pcftest.MessageControlForDestinationList.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<entry2> get_Entries() {
        return getOrCreateEntries(null, pcftest.MessagingDestinationsControlLV.entry.DestinationName.entry2.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/admin/messaging/MessagingDestinationsControlLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry2 extends PCFElement {
        public entry2(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public option getoption() {
          return getOrCreateProperty("option", "option", null, pcftest.MessagingDestinationsControlLV.entry.DestinationName.entry2.option.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/admin/messaging/MessagingDestinationsControlLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class option extends ClickableActionElement {
          public option(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/messaging/MessagingDestinationsControlLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/messaging/MessagingDestinationsControlLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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