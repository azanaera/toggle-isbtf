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
import pcftest.ProfilerResultsCV_StackQuerySummary.AggregatedQuerySummaryLV;
import pcftest.ProfilerResultsCV_StackQuerySummary.AggregatedQuerySummaryLV.ArgsCountHeader;
import pcftest.ProfilerResultsCV_StackQuerySummary.AggregatedQuerySummaryLV.AverageTimeHeader;
import pcftest.ProfilerResultsCV_StackQuerySummary.AggregatedQuerySummaryLV.ExecutionsHeader;
import pcftest.ProfilerResultsCV_StackQuerySummary.AggregatedQuerySummaryLV.QueryTextHeader;
import pcftest.ProfilerResultsCV_StackQuerySummary.AggregatedQuerySummaryLV.TotalTimeHeader;
import pcftest.ProfilerResultsCV_StackQuerySummary.AggregatedQuerySummaryLV_tb;
import pcftest.ProfilerResultsCV_StackQuerySummary.ArgumentsTab;
import pcftest.ProfilerResultsCV_StackQuerySummary.CallStacksTab;
import pcftest.ProfilerResultsCV_StackQuerySummary.CardTab;
import pcftest.ProfilerResultsCV_StackQuerySummary.DoublyNestedCardLYGTab;
import pcftest.ProfilerResultsCV_StackQuerySummary.EmptyTab;
import pcftest.ProfilerResultsCV_StackQuerySummary.NestedCardTab;
import pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV;
import pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV.AverageQueryTimeHeader;
import pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV.MaxQueryTimeHeader;
import pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV.QueriesPerRequestHeader;
import pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV.QueryCountHeader;
import pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV.RequestsHeader;
import pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV.StackNameHeader;
import pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV.TotalQueryTimeHeader;
import pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ProfilerResultsCV_StackQuerySummary extends ProfilerResultsCV {
  public final static String CHECKSUM = "f730b84c0119790d941720e1b6bed959";
  
  public ProfilerResultsCV_StackQuerySummary(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AggregatedQuerySummaryLV getAggregatedQuerySummaryLV() {
    return getOrCreateProperty("AggregatedQuerySummaryLV", "AggregatedQuerySummaryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ProfilerResultsCV_StackQuerySummary.AggregatedQuerySummaryLV.class);
  }
  
  public AggregatedQuerySummaryLV_tb getAggregatedQuerySummaryLV_tb() {
    return getOrCreateProperty("AggregatedQuerySummaryLV_tb", "AggregatedQuerySummaryLV_tb", null, pcftest.ProfilerResultsCV_StackQuerySummary.AggregatedQuerySummaryLV_tb.class);
  }
  
  public ArgsSummaryLDV getArgsSummaryLDV() {
    return getOrCreateProperty("ArgsSummaryLDV", "ArgsSummaryLDV", null, pcftest.ArgsSummaryLDV.class);
  }
  
  public ArgumentsTab getArgumentsTab() {
    return getOrCreateProperty("ArgumentsTab", "ArgumentsTab", null, pcftest.ProfilerResultsCV_StackQuerySummary.ArgumentsTab.class);
  }
  
  public CallStacksTab getCallStacksTab() {
    return getOrCreateProperty("CallStacksTab", "CallStacksTab", null, pcftest.ProfilerResultsCV_StackQuerySummary.CallStacksTab.class);
  }
  
  public CardTab getCardTab() {
    return getOrCreateProperty("CardTab", "CardTab", null, pcftest.ProfilerResultsCV_StackQuerySummary.CardTab.class);
  }
  
  public DoublyNestedCardLYGTab getDoublyNestedCardLYGTab() {
    return getOrCreateProperty("DoublyNestedCardLYGTab", "DoublyNestedCardLYGTab", null, pcftest.ProfilerResultsCV_StackQuerySummary.DoublyNestedCardLYGTab.class);
  }
  
  public EmptyTab getEmptyTab() {
    return getOrCreateProperty("EmptyTab", "EmptyTab", null, pcftest.ProfilerResultsCV_StackQuerySummary.EmptyTab.class);
  }
  
  public NestedCardTab getNestedCardTab() {
    return getOrCreateProperty("NestedCardTab", "NestedCardTab", null, pcftest.ProfilerResultsCV_StackQuerySummary.NestedCardTab.class);
  }
  
  public ProfilerResultsEmptyDV getProfilerResultsEmptyDV() {
    return getOrCreateProperty("ProfilerResultsEmptyDV", "ProfilerResultsEmptyDV", null, pcftest.ProfilerResultsEmptyDV.class);
  }
  
  public QuerySummaryLDV getQuerySummaryLDV() {
    return getOrCreateProperty("QuerySummaryLDV", "QuerySummaryLDV", null, pcftest.QuerySummaryLDV.class);
  }
  
  public StackQuerySummaryLV getStackQuerySummaryLV() {
    return getOrCreateProperty("StackQuerySummaryLV", "StackQuerySummaryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV.class);
  }
  
  public StackQuerySummaryLV_tb getStackQuerySummaryLV_tb() {
    return getOrCreateProperty("StackQuerySummaryLV_tb", "StackQuerySummaryLV_tb", null, pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV_tb.class);
  }
  
  public StackSummaryLDV getStackSummaryLDV() {
    return getOrCreateProperty("StackSummaryLDV", "StackSummaryLDV", null, pcftest.StackSummaryLDV.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AggregatedQuerySummaryLV extends PCFElement {
    public AggregatedQuerySummaryLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getArgsCountFooter() {
      return getOrCreateProperty("ArgsCountFooter", "ArgsCountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ArgsCountHeader getArgsCountHeader() {
      return getOrCreateProperty("ArgsCountHeader", "ArgsCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_StackQuerySummary.AggregatedQuerySummaryLV.ArgsCountHeader.class);
    }
    
    public pcftest.ProfilerResultsCV_StackQuerySummary.AggregatedQuerySummaryLV.AverageRowCountHeader getAverageRowCountHeader() {
      return getOrCreateProperty("AverageRowCountHeader", "AverageRowCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_StackQuerySummary.AggregatedQuerySummaryLV.AverageRowCountHeader.class);
    }
    
    public AverageTimeHeader getAverageTimeHeader() {
      return getOrCreateProperty("AverageTimeHeader", "AverageTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_StackQuerySummary.AggregatedQuerySummaryLV.AverageTimeHeader.class);
    }
    
    public ValueElement getExecutionsFooter() {
      return getOrCreateProperty("ExecutionsFooter", "ExecutionsFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ExecutionsHeader getExecutionsHeader() {
      return getOrCreateProperty("ExecutionsHeader", "ExecutionsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_StackQuerySummary.AggregatedQuerySummaryLV.ExecutionsHeader.class);
    }
    
    public ValueElement getQueryTextFooter() {
      return getOrCreateProperty("QueryTextFooter", "QueryTextFooter", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public QueryTextHeader getQueryTextHeader() {
      return getOrCreateProperty("QueryTextHeader", "QueryTextHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_StackQuerySummary.AggregatedQuerySummaryLV.QueryTextHeader.class);
    }
    
    public ValueElement getTotalRowCountFooter() {
      return getOrCreateProperty("TotalRowCountFooter", "TotalRowCountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.ProfilerResultsCV_StackQuerySummary.AggregatedQuerySummaryLV.TotalRowCountHeader getTotalRowCountHeader() {
      return getOrCreateProperty("TotalRowCountHeader", "TotalRowCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_StackQuerySummary.AggregatedQuerySummaryLV.TotalRowCountHeader.class);
    }
    
    public ValueElement getTotalTimeFooter() {
      return getOrCreateProperty("TotalTimeFooter", "TotalTimeFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public TotalTimeHeader getTotalTimeHeader() {
      return getOrCreateProperty("TotalTimeHeader", "TotalTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_StackQuerySummary.AggregatedQuerySummaryLV.TotalTimeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ProfilerResultsCV_StackQuerySummary.AggregatedQuerySummaryLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ProfilerResultsCV_StackQuerySummary.AggregatedQuerySummaryLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ProfilerResultsCV_StackQuerySummary.AggregatedQuerySummaryLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ProfilerResultsCV_StackQuerySummary.AggregatedQuerySummaryLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ArgsCountHeader extends ValueElement {
      public ArgsCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AverageRowCountHeader extends ValueElement {
      public AverageRowCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AverageTimeHeader extends ValueElement {
      public AverageTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExecutionsHeader extends ValueElement {
      public ExecutionsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class QueryTextHeader extends ValueElement {
      public QueryTextHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TotalRowCountHeader extends ValueElement {
      public TotalRowCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TotalTimeHeader extends ValueElement {
      public TotalTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getArgsCount() {
        return getOrCreateProperty("ArgsCount", "ArgsCount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getAverageRowCount() {
        return getOrCreateProperty("AverageRowCount", "AverageRowCount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getAverageTime() {
        return getOrCreateProperty("AverageTime", "AverageTime", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getExecutions() {
        return getOrCreateProperty("Executions", "Executions", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getQueryText() {
        return getOrCreateProperty("QueryText", "QueryText", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getTotalRowCount() {
        return getOrCreateProperty("TotalRowCount", "TotalRowCount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getTotalTime() {
        return getOrCreateProperty("TotalTime", "TotalTime", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.ProfilerResultsCV_StackQuerySummary.AggregatedQuerySummaryLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ProfilerResultsCV_StackQuerySummary.AggregatedQuerySummaryLV.entry._Select.class);
      }
      
      public pcftest.ProfilerResultsCV_StackQuerySummary.AggregatedQuerySummaryLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ProfilerResultsCV_StackQuerySummary.AggregatedQuerySummaryLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AggregatedQuerySummaryLV_tb extends PCFElement {
    public AggregatedQuerySummaryLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArgumentsTab extends ClickableActionElement {
    public ArgumentsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CallStacksTab extends ClickableActionElement {
    public CallStacksTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CardTab extends ClickableActionElement {
    public CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DoublyNestedCardLYGTab extends ClickableActionElement {
    public DoublyNestedCardLYGTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EmptyTab extends ClickableActionElement {
    public EmptyTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NestedCardTab extends ClickableActionElement {
    public NestedCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StackQuerySummaryLV extends PCFElement {
    public StackQuerySummaryLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AverageQueryTimeHeader getAverageQueryTimeHeader() {
      return getOrCreateProperty("AverageQueryTimeHeader", "AverageQueryTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV.AverageQueryTimeHeader.class);
    }
    
    public pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV.AverageRowCountHeader getAverageRowCountHeader() {
      return getOrCreateProperty("AverageRowCountHeader", "AverageRowCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV.AverageRowCountHeader.class);
    }
    
    public MaxQueryTimeHeader getMaxQueryTimeHeader() {
      return getOrCreateProperty("MaxQueryTimeHeader", "MaxQueryTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV.MaxQueryTimeHeader.class);
    }
    
    public QueriesPerRequestHeader getQueriesPerRequestHeader() {
      return getOrCreateProperty("QueriesPerRequestHeader", "QueriesPerRequestHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV.QueriesPerRequestHeader.class);
    }
    
    public ValueElement getQueryCountFooter() {
      return getOrCreateProperty("QueryCountFooter", "QueryCountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public QueryCountHeader getQueryCountHeader() {
      return getOrCreateProperty("QueryCountHeader", "QueryCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV.QueryCountHeader.class);
    }
    
    public ValueElement getRequestsFooter() {
      return getOrCreateProperty("RequestsFooter", "RequestsFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public RequestsHeader getRequestsHeader() {
      return getOrCreateProperty("RequestsHeader", "RequestsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV.RequestsHeader.class);
    }
    
    public ValueElement getStackNameFooter() {
      return getOrCreateProperty("StackNameFooter", "StackNameFooter", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public StackNameHeader getStackNameHeader() {
      return getOrCreateProperty("StackNameHeader", "StackNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV.StackNameHeader.class);
    }
    
    public ValueElement getTotalQueryTimeFooter() {
      return getOrCreateProperty("TotalQueryTimeFooter", "TotalQueryTimeFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public TotalQueryTimeHeader getTotalQueryTimeHeader() {
      return getOrCreateProperty("TotalQueryTimeHeader", "TotalQueryTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV.TotalQueryTimeHeader.class);
    }
    
    public ValueElement getTotalRowCountFooter() {
      return getOrCreateProperty("TotalRowCountFooter", "TotalRowCountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV.TotalRowCountHeader getTotalRowCountHeader() {
      return getOrCreateProperty("TotalRowCountHeader", "TotalRowCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV.TotalRowCountHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AverageQueryTimeHeader extends ValueElement {
      public AverageQueryTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AverageRowCountHeader extends ValueElement {
      public AverageRowCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MaxQueryTimeHeader extends ValueElement {
      public MaxQueryTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class QueriesPerRequestHeader extends ValueElement {
      public QueriesPerRequestHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class QueryCountHeader extends ValueElement {
      public QueryCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RequestsHeader extends ValueElement {
      public RequestsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StackNameHeader extends ValueElement {
      public StackNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TotalQueryTimeHeader extends ValueElement {
      public TotalQueryTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TotalRowCountHeader extends ValueElement {
      public TotalRowCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getAverageQueryTime() {
        return getOrCreateProperty("AverageQueryTime", "AverageQueryTime", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getAverageRowCount() {
        return getOrCreateProperty("AverageRowCount", "AverageRowCount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getMaxQueryTime() {
        return getOrCreateProperty("MaxQueryTime", "MaxQueryTime", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getQueriesPerRequest() {
        return getOrCreateProperty("QueriesPerRequest", "QueriesPerRequest", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getQueryCount() {
        return getOrCreateProperty("QueryCount", "QueryCount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getRequests() {
        return getOrCreateProperty("Requests", "Requests", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getStackName() {
        return getOrCreateProperty("StackName", "StackName", null, gw.smoketest.platform.web.ValueElement.class);
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
      
      public pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV.entry._Select.class);
      }
      
      public pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ProfilerResultsCV_StackQuerySummary.StackQuerySummaryLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.StackQuerySummary.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StackQuerySummaryLV_tb extends PCFElement {
    public StackQuerySummaryLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}