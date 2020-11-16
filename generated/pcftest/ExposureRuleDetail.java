package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ExposureRuleDetail.ExposureRuleDetail_UpLink;
import pcftest.ExposureRuleDetail._Paging;
import pcftest.ExposureRuleDetail.__crumb__;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/ExposureRules/ExposureRuleDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ExposureRuleDetail extends PCFLocation {
  public final static String CHECKSUM = "698cefaad69b0575e4cd55aecb74f0d2";
  
  public ExposureRuleDetail(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("ExposureRuleDetail"));
  }
  
  public ExposureRuleDetail_UpLink getExposureRuleDetail_UpLink() {
    return getOrCreateProperty("ExposureRuleDetail_UpLink", "ExposureRuleDetail_UpLink", null, pcftest.ExposureRuleDetail.ExposureRuleDetail_UpLink.class);
  }
  
  public RuleDetailScreen getRuleDetailScreen() {
    return getOrCreateProperty("RuleDetailScreen", "RuleDetailScreen", null, pcftest.RuleDetailScreen.class);
  }
  
  public RuleExecutionInfoBar_default getRuleExecutionInfoBar_default() {
    return getOrCreateProperty("RuleExecutionInfoBar_default", "RuleExecutionInfoBar", null, pcftest.RuleExecutionInfoBar_default.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.ExposureRuleDetail._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.ExposureRuleDetail.__crumb__.class);
  }
  
  public ExposureRules get_parent() {
    return getOrCreateProperty("_parent", pcftest.ExposureRules.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ExposureRules/ExposureRuleDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureRuleDetail_UpLink extends ClickableActionElement {
    public ExposureRuleDetail_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ExposureRules/ExposureRuleDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/ExposureRules/ExposureRuleDetail.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}