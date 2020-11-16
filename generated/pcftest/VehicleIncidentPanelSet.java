package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/VehicleIncidentPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class VehicleIncidentPanelSet extends PCFElement {
  public final static String CHECKSUM = "a44bebf692e2aace33a3d9336259069d";
  
  public VehicleIncidentPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AppraisalServiceDV getAppraisalServiceDV() {
    return getOrCreateProperty("AppraisalServiceDV", "AppraisalServiceDV", null, pcftest.AppraisalServiceDV.class);
  }
  
  public OtherServicesLVInputGroupInputSet getOtherServicesLVInputGroupInputSet() {
    return getOrCreateProperty("OtherServicesLVInputGroupInputSet", "OtherServicesLVInputGroupInputSet", null, pcftest.OtherServicesLVInputGroupInputSet.class);
  }
  
  public RentalServiceDV getRentalServiceDV() {
    return getOrCreateProperty("RentalServiceDV", "RentalServiceDV", null, pcftest.RentalServiceDV.class);
  }
  
  public VehicleIncidentAutoBodyDV getVehicleIncidentAutoBodyDV() {
    return getOrCreateProperty("VehicleIncidentAutoBodyDV", "VehicleIncidentAutoBodyDV", null, pcftest.VehicleIncidentAutoBodyDV.class);
  }
  
  public VehicleIncidentTowingDV getVehicleIncidentTowingDV() {
    return getOrCreateProperty("VehicleIncidentTowingDV", "VehicleIncidentTowingDV", null, pcftest.VehicleIncidentTowingDV.class);
  }
  
  
}