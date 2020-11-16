package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/CommandDefinitionDV.createexposure.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CommandDefinitionDV_createexposure extends CommandDefinitionDV {
  public final static String CHECKSUM = "15a8f6d2ac1a56ceab61c3318dd781dc";
  
  public CommandDefinitionDV_createexposure(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SelectElement getCoverageSubtype() {
    return getOrCreateProperty("CoverageSubtype", "CoverageSubtype", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public SelectElement getCoverageType() {
    return getOrCreateProperty("CoverageType", "CoverageType", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  
}