package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ActivityRuleDetail.ActivityRuleDetail_UpLink;
import pcftest.ActivityRuleDetail._Paging;
import pcftest.ActivityRuleDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ActivityRules/ActivityRuleDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ActivityRuleDetail extends PCFLocation {
  public final static String CHECKSUM = "8b05182e46c9b807e080f643f16f3e3e";
  
  public ActivityRuleDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ActivityRuleDetail"));
  }
  
  public ActivityRuleDetail_UpLink getActivityRuleDetail_UpLink() {
    return getOrCreateProperty("ActivityRuleDetail_UpLink", "ActivityRuleDetail_UpLink", null, pcftest.ActivityRuleDetail.ActivityRuleDetail_UpLink.class);
  }
  
  public RuleDetailScreen getRuleDetailScreen() {
    return getOrCreateProperty("RuleDetailScreen", "RuleDetailScreen", null, pcftest.RuleDetailScreen.class);
  }
  
  public RuleExecutionInfoBar_default getRuleExecutionInfoBar_default() {
    return getOrCreateProperty("RuleExecutionInfoBar_default", "RuleExecutionInfoBar", null, pcftest.RuleExecutionInfoBar_default.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ActivityRuleDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ActivityRuleDetail.__crumb__.class);
  }
  
  public ActivityRules get_parent() {
    return getOrCreateProperty("_parent", pcftest.ActivityRules.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ActivityRules/ActivityRuleDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ActivityRuleDetail_UpLink extends ClickableActionElement {
    public ActivityRuleDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ActivityRules/ActivityRuleDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ActivityRules/ActivityRuleDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}