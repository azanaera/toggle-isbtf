package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
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
import pcftest.QuickClaimDV_QuickClaimProperty.Claim_LOBCode;
import pcftest.QuickClaimDV_QuickClaimProperty.Claim_LossCause;
import pcftest.QuickClaimDV_QuickClaimProperty.Claim_LossType;
import pcftest.QuickClaimDV_QuickClaimProperty.Claim_ReportedByType;
import pcftest.QuickClaimDV_QuickClaimProperty.Claimant_Picker;
import pcftest.QuickClaimDV_QuickClaimProperty.Claimant_Type;
import pcftest.QuickClaimDV_QuickClaimProperty.CommonAssign;
import pcftest.QuickClaimDV_QuickClaimProperty.CommonAssign.CommonAssign_PickerButton;
import pcftest.QuickClaimDV_QuickClaimProperty.EditableOfficialsLV_tb;
import pcftest.QuickClaimDV_QuickClaimProperty.EditableOfficialsLV_tb.Add;
import pcftest.QuickClaimDV_QuickClaimProperty.EditableOfficialsLV_tb.Remove;
import pcftest.QuickClaimDV_QuickClaimProperty.Exposure_LossParty;
import pcftest.QuickClaimDV_QuickClaimProperty.Exposure_PrimaryCoverage;
import pcftest.QuickClaimDV_QuickClaimProperty.IncidentLocation;
import pcftest.QuickClaimDV_QuickClaimProperty.NewClaimWizardAssignLV;
import pcftest.QuickClaimDV_QuickClaimProperty.NewClaimWizardAssignLV.AssigneeHeader;
import pcftest.QuickClaimDV_QuickClaimProperty.NewClaimWizardAssignLV.ForNameHeader;
import pcftest.QuickClaimDV_QuickClaimProperty.NewClaimWizardAssignLV._ListPaging;
import pcftest.QuickClaimDV_QuickClaimProperty.NewClaimWizardAssignLV.entry;
import pcftest.QuickClaimDV_QuickClaimProperty.NewClaimWizardAssignLV.entry.Assignee;
import pcftest.QuickClaimDV_QuickClaimProperty.NewClaimWizardAssignLV.entry.Assignee.Assignee_PickerButton;
import pcftest.QuickClaimDV_QuickClaimProperty.NewClaimWizardAssignLV.entry._Select;
import pcftest.QuickClaimDV_QuickClaimProperty.NewClaimWizardAssignLV.entry._ViewDetail;
import pcftest.QuickClaimDV_QuickClaimProperty.NewClaimWizardAssignLV_tb;
import pcftest.QuickClaimDV_QuickClaimProperty.Notification_Fault;
import pcftest.QuickClaimDV_QuickClaimProperty.Notification_HowReported;
import pcftest.QuickClaimDV_QuickClaimProperty.Policy_Status;
import pcftest.QuickClaimDV_QuickClaimProperty.ReportedBy_Name;
import typekey.ClaimantType;
import typekey.CoverageType;
import typekey.FaultRating;
import typekey.HowReportedType;
import typekey.LOBCode;
import typekey.LossCause;
import typekey.LossPartyType;
import typekey.LossType;
import typekey.PersonRelationType;
import typekey.PolicyStatus;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimProperty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class QuickClaimDV_QuickClaimProperty extends QuickClaimDV {
  public final static String CHECKSUM = "03e9da11b8ff9e0c3da55c556d07d5c3";
  
  public QuickClaimDV_QuickClaimProperty(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CCAddressInputSet getCCAddressInputSet() {
    return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
  }
  
  public SelectElement getCatastrophe_CatastropheNumber() {
    return getOrCreateProperty("Catastrophe_CatastropheNumber", "Catastrophe_CatastropheNumber", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public ValueElement getClaim_Description() {
    return getOrCreateProperty("Claim_Description", "Claim_Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Claim_LOBCode getClaim_LOBCode() {
    return getOrCreateProperty("Claim_LOBCode", "Claim_LOBCode", null, pcftest.QuickClaimDV_QuickClaimProperty.Claim_LOBCode.class);
  }
  
  public Claim_LossCause getClaim_LossCause() {
    return getOrCreateProperty("Claim_LossCause", "Claim_LossCause", null, pcftest.QuickClaimDV_QuickClaimProperty.Claim_LossCause.class);
  }
  
  public DateElement getClaim_LossDate() {
    return getOrCreateProperty("Claim_LossDate", "Claim_LossDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Claim_LossType getClaim_LossType() {
    return getOrCreateProperty("Claim_LossType", "Claim_LossType", null, pcftest.QuickClaimDV_QuickClaimProperty.Claim_LossType.class);
  }
  
  public SelectElement getClaim_PermissionRequired() {
    return getOrCreateProperty("Claim_PermissionRequired", "Claim_PermissionRequired", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public Claim_ReportedByType getClaim_ReportedByType() {
    return getOrCreateProperty("Claim_ReportedByType", "Claim_ReportedByType", null, pcftest.QuickClaimDV_QuickClaimProperty.Claim_ReportedByType.class);
  }
  
  public ValueElement getClaimant_Address() {
    return getOrCreateProperty("Claimant_Address", "Claimant_Address", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getClaimant_OtherCoverage() {
    return getOrCreateProperty("Claimant_OtherCoverage", "Claimant_OtherCoverage", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Claimant_Picker getClaimant_Picker() {
    return getOrCreateProperty("Claimant_Picker", "Claimant_Picker", null, pcftest.QuickClaimDV_QuickClaimProperty.Claimant_Picker.class);
  }
  
  public Claimant_Type getClaimant_Type() {
    return getOrCreateProperty("Claimant_Type", "Claimant_Type", null, pcftest.QuickClaimDV_QuickClaimProperty.Claimant_Type.class);
  }
  
  public ValueElement getClaimant_Workphone() {
    return getOrCreateProperty("Claimant_Workphone", "Claimant_Workphone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public CommonAssign getCommonAssign() {
    return getOrCreateProperty("CommonAssign", "CommonAssign", null, pcftest.QuickClaimDV_QuickClaimProperty.CommonAssign.class);
  }
  
  public EditableOfficialsLV getEditableOfficialsLV() {
    return getOrCreateProperty("EditableOfficialsLV", "EditableOfficialsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableOfficialsLV.class);
  }
  
  public EditableOfficialsLV_tb getEditableOfficialsLV_tb() {
    return getOrCreateProperty("EditableOfficialsLV_tb", "EditableOfficialsLV_tb", null, pcftest.QuickClaimDV_QuickClaimProperty.EditableOfficialsLV_tb.class);
  }
  
  public Exposure_LossParty getExposure_LossParty() {
    return getOrCreateProperty("Exposure_LossParty", "Exposure_LossParty", null, pcftest.QuickClaimDV_QuickClaimProperty.Exposure_LossParty.class);
  }
  
  public Exposure_PrimaryCoverage getExposure_PrimaryCoverage() {
    return getOrCreateProperty("Exposure_PrimaryCoverage", "Exposure_PrimaryCoverage", null, pcftest.QuickClaimDV_QuickClaimProperty.Exposure_PrimaryCoverage.class);
  }
  
  public IncidentLocation getIncidentLocation() {
    return getOrCreateProperty("IncidentLocation", "IncidentLocation", null, pcftest.QuickClaimDV_QuickClaimProperty.IncidentLocation.class);
  }
  
  public ValueElement getIndividualAssign() {
    return getOrCreateProperty("IndividualAssign", "IndividualAssign", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public NewClaimWizardAssignLV getNewClaimWizardAssignLV() {
    return getOrCreateProperty("NewClaimWizardAssignLV", "NewClaimWizardAssignLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.QuickClaimDV_QuickClaimProperty.NewClaimWizardAssignLV.class);
  }
  
  public NewClaimWizardAssignLV_tb getNewClaimWizardAssignLV_tb() {
    return getOrCreateProperty("NewClaimWizardAssignLV_tb", "NewClaimWizardAssignLV_tb", null, pcftest.QuickClaimDV_QuickClaimProperty.NewClaimWizardAssignLV_tb.class);
  }
  
  public ValueElement getNotification_AtFaultPercentage() {
    return getOrCreateProperty("Notification_AtFaultPercentage", "Notification_AtFaultPercentage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Notification_Fault getNotification_Fault() {
    return getOrCreateProperty("Notification_Fault", "Notification_Fault", null, pcftest.QuickClaimDV_QuickClaimProperty.Notification_Fault.class);
  }
  
  public BooleanValueElement getNotification_FirstNoticeSuit() {
    return getOrCreateProperty("Notification_FirstNoticeSuit", "Notification_FirstNoticeSuit", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Notification_HowReported getNotification_HowReported() {
    return getOrCreateProperty("Notification_HowReported", "Notification_HowReported", null, pcftest.QuickClaimDV_QuickClaimProperty.Notification_HowReported.class);
  }
  
  public DateElement getNotification_ReportedDate() {
    return getOrCreateProperty("Notification_ReportedDate", "Notification_ReportedDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getPolicy_PolicyNumber() {
    return getOrCreateProperty("Policy_PolicyNumber", "Policy_PolicyNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Policy_Status getPolicy_Status() {
    return getOrCreateProperty("Policy_Status", "Policy_Status", null, pcftest.QuickClaimDV_QuickClaimProperty.Policy_Status.class);
  }
  
  public ValueElement getReportedBy_Address() {
    return getOrCreateProperty("ReportedBy_Address", "ReportedBy_Address", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ReportedBy_Name getReportedBy_Name() {
    return getOrCreateProperty("ReportedBy_Name", "ReportedBy_Name", null, pcftest.QuickClaimDV_QuickClaimProperty.ReportedBy_Name.class);
  }
  
  public ValueElement getReportedBy_WorkPhone() {
    return getOrCreateProperty("ReportedBy_WorkPhone", "ReportedBy_WorkPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getStatus_CoverageQuestion() {
    return getOrCreateProperty("Status_CoverageQuestion", "Status_CoverageQuestion", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public CheckboxValueElement getStatus_IncidentReport() {
    return getOrCreateProperty("Status_IncidentReport", "Status_IncidentReport", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimProperty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim_LOBCode extends SelectElement {
    public Claim_LOBCode(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(LOBCode arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public LOBCode getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LOBCode.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(LOBCode arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimProperty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim_LossCause extends SelectElement {
    public Claim_LossCause(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(LossCause arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public LossCause getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossCause.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(LossCause arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimProperty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim_LossType extends SelectElement {
    public Claim_LossType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(LossType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public LossType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(LossType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimProperty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim_ReportedByType extends SelectElement {
    public Claim_ReportedByType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PersonRelationType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PersonRelationType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PersonRelationType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PersonRelationType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claimant_Picker extends SelectElement {
    public Claimant_Picker(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.QuickClaimDV_QuickClaimProperty.Claimant_Picker.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.QuickClaimDV_QuickClaimProperty.Claimant_Picker.MenuItem_Search.class);
    }
    
    public pcftest.QuickClaimDV_QuickClaimProperty.Claimant_Picker.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.QuickClaimDV_QuickClaimProperty.Claimant_Picker.MenuItem_ViewDetails.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_Search extends ClickableActionElement {
      public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookPickerPopup click() {
        return clickThis(pcftest.AddressBookPickerPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_ViewDetails extends ClickableActionElement {
      public MenuItem_ViewDetails(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimProperty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claimant_Type extends SelectElement {
    public Claimant_Type(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ClaimantType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ClaimantType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ClaimantType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ClaimantType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/CCAssigneeWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CommonAssign extends SelectElement {
    public CommonAssign(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CommonAssign_PickerButton getCommonAssign_PickerButton() {
      return getOrCreateProperty("CommonAssign_PickerButton", "CommonAssign_PickerButton", null, pcftest.QuickClaimDV_QuickClaimProperty.CommonAssign.CommonAssign_PickerButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/CCAssigneeWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CommonAssign_PickerButton extends ClickableActionElement {
      public CommonAssign_PickerButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AssigneePickerPopup click() {
        return clickThis(pcftest.AssigneePickerPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimProperty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableOfficialsLV_tb extends PCFElement {
    public EditableOfficialsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.QuickClaimDV_QuickClaimProperty.EditableOfficialsLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.QuickClaimDV_QuickClaimProperty.EditableOfficialsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimProperty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimProperty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Remove extends ClickableActionElement {
      public Remove(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimProperty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposure_LossParty extends SelectElement {
    public Exposure_LossParty(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(LossPartyType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public LossPartyType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.LossPartyType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(LossPartyType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimProperty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposure_PrimaryCoverage extends SelectElement {
    public Exposure_PrimaryCoverage(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(CoverageType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public CoverageType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CoverageType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(CoverageType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimProperty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IncidentLocation extends PCFElement {
    public IncidentLocation(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CCAddressInputSet getCCAddressInputSet() {
      return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimProperty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizardAssignLV extends PCFElement {
    public NewClaimWizardAssignLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AssigneeHeader getAssigneeHeader() {
      return getOrCreateProperty("AssigneeHeader", "AssigneeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.QuickClaimDV_QuickClaimProperty.NewClaimWizardAssignLV.AssigneeHeader.class);
    }
    
    public ForNameHeader getForNameHeader() {
      return getOrCreateProperty("ForNameHeader", "ForNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.QuickClaimDV_QuickClaimProperty.NewClaimWizardAssignLV.ForNameHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.QuickClaimDV_QuickClaimProperty.NewClaimWizardAssignLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.QuickClaimDV_QuickClaimProperty.NewClaimWizardAssignLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimProperty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AssigneeHeader extends ValueElement {
      public AssigneeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimProperty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ForNameHeader extends ValueElement {
      public ForNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimProperty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimProperty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public Assignee getAssignee() {
        return getOrCreateProperty("Assignee", "Assignee", null, pcftest.QuickClaimDV_QuickClaimProperty.NewClaimWizardAssignLV.entry.Assignee.class);
      }
      
      public ValueElement getForName() {
        return getOrCreateProperty("ForName", "ForName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.QuickClaimDV_QuickClaimProperty.NewClaimWizardAssignLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.QuickClaimDV_QuickClaimProperty.NewClaimWizardAssignLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/widgets/AssigneeCell.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Assignee extends SelectElement {
        public Assignee(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public Assignee_PickerButton getAssignee_PickerButton() {
          return getOrCreateProperty("Assignee_PickerButton", "Assignee_PickerButton", null, pcftest.QuickClaimDV_QuickClaimProperty.NewClaimWizardAssignLV.entry.Assignee.Assignee_PickerButton.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/widgets/AssigneeCell.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class Assignee_PickerButton extends ClickableActionElement {
          public Assignee_PickerButton(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public AssigneePickerPopup click() {
            return clickThis(pcftest.AssigneePickerPopup.class);
          }
          
          
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimProperty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimProperty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimProperty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class NewClaimWizardAssignLV_tb extends PCFElement {
    public NewClaimWizardAssignLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimProperty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Notification_Fault extends SelectElement {
    public Notification_Fault(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(FaultRating arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public FaultRating getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.FaultRating.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(FaultRating arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimProperty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Notification_HowReported extends SelectElement {
    public Notification_HowReported(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(HowReportedType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public HowReportedType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.HowReportedType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(HowReportedType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/QuickClaimDV.QuickClaimProperty.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Policy_Status extends SelectElement {
    public Policy_Status(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PolicyStatus arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PolicyStatus getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PolicyStatus.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PolicyStatus arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReportedBy_Name extends SelectElement {
    public ReportedBy_Name(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewPersonOnlyPickerMenuItemSet getClaimNewPersonOnlyPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewPersonOnlyPickerMenuItemSet", "ClaimNewPersonOnlyPickerMenuItemSet", null, pcftest.ClaimNewPersonOnlyPickerMenuItemSet.class);
    }
    
    public pcftest.QuickClaimDV_QuickClaimProperty.ReportedBy_Name.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.QuickClaimDV_QuickClaimProperty.ReportedBy_Name.MenuItem_Search.class);
    }
    
    public pcftest.QuickClaimDV_QuickClaimProperty.ReportedBy_Name.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.QuickClaimDV_QuickClaimProperty.ReportedBy_Name.MenuItem_ViewDetails.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_Search extends ClickableActionElement {
      public MenuItem_Search(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public AddressBookPickerPopup click() {
        return clickThis(pcftest.AddressBookPickerPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MenuItem_ViewDetails extends ClickableActionElement {
      public MenuItem_ViewDetails(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    
  }
  
  
}