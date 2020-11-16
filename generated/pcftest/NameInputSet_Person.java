package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/addressbook/NameInputSet.Person.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NameInputSet_Person extends NameInputSet {
  public final static String CHECKSUM = "f85fac75d994348ce1106909dbd8b69c";
  
  public NameInputSet_Person(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public GlobalPersonNameInputSet_Japan getGlobalPersonNameInputSet_Japan() {
    return getOrCreateProperty("GlobalPersonNameInputSet_Japan", "GlobalPersonNameInputSet", null, pcftest.GlobalPersonNameInputSet_Japan.class);
  }
  
  public GlobalPersonNameInputSet_default getGlobalPersonNameInputSet_default() {
    return getOrCreateProperty("GlobalPersonNameInputSet_default", "GlobalPersonNameInputSet", null, pcftest.GlobalPersonNameInputSet_default.class);
  }
  
  
}