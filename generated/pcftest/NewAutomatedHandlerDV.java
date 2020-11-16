package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/specialhandling/NewAutomatedHandlerDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class NewAutomatedHandlerDV extends DetailViewElement {
  public final static String CHECKSUM = "2e5baa8f9674519ec4aa34db586a2202";
  
  public NewAutomatedHandlerDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AutomatedHandlerActionInputSet_activity getAutomatedHandlerActionInputSet_activity() {
    return getOrCreateProperty("AutomatedHandlerActionInputSet_activity", "AutomatedHandlerActionInputSet", null, pcftest.AutomatedHandlerActionInputSet_activity.class);
  }
  
  public AutomatedHandlerActionInputSet_notification getAutomatedHandlerActionInputSet_notification() {
    return getOrCreateProperty("AutomatedHandlerActionInputSet_notification", "AutomatedHandlerActionInputSet", null, pcftest.AutomatedHandlerActionInputSet_notification.class);
  }
  
  public AutomatedHandlerBaseInputSet getAutomatedHandlerBaseInputSet() {
    return getOrCreateProperty("AutomatedHandlerBaseInputSet", "AutomatedHandlerBaseInputSet", null, pcftest.AutomatedHandlerBaseInputSet.class);
  }
  
  public AutomatedHandlerTriggerInputSet_claimindicatortrigger getAutomatedHandlerTriggerInputSet_claimindicatortrigger() {
    return getOrCreateProperty("AutomatedHandlerTriggerInputSet_claimindicatortrigger", "AutomatedHandlerTriggerInputSet", null, pcftest.AutomatedHandlerTriggerInputSet_claimindicatortrigger.class);
  }
  
  public AutomatedHandlerTriggerInputSet_financialthresholdtrigger getAutomatedHandlerTriggerInputSet_financialthresholdtrigger() {
    return getOrCreateProperty("AutomatedHandlerTriggerInputSet_financialthresholdtrigger", "AutomatedHandlerTriggerInputSet", null, pcftest.AutomatedHandlerTriggerInputSet_financialthresholdtrigger.class);
  }
  
  
}