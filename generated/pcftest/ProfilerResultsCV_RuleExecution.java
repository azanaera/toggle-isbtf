package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntries;
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
import pcftest.ProfilerResultsCV_RuleExecution.EmptyTab;
import pcftest.ProfilerResultsCV_RuleExecution.ResultsTab;
import pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV;
import pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV.ReportsCellHeader;
import pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV.elapsedTimeHeader;
import pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV.entry.entry2;
import pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV.entry.entry2.reportLink;
import pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV.entry.entry2.reportSeparator;
import pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV.entry.expandCollapse;
import pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV.frameTimeHeader;
import pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV.nameHeader;
import pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV.offsetHeader;
import pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV.propsAndCountersHeader;
import pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV_tb;
import pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV_tb.Collapse;
import pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV_tb.Expand;
import pcftest.ProfilerResultsCV_RuleExecution.StackCardTab;
import pcftest.ProfilerResultsCV_RuleExecution.StacksLV;
import pcftest.ProfilerResultsCV_RuleExecution.StacksLV.StartTimeHeader;
import pcftest.ProfilerResultsCV_RuleExecution.StacksLV._ListPaging;
import pcftest.ProfilerResultsCV_RuleExecution.StacksLV.frameCountHeader;
import pcftest.ProfilerResultsCV_RuleExecution.StacksLV.stackNameHeader;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ProfilerResultsCV_RuleExecution extends ProfilerResultsCV {
  public final static String CHECKSUM = "2d31e3182a7803acda5e4e30700a3df7";
  
  public ProfilerResultsCV_RuleExecution(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public EmptyTab getEmptyTab() {
    return getOrCreateProperty("EmptyTab", "EmptyTab", null, pcftest.ProfilerResultsCV_RuleExecution.EmptyTab.class);
  }
  
  public ProfilerResultsEmptyDV getProfilerResultsEmptyDV() {
    return getOrCreateProperty("ProfilerResultsEmptyDV", "ProfilerResultsEmptyDV", null, pcftest.ProfilerResultsEmptyDV.class);
  }
  
  public ResultsTab getResultsTab() {
    return getOrCreateProperty("ResultsTab", "ResultsTab", null, pcftest.ProfilerResultsCV_RuleExecution.ResultsTab.class);
  }
  
  public RuleExecutionLV getRuleExecutionLV() {
    return getOrCreateProperty("RuleExecutionLV", "RuleExecutionLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV.class);
  }
  
  public RuleExecutionLV_tb getRuleExecutionLV_tb() {
    return getOrCreateProperty("RuleExecutionLV_tb", "RuleExecutionLV_tb", null, pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV_tb.class);
  }
  
  public StackCardTab getStackCardTab() {
    return getOrCreateProperty("StackCardTab", "StackCardTab", null, pcftest.ProfilerResultsCV_RuleExecution.StackCardTab.class);
  }
  
  public StacksLV getStacksLV() {
    return getOrCreateProperty("StacksLV", "StacksLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ProfilerResultsCV_RuleExecution.StacksLV.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EmptyTab extends ClickableActionElement {
    public EmptyTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ResultsTab extends ClickableActionElement {
    public ResultsTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleExecutionLV extends PCFElement {
    public RuleExecutionLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ReportsCellHeader getReportsCellHeader() {
      return getOrCreateProperty("ReportsCellHeader", "ReportsCellHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV.ReportsCellHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntries<pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.RowTreeRow, pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
    }
    
    public elapsedTimeHeader getelapsedTimeHeader() {
      return getOrCreateProperty("elapsedTimeHeader", "elapsedTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV.elapsedTimeHeader.class);
    }
    
    public frameTimeHeader getframeTimeHeader() {
      return getOrCreateProperty("frameTimeHeader", "frameTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV.frameTimeHeader.class);
    }
    
    public nameHeader getnameHeader() {
      return getOrCreateProperty("nameHeader", "nameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV.nameHeader.class);
    }
    
    public offsetHeader getoffsetHeader() {
      return getOrCreateProperty("offsetHeader", "offsetHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV.offsetHeader.class);
    }
    
    public propsAndCountersHeader getpropsAndCountersHeader() {
      return getOrCreateProperty("propsAndCountersHeader", "propsAndCountersHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV.propsAndCountersHeader.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ReportsCellHeader extends ValueElement {
      public ReportsCellHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class elapsedTimeHeader extends ValueElement {
      public elapsedTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<entry2> get_Entries() {
        return getOrCreateEntries(null, pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV.entry.entry2.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV.entry> get_Entries2() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.RowTreeRow, pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      public pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV.entry._Select.class);
      }
      
      public pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV.entry._ViewDetail.class);
      }
      
      public ValueElement getcontainerLabel() {
        return getOrCreateProperty("containerLabel", "containerLabel", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getelapsedTime() {
        return getOrCreateProperty("elapsedTime", "elapsedTime", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public expandCollapse getexpandCollapse() {
        return getOrCreateProperty("expandCollapse", "expandCollapse", gw.smoketest.platform.web.PCFElementId.PCFElementScope.RowTreeToggle, pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV.entry.expandCollapse.class);
      }
      
      public ValueElement getframeTime() {
        return getOrCreateProperty("frameTime", "frameTime", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getname() {
        return getOrCreateProperty("name", "name", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getoffset() {
        return getOrCreateProperty("offset", "offset", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getpropsAndCounters() {
        return getOrCreateProperty("propsAndCounters", "propsAndCounters", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry2 extends PCFElement {
        public entry2(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public reportLink getreportLink() {
          return getOrCreateProperty("reportLink", "reportLink", null, pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV.entry.entry2.reportLink.class);
        }
        
        public reportSeparator getreportSeparator() {
          return getOrCreateProperty("reportSeparator", "reportSeparator", null, pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV.entry.entry2.reportSeparator.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class reportLink extends ClickableActionElement {
          public reportLink(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class reportSeparator extends ClickableActionElement {
          public reportSeparator(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class expandCollapse extends ClickableActionElement {
        public expandCollapse(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class frameTimeHeader extends ValueElement {
      public frameTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class nameHeader extends ValueElement {
      public nameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class offsetHeader extends ValueElement {
      public offsetHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class propsAndCountersHeader extends ValueElement {
      public propsAndCountersHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleExecutionLV_tb extends PCFElement {
    public RuleExecutionLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Collapse getCollapse() {
      return getOrCreateProperty("Collapse", "Collapse", null, pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV_tb.Collapse.class);
    }
    
    public Expand getExpand() {
      return getOrCreateProperty("Expand", "Expand", null, pcftest.ProfilerResultsCV_RuleExecution.RuleExecutionLV_tb.Expand.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Collapse extends ClickableActionElement {
      public Collapse(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Expand extends ClickableActionElement {
      public Expand(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StackCardTab extends ClickableActionElement {
    public StackCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StacksLV extends PCFElement {
    public StacksLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public StartTimeHeader getStartTimeHeader() {
      return getOrCreateProperty("StartTimeHeader", "StartTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_RuleExecution.StacksLV.StartTimeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ProfilerResultsCV_RuleExecution.StacksLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ProfilerResultsCV_RuleExecution.StacksLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ProfilerResultsCV_RuleExecution.StacksLV._ListPaging.class);
    }
    
    public frameCountHeader getframeCountHeader() {
      return getOrCreateProperty("frameCountHeader", "frameCountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_RuleExecution.StacksLV.frameCountHeader.class);
    }
    
    public stackNameHeader getstackNameHeader() {
      return getOrCreateProperty("stackNameHeader", "stackNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerResultsCV_RuleExecution.StacksLV.stackNameHeader.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StartTimeHeader extends ValueElement {
      public StartTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getStartTime() {
        return getOrCreateProperty("StartTime", "StartTime", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.ProfilerResultsCV_RuleExecution.StacksLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ProfilerResultsCV_RuleExecution.StacksLV.entry._Select.class);
      }
      
      public pcftest.ProfilerResultsCV_RuleExecution.StacksLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ProfilerResultsCV_RuleExecution.StacksLV.entry._ViewDetail.class);
      }
      
      public ValueElement getframeCount() {
        return getOrCreateProperty("frameCount", "frameCount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getstackName() {
        return getOrCreateProperty("stackName", "stackName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class frameCountHeader extends ValueElement {
      public frameCountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerResultsCV.RuleExecution.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class stackNameHeader extends ValueElement {
      public stackNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}