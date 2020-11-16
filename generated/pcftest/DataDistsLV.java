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
import pcftest.DataDistsLV.DeleteCellHeaderHeader;
import pcftest.DataDistsLV.DownloadLinkCellHeader;
import pcftest.DataDistsLV.LVDescriptionHeader;
import pcftest.DataDistsLV.LVEndTimeHeader;
import pcftest.DataDistsLV.LVStartTimeHeader;
import pcftest.DataDistsLV.PublicIDHeader;
import pcftest.DataDistsLV.ViewLinkCellHeader;
import pcftest.DataDistsLV._ListPaging;
import pcftest.DataDistsLV.entry;
import pcftest.DataDistsLV.entry.LVDelete;
import pcftest.DataDistsLV.entry.LVGetZip;
import pcftest.DataDistsLV.entry.View;
import pcftest.DataDistsLV.entry._Select;
import pcftest.DataDistsLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/DataDistsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class DataDistsLV extends PCFElement {
  public final static String CHECKSUM = "6ea95a5ccabe9685e7e1403c64bd7f42";
  
  public DataDistsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DeleteCellHeaderHeader getDeleteCellHeaderHeader() {
    return getOrCreateProperty("DeleteCellHeaderHeader", "DeleteCellHeaderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DataDistsLV.DeleteCellHeaderHeader.class);
  }
  
  public DownloadLinkCellHeader getDownloadLinkCellHeader() {
    return getOrCreateProperty("DownloadLinkCellHeader", "DownloadLinkCellHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DataDistsLV.DownloadLinkCellHeader.class);
  }
  
  public LVDescriptionHeader getLVDescriptionHeader() {
    return getOrCreateProperty("LVDescriptionHeader", "LVDescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DataDistsLV.LVDescriptionHeader.class);
  }
  
  public LVEndTimeHeader getLVEndTimeHeader() {
    return getOrCreateProperty("LVEndTimeHeader", "LVEndTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DataDistsLV.LVEndTimeHeader.class);
  }
  
  public LVStartTimeHeader getLVStartTimeHeader() {
    return getOrCreateProperty("LVStartTimeHeader", "LVStartTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DataDistsLV.LVStartTimeHeader.class);
  }
  
  public PublicIDHeader getPublicIDHeader() {
    return getOrCreateProperty("PublicIDHeader", "PublicIDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DataDistsLV.PublicIDHeader.class);
  }
  
  public ViewLinkCellHeader getViewLinkCellHeader() {
    return getOrCreateProperty("ViewLinkCellHeader", "ViewLinkCellHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.DataDistsLV.ViewLinkCellHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.DataDistsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.DataDistsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DataDistsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DeleteCellHeaderHeader extends ValueElement {
    public DeleteCellHeaderHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DataDistsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DownloadLinkCellHeader extends ValueElement {
    public DownloadLinkCellHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DataDistsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LVDescriptionHeader extends ValueElement {
    public LVDescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DataDistsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LVEndTimeHeader extends ValueElement {
    public LVEndTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DataDistsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LVStartTimeHeader extends ValueElement {
    public LVStartTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DataDistsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PublicIDHeader extends ValueElement {
    public PublicIDHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DataDistsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ViewLinkCellHeader extends ValueElement {
    public ViewLinkCellHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DataDistsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/DataDistsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LVDelete getLVDelete() {
      return getOrCreateProperty("LVDelete", "LVDelete", null, pcftest.DataDistsLV.entry.LVDelete.class);
    }
    
    public ValueElement getLVDescription() {
      return getOrCreateProperty("LVDescription", "LVDescription", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getLVEndTime() {
      return getOrCreateProperty("LVEndTime", "LVEndTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public LVGetZip getLVGetZip() {
      return getOrCreateProperty("LVGetZip", "LVGetZip", null, pcftest.DataDistsLV.entry.LVGetZip.class);
    }
    
    public DateElement getLVStartTime() {
      return getOrCreateProperty("LVStartTime", "LVStartTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getPublicID() {
      return getOrCreateProperty("PublicID", "PublicID", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public View getView() {
      return getOrCreateProperty("View", "View", null, pcftest.DataDistsLV.entry.View.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.DataDistsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.DataDistsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DataDistsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LVDelete extends ClickableActionElement {
      public LVDelete(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DataDistsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LVGetZip extends ClickableActionElement {
      public LVGetZip(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DataDistsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class View extends ClickableActionElement {
      public View(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ReportView click() {
        return clickThis(pcftest.ReportView.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DataDistsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/DataDistsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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