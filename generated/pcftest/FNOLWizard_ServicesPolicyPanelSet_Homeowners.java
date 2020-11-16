package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_ServicesPolicyPanelSet.Homeowners.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_ServicesPolicyPanelSet_Homeowners extends FNOLWizard_ServicesPolicyPanelSet {
  public final static String CHECKSUM = "544f956f8c5176d37926e677ea988f14";
  
  public FNOLWizard_ServicesPolicyPanelSet_Homeowners(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public HomeownersPanelSet getHomeownersPanelSet() {
    return getOrCreateProperty("HomeownersPanelSet", "HomeownersPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.HomeownersPanelSet.class);
  }
  
  
}