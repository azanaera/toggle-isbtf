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
import pcftest.PolicyLocationsLV.AddressHeader;
import pcftest.PolicyLocationsLV.DescriptionHeader;
import pcftest.PolicyLocationsLV.HighValueItemsHeader;
import pcftest.PolicyLocationsLV.LienholdersHeader;
import pcftest.PolicyLocationsLV.LocationNumberHeader;
import pcftest.PolicyLocationsLV._ListPaging;
import pcftest.PolicyLocationsLV.entry;
import pcftest.PolicyLocationsLV.entry.Address;
import pcftest.PolicyLocationsLV.entry.HighValueItems;
import pcftest.PolicyLocationsLV.entry.LocationNumber;
import pcftest.PolicyLocationsLV.entry._Select;
import pcftest.PolicyLocationsLV.entry._ViewDetail;
import typekey.YesNo;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyLocationsLV extends PCFElement {
  public final static String CHECKSUM = "dd96dde9887c8c1e15552e20fac2e579";
  
  public PolicyLocationsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddressHeader getAddressHeader() {
    return getOrCreateProperty("AddressHeader", "AddressHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyLocationsLV.AddressHeader.class);
  }
  
  public DescriptionHeader getDescriptionHeader() {
    return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyLocationsLV.DescriptionHeader.class);
  }
  
  public HighValueItemsHeader getHighValueItemsHeader() {
    return getOrCreateProperty("HighValueItemsHeader", "HighValueItemsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyLocationsLV.HighValueItemsHeader.class);
  }
  
  public LienholdersHeader getLienholdersHeader() {
    return getOrCreateProperty("LienholdersHeader", "LienholdersHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyLocationsLV.LienholdersHeader.class);
  }
  
  public LocationNumberHeader getLocationNumberHeader() {
    return getOrCreateProperty("LocationNumberHeader", "LocationNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyLocationsLV.LocationNumberHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.PolicyLocationsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.PolicyLocationsLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressHeader extends ValueElement {
    public AddressHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DescriptionHeader extends ValueElement {
    public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class HighValueItemsHeader extends ValueElement {
    public HighValueItemsHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LienholdersHeader extends ValueElement {
    public LienholdersHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationNumberHeader extends ValueElement {
    public LocationNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Address getAddress() {
      return getOrCreateProperty("Address", "Address", null, pcftest.PolicyLocationsLV.entry.Address.class);
    }
    
    public ValueElement getDescription() {
      return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public HighValueItems getHighValueItems() {
      return getOrCreateProperty("HighValueItems", "HighValueItems", null, pcftest.PolicyLocationsLV.entry.HighValueItems.class);
    }
    
    public ValueElement getLienholders() {
      return getOrCreateProperty("Lienholders", "Lienholders", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public LocationNumber getLocationNumber() {
      return getOrCreateProperty("LocationNumber", "LocationNumber", null, pcftest.PolicyLocationsLV.entry.LocationNumber.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.PolicyLocationsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.PolicyLocationsLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Address extends ValueElement {
      public Address(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PolicyLocationPopup click() {
        return clickThis(pcftest.PolicyLocationPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class HighValueItems extends SelectElement {
      public HighValueItems(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(YesNo arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public YesNo getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.YesNo.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(YesNo arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LocationNumber extends ValueElement {
      public LocationNumber(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PolicyLocationPopup click() {
        return clickThis(pcftest.PolicyLocationPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/policylocations/PolicyLocationsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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