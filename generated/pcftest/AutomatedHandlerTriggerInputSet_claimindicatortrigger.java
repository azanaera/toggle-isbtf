package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedHandlerTriggerInputSet.claimindicatortrigger.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AutomatedHandlerTriggerInputSet_claimindicatortrigger extends AutomatedHandlerTriggerInputSet {
  public final static String CHECKSUM = "052effcf6b6027a061238072846f283a";
  
  public AutomatedHandlerTriggerInputSet_claimindicatortrigger(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SelectElement getAutomatedHandlerClaimIndicator() {
    return getOrCreateProperty("AutomatedHandlerClaimIndicator", "AutomatedHandlerClaimIndicator", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public BooleanValueElement getAutomatedHandlerClaimIndicatorTriggeringValue() {
    return getOrCreateProperty("AutomatedHandlerClaimIndicatorTriggeringValue", "AutomatedHandlerClaimIndicatorTriggeringValue", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  
}