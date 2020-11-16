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
import pcftest.LoadHistoryLV.DeleteCellIdHeader;
import pcftest.LoadHistoryLV.DownloadLinkCellHeader;
import pcftest.LoadHistoryLV.LVCallingUserHeader;
import pcftest.LoadHistoryLV.LVDescriptionHeader;
import pcftest.LoadHistoryLV.LVDurationHeader;
import pcftest.LoadHistoryLV.LVEndTimeHeader;
import pcftest.LoadHistoryLV.LVOperationTypeHeader;
import pcftest.LoadHistoryLV.LVStartTimeHeader;
import pcftest.LoadHistoryLV.ViewHistoryCellIdHeader;
import pcftest.LoadHistoryLV._ListPaging;
import pcftest.LoadHistoryLV.entry;
import pcftest.LoadHistoryLV.entry.ViewHistory;
import pcftest.LoadHistoryLV.entry._Select;
import pcftest.LoadHistoryLV.entry._ViewDetail;
import pcftest.LoadHistoryLV.entry.delete;
import pcftest.LoadHistoryLV.entry.download;
import pcftest.LoadHistoryLV.lverrorcountHeader;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LoadHistoryLV extends PCFElement {
  public final static String CHECKSUM = "67f9bd781a5dbd3ea430b0506ce836f2";
  
  public LoadHistoryLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DeleteCellIdHeader getDeleteCellIdHeader() {
    return getOrCreateProperty("DeleteCellIdHeader", "DeleteCellIdHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryLV.DeleteCellIdHeader.class);
  }
  
  public DownloadLinkCellHeader getDownloadLinkCellHeader() {
    return getOrCreateProperty("DownloadLinkCellHeader", "DownloadLinkCellHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryLV.DownloadLinkCellHeader.class);
  }
  
  public LVCallingUserHeader getLVCallingUserHeader() {
    return getOrCreateProperty("LVCallingUserHeader", "LVCallingUserHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryLV.LVCallingUserHeader.class);
  }
  
  public LVDescriptionHeader getLVDescriptionHeader() {
    return getOrCreateProperty("LVDescriptionHeader", "LVDescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryLV.LVDescriptionHeader.class);
  }
  
  public LVDurationHeader getLVDurationHeader() {
    return getOrCreateProperty("LVDurationHeader", "LVDurationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryLV.LVDurationHeader.class);
  }
  
  public LVEndTimeHeader getLVEndTimeHeader() {
    return getOrCreateProperty("LVEndTimeHeader", "LVEndTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryLV.LVEndTimeHeader.class);
  }
  
  public LVOperationTypeHeader getLVOperationTypeHeader() {
    return getOrCreateProperty("LVOperationTypeHeader", "LVOperationTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryLV.LVOperationTypeHeader.class);
  }
  
  public LVStartTimeHeader getLVStartTimeHeader() {
    return getOrCreateProperty("LVStartTimeHeader", "LVStartTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryLV.LVStartTimeHeader.class);
  }
  
  public ViewHistoryCellIdHeader getViewHistoryCellIdHeader() {
    return getOrCreateProperty("ViewHistoryCellIdHeader", "ViewHistoryCellIdHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryLV.ViewHistoryCellIdHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.LoadHistoryLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.LoadHistoryLV._ListPaging.class);
  }
  
  public lverrorcountHeader getlverrorcountHeader() {
    return getOrCreateProperty("lverrorcountHeader", "lverrorcountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.LoadHistoryLV.lverrorcountHeader.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeleteCellIdHeader extends ValueElement {
    public DeleteCellIdHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DownloadLinkCellHeader extends ValueElement {
    public DownloadLinkCellHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LVCallingUserHeader extends ValueElement {
    public LVCallingUserHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LVDescriptionHeader extends ValueElement {
    public LVDescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LVDurationHeader extends ValueElement {
    public LVDurationHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LVEndTimeHeader extends ValueElement {
    public LVEndTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LVOperationTypeHeader extends ValueElement {
    public LVOperationTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LVStartTimeHeader extends ValueElement {
    public LVStartTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ViewHistoryCellIdHeader extends ValueElement {
    public ViewHistoryCellIdHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getLVCallingUser() {
      return getOrCreateProperty("LVCallingUser", "LVCallingUser", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getLVDescription() {
      return getOrCreateProperty("LVDescription", "LVDescription", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getLVDuration() {
      return getOrCreateProperty("LVDuration", "LVDuration", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getLVEndTime() {
      return getOrCreateProperty("LVEndTime", "LVEndTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getLVOperationType() {
      return getOrCreateProperty("LVOperationType", "LVOperationType", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getLVStartTime() {
      return getOrCreateProperty("LVStartTime", "LVStartTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ViewHistory getViewHistory() {
      return getOrCreateProperty("ViewHistory", "ViewHistory", null, pcftest.LoadHistoryLV.entry.ViewHistory.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.LoadHistoryLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.LoadHistoryLV.entry._ViewDetail.class);
    }
    
    public delete getdelete() {
      return getOrCreateProperty("delete", "delete", null, pcftest.LoadHistoryLV.entry.delete.class);
    }
    
    public download getdownload() {
      return getOrCreateProperty("download", "download", null, pcftest.LoadHistoryLV.entry.download.class);
    }
    
    public ValueElement getlverrorcount() {
      return getOrCreateProperty("lverrorcount", "lverrorcount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ViewHistory extends ClickableActionElement {
      public ViewHistory(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public LoadHistoryDetail click() {
        return clickThis(pcftest.LoadHistoryDetail.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class delete extends ClickableActionElement {
      public delete(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class download extends ClickableActionElement {
      public download(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/LoadHistoryLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class lverrorcountHeader extends ValueElement {
    public lverrorcountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}