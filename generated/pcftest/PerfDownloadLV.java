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
import pcftest.PerfDownloadLV.DeleteLinkCellHeader;
import pcftest.PerfDownloadLV.DownloadLinkCellHeader;
import pcftest.PerfDownloadLV.IdCellHeader;
import pcftest.PerfDownloadLV.LVDescriptionHeader;
import pcftest.PerfDownloadLV.LVEndTimeHeader;
import pcftest.PerfDownloadLV.LVStartTimeHeader;
import pcftest.PerfDownloadLV.LVStatusHeader;
import pcftest.PerfDownloadLV.ViewLinkCellHeader;
import pcftest.PerfDownloadLV._ListPaging;
import pcftest.PerfDownloadLV.entry;
import pcftest.PerfDownloadLV.entry.LVDelete;
import pcftest.PerfDownloadLV.entry.LVGetZip;
import pcftest.PerfDownloadLV.entry.View;
import pcftest.PerfDownloadLV.entry._Select;
import pcftest.PerfDownloadLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/PerfDownloadLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PerfDownloadLV extends PCFElement {
  public final static String CHECKSUM = "b17ffa491cc88f9f7875ddc25ccbeb89";
  
  public PerfDownloadLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DeleteLinkCellHeader getDeleteLinkCellHeader() {
    return getOrCreateProperty("DeleteLinkCellHeader", "DeleteLinkCellHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PerfDownloadLV.DeleteLinkCellHeader.class);
  }
  
  public DownloadLinkCellHeader getDownloadLinkCellHeader() {
    return getOrCreateProperty("DownloadLinkCellHeader", "DownloadLinkCellHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PerfDownloadLV.DownloadLinkCellHeader.class);
  }
  
  public IdCellHeader getIdCellHeader() {
    return getOrCreateProperty("IdCellHeader", "IdCellHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PerfDownloadLV.IdCellHeader.class);
  }
  
  public LVDescriptionHeader getLVDescriptionHeader() {
    return getOrCreateProperty("LVDescriptionHeader", "LVDescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PerfDownloadLV.LVDescriptionHeader.class);
  }
  
  public LVEndTimeHeader getLVEndTimeHeader() {
    return getOrCreateProperty("LVEndTimeHeader", "LVEndTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PerfDownloadLV.LVEndTimeHeader.class);
  }
  
  public LVStartTimeHeader getLVStartTimeHeader() {
    return getOrCreateProperty("LVStartTimeHeader", "LVStartTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PerfDownloadLV.LVStartTimeHeader.class);
  }
  
  public LVStatusHeader getLVStatusHeader() {
    return getOrCreateProperty("LVStatusHeader", "LVStatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PerfDownloadLV.LVStatusHeader.class);
  }
  
  public ViewLinkCellHeader getViewLinkCellHeader() {
    return getOrCreateProperty("ViewLinkCellHeader", "ViewLinkCellHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PerfDownloadLV.ViewLinkCellHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.PerfDownloadLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.PerfDownloadLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/PerfDownloadLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeleteLinkCellHeader extends ValueElement {
    public DeleteLinkCellHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/PerfDownloadLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DownloadLinkCellHeader extends ValueElement {
    public DownloadLinkCellHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/PerfDownloadLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IdCellHeader extends ValueElement {
    public IdCellHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/PerfDownloadLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LVDescriptionHeader extends ValueElement {
    public LVDescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/PerfDownloadLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LVEndTimeHeader extends ValueElement {
    public LVEndTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/PerfDownloadLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LVStartTimeHeader extends ValueElement {
    public LVStartTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/PerfDownloadLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LVStatusHeader extends ValueElement {
    public LVStatusHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/PerfDownloadLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ViewLinkCellHeader extends ValueElement {
    public ViewLinkCellHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/PerfDownloadLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/PerfDownloadLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getIdCell() {
      return getOrCreateProperty("IdCell", "IdCell", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public LVDelete getLVDelete() {
      return getOrCreateProperty("LVDelete", "LVDelete", null, pcftest.PerfDownloadLV.entry.LVDelete.class);
    }
    
    public ValueElement getLVDescription() {
      return getOrCreateProperty("LVDescription", "LVDescription", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getLVEndTime() {
      return getOrCreateProperty("LVEndTime", "LVEndTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public LVGetZip getLVGetZip() {
      return getOrCreateProperty("LVGetZip", "LVGetZip", null, pcftest.PerfDownloadLV.entry.LVGetZip.class);
    }
    
    public DateElement getLVStartTime() {
      return getOrCreateProperty("LVStartTime", "LVStartTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getLVStatus() {
      return getOrCreateProperty("LVStatus", "LVStatus", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public View getView() {
      return getOrCreateProperty("View", "View", null, pcftest.PerfDownloadLV.entry.View.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.PerfDownloadLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.PerfDownloadLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/PerfDownloadLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LVDelete extends ClickableActionElement {
      public LVDelete(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/PerfDownloadLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LVGetZip extends ClickableActionElement {
      public LVGetZip(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/PerfDownloadLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class View extends ClickableActionElement {
      public View(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ReportView click() {
        return clickThis(pcftest.ReportView.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/PerfDownloadLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/PerfDownloadLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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