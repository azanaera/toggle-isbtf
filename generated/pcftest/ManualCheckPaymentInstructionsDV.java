package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/newtransaction/manualcheck/ManualCheckPaymentInstructionsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ManualCheckPaymentInstructionsDV extends DetailViewElement {
  public final static String CHECKSUM = "5802a51c06409bec3e5cba55e003da4f";
  
  public ManualCheckPaymentInstructionsDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CheckWizardCheckSummaryInputSet getCheckWizardCheckSummaryInputSet() {
    return getOrCreateProperty("CheckWizardCheckSummaryInputSet", "CheckWizardCheckSummaryInputSet", null, pcftest.CheckWizardCheckSummaryInputSet.class);
  }
  
  
}