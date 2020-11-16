package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
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
import pcftest.EditableWaitingPeriodsLV.DateEndedHeader;
import pcftest.EditableWaitingPeriodsLV.DateStartedHeader;
import pcftest.EditableWaitingPeriodsLV.WaitingDaysAppliedHeader;
import pcftest.EditableWaitingPeriodsLV.WaitingDaysRepaidHeader;
import pcftest.EditableWaitingPeriodsLV._ListPaging;
import pcftest.EditableWaitingPeriodsLV.entry;
import pcftest.EditableWaitingPeriodsLV.entry._Select;
import pcftest.EditableWaitingPeriodsLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/EditableWaitingPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableWaitingPeriodsLV extends PCFElement {
  public final static String CHECKSUM = "dcfde070d04cf9852e61c21ed9d73095";
  
  public EditableWaitingPeriodsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DateEndedHeader getDateEndedHeader() {
    return getOrCreateProperty("DateEndedHeader", "DateEndedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableWaitingPeriodsLV.DateEndedHeader.class);
  }
  
  public DateStartedHeader getDateStartedHeader() {
    return getOrCreateProperty("DateStartedHeader", "DateStartedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableWaitingPeriodsLV.DateStartedHeader.class);
  }
  
  public WaitingDaysAppliedHeader getWaitingDaysAppliedHeader() {
    return getOrCreateProperty("WaitingDaysAppliedHeader", "WaitingDaysAppliedHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableWaitingPeriodsLV.WaitingDaysAppliedHeader.class);
  }
  
  public WaitingDaysRepaidHeader getWaitingDaysRepaidHeader() {
    return getOrCreateProperty("WaitingDaysRepaidHeader", "WaitingDaysRepaidHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableWaitingPeriodsLV.WaitingDaysRepaidHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.EditableWaitingPeriodsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.EditableWaitingPeriodsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableWaitingPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DateEndedHeader extends ValueElement {
    public DateEndedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableWaitingPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DateStartedHeader extends ValueElement {
    public DateStartedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableWaitingPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WaitingDaysAppliedHeader extends ValueElement {
    public WaitingDaysAppliedHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableWaitingPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WaitingDaysRepaidHeader extends ValueElement {
    public WaitingDaysRepaidHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableWaitingPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/EditableWaitingPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DateElement getDateEnded() {
      return getOrCreateProperty("DateEnded", "DateEnded", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getDateStarted() {
      return getOrCreateProperty("DateStarted", "DateStarted", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getWaitingDaysApplied() {
      return getOrCreateProperty("WaitingDaysApplied", "WaitingDaysApplied", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getWaitingDaysRepaid() {
      return getOrCreateProperty("WaitingDaysRepaid", "WaitingDaysRepaid", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.EditableWaitingPeriodsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.EditableWaitingPeriodsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/EditableWaitingPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/EditableWaitingPeriodsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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