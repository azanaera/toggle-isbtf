package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PickProfilerSourceLV_MessageDestination.EndTimeHeader;
import pcftest.PickProfilerSourceLV_MessageDestination.MessageDestinationIDHeader;
import pcftest.PickProfilerSourceLV_MessageDestination.MessageDestinationNameHeader;
import pcftest.PickProfilerSourceLV_MessageDestination.StartTimeHeader;
import pcftest.PickProfilerSourceLV_MessageDestination._ListPaging;
import pcftest.PickProfilerSourceLV_MessageDestination.entry;
import pcftest.PickProfilerSourceLV_MessageDestination.entry._Select;
import pcftest.PickProfilerSourceLV_MessageDestination.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.MessageDestination.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PickProfilerSourceLV_MessageDestination extends PickProfilerSourceLV {
  public final static String CHECKSUM = "9d9879f9a50f5426e3324566e2650c06";
  
  public PickProfilerSourceLV_MessageDestination(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public EndTimeHeader getEndTimeHeader() {
    return getOrCreateProperty("EndTimeHeader", "EndTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PickProfilerSourceLV_MessageDestination.EndTimeHeader.class);
  }
  
  public MessageDestinationIDHeader getMessageDestinationIDHeader() {
    return getOrCreateProperty("MessageDestinationIDHeader", "MessageDestinationIDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PickProfilerSourceLV_MessageDestination.MessageDestinationIDHeader.class);
  }
  
  public MessageDestinationNameHeader getMessageDestinationNameHeader() {
    return getOrCreateProperty("MessageDestinationNameHeader", "MessageDestinationNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PickProfilerSourceLV_MessageDestination.MessageDestinationNameHeader.class);
  }
  
  public StartTimeHeader getStartTimeHeader() {
    return getOrCreateProperty("StartTimeHeader", "StartTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PickProfilerSourceLV_MessageDestination.StartTimeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.PickProfilerSourceLV_MessageDestination.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.PickProfilerSourceLV_MessageDestination._ListPaging.class);
  }
  
  public SelectElement getmessageDestinationChooser() {
    return getOrCreateProperty("messageDestinationChooser", "messageDestinationChooser", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.MessageDestination.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EndTimeHeader extends ValueElement {
    public EndTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.MessageDestination.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MessageDestinationIDHeader extends ValueElement {
    public MessageDestinationIDHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.MessageDestination.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MessageDestinationNameHeader extends ValueElement {
    public MessageDestinationNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.MessageDestination.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StartTimeHeader extends ValueElement {
    public StartTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.MessageDestination.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.MessageDestination.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DateElement getEndTime() {
      return getOrCreateProperty("EndTime", "EndTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getMessageDestinationID() {
      return getOrCreateProperty("MessageDestinationID", "MessageDestinationID", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMessageDestinationName() {
      return getOrCreateProperty("MessageDestinationName", "MessageDestinationName", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getStartTime() {
      return getOrCreateProperty("StartTime", "StartTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.PickProfilerSourceLV_MessageDestination.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.PickProfilerSourceLV_MessageDestination.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.MessageDestination.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.MessageDestination.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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