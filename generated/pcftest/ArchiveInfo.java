package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
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
import pcftest.ArchiveInfo.ArchiveInfoScreen;
import pcftest.ArchiveInfo.ArchiveInfoScreen.Alert;
import pcftest.ArchiveInfo.ArchiveInfoScreen.Alert.CloseBtn;
import pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV;
import pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV.ArchivedHeader;
import pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV.EarliestDateHeader;
import pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV.ExcludedBecauseOfFailureHeader;
import pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV.ExcludedBecauseOfRulesHeader;
import pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV.LatestDateHeader;
import pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV.VersionStringHeader;
import pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV._ListPaging;
import pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV.entry;
import pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV.entry.ExcludedBecauseOfFailureReset;
import pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV.entry.ExcludedBecauseOfRulesReset;
import pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV.entry.VersionString;
import pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV.entry._Select;
import pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV.entry._ViewDetail;
import pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV_tb;
import pcftest.ArchiveInfo.ArchiveInfoScreen.Download;
import pcftest.ArchiveInfo.ArchiveInfoScreen.DownloadButton;
import pcftest.ArchiveInfo.ArchiveInfoScreen.RefreshButton;
import pcftest.ArchiveInfo.ArchiveInfoScreen.ResetExcludedBecauseOfFailure;
import pcftest.ArchiveInfo.ArchiveInfoScreen.ResetExcludedBecauseOfRules;
import pcftest.ArchiveInfo.ArchiveInfoScreen.Status;
import pcftest.ArchiveInfo.ArchiveInfoScreen.Upload;
import pcftest.ArchiveInfo.ArchiveInfoScreen.UploadFile;
import pcftest.ArchiveInfo.ArchiveInfoScreen._msgs;
import pcftest.ArchiveInfo.ArchiveInfo_UpLink;
import pcftest.ArchiveInfo._Paging;
import pcftest.ArchiveInfo.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ArchiveInfo extends PCFLocation {
  public final static String CHECKSUM = "8b09a38a63c27dd9fe7a886fe1523d43";
  
  public ArchiveInfo(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ArchiveInfo"));
  }
  
  public ArchiveInfoScreen getArchiveInfoScreen() {
    return getOrCreateProperty("ArchiveInfoScreen", "ArchiveInfoScreen", null, pcftest.ArchiveInfo.ArchiveInfoScreen.class);
  }
  
  public ArchiveInfo_UpLink getArchiveInfo_UpLink() {
    return getOrCreateProperty("ArchiveInfo_UpLink", "ArchiveInfo_UpLink", null, pcftest.ArchiveInfo.ArchiveInfo_UpLink.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ArchiveInfo._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ArchiveInfo.__crumb__.class);
  }
  
  public InfoPages get_parent() {
    return getOrCreateProperty("_parent", pcftest.InfoPages.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArchiveInfoScreen extends PCFElement {
    public ArchiveInfoScreen(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Alert getAlert() {
      return getOrCreateProperty("Alert", "Alert", null, pcftest.ArchiveInfo.ArchiveInfoScreen.Alert.class);
    }
    
    public ArchiveCountSummaryLV getArchiveCountSummaryLV() {
      return getOrCreateProperty("ArchiveCountSummaryLV", "ArchiveCountSummaryLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV.class);
    }
    
    public ArchiveCountSummaryLV_tb getArchiveCountSummaryLV_tb() {
      return getOrCreateProperty("ArchiveCountSummaryLV_tb", "ArchiveCountSummaryLV_tb", null, pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV_tb.class);
    }
    
    public ArchiveExcludeDetailsCV getArchiveExcludeDetailsCV() {
      return getOrCreateProperty("ArchiveExcludeDetailsCV", "ArchiveExcludeDetailsCV", null, pcftest.ArchiveExcludeDetailsCV.class);
    }
    
    public ArchiveSourceInfoDV getArchiveSourceInfoDV() {
      return getOrCreateProperty("ArchiveSourceInfoDV", "ArchiveSourceInfoDV", null, pcftest.ArchiveSourceInfoDV.class);
    }
    
    public ValueElement getArchived() {
      return getOrCreateProperty("Archived", "Archived", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Download getDownload() {
      return getOrCreateProperty("Download", "Download", null, pcftest.ArchiveInfo.ArchiveInfoScreen.Download.class);
    }
    
    public DownloadButton getDownloadButton() {
      return getOrCreateProperty("DownloadButton", "DownloadButton", null, pcftest.ArchiveInfo.ArchiveInfoScreen.DownloadButton.class);
    }
    
    public ValueElement getExcludedBecauseOfFailure() {
      return getOrCreateProperty("ExcludedBecauseOfFailure", "ExcludedBecauseOfFailure", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getExcludedBecauseOfRules() {
      return getOrCreateProperty("ExcludedBecauseOfRules", "ExcludedBecauseOfRules", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public RefreshButton getRefreshButton() {
      return getOrCreateProperty("RefreshButton", "RefreshButton", null, pcftest.ArchiveInfo.ArchiveInfoScreen.RefreshButton.class);
    }
    
    public ResetExcludedBecauseOfFailure getResetExcludedBecauseOfFailure() {
      return getOrCreateProperty("ResetExcludedBecauseOfFailure", "ResetExcludedBecauseOfFailure", null, pcftest.ArchiveInfo.ArchiveInfoScreen.ResetExcludedBecauseOfFailure.class);
    }
    
    public ResetExcludedBecauseOfRules getResetExcludedBecauseOfRules() {
      return getOrCreateProperty("ResetExcludedBecauseOfRules", "ResetExcludedBecauseOfRules", null, pcftest.ArchiveInfo.ArchiveInfoScreen.ResetExcludedBecauseOfRules.class);
    }
    
    public ValueElement getSkipped() {
      return getOrCreateProperty("Skipped", "Skipped", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Status getStatus() {
      return getOrCreateProperty("Status", "Status", null, pcftest.ArchiveInfo.ArchiveInfoScreen.Status.class);
    }
    
    public Upload getUpload() {
      return getOrCreateProperty("Upload", "Upload", null, pcftest.ArchiveInfo.ArchiveInfoScreen.Upload.class);
    }
    
    public UploadFile getUploadFile() {
      return getOrCreateProperty("UploadFile", "UploadFile", null, pcftest.ArchiveInfo.ArchiveInfoScreen.UploadFile.class);
    }
    
    public _msgs get_msgs() {
      return getOrCreateProperty("_msgs", "_msgs", null, pcftest.ArchiveInfo.ArchiveInfoScreen._msgs.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Alert extends ClickableActionElement {
      public Alert(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CloseBtn getCloseBtn() {
        return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.ArchiveInfo.ArchiveInfoScreen.Alert.CloseBtn.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ArchiveCountSummaryLV extends PCFElement {
      public ArchiveCountSummaryLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ArchivedHeader getArchivedHeader() {
        return getOrCreateProperty("ArchivedHeader", "ArchivedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV.ArchivedHeader.class);
      }
      
      public EarliestDateHeader getEarliestDateHeader() {
        return getOrCreateProperty("EarliestDateHeader", "EarliestDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV.EarliestDateHeader.class);
      }
      
      public ExcludedBecauseOfFailureHeader getExcludedBecauseOfFailureHeader() {
        return getOrCreateProperty("ExcludedBecauseOfFailureHeader", "ExcludedBecauseOfFailureHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV.ExcludedBecauseOfFailureHeader.class);
      }
      
      public ValueElement getExcludedBecauseOfFailureResetHeader() {
        return getOrCreateProperty("ExcludedBecauseOfFailureResetHeader", "ExcludedBecauseOfFailureResetHeader", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ExcludedBecauseOfRulesHeader getExcludedBecauseOfRulesHeader() {
        return getOrCreateProperty("ExcludedBecauseOfRulesHeader", "ExcludedBecauseOfRulesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV.ExcludedBecauseOfRulesHeader.class);
      }
      
      public ValueElement getExcludedBecauseOfRulesResetHeader() {
        return getOrCreateProperty("ExcludedBecauseOfRulesResetHeader", "ExcludedBecauseOfRulesResetHeader", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public LatestDateHeader getLatestDateHeader() {
        return getOrCreateProperty("LatestDateHeader", "LatestDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV.LatestDateHeader.class);
      }
      
      public VersionStringHeader getVersionStringHeader() {
        return getOrCreateProperty("VersionStringHeader", "VersionStringHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV.VersionStringHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public _ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ArchivedHeader extends ValueElement {
        public ArchivedHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class EarliestDateHeader extends ValueElement {
        public EarliestDateHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ExcludedBecauseOfFailureHeader extends ValueElement {
        public ExcludedBecauseOfFailureHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ExcludedBecauseOfRulesHeader extends ValueElement {
        public ExcludedBecauseOfRulesHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class LatestDateHeader extends ValueElement {
        public LatestDateHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class VersionStringHeader extends ValueElement {
        public VersionStringHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getArchived() {
          return getOrCreateProperty("Archived", "Archived", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public DateElement getEarliestDate() {
          return getOrCreateProperty("EarliestDate", "EarliestDate", null, gw.smoketest.platform.web.DateElement.class);
        }
        
        public ValueElement getExcludedBecauseOfFailure() {
          return getOrCreateProperty("ExcludedBecauseOfFailure", "ExcludedBecauseOfFailure", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ExcludedBecauseOfFailureReset getExcludedBecauseOfFailureReset() {
          return getOrCreateProperty("ExcludedBecauseOfFailureReset", "ExcludedBecauseOfFailureReset", null, pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV.entry.ExcludedBecauseOfFailureReset.class);
        }
        
        public ValueElement getExcludedBecauseOfRules() {
          return getOrCreateProperty("ExcludedBecauseOfRules", "ExcludedBecauseOfRules", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ExcludedBecauseOfRulesReset getExcludedBecauseOfRulesReset() {
          return getOrCreateProperty("ExcludedBecauseOfRulesReset", "ExcludedBecauseOfRulesReset", null, pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV.entry.ExcludedBecauseOfRulesReset.class);
        }
        
        public DateElement getLatestDate() {
          return getOrCreateProperty("LatestDate", "LatestDate", null, gw.smoketest.platform.web.DateElement.class);
        }
        
        public VersionString getVersionString() {
          return getOrCreateProperty("VersionString", "VersionString", null, pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV.entry.VersionString.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public _Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV.entry._Select.class);
        }
        
        public _ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ArchiveInfo.ArchiveInfoScreen.ArchiveCountSummaryLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ExcludedBecauseOfFailureReset extends ValueElement {
          public ExcludedBecauseOfFailureReset(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class ExcludedBecauseOfRulesReset extends ValueElement {
          public ExcludedBecauseOfRulesReset(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class VersionString extends ValueElement {
          public VersionString(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public ArchiveInfoByDateRange click() {
            return clickThis(pcftest.ArchiveInfoByDateRange.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ArchiveCountSummaryLV_tb extends PCFElement {
      public ArchiveCountSummaryLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Download extends ClickableActionElement {
      public Download(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DownloadButton extends ClickableActionElement {
      public DownloadButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RefreshButton extends ClickableActionElement {
      public RefreshButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ResetExcludedBecauseOfFailure extends ValueElement {
      public ResetExcludedBecauseOfFailure(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ResetExcludedBecauseOfRules extends ValueElement {
      public ResetExcludedBecauseOfRules(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Status extends ClickableActionElement {
      public Status(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public WorkQueueInfo click() {
        return clickThis(pcftest.WorkQueueInfo.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Upload extends ValueElement {
      public Upload(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class UploadFile extends ValueElement {
      public UploadFile(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ArchiveInfo_UpLink extends ClickableActionElement {
    public ArchiveInfo_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ArchiveInfo.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}