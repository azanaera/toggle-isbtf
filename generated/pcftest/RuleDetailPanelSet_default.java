package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleDetailPanelSet_default.ExposureActionHint;
import pcftest.RuleDetailPanelSet_default.RuleConditionPanelSet;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleDetailPanelSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleDetailPanelSet_default extends RuleDetailPanelSet {
  public final static String CHECKSUM = "cfd15edbaf7feff826c98e200c446435";
  
  public RuleDetailPanelSet_default(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ApplicabilityCriteriaDV_ActivityRule getApplicabilityCriteriaDV_ActivityRule() {
    return getOrCreateProperty("ApplicabilityCriteriaDV_ActivityRule", "ApplicabilityCriteriaDV", null, pcftest.ApplicabilityCriteriaDV_ActivityRule.class);
  }
  
  public ApplicabilityCriteriaDV_ExposureRule getApplicabilityCriteriaDV_ExposureRule() {
    return getOrCreateProperty("ApplicabilityCriteriaDV_ExposureRule", "ApplicabilityCriteriaDV", null, pcftest.ApplicabilityCriteriaDV_ExposureRule.class);
  }
  
  public ApplicabilityCriteriaDV_ReserveRule getApplicabilityCriteriaDV_ReserveRule() {
    return getOrCreateProperty("ApplicabilityCriteriaDV_ReserveRule", "ApplicabilityCriteriaDV", null, pcftest.ApplicabilityCriteriaDV_ReserveRule.class);
  }
  
  public AvailableToRunInputSet getAvailableToRunInputSet() {
    return getOrCreateProperty("AvailableToRunInputSet", "AvailableToRunInputSet", null, pcftest.AvailableToRunInputSet.class);
  }
  
  public ValueElement getContextDescription() {
    return getOrCreateProperty("ContextDescription", "ContextDescription", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ExposureActionHint getExposureActionHint() {
    return getOrCreateProperty("ExposureActionHint", "ExposureActionHint", null, pcftest.RuleDetailPanelSet_default.ExposureActionHint.class);
  }
  
  public ValueElement getName() {
    return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public RuleCommandDefinitionsListDetailView getRuleCommandDefinitionsListDetailView() {
    return getOrCreateProperty("RuleCommandDefinitionsListDetailView", "RuleCommandDefinitionsListDetailView", null, pcftest.RuleCommandDefinitionsListDetailView.class);
  }
  
  public RuleConditionPanelSet getRuleConditionPanelSet() {
    return getOrCreateProperty("RuleConditionPanelSet", "RuleConditionPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.RuleDetailPanelSet_default.RuleConditionPanelSet.class);
  }
  
  public SelectElement getRuleContextDefinitionKey() {
    return getOrCreateProperty("RuleContextDefinitionKey", "RuleContextDefinitionKey", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public RuleManagementAuditLinkInputSet getRuleManagementAuditLinkInputSet() {
    return getOrCreateProperty("RuleManagementAuditLinkInputSet", "RuleManagementAuditLinkInputSet", null, pcftest.RuleManagementAuditLinkInputSet.class);
  }
  
  public RuleVariablesPanelSet getRuleVariablesPanelSet() {
    return getOrCreateProperty("RuleVariablesPanelSet", "RuleVariablesPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.RuleVariablesPanelSet.class);
  }
  
  public SelectElement getTriggeringPointKey() {
    return getOrCreateProperty("TriggeringPointKey", "TriggeringPointKey", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleDetailPanelSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExposureActionHint extends ValueElement {
    public ExposureActionHint(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleDetailPanelSet.default.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleConditionPanelSet extends PCFElement {
    public RuleConditionPanelSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ConditionBuilderPanelSet getConditionBuilderPanelSet() {
      return getOrCreateProperty("ConditionBuilderPanelSet", "ConditionBuilderPanelSet", gw.smoketest.platform.web.PCFElementId.PCFElementScope.PanelSet, pcftest.ConditionBuilderPanelSet.class);
    }
    
    public BooleanValueElement getDisplayRuleCondition() {
      return getOrCreateProperty("DisplayRuleCondition", "DisplayRuleCondition", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    
  }
  
  
}