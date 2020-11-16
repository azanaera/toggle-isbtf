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
import pcftest.UpdateStatsLV.DownloadLinkCellHeaderHeader;
import pcftest.UpdateStatsLV.LVDescriptionHeader;
import pcftest.UpdateStatsLV.LVEndTimeHeader;
import pcftest.UpdateStatsLV.LVIncrementalHeader;
import pcftest.UpdateStatsLV.LVStartTimeHeader;
import pcftest.UpdateStatsLV.LinkCellHeaderIDHeader;
import pcftest.UpdateStatsLV._ListPaging;
import pcftest.UpdateStatsLV.entry;
import pcftest.UpdateStatsLV.entry.LVDelete;
import pcftest.UpdateStatsLV.entry.LVGetZip;
import pcftest.UpdateStatsLV.entry._Select;
import pcftest.UpdateStatsLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/UpdateStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class UpdateStatsLV extends PCFElement {
  public final static String CHECKSUM = "c212048147b4c34fde7d05cb32e238b0";
  
  public UpdateStatsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DownloadLinkCellHeaderHeader getDownloadLinkCellHeaderHeader() {
    return getOrCreateProperty("DownloadLinkCellHeaderHeader", "DownloadLinkCellHeaderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UpdateStatsLV.DownloadLinkCellHeaderHeader.class);
  }
  
  public LVDescriptionHeader getLVDescriptionHeader() {
    return getOrCreateProperty("LVDescriptionHeader", "LVDescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UpdateStatsLV.LVDescriptionHeader.class);
  }
  
  public LVEndTimeHeader getLVEndTimeHeader() {
    return getOrCreateProperty("LVEndTimeHeader", "LVEndTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UpdateStatsLV.LVEndTimeHeader.class);
  }
  
  public LVIncrementalHeader getLVIncrementalHeader() {
    return getOrCreateProperty("LVIncrementalHeader", "LVIncrementalHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UpdateStatsLV.LVIncrementalHeader.class);
  }
  
  public LVStartTimeHeader getLVStartTimeHeader() {
    return getOrCreateProperty("LVStartTimeHeader", "LVStartTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UpdateStatsLV.LVStartTimeHeader.class);
  }
  
  public LinkCellHeaderIDHeader getLinkCellHeaderIDHeader() {
    return getOrCreateProperty("LinkCellHeaderIDHeader", "LinkCellHeaderIDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.UpdateStatsLV.LinkCellHeaderIDHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.UpdateStatsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.UpdateStatsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/UpdateStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DownloadLinkCellHeaderHeader extends ValueElement {
    public DownloadLinkCellHeaderHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/UpdateStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LVDescriptionHeader extends ValueElement {
    public LVDescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/UpdateStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LVEndTimeHeader extends ValueElement {
    public LVEndTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/UpdateStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LVIncrementalHeader extends ValueElement {
    public LVIncrementalHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/UpdateStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LVStartTimeHeader extends ValueElement {
    public LVStartTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/UpdateStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LinkCellHeaderIDHeader extends ValueElement {
    public LinkCellHeaderIDHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/UpdateStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/UpdateStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public LVDelete getLVDelete() {
      return getOrCreateProperty("LVDelete", "LVDelete", null, pcftest.UpdateStatsLV.entry.LVDelete.class);
    }
    
    public ValueElement getLVDescription() {
      return getOrCreateProperty("LVDescription", "LVDescription", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getLVEndTime() {
      return getOrCreateProperty("LVEndTime", "LVEndTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public LVGetZip getLVGetZip() {
      return getOrCreateProperty("LVGetZip", "LVGetZip", null, pcftest.UpdateStatsLV.entry.LVGetZip.class);
    }
    
    public BooleanValueElement getLVIncremental() {
      return getOrCreateProperty("LVIncremental", "LVIncremental", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public DateElement getLVStartTime() {
      return getOrCreateProperty("LVStartTime", "LVStartTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.UpdateStatsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.UpdateStatsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/UpdateStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LVDelete extends ClickableActionElement {
      public LVDelete(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/UpdateStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LVGetZip extends ClickableActionElement {
      public LVGetZip(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/UpdateStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/UpdateStatsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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