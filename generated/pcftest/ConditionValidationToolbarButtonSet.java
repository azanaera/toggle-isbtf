package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ConditionValidationToolbarButtonSet.HideValidation;
import pcftest.ConditionValidationToolbarButtonSet.ShowValidation;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ConditionValidationToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ConditionValidationToolbarButtonSet extends PCFElement {
  public final static String CHECKSUM = "9aa874bc55ef6e257b9e72439d6be34a";
  
  public ConditionValidationToolbarButtonSet(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public HideValidation getHideValidation() {
    return getOrCreateProperty("HideValidation", "HideValidation", null, pcftest.ConditionValidationToolbarButtonSet.HideValidation.class);
  }
  
  public ShowValidation getShowValidation() {
    return getOrCreateProperty("ShowValidation", "ShowValidation", null, pcftest.ConditionValidationToolbarButtonSet.ShowValidation.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ConditionValidationToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class HideValidation extends ClickableActionElement {
    public HideValidation(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ConditionValidationToolbarButtonSet.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ShowValidation extends ClickableActionElement {
    public ShowValidation(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}