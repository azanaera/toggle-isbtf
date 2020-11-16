package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.VehIncidentDetailDV.Incident_AssessmentTab;
import pcftest.VehIncidentDetailDV.Vehicle_DetailsCardTab;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/assessment/VehIncidentDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class VehIncidentDetailDV extends PCFElement {
  public final static String CHECKSUM = "c99b273b9b632ac903f360a7747e29b8";
  
  public VehIncidentDetailDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public Incident_AssessmentTab getIncident_AssessmentTab() {
    return getOrCreateProperty("Incident_AssessmentTab", "Incident_AssessmentTab", null, pcftest.VehIncidentDetailDV.Incident_AssessmentTab.class);
  }
  
  public VehIncidentAssessDV getVehIncidentAssessDV() {
    return getOrCreateProperty("VehIncidentAssessDV", "VehIncidentAssessDV", null, pcftest.VehIncidentAssessDV.class);
  }
  
  public VehicleIncidentDV getVehicleIncidentDV() {
    return getOrCreateProperty("VehicleIncidentDV", "VehicleIncidentDV", null, pcftest.VehicleIncidentDV.class);
  }
  
  public Vehicle_DetailsCardTab getVehicle_DetailsCardTab() {
    return getOrCreateProperty("Vehicle_DetailsCardTab", "Vehicle_DetailsCardTab", null, pcftest.VehIncidentDetailDV.Vehicle_DetailsCardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/VehIncidentDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Incident_AssessmentTab extends ClickableActionElement {
    public Incident_AssessmentTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/assessment/VehIncidentDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Vehicle_DetailsCardTab extends ClickableActionElement {
    public Vehicle_DetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}