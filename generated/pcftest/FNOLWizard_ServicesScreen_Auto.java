package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.IteratorEntries;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLWizard_ServicesScreen_Auto._msgs;
import pcftest.FNOLWizard_ServicesScreen_Auto.entry;
import pcftest.FNOLWizard_ServicesScreen_Auto.entry.VehicleName;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_ServicesScreen.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_ServicesScreen_Auto extends FNOLWizard_ServicesScreen {
  public final static String CHECKSUM = "9e71fe12d22ffbfe0a9aa0bf249d2d64";
  
  public FNOLWizard_ServicesScreen_Auto(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public OtherServicesLVInputGroupInputSet getOtherServicesLVInputGroupInputSet() {
    return getOrCreateProperty("OtherServicesLVInputGroupInputSet", "OtherServicesLVInputGroupInputSet", null, pcftest.OtherServicesLVInputGroupInputSet.class);
  }
  
  public ValueElement getServiceRequestSubmitMessage() {
    return getOrCreateProperty("ServiceRequestSubmitMessage", "ServiceRequestSubmitMessage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntries<entry> get_Entries() {
    return getOrCreateEntries(null, pcftest.FNOLWizard_ServicesScreen_Auto.entry.class, gw.smoketest.platform.web.IteratorEntries.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FNOLWizard_ServicesScreen_Auto._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_ServicesScreen.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_ServicesScreen.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends PCFElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getVehicleIncidentDetail() {
      return getOrCreateProperty("VehicleIncidentDetail", "VehicleIncidentDetail", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public VehicleIncidentPanelSet getVehicleIncidentPanelSet() {
      return getOrCreateProperty("VehicleIncidentPanelSet", "VehicleIncidentPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.VehicleIncidentPanelSet.class);
    }
    
    public VehicleName getVehicleName() {
      return getOrCreateProperty("VehicleName", "VehicleName", null, pcftest.FNOLWizard_ServicesScreen_Auto.entry.VehicleName.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_ServicesScreen.Auto.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class VehicleName extends ValueElement {
      public VehicleName(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  
}