package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.CCRulesListScreen.BulkEdit;
import pcftest.CCRulesListScreen.BulkEdit.ExportToCsv;
import pcftest.CCRulesListScreen.BulkEdit.ImportFromCsv;
import pcftest.CCRulesListScreen.CCSelectedRulesAlertBar;
import pcftest.CCRulesListScreen.ExportSelectedToCsv;
import pcftest.CCRulesListScreen.MoreButton;
import pcftest.CCRulesListScreen.PendingImportAlert;
import pcftest.CCRulesListScreen.RollingUpgradeAlert;
import pcftest.CCRulesListScreen.RulesLV;
import pcftest.CCRulesListScreen.RulesLV.ActionTypeHeader;
import pcftest.CCRulesListScreen.RulesLV.ClaimSegmentsHeader;
import pcftest.CCRulesListScreen.RulesLV.ContextHeader;
import pcftest.CCRulesListScreen.RulesLV.ExposureTypesHeader;
import pcftest.CCRulesListScreen.RulesLV.IncidentTypeHeader;
import pcftest.CCRulesListScreen.RulesLV.JurisdictionsHeader;
import pcftest.CCRulesListScreen.RulesLV.LossPartyTypeHeader;
import pcftest.CCRulesListScreen.RulesLV.LossTypesHeader;
import pcftest.CCRulesListScreen.RulesLV.NameHeader;
import pcftest.CCRulesListScreen.RulesLV.PolicyTypesHeader;
import pcftest.CCRulesListScreen.RulesLV.RuleExecutionInfoHeader;
import pcftest.CCRulesListScreen.RulesLV.RuleValidationInfoHeader;
import pcftest.CCRulesListScreen.RulesLV.StatusHeader;
import pcftest.CCRulesListScreen.RulesLV.TriggerHeader;
import pcftest.CCRulesListScreen.RulesLV.VersionHeader;
import pcftest.CCRulesListScreen.RulesLV._ListPaging;
import pcftest.CCRulesListScreen.RulesLV.entry;
import pcftest.CCRulesListScreen.RulesLV.entry.Context;
import pcftest.CCRulesListScreen.RulesLV.entry.Name;
import pcftest.CCRulesListScreen.RulesLV.entry.RuleExecutionInfo;
import pcftest.CCRulesListScreen.RulesLV.entry.RuleValidationInfo;
import pcftest.CCRulesListScreen.RulesLV.entry.Trigger;
import pcftest.CCRulesListScreen.RulesLV.entry._Select;
import pcftest.CCRulesListScreen.RulesLV.entry._ViewDetail;
import pcftest.CCRulesListScreen.RulesLV_tb;
import pcftest.CCRulesListScreen.RulesLV_tb.Clear;
import pcftest.CCRulesListScreen.RulesLV_tb.Filter;
import pcftest.CCRulesListScreen.SearchCriteriaPanelRef;
import pcftest.CCRulesListScreen.ShowHideFilter;
import pcftest.CCRulesListScreen.ValidationProcessFailedAlert;
import pcftest.CCRulesListScreen.ValidationProgressAlert;
import pcftest.CCRulesListScreen._msgs;
import typekey.RuleContextDefinitionKey;
import typekey.TriggeringPointKey;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class CCRulesListScreen extends PCFElement {
  public final static String CHECKSUM = "4f72ee020249f32a6395ab3598595100";
  
  public CCRulesListScreen(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public BulkEdit getBulkEdit() {
    return getOrCreateProperty("BulkEdit", "BulkEdit", null, pcftest.CCRulesListScreen.BulkEdit.class);
  }
  
  public CCSelectedRulesAlertBar getCCSelectedRulesAlertBar() {
    return getOrCreateProperty("CCSelectedRulesAlertBar", "CCSelectedRulesAlertBar", null, pcftest.CCRulesListScreen.CCSelectedRulesAlertBar.class);
  }
  
  public CreateRuleToolbarButtonSet getCreateRuleToolbarButtonSet() {
    return getOrCreateProperty("CreateRuleToolbarButtonSet", "CreateRuleToolbarButtonSet", null, pcftest.CreateRuleToolbarButtonSet.class);
  }
  
  public DeployRulesToolbarButtonSet getDeployRulesToolbarButtonSet() {
    return getOrCreateProperty("DeployRulesToolbarButtonSet", "DeployRulesToolbarButtonSet", null, pcftest.DeployRulesToolbarButtonSet.class);
  }
  
  public ExportSelectedToCsv getExportSelectedToCsv() {
    return getOrCreateProperty("ExportSelectedToCsv", "ExportSelectedToCsv", null, pcftest.CCRulesListScreen.ExportSelectedToCsv.class);
  }
  
  public MoreButton getMoreButton() {
    return getOrCreateProperty("MoreButton", "MoreButton", null, pcftest.CCRulesListScreen.MoreButton.class);
  }
  
  public PendingImportAlert getPendingImportAlert() {
    return getOrCreateProperty("PendingImportAlert", "PendingImportAlert", null, pcftest.CCRulesListScreen.PendingImportAlert.class);
  }
  
  public RollingUpgradeAlert getRollingUpgradeAlert() {
    return getOrCreateProperty("RollingUpgradeAlert", "RollingUpgradeAlert", null, pcftest.CCRulesListScreen.RollingUpgradeAlert.class);
  }
  
  public RulesLV getRulesLV() {
    return getOrCreateProperty("RulesLV", "RulesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.CCRulesListScreen.RulesLV.class);
  }
  
  public RulesLV_tb getRulesLV_tb() {
    return getOrCreateProperty("RulesLV_tb", "RulesLV_tb", null, pcftest.CCRulesListScreen.RulesLV_tb.class);
  }
  
  public SearchCriteriaPanelRef getSearchCriteriaPanelRef() {
    return getOrCreateProperty("SearchCriteriaPanelRef", "SearchCriteriaPanelRef", null, pcftest.CCRulesListScreen.SearchCriteriaPanelRef.class);
  }
  
  public ShowHideFilter getShowHideFilter() {
    return getOrCreateProperty("ShowHideFilter", "ShowHideFilter", null, pcftest.CCRulesListScreen.ShowHideFilter.class);
  }
  
  public ValidationProcessFailedAlert getValidationProcessFailedAlert() {
    return getOrCreateProperty("ValidationProcessFailedAlert", "ValidationProcessFailedAlert", null, pcftest.CCRulesListScreen.ValidationProcessFailedAlert.class);
  }
  
  public ValidationProgressAlert getValidationProgressAlert() {
    return getOrCreateProperty("ValidationProgressAlert", "ValidationProgressAlert", null, pcftest.CCRulesListScreen.ValidationProgressAlert.class);
  }
  
  public ValueElement getValidationStatusToolbarInput() {
    return getOrCreateProperty("ValidationStatusToolbarInput", "ValidationStatusToolbarInput", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.CCRulesListScreen._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BulkEdit extends ClickableActionElement {
    public BulkEdit(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ExportToCsv getExportToCsv() {
      return getOrCreateProperty("ExportToCsv", "ExportToCsv", null, pcftest.CCRulesListScreen.BulkEdit.ExportToCsv.class);
    }
    
    public ImportFromCsv getImportFromCsv() {
      return getOrCreateProperty("ImportFromCsv", "ImportFromCsv", null, pcftest.CCRulesListScreen.BulkEdit.ImportFromCsv.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExportToCsv extends ClickableActionElement {
      public ExportToCsv(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ImportFromCsv extends ClickableActionElement {
      public ImportFromCsv(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public StartRuleCsvImportPopup click() {
        return clickThis(pcftest.StartRuleCsvImportPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CCSelectedRulesAlertBar extends ClickableActionElement {
    public CCSelectedRulesAlertBar(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.CCRulesListScreen.CCSelectedRulesAlertBar.CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.CCRulesListScreen.CCSelectedRulesAlertBar.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CloseBtn extends ClickableActionElement {
      public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExportSelectedToCsv extends ClickableActionElement {
    public ExportSelectedToCsv(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MoreButton extends ClickableActionElement {
    public MoreButton(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleListMoreButtonMenuItemSet getRuleListMoreButtonMenuItemSet() {
      return getOrCreateProperty("RuleListMoreButtonMenuItemSet", "RuleListMoreButtonMenuItemSet", null, pcftest.RuleListMoreButtonMenuItemSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PendingImportAlert extends ClickableActionElement {
    public PendingImportAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CCRulesExportImportStatus click() {
      return clickThis(pcftest.CCRulesExportImportStatus.class);
    }
    
    public pcftest.CCRulesListScreen.PendingImportAlert.CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.CCRulesListScreen.PendingImportAlert.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CloseBtn extends ClickableActionElement {
      public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RollingUpgradeAlert extends ClickableActionElement {
    public RollingUpgradeAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.CCRulesListScreen.RollingUpgradeAlert.CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.CCRulesListScreen.RollingUpgradeAlert.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CloseBtn extends ClickableActionElement {
      public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RulesLV extends PCFElement {
    public RulesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ActionTypeHeader getActionTypeHeader() {
      return getOrCreateProperty("ActionTypeHeader", "ActionTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CCRulesListScreen.RulesLV.ActionTypeHeader.class);
    }
    
    public ClaimSegmentsHeader getClaimSegmentsHeader() {
      return getOrCreateProperty("ClaimSegmentsHeader", "ClaimSegmentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CCRulesListScreen.RulesLV.ClaimSegmentsHeader.class);
    }
    
    public ContextHeader getContextHeader() {
      return getOrCreateProperty("ContextHeader", "ContextHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CCRulesListScreen.RulesLV.ContextHeader.class);
    }
    
    public ExposureTypesHeader getExposureTypesHeader() {
      return getOrCreateProperty("ExposureTypesHeader", "ExposureTypesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CCRulesListScreen.RulesLV.ExposureTypesHeader.class);
    }
    
    public IncidentTypeHeader getIncidentTypeHeader() {
      return getOrCreateProperty("IncidentTypeHeader", "IncidentTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CCRulesListScreen.RulesLV.IncidentTypeHeader.class);
    }
    
    public JurisdictionsHeader getJurisdictionsHeader() {
      return getOrCreateProperty("JurisdictionsHeader", "JurisdictionsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CCRulesListScreen.RulesLV.JurisdictionsHeader.class);
    }
    
    public LossPartyTypeHeader getLossPartyTypeHeader() {
      return getOrCreateProperty("LossPartyTypeHeader", "LossPartyTypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CCRulesListScreen.RulesLV.LossPartyTypeHeader.class);
    }
    
    public LossTypesHeader getLossTypesHeader() {
      return getOrCreateProperty("LossTypesHeader", "LossTypesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CCRulesListScreen.RulesLV.LossTypesHeader.class);
    }
    
    public NameHeader getNameHeader() {
      return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CCRulesListScreen.RulesLV.NameHeader.class);
    }
    
    public PolicyTypesHeader getPolicyTypesHeader() {
      return getOrCreateProperty("PolicyTypesHeader", "PolicyTypesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CCRulesListScreen.RulesLV.PolicyTypesHeader.class);
    }
    
    public RuleExecutionInfoHeader getRuleExecutionInfoHeader() {
      return getOrCreateProperty("RuleExecutionInfoHeader", "RuleExecutionInfoHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CCRulesListScreen.RulesLV.RuleExecutionInfoHeader.class);
    }
    
    public RuleValidationInfoHeader getRuleValidationInfoHeader() {
      return getOrCreateProperty("RuleValidationInfoHeader", "RuleValidationInfoHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CCRulesListScreen.RulesLV.RuleValidationInfoHeader.class);
    }
    
    public StatusHeader getStatusHeader() {
      return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CCRulesListScreen.RulesLV.StatusHeader.class);
    }
    
    public TriggerHeader getTriggerHeader() {
      return getOrCreateProperty("TriggerHeader", "TriggerHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CCRulesListScreen.RulesLV.TriggerHeader.class);
    }
    
    public VersionHeader getVersionHeader() {
      return getOrCreateProperty("VersionHeader", "VersionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.CCRulesListScreen.RulesLV.VersionHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.CCRulesListScreen.RulesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.CCRulesListScreen.RulesLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ActionTypeHeader extends ValueElement {
      public ActionTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ClaimSegmentsHeader extends ValueElement {
      public ClaimSegmentsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ContextHeader extends ValueElement {
      public ContextHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExposureTypesHeader extends ValueElement {
      public ExposureTypesHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class IncidentTypeHeader extends ValueElement {
      public IncidentTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class JurisdictionsHeader extends ValueElement {
      public JurisdictionsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LossPartyTypeHeader extends ValueElement {
      public LossPartyTypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class LossTypesHeader extends ValueElement {
      public LossTypesHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NameHeader extends ValueElement {
      public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PolicyTypesHeader extends ValueElement {
      public PolicyTypesHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RuleExecutionInfoHeader extends ValueElement {
      public RuleExecutionInfoHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class RuleValidationInfoHeader extends ValueElement {
      public RuleValidationInfoHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatusHeader extends ValueElement {
      public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TriggerHeader extends ValueElement {
      public TriggerHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class VersionHeader extends ValueElement {
      public VersionHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getActionType() {
        return getOrCreateProperty("ActionType", "ActionType", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getClaimSegments() {
        return getOrCreateProperty("ClaimSegments", "ClaimSegments", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public Context getContext() {
        return getOrCreateProperty("Context", "Context", null, pcftest.CCRulesListScreen.RulesLV.entry.Context.class);
      }
      
      public ValueElement getExposureTypes() {
        return getOrCreateProperty("ExposureTypes", "ExposureTypes", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getIncidentType() {
        return getOrCreateProperty("IncidentType", "IncidentType", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getJurisdictions() {
        return getOrCreateProperty("Jurisdictions", "Jurisdictions", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getLossPartyType() {
        return getOrCreateProperty("LossPartyType", "LossPartyType", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getLossTypes() {
        return getOrCreateProperty("LossTypes", "LossTypes", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public Name getName() {
        return getOrCreateProperty("Name", "Name", null, pcftest.CCRulesListScreen.RulesLV.entry.Name.class);
      }
      
      public ValueElement getPolicyTypes() {
        return getOrCreateProperty("PolicyTypes", "PolicyTypes", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public RuleExecutionInfo getRuleExecutionInfo() {
        return getOrCreateProperty("RuleExecutionInfo", "RuleExecutionInfo", null, pcftest.CCRulesListScreen.RulesLV.entry.RuleExecutionInfo.class);
      }
      
      public RuleValidationInfo getRuleValidationInfo() {
        return getOrCreateProperty("RuleValidationInfo", "RuleValidationInfo", null, pcftest.CCRulesListScreen.RulesLV.entry.RuleValidationInfo.class);
      }
      
      public ValueElement getStatus() {
        return getOrCreateProperty("Status", "Status", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public Trigger getTrigger() {
        return getOrCreateProperty("Trigger", "Trigger", null, pcftest.CCRulesListScreen.RulesLV.entry.Trigger.class);
      }
      
      public ValueElement getVersion() {
        return getOrCreateProperty("Version", "Version", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.CCRulesListScreen.RulesLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.CCRulesListScreen.RulesLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Context extends SelectElement {
        public Context(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(RuleContextDefinitionKey arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public RuleContextDefinitionKey getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.RuleContextDefinitionKey.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(RuleContextDefinitionKey arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Name extends ValueElement {
        public Name(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class RuleExecutionInfo extends PCFElement {
        public RuleExecutionInfo(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getRuleExecutionInfo() {
          return getOrCreateProperty("RuleExecutionInfo", "RuleExecutionInfo", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public RuleExecutionInfoCell_default getRuleExecutionInfoCell_default() {
          return getOrCreateProperty("RuleExecutionInfoCell_default", "RuleExecutionInfoCell", null, pcftest.RuleExecutionInfoCell_default.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class RuleValidationInfo extends PCFElement {
        public RuleValidationInfo(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getRuleValidationInfo() {
          return getOrCreateProperty("RuleValidationInfo", "RuleValidationInfo", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public RuleValidationInfoCell_default getRuleValidationInfoCell_default() {
          return getOrCreateProperty("RuleValidationInfoCell_default", "RuleValidationInfoCell", null, pcftest.RuleValidationInfoCell_default.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Trigger extends SelectElement {
        public Trigger(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public OptionElement getOptionByTypeKey(TriggeringPointKey arg) {
          return getOptionByValue(arg == null ? null : arg.getCode());
        }
        
        public TriggeringPointKey getTypeKeyValue() {
          String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.TriggeringPointKey.getTypeKey(myValue);
        }
        
        public void setTypeKeyValue(TriggeringPointKey arg) {
          setValue(arg == null ? null : arg.getCode());
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ViewDetail extends BooleanValueElement {
        public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RulesLV_tb extends PCFElement {
    public RulesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Clear getClear() {
      return getOrCreateProperty("Clear", "Clear", null, pcftest.CCRulesListScreen.RulesLV_tb.Clear.class);
    }
    
    public Filter getFilter() {
      return getOrCreateProperty("Filter", "Filter", null, pcftest.CCRulesListScreen.RulesLV_tb.Filter.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Clear extends ClickableActionElement {
      public Clear(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Filter extends ClickableActionElement {
      public Filter(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SearchCriteriaPanelRef extends PCFElement {
    public SearchCriteriaPanelRef(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleFilterCriteriaDV_ActivityRule getRuleFilterCriteriaDV_ActivityRule() {
      return getOrCreateProperty("RuleFilterCriteriaDV_ActivityRule", "RuleFilterCriteriaDV", null, pcftest.RuleFilterCriteriaDV_ActivityRule.class);
    }
    
    public RuleFilterCriteriaDV_ExposureRule getRuleFilterCriteriaDV_ExposureRule() {
      return getOrCreateProperty("RuleFilterCriteriaDV_ExposureRule", "RuleFilterCriteriaDV", null, pcftest.RuleFilterCriteriaDV_ExposureRule.class);
    }
    
    public RuleFilterCriteriaDV_ReserveRule getRuleFilterCriteriaDV_ReserveRule() {
      return getOrCreateProperty("RuleFilterCriteriaDV_ReserveRule", "RuleFilterCriteriaDV", null, pcftest.RuleFilterCriteriaDV_ReserveRule.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ShowHideFilter extends ClickableActionElement {
    public ShowHideFilter(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ValidationProcessFailedAlert extends ClickableActionElement {
    public ValidationProcessFailedAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    public pcftest.CCRulesListScreen.ValidationProcessFailedAlert.CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.CCRulesListScreen.ValidationProcessFailedAlert.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CloseBtn extends ClickableActionElement {
      public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ValidationProgressAlert extends ClickableActionElement {
    public ValidationProgressAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    public pcftest.CCRulesListScreen.ValidationProgressAlert.CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.CCRulesListScreen.ValidationProgressAlert.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CloseBtn extends ClickableActionElement {
      public CloseBtn(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/CCRulesListScreen.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}