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
import pcftest.EditableVehicleIncidentsLV.DriverHeader;
import pcftest.EditableVehicleIncidentsLV.LicensePlateHeader;
import pcftest.EditableVehicleIncidentsLV.LossPartyHeader;
import pcftest.EditableVehicleIncidentsLV.MakeHeader;
import pcftest.EditableVehicleIncidentsLV.ModelHeader;
import pcftest.EditableVehicleIncidentsLV.StateHeader;
import pcftest.EditableVehicleIncidentsLV._ListPaging;
import pcftest.EditableVehicleIncidentsLV.entry;
import pcftest.EditableVehicleIncidentsLV.entry.LossParty;
import pcftest.EditableVehicleIncidentsLV.entry.Make;
import pcftest.EditableVehicleIncidentsLV.entry.Model;
import pcftest.EditableVehicleIncidentsLV.entry.State;
import pcftest.EditableVehicleIncidentsLV.entry._Select;
import pcftest.EditableVehicleIncidentsLV.entry._ViewDetail;
import pcftest.EditableVehicleIncidentsLV.year_extHeader;
import typekey.Jurisdiction;
import typekey.LossPartyType;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/EditableVehicleIncidentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class EditableVehicleIncidentsLV extends PCFElement {
  public final static String CHECKSUM = "5a58ad433ce22eea39d87c990f5f8522";
  
  public EditableVehicleIncidentsLV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public DriverHeader getDriverHeader() {
    return getOrCreateProperty("DriverHeader", "DriverHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableVehicleIncidentsLV.DriverHeader.class);
  }
  
  public LicensePlateHeader getLicensePlateHeader() {
    return getOrCreateProperty("LicensePlateHeader", "LicensePlateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableVehicleIncidentsLV.LicensePlateHeader.class);
  }
  
  public LossPartyHeader getLossPartyHeader() {
    return getOrCreateProperty("LossPartyHeader", "LossPartyHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableVehicleIncidentsLV.LossPartyHeader.class);
  }
  
  public MakeHeader getMakeHeader() {
    return getOrCreateProperty("MakeHeader", "MakeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableVehicleIncidentsLV.MakeHeader.class);
  }
  
  public ModelHeader getModelHeader() {
    return getOrCreateProperty("ModelHeader", "ModelHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableVehicleIncidentsLV.ModelHeader.class);
  }
  
  public StateHeader getStateHeader() {
    return getOrCreateProperty("StateHeader", "StateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableVehicleIncidentsLV.StateHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.EditableVehicleIncidentsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.EditableVehicleIncidentsLV._ListPaging.class);
  }
  
  public year_extHeader getyear_extHeader() {
    return getOrCreateProperty("year_extHeader", "year_extHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.EditableVehicleIncidentsLV.year_extHeader.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableVehicleIncidentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DriverHeader extends ValueElement {
    public DriverHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableVehicleIncidentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LicensePlateHeader extends ValueElement {
    public LicensePlateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableVehicleIncidentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossPartyHeader extends ValueElement {
    public LossPartyHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableVehicleIncidentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MakeHeader extends ValueElement {
    public MakeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableVehicleIncidentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ModelHeader extends ValueElement {
    public ModelHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableVehicleIncidentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StateHeader extends ValueElement {
    public StateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableVehicleIncidentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableVehicleIncidentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getDriver() {
      return getOrCreateProperty("Driver", "Driver", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getLicensePlate() {
      return getOrCreateProperty("LicensePlate", "LicensePlate", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public LossParty getLossParty() {
      return getOrCreateProperty("LossParty", "LossParty", null, pcftest.EditableVehicleIncidentsLV.entry.LossParty.class);
    }
    
    public Make getMake() {
      return getOrCreateProperty("Make", "Make", null, pcftest.EditableVehicleIncidentsLV.entry.Make.class);
    }
    
    public Model getModel() {
      return getOrCreateProperty("Model", "Model", null, pcftest.EditableVehicleIncidentsLV.entry.Model.class);
    }
    
    public State getState() {
      return getOrCreateProperty("State", "State", null, pcftest.EditableVehicleIncidentsLV.entry.State.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.EditableVehicleIncidentsLV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.EditableVehicleIncidentsLV.entry._ViewDetail.class);
    }
    
    public ValueElement getyear_ext() {
      return getOrCreateProperty("year_ext", "year_ext", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditableVehicleIncidentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LossParty extends SelectElement {
      public LossParty(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(LossPartyType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public LossPartyType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossPartyType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(LossPartyType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditableVehicleIncidentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Make extends ValueElement {
      public Make(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditVehicleIncidentPopup click() {
        return clickThis(pcftest.EditVehicleIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditableVehicleIncidentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Model extends ValueElement {
      public Model(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditVehicleIncidentPopup click() {
        return clickThis(pcftest.EditVehicleIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditableVehicleIncidentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditableVehicleIncidentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/EditableVehicleIncidentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/EditableVehicleIncidentsLV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class year_extHeader extends ValueElement {
    public year_extHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}