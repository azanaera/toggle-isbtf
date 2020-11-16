package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/AvailableToRunInputSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AvailableToRunInputSet extends PCFElement {
  public final static String CHECKSUM = "355d93556b48a4382dbf1ba42111f066";
  
  public AvailableToRunInputSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getNote() {
    return getOrCreateProperty("Note", "Note", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getValue() {
    return getOrCreateProperty("Value", "Value", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  
}