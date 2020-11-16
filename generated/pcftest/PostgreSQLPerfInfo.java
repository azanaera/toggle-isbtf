package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PostgreSQLPerfInfo.PostgreSQLPerfInfoScreen;
import pcftest.PostgreSQLPerfInfo.PostgreSQLPerfInfoScreen.CancelBatch;
import pcftest.PostgreSQLPerfInfo.PostgreSQLPerfInfoScreen.LogFilesLV;
import pcftest.PostgreSQLPerfInfo.PostgreSQLPerfInfoScreen.LogFilesLV._ListPaging;
import pcftest.PostgreSQLPerfInfo.PostgreSQLPerfInfoScreen.LogFilesLV.entry;
import pcftest.PostgreSQLPerfInfo.PostgreSQLPerfInfoScreen.LogFilesLV.entry._Select;
import pcftest.PostgreSQLPerfInfo.PostgreSQLPerfInfoScreen.LogFilesLV.entry._ViewDetail;
import pcftest.PostgreSQLPerfInfo.PostgreSQLPerfInfoScreen.PerfDownloadLV_tb;
import pcftest.PostgreSQLPerfInfo.PostgreSQLPerfInfoScreen.PerfDownloadLV_tb.ToolbarButton;
import pcftest.PostgreSQLPerfInfo.PostgreSQLPerfInfoScreen.ReportOptionsDV;
import pcftest.PostgreSQLPerfInfo.PostgreSQLPerfInfoScreen.SubmitBatch;
import pcftest.PostgreSQLPerfInfo.PostgreSQLPerfInfoScreen._msgs;
import pcftest.PostgreSQLPerfInfo.PostgreSQLPerfInfo_UpLink;
import pcftest.PostgreSQLPerfInfo._Paging;
import pcftest.PostgreSQLPerfInfo.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/PostgreSQLPerfInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PostgreSQLPerfInfo extends PCFLocation {
  public final static String CHECKSUM = "693da3e76347299e4ae652dfb3573803";
  
  public PostgreSQLPerfInfo(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("PostgreSQLPerfInfo"));
  }
  
  public PostgreSQLPerfInfoScreen getPostgreSQLPerfInfoScreen() {
    return getOrCreateProperty("PostgreSQLPerfInfoScreen", "PostgreSQLPerfInfoScreen", null, pcftest.PostgreSQLPerfInfo.PostgreSQLPerfInfoScreen.class);
  }
  
  public PostgreSQLPerfInfo_UpLink getPostgreSQLPerfInfo_UpLink() {
    return getOrCreateProperty("PostgreSQLPerfInfo_UpLink", "PostgreSQLPerfInfo_UpLink", null, pcftest.PostgreSQLPerfInfo.PostgreSQLPerfInfo_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.PostgreSQLPerfInfo._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.PostgreSQLPerfInfo.__crumb__.class);
  }
  
  public InfoPages get_parent() {
    return getOrCreateProperty("_parent", pcftest.InfoPages.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/PostgreSQLPerfInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PostgreSQLPerfInfoScreen extends PCFElement {
    public PostgreSQLPerfInfoScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CancelBatch getCancelBatch() {
      return getOrCreateProperty("CancelBatch", "CancelBatch", null, pcftest.PostgreSQLPerfInfo.PostgreSQLPerfInfoScreen.CancelBatch.class);
    }
    
    public LogFilesLV getLogFilesLV() {
      return getOrCreateProperty("LogFilesLV", "LogFilesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PostgreSQLPerfInfo.PostgreSQLPerfInfoScreen.LogFilesLV.class);
    }
    
    public PerfDownloadLV getPerfDownloadLV() {
      return getOrCreateProperty("PerfDownloadLV", "PerfDownloadLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.PerfDownloadLV.class);
    }
    
    public PerfDownloadLV_tb getPerfDownloadLV_tb() {
      return getOrCreateProperty("PerfDownloadLV_tb", "PerfDownloadLV_tb", null, pcftest.PostgreSQLPerfInfo.PostgreSQLPerfInfoScreen.PerfDownloadLV_tb.class);
    }
    
    public ReportOptionsDV getReportOptionsDV() {
      return getOrCreateProperty("ReportOptionsDV", "ReportOptionsDV", null, pcftest.PostgreSQLPerfInfo.PostgreSQLPerfInfoScreen.ReportOptionsDV.class);
    }
    
    public SubmitBatch getSubmitBatch() {
      return getOrCreateProperty("SubmitBatch", "SubmitBatch", null, pcftest.PostgreSQLPerfInfo.PostgreSQLPerfInfoScreen.SubmitBatch.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.PostgreSQLPerfInfo.PostgreSQLPerfInfoScreen._msgs.class);
    }
    
    public ValueElement getbatchProgress() {
      return getOrCreateProperty("batchProgress", "batchProgress", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/PostgreSQLPerfInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CancelBatch extends ValueElement {
      public CancelBatch(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/PostgreSQLPerfInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LogFilesLV extends PCFElement {
      public LogFilesLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.PostgreSQLPerfInfo.PostgreSQLPerfInfoScreen.LogFilesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public _ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.PostgreSQLPerfInfo.PostgreSQLPerfInfoScreen.LogFilesLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/PostgreSQLPerfInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/PostgreSQLPerfInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public CheckboxValueElement getLogFileChecked() {
          return getOrCreateProperty("LogFileChecked", "LogFileChecked", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
        }
        
        public ValueElement getLogFileName() {
          return getOrCreateProperty("LogFileName", "LogFileName", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public _Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.PostgreSQLPerfInfo.PostgreSQLPerfInfoScreen.LogFilesLV.entry._Select.class);
        }
        
        public _ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.PostgreSQLPerfInfo.PostgreSQLPerfInfoScreen.LogFilesLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/PostgreSQLPerfInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/PostgreSQLPerfInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/infopages/PostgreSQLPerfInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PerfDownloadLV_tb extends PCFElement {
      public PerfDownloadLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ToolbarButton getToolbarButton() {
        return getOrCreateProperty("ToolbarButton", "ToolbarButton", null, pcftest.PostgreSQLPerfInfo.PostgreSQLPerfInfoScreen.PerfDownloadLV_tb.ToolbarButton.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/PostgreSQLPerfInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/infopages/PostgreSQLPerfInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ReportOptionsDV extends DetailViewElement {
      public ReportOptionsDV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CheckboxValueElement getIncludeDatabaseStatistics() {
        return getOrCreateProperty("IncludeDatabaseStatistics", "IncludeDatabaseStatistics", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
      }
      
      public CheckboxValueElement getReadAutoExplainPlans() {
        return getOrCreateProperty("ReadAutoExplainPlans", "ReadAutoExplainPlans", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/PostgreSQLPerfInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SubmitBatch extends ValueElement {
      public SubmitBatch(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/PostgreSQLPerfInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _msgs extends MessagesElement {
      public _msgs(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/PostgreSQLPerfInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PostgreSQLPerfInfo_UpLink extends ClickableActionElement {
    public PostgreSQLPerfInfo_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/PostgreSQLPerfInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/PostgreSQLPerfInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}