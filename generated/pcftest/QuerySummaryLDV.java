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
import pcftest.QuerySummaryLDV.ArgsTab;
import pcftest.QuerySummaryLDV.FilteredStackTraceTab;
import pcftest.QuerySummaryLDV.FullStackTraceTab;
import pcftest.QuerySummaryLDV.PCFStackTraceTab;
import pcftest.QuerySummaryLDV.QueryDetailsLV;
import pcftest.QuerySummaryLDV.QueryDetailsLV.ArgsHeader;
import pcftest.QuerySummaryLDV.QueryDetailsLV.CallStackHeader;
import pcftest.QuerySummaryLDV.QueryDetailsLV.QueryTimeHeader;
import pcftest.QuerySummaryLDV.QueryDetailsLV.TotalRowCountHeader;
import pcftest.QuerySummaryLDV.QueryDetailsLV._ListPaging;
import pcftest.QuerySummaryLDV.QueryDetailsLV.entry;
import pcftest.QuerySummaryLDV.QueryDetailsLV.entry._Select;
import pcftest.QuerySummaryLDV.QueryDetailsLV.entry._ViewDetail;
import pcftest.QuerySummaryLDV.QueryDetailsLV_tb;
import pcftest.QuerySummaryLDV.SQLTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/QuerySummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class QuerySummaryLDV extends PCFElement {
  public final static String CHECKSUM = "f61c3e7a3ca6d34b935ed7eda1dc2b6d";
  
  public QuerySummaryLDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ArgsTab getArgsTab() {
    return getOrCreateProperty("ArgsTab", "ArgsTab", null, pcftest.QuerySummaryLDV.ArgsTab.class);
  }
  
  public FilteredStackTraceTab getFilteredStackTraceTab() {
    return getOrCreateProperty("FilteredStackTraceTab", "FilteredStackTraceTab", null, pcftest.QuerySummaryLDV.FilteredStackTraceTab.class);
  }
  
  public FullStackTraceTab getFullStackTraceTab() {
    return getOrCreateProperty("FullStackTraceTab", "FullStackTraceTab", null, pcftest.QuerySummaryLDV.FullStackTraceTab.class);
  }
  
  public PCFStackTraceTab getPCFStackTraceTab() {
    return getOrCreateProperty("PCFStackTraceTab", "PCFStackTraceTab", null, pcftest.QuerySummaryLDV.PCFStackTraceTab.class);
  }
  
  public QueryDetailsLV getQueryDetailsLV() {
    return getOrCreateProperty("QueryDetailsLV", "QueryDetailsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.QuerySummaryLDV.QueryDetailsLV.class);
  }
  
  public QueryDetailsLV_tb getQueryDetailsLV_tb() {
    return getOrCreateProperty("QueryDetailsLV_tb", "QueryDetailsLV_tb", null, pcftest.QuerySummaryLDV.QueryDetailsLV_tb.class);
  }
  
  public SQLTab getSQLTab() {
    return getOrCreateProperty("SQLTab", "SQLTab", null, pcftest.QuerySummaryLDV.SQLTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/QuerySummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArgsTab extends ClickableActionElement {
    public ArgsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/QuerySummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FilteredStackTraceTab extends ClickableActionElement {
    public FilteredStackTraceTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/QuerySummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FullStackTraceTab extends ClickableActionElement {
    public FullStackTraceTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/QuerySummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PCFStackTraceTab extends ClickableActionElement {
    public PCFStackTraceTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/QuerySummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QueryDetailsLV extends PCFElement {
    public QueryDetailsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ArgsHeader getArgsHeader() {
      return getOrCreateProperty("ArgsHeader", "ArgsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.QuerySummaryLDV.QueryDetailsLV.ArgsHeader.class);
    }
    
    public ValueElement getCallStackFooter() {
      return getOrCreateProperty("CallStackFooter", "CallStackFooter", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public CallStackHeader getCallStackHeader() {
      return getOrCreateProperty("CallStackHeader", "CallStackHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.QuerySummaryLDV.QueryDetailsLV.CallStackHeader.class);
    }
    
    public ValueElement getQueryTimeFooter() {
      return getOrCreateProperty("QueryTimeFooter", "QueryTimeFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public QueryTimeHeader getQueryTimeHeader() {
      return getOrCreateProperty("QueryTimeHeader", "QueryTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.QuerySummaryLDV.QueryDetailsLV.QueryTimeHeader.class);
    }
    
    public ValueElement getTotalRowCountFooter() {
      return getOrCreateProperty("TotalRowCountFooter", "TotalRowCountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public TotalRowCountHeader getTotalRowCountHeader() {
      return getOrCreateProperty("TotalRowCountHeader", "TotalRowCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.QuerySummaryLDV.QueryDetailsLV.TotalRowCountHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.QuerySummaryLDV.QueryDetailsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.QuerySummaryLDV.QueryDetailsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/QuerySummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ArgsHeader extends ValueElement {
      public ArgsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/QuerySummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CallStackHeader extends ValueElement {
      public CallStackHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/QuerySummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class QueryTimeHeader extends ValueElement {
      public QueryTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/QuerySummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TotalRowCountHeader extends ValueElement {
      public TotalRowCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/QuerySummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/QuerySummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getArgs() {
        return getOrCreateProperty("Args", "Args", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getCallStack() {
        return getOrCreateProperty("CallStack", "CallStack", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getQueryTime() {
        return getOrCreateProperty("QueryTime", "QueryTime", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getTotalRowCount() {
        return getOrCreateProperty("TotalRowCount", "TotalRowCount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.QuerySummaryLDV.QueryDetailsLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.QuerySummaryLDV.QueryDetailsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/QuerySummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/QuerySummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/QuerySummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QueryDetailsLV_tb extends PCFElement {
    public QueryDetailsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/QuerySummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SQLTab extends ClickableActionElement {
    public SQLTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}