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
import pcftest.ClaimSnapshotPolicyLocations600LV.AddressHeader;
import pcftest.ClaimSnapshotPolicyLocations600LV.BuildingHeader;
import pcftest.ClaimSnapshotPolicyLocations600LV.ClassCodeHeader;
import pcftest.ClaimSnapshotPolicyLocations600LV.LocationHeader;
import pcftest.ClaimSnapshotPolicyLocations600LV.NotesHeader;
import pcftest.ClaimSnapshotPolicyLocations600LV.PropertyNumberHeader;
import pcftest.ClaimSnapshotPolicyLocations600LV._ListPaging;
import pcftest.ClaimSnapshotPolicyLocations600LV.entry;
import pcftest.ClaimSnapshotPolicyLocations600LV.entry._Select;
import pcftest.ClaimSnapshotPolicyLocations600LV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocations600LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyLocations600LV extends PCFElement {
  public final static String CHECKSUM = "6e1ab25575823de6c67571599a87e9d8";
  
  public ClaimSnapshotPolicyLocations600LV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AddressHeader getAddressHeader() {
    return getOrCreateProperty("AddressHeader", "AddressHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocations600LV.AddressHeader.class);
  }
  
  public BuildingHeader getBuildingHeader() {
    return getOrCreateProperty("BuildingHeader", "BuildingHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocations600LV.BuildingHeader.class);
  }
  
  public ClassCodeHeader getClassCodeHeader() {
    return getOrCreateProperty("ClassCodeHeader", "ClassCodeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocations600LV.ClassCodeHeader.class);
  }
  
  public LocationHeader getLocationHeader() {
    return getOrCreateProperty("LocationHeader", "LocationHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocations600LV.LocationHeader.class);
  }
  
  public NotesHeader getNotesHeader() {
    return getOrCreateProperty("NotesHeader", "NotesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocations600LV.NotesHeader.class);
  }
  
  public PropertyNumberHeader getPropertyNumberHeader() {
    return getOrCreateProperty("PropertyNumberHeader", "PropertyNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyLocations600LV.PropertyNumberHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyLocations600LV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyLocations600LV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocations600LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AddressHeader extends ValueElement {
    public AddressHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocations600LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BuildingHeader extends ValueElement {
    public BuildingHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocations600LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClassCodeHeader extends ValueElement {
    public ClassCodeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocations600LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationHeader extends ValueElement {
    public LocationHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocations600LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NotesHeader extends ValueElement {
    public NotesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocations600LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PropertyNumberHeader extends ValueElement {
    public PropertyNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocations600LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocations600LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAddress() {
      return getOrCreateProperty("Address", "Address", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getBuilding() {
      return getOrCreateProperty("Building", "Building", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClassCode() {
      return getOrCreateProperty("ClassCode", "ClassCode", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getLocation() {
      return getOrCreateProperty("Location", "Location", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getNotes() {
      return getOrCreateProperty("Notes", "Notes", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPropertyNumber() {
      return getOrCreateProperty("PropertyNumber", "PropertyNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyLocations600LV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyLocations600LV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocations600LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotPolicyLocations600LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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