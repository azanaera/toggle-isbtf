package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.OptionElement;
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
import pcftest.StatementLineItemLV._ListPaging;
import pcftest.StatementLineItemLV.entry;
import pcftest.StatementLineItemLV.entry._Select;
import pcftest.StatementLineItemLV.entry._ViewDetail;
import pcftest.StatementLineItemLV.entry.lineItemCategory;
import pcftest.StatementLineItemLV.lineItemAmountHeader;
import pcftest.StatementLineItemLV.lineItemCategoryHeader;
import pcftest.StatementLineItemLV.lineItemDescriptionHeader;
import typekey.ServiceRequestStatementLineItemCategory;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/servicerequests/StatementLineItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class StatementLineItemLV extends PCFElement {
  public final static String CHECKSUM = "488574680f8f64db9502a08f7169e8b3";
  
  public StatementLineItemLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.StatementLineItemLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.StatementLineItemLV._ListPaging.class);
  }
  
  public ValueElement getlineItemAmountFooter() {
    return getOrCreateProperty("lineItemAmountFooter", "lineItemAmountFooter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewFooter, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public lineItemAmountHeader getlineItemAmountHeader() {
    return getOrCreateProperty("lineItemAmountHeader", "lineItemAmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.StatementLineItemLV.lineItemAmountHeader.class);
  }
  
  public ValueElement getlineItemCategoryFooter() {
    return getOrCreateProperty("lineItemCategoryFooter", "lineItemCategoryFooter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public lineItemCategoryHeader getlineItemCategoryHeader() {
    return getOrCreateProperty("lineItemCategoryHeader", "lineItemCategoryHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.StatementLineItemLV.lineItemCategoryHeader.class);
  }
  
  public lineItemDescriptionHeader getlineItemDescriptionHeader() {
    return getOrCreateProperty("lineItemDescriptionHeader", "lineItemDescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.StatementLineItemLV.lineItemDescriptionHeader.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/StatementLineItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/StatementLineItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.StatementLineItemLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.StatementLineItemLV.entry._ViewDetail.class);
    }
    
    public ValueElement getlineItemAmount() {
      return getOrCreateProperty("lineItemAmount", "lineItemAmount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public lineItemCategory getlineItemCategory() {
      return getOrCreateProperty("lineItemCategory", "lineItemCategory", null, pcftest.StatementLineItemLV.entry.lineItemCategory.class);
    }
    
    public ValueElement getlineItemDescription() {
      return getOrCreateProperty("lineItemDescription", "lineItemDescription", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/StatementLineItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/StatementLineItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/servicerequests/StatementLineItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class lineItemCategory extends SelectElement {
      public lineItemCategory(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(ServiceRequestStatementLineItemCategory arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public ServiceRequestStatementLineItemCategory getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ServiceRequestStatementLineItemCategory.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(ServiceRequestStatementLineItemCategory arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/StatementLineItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class lineItemAmountHeader extends ValueElement {
    public lineItemAmountHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/StatementLineItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class lineItemCategoryHeader extends ValueElement {
    public lineItemCategoryHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/servicerequests/StatementLineItemLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class lineItemDescriptionHeader extends ValueElement {
    public lineItemDescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}