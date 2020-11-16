package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/FireDamageQuestionsPanelSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FireDamageQuestionsPanelSet extends PCFElement {
  public final static String CHECKSUM = "6d404f58d88926fe43680ae0971b8096";
  
  public FireDamageQuestionsPanelSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BooleanValueElement getArsonInvolved() {
    return getOrCreateProperty("ArsonInvolved", "ArsonInvolved", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getFireDeptResponded() {
    return getOrCreateProperty("FireDeptResponded", "FireDeptResponded", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getFireSource() {
    return getOrCreateProperty("FireSource", "FireSource", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getHowWasFireDiscovered() {
    return getOrCreateProperty("HowWasFireDiscovered", "HowWasFireDiscovered", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getIsAnyoneInjured() {
    return getOrCreateProperty("IsAnyoneInjured", "IsAnyoneInjured", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getIsHomeHabitable() {
    return getOrCreateProperty("IsHomeHabitable", "IsHomeHabitable", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getIsHomeSecure() {
    return getOrCreateProperty("IsHomeSecure", "IsHomeSecure", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getSmokeDamageOnly() {
    return getOrCreateProperty("SmokeDamageOnly", "SmokeDamageOnly", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  
}