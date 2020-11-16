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
import pcftest.StackSummaryLDV.ArgsLV;
import pcftest.StackSummaryLDV.ArgsLV.AllArgsHeader;
import pcftest.StackSummaryLDV.ArgsLV.ArgsAverageTimeHeader;
import pcftest.StackSummaryLDV.ArgsLV.ArgsMaxQueryTimeHeader;
import pcftest.StackSummaryLDV.ArgsLV.ArgsQueryCountHeader;
import pcftest.StackSummaryLDV.ArgsLV.ArgsTotalQueryTimeHeader;
import pcftest.StackSummaryLDV.ArgsLV.AverageRowCountHeader;
import pcftest.StackSummaryLDV.ArgsLV_tb;
import pcftest.StackSummaryLDV.ArgsTab;
import pcftest.StackSummaryLDV.FilteredStackTraceTab;
import pcftest.StackSummaryLDV.FullStackTraceTab;
import pcftest.StackSummaryLDV.SQLTab;
import pcftest.StackSummaryLDV.StackDetailsLV;
import pcftest.StackSummaryLDV.StackDetailsLV.ArgsCountHeader;
import pcftest.StackSummaryLDV.StackDetailsLV.SummarizedStackHeader;
import pcftest.StackSummaryLDV.StackDetailsLV.TotalQueryTimeHeader;
import pcftest.StackSummaryLDV.StackDetailsLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/StackSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class StackSummaryLDV extends PCFElement {
  public final static String CHECKSUM = "75a07570cd1cf569dfae9d37ccede772";
  
  public StackSummaryLDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ArgsLV getArgsLV() {
    return getOrCreateProperty("ArgsLV", "ArgsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.StackSummaryLDV.ArgsLV.class);
  }
  
  public ArgsLV_tb getArgsLV_tb() {
    return getOrCreateProperty("ArgsLV_tb", "ArgsLV_tb", null, pcftest.StackSummaryLDV.ArgsLV_tb.class);
  }
  
  public ArgsTab getArgsTab() {
    return getOrCreateProperty("ArgsTab", "ArgsTab", null, pcftest.StackSummaryLDV.ArgsTab.class);
  }
  
  public FilteredStackTraceTab getFilteredStackTraceTab() {
    return getOrCreateProperty("FilteredStackTraceTab", "FilteredStackTraceTab", null, pcftest.StackSummaryLDV.FilteredStackTraceTab.class);
  }
  
  public FullStackTraceTab getFullStackTraceTab() {
    return getOrCreateProperty("FullStackTraceTab", "FullStackTraceTab", null, pcftest.StackSummaryLDV.FullStackTraceTab.class);
  }
  
  public SQLTab getSQLTab() {
    return getOrCreateProperty("SQLTab", "SQLTab", null, pcftest.StackSummaryLDV.SQLTab.class);
  }
  
  public StackDetailsLV getStackDetailsLV() {
    return getOrCreateProperty("StackDetailsLV", "StackDetailsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.StackSummaryLDV.StackDetailsLV.class);
  }
  
  public StackDetailsLV_tb getStackDetailsLV_tb() {
    return getOrCreateProperty("StackDetailsLV_tb", "StackDetailsLV_tb", null, pcftest.StackSummaryLDV.StackDetailsLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/StackSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArgsLV extends PCFElement {
    public ArgsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AllArgsHeader getAllArgsHeader() {
      return getOrCreateProperty("AllArgsHeader", "AllArgsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.StackSummaryLDV.ArgsLV.AllArgsHeader.class);
    }
    
    public ArgsAverageTimeHeader getArgsAverageTimeHeader() {
      return getOrCreateProperty("ArgsAverageTimeHeader", "ArgsAverageTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.StackSummaryLDV.ArgsLV.ArgsAverageTimeHeader.class);
    }
    
    public ArgsMaxQueryTimeHeader getArgsMaxQueryTimeHeader() {
      return getOrCreateProperty("ArgsMaxQueryTimeHeader", "ArgsMaxQueryTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.StackSummaryLDV.ArgsLV.ArgsMaxQueryTimeHeader.class);
    }
    
    public ValueElement getArgsQueryCountFooter() {
      return getOrCreateProperty("ArgsQueryCountFooter", "ArgsQueryCountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ArgsQueryCountHeader getArgsQueryCountHeader() {
      return getOrCreateProperty("ArgsQueryCountHeader", "ArgsQueryCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.StackSummaryLDV.ArgsLV.ArgsQueryCountHeader.class);
    }
    
    public ValueElement getArgsTotalQueryTimeFooter() {
      return getOrCreateProperty("ArgsTotalQueryTimeFooter", "ArgsTotalQueryTimeFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ArgsTotalQueryTimeHeader getArgsTotalQueryTimeHeader() {
      return getOrCreateProperty("ArgsTotalQueryTimeHeader", "ArgsTotalQueryTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.StackSummaryLDV.ArgsLV.ArgsTotalQueryTimeHeader.class);
    }
    
    public AverageRowCountHeader getAverageRowCountHeader() {
      return getOrCreateProperty("AverageRowCountHeader", "AverageRowCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.StackSummaryLDV.ArgsLV.AverageRowCountHeader.class);
    }
    
    public ValueElement getTotalRowCountFooter() {
      return getOrCreateProperty("TotalRowCountFooter", "TotalRowCountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.StackSummaryLDV.ArgsLV.TotalRowCountHeader getTotalRowCountHeader() {
      return getOrCreateProperty("TotalRowCountHeader", "TotalRowCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.StackSummaryLDV.ArgsLV.TotalRowCountHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.StackSummaryLDV.ArgsLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.StackSummaryLDV.ArgsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.StackSummaryLDV.ArgsLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.StackSummaryLDV.ArgsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/StackSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AllArgsHeader extends ValueElement {
      public AllArgsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/StackSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ArgsAverageTimeHeader extends ValueElement {
      public ArgsAverageTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/StackSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ArgsMaxQueryTimeHeader extends ValueElement {
      public ArgsMaxQueryTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/StackSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ArgsQueryCountHeader extends ValueElement {
      public ArgsQueryCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/StackSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ArgsTotalQueryTimeHeader extends ValueElement {
      public ArgsTotalQueryTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/StackSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AverageRowCountHeader extends ValueElement {
      public AverageRowCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/StackSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TotalRowCountHeader extends ValueElement {
      public TotalRowCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/StackSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/StackSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getAllArgs() {
        return getOrCreateProperty("AllArgs", "AllArgs", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getArgsAverageTime() {
        return getOrCreateProperty("ArgsAverageTime", "ArgsAverageTime", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getArgsMaxQueryTime() {
        return getOrCreateProperty("ArgsMaxQueryTime", "ArgsMaxQueryTime", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getArgsQueryCount() {
        return getOrCreateProperty("ArgsQueryCount", "ArgsQueryCount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getArgsTotalQueryTime() {
        return getOrCreateProperty("ArgsTotalQueryTime", "ArgsTotalQueryTime", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getAverageRowCount() {
        return getOrCreateProperty("AverageRowCount", "AverageRowCount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getTotalRowCount() {
        return getOrCreateProperty("TotalRowCount", "TotalRowCount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.StackSummaryLDV.ArgsLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.StackSummaryLDV.ArgsLV.entry._Select.class);
      }
      
      public pcftest.StackSummaryLDV.ArgsLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.StackSummaryLDV.ArgsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/StackSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/StackSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/profiler/StackSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArgsLV_tb extends PCFElement {
    public ArgsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/StackSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArgsTab extends ClickableActionElement {
    public ArgsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/StackSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FilteredStackTraceTab extends ClickableActionElement {
    public FilteredStackTraceTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/StackSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class FullStackTraceTab extends ClickableActionElement {
    public FullStackTraceTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/StackSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SQLTab extends ClickableActionElement {
    public SQLTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/StackSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StackDetailsLV extends PCFElement {
    public StackDetailsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getArgsCountFooter() {
      return getOrCreateProperty("ArgsCountFooter", "ArgsCountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ArgsCountHeader getArgsCountHeader() {
      return getOrCreateProperty("ArgsCountHeader", "ArgsCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.StackSummaryLDV.StackDetailsLV.ArgsCountHeader.class);
    }
    
    public ValueElement getSummarizedStackFooter() {
      return getOrCreateProperty("SummarizedStackFooter", "SummarizedStackFooter", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public SummarizedStackHeader getSummarizedStackHeader() {
      return getOrCreateProperty("SummarizedStackHeader", "SummarizedStackHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.StackSummaryLDV.StackDetailsLV.SummarizedStackHeader.class);
    }
    
    public ValueElement getTotalQueryTimeFooter() {
      return getOrCreateProperty("TotalQueryTimeFooter", "TotalQueryTimeFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public TotalQueryTimeHeader getTotalQueryTimeHeader() {
      return getOrCreateProperty("TotalQueryTimeHeader", "TotalQueryTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.StackSummaryLDV.StackDetailsLV.TotalQueryTimeHeader.class);
    }
    
    public ValueElement getTotalRowCountFooter() {
      return getOrCreateProperty("TotalRowCountFooter", "TotalRowCountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.StackSummaryLDV.StackDetailsLV.TotalRowCountHeader getTotalRowCountHeader() {
      return getOrCreateProperty("TotalRowCountHeader", "TotalRowCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.StackSummaryLDV.StackDetailsLV.TotalRowCountHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.StackSummaryLDV.StackDetailsLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.StackSummaryLDV.StackDetailsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.StackSummaryLDV.StackDetailsLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.StackSummaryLDV.StackDetailsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/StackSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ArgsCountHeader extends ValueElement {
      public ArgsCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/StackSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SummarizedStackHeader extends ValueElement {
      public SummarizedStackHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/StackSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TotalQueryTimeHeader extends ValueElement {
      public TotalQueryTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/StackSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TotalRowCountHeader extends ValueElement {
      public TotalRowCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/StackSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/StackSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getArgsCount() {
        return getOrCreateProperty("ArgsCount", "ArgsCount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getSummarizedStack() {
        return getOrCreateProperty("SummarizedStack", "SummarizedStack", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getTotalQueryTime() {
        return getOrCreateProperty("TotalQueryTime", "TotalQueryTime", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getTotalRowCount() {
        return getOrCreateProperty("TotalRowCount", "TotalRowCount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.StackSummaryLDV.StackDetailsLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.StackSummaryLDV.StackDetailsLV.entry._Select.class);
      }
      
      public pcftest.StackSummaryLDV.StackDetailsLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.StackSummaryLDV.StackDetailsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/StackSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/StackSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/profiler/StackSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StackDetailsLV_tb extends PCFElement {
    public StackDetailsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}