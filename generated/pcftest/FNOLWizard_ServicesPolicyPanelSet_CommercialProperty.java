package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_ServicesPolicyPanelSet.CommercialProperty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_ServicesPolicyPanelSet_CommercialProperty extends FNOLWizard_ServicesPolicyPanelSet {
  public final static String CHECKSUM = "82a4beab05ccc77362993faa7133c561";
  
  public FNOLWizard_ServicesPolicyPanelSet_CommercialProperty(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public OtherServicesLVInputGroupInputSet getOtherServicesLVInputGroupInputSet() {
    return getOrCreateProperty("OtherServicesLVInputGroupInputSet", "OtherServicesLVInputGroupInputSet", null, pcftest.OtherServicesLVInputGroupInputSet.class);
  }
  
  
}