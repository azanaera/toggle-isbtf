package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ReserveRuleDetail.ReserveRuleDetail_UpLink;
import pcftest.ReserveRuleDetail._Paging;
import pcftest.ReserveRuleDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ReserveRules/ReserveRuleDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ReserveRuleDetail extends PCFLocation {
  public final static String CHECKSUM = "6ecc20da18c690c8046caae50a47e6d4";
  
  public ReserveRuleDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ReserveRuleDetail"));
  }
  
  public ReserveRuleDetail_UpLink getReserveRuleDetail_UpLink() {
    return getOrCreateProperty("ReserveRuleDetail_UpLink", "ReserveRuleDetail_UpLink", null, pcftest.ReserveRuleDetail.ReserveRuleDetail_UpLink.class);
  }
  
  public RuleDetailScreen getRuleDetailScreen() {
    return getOrCreateProperty("RuleDetailScreen", "RuleDetailScreen", null, pcftest.RuleDetailScreen.class);
  }
  
  public RuleExecutionInfoBar_default getRuleExecutionInfoBar_default() {
    return getOrCreateProperty("RuleExecutionInfoBar_default", "RuleExecutionInfoBar", null, pcftest.RuleExecutionInfoBar_default.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ReserveRuleDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ReserveRuleDetail.__crumb__.class);
  }
  
  public ReserveRules get_parent() {
    return getOrCreateProperty("_parent", pcftest.ReserveRules.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ReserveRules/ReserveRuleDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReserveRuleDetail_UpLink extends ClickableActionElement {
    public ReserveRuleDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ReserveRules/ReserveRuleDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ReserveRules/ReserveRuleDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}