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
import pcftest.PolicyRefreshExistingVehicleRULV.ColorHeader;
import pcftest.PolicyRefreshExistingVehicleRULV.LicencePlateHeader;
import pcftest.PolicyRefreshExistingVehicleRULV.MakeHeader;
import pcftest.PolicyRefreshExistingVehicleRULV.ModelHeader;
import pcftest.PolicyRefreshExistingVehicleRULV.PresentHeader;
import pcftest.PolicyRefreshExistingVehicleRULV.StateHeader;
import pcftest.PolicyRefreshExistingVehicleRULV.VehicleNumberHeader;
import pcftest.PolicyRefreshExistingVehicleRULV.VinHeader;
import pcftest.PolicyRefreshExistingVehicleRULV._ListPaging;
import pcftest.PolicyRefreshExistingVehicleRULV.entry;
import pcftest.PolicyRefreshExistingVehicleRULV.entry.State;
import pcftest.PolicyRefreshExistingVehicleRULV.entry._Select;
import pcftest.PolicyRefreshExistingVehicleRULV.entry._ViewDetail;
import typekey.Jurisdiction;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshExistingVehicleRULV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PolicyRefreshExistingVehicleRULV extends PCFElement {
  public final static String CHECKSUM = "06bd283d223df772809585723cacad28";
  
  public PolicyRefreshExistingVehicleRULV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ColorHeader getColorHeader() {
    return getOrCreateProperty("ColorHeader", "ColorHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyRefreshExistingVehicleRULV.ColorHeader.class);
  }
  
  public LicencePlateHeader getLicencePlateHeader() {
    return getOrCreateProperty("LicencePlateHeader", "LicencePlateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyRefreshExistingVehicleRULV.LicencePlateHeader.class);
  }
  
  public MakeHeader getMakeHeader() {
    return getOrCreateProperty("MakeHeader", "MakeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyRefreshExistingVehicleRULV.MakeHeader.class);
  }
  
  public ModelHeader getModelHeader() {
    return getOrCreateProperty("ModelHeader", "ModelHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyRefreshExistingVehicleRULV.ModelHeader.class);
  }
  
  public PresentHeader getPresentHeader() {
    return getOrCreateProperty("PresentHeader", "PresentHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyRefreshExistingVehicleRULV.PresentHeader.class);
  }
  
  public StateHeader getStateHeader() {
    return getOrCreateProperty("StateHeader", "StateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyRefreshExistingVehicleRULV.StateHeader.class);
  }
  
  public VehicleNumberHeader getVehicleNumberHeader() {
    return getOrCreateProperty("VehicleNumberHeader", "VehicleNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyRefreshExistingVehicleRULV.VehicleNumberHeader.class);
  }
  
  public VinHeader getVinHeader() {
    return getOrCreateProperty("VinHeader", "VinHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.PolicyRefreshExistingVehicleRULV.VinHeader.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.PolicyRefreshExistingVehicleRULV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.PolicyRefreshExistingVehicleRULV._ListPaging.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshExistingVehicleRULV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ColorHeader extends ValueElement {
    public ColorHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshExistingVehicleRULV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LicencePlateHeader extends ValueElement {
    public LicencePlateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshExistingVehicleRULV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MakeHeader extends ValueElement {
    public MakeHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshExistingVehicleRULV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ModelHeader extends ValueElement {
    public ModelHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshExistingVehicleRULV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PresentHeader extends ValueElement {
    public PresentHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshExistingVehicleRULV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StateHeader extends ValueElement {
    public StateHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshExistingVehicleRULV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VehicleNumberHeader extends ValueElement {
    public VehicleNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshExistingVehicleRULV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class VinHeader extends ValueElement {
    public VinHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshExistingVehicleRULV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshExistingVehicleRULV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getColor() {
      return getOrCreateProperty("Color", "Color", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getLicencePlate() {
      return getOrCreateProperty("LicencePlate", "LicencePlate", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMake() {
      return getOrCreateProperty("Make", "Make", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getModel() {
      return getOrCreateProperty("Model", "Model", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPresent() {
      return getOrCreateProperty("Present", "Present", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public State getState() {
      return getOrCreateProperty("State", "State", null, pcftest.PolicyRefreshExistingVehicleRULV.entry.State.class);
    }
    
    public ValueElement getVehicleNumber() {
      return getOrCreateProperty("VehicleNumber", "VehicleNumber", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getVin() {
      return getOrCreateProperty("Vin", "Vin", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public _Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.PolicyRefreshExistingVehicleRULV.entry._Select.class);
    }
    
    public _ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.PolicyRefreshExistingVehicleRULV.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshExistingVehicleRULV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshExistingVehicleRULV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/policy/refresh/PolicyRefreshExistingVehicleRULV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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