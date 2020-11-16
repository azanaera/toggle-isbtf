package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/securityzones/SecurityZoneDetailDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class SecurityZoneDetailDV extends DetailViewElement {
  public final static String CHECKSUM = "bb363fe1975ed724f70c0c7a11b1a8db";
  
  public SecurityZoneDetailDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getName() {
    return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  
}