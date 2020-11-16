package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
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
import pcftest.PickProfilerSourceLV_Upgrade.UpgradeDurationHeader;
import pcftest.PickProfilerSourceLV_Upgrade.UpgradeEndTimeHeader;
import pcftest.PickProfilerSourceLV_Upgrade.UpgradeStartTimeHeader;
import pcftest.PickProfilerSourceLV_Upgrade._ListPaging;
import pcftest.PickProfilerSourceLV_Upgrade.entry;
import pcftest.PickProfilerSourceLV_Upgrade.entry._Select;
import pcftest.PickProfilerSourceLV_Upgrade.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.Upgrade.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PickProfilerSourceLV_Upgrade extends PickProfilerSourceLV {
  public final static String CHECKSUM = "6b94fb1d99371aee290e047611154344";
  
  public PickProfilerSourceLV_Upgrade(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public UpgradeDurationHeader getUpgradeDurationHeader() {
    return getOrCreateProperty("UpgradeDurationHeader", "UpgradeDurationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PickProfilerSourceLV_Upgrade.UpgradeDurationHeader.class);
  }
  
  public UpgradeEndTimeHeader getUpgradeEndTimeHeader() {
    return getOrCreateProperty("UpgradeEndTimeHeader", "UpgradeEndTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PickProfilerSourceLV_Upgrade.UpgradeEndTimeHeader.class);
  }
  
  public UpgradeStartTimeHeader getUpgradeStartTimeHeader() {
    return getOrCreateProperty("UpgradeStartTimeHeader", "UpgradeStartTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PickProfilerSourceLV_Upgrade.UpgradeStartTimeHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.PickProfilerSourceLV_Upgrade.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.PickProfilerSourceLV_Upgrade._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.Upgrade.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UpgradeDurationHeader extends ValueElement {
    public UpgradeDurationHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.Upgrade.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UpgradeEndTimeHeader extends ValueElement {
    public UpgradeEndTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.Upgrade.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class UpgradeStartTimeHeader extends ValueElement {
    public UpgradeStartTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.Upgrade.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.Upgrade.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getUpgradeDuration() {
      return getOrCreateProperty("UpgradeDuration", "UpgradeDuration", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getUpgradeEndTime() {
      return getOrCreateProperty("UpgradeEndTime", "UpgradeEndTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getUpgradeStartTime() {
      return getOrCreateProperty("UpgradeStartTime", "UpgradeStartTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.PickProfilerSourceLV_Upgrade.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.PickProfilerSourceLV_Upgrade.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.Upgrade.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/profiler/PickProfilerSourceLV.Upgrade.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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