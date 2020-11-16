package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
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
import pcftest.ProfilerResultsCV_StacksGrouped.CardTab;
import pcftest.ProfilerResultsCV_StacksGrouped.NestedCardTab;
import pcftest.ProfilerResultsCV_StacksGrouped.StackSummaryLV;
import pcftest.ProfilerResultsCV_StacksGrouped.StackSummaryLV.StackNameHeader;
import pcftest.ProfilerResultsCV_StacksGrouped.StackSummaryLV.averageHeader;
import pcftest.ProfilerResultsCV_StacksGrouped.StackSummaryLV.countHeader;
import pcftest.ProfilerResultsCV_StacksGrouped.StackSummaryLV.maxHeader;
import pcftest.ProfilerResultsCV_StacksGrouped.StackSummaryLV.minHeader;
import pcftest.ProfilerResultsCV_StacksGrouped.StackSummaryLV.totalHeader;
import pcftest.ProfilerResultsCV_StacksGrouped.StackSummaryLV_tb;
import pcftest.ProfilerResultsCV_StacksGrouped.nameHeader;
import pcftest.ProfilerResultsCV_StacksGrouped.timeHeader;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StacksGrouped.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ProfilerResultsCV_StacksGrouped extends ProfilerResultsCV {
  public final static String CHECKSUM = "10fa12f0c2ddb1b00ef80a715458c637";
  
  public ProfilerResultsCV_StacksGrouped(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CardTab getCardTab() {
    return getOrCreateProperty("CardTab", "CardTab", null, pcftest.ProfilerResultsCV_StacksGrouped.CardTab.class);
  }
  
  public NestedCardTab getNestedCardTab() {
    return getOrCreateProperty("NestedCardTab", "NestedCardTab", null, pcftest.ProfilerResultsCV_StacksGrouped.NestedCardTab.class);
  }
  
  public StackSummaryLV getStackSummaryLV() {
    return getOrCreateProperty("StackSummaryLV", "StackSummaryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ProfilerResultsCV_StacksGrouped.StackSummaryLV.class);
  }
  
  public StackSummaryLV_tb getStackSummaryLV_tb() {
    return getOrCreateProperty("StackSummaryLV_tb", "StackSummaryLV_tb", null, pcftest.ProfilerResultsCV_StacksGrouped.StackSummaryLV_tb.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<pcftest.ProfilerResultsCV_StacksGrouped.entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ProfilerResultsCV_StacksGrouped.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public pcftest.ProfilerResultsCV_StacksGrouped._ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ProfilerResultsCV_StacksGrouped._ListPaging.class);
  }
  
  public nameHeader getnameHeader() {
    return getOrCreateProperty("nameHeader", "nameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_StacksGrouped.nameHeader.class);
  }
  
  public timeHeader gettimeHeader() {
    return getOrCreateProperty("timeHeader", "timeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_StacksGrouped.timeHeader.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StacksGrouped.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CardTab extends ClickableActionElement {
    public CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StacksGrouped.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NestedCardTab extends ClickableActionElement {
    public NestedCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StacksGrouped.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StackSummaryLV extends PCFElement {
    public StackSummaryLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public StackNameHeader getStackNameHeader() {
      return getOrCreateProperty("StackNameHeader", "StackNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_StacksGrouped.StackSummaryLV.StackNameHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ProfilerResultsCV_StacksGrouped.StackSummaryLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ProfilerResultsCV_StacksGrouped.StackSummaryLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ProfilerResultsCV_StacksGrouped.StackSummaryLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ProfilerResultsCV_StacksGrouped.StackSummaryLV._ListPaging.class);
    }
    
    public averageHeader getaverageHeader() {
      return getOrCreateProperty("averageHeader", "averageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_StacksGrouped.StackSummaryLV.averageHeader.class);
    }
    
    public countHeader getcountHeader() {
      return getOrCreateProperty("countHeader", "countHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_StacksGrouped.StackSummaryLV.countHeader.class);
    }
    
    public maxHeader getmaxHeader() {
      return getOrCreateProperty("maxHeader", "maxHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_StacksGrouped.StackSummaryLV.maxHeader.class);
    }
    
    public minHeader getminHeader() {
      return getOrCreateProperty("minHeader", "minHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_StacksGrouped.StackSummaryLV.minHeader.class);
    }
    
    public totalHeader gettotalHeader() {
      return getOrCreateProperty("totalHeader", "totalHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_StacksGrouped.StackSummaryLV.totalHeader.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StacksGrouped.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StackNameHeader extends ValueElement {
      public StackNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StacksGrouped.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StacksGrouped.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class averageHeader extends ValueElement {
      public averageHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StacksGrouped.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class countHeader extends ValueElement {
      public countHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StacksGrouped.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getStackName() {
        return getOrCreateProperty("StackName", "StackName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.ProfilerResultsCV_StacksGrouped.StackSummaryLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ProfilerResultsCV_StacksGrouped.StackSummaryLV.entry._Select.class);
      }
      
      public pcftest.ProfilerResultsCV_StacksGrouped.StackSummaryLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ProfilerResultsCV_StacksGrouped.StackSummaryLV.entry._ViewDetail.class);
      }
      
      public ValueElement getaverage() {
        return getOrCreateProperty("average", "average", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getcount() {
        return getOrCreateProperty("count", "count", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getmax() {
        return getOrCreateProperty("max", "max", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getmin() {
        return getOrCreateProperty("min", "min", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement gettotal() {
        return getOrCreateProperty("total", "total", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StacksGrouped.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StacksGrouped.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StacksGrouped.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class maxHeader extends ValueElement {
      public maxHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StacksGrouped.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class minHeader extends ValueElement {
      public minHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StacksGrouped.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class totalHeader extends ValueElement {
      public totalHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StacksGrouped.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StackSummaryLV_tb extends PCFElement {
    public StackSummaryLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StacksGrouped.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StacksGrouped.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public pcftest.ProfilerResultsCV_StacksGrouped.entry._Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ProfilerResultsCV_StacksGrouped.entry._Select.class);
    }
    
    public pcftest.ProfilerResultsCV_StacksGrouped.entry._ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ProfilerResultsCV_StacksGrouped.entry._ViewDetail.class);
    }
    
    public ValueElement getname() {
      return getOrCreateProperty("name", "name", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement gettime() {
      return getOrCreateProperty("time", "time", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StacksGrouped.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StacksGrouped.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StacksGrouped.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class nameHeader extends ValueElement {
    public nameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StacksGrouped.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class timeHeader extends ValueElement {
    public timeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}