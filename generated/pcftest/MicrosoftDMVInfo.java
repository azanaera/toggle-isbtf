package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen;
import pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen.CancelBatch;
import pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen.DBCatStatsRequestDV;
import pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen.IntervalsLV;
import pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen.IntervalsLV.IntervalEndHeader;
import pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen.IntervalsLV.IntervalIDHeader;
import pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen.IntervalsLV.IntervalStartHeader;
import pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen.IntervalsLV.entry;
import pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen.IntervalsLV.entry._Select;
import pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen.IntervalsLV.entry._ViewDetail;
import pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen.PerfDownloadLV_tb;
import pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen.PerfDownloadLV_tb.ToolbarButton;
import pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen.SubmitBatch;
import pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen._msgs;
import pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen.snapshotPanelTB;
import pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen.snapshotPanelTB.RefreshIntervals;
import pcftest.MicrosoftDMVInfo.MicrosoftDMVInfo_UpLink;
import pcftest.MicrosoftDMVInfo._Paging;
import pcftest.MicrosoftDMVInfo.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDMVInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class MicrosoftDMVInfo extends PCFLocation {
  public final static String CHECKSUM = "2dec6aced6f27f6934c438e82fc39b0e";
  
  public MicrosoftDMVInfo(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("MicrosoftDMVInfo"));
  }
  
  public MicrosoftDMVInfoScreen getMicrosoftDMVInfoScreen() {
    return getOrCreateProperty("MicrosoftDMVInfoScreen", "MicrosoftDMVInfoScreen", null, pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen.class);
  }
  
  public MicrosoftDMVInfo_UpLink getMicrosoftDMVInfo_UpLink() {
    return getOrCreateProperty("MicrosoftDMVInfo_UpLink", "MicrosoftDMVInfo_UpLink", null, pcftest.MicrosoftDMVInfo.MicrosoftDMVInfo_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.MicrosoftDMVInfo._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.MicrosoftDMVInfo.__crumb__.class);
  }
  
  public InfoPages get_parent() {
    return getOrCreateProperty("_parent", pcftest.InfoPages.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDMVInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MicrosoftDMVInfoScreen extends PCFElement {
    public MicrosoftDMVInfoScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CancelBatch getCancelBatch() {
      return getOrCreateProperty("CancelBatch", "CancelBatch", null, pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen.CancelBatch.class);
    }
    
    public DBCatStatsRequestDV getDBCatStatsRequestDV() {
      return getOrCreateProperty("DBCatStatsRequestDV", "DBCatStatsRequestDV", null, pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen.DBCatStatsRequestDV.class);
    }
    
    public IntervalsLV getIntervalsLV() {
      return getOrCreateProperty("IntervalsLV", "IntervalsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen.IntervalsLV.class);
    }
    
    public PerfDownloadLV getPerfDownloadLV() {
      return getOrCreateProperty("PerfDownloadLV", "PerfDownloadLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PerfDownloadLV.class);
    }
    
    public PerfDownloadLV_tb getPerfDownloadLV_tb() {
      return getOrCreateProperty("PerfDownloadLV_tb", "PerfDownloadLV_tb", null, pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen.PerfDownloadLV_tb.class);
    }
    
    public SubmitBatch getSubmitBatch() {
      return getOrCreateProperty("SubmitBatch", "SubmitBatch", null, pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen.SubmitBatch.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen._msgs.class);
    }
    
    public ValueElement getbatchProgress() {
      return getOrCreateProperty("batchProgress", "batchProgress", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public snapshotPanelTB getsnapshotPanelTB() {
      return getOrCreateProperty("snapshotPanelTB", "snapshotPanelTB", null, pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen.snapshotPanelTB.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDMVInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CancelBatch extends ValueElement {
      public CancelBatch(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDMVInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DBCatStatsRequestDV extends DetailViewElement {
      public DBCatStatsRequestDV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CheckboxValueElement getFetchQueryStoreRows() {
        return getOrCreateProperty("FetchQueryStoreRows", "FetchQueryStoreRows", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
      }
      
      public CheckboxValueElement getIncludeDatabaseStatistics() {
        return getOrCreateProperty("IncludeDatabaseStatistics", "IncludeDatabaseStatistics", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDMVInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class IntervalsLV extends PCFElement {
      public IntervalsLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public IntervalEndHeader getIntervalEndHeader() {
        return getOrCreateProperty("IntervalEndHeader", "IntervalEndHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen.IntervalsLV.IntervalEndHeader.class);
      }
      
      public IntervalIDHeader getIntervalIDHeader() {
        return getOrCreateProperty("IntervalIDHeader", "IntervalIDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen.IntervalsLV.IntervalIDHeader.class);
      }
      
      public ValueElement getIntervalSelectedHeader() {
        return getOrCreateProperty("IntervalSelectedHeader", "IntervalSelectedHeader", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IntervalStartHeader getIntervalStartHeader() {
        return getOrCreateProperty("IntervalStartHeader", "IntervalStartHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen.IntervalsLV.IntervalStartHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntries<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen.IntervalsLV.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDMVInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class IntervalEndHeader extends ValueElement {
        public IntervalEndHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDMVInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class IntervalIDHeader extends ValueElement {
        public IntervalIDHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDMVInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class IntervalStartHeader extends ValueElement {
        public IntervalStartHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDMVInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public DateElement getIntervalEnd() {
          return getOrCreateProperty("IntervalEnd", "IntervalEnd", null, gw.smoketest.platform.web.DateElement.class);
        }
        
        public ValueElement getIntervalID() {
          return getOrCreateProperty("IntervalID", "IntervalID", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public CheckboxValueElement getIntervalSelected() {
          return getOrCreateProperty("IntervalSelected", "IntervalSelected", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        public DateElement getIntervalStart() {
          return getOrCreateProperty("IntervalStart", "IntervalStart", null, gw.smoketest.platform.web.DateElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public _Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen.IntervalsLV.entry._Select.class);
        }
        
        public _ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen.IntervalsLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDMVInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDMVInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDMVInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PerfDownloadLV_tb extends PCFElement {
      public PerfDownloadLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ToolbarButton getToolbarButton() {
        return getOrCreateProperty("ToolbarButton", "ToolbarButton", null, pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen.PerfDownloadLV_tb.ToolbarButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDMVInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ToolbarButton extends ClickableActionElement {
        public ToolbarButton(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDMVInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SubmitBatch extends ValueElement {
      public SubmitBatch(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDMVInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDMVInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class snapshotPanelTB extends PCFElement {
      public snapshotPanelTB(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public RefreshIntervals getRefreshIntervals() {
        return getOrCreateProperty("RefreshIntervals", "RefreshIntervals", null, pcftest.MicrosoftDMVInfo.MicrosoftDMVInfoScreen.snapshotPanelTB.RefreshIntervals.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDMVInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class RefreshIntervals extends ClickableActionElement {
        public RefreshIntervals(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDMVInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MicrosoftDMVInfo_UpLink extends ClickableActionElement {
    public MicrosoftDMVInfo_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDMVInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/MicrosoftDMVInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}