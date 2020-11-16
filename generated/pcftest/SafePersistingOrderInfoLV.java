package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.SafePersistingOrderInfoLV.NameHeader;
import pcftest.SafePersistingOrderInfoLV.PreUpdateRulesHeader;
import pcftest.SafePersistingOrderInfoLV.TableHeader;
import pcftest.SafePersistingOrderInfoLV._ListPaging;
import pcftest.SafePersistingOrderInfoLV.entry;
import pcftest.SafePersistingOrderInfoLV.entry._Select;
import pcftest.SafePersistingOrderInfoLV.entry._ViewDetail;
import pcftest.SafePersistingOrderInfoLV.orderHeader;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/tools/infopages/SafePersistingOrderInfoLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SafePersistingOrderInfoLV extends PCFElement {
  public final static String CHECKSUM = "0a6d246b18faa81da1c149a58f73fd4f";
  
  public SafePersistingOrderInfoLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SelectElement getFilter() {
    return getOrCreateProperty("Filter", "Filter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public NameHeader getNameHeader() {
    return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SafePersistingOrderInfoLV.NameHeader.class);
  }
  
  public PreUpdateRulesHeader getPreUpdateRulesHeader() {
    return getOrCreateProperty("PreUpdateRulesHeader", "PreUpdateRulesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SafePersistingOrderInfoLV.PreUpdateRulesHeader.class);
  }
  
  public TableHeader getTableHeader() {
    return getOrCreateProperty("TableHeader", "TableHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SafePersistingOrderInfoLV.TableHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.SafePersistingOrderInfoLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.SafePersistingOrderInfoLV._ListPaging.class);
  }
  
  public orderHeader getorderHeader() {
    return getOrCreateProperty("orderHeader", "orderHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.SafePersistingOrderInfoLV.orderHeader.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/SafePersistingOrderInfoLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NameHeader extends ValueElement {
    public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/SafePersistingOrderInfoLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PreUpdateRulesHeader extends ValueElement {
    public PreUpdateRulesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/SafePersistingOrderInfoLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TableHeader extends ValueElement {
    public TableHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/SafePersistingOrderInfoLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/tools/infopages/SafePersistingOrderInfoLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getName() {
      return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getPreUpdateRules() {
      return getOrCreateProperty("PreUpdateRules", "PreUpdateRules", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getTable() {
      return getOrCreateProperty("Table", "Table", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.SafePersistingOrderInfoLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.SafePersistingOrderInfoLV.entry._ViewDetail.class);
    }
    
    public ValueElement getorder() {
      return getOrCreateProperty("order", "order", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/SafePersistingOrderInfoLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/tools/infopages/SafePersistingOrderInfoLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/tools/infopages/SafePersistingOrderInfoLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class orderHeader extends ValueElement {
    public orderHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}