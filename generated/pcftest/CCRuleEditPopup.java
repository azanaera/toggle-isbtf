package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CCRuleEditPopup.CCRuleEditPopup_UpLink;
import pcftest.CCRuleEditPopup._Paging;
import pcftest.CCRuleEditPopup.__crumb__;
import pcftest.CCRuleEditPopup._msgs;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/CCRuleEditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CCRuleEditPopup extends PCFLocation {
  public final static String CHECKSUM = "023a9fcd1ddc23eb5b7102ccf7a60042";
  
  public CCRuleEditPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CCRuleEditPopup"));
  }
  
  public CCRuleEditPopup_UpLink getCCRuleEditPopup_UpLink() {
    return getOrCreateProperty("CCRuleEditPopup_UpLink", "CCRuleEditPopup_UpLink", null, pcftest.CCRuleEditPopup.CCRuleEditPopup_UpLink.class);
  }
  
  public ConditionValidationToolbarButtonSet getConditionValidationToolbarButtonSet() {
    return getOrCreateProperty("ConditionValidationToolbarButtonSet", "ConditionValidationToolbarButtonSet", null, pcftest.ConditionValidationToolbarButtonSet.class);
  }
  
  public RuleDetailPanelSet_default getRuleDetailPanelSet_default() {
    return getOrCreateProperty("RuleDetailPanelSet_default", "RuleDetailPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.RuleDetailPanelSet_default.class);
  }
  
  public RuleEditPopupToolbarButtonSet getRuleEditPopupToolbarButtonSet() {
    return getOrCreateProperty("RuleEditPopupToolbarButtonSet", "RuleEditPopupToolbarButtonSet", null, pcftest.RuleEditPopupToolbarButtonSet.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CCRuleEditPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CCRuleEditPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CCRuleEditPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleEditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CCRuleEditPopup_UpLink extends ClickableActionElement {
    public CCRuleEditPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleEditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleEditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleEditPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}