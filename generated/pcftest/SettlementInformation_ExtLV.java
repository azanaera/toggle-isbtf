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
import pcftest.SettlementInformation_ExtLV._ListPaging;
import pcftest.SettlementInformation_ExtLV.amountHeader;
import pcftest.SettlementInformation_ExtLV.dateHeader;
import pcftest.SettlementInformation_ExtLV.delayedDateHeader;
import pcftest.SettlementInformation_ExtLV.entry;
import pcftest.SettlementInformation_ExtLV.entry._Select;
import pcftest.SettlementInformation_ExtLV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/shared/exposures/SettlementInformation_ExtLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SettlementInformation_ExtLV extends PCFElement {
  public final static String CHECKSUM = "c657639b258d29e26bb270236e2112cc";
  
  public SettlementInformation_ExtLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.SettlementInformation_ExtLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.SettlementInformation_ExtLV._ListPaging.class);
  }
  
  public amountHeader getamountHeader() {
    return getOrCreateProperty("amountHeader", "amountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SettlementInformation_ExtLV.amountHeader.class);
  }
  
  public dateHeader getdateHeader() {
    return getOrCreateProperty("dateHeader", "dateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SettlementInformation_ExtLV.dateHeader.class);
  }
  
  public delayedDateHeader getdelayedDateHeader() {
    return getOrCreateProperty("delayedDateHeader", "delayedDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SettlementInformation_ExtLV.delayedDateHeader.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/shared/exposures/SettlementInformation_ExtLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/shared/exposures/SettlementInformation_ExtLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class amountHeader extends ValueElement {
    public amountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/shared/exposures/SettlementInformation_ExtLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class dateHeader extends ValueElement {
    public dateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/shared/exposures/SettlementInformation_ExtLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class delayedDateHeader extends ValueElement {
    public delayedDateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/shared/exposures/SettlementInformation_ExtLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.SettlementInformation_ExtLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.SettlementInformation_ExtLV.entry._ViewDetail.class);
    }
    
    public ValueElement getamount() {
      return getOrCreateProperty("amount", "amount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getdate() {
      return getOrCreateProperty("date", "date", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getdelayedDate() {
      return getOrCreateProperty("delayedDate", "delayedDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/shared/exposures/SettlementInformation_ExtLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/shared/exposures/SettlementInformation_ExtLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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