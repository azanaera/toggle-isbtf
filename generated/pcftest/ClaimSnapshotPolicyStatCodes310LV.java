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
import pcftest.ClaimSnapshotPolicyStatCodes310LV.BuildingNumberHeader;
import pcftest.ClaimSnapshotPolicyStatCodes310LV.ClassCodeHeader;
import pcftest.ClaimSnapshotPolicyStatCodes310LV.InsuranceLineHeader;
import pcftest.ClaimSnapshotPolicyStatCodes310LV.InsuranceSublineHeader;
import pcftest.ClaimSnapshotPolicyStatCodes310LV.LineNumberHeader;
import pcftest.ClaimSnapshotPolicyStatCodes310LV.LocationNumberHeader;
import pcftest.ClaimSnapshotPolicyStatCodes310LV.MajorPerilHeader;
import pcftest.ClaimSnapshotPolicyStatCodes310LV.NotesHeader;
import pcftest.ClaimSnapshotPolicyStatCodes310LV.StateHeader;
import pcftest.ClaimSnapshotPolicyStatCodes310LV.VehicleNumberHeader;
import pcftest.ClaimSnapshotPolicyStatCodes310LV._ListPaging;
import pcftest.ClaimSnapshotPolicyStatCodes310LV.entry;
import pcftest.ClaimSnapshotPolicyStatCodes310LV.entry._Select;
import pcftest.ClaimSnapshotPolicyStatCodes310LV.entry._ViewDetail;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyStatCodes310LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotPolicyStatCodes310LV extends PCFElement {
  public final static String CHECKSUM = "d05e4bea0dfc3f8a9259385a031b42f3";
  
  public ClaimSnapshotPolicyStatCodes310LV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BuildingNumberHeader getBuildingNumberHeader() {
    return getOrCreateProperty("BuildingNumberHeader", "BuildingNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyStatCodes310LV.BuildingNumberHeader.class);
  }
  
  public ClassCodeHeader getClassCodeHeader() {
    return getOrCreateProperty("ClassCodeHeader", "ClassCodeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyStatCodes310LV.ClassCodeHeader.class);
  }
  
  public InsuranceLineHeader getInsuranceLineHeader() {
    return getOrCreateProperty("InsuranceLineHeader", "InsuranceLineHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyStatCodes310LV.InsuranceLineHeader.class);
  }
  
  public InsuranceSublineHeader getInsuranceSublineHeader() {
    return getOrCreateProperty("InsuranceSublineHeader", "InsuranceSublineHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyStatCodes310LV.InsuranceSublineHeader.class);
  }
  
  public LineNumberHeader getLineNumberHeader() {
    return getOrCreateProperty("LineNumberHeader", "LineNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyStatCodes310LV.LineNumberHeader.class);
  }
  
  public LocationNumberHeader getLocationNumberHeader() {
    return getOrCreateProperty("LocationNumberHeader", "LocationNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyStatCodes310LV.LocationNumberHeader.class);
  }
  
  public MajorPerilHeader getMajorPerilHeader() {
    return getOrCreateProperty("MajorPerilHeader", "MajorPerilHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyStatCodes310LV.MajorPerilHeader.class);
  }
  
  public NotesHeader getNotesHeader() {
    return getOrCreateProperty("NotesHeader", "NotesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyStatCodes310LV.NotesHeader.class);
  }
  
  public StateHeader getStateHeader() {
    return getOrCreateProperty("StateHeader", "StateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyStatCodes310LV.StateHeader.class);
  }
  
  public VehicleNumberHeader getVehicleNumberHeader() {
    return getOrCreateProperty("VehicleNumberHeader", "VehicleNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotPolicyStatCodes310LV.VehicleNumberHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotPolicyStatCodes310LV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotPolicyStatCodes310LV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyStatCodes310LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BuildingNumberHeader extends ValueElement {
    public BuildingNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyStatCodes310LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClassCodeHeader extends ValueElement {
    public ClassCodeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyStatCodes310LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InsuranceLineHeader extends ValueElement {
    public InsuranceLineHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyStatCodes310LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InsuranceSublineHeader extends ValueElement {
    public InsuranceSublineHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyStatCodes310LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LineNumberHeader extends ValueElement {
    public LineNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyStatCodes310LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationNumberHeader extends ValueElement {
    public LocationNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyStatCodes310LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MajorPerilHeader extends ValueElement {
    public MajorPerilHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyStatCodes310LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NotesHeader extends ValueElement {
    public NotesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyStatCodes310LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StateHeader extends ValueElement {
    public StateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyStatCodes310LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehicleNumberHeader extends ValueElement {
    public VehicleNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyStatCodes310LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyStatCodes310LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getBuildingNumber() {
      return getOrCreateProperty("BuildingNumber", "BuildingNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClassCode() {
      return getOrCreateProperty("ClassCode", "ClassCode", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getInsuranceLine() {
      return getOrCreateProperty("InsuranceLine", "InsuranceLine", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getInsuranceSubline() {
      return getOrCreateProperty("InsuranceSubline", "InsuranceSubline", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getLineNumber() {
      return getOrCreateProperty("LineNumber", "LineNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getLocationNumber() {
      return getOrCreateProperty("LocationNumber", "LocationNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMajorPeril() {
      return getOrCreateProperty("MajorPeril", "MajorPeril", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getNotes() {
      return getOrCreateProperty("Notes", "Notes", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getState() {
      return getOrCreateProperty("State", "State", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getVehicleNumber() {
      return getOrCreateProperty("VehicleNumber", "VehicleNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotPolicyStatCodes310LV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotPolicyStatCodes310LV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyStatCodes310LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotPolicyStatCodes310LV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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