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
import pcftest.NewClaimStatCodesLV.BuildingNumberHeader;
import pcftest.NewClaimStatCodesLV.ClassCodeHeader;
import pcftest.NewClaimStatCodesLV.InsuranceLineHeader;
import pcftest.NewClaimStatCodesLV.InsuranceSubLineHeader;
import pcftest.NewClaimStatCodesLV.LineNumberHeader;
import pcftest.NewClaimStatCodesLV.LocationNumberHeader;
import pcftest.NewClaimStatCodesLV.MajorPerilHeader;
import pcftest.NewClaimStatCodesLV.NotesHeader;
import pcftest.NewClaimStatCodesLV.StateHeader;
import pcftest.NewClaimStatCodesLV.VehicleNumberHeader;
import pcftest.NewClaimStatCodesLV._ListPaging;
import pcftest.NewClaimStatCodesLV.entry;
import pcftest.NewClaimStatCodesLV.entry.LineNumber;
import pcftest.NewClaimStatCodesLV.entry.MajorPeril;
import pcftest.NewClaimStatCodesLV.entry._Select;
import pcftest.NewClaimStatCodesLV.entry._ViewDetail;
import typekey.MajorPerils;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimStatCodesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimStatCodesLV extends PCFElement {
  public final static String CHECKSUM = "37b3221760676f12719a362163f92c29";
  
  public NewClaimStatCodesLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BuildingNumberHeader getBuildingNumberHeader() {
    return getOrCreateProperty("BuildingNumberHeader", "BuildingNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimStatCodesLV.BuildingNumberHeader.class);
  }
  
  public ClassCodeHeader getClassCodeHeader() {
    return getOrCreateProperty("ClassCodeHeader", "ClassCodeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimStatCodesLV.ClassCodeHeader.class);
  }
  
  public InsuranceLineHeader getInsuranceLineHeader() {
    return getOrCreateProperty("InsuranceLineHeader", "InsuranceLineHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimStatCodesLV.InsuranceLineHeader.class);
  }
  
  public InsuranceSubLineHeader getInsuranceSubLineHeader() {
    return getOrCreateProperty("InsuranceSubLineHeader", "InsuranceSubLineHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimStatCodesLV.InsuranceSubLineHeader.class);
  }
  
  public LineNumberHeader getLineNumberHeader() {
    return getOrCreateProperty("LineNumberHeader", "LineNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimStatCodesLV.LineNumberHeader.class);
  }
  
  public LocationNumberHeader getLocationNumberHeader() {
    return getOrCreateProperty("LocationNumberHeader", "LocationNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimStatCodesLV.LocationNumberHeader.class);
  }
  
  public MajorPerilHeader getMajorPerilHeader() {
    return getOrCreateProperty("MajorPerilHeader", "MajorPerilHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimStatCodesLV.MajorPerilHeader.class);
  }
  
  public NotesHeader getNotesHeader() {
    return getOrCreateProperty("NotesHeader", "NotesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimStatCodesLV.NotesHeader.class);
  }
  
  public StateHeader getStateHeader() {
    return getOrCreateProperty("StateHeader", "StateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimStatCodesLV.StateHeader.class);
  }
  
  public VehicleNumberHeader getVehicleNumberHeader() {
    return getOrCreateProperty("VehicleNumberHeader", "VehicleNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimStatCodesLV.VehicleNumberHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.NewClaimStatCodesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.NewClaimStatCodesLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimStatCodesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BuildingNumberHeader extends ValueElement {
    public BuildingNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimStatCodesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClassCodeHeader extends ValueElement {
    public ClassCodeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimStatCodesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InsuranceLineHeader extends ValueElement {
    public InsuranceLineHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimStatCodesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class InsuranceSubLineHeader extends ValueElement {
    public InsuranceSubLineHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimStatCodesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LineNumberHeader extends ValueElement {
    public LineNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimStatCodesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LocationNumberHeader extends ValueElement {
    public LocationNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimStatCodesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MajorPerilHeader extends ValueElement {
    public MajorPerilHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimStatCodesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NotesHeader extends ValueElement {
    public NotesHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimStatCodesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StateHeader extends ValueElement {
    public StateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimStatCodesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehicleNumberHeader extends ValueElement {
    public VehicleNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimStatCodesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimStatCodesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    public pcftest.NewClaimStatCodesLV.entry.InsuranceLine getInsuranceLine() {
      return getOrCreateProperty("InsuranceLine", "InsuranceLine", null, pcftest.NewClaimStatCodesLV.entry.InsuranceLine.class);
    }
    
    public pcftest.NewClaimStatCodesLV.entry.InsuranceSubLine getInsuranceSubLine() {
      return getOrCreateProperty("InsuranceSubLine", "InsuranceSubLine", null, pcftest.NewClaimStatCodesLV.entry.InsuranceSubLine.class);
    }
    
    public LineNumber getLineNumber() {
      return getOrCreateProperty("LineNumber", "LineNumber", null, pcftest.NewClaimStatCodesLV.entry.LineNumber.class);
    }
    
    public ValueElement getLocationNumber() {
      return getOrCreateProperty("LocationNumber", "LocationNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public MajorPeril getMajorPeril() {
      return getOrCreateProperty("MajorPeril", "MajorPeril", null, pcftest.NewClaimStatCodesLV.entry.MajorPeril.class);
    }
    
    public ValueElement getNotes() {
      return getOrCreateProperty("Notes", "Notes", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public pcftest.NewClaimStatCodesLV.entry.State getState() {
      return getOrCreateProperty("State", "State", null, pcftest.NewClaimStatCodesLV.entry.State.class);
    }
    
    public ValueElement getVehicleNumber() {
      return getOrCreateProperty("VehicleNumber", "VehicleNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.NewClaimStatCodesLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.NewClaimStatCodesLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimStatCodesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimStatCodesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimStatCodesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LineNumber extends ValueElement {
      public LineNumber(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewClaimWizard_StatCodeDetailPopup click() {
        return clickThis(pcftest.NewClaimWizard_StatCodeDetailPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimStatCodesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimStatCodesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimStatCodesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimStatCodesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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