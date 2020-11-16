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
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.MessageControlForDestinationListLV.ErrorHeader;
import pcftest.MessageControlForDestinationListLV.InFlightHeader;
import pcftest.MessageControlForDestinationListLV.RetryableErrorHeader;
import pcftest.MessageControlForDestinationListLV.RetryableErrorMessageHeader;
import pcftest.MessageControlForDestinationListLV.SOONameHeader;
import pcftest.MessageControlForDestinationListLV.SendTimeHeader;
import pcftest.MessageControlForDestinationListLV.UnsentHeader;
import pcftest.MessageControlForDestinationListLV._ListPaging;
import pcftest.MessageControlForDestinationListLV.entry;
import pcftest.MessageControlForDestinationListLV.entry.SOOName;
import pcftest.MessageControlForDestinationListLV.entry._Select;
import pcftest.MessageControlForDestinationListLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/messaging/MessageControlForDestinationListLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MessageControlForDestinationListLV extends PCFElement {
  public final static String CHECKSUM = "337622dfc431088b90c31808a373869e";
  
  public MessageControlForDestinationListLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ErrorHeader getErrorHeader() {
    return getOrCreateProperty("ErrorHeader", "ErrorHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MessageControlForDestinationListLV.ErrorHeader.class);
  }
  
  public InFlightHeader getInFlightHeader() {
    return getOrCreateProperty("InFlightHeader", "InFlightHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MessageControlForDestinationListLV.InFlightHeader.class);
  }
  
  public RetryableErrorHeader getRetryableErrorHeader() {
    return getOrCreateProperty("RetryableErrorHeader", "RetryableErrorHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MessageControlForDestinationListLV.RetryableErrorHeader.class);
  }
  
  public RetryableErrorMessageHeader getRetryableErrorMessageHeader() {
    return getOrCreateProperty("RetryableErrorMessageHeader", "RetryableErrorMessageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MessageControlForDestinationListLV.RetryableErrorMessageHeader.class);
  }
  
  public SelectElement getSOOMessageFilter() {
    return getOrCreateProperty("SOOMessageFilter", "SOOMessageFilter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public SOONameHeader getSOONameHeader() {
    return getOrCreateProperty("SOONameHeader", "SOONameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MessageControlForDestinationListLV.SOONameHeader.class);
  }
  
  public SendTimeHeader getSendTimeHeader() {
    return getOrCreateProperty("SendTimeHeader", "SendTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MessageControlForDestinationListLV.SendTimeHeader.class);
  }
  
  public UnsentHeader getUnsentHeader() {
    return getOrCreateProperty("UnsentHeader", "UnsentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MessageControlForDestinationListLV.UnsentHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.MessageControlForDestinationListLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.MessageControlForDestinationListLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForDestinationListLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ErrorHeader extends ValueElement {
    public ErrorHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForDestinationListLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InFlightHeader extends ValueElement {
    public InFlightHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForDestinationListLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RetryableErrorHeader extends ValueElement {
    public RetryableErrorHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForDestinationListLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RetryableErrorMessageHeader extends ValueElement {
    public RetryableErrorMessageHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForDestinationListLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SOONameHeader extends ValueElement {
    public SOONameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForDestinationListLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SendTimeHeader extends ValueElement {
    public SendTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForDestinationListLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UnsentHeader extends ValueElement {
    public UnsentHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForDestinationListLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForDestinationListLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getError() {
      return getOrCreateProperty("Error", "Error", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getInFlight() {
      return getOrCreateProperty("InFlight", "InFlight", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getRetryableError() {
      return getOrCreateProperty("RetryableError", "RetryableError", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getRetryableErrorMessage() {
      return getOrCreateProperty("RetryableErrorMessage", "RetryableErrorMessage", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public SOOName getSOOName() {
      return getOrCreateProperty("SOOName", "SOOName", null, pcftest.MessageControlForDestinationListLV.entry.SOOName.class);
    }
    
    public DateElement getSendTime() {
      return getOrCreateProperty("SendTime", "SendTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getUnsent() {
      return getOrCreateProperty("Unsent", "Unsent", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.MessageControlForDestinationListLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.MessageControlForDestinationListLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForDestinationListLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SOOName extends ValueElement {
      public SOOName(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public MessageControlForSOOList click() {
        return clickThis(pcftest.MessageControlForSOOList.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForDestinationListLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/messaging/MessageControlForDestinationListLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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