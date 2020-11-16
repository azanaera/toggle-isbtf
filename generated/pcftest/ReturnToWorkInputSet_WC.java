package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/ReturnToWorkInputSet.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ReturnToWorkInputSet_WC extends ReturnToWorkInputSet {
  public final static String CHECKSUM = "46f848df02c1b4ef794dc6492e2a482d";
  
  public ReturnToWorkInputSet_WC(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getRTModWReadOnlyMSG() {
    return getOrCreateProperty("RTModWReadOnlyMSG", "RTModWReadOnlyMSG", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getRTWReadOnlyMSG() {
    return getOrCreateProperty("RTWReadOnlyMSG", "RTWReadOnlyMSG", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getReturnToModWorkActual() {
    return getOrCreateProperty("ReturnToModWorkActual", "ReturnToModWorkActual", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public DateElement getReturnToModWorkDate() {
    return getOrCreateProperty("ReturnToModWorkDate", "ReturnToModWorkDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public BooleanValueElement getReturnToModWorkValid() {
    return getOrCreateProperty("ReturnToModWorkValid", "ReturnToModWorkValid", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getReturnToWorkActual() {
    return getOrCreateProperty("ReturnToWorkActual", "ReturnToWorkActual", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public DateElement getReturnToWorkDate() {
    return getOrCreateProperty("ReturnToWorkDate", "ReturnToWorkDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public BooleanValueElement getReturnToWorkValid() {
    return getOrCreateProperty("ReturnToWorkValid", "ReturnToWorkValid", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  
}