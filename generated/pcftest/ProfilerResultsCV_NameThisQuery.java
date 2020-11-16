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
import pcftest.ProfilerResultsCV_NameThisQuery.AgQSummaryLV;
import pcftest.ProfilerResultsCV_NameThisQuery.AgQSummaryLV.AverageTimeHeader;
import pcftest.ProfilerResultsCV_NameThisQuery.AgQSummaryLV.ExecutionsHeader;
import pcftest.ProfilerResultsCV_NameThisQuery.AgQSummaryLV.QueryTextHeader;
import pcftest.ProfilerResultsCV_NameThisQuery.AgQSummaryLV.ScoreHeader;
import pcftest.ProfilerResultsCV_NameThisQuery.AgQSummaryLV.TotalTimeHeader;
import pcftest.ProfilerResultsCV_NameThisQuery.AgQSummaryLV_tb;
import pcftest.ProfilerResultsCV_NameThisQuery.CardTab;
import pcftest.ProfilerResultsCV_NameThisQuery.EmptyTab;
import pcftest.ProfilerResultsCV_NameThisQuery.QueriesTab;
import pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV;
import pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV.AverageQueryTimeHeader;
import pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV.MaxQueryTimeHeader;
import pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV.QueriesPerRequestHeader;
import pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV.QueryCountHeader;
import pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV.RequestsHeader;
import pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV.StackNameHeader;
import pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV.TotalQueryTimeHeader;
import pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV_tb;
import pcftest.ProfilerResultsCV_NameThisQuery.StacksTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ProfilerResultsCV_NameThisQuery extends ProfilerResultsCV {
  public final static String CHECKSUM = "3e981efd470143b56134115ec1560949";
  
  public ProfilerResultsCV_NameThisQuery(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AgQSummaryLV getAgQSummaryLV() {
    return getOrCreateProperty("AgQSummaryLV", "AgQSummaryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ProfilerResultsCV_NameThisQuery.AgQSummaryLV.class);
  }
  
  public AgQSummaryLV_tb getAgQSummaryLV_tb() {
    return getOrCreateProperty("AgQSummaryLV_tb", "AgQSummaryLV_tb", null, pcftest.ProfilerResultsCV_NameThisQuery.AgQSummaryLV_tb.class);
  }
  
  public CardTab getCardTab() {
    return getOrCreateProperty("CardTab", "CardTab", null, pcftest.ProfilerResultsCV_NameThisQuery.CardTab.class);
  }
  
  public EmptyTab getEmptyTab() {
    return getOrCreateProperty("EmptyTab", "EmptyTab", null, pcftest.ProfilerResultsCV_NameThisQuery.EmptyTab.class);
  }
  
  public ProfilerResultsEmptyDV getProfilerResultsEmptyDV() {
    return getOrCreateProperty("ProfilerResultsEmptyDV", "ProfilerResultsEmptyDV", null, pcftest.ProfilerResultsEmptyDV.class);
  }
  
  public QueriesTab getQueriesTab() {
    return getOrCreateProperty("QueriesTab", "QueriesTab", null, pcftest.ProfilerResultsCV_NameThisQuery.QueriesTab.class);
  }
  
  public QuerySummaryLDV getQuerySummaryLDV() {
    return getOrCreateProperty("QuerySummaryLDV", "QuerySummaryLDV", null, pcftest.QuerySummaryLDV.class);
  }
  
  public QuerySummaryLV getQuerySummaryLV() {
    return getOrCreateProperty("QuerySummaryLV", "QuerySummaryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV.class);
  }
  
  public QuerySummaryLV_tb getQuerySummaryLV_tb() {
    return getOrCreateProperty("QuerySummaryLV_tb", "QuerySummaryLV_tb", null, pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV_tb.class);
  }
  
  public ValueElement getSQLString() {
    return getOrCreateProperty("SQLString", "SQLString", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public SearchAndResetInputSet getSearchAndResetInputSet() {
    return getOrCreateProperty("SearchAndResetInputSet", "SearchAndResetInputSet", null, pcftest.SearchAndResetInputSet.class);
  }
  
  public StacksTab getStacksTab() {
    return getOrCreateProperty("StacksTab", "StacksTab", null, pcftest.ProfilerResultsCV_NameThisQuery.StacksTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AgQSummaryLV extends PCFElement {
    public AgQSummaryLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.ProfilerResultsCV_NameThisQuery.AgQSummaryLV.AverageRowCountHeader getAverageRowCountHeader() {
      return getOrCreateProperty("AverageRowCountHeader", "AverageRowCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_NameThisQuery.AgQSummaryLV.AverageRowCountHeader.class);
    }
    
    public AverageTimeHeader getAverageTimeHeader() {
      return getOrCreateProperty("AverageTimeHeader", "AverageTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_NameThisQuery.AgQSummaryLV.AverageTimeHeader.class);
    }
    
    public ExecutionsHeader getExecutionsHeader() {
      return getOrCreateProperty("ExecutionsHeader", "ExecutionsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_NameThisQuery.AgQSummaryLV.ExecutionsHeader.class);
    }
    
    public QueryTextHeader getQueryTextHeader() {
      return getOrCreateProperty("QueryTextHeader", "QueryTextHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_NameThisQuery.AgQSummaryLV.QueryTextHeader.class);
    }
    
    public ScoreHeader getScoreHeader() {
      return getOrCreateProperty("ScoreHeader", "ScoreHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_NameThisQuery.AgQSummaryLV.ScoreHeader.class);
    }
    
    public ValueElement getTotalRowCountFooter() {
      return getOrCreateProperty("TotalRowCountFooter", "TotalRowCountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.ProfilerResultsCV_NameThisQuery.AgQSummaryLV.TotalRowCountHeader getTotalRowCountHeader() {
      return getOrCreateProperty("TotalRowCountHeader", "TotalRowCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_NameThisQuery.AgQSummaryLV.TotalRowCountHeader.class);
    }
    
    public TotalTimeHeader getTotalTimeHeader() {
      return getOrCreateProperty("TotalTimeHeader", "TotalTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_NameThisQuery.AgQSummaryLV.TotalTimeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ProfilerResultsCV_NameThisQuery.AgQSummaryLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ProfilerResultsCV_NameThisQuery.AgQSummaryLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ProfilerResultsCV_NameThisQuery.AgQSummaryLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ProfilerResultsCV_NameThisQuery.AgQSummaryLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AverageRowCountHeader extends ValueElement {
      public AverageRowCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AverageTimeHeader extends ValueElement {
      public AverageTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExecutionsHeader extends ValueElement {
      public ExecutionsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class QueryTextHeader extends ValueElement {
      public QueryTextHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ScoreHeader extends ValueElement {
      public ScoreHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TotalRowCountHeader extends ValueElement {
      public TotalRowCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TotalTimeHeader extends ValueElement {
      public TotalTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
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
      
      public ValueElement getScore() {
        return getOrCreateProperty("Score", "Score", null, gw.smoketest.platform.web.ValueElement.class);
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
      
      public pcftest.ProfilerResultsCV_NameThisQuery.AgQSummaryLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ProfilerResultsCV_NameThisQuery.AgQSummaryLV.entry._Select.class);
      }
      
      public pcftest.ProfilerResultsCV_NameThisQuery.AgQSummaryLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ProfilerResultsCV_NameThisQuery.AgQSummaryLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AgQSummaryLV_tb extends PCFElement {
    public AgQSummaryLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CardTab extends ClickableActionElement {
    public CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EmptyTab extends ClickableActionElement {
    public EmptyTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QueriesTab extends ClickableActionElement {
    public QueriesTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuerySummaryLV extends PCFElement {
    public QuerySummaryLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AverageQueryTimeHeader getAverageQueryTimeHeader() {
      return getOrCreateProperty("AverageQueryTimeHeader", "AverageQueryTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV.AverageQueryTimeHeader.class);
    }
    
    public pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV.AverageRowCountHeader getAverageRowCountHeader() {
      return getOrCreateProperty("AverageRowCountHeader", "AverageRowCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV.AverageRowCountHeader.class);
    }
    
    public MaxQueryTimeHeader getMaxQueryTimeHeader() {
      return getOrCreateProperty("MaxQueryTimeHeader", "MaxQueryTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV.MaxQueryTimeHeader.class);
    }
    
    public QueriesPerRequestHeader getQueriesPerRequestHeader() {
      return getOrCreateProperty("QueriesPerRequestHeader", "QueriesPerRequestHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV.QueriesPerRequestHeader.class);
    }
    
    public QueryCountHeader getQueryCountHeader() {
      return getOrCreateProperty("QueryCountHeader", "QueryCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV.QueryCountHeader.class);
    }
    
    public RequestsHeader getRequestsHeader() {
      return getOrCreateProperty("RequestsHeader", "RequestsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV.RequestsHeader.class);
    }
    
    public StackNameHeader getStackNameHeader() {
      return getOrCreateProperty("StackNameHeader", "StackNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV.StackNameHeader.class);
    }
    
    public TotalQueryTimeHeader getTotalQueryTimeHeader() {
      return getOrCreateProperty("TotalQueryTimeHeader", "TotalQueryTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV.TotalQueryTimeHeader.class);
    }
    
    public ValueElement getTotalRowCountFooter() {
      return getOrCreateProperty("TotalRowCountFooter", "TotalRowCountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV.TotalRowCountHeader getTotalRowCountHeader() {
      return getOrCreateProperty("TotalRowCountHeader", "TotalRowCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV.TotalRowCountHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AverageQueryTimeHeader extends ValueElement {
      public AverageQueryTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AverageRowCountHeader extends ValueElement {
      public AverageRowCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MaxQueryTimeHeader extends ValueElement {
      public MaxQueryTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class QueriesPerRequestHeader extends ValueElement {
      public QueriesPerRequestHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class QueryCountHeader extends ValueElement {
      public QueryCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RequestsHeader extends ValueElement {
      public RequestsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StackNameHeader extends ValueElement {
      public StackNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TotalQueryTimeHeader extends ValueElement {
      public TotalQueryTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TotalRowCountHeader extends ValueElement {
      public TotalRowCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV.entry._Select.class);
      }
      
      public pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ProfilerResultsCV_NameThisQuery.QuerySummaryLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class QuerySummaryLV_tb extends PCFElement {
    public QuerySummaryLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.NameThisQuery.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StacksTab extends ClickableActionElement {
    public StacksTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}