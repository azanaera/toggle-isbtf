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
import pcftest.ClaimSnapshotPolicyVehicles700LV.ColorHeader;
import pcftest.ClaimSnapshotPolicyVehicles700LV.LicensePlateHeader;
import pcftest.ClaimSnapshotPolicyVehicles700LV.MakeHeader;
import pcftest.ClaimSnapshotPolicyVehicles700LV.ModelHeader;
import pcftest.ClaimSnapshotPolicyVehicles700LV.StateHeader;
import pcftest.ClaimSnapshotPolicyVehicles700LV.VINHeader;
import pcftest.ClaimSnapshotPolicyVehicles700LV.VehicleNumberHeader;
import pcftest.ClaimSnapshotPolicyVehicles700LV.YearHeader;
import pcftest.ClaimSnapshotPolicyVehicles700LV._ListPaging;
import pcftest.ClaimSnapshotPolicyVehicles700LV.entry;
import pcftest.ClaimSnapshotPolicyVehicles700LV.entry._Select;
import pcftest.ClaimSnapshotPolicyVehicles700LV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyVehicles700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyVehicles700LV extends PCFElement {
  public final static String CHECKSUM = "5193cc52f72ad0686cb590c9cea91df1";
  
  public ClaimSnapshotPolicyVehicles700LV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ColorHeader getColorHeader() {
    return getOrCreateProperty("ColorHeader", "ColorHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyVehicles700LV.ColorHeader.class);
  }
  
  public LicensePlateHeader getLicensePlateHeader() {
    return getOrCreateProperty("LicensePlateHeader", "LicensePlateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyVehicles700LV.LicensePlateHeader.class);
  }
  
  public MakeHeader getMakeHeader() {
    return getOrCreateProperty("MakeHeader", "MakeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyVehicles700LV.MakeHeader.class);
  }
  
  public ModelHeader getModelHeader() {
    return getOrCreateProperty("ModelHeader", "ModelHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyVehicles700LV.ModelHeader.class);
  }
  
  public StateHeader getStateHeader() {
    return getOrCreateProperty("StateHeader", "StateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyVehicles700LV.StateHeader.class);
  }
  
  public VINHeader getVINHeader() {
    return getOrCreateProperty("VINHeader", "VINHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyVehicles700LV.VINHeader.class);
  }
  
  public VehicleNumberHeader getVehicleNumberHeader() {
    return getOrCreateProperty("VehicleNumberHeader", "VehicleNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyVehicles700LV.VehicleNumberHeader.class);
  }
  
  public YearHeader getYearHeader() {
    return getOrCreateProperty("YearHeader", "YearHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyVehicles700LV.YearHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyVehicles700LV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyVehicles700LV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyVehicles700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ColorHeader extends ValueElement {
    public ColorHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyVehicles700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LicensePlateHeader extends ValueElement {
    public LicensePlateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyVehicles700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MakeHeader extends ValueElement {
    public MakeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyVehicles700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ModelHeader extends ValueElement {
    public ModelHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyVehicles700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StateHeader extends ValueElement {
    public StateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyVehicles700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VINHeader extends ValueElement {
    public VINHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyVehicles700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehicleNumberHeader extends ValueElement {
    public VehicleNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyVehicles700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class YearHeader extends ValueElement {
    public YearHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyVehicles700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyVehicles700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getColor() {
      return getOrCreateProperty("Color", "Color", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getLicensePlate() {
      return getOrCreateProperty("LicensePlate", "LicensePlate", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMake() {
      return getOrCreateProperty("Make", "Make", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getModel() {
      return getOrCreateProperty("Model", "Model", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getState() {
      return getOrCreateProperty("State", "State", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getVIN() {
      return getOrCreateProperty("VIN", "VIN", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getVehicleNumber() {
      return getOrCreateProperty("VehicleNumber", "VehicleNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getYear() {
      return getOrCreateProperty("Year", "Year", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyVehicles700LV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyVehicles700LV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyVehicles700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotPolicyVehicles700LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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