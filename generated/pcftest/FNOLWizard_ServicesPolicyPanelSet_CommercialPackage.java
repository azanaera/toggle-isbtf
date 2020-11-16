package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_ServicesPolicyPanelSet.CommercialPackage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_ServicesPolicyPanelSet_CommercialPackage extends FNOLWizard_ServicesPolicyPanelSet {
  public final static String CHECKSUM = "f48a3d3f3ab6b65356aff1585dc6857f";
  
  public FNOLWizard_ServicesPolicyPanelSet_CommercialPackage(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public OtherServicesLVInputGroupInputSet getOtherServicesLVInputGroupInputSet() {
    return getOrCreateProperty("OtherServicesLVInputGroupInputSet", "OtherServicesLVInputGroupInputSet", null, pcftest.OtherServicesLVInputGroupInputSet.class);
  }
  
  
}