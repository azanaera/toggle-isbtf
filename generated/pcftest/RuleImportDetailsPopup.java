package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.smoketest.platform.web.ValueElementWithSetAndRefresh;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.RuleImportDetailsPopup.DiscardAllRemaining;
import pcftest.RuleImportDetailsPopup.DiscardSelected;
import pcftest.RuleImportDetailsPopup.DispositionLV;
import pcftest.RuleImportDetailsPopup.ExistingVersionHeader;
import pcftest.RuleImportDetailsPopup.ImportAllRemaining;
import pcftest.RuleImportDetailsPopup.ImportCompletedAlert;
import pcftest.RuleImportDetailsPopup.ImportCompletedAlert.CloseBtn;
import pcftest.RuleImportDetailsPopup.ImportSelected;
import pcftest.RuleImportDetailsPopup.ImportingVersionHeader;
import pcftest.RuleImportDetailsPopup.NameContainerHeader;
import pcftest.RuleImportDetailsPopup.RuleImportDetailsPopup_UpLink;
import pcftest.RuleImportDetailsPopup.RuleValidationInfoHeader;
import pcftest.RuleImportDetailsPopup._ListPaging;
import pcftest.RuleImportDetailsPopup._Paging;
import pcftest.RuleImportDetailsPopup.__crumb__;
import pcftest.RuleImportDetailsPopup._msgs;
import pcftest.RuleImportDetailsPopup.entry;
import pcftest.RuleImportDetailsPopup.entry.AnotherRuleWithSameNameLink;
import pcftest.RuleImportDetailsPopup.entry.AvailableActionTextLink;
import pcftest.RuleImportDetailsPopup.entry.ChooseExistingLink;
import pcftest.RuleImportDetailsPopup.entry.ChooseExistingRadioIcon;
import pcftest.RuleImportDetailsPopup.entry.ChooseExistingSelectedRadioIcon;
import pcftest.RuleImportDetailsPopup.entry.ChooseImportingLink;
import pcftest.RuleImportDetailsPopup.entry.ChooseImportingRadioIcon;
import pcftest.RuleImportDetailsPopup.entry.ChooseImportingSelectedRadioIcon;
import pcftest.RuleImportDetailsPopup.entry.CompareSeparator;
import pcftest.RuleImportDetailsPopup.entry.CompareVersions;
import pcftest.RuleImportDetailsPopup.entry.EditedVersionLink;
import pcftest.RuleImportDetailsPopup.entry.EditedVersionLinkSeparator;
import pcftest.RuleImportDetailsPopup.entry.ExistingVersion;
import pcftest.RuleImportDetailsPopup.entry.ImportingVersion;
import pcftest.RuleImportDetailsPopup.entry.Name;
import pcftest.RuleImportDetailsPopup.entry.NameGap;
import pcftest.RuleImportDetailsPopup.entry.RuleValidationInfo;
import pcftest.RuleImportDetailsPopup.entry.Status;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class RuleImportDetailsPopup extends PCFLocation {
  public final static String CHECKSUM = "79d57d78df5963aa62dfa8cd3acefa05";
  
  public RuleImportDetailsPopup(ISmokeTest helper)  {
    super(helper, new gw.smoketest.platform.web.PCFElementId("RuleImportDetailsPopup"));
  }
  
  public DiscardAllRemaining getDiscardAllRemaining() {
    return getOrCreateProperty("DiscardAllRemaining", "DiscardAllRemaining", null, pcftest.RuleImportDetailsPopup.DiscardAllRemaining.class);
  }
  
  public DiscardSelected getDiscardSelected() {
    return getOrCreateProperty("DiscardSelected", "DiscardSelected", null, pcftest.RuleImportDetailsPopup.DiscardSelected.class);
  }
  
  public DispositionLV getDispositionLV() {
    return getOrCreateProperty("DispositionLV", "DispositionLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.RuleImportDetailsPopup.DispositionLV.class);
  }
  
  public SelectElement getEntriesFilter() {
    return getOrCreateProperty("EntriesFilter", "EntriesFilter", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewToolbarFilter, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ExistingVersionHeader getExistingVersionHeader() {
    return getOrCreateProperty("ExistingVersionHeader", "ExistingVersionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuleImportDetailsPopup.ExistingVersionHeader.class);
  }
  
  public ImportAllRemaining getImportAllRemaining() {
    return getOrCreateProperty("ImportAllRemaining", "ImportAllRemaining", null, pcftest.RuleImportDetailsPopup.ImportAllRemaining.class);
  }
  
  public ImportCompletedAlert getImportCompletedAlert() {
    return getOrCreateProperty("ImportCompletedAlert", "ImportCompletedAlert", null, pcftest.RuleImportDetailsPopup.ImportCompletedAlert.class);
  }
  
  public ImportSelected getImportSelected() {
    return getOrCreateProperty("ImportSelected", "ImportSelected", null, pcftest.RuleImportDetailsPopup.ImportSelected.class);
  }
  
  public ImportingVersionHeader getImportingVersionHeader() {
    return getOrCreateProperty("ImportingVersionHeader", "ImportingVersionHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuleImportDetailsPopup.ImportingVersionHeader.class);
  }
  
  public NameContainerHeader getNameContainerHeader() {
    return getOrCreateProperty("NameContainerHeader", "NameContainerHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuleImportDetailsPopup.NameContainerHeader.class);
  }
  
  public RuleImportDetailsPopup_UpLink getRuleImportDetailsPopup_UpLink() {
    return getOrCreateProperty("RuleImportDetailsPopup_UpLink", "RuleImportDetailsPopup_UpLink", null, pcftest.RuleImportDetailsPopup.RuleImportDetailsPopup_UpLink.class);
  }
  
  public RuleValidationInfoHeader getRuleValidationInfoHeader() {
    return getOrCreateProperty("RuleValidationInfoHeader", "RuleValidationInfoHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.RuleImportDetailsPopup.RuleValidationInfoHeader.class);
  }
  
  public ValueElement getSourceName() {
    return getOrCreateProperty("SourceName", "SourceName", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public IteratorEntryCheckboxElement get_Checkbox() {
    return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
  }
  
  @SuppressWarnings(value = "unchecked")
  public IteratorEntriesWithPaging<entry> get_Entries() {
    return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.RuleImportDetailsPopup.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
  }
  
  public _ListPaging get_ListPaging() {
    return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.RuleImportDetailsPopup._ListPaging.class);
  }
  
  public _Paging get_Paging() {
    return getOrCreateProperty("_Paging", "_Paging", null, pcftest.RuleImportDetailsPopup._Paging.class);
  }
  
  public __crumb__ get__crumb__() {
    return getOrCreateProperty("__crumb__", "__crumb__", null, pcftest.RuleImportDetailsPopup.__crumb__.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.RuleImportDetailsPopup._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DiscardAllRemaining extends ClickableActionElement {
    public DiscardAllRemaining(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DiscardSelected extends ClickableActionElement {
    public DiscardSelected(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DispositionLV extends PCFElement {
    public DispositionLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getConflictCount() {
      return getOrCreateProperty("ConflictCount", "ConflictCount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getConflictCountHeader() {
      return getOrCreateProperty("ConflictCountHeader", "ConflictCountHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getDeployedCount() {
      return getOrCreateProperty("DeployedCount", "DeployedCount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getDeployedCountHeader() {
      return getOrCreateProperty("DeployedCountHeader", "DeployedCountHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getDiscardedCount() {
      return getOrCreateProperty("DiscardedCount", "DiscardedCount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getDiscardedCountSubHeader() {
      return getOrCreateProperty("DiscardedCountSubHeader", "DiscardedCountSubHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getDiscardedHeader() {
      return getOrCreateProperty("DiscardedHeader", "DiscardedHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getEditedCount() {
      return getOrCreateProperty("EditedCount", "EditedCount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getEditedCountSubHeader() {
      return getOrCreateProperty("EditedCountSubHeader", "EditedCountSubHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getEditedHeader() {
      return getOrCreateProperty("EditedHeader", "EditedHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getImportedCount() {
      return getOrCreateProperty("ImportedCount", "ImportedCount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getImportedCountSubHeader() {
      return getOrCreateProperty("ImportedCountSubHeader", "ImportedCountSubHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getImportedHeader() {
      return getOrCreateProperty("ImportedHeader", "ImportedHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getNewCount() {
      return getOrCreateProperty("NewCount", "NewCount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getNewCountHeader() {
      return getOrCreateProperty("NewCountHeader", "NewCountHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getNoActionCount() {
      return getOrCreateProperty("NoActionCount", "NoActionCount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getNoActionCountSubHeader() {
      return getOrCreateProperty("NoActionCountSubHeader", "NoActionCountSubHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getNoActionHeader() {
      return getOrCreateProperty("NoActionHeader", "NoActionHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getNoConflictCount() {
      return getOrCreateProperty("NoConflictCount", "NoConflictCount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getNoConflictCountHeader() {
      return getOrCreateProperty("NoConflictCountHeader", "NoConflictCountHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getOutstandingCountHeader() {
      return getOrCreateProperty("OutstandingCountHeader", "OutstandingCountHeader", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public pcftest.RuleImportDetailsPopup.DispositionLV._Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.RuleImportDetailsPopup.DispositionLV._Select.class);
    }
    
    public pcftest.RuleImportDetailsPopup.DispositionLV._ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.RuleImportDetailsPopup.DispositionLV._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ViewDetail extends BooleanValueElement {
      public _ViewDetail(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ExistingVersionHeader extends ValueElement {
    public ExistingVersionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ImportAllRemaining extends ClickableActionElement {
    public ImportAllRemaining(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public RuleImportAllPopup click() {
      return clickThis(pcftest.RuleImportAllPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ImportCompletedAlert extends ClickableActionElement {
    public ImportCompletedAlert(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    public CloseBtn getCloseBtn() {
      return getOrCreateProperty("CloseBtn", "CloseBtn", null, pcftest.RuleImportDetailsPopup.ImportCompletedAlert.CloseBtn.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ImportSelected extends ClickableActionElement {
    public ImportSelected(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ImportingVersionHeader extends ValueElement {
    public ImportingVersionHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NameContainerHeader extends ValueElement {
    public NameContainerHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleImportDetailsPopup_UpLink extends ClickableActionElement {
    public RuleImportDetailsPopup_UpLink(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RuleValidationInfoHeader extends ValueElement {
    public RuleValidationInfoHeader(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _ListPaging extends PagingElement {
    public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _Paging extends ValueElementWithSetAndRefresh {
    public _Paging(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class __crumb__ extends ClickableActionElement {
    public __crumb__(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class entry extends RowElement {
    public entry(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AnotherRuleWithSameNameLink getAnotherRuleWithSameNameLink() {
      return getOrCreateProperty("AnotherRuleWithSameNameLink", "AnotherRuleWithSameNameLink", null, pcftest.RuleImportDetailsPopup.entry.AnotherRuleWithSameNameLink.class);
    }
    
    public AvailableActionTextLink getAvailableActionTextLink() {
      return getOrCreateProperty("AvailableActionTextLink", "AvailableActionTextLink", null, pcftest.RuleImportDetailsPopup.entry.AvailableActionTextLink.class);
    }
    
    public ChooseExistingLink getChooseExistingLink() {
      return getOrCreateProperty("ChooseExistingLink", "ChooseExistingLink", null, pcftest.RuleImportDetailsPopup.entry.ChooseExistingLink.class);
    }
    
    public ChooseExistingRadioIcon getChooseExistingRadioIcon() {
      return getOrCreateProperty("ChooseExistingRadioIcon", "ChooseExistingRadioIcon", null, pcftest.RuleImportDetailsPopup.entry.ChooseExistingRadioIcon.class);
    }
    
    public ChooseExistingSelectedRadioIcon getChooseExistingSelectedRadioIcon() {
      return getOrCreateProperty("ChooseExistingSelectedRadioIcon", "ChooseExistingSelectedRadioIcon", null, pcftest.RuleImportDetailsPopup.entry.ChooseExistingSelectedRadioIcon.class);
    }
    
    public ChooseImportingLink getChooseImportingLink() {
      return getOrCreateProperty("ChooseImportingLink", "ChooseImportingLink", null, pcftest.RuleImportDetailsPopup.entry.ChooseImportingLink.class);
    }
    
    public ChooseImportingRadioIcon getChooseImportingRadioIcon() {
      return getOrCreateProperty("ChooseImportingRadioIcon", "ChooseImportingRadioIcon", null, pcftest.RuleImportDetailsPopup.entry.ChooseImportingRadioIcon.class);
    }
    
    public ChooseImportingSelectedRadioIcon getChooseImportingSelectedRadioIcon() {
      return getOrCreateProperty("ChooseImportingSelectedRadioIcon", "ChooseImportingSelectedRadioIcon", null, pcftest.RuleImportDetailsPopup.entry.ChooseImportingSelectedRadioIcon.class);
    }
    
    public CompareSeparator getCompareSeparator() {
      return getOrCreateProperty("CompareSeparator", "CompareSeparator", null, pcftest.RuleImportDetailsPopup.entry.CompareSeparator.class);
    }
    
    public CompareVersions getCompareVersions() {
      return getOrCreateProperty("CompareVersions", "CompareVersions", null, pcftest.RuleImportDetailsPopup.entry.CompareVersions.class);
    }
    
    public EditedVersionLink getEditedVersionLink() {
      return getOrCreateProperty("EditedVersionLink", "EditedVersionLink", null, pcftest.RuleImportDetailsPopup.entry.EditedVersionLink.class);
    }
    
    public EditedVersionLinkSeparator getEditedVersionLinkSeparator() {
      return getOrCreateProperty("EditedVersionLinkSeparator", "EditedVersionLinkSeparator", null, pcftest.RuleImportDetailsPopup.entry.EditedVersionLinkSeparator.class);
    }
    
    public ExistingVersion getExistingVersion() {
      return getOrCreateProperty("ExistingVersion", "ExistingVersion", null, pcftest.RuleImportDetailsPopup.entry.ExistingVersion.class);
    }
    
    public ImportingVersion getImportingVersion() {
      return getOrCreateProperty("ImportingVersion", "ImportingVersion", null, pcftest.RuleImportDetailsPopup.entry.ImportingVersion.class);
    }
    
    public Name getName() {
      return getOrCreateProperty("Name", "Name", null, pcftest.RuleImportDetailsPopup.entry.Name.class);
    }
    
    public NameGap getNameGap() {
      return getOrCreateProperty("NameGap", "NameGap", null, pcftest.RuleImportDetailsPopup.entry.NameGap.class);
    }
    
    public RuleValidationInfo getRuleValidationInfo() {
      return getOrCreateProperty("RuleValidationInfo", "RuleValidationInfo", null, pcftest.RuleImportDetailsPopup.entry.RuleValidationInfo.class);
    }
    
    public Status getStatus() {
      return getOrCreateProperty("Status", "Status", null, pcftest.RuleImportDetailsPopup.entry.Status.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    public pcftest.RuleImportDetailsPopup.entry._Select get_Select() {
      return getOrCreateProperty("_Select", "_Select", null, pcftest.RuleImportDetailsPopup.entry._Select.class);
    }
    
    public pcftest.RuleImportDetailsPopup.entry._ViewDetail get_ViewDetail() {
      return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.RuleImportDetailsPopup.entry._ViewDetail.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AnotherRuleWithSameNameLink extends ClickableActionElement {
      public AnotherRuleWithSameNameLink(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AvailableActionTextLink extends ClickableActionElement {
      public AvailableActionTextLink(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ChooseExistingLink extends ClickableActionElement {
      public ChooseExistingLink(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ChooseExistingRadioIcon extends ClickableActionElement {
      public ChooseExistingRadioIcon(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ChooseExistingSelectedRadioIcon extends ClickableActionElement {
      public ChooseExistingSelectedRadioIcon(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ChooseImportingLink extends ClickableActionElement {
      public ChooseImportingLink(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ChooseImportingRadioIcon extends ClickableActionElement {
      public ChooseImportingRadioIcon(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ChooseImportingSelectedRadioIcon extends ClickableActionElement {
      public ChooseImportingSelectedRadioIcon(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CompareSeparator extends ClickableActionElement {
      public CompareSeparator(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CompareVersions extends ClickableActionElement {
      public CompareVersions(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditedVersionLink extends ClickableActionElement {
      public EditedVersionLink(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditedVersionLinkSeparator extends ClickableActionElement {
      public EditedVersionLinkSeparator(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ExistingVersion extends ValueElement {
      public ExistingVersion(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ImportingVersion extends ValueElement {
      public ImportingVersion(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Name extends ClickableActionElement {
      public Name(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NameGap extends ClickableActionElement {
      public NameGap(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Status extends ClickableActionElement {
      public Status(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _Select extends SelectorCellElement {
      public _Select(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/bizrules/RuleImportDetailsPopup.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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