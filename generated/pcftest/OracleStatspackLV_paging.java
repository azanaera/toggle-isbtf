package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.OracleStatspackLV_paging.DescriptionHeader;
import pcftest.OracleStatspackLV_paging.SnapshotIDHeader;
import pcftest.OracleStatspackLV_paging._ListPaging;
import pcftest.OracleStatspackLV_paging.entry;
import pcftest.OracleStatspackLV_paging.entry._Select;
import pcftest.OracleStatspackLV_paging.entry._ViewDetail;
import pcftest.OracleStatspackLV_paging.startuptimeHeader;
import pcftest.OracleStatspackLV_paging.timeHeader;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/OracleStatspackLV.paging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class OracleStatspackLV_paging extends OracleStatspackLV {
  public final static String CHECKSUM = "c492455c5763745ae0e5589bb75a7da4";
  
  public OracleStatspackLV_paging(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DescriptionHeader getDescriptionHeader() {
    return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OracleStatspackLV_paging.DescriptionHeader.class);
  }
  
  public SnapshotIDHeader getSnapshotIDHeader() {
    return getOrCreateProperty("SnapshotIDHeader", "SnapshotIDHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OracleStatspackLV_paging.SnapshotIDHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.OracleStatspackLV_paging.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.OracleStatspackLV_paging._ListPaging.class);
  }
  
  public ValueElement getselectorHeader() {
    return getOrCreateProperty("selectorHeader", "selectorHeader", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public startuptimeHeader getstartuptimeHeader() {
    return getOrCreateProperty("startuptimeHeader", "startuptimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OracleStatspackLV_paging.startuptimeHeader.class);
  }
  
  public timeHeader gettimeHeader() {
    return getOrCreateProperty("timeHeader", "timeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.OracleStatspackLV_paging.timeHeader.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleStatspackLV.paging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DescriptionHeader extends ValueElement {
    public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleStatspackLV.paging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SnapshotIDHeader extends ValueElement {
    public SnapshotIDHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleStatspackLV.paging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleStatspackLV.paging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getDescription() {
      return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getSnapshotID() {
      return getOrCreateProperty("SnapshotID", "SnapshotID", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.OracleStatspackLV_paging.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.OracleStatspackLV_paging.entry._ViewDetail.class);
    }
    
    public CheckboxValueElement getselector() {
      return getOrCreateProperty("selector", "selector", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public DateElement getstartuptime() {
      return getOrCreateProperty("startuptime", "startuptime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement gettime() {
      return getOrCreateProperty("time", "time", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/OracleStatspackLV.paging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/OracleStatspackLV.paging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/infopages/OracleStatspackLV.paging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class startuptimeHeader extends ValueElement {
    public startuptimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/OracleStatspackLV.paging.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class timeHeader extends ValueElement {
    public timeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}