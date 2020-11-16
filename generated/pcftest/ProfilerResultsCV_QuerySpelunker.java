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
import pcftest.ProfilerResultsCV_QuerySpelunker.AggregatedQuerySummaryLV;
import pcftest.ProfilerResultsCV_QuerySpelunker.AggregatedQuerySummaryLV.ArgsCountHeader;
import pcftest.ProfilerResultsCV_QuerySpelunker.AggregatedQuerySummaryLV.AverageTimeHeader;
import pcftest.ProfilerResultsCV_QuerySpelunker.AggregatedQuerySummaryLV.ExecutionsHeader;
import pcftest.ProfilerResultsCV_QuerySpelunker.AggregatedQuerySummaryLV.QueryTextHeader;
import pcftest.ProfilerResultsCV_QuerySpelunker.AggregatedQuerySummaryLV.TotalTimeHeader;
import pcftest.ProfilerResultsCV_QuerySpelunker.AggregatedQuerySummaryLV_tb;
import pcftest.ProfilerResultsCV_QuerySpelunker.ArgumentsTab;
import pcftest.ProfilerResultsCV_QuerySpelunker.CallStacksTab;
import pcftest.ProfilerResultsCV_QuerySpelunker.CardTab;
import pcftest.ProfilerResultsCV_QuerySpelunker.EmptyTab;
import pcftest.ProfilerResultsCV_QuerySpelunker.QueriesTab;
import pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV;
import pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV.AverageQueryTimeHeader;
import pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV.MaxQueryTimeHeader;
import pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV.QueriesPerRequestHeader;
import pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV.QueryCountHeader;
import pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV.RequestsHeader;
import pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV.StackNameHeader;
import pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV.TotalQueryTimeHeader;
import pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV_tb;
import pcftest.ProfilerResultsCV_QuerySpelunker.StacksTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ProfilerResultsCV_QuerySpelunker extends ProfilerResultsCV {
  public final static String CHECKSUM = "fc307cbbb15124fcb2a040d374d251f8";
  
  public ProfilerResultsCV_QuerySpelunker(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AggregatedQuerySummaryLV getAggregatedQuerySummaryLV() {
    return getOrCreateProperty("AggregatedQuerySummaryLV", "AggregatedQuerySummaryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ProfilerResultsCV_QuerySpelunker.AggregatedQuerySummaryLV.class);
  }
  
  public AggregatedQuerySummaryLV_tb getAggregatedQuerySummaryLV_tb() {
    return getOrCreateProperty("AggregatedQuerySummaryLV_tb", "AggregatedQuerySummaryLV_tb", null, pcftest.ProfilerResultsCV_QuerySpelunker.AggregatedQuerySummaryLV_tb.class);
  }
  
  public ArgsSummaryLDV getArgsSummaryLDV() {
    return getOrCreateProperty("ArgsSummaryLDV", "ArgsSummaryLDV", null, pcftest.ArgsSummaryLDV.class);
  }
  
  public ArgumentsTab getArgumentsTab() {
    return getOrCreateProperty("ArgumentsTab", "ArgumentsTab", null, pcftest.ProfilerResultsCV_QuerySpelunker.ArgumentsTab.class);
  }
  
  public CallStacksTab getCallStacksTab() {
    return getOrCreateProperty("CallStacksTab", "CallStacksTab", null, pcftest.ProfilerResultsCV_QuerySpelunker.CallStacksTab.class);
  }
  
  public CardTab getCardTab() {
    return getOrCreateProperty("CardTab", "CardTab", null, pcftest.ProfilerResultsCV_QuerySpelunker.CardTab.class);
  }
  
  public EmptyTab getEmptyTab() {
    return getOrCreateProperty("EmptyTab", "EmptyTab", null, pcftest.ProfilerResultsCV_QuerySpelunker.EmptyTab.class);
  }
  
  public ProfilerResultsEmptyDV getProfilerResultsEmptyDV() {
    return getOrCreateProperty("ProfilerResultsEmptyDV", "ProfilerResultsEmptyDV", null, pcftest.ProfilerResultsEmptyDV.class);
  }
  
  public QueriesTab getQueriesTab() {
    return getOrCreateProperty("QueriesTab", "QueriesTab", null, pcftest.ProfilerResultsCV_QuerySpelunker.QueriesTab.class);
  }
  
  public QuerySummaryLDV getQuerySummaryLDV() {
    return getOrCreateProperty("QuerySummaryLDV", "QuerySummaryLDV", null, pcftest.QuerySummaryLDV.class);
  }
  
  public QuerySummaryLV getQuerySummaryLV() {
    return getOrCreateProperty("QuerySummaryLV", "QuerySummaryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV.class);
  }
  
  public QuerySummaryLV_tb getQuerySummaryLV_tb() {
    return getOrCreateProperty("QuerySummaryLV_tb", "QuerySummaryLV_tb", null, pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV_tb.class);
  }
  
  public StackSummaryLDV getStackSummaryLDV() {
    return getOrCreateProperty("StackSummaryLDV", "StackSummaryLDV", null, pcftest.StackSummaryLDV.class);
  }
  
  public StacksTab getStacksTab() {
    return getOrCreateProperty("StacksTab", "StacksTab", null, pcftest.ProfilerResultsCV_QuerySpelunker.StacksTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AggregatedQuerySummaryLV extends PCFElement {
    public AggregatedQuerySummaryLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getArgsCountFooter() {
      return getOrCreateProperty("ArgsCountFooter", "ArgsCountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ArgsCountHeader getArgsCountHeader() {
      return getOrCreateProperty("ArgsCountHeader", "ArgsCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_QuerySpelunker.AggregatedQuerySummaryLV.ArgsCountHeader.class);
    }
    
    public pcftest.ProfilerResultsCV_QuerySpelunker.AggregatedQuerySummaryLV.AverageRowCountHeader getAverageRowCountHeader() {
      return getOrCreateProperty("AverageRowCountHeader", "AverageRowCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_QuerySpelunker.AggregatedQuerySummaryLV.AverageRowCountHeader.class);
    }
    
    public AverageTimeHeader getAverageTimeHeader() {
      return getOrCreateProperty("AverageTimeHeader", "AverageTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_QuerySpelunker.AggregatedQuerySummaryLV.AverageTimeHeader.class);
    }
    
    public ValueElement getExecutionsFooter() {
      return getOrCreateProperty("ExecutionsFooter", "ExecutionsFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ExecutionsHeader getExecutionsHeader() {
      return getOrCreateProperty("ExecutionsHeader", "ExecutionsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_QuerySpelunker.AggregatedQuerySummaryLV.ExecutionsHeader.class);
    }
    
    public ValueElement getQueryTextFooter() {
      return getOrCreateProperty("QueryTextFooter", "QueryTextFooter", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public QueryTextHeader getQueryTextHeader() {
      return getOrCreateProperty("QueryTextHeader", "QueryTextHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_QuerySpelunker.AggregatedQuerySummaryLV.QueryTextHeader.class);
    }
    
    public ValueElement getTotalRowCountFooter() {
      return getOrCreateProperty("TotalRowCountFooter", "TotalRowCountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.ProfilerResultsCV_QuerySpelunker.AggregatedQuerySummaryLV.TotalRowCountHeader getTotalRowCountHeader() {
      return getOrCreateProperty("TotalRowCountHeader", "TotalRowCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_QuerySpelunker.AggregatedQuerySummaryLV.TotalRowCountHeader.class);
    }
    
    public ValueElement getTotalTimeFooter() {
      return getOrCreateProperty("TotalTimeFooter", "TotalTimeFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public TotalTimeHeader getTotalTimeHeader() {
      return getOrCreateProperty("TotalTimeHeader", "TotalTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_QuerySpelunker.AggregatedQuerySummaryLV.TotalTimeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ProfilerResultsCV_QuerySpelunker.AggregatedQuerySummaryLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ProfilerResultsCV_QuerySpelunker.AggregatedQuerySummaryLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ProfilerResultsCV_QuerySpelunker.AggregatedQuerySummaryLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ProfilerResultsCV_QuerySpelunker.AggregatedQuerySummaryLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ArgsCountHeader extends ValueElement {
      public ArgsCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AverageRowCountHeader extends ValueElement {
      public AverageRowCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AverageTimeHeader extends ValueElement {
      public AverageTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExecutionsHeader extends ValueElement {
      public ExecutionsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class QueryTextHeader extends ValueElement {
      public QueryTextHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TotalRowCountHeader extends ValueElement {
      public TotalRowCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TotalTimeHeader extends ValueElement {
      public TotalTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public pcftest.ProfilerResultsCV_QuerySpelunker.AggregatedQuerySummaryLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ProfilerResultsCV_QuerySpelunker.AggregatedQuerySummaryLV.entry._Select.class);
      }
      
      public pcftest.ProfilerResultsCV_QuerySpelunker.AggregatedQuerySummaryLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ProfilerResultsCV_QuerySpelunker.AggregatedQuerySummaryLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AggregatedQuerySummaryLV_tb extends PCFElement {
    public AggregatedQuerySummaryLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArgumentsTab extends ClickableActionElement {
    public ArgumentsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CallStacksTab extends ClickableActionElement {
    public CallStacksTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CardTab extends ClickableActionElement {
    public CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EmptyTab extends ClickableActionElement {
    public EmptyTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QueriesTab extends ClickableActionElement {
    public QueriesTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuerySummaryLV extends PCFElement {
    public QuerySummaryLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AverageQueryTimeHeader getAverageQueryTimeHeader() {
      return getOrCreateProperty("AverageQueryTimeHeader", "AverageQueryTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV.AverageQueryTimeHeader.class);
    }
    
    public pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV.AverageRowCountHeader getAverageRowCountHeader() {
      return getOrCreateProperty("AverageRowCountHeader", "AverageRowCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV.AverageRowCountHeader.class);
    }
    
    public MaxQueryTimeHeader getMaxQueryTimeHeader() {
      return getOrCreateProperty("MaxQueryTimeHeader", "MaxQueryTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV.MaxQueryTimeHeader.class);
    }
    
    public QueriesPerRequestHeader getQueriesPerRequestHeader() {
      return getOrCreateProperty("QueriesPerRequestHeader", "QueriesPerRequestHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV.QueriesPerRequestHeader.class);
    }
    
    public ValueElement getQueryCountFooter() {
      return getOrCreateProperty("QueryCountFooter", "QueryCountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public QueryCountHeader getQueryCountHeader() {
      return getOrCreateProperty("QueryCountHeader", "QueryCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV.QueryCountHeader.class);
    }
    
    public ValueElement getRequestsFooter() {
      return getOrCreateProperty("RequestsFooter", "RequestsFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public RequestsHeader getRequestsHeader() {
      return getOrCreateProperty("RequestsHeader", "RequestsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV.RequestsHeader.class);
    }
    
    public ValueElement getStackNameFooter() {
      return getOrCreateProperty("StackNameFooter", "StackNameFooter", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public StackNameHeader getStackNameHeader() {
      return getOrCreateProperty("StackNameHeader", "StackNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV.StackNameHeader.class);
    }
    
    public ValueElement getTotalQueryTimeFooter() {
      return getOrCreateProperty("TotalQueryTimeFooter", "TotalQueryTimeFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public TotalQueryTimeHeader getTotalQueryTimeHeader() {
      return getOrCreateProperty("TotalQueryTimeHeader", "TotalQueryTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV.TotalQueryTimeHeader.class);
    }
    
    public ValueElement getTotalRowCountFooter() {
      return getOrCreateProperty("TotalRowCountFooter", "TotalRowCountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV.TotalRowCountHeader getTotalRowCountHeader() {
      return getOrCreateProperty("TotalRowCountHeader", "TotalRowCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV.TotalRowCountHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AverageQueryTimeHeader extends ValueElement {
      public AverageQueryTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AverageRowCountHeader extends ValueElement {
      public AverageRowCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MaxQueryTimeHeader extends ValueElement {
      public MaxQueryTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class QueriesPerRequestHeader extends ValueElement {
      public QueriesPerRequestHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class QueryCountHeader extends ValueElement {
      public QueryCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RequestsHeader extends ValueElement {
      public RequestsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StackNameHeader extends ValueElement {
      public StackNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TotalQueryTimeHeader extends ValueElement {
      public TotalQueryTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TotalRowCountHeader extends ValueElement {
      public TotalRowCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV.entry._Select.class);
      }
      
      public pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ProfilerResultsCV_QuerySpelunker.QuerySummaryLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuerySummaryLV_tb extends PCFElement {
    public QuerySummaryLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.QuerySpelunker.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StacksTab extends ClickableActionElement {
    public StacksTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}