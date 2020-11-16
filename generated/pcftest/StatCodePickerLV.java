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
import pcftest.StatCodePickerLV.BuildingNumberHeader;
import pcftest.StatCodePickerLV.ClassCodeHeader;
import pcftest.StatCodePickerLV.InsuranceLineHeader;
import pcftest.StatCodePickerLV.InsuranceSubLineHeader;
import pcftest.StatCodePickerLV.LineNumberHeader;
import pcftest.StatCodePickerLV.LocationNumberHeader;
import pcftest.StatCodePickerLV.MajorPerilHeader;
import pcftest.StatCodePickerLV.NotesHeader;
import pcftest.StatCodePickerLV.StateHeader;
import pcftest.StatCodePickerLV.VehicleNumberHeader;
import pcftest.StatCodePickerLV._ListPaging;
import pcftest.StatCodePickerLV.entry;
import pcftest.StatCodePickerLV.entry.MajorPeril;
import pcftest.StatCodePickerLV.entry._Select;
import pcftest.StatCodePickerLV.entry._ViewDetail;
import typekey.MajorPerils;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/shared/policy/StatCodePickerLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class StatCodePickerLV extends PCFElement {
  public final static String CHECKSUM = "a9aaf59bef4a93b1169a649d347dba3a";
  
  public StatCodePickerLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BuildingNumberHeader getBuildingNumberHeader() {
    return getOrCreateProperty("BuildingNumberHeader", "BuildingNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.StatCodePickerLV.BuildingNumberHeader.class);
  }
  
  public ClassCodeHeader getClassCodeHeader() {
    return getOrCreateProperty("ClassCodeHeader", "ClassCodeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.StatCodePickerLV.ClassCodeHeader.class);
  }
  
  public InsuranceLineHeader getInsuranceLineHeader() {
    return getOrCreateProperty("InsuranceLineHeader", "InsuranceLineHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.StatCodePickerLV.InsuranceLineHeader.class);
  }
  
  public InsuranceSubLineHeader getInsuranceSubLineHeader() {
    return getOrCreateProperty("InsuranceSubLineHeader", "InsuranceSubLineHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.StatCodePickerLV.InsuranceSubLineHeader.class);
  }
  
  public LineNumberHeader getLineNumberHeader() {
    return getOrCreateProperty("LineNumberHeader", "LineNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.StatCodePickerLV.LineNumberHeader.class);
  }
  
  public LocationNumberHeader getLocationNumberHeader() {
    return getOrCreateProperty("LocationNumberHeader", "LocationNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.StatCodePickerLV.LocationNumberHeader.class);
  }
  
  public MajorPerilHeader getMajorPerilHeader() {
    return getOrCreateProperty("MajorPerilHeader", "MajorPerilHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.StatCodePickerLV.MajorPerilHeader.class);
  }
  
  public NotesHeader getNotesHeader() {
    return getOrCreateProperty("NotesHeader", "NotesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.StatCodePickerLV.NotesHeader.class);
  }
  
  public StateHeader getStateHeader() {
    return getOrCreateProperty("StateHeader", "StateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.StatCodePickerLV.StateHeader.class);
  }
  
  public VehicleNumberHeader getVehicleNumberHeader() {
    return getOrCreateProperty("VehicleNumberHeader", "VehicleNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.StatCodePickerLV.VehicleNumberHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.StatCodePickerLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.StatCodePickerLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/policy/StatCodePickerLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BuildingNumberHeader extends ValueElement {
    public BuildingNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/policy/StatCodePickerLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClassCodeHeader extends ValueElement {
    public ClassCodeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/policy/StatCodePickerLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InsuranceLineHeader extends ValueElement {
    public InsuranceLineHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/policy/StatCodePickerLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InsuranceSubLineHeader extends ValueElement {
    public InsuranceSubLineHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/policy/StatCodePickerLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LineNumberHeader extends ValueElement {
    public LineNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/policy/StatCodePickerLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationNumberHeader extends ValueElement {
    public LocationNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/policy/StatCodePickerLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MajorPerilHeader extends ValueElement {
    public MajorPerilHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/policy/StatCodePickerLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NotesHeader extends ValueElement {
    public NotesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/policy/StatCodePickerLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StateHeader extends ValueElement {
    public StateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/policy/StatCodePickerLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehicleNumberHeader extends ValueElement {
    public VehicleNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/policy/StatCodePickerLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/shared/policy/StatCodePickerLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    public pcftest.StatCodePickerLV.entry.InsuranceLine getInsuranceLine() {
      return getOrCreateProperty("InsuranceLine", "InsuranceLine", null, pcftest.StatCodePickerLV.entry.InsuranceLine.class);
    }
    
    public pcftest.StatCodePickerLV.entry.InsuranceSubLine getInsuranceSubLine() {
      return getOrCreateProperty("InsuranceSubLine", "InsuranceSubLine", null, pcftest.StatCodePickerLV.entry.InsuranceSubLine.class);
    }
    
    public ValueElement getLineNumber() {
      return getOrCreateProperty("LineNumber", "LineNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getLocationNumber() {
      return getOrCreateProperty("LocationNumber", "LocationNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public MajorPeril getMajorPeril() {
      return getOrCreateProperty("MajorPeril", "MajorPeril", null, pcftest.StatCodePickerLV.entry.MajorPeril.class);
    }
    
    public ValueElement getNotes() {
      return getOrCreateProperty("Notes", "Notes", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.StatCodePickerLV.entry.State getState() {
      return getOrCreateProperty("State", "State", null, pcftest.StatCodePickerLV.entry.State.class);
    }
    
    public ValueElement getVehicleNumber() {
      return getOrCreateProperty("VehicleNumber", "VehicleNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.StatCodePickerLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.StatCodePickerLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/policy/StatCodePickerLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InsuranceLine extends SelectElement {
      public InsuranceLine(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.InsuranceLine arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.InsuranceLine getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.InsuranceLine.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.InsuranceLine arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/policy/StatCodePickerLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InsuranceSubLine extends SelectElement {
      public InsuranceSubLine(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.InsuranceSubLine arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.InsuranceSubLine getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.InsuranceSubLine.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.InsuranceSubLine arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/policy/StatCodePickerLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MajorPeril extends SelectElement {
      public MajorPeril(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(MajorPerils arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public MajorPerils getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.MajorPerils.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(MajorPerils arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/policy/StatCodePickerLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class State extends SelectElement {
      public State(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(typekey.State arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public typekey.State getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.State.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(typekey.State arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/policy/StatCodePickerLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/shared/policy/StatCodePickerLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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