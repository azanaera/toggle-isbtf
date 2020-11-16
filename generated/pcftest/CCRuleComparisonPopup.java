package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CCRuleComparisonPopup.AvailableToRunRow;
import pcftest.CCRuleComparisonPopup.CCRuleComparisonPopup_UpLink;
import pcftest.CCRuleComparisonPopup.ComparisonHeadings;
import pcftest.CCRuleComparisonPopup.ContextRow;
import pcftest.CCRuleComparisonPopup.DescriptionRow;
import pcftest.CCRuleComparisonPopup.NameRow;
import pcftest.CCRuleComparisonPopup.RuleActions;
import pcftest.CCRuleComparisonPopup.RuleApplicabilityCriteria;
import pcftest.CCRuleComparisonPopup.RuleCondition;
import pcftest.CCRuleComparisonPopup.RuleDetailsSectionLabel;
import pcftest.CCRuleComparisonPopup.RuleVariables;
import pcftest.CCRuleComparisonPopup.TriggerRow;
import pcftest.CCRuleComparisonPopup._Paging;
import pcftest.CCRuleComparisonPopup.__crumb__;
import pcftest.CCRuleComparisonPopup._msgs;
import pcftest.CCRuleComparisonPopup.draftAlert;
import pcftest.CCRuleComparisonPopup.draftAlert.CloseBtn;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/CCRuleComparisonPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CCRuleComparisonPopup extends PCFLocation {
  public final static String CHECKSUM = "9df8aee2b7bda09b9928ec5129d0df7d";
  
  public CCRuleComparisonPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("CCRuleComparisonPopup"));
  }
  
  public AvailableToRunRow getAvailableToRunRow() {
    return getOrCreateProperty("AvailableToRunRow", "AvailableToRunRow", null, pcftest.CCRuleComparisonPopup.AvailableToRunRow.class);
  }
  
  public CCRuleComparisonPopup_UpLink getCCRuleComparisonPopup_UpLink() {
    return getOrCreateProperty("CCRuleComparisonPopup_UpLink", "CCRuleComparisonPopup_UpLink", null, pcftest.CCRuleComparisonPopup.CCRuleComparisonPopup_UpLink.class);
  }
  
  public ComparisonHeadings getComparisonHeadings() {
    return getOrCreateProperty("ComparisonHeadings", "ComparisonHeadings", null, pcftest.CCRuleComparisonPopup.ComparisonHeadings.class);
  }
  
  public ContextRow getContextRow() {
    return getOrCreateProperty("ContextRow", "ContextRow", null, pcftest.CCRuleComparisonPopup.ContextRow.class);
  }
  
  public DescriptionRow getDescriptionRow() {
    return getOrCreateProperty("DescriptionRow", "DescriptionRow", null, pcftest.CCRuleComparisonPopup.DescriptionRow.class);
  }
  
  public NameRow getNameRow() {
    return getOrCreateProperty("NameRow", "NameRow", null, pcftest.CCRuleComparisonPopup.NameRow.class);
  }
  
  public RuleActions getRuleActions() {
    return getOrCreateProperty("RuleActions", "RuleActions", null, pcftest.CCRuleComparisonPopup.RuleActions.class);
  }
  
  public RuleApplicabilityCriteria getRuleApplicabilityCriteria() {
    return getOrCreateProperty("RuleApplicabilityCriteria", "RuleApplicabilityCriteria", null, pcftest.CCRuleComparisonPopup.RuleApplicabilityCriteria.class);
  }
  
  public RuleComparisonToolbarButtonSet getRuleComparisonToolbarButtonSet() {
    return getOrCreateProperty("RuleComparisonToolbarButtonSet", "RuleComparisonToolbarButtonSet", null, pcftest.RuleComparisonToolbarButtonSet.class);
  }
  
  public RuleCondition getRuleCondition() {
    return getOrCreateProperty("RuleCondition", "RuleCondition", null, pcftest.CCRuleComparisonPopup.RuleCondition.class);
  }
  
  public RuleDetailsSectionLabel getRuleDetailsSectionLabel() {
    return getOrCreateProperty("RuleDetailsSectionLabel", "RuleDetailsSectionLabel", null, pcftest.CCRuleComparisonPopup.RuleDetailsSectionLabel.class);
  }
  
  public RuleVariables getRuleVariables() {
    return getOrCreateProperty("RuleVariables", "RuleVariables", null, pcftest.CCRuleComparisonPopup.RuleVariables.class);
  }
  
  public TriggerRow getTriggerRow() {
    return getOrCreateProperty("TriggerRow", "TriggerRow", null, pcftest.CCRuleComparisonPopup.TriggerRow.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.CCRuleComparisonPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.CCRuleComparisonPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CCRuleComparisonPopup._msgs.class);
  }
  
  public draftAlert getdraftAlert() {
    return getOrCreateProperty("draftAlert", "draftAlert", null, pcftest.CCRuleComparisonPopup.draftAlert.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleComparisonPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AvailableToRunRow extends PCFElement {
    public AvailableToRunRow(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowBooleanInputSet getRuleComparisonRowBooleanInputSet() {
      return getOrCreateProperty("RuleComparisonRowBooleanInputSet", "RuleComparisonRowBooleanInputSet", null, pcftest.RuleComparisonRowBooleanInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleComparisonPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CCRuleComparisonPopup_UpLink extends ClickableActionElement {
    public CCRuleComparisonPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleComparisonPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ComparisonHeadings extends PCFElement {
    public ComparisonHeadings(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonColumnHeadingsInputSet getRuleComparisonColumnHeadingsInputSet() {
      return getOrCreateProperty("RuleComparisonColumnHeadingsInputSet", "RuleComparisonColumnHeadingsInputSet", null, pcftest.RuleComparisonColumnHeadingsInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleComparisonPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ContextRow extends PCFElement {
    public ContextRow(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowTypeKeyInputSet getRuleComparisonRowTypeKeyInputSet() {
      return getOrCreateProperty("RuleComparisonRowTypeKeyInputSet", "RuleComparisonRowTypeKeyInputSet", null, pcftest.RuleComparisonRowTypeKeyInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleComparisonPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DescriptionRow extends PCFElement {
    public DescriptionRow(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowTextAreaInputSet getRuleComparisonRowTextAreaInputSet() {
      return getOrCreateProperty("RuleComparisonRowTextAreaInputSet", "RuleComparisonRowTextAreaInputSet", null, pcftest.RuleComparisonRowTextAreaInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleComparisonPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NameRow extends PCFElement {
    public NameRow(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowStringInputSet getRuleComparisonRowStringInputSet() {
      return getOrCreateProperty("RuleComparisonRowStringInputSet", "RuleComparisonRowStringInputSet", null, pcftest.RuleComparisonRowStringInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleComparisonPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleActions extends PCFElement {
    public RuleActions(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonActionsInputSet getRuleComparisonActionsInputSet() {
      return getOrCreateProperty("RuleComparisonActionsInputSet", "RuleComparisonActionsInputSet", null, pcftest.RuleComparisonActionsInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleComparisonPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleApplicabilityCriteria extends PCFElement {
    public RuleApplicabilityCriteria(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CCRuleApplicabilityCriteriaComparisonInputSet_ActivityRule getCCRuleApplicabilityCriteriaComparisonInputSet_ActivityRule() {
      return getOrCreateProperty("CCRuleApplicabilityCriteriaComparisonInputSet_ActivityRule", "CCRuleApplicabilityCriteriaComparisonInputSet", null, pcftest.CCRuleApplicabilityCriteriaComparisonInputSet_ActivityRule.class);
    }
    
    public CCRuleApplicabilityCriteriaComparisonInputSet_ExposureRule getCCRuleApplicabilityCriteriaComparisonInputSet_ExposureRule() {
      return getOrCreateProperty("CCRuleApplicabilityCriteriaComparisonInputSet_ExposureRule", "CCRuleApplicabilityCriteriaComparisonInputSet", null, pcftest.CCRuleApplicabilityCriteriaComparisonInputSet_ExposureRule.class);
    }
    
    public CCRuleApplicabilityCriteriaComparisonInputSet_ReserveRule getCCRuleApplicabilityCriteriaComparisonInputSet_ReserveRule() {
      return getOrCreateProperty("CCRuleApplicabilityCriteriaComparisonInputSet_ReserveRule", "CCRuleApplicabilityCriteriaComparisonInputSet", null, pcftest.CCRuleApplicabilityCriteriaComparisonInputSet_ReserveRule.class);
    }
    
    public CCRuleApplicabilityCriteriaComparisonInputSet_default getCCRuleApplicabilityCriteriaComparisonInputSet_default() {
      return getOrCreateProperty("CCRuleApplicabilityCriteriaComparisonInputSet_default", "CCRuleApplicabilityCriteriaComparisonInputSet", null, pcftest.CCRuleApplicabilityCriteriaComparisonInputSet_default.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleComparisonPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleCondition extends PCFElement {
    public RuleCondition(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonConditionInputSet getRuleComparisonConditionInputSet() {
      return getOrCreateProperty("RuleComparisonConditionInputSet", "RuleComparisonConditionInputSet", null, pcftest.RuleComparisonConditionInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleComparisonPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleDetailsSectionLabel extends PCFElement {
    public RuleDetailsSectionLabel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonSectionLabelInputSet getRuleComparisonSectionLabelInputSet() {
      return getOrCreateProperty("RuleComparisonSectionLabelInputSet", "RuleComparisonSectionLabelInputSet", null, pcftest.RuleComparisonSectionLabelInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleComparisonPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleVariables extends PCFElement {
    public RuleVariables(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonVariablesSectionInputSet getRuleComparisonVariablesSectionInputSet() {
      return getOrCreateProperty("RuleComparisonVariablesSectionInputSet", "RuleComparisonVariablesSectionInputSet", null, pcftest.RuleComparisonVariablesSectionInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleComparisonPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TriggerRow extends PCFElement {
    public TriggerRow(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleComparisonRowTypeKeyInputSet getRuleComparisonRowTypeKeyInputSet() {
      return getOrCreateProperty("RuleComparisonRowTypeKeyInputSet", "RuleComparisonRowTypeKeyInputSet", null, pcftest.RuleComparisonRowTypeKeyInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleComparisonPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleComparisonPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleComparisonPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRuleComparisonPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class draftAlert extends ClickableActionElement {
    public draftAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.CCRuleComparisonPopup.draftAlert.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CCRuleComparisonPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CloseBtn extends ClickableActionElement {
      public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}