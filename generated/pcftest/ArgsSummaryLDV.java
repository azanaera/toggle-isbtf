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
import pcftest.ArgsSummaryLDV.ArgsTab;
import pcftest.ArgsSummaryLDV.SQLTab;
import pcftest.ArgsSummaryLDV.StackDetailsLV;
import pcftest.ArgsSummaryLDV.StackDetailsLV.AverageRowCountHeader;
import pcftest.ArgsSummaryLDV.StackDetailsLV.AverageTimeHeader;
import pcftest.ArgsSummaryLDV.StackDetailsLV.MaxQueryTimeHeader;
import pcftest.ArgsSummaryLDV.StackDetailsLV.QueryCountHeader;
import pcftest.ArgsSummaryLDV.StackDetailsLV.ShortArgsHeader;
import pcftest.ArgsSummaryLDV.StackDetailsLV.TotalQueryTimeHeader;
import pcftest.ArgsSummaryLDV.StackDetailsLV.TotalRowCountHeader;
import pcftest.ArgsSummaryLDV.StackDetailsLV._ListPaging;
import pcftest.ArgsSummaryLDV.StackDetailsLV.entry;
import pcftest.ArgsSummaryLDV.StackDetailsLV.entry._Select;
import pcftest.ArgsSummaryLDV.StackDetailsLV.entry._ViewDetail;
import pcftest.ArgsSummaryLDV.StackDetailsLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/ArgsSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ArgsSummaryLDV extends PCFElement {
  public final static String CHECKSUM = "0b6c42d46b8e3a8a35c938f130aac76d";
  
  public ArgsSummaryLDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ArgsTab getArgsTab() {
    return getOrCreateProperty("ArgsTab", "ArgsTab", null, pcftest.ArgsSummaryLDV.ArgsTab.class);
  }
  
  public SQLTab getSQLTab() {
    return getOrCreateProperty("SQLTab", "SQLTab", null, pcftest.ArgsSummaryLDV.SQLTab.class);
  }
  
  public StackDetailsLV getStackDetailsLV() {
    return getOrCreateProperty("StackDetailsLV", "StackDetailsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ArgsSummaryLDV.StackDetailsLV.class);
  }
  
  public StackDetailsLV_tb getStackDetailsLV_tb() {
    return getOrCreateProperty("StackDetailsLV_tb", "StackDetailsLV_tb", null, pcftest.ArgsSummaryLDV.StackDetailsLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ArgsSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArgsTab extends ClickableActionElement {
    public ArgsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ArgsSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SQLTab extends ClickableActionElement {
    public SQLTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ArgsSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StackDetailsLV extends PCFElement {
    public StackDetailsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AverageRowCountHeader getAverageRowCountHeader() {
      return getOrCreateProperty("AverageRowCountHeader", "AverageRowCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ArgsSummaryLDV.StackDetailsLV.AverageRowCountHeader.class);
    }
    
    public AverageTimeHeader getAverageTimeHeader() {
      return getOrCreateProperty("AverageTimeHeader", "AverageTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ArgsSummaryLDV.StackDetailsLV.AverageTimeHeader.class);
    }
    
    public MaxQueryTimeHeader getMaxQueryTimeHeader() {
      return getOrCreateProperty("MaxQueryTimeHeader", "MaxQueryTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ArgsSummaryLDV.StackDetailsLV.MaxQueryTimeHeader.class);
    }
    
    public ValueElement getQueryCountFooter() {
      return getOrCreateProperty("QueryCountFooter", "QueryCountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public QueryCountHeader getQueryCountHeader() {
      return getOrCreateProperty("QueryCountHeader", "QueryCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ArgsSummaryLDV.StackDetailsLV.QueryCountHeader.class);
    }
    
    public ValueElement getShortArgsFooter() {
      return getOrCreateProperty("ShortArgsFooter", "ShortArgsFooter", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ShortArgsHeader getShortArgsHeader() {
      return getOrCreateProperty("ShortArgsHeader", "ShortArgsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ArgsSummaryLDV.StackDetailsLV.ShortArgsHeader.class);
    }
    
    public ValueElement getTotalQueryTimeFooter() {
      return getOrCreateProperty("TotalQueryTimeFooter", "TotalQueryTimeFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public TotalQueryTimeHeader getTotalQueryTimeHeader() {
      return getOrCreateProperty("TotalQueryTimeHeader", "TotalQueryTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ArgsSummaryLDV.StackDetailsLV.TotalQueryTimeHeader.class);
    }
    
    public ValueElement getTotalRowCountFooter() {
      return getOrCreateProperty("TotalRowCountFooter", "TotalRowCountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public TotalRowCountHeader getTotalRowCountHeader() {
      return getOrCreateProperty("TotalRowCountHeader", "TotalRowCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ArgsSummaryLDV.StackDetailsLV.TotalRowCountHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ArgsSummaryLDV.StackDetailsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ArgsSummaryLDV.StackDetailsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ArgsSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AverageRowCountHeader extends ValueElement {
      public AverageRowCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ArgsSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AverageTimeHeader extends ValueElement {
      public AverageTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ArgsSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MaxQueryTimeHeader extends ValueElement {
      public MaxQueryTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ArgsSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class QueryCountHeader extends ValueElement {
      public QueryCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ArgsSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ShortArgsHeader extends ValueElement {
      public ShortArgsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ArgsSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TotalQueryTimeHeader extends ValueElement {
      public TotalQueryTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ArgsSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TotalRowCountHeader extends ValueElement {
      public TotalRowCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ArgsSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ArgsSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public ValueElement getMaxQueryTime() {
        return getOrCreateProperty("MaxQueryTime", "MaxQueryTime", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getQueryCount() {
        return getOrCreateProperty("QueryCount", "QueryCount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getShortArgs() {
        return getOrCreateProperty("ShortArgs", "ShortArgs", null, gw.smoketest.platform.web.ValueElement.class);
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
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ArgsSummaryLDV.StackDetailsLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ArgsSummaryLDV.StackDetailsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ArgsSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ArgsSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/profiler/ArgsSummaryLDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StackDetailsLV_tb extends PCFElement {
    public StackDetailsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}