package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ConditionEnabledDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ConditionEnabledDV extends DetailViewElement {
  public final static String CHECKSUM = "2570c2cfcda473b270879fab01ff1996";
  
  public ConditionEnabledDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BooleanValueElement getIsConditionDisabled() {
    return getOrCreateProperty("IsConditionDisabled", "IsConditionDisabled", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  
}