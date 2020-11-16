package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/name/GlobalContactNameInputSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class GlobalContactNameInputSet_default extends GlobalContactNameInputSet {
  public final static String CHECKSUM = "df30666653378a60c585dc0fe82f4556";
  
  public GlobalContactNameInputSet_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getName() {
    return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}