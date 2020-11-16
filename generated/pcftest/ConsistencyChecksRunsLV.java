package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
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
import pcftest.ConsistencyChecksRunsLV.DeleteHeaderHeader;
import pcftest.ConsistencyChecksRunsLV.DownloadHeaderErrorsHeader;
import pcftest.ConsistencyChecksRunsLV.DownloadHeaderHeader;
import pcftest.ConsistencyChecksRunsLV.LVDescriptionHeader;
import pcftest.ConsistencyChecksRunsLV.LVDurationHeader;
import pcftest.ConsistencyChecksRunsLV.LVEndTimeHeader;
import pcftest.ConsistencyChecksRunsLV.LVPubliciDHeader;
import pcftest.ConsistencyChecksRunsLV.LVStartTimeHeader;
import pcftest.ConsistencyChecksRunsLV.LVVersionHeader;
import pcftest.ConsistencyChecksRunsLV.RerunHeaderHeader;
import pcftest.ConsistencyChecksRunsLV.ViewLinkCellHeader;
import pcftest.ConsistencyChecksRunsLV._ListPaging;
import pcftest.ConsistencyChecksRunsLV.cellFinishedHeader;
import pcftest.ConsistencyChecksRunsLV.cellInProgressHeader;
import pcftest.ConsistencyChecksRunsLV.cellNotStartedHeader;
import pcftest.ConsistencyChecksRunsLV.entry;
import pcftest.ConsistencyChecksRunsLV.entry.LVDelete;
import pcftest.ConsistencyChecksRunsLV.entry.LVDownload;
import pcftest.ConsistencyChecksRunsLV.entry.LVDownloadErrors;
import pcftest.ConsistencyChecksRunsLV.entry.LVRerunLink;
import pcftest.ConsistencyChecksRunsLV.entry.View;
import pcftest.ConsistencyChecksRunsLV.entry._Select;
import pcftest.ConsistencyChecksRunsLV.entry._ViewDetail;
import pcftest.ConsistencyChecksRunsLV.numErrorsHeader;
import pcftest.ConsistencyChecksRunsLV.numWorkersHeader;
import pcftest.ConsistencyChecksRunsLV.totalChecksHeader;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ConsistencyChecksRunsLV extends PCFElement {
  public final static String CHECKSUM = "4a2e6de66743cb4751c0d37f0797c1f4";
  
  public ConsistencyChecksRunsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DeleteHeaderHeader getDeleteHeaderHeader() {
    return getOrCreateProperty("DeleteHeaderHeader", "DeleteHeaderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConsistencyChecksRunsLV.DeleteHeaderHeader.class);
  }
  
  public DownloadHeaderErrorsHeader getDownloadHeaderErrorsHeader() {
    return getOrCreateProperty("DownloadHeaderErrorsHeader", "DownloadHeaderErrorsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConsistencyChecksRunsLV.DownloadHeaderErrorsHeader.class);
  }
  
  public DownloadHeaderHeader getDownloadHeaderHeader() {
    return getOrCreateProperty("DownloadHeaderHeader", "DownloadHeaderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConsistencyChecksRunsLV.DownloadHeaderHeader.class);
  }
  
  public LVDescriptionHeader getLVDescriptionHeader() {
    return getOrCreateProperty("LVDescriptionHeader", "LVDescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConsistencyChecksRunsLV.LVDescriptionHeader.class);
  }
  
  public LVDurationHeader getLVDurationHeader() {
    return getOrCreateProperty("LVDurationHeader", "LVDurationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConsistencyChecksRunsLV.LVDurationHeader.class);
  }
  
  public LVEndTimeHeader getLVEndTimeHeader() {
    return getOrCreateProperty("LVEndTimeHeader", "LVEndTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConsistencyChecksRunsLV.LVEndTimeHeader.class);
  }
  
  public LVPubliciDHeader getLVPubliciDHeader() {
    return getOrCreateProperty("LVPubliciDHeader", "LVPubliciDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConsistencyChecksRunsLV.LVPubliciDHeader.class);
  }
  
  public LVStartTimeHeader getLVStartTimeHeader() {
    return getOrCreateProperty("LVStartTimeHeader", "LVStartTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConsistencyChecksRunsLV.LVStartTimeHeader.class);
  }
  
  public LVVersionHeader getLVVersionHeader() {
    return getOrCreateProperty("LVVersionHeader", "LVVersionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConsistencyChecksRunsLV.LVVersionHeader.class);
  }
  
  public RerunHeaderHeader getRerunHeaderHeader() {
    return getOrCreateProperty("RerunHeaderHeader", "RerunHeaderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConsistencyChecksRunsLV.RerunHeaderHeader.class);
  }
  
  public ViewLinkCellHeader getViewLinkCellHeader() {
    return getOrCreateProperty("ViewLinkCellHeader", "ViewLinkCellHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConsistencyChecksRunsLV.ViewLinkCellHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ConsistencyChecksRunsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ConsistencyChecksRunsLV._ListPaging.class);
  }
  
  public cellFinishedHeader getcellFinishedHeader() {
    return getOrCreateProperty("cellFinishedHeader", "cellFinishedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConsistencyChecksRunsLV.cellFinishedHeader.class);
  }
  
  public cellInProgressHeader getcellInProgressHeader() {
    return getOrCreateProperty("cellInProgressHeader", "cellInProgressHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConsistencyChecksRunsLV.cellInProgressHeader.class);
  }
  
  public cellNotStartedHeader getcellNotStartedHeader() {
    return getOrCreateProperty("cellNotStartedHeader", "cellNotStartedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConsistencyChecksRunsLV.cellNotStartedHeader.class);
  }
  
  public numErrorsHeader getnumErrorsHeader() {
    return getOrCreateProperty("numErrorsHeader", "numErrorsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConsistencyChecksRunsLV.numErrorsHeader.class);
  }
  
  public numWorkersHeader getnumWorkersHeader() {
    return getOrCreateProperty("numWorkersHeader", "numWorkersHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConsistencyChecksRunsLV.numWorkersHeader.class);
  }
  
  public totalChecksHeader gettotalChecksHeader() {
    return getOrCreateProperty("totalChecksHeader", "totalChecksHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ConsistencyChecksRunsLV.totalChecksHeader.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeleteHeaderHeader extends ValueElement {
    public DeleteHeaderHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DownloadHeaderErrorsHeader extends ValueElement {
    public DownloadHeaderErrorsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DownloadHeaderHeader extends ValueElement {
    public DownloadHeaderHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LVDescriptionHeader extends ValueElement {
    public LVDescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LVDurationHeader extends ValueElement {
    public LVDurationHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LVEndTimeHeader extends ValueElement {
    public LVEndTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LVPubliciDHeader extends ValueElement {
    public LVPubliciDHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LVStartTimeHeader extends ValueElement {
    public LVStartTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LVVersionHeader extends ValueElement {
    public LVVersionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RerunHeaderHeader extends ValueElement {
    public RerunHeaderHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ViewLinkCellHeader extends ValueElement {
    public ViewLinkCellHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class cellFinishedHeader extends ValueElement {
    public cellFinishedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class cellInProgressHeader extends ValueElement {
    public cellInProgressHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class cellNotStartedHeader extends ValueElement {
    public cellNotStartedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LVDelete getLVDelete() {
      return getOrCreateProperty("LVDelete", "LVDelete", null, pcftest.ConsistencyChecksRunsLV.entry.LVDelete.class);
    }
    
    public ValueElement getLVDescription() {
      return getOrCreateProperty("LVDescription", "LVDescription", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public LVDownload getLVDownload() {
      return getOrCreateProperty("LVDownload", "LVDownload", null, pcftest.ConsistencyChecksRunsLV.entry.LVDownload.class);
    }
    
    public LVDownloadErrors getLVDownloadErrors() {
      return getOrCreateProperty("LVDownloadErrors", "LVDownloadErrors", null, pcftest.ConsistencyChecksRunsLV.entry.LVDownloadErrors.class);
    }
    
    public ValueElement getLVDuration() {
      return getOrCreateProperty("LVDuration", "LVDuration", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getLVEndTime() {
      return getOrCreateProperty("LVEndTime", "LVEndTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getLVPubliciD() {
      return getOrCreateProperty("LVPubliciD", "LVPubliciD", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public LVRerunLink getLVRerunLink() {
      return getOrCreateProperty("LVRerunLink", "LVRerunLink", null, pcftest.ConsistencyChecksRunsLV.entry.LVRerunLink.class);
    }
    
    public DateElement getLVStartTime() {
      return getOrCreateProperty("LVStartTime", "LVStartTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getLVVersion() {
      return getOrCreateProperty("LVVersion", "LVVersion", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public View getView() {
      return getOrCreateProperty("View", "View", null, pcftest.ConsistencyChecksRunsLV.entry.View.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ConsistencyChecksRunsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ConsistencyChecksRunsLV.entry._ViewDetail.class);
    }
    
    public ValueElement getcellFinished() {
      return getOrCreateProperty("cellFinished", "cellFinished", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getcellInProgress() {
      return getOrCreateProperty("cellInProgress", "cellInProgress", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getcellNotStarted() {
      return getOrCreateProperty("cellNotStarted", "cellNotStarted", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getnumErrors() {
      return getOrCreateProperty("numErrors", "numErrors", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getnumWorkers() {
      return getOrCreateProperty("numWorkers", "numWorkers", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement gettotalChecks() {
      return getOrCreateProperty("totalChecks", "totalChecks", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LVDelete extends ClickableActionElement {
      public LVDelete(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LVDownload extends ClickableActionElement {
      public LVDownload(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LVDownloadErrors extends ClickableActionElement {
      public LVDownloadErrors(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LVRerunLink extends ClickableActionElement {
      public LVRerunLink(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class View extends ClickableActionElement {
      public View(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ReportView click() {
        return clickThis(pcftest.ReportView.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class numErrorsHeader extends ValueElement {
    public numErrorsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class numWorkersHeader extends ValueElement {
    public numWorkersHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/ConsistencyChecksRunsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class totalChecksHeader extends ValueElement {
    public totalChecksHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}