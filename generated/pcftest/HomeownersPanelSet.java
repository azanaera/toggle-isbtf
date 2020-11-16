package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/HomeownersPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class HomeownersPanelSet extends PCFElement {
  public final static String CHECKSUM = "7321f3162c1f66d1694e273157e6d3e3";
  
  public HomeownersPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public HomeownersEmergencyDebrisRemovalDV getHomeownersEmergencyDebrisRemovalDV() {
    return getOrCreateProperty("HomeownersEmergencyDebrisRemovalDV", "HomeownersEmergencyDebrisRemovalDV", null, pcftest.HomeownersEmergencyDebrisRemovalDV.class);
  }
  
  public HomeownersEmergencyMakeSafeDV getHomeownersEmergencyMakeSafeDV() {
    return getOrCreateProperty("HomeownersEmergencyMakeSafeDV", "HomeownersEmergencyMakeSafeDV", null, pcftest.HomeownersEmergencyMakeSafeDV.class);
  }
  
  public OtherServicesLVInputGroupInputSet getOtherServicesLVInputGroupInputSet() {
    return getOrCreateProperty("OtherServicesLVInputGroupInputSet", "OtherServicesLVInputGroupInputSet", null, pcftest.OtherServicesLVInputGroupInputSet.class);
  }
  
  
}