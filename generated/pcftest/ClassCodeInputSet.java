package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/policy/ClassCodeInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClassCodeInputSet extends PCFElement {
  public final static String CHECKSUM = "014d5d1e509ee4c429334311cad80396";
  
  public ClassCodeInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getCode() {
    return getOrCreateProperty("Code", "Code", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getComments() {
    return getOrCreateProperty("Comments", "Comments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}