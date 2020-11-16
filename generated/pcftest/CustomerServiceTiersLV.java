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
import pcftest.CustomerServiceTiersLV.CustomerServiceTierDescriptionHeader;
import pcftest.CustomerServiceTiersLV.CustomerServiceTierNameHeader;
import pcftest.CustomerServiceTiersLV._ListPaging;
import pcftest.CustomerServiceTiersLV.entry;
import pcftest.CustomerServiceTiersLV.entry.CustomerServiceTierName;
import pcftest.CustomerServiceTiersLV.entry._Select;
import pcftest.CustomerServiceTiersLV.entry._ViewDetail;
import typekey.CustomerServiceTier;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTiersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CustomerServiceTiersLV extends PCFElement {
  public final static String CHECKSUM = "db48995f7a9bc46f66e6fd9c1d61b216";
  
  public CustomerServiceTiersLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CustomerServiceTierDescriptionHeader getCustomerServiceTierDescriptionHeader() {
    return getOrCreateProperty("CustomerServiceTierDescriptionHeader", "CustomerServiceTierDescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CustomerServiceTiersLV.CustomerServiceTierDescriptionHeader.class);
  }
  
  public CustomerServiceTierNameHeader getCustomerServiceTierNameHeader() {
    return getOrCreateProperty("CustomerServiceTierNameHeader", "CustomerServiceTierNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CustomerServiceTiersLV.CustomerServiceTierNameHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.CustomerServiceTiersLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.CustomerServiceTiersLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTiersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CustomerServiceTierDescriptionHeader extends ValueElement {
    public CustomerServiceTierDescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTiersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CustomerServiceTierNameHeader extends ValueElement {
    public CustomerServiceTierNameHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTiersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTiersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getCustomerServiceTierDescription() {
      return getOrCreateProperty("CustomerServiceTierDescription", "CustomerServiceTierDescription", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public CustomerServiceTierName getCustomerServiceTierName() {
      return getOrCreateProperty("CustomerServiceTierName", "CustomerServiceTierName", null, pcftest.CustomerServiceTiersLV.entry.CustomerServiceTierName.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.CustomerServiceTiersLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.CustomerServiceTiersLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTiersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CustomerServiceTierName extends SelectElement {
      public CustomerServiceTierName(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CustomerServiceTierDetail click() {
        return clickThis(pcftest.CustomerServiceTierDetail.class);
      }
      
      public OptionElement getOptionByTypeKey(CustomerServiceTier arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public CustomerServiceTier getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CustomerServiceTier.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(CustomerServiceTier arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTiersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/customerservicetiers/CustomerServiceTiersLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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