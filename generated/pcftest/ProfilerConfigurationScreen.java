package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.DbmsCounterThresholdMsHeader;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.DiffDbmsCountersHeader;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.EntryPointNameHeader;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.EntryPointTypeHeader;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.ExtendedQueryTracingHeader;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.IndividualStacksHeader;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.QueryOptimizerTracingHeader;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.StackTraceTrackingHeader;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV._ListPaging;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.entry;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.entry.DiffDbmsCounters;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.entry.Edit;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.entry.Edit.Delete;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.entry.Edit.ToggleDiffDbmsCounters;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.entry.Edit.ToggleQueryOptimizerTracing;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.entry.Edit.ToggleStackTraceTracking;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.entry.Edit.UpdateDbmsCounters;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.entry.ExtendedQueryTracing;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.entry.IndividualStacks;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.entry.QueryOptimizerTracing;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.entry.StackTraceTracking;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.entry._Select;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.entry._ViewDetail;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV_tb;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV_tb.EnableBatchProcessButton;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV_tb.EnableGosuServletButton;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV_tb.EnableMessageDestinationButton;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV_tb.EnableRestOperationButton;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV_tb.EnableStartablePluginButton;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV_tb.EnableWebServiceButton;
import pcftest.ProfilerConfigurationScreen.ProfilerConfigLV_tb.EnableWorkQueueButton;
import pcftest.ProfilerConfigurationScreen.RestartToTakeEffectAlert;
import pcftest.ProfilerConfigurationScreen.RestartToTakeEffectAlert.CloseBtn;
import pcftest.ProfilerConfigurationScreen._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ProfilerConfigurationScreen extends PCFElement {
  public final static String CHECKSUM = "e9160480a2eb68874a58658b86293ea3";
  
  public ProfilerConfigurationScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public EnableWebProfilerPanelSet getEnableWebProfilerPanelSet() {
    return getOrCreateProperty("EnableWebProfilerPanelSet", "EnableWebProfilerPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.EnableWebProfilerPanelSet.class);
  }
  
  public ProfilerConfigLV getProfilerConfigLV() {
    return getOrCreateProperty("ProfilerConfigLV", "ProfilerConfigLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.class);
  }
  
  public ProfilerConfigLV_tb getProfilerConfigLV_tb() {
    return getOrCreateProperty("ProfilerConfigLV_tb", "ProfilerConfigLV_tb", null, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV_tb.class);
  }
  
  public RestartToTakeEffectAlert getRestartToTakeEffectAlert() {
    return getOrCreateProperty("RestartToTakeEffectAlert", "RestartToTakeEffectAlert", null, pcftest.ProfilerConfigurationScreen.RestartToTakeEffectAlert.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ProfilerConfigurationScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerConfigLV extends PCFElement {
    public ProfilerConfigLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DbmsCounterThresholdMsHeader getDbmsCounterThresholdMsHeader() {
      return getOrCreateProperty("DbmsCounterThresholdMsHeader", "DbmsCounterThresholdMsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.DbmsCounterThresholdMsHeader.class);
    }
    
    public DiffDbmsCountersHeader getDiffDbmsCountersHeader() {
      return getOrCreateProperty("DiffDbmsCountersHeader", "DiffDbmsCountersHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.DiffDbmsCountersHeader.class);
    }
    
    public ValueElement getEditHeader() {
      return getOrCreateProperty("EditHeader", "EditHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public EntryPointNameHeader getEntryPointNameHeader() {
      return getOrCreateProperty("EntryPointNameHeader", "EntryPointNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.EntryPointNameHeader.class);
    }
    
    public EntryPointTypeHeader getEntryPointTypeHeader() {
      return getOrCreateProperty("EntryPointTypeHeader", "EntryPointTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.EntryPointTypeHeader.class);
    }
    
    public ExtendedQueryTracingHeader getExtendedQueryTracingHeader() {
      return getOrCreateProperty("ExtendedQueryTracingHeader", "ExtendedQueryTracingHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.ExtendedQueryTracingHeader.class);
    }
    
    public IndividualStacksHeader getIndividualStacksHeader() {
      return getOrCreateProperty("IndividualStacksHeader", "IndividualStacksHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.IndividualStacksHeader.class);
    }
    
    public SelectElement getProfilerConfigType() {
      return getOrCreateProperty("ProfilerConfigType", "ProfilerConfigType", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
    }
    
    public QueryOptimizerTracingHeader getQueryOptimizerTracingHeader() {
      return getOrCreateProperty("QueryOptimizerTracingHeader", "QueryOptimizerTracingHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.QueryOptimizerTracingHeader.class);
    }
    
    public StackTraceTrackingHeader getStackTraceTrackingHeader() {
      return getOrCreateProperty("StackTraceTrackingHeader", "StackTraceTrackingHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.StackTraceTrackingHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DbmsCounterThresholdMsHeader extends ValueElement {
      public DbmsCounterThresholdMsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DiffDbmsCountersHeader extends ValueElement {
      public DiffDbmsCountersHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EntryPointNameHeader extends ValueElement {
      public EntryPointNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EntryPointTypeHeader extends ValueElement {
      public EntryPointTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExtendedQueryTracingHeader extends ValueElement {
      public ExtendedQueryTracingHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class IndividualStacksHeader extends ValueElement {
      public IndividualStacksHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class QueryOptimizerTracingHeader extends ValueElement {
      public QueryOptimizerTracingHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StackTraceTrackingHeader extends ValueElement {
      public StackTraceTrackingHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getDbmsCounterThresholdMs() {
        return getOrCreateProperty("DbmsCounterThresholdMs", "DbmsCounterThresholdMs", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public DiffDbmsCounters getDiffDbmsCounters() {
        return getOrCreateProperty("DiffDbmsCounters", "DiffDbmsCounters", null, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.entry.DiffDbmsCounters.class);
      }
      
      public Edit getEdit() {
        return getOrCreateProperty("Edit", "Edit", null, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.entry.Edit.class);
      }
      
      public ValueElement getEntryPointName() {
        return getOrCreateProperty("EntryPointName", "EntryPointName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getEntryPointType() {
        return getOrCreateProperty("EntryPointType", "EntryPointType", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ExtendedQueryTracing getExtendedQueryTracing() {
        return getOrCreateProperty("ExtendedQueryTracing", "ExtendedQueryTracing", null, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.entry.ExtendedQueryTracing.class);
      }
      
      public IndividualStacks getIndividualStacks() {
        return getOrCreateProperty("IndividualStacks", "IndividualStacks", null, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.entry.IndividualStacks.class);
      }
      
      public QueryOptimizerTracing getQueryOptimizerTracing() {
        return getOrCreateProperty("QueryOptimizerTracing", "QueryOptimizerTracing", null, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.entry.QueryOptimizerTracing.class);
      }
      
      public StackTraceTracking getStackTraceTracking() {
        return getOrCreateProperty("StackTraceTracking", "StackTraceTracking", null, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.entry.StackTraceTracking.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DiffDbmsCounters extends BooleanValueElement {
        public DiffDbmsCounters(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Edit extends ValueElement {
        public Edit(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public Delete getDelete() {
          return getOrCreateProperty("Delete", "Delete", null, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.entry.Edit.Delete.class);
        }
        
        public ToggleDiffDbmsCounters getToggleDiffDbmsCounters() {
          return getOrCreateProperty("ToggleDiffDbmsCounters", "ToggleDiffDbmsCounters", null, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.entry.Edit.ToggleDiffDbmsCounters.class);
        }
        
        public ToggleQueryOptimizerTracing getToggleQueryOptimizerTracing() {
          return getOrCreateProperty("ToggleQueryOptimizerTracing", "ToggleQueryOptimizerTracing", null, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.entry.Edit.ToggleQueryOptimizerTracing.class);
        }
        
        public ToggleStackTraceTracking getToggleStackTraceTracking() {
          return getOrCreateProperty("ToggleStackTraceTracking", "ToggleStackTraceTracking", null, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.entry.Edit.ToggleStackTraceTracking.class);
        }
        
        public UpdateDbmsCounters getUpdateDbmsCounters() {
          return getOrCreateProperty("UpdateDbmsCounters", "UpdateDbmsCounters", null, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV.entry.Edit.UpdateDbmsCounters.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Delete extends ClickableActionElement {
          public Delete(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ToggleDiffDbmsCounters extends ClickableActionElement {
          public ToggleDiffDbmsCounters(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ToggleQueryOptimizerTracing extends ClickableActionElement {
          public ToggleQueryOptimizerTracing(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ToggleStackTraceTracking extends ClickableActionElement {
          public ToggleStackTraceTracking(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class UpdateDbmsCounters extends ClickableActionElement {
          public UpdateDbmsCounters(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ExtendedQueryTracing extends BooleanValueElement {
        public ExtendedQueryTracing(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class IndividualStacks extends BooleanValueElement {
        public IndividualStacks(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class QueryOptimizerTracing extends BooleanValueElement {
        public QueryOptimizerTracing(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class StackTraceTracking extends BooleanValueElement {
        public StackTraceTracking(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ProfilerConfigLV_tb extends PCFElement {
    public ProfilerConfigLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EnableBatchProcessButton getEnableBatchProcessButton() {
      return getOrCreateProperty("EnableBatchProcessButton", "EnableBatchProcessButton", null, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV_tb.EnableBatchProcessButton.class);
    }
    
    public EnableGosuServletButton getEnableGosuServletButton() {
      return getOrCreateProperty("EnableGosuServletButton", "EnableGosuServletButton", null, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV_tb.EnableGosuServletButton.class);
    }
    
    public EnableMessageDestinationButton getEnableMessageDestinationButton() {
      return getOrCreateProperty("EnableMessageDestinationButton", "EnableMessageDestinationButton", null, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV_tb.EnableMessageDestinationButton.class);
    }
    
    public EnableRestOperationButton getEnableRestOperationButton() {
      return getOrCreateProperty("EnableRestOperationButton", "EnableRestOperationButton", null, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV_tb.EnableRestOperationButton.class);
    }
    
    public EnableStartablePluginButton getEnableStartablePluginButton() {
      return getOrCreateProperty("EnableStartablePluginButton", "EnableStartablePluginButton", null, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV_tb.EnableStartablePluginButton.class);
    }
    
    public EnableWebServiceButton getEnableWebServiceButton() {
      return getOrCreateProperty("EnableWebServiceButton", "EnableWebServiceButton", null, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV_tb.EnableWebServiceButton.class);
    }
    
    public EnableWorkQueueButton getEnableWorkQueueButton() {
      return getOrCreateProperty("EnableWorkQueueButton", "EnableWorkQueueButton", null, pcftest.ProfilerConfigurationScreen.ProfilerConfigLV_tb.EnableWorkQueueButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EnableBatchProcessButton extends ClickableActionElement {
      public EnableBatchProcessButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EnableBatchProcessPopup click() {
        return clickThis(pcftest.EnableBatchProcessPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EnableGosuServletButton extends ClickableActionElement {
      public EnableGosuServletButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EnableGosuServletPopup click() {
        return clickThis(pcftest.EnableGosuServletPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EnableMessageDestinationButton extends ClickableActionElement {
      public EnableMessageDestinationButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EnableMessageDestinationPopup click() {
        return clickThis(pcftest.EnableMessageDestinationPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EnableRestOperationButton extends ClickableActionElement {
      public EnableRestOperationButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EnableRestOperationPopup click() {
        return clickThis(pcftest.EnableRestOperationPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EnableStartablePluginButton extends ClickableActionElement {
      public EnableStartablePluginButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EnableStartablePluginPopup click() {
        return clickThis(pcftest.EnableStartablePluginPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EnableWebServiceButton extends ClickableActionElement {
      public EnableWebServiceButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EnableWebServicePopup click() {
        return clickThis(pcftest.EnableWebServicePopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EnableWorkQueueButton extends ClickableActionElement {
      public EnableWorkQueueButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EnableWorkQueuePopup click() {
        return clickThis(pcftest.EnableWorkQueuePopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RestartToTakeEffectAlert extends ClickableActionElement {
    public RestartToTakeEffectAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    public CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.ProfilerConfigurationScreen.RestartToTakeEffectAlert.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CloseBtn extends ClickableActionElement {
      public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/ProfilerConfigurationScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}