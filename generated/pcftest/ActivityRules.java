package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ActivityRules.ActivityRules_UpLink;
import pcftest.ActivityRules._Paging;
import pcftest.ActivityRules.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ActivityRules/ActivityRules.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityRules extends PCFLocation {
  public final static String CHECKSUM = "c556685463e4d57effec2d833d5cc423";
  
  public ActivityRules(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ActivityRules"));
  }
  
  public ActivityRules_UpLink getActivityRules_UpLink() {
    return getOrCreateProperty("ActivityRules_UpLink", "ActivityRules_UpLink", null, pcftest.ActivityRules.ActivityRules_UpLink.class);
  }
  
  public CCRulesListScreen getCCRulesListScreen() {
    return getOrCreateProperty("CCRulesListScreen", "CCRulesListScreen", null, pcftest.CCRulesListScreen.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ActivityRules._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ActivityRules.__crumb__.class);
  }
  
  public BusinessRules get_parent() {
    return getOrCreateProperty("_parent", pcftest.BusinessRules.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ActivityRules/ActivityRules.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityRules_UpLink extends ClickableActionElement {
    public ActivityRules_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ActivityRules/ActivityRules.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ActivityRules/ActivityRules.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}