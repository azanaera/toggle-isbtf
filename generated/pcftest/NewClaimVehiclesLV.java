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
import pcftest.NewClaimVehiclesLV.ColorHeader;
import pcftest.NewClaimVehiclesLV.LicensePlateHeader;
import pcftest.NewClaimVehiclesLV.LienholdersHeader;
import pcftest.NewClaimVehiclesLV.MakeHeader;
import pcftest.NewClaimVehiclesLV.ModelHeader;
import pcftest.NewClaimVehiclesLV.NumberHeader;
import pcftest.NewClaimVehiclesLV.StateHeader;
import pcftest.NewClaimVehiclesLV.VINHeader;
import pcftest.NewClaimVehiclesLV.YearHeader;
import pcftest.NewClaimVehiclesLV._ListPaging;
import pcftest.NewClaimVehiclesLV.entry;
import pcftest.NewClaimVehiclesLV.entry.Number;
import pcftest.NewClaimVehiclesLV.entry.State;
import pcftest.NewClaimVehiclesLV.entry.VIN;
import pcftest.NewClaimVehiclesLV.entry._Select;
import pcftest.NewClaimVehiclesLV.entry._ViewDetail;
import typekey.Jurisdiction;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/NewClaimVehiclesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewClaimVehiclesLV extends PCFElement {
  public final static String CHECKSUM = "022d10aa032514f0942f1de2e6c027ee";
  
  public NewClaimVehiclesLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ColorHeader getColorHeader() {
    return getOrCreateProperty("ColorHeader", "ColorHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimVehiclesLV.ColorHeader.class);
  }
  
  public LicensePlateHeader getLicensePlateHeader() {
    return getOrCreateProperty("LicensePlateHeader", "LicensePlateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimVehiclesLV.LicensePlateHeader.class);
  }
  
  public LienholdersHeader getLienholdersHeader() {
    return getOrCreateProperty("LienholdersHeader", "LienholdersHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimVehiclesLV.LienholdersHeader.class);
  }
  
  public MakeHeader getMakeHeader() {
    return getOrCreateProperty("MakeHeader", "MakeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimVehiclesLV.MakeHeader.class);
  }
  
  public ModelHeader getModelHeader() {
    return getOrCreateProperty("ModelHeader", "ModelHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimVehiclesLV.ModelHeader.class);
  }
  
  public NumberHeader getNumberHeader() {
    return getOrCreateProperty("NumberHeader", "NumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimVehiclesLV.NumberHeader.class);
  }
  
  public StateHeader getStateHeader() {
    return getOrCreateProperty("StateHeader", "StateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimVehiclesLV.StateHeader.class);
  }
  
  public VINHeader getVINHeader() {
    return getOrCreateProperty("VINHeader", "VINHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimVehiclesLV.VINHeader.class);
  }
  
  public YearHeader getYearHeader() {
    return getOrCreateProperty("YearHeader", "YearHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.NewClaimVehiclesLV.YearHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.NewClaimVehiclesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.NewClaimVehiclesLV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimVehiclesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ColorHeader extends ValueElement {
    public ColorHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimVehiclesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LicensePlateHeader extends ValueElement {
    public LicensePlateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimVehiclesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LienholdersHeader extends ValueElement {
    public LienholdersHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimVehiclesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MakeHeader extends ValueElement {
    public MakeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimVehiclesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ModelHeader extends ValueElement {
    public ModelHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimVehiclesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NumberHeader extends ValueElement {
    public NumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimVehiclesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StateHeader extends ValueElement {
    public StateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimVehiclesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VINHeader extends ValueElement {
    public VINHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimVehiclesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class YearHeader extends ValueElement {
    public YearHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimVehiclesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimVehiclesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    public ValueElement getLienholders() {
      return getOrCreateProperty("Lienholders", "Lienholders", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMake() {
      return getOrCreateProperty("Make", "Make", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getModel() {
      return getOrCreateProperty("Model", "Model", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public Number getNumber() {
      return getOrCreateProperty("Number", "Number", null, pcftest.NewClaimVehiclesLV.entry.Number.class);
    }
    
    public State getState() {
      return getOrCreateProperty("State", "State", null, pcftest.NewClaimVehiclesLV.entry.State.class);
    }
    
    public VIN getVIN() {
      return getOrCreateProperty("VIN", "VIN", null, pcftest.NewClaimVehiclesLV.entry.VIN.class);
    }
    
    public ValueElement getYear() {
      return getOrCreateProperty("Year", "Year", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.NewClaimVehiclesLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.NewClaimVehiclesLV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimVehiclesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Number extends ValueElement {
      public Number(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewClaimWizard_PolicyVehicleDetailPopup click() {
        return clickThis(pcftest.NewClaimWizard_PolicyVehicleDetailPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimVehiclesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class State extends SelectElement {
      public State(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(Jurisdiction arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public Jurisdiction getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Jurisdiction.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(Jurisdiction arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimVehiclesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class VIN extends ValueElement {
      public VIN(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewClaimWizard_PolicyVehicleDetailPopup click() {
        return clickThis(pcftest.NewClaimWizard_PolicyVehicleDetailPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimVehiclesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/NewClaimVehiclesLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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