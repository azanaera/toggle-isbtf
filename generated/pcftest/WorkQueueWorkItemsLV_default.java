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
import pcftest.WorkQueueWorkItemsLV_default.ItemIdHeader;
import pcftest.WorkQueueWorkItemsLV_default._ListPaging;
import pcftest.WorkQueueWorkItemsLV_default.availableAtHeader;
import pcftest.WorkQueueWorkItemsLV_default.checkedOutByHeader;
import pcftest.WorkQueueWorkItemsLV_default.createdTimeHeader;
import pcftest.WorkQueueWorkItemsLV_default.entry;
import pcftest.WorkQueueWorkItemsLV_default.entry._Select;
import pcftest.WorkQueueWorkItemsLV_default.entry._ViewDetail;
import pcftest.WorkQueueWorkItemsLV_default.retriesHeader;
import pcftest.WorkQueueWorkItemsLV_default.updateTimeHeader;
import pcftest.WorkQueueWorkItemsLV_default.writerIdHeader;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/WorkQueueWorkItemsLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class WorkQueueWorkItemsLV_default extends WorkQueueWorkItemsLV {
  public final static String CHECKSUM = "a398823dfb2a71b93f87e5271f713c5f";
  
  public WorkQueueWorkItemsLV_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SelectElement getFilter() {
    return getOrCreateProperty("Filter", "Filter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ItemIdHeader getItemIdHeader() {
    return getOrCreateProperty("ItemIdHeader", "ItemIdHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueWorkItemsLV_default.ItemIdHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.WorkQueueWorkItemsLV_default.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.WorkQueueWorkItemsLV_default._ListPaging.class);
  }
  
  public availableAtHeader getavailableAtHeader() {
    return getOrCreateProperty("availableAtHeader", "availableAtHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueWorkItemsLV_default.availableAtHeader.class);
  }
  
  public checkedOutByHeader getcheckedOutByHeader() {
    return getOrCreateProperty("checkedOutByHeader", "checkedOutByHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueWorkItemsLV_default.checkedOutByHeader.class);
  }
  
  public createdTimeHeader getcreatedTimeHeader() {
    return getOrCreateProperty("createdTimeHeader", "createdTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueWorkItemsLV_default.createdTimeHeader.class);
  }
  
  public retriesHeader getretriesHeader() {
    return getOrCreateProperty("retriesHeader", "retriesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueWorkItemsLV_default.retriesHeader.class);
  }
  
  public updateTimeHeader getupdateTimeHeader() {
    return getOrCreateProperty("updateTimeHeader", "updateTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueWorkItemsLV_default.updateTimeHeader.class);
  }
  
  public writerIdHeader getwriterIdHeader() {
    return getOrCreateProperty("writerIdHeader", "writerIdHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.WorkQueueWorkItemsLV_default.writerIdHeader.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueWorkItemsLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ItemIdHeader extends ValueElement {
    public ItemIdHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueWorkItemsLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueWorkItemsLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class availableAtHeader extends ValueElement {
    public availableAtHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueWorkItemsLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class checkedOutByHeader extends ValueElement {
    public checkedOutByHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueWorkItemsLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class createdTimeHeader extends ValueElement {
    public createdTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueWorkItemsLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getItemId() {
      return getOrCreateProperty("ItemId", "ItemId", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.WorkQueueWorkItemsLV_default.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.WorkQueueWorkItemsLV_default.entry._ViewDetail.class);
    }
    
    public DateElement getavailableAt() {
      return getOrCreateProperty("availableAt", "availableAt", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getcheckedOutBy() {
      return getOrCreateProperty("checkedOutBy", "checkedOutBy", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getcreatedTime() {
      return getOrCreateProperty("createdTime", "createdTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getretries() {
      return getOrCreateProperty("retries", "retries", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getupdateTime() {
      return getOrCreateProperty("updateTime", "updateTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getwriterId() {
      return getOrCreateProperty("writerId", "writerId", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/WorkQueueWorkItemsLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/WorkQueueWorkItemsLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueWorkItemsLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class retriesHeader extends ValueElement {
    public retriesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueWorkItemsLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class updateTimeHeader extends ValueElement {
    public updateTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/WorkQueueWorkItemsLV.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class writerIdHeader extends ValueElement {
    public writerIdHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}