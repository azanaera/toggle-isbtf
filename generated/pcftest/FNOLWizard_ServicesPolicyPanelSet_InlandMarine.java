package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_ServicesPolicyPanelSet.InlandMarine.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_ServicesPolicyPanelSet_InlandMarine extends FNOLWizard_ServicesPolicyPanelSet {
  public final static String CHECKSUM = "204c0c3e3b911f0e7dd35645d007d8cc";
  
  public FNOLWizard_ServicesPolicyPanelSet_InlandMarine(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public OtherServicesLVInputGroupInputSet getOtherServicesLVInputGroupInputSet() {
    return getOrCreateProperty("OtherServicesLVInputGroupInputSet", "OtherServicesLVInputGroupInputSet", null, pcftest.OtherServicesLVInputGroupInputSet.class);
  }
  
  
}