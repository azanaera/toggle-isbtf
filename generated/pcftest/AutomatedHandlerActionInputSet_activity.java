package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BasePickerValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.AutomatedHandlerActionInputSet_activity.AutomatedHandlerEmailTemplateOverride;
import pcftest.AutomatedHandlerActionInputSet_activity.AutomatedHandlerEmailTemplateOverride.SelectAutomatedHandlerEmailTemplateOverride;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedHandlerActionInputSet.activity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class AutomatedHandlerActionInputSet_activity extends AutomatedHandlerActionInputSet {
  public final static String CHECKSUM = "4e7e58b1e1a2d8a001cf1ac719e2b9b9";
  
  public AutomatedHandlerActionInputSet_activity(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public SelectElement getAutomatedHandlerActivityPattern() {
    return getOrCreateProperty("AutomatedHandlerActivityPattern", "AutomatedHandlerActivityPattern", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getAutomatedHandlerDefaultEmailTemplate() {
    return getOrCreateProperty("AutomatedHandlerDefaultEmailTemplate", "AutomatedHandlerDefaultEmailTemplate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public AutomatedHandlerEmailTemplateOverride getAutomatedHandlerEmailTemplateOverride() {
    return getOrCreateProperty("AutomatedHandlerEmailTemplateOverride", "AutomatedHandlerEmailTemplateOverride", null, pcftest.AutomatedHandlerActionInputSet_activity.AutomatedHandlerEmailTemplateOverride.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedHandlerActionInputSet.activity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AutomatedHandlerEmailTemplateOverride extends BasePickerValueElement {
    public AutomatedHandlerEmailTemplateOverride(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public SelectAutomatedHandlerEmailTemplateOverride getSelectAutomatedHandlerEmailTemplateOverride() {
      return getOrCreateProperty("SelectAutomatedHandlerEmailTemplateOverride", "SelectAutomatedHandlerEmailTemplateOverride", null, pcftest.AutomatedHandlerActionInputSet_activity.AutomatedHandlerEmailTemplateOverride.SelectAutomatedHandlerEmailTemplateOverride.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/admin/specialhandling/AutomatedHandlerActionInputSet.activity.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class SelectAutomatedHandlerEmailTemplateOverride extends ClickableActionElement {
      public SelectAutomatedHandlerEmailTemplateOverride(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PickEmailTemplatePopup click() {
        return clickThis(pcftest.PickEmailTemplatePopup.class);
      }
      
      
    }
    
    
  }
  
  
}