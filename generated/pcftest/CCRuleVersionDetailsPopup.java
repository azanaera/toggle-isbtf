package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CCRuleVersionDetailsPopup.CCRuleVersionDetailsPopup_UpLink;
import pcftest.CCRuleVersionDetailsPopup._Paging;
import pcftest.CCRuleVersionDetailsPopup.__crumb__;
import pcftest.CCRuleVersionDetailsPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/CCRuleVersionDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CCRuleVersionDetailsPopup extends PCFLocation {
  public final static String CHECKSUM = "1ea282e6f67288b961d642fd8a855c5d";
  
  public CCRuleVersionDetailsPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CCRuleVersionDetailsPopup"));
  }
  
  public CCRuleVersionDetailsPopup_UpLink getCCRuleVersionDetailsPopup_UpLink() {
    return getOrCreateProperty("CCRuleVersionDetailsPopup_UpLink", "CCRuleVersionDetailsPopup_UpLink", null, pcftest.CCRuleVersionDetailsPopup.CCRuleVersionDetailsPopup_UpLink.class);
  }
  
  public RuleDetailPanelSet_default getRuleDetailPanelSet_default() {
    return getOrCreateProperty("RuleDetailPanelSet_default", "RuleDetailPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.RuleDetailPanelSet_default.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CCRuleVersionDetailsPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CCRuleVersionDetailsPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CCRuleVersionDetailsPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleVersionDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CCRuleVersionDetailsPopup_UpLink extends ClickableActionElement {
    public CCRuleVersionDetailsPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleVersionDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleVersionDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleVersionDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}