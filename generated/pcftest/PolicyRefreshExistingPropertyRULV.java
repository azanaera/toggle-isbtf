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
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.PolicyRefreshExistingPropertyRULV.AddressHeader;
import pcftest.PolicyRefreshExistingPropertyRULV.BuildingNumberHeader;
import pcftest.PolicyRefreshExistingPropertyRULV.CityHeader;
import pcftest.PolicyRefreshExistingPropertyRULV.DescriptionHeader;
import pcftest.PolicyRefreshExistingPropertyRULV.LocationHeader;
import pcftest.PolicyRefreshExistingPropertyRULV.PresentHeader;
import pcftest.PolicyRefreshExistingPropertyRULV.PropertyNumberHeader;
import pcftest.PolicyRefreshExistingPropertyRULV._ListPaging;
import pcftest.PolicyRefreshExistingPropertyRULV.entry;
import pcftest.PolicyRefreshExistingPropertyRULV.entry._Select;
import pcftest.PolicyRefreshExistingPropertyRULV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshExistingPropertyRULV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyRefreshExistingPropertyRULV extends PCFElement {
  public final static String CHECKSUM = "01e9b083bdc0764c16d4794503b7067a";
  
  public PolicyRefreshExistingPropertyRULV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddressHeader getAddressHeader() {
    return getOrCreateProperty("AddressHeader", "AddressHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyRefreshExistingPropertyRULV.AddressHeader.class);
  }
  
  public BuildingNumberHeader getBuildingNumberHeader() {
    return getOrCreateProperty("BuildingNumberHeader", "BuildingNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyRefreshExistingPropertyRULV.BuildingNumberHeader.class);
  }
  
  public CityHeader getCityHeader() {
    return getOrCreateProperty("CityHeader", "CityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyRefreshExistingPropertyRULV.CityHeader.class);
  }
  
  public DescriptionHeader getDescriptionHeader() {
    return getOrCreateProperty("DescriptionHeader", "DescriptionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyRefreshExistingPropertyRULV.DescriptionHeader.class);
  }
  
  public LocationHeader getLocationHeader() {
    return getOrCreateProperty("LocationHeader", "LocationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyRefreshExistingPropertyRULV.LocationHeader.class);
  }
  
  public PresentHeader getPresentHeader() {
    return getOrCreateProperty("PresentHeader", "PresentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyRefreshExistingPropertyRULV.PresentHeader.class);
  }
  
  public PropertyNumberHeader getPropertyNumberHeader() {
    return getOrCreateProperty("PropertyNumberHeader", "PropertyNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyRefreshExistingPropertyRULV.PropertyNumberHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.PolicyRefreshExistingPropertyRULV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.PolicyRefreshExistingPropertyRULV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshExistingPropertyRULV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressHeader extends ValueElement {
    public AddressHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshExistingPropertyRULV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BuildingNumberHeader extends ValueElement {
    public BuildingNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshExistingPropertyRULV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CityHeader extends ValueElement {
    public CityHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshExistingPropertyRULV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DescriptionHeader extends ValueElement {
    public DescriptionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshExistingPropertyRULV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationHeader extends ValueElement {
    public LocationHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshExistingPropertyRULV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PresentHeader extends ValueElement {
    public PresentHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshExistingPropertyRULV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyNumberHeader extends ValueElement {
    public PropertyNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshExistingPropertyRULV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshExistingPropertyRULV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAddress() {
      return getOrCreateProperty("Address", "Address", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getBuildingNumber() {
      return getOrCreateProperty("BuildingNumber", "BuildingNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getCity() {
      return getOrCreateProperty("City", "City", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getDescription() {
      return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getLocation() {
      return getOrCreateProperty("Location", "Location", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPresent() {
      return getOrCreateProperty("Present", "Present", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPropertyNumber() {
      return getOrCreateProperty("PropertyNumber", "PropertyNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.PolicyRefreshExistingPropertyRULV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.PolicyRefreshExistingPropertyRULV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshExistingPropertyRULV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshExistingPropertyRULV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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