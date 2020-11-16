package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/name/GlobalPersonNameInputSet.Japan.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GlobalPersonNameInputSet_Japan extends GlobalPersonNameInputSet {
  public final static String CHECKSUM = "3cc6900e4ea4a013493c727fcc2632b6";
  
  public GlobalPersonNameInputSet_Japan(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getFirstName() {
    return getOrCreateProperty("FirstName", "FirstName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getFirstNameKanji() {
    return getOrCreateProperty("FirstNameKanji", "FirstNameKanji", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLastName() {
    return getOrCreateProperty("LastName", "LastName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLastNameKanji() {
    return getOrCreateProperty("LastNameKanji", "LastNameKanji", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNameSummary() {
    return getOrCreateProperty("NameSummary", "NameSummary", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}