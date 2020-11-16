package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/name/GlobalContactNameInputSet.Japan.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GlobalContactNameInputSet_Japan extends GlobalContactNameInputSet {
  public final static String CHECKSUM = "741f842b3fbc373fef11b115db31abdb";
  
  public GlobalContactNameInputSet_Japan(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getName() {
    return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNameKanji() {
    return getOrCreateProperty("NameKanji", "NameKanji", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNameSummary() {
    return getOrCreateProperty("NameSummary", "NameSummary", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}