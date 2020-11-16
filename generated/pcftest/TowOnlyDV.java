package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.TowOnlyDV.Claimant_Picker;
import pcftest.TowOnlyDV.Claimant_Type;
import pcftest.TowOnlyDV.ClosedOutcome;
import pcftest.TowOnlyDV.EditableOtherCoverageDetailsLV_tb;
import pcftest.TowOnlyDV.EditableOtherCoverageDetailsLV_tb.Add;
import pcftest.TowOnlyDV.EditableOtherCoverageDetailsLV_tb.Remove;
import pcftest.TowOnlyDV.Exposure_CoverageSubType;
import pcftest.TowOnlyDV.Exposure_LossParty;
import pcftest.TowOnlyDV.Exposure_PrimaryCoverage;
import pcftest.TowOnlyDV.Exposure_Segment;
import pcftest.TowOnlyDV.Exposure_StatLine;
import pcftest.TowOnlyDV.Exposure_StatLine.Exposure_StatLine_PickerButton;
import pcftest.TowOnlyDV.Exposure_Strategy;
import pcftest.TowOnlyDV.JurisdictionState;
import pcftest.TowOnlyDV.RecovAgcy_Picker;
import pcftest.TowOnlyDV.RecoveryAddress;
import pcftest.TowOnlyDV.Recovery_RecovClassType;
import pcftest.TowOnlyDV.Recovery_RecovCondType;
import pcftest.TowOnlyDV.Recovery_RecovInd;
import pcftest.TowOnlyDV.Recovery_RecovState;
import pcftest.TowOnlyDV.Vehicle_Incident;
import pcftest.TowOnlyDV.Vehicle_Incident.TowOnlyDV_EditIncidentMenuItem;
import pcftest.TowOnlyDV.Vehicle_Incident.TowOnlyDV_NewIncidentMenuItem;
import pcftest.TowOnlyDV.Vehicle_Incident.TowOnlyDV_ViewIncidentMenuItem;
import typekey.ClaimSegment;
import typekey.ClaimStrategy;
import typekey.ClaimantType;
import typekey.CoverageSubtype;
import typekey.CoverageType;
import typekey.ExposureClosedOutcomeType;
import typekey.ExposureState;
import typekey.Jurisdiction;
import typekey.LossPartyType;
import typekey.RecovClassType;
import typekey.RecovCondType;
import typekey.YesNo;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/TowOnlyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class TowOnlyDV extends DetailViewElement {
  public final static String CHECKSUM = "6178b375128e1de888500a70b24aad8f";
  
  public TowOnlyDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAssignedGroup_Name() {
    return getOrCreateProperty("AssignedGroup_Name", "AssignedGroup_Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getAssignedUser_Name() {
    return getOrCreateProperty("AssignedUser_Name", "AssignedUser_Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClaimant_Address() {
    return getOrCreateProperty("Claimant_Address", "Claimant_Address", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getClaimant_ContactPermitted() {
    return getOrCreateProperty("Claimant_ContactPermitted", "Claimant_ContactPermitted", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getClaimant_OtherCoverage() {
    return getOrCreateProperty("Claimant_OtherCoverage", "Claimant_OtherCoverage", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Claimant_Picker getClaimant_Picker() {
    return getOrCreateProperty("Claimant_Picker", "Claimant_Picker", null, pcftest.TowOnlyDV.Claimant_Picker.class);
  }
  
  public ValueElement getClaimant_PrimaryPhone() {
    return getOrCreateProperty("Claimant_PrimaryPhone", "Claimant_PrimaryPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Claimant_Type getClaimant_Type() {
    return getOrCreateProperty("Claimant_Type", "Claimant_Type", null, pcftest.TowOnlyDV.Claimant_Type.class);
  }
  
  public DateElement getClosedDate() {
    return getOrCreateProperty("ClosedDate", "ClosedDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ClosedOutcome getClosedOutcome() {
    return getOrCreateProperty("ClosedOutcome", "ClosedOutcome", null, pcftest.TowOnlyDV.ClosedOutcome.class);
  }
  
  public DateElement getCreateTime() {
    return getOrCreateProperty("CreateTime", "CreateTime", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public pcftest.TowOnlyDV.CreatedVia getCreatedVia() {
    return getOrCreateProperty("CreatedVia", "CreatedVia", null, pcftest.TowOnlyDV.CreatedVia.class);
  }
  
  public DeductibleInfoInputSet getDeductibleInfoInputSet() {
    return getOrCreateProperty("DeductibleInfoInputSet", "DeductibleInfoInputSet", null, pcftest.DeductibleInfoInputSet.class);
  }
  
  public EditableOtherCoverageDetailsLV getEditableOtherCoverageDetailsLV() {
    return getOrCreateProperty("EditableOtherCoverageDetailsLV", "EditableOtherCoverageDetailsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableOtherCoverageDetailsLV.class);
  }
  
  public EditableOtherCoverageDetailsLV_tb getEditableOtherCoverageDetailsLV_tb() {
    return getOrCreateProperty("EditableOtherCoverageDetailsLV_tb", "EditableOtherCoverageDetailsLV_tb", null, pcftest.TowOnlyDV.EditableOtherCoverageDetailsLV_tb.class);
  }
  
  public ExposureWorkloadInputSet getExposureWorkloadInputSet() {
    return getOrCreateProperty("ExposureWorkloadInputSet", "ExposureWorkloadInputSet", null, pcftest.ExposureWorkloadInputSet.class);
  }
  
  public SelectElement getExposure_Coverage() {
    return getOrCreateProperty("Exposure_Coverage", "Exposure_Coverage", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public Exposure_CoverageSubType getExposure_CoverageSubType() {
    return getOrCreateProperty("Exposure_CoverageSubType", "Exposure_CoverageSubType", null, pcftest.TowOnlyDV.Exposure_CoverageSubType.class);
  }
  
  public ValueElement getExposure_FuturePayments() {
    return getOrCreateProperty("Exposure_FuturePayments", "Exposure_FuturePayments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Exposure_LossParty getExposure_LossParty() {
    return getOrCreateProperty("Exposure_LossParty", "Exposure_LossParty", null, pcftest.TowOnlyDV.Exposure_LossParty.class);
  }
  
  public Exposure_PrimaryCoverage getExposure_PrimaryCoverage() {
    return getOrCreateProperty("Exposure_PrimaryCoverage", "Exposure_PrimaryCoverage", null, pcftest.TowOnlyDV.Exposure_PrimaryCoverage.class);
  }
  
  public ValueElement getExposure_RemainingReserves() {
    return getOrCreateProperty("Exposure_RemainingReserves", "Exposure_RemainingReserves", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Exposure_Segment getExposure_Segment() {
    return getOrCreateProperty("Exposure_Segment", "Exposure_Segment", null, pcftest.TowOnlyDV.Exposure_Segment.class);
  }
  
  public Exposure_StatLine getExposure_StatLine() {
    return getOrCreateProperty("Exposure_StatLine", "Exposure_StatLine", null, pcftest.TowOnlyDV.Exposure_StatLine.class);
  }
  
  public Exposure_Strategy getExposure_Strategy() {
    return getOrCreateProperty("Exposure_Strategy", "Exposure_Strategy", null, pcftest.TowOnlyDV.Exposure_Strategy.class);
  }
  
  public ValueElement getExposure_TotalIncurredNet() {
    return getOrCreateProperty("Exposure_TotalIncurredNet", "Exposure_TotalIncurredNet", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getExposure_TotalPayments() {
    return getOrCreateProperty("Exposure_TotalPayments", "Exposure_TotalPayments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getExposure_TotalRecoveries() {
    return getOrCreateProperty("Exposure_TotalRecoveries", "Exposure_TotalRecoveries", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getIncident_Description() {
    return getOrCreateProperty("Incident_Description", "Incident_Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getIncident_Driver() {
    return getOrCreateProperty("Incident_Driver", "Incident_Driver", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getIncident_LossEstimate() {
    return getOrCreateProperty("Incident_LossEstimate", "Incident_LossEstimate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getIncident_VehicleOperable() {
    return getOrCreateProperty("Incident_VehicleOperable", "Incident_VehicleOperable", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public JurisdictionState getJurisdictionState() {
    return getOrCreateProperty("JurisdictionState", "JurisdictionState", null, pcftest.TowOnlyDV.JurisdictionState.class);
  }
  
  public RecovAgcy_Picker getRecovAgcy_Picker() {
    return getOrCreateProperty("RecovAgcy_Picker", "RecovAgcy_Picker", null, pcftest.TowOnlyDV.RecovAgcy_Picker.class);
  }
  
  public RecoveryAddress getRecoveryAddress() {
    return getOrCreateProperty("RecoveryAddress", "RecoveryAddress", null, pcftest.TowOnlyDV.RecoveryAddress.class);
  }
  
  public Recovery_RecovClassType getRecovery_RecovClassType() {
    return getOrCreateProperty("Recovery_RecovClassType", "Recovery_RecovClassType", null, pcftest.TowOnlyDV.Recovery_RecovClassType.class);
  }
  
  public Recovery_RecovCondType getRecovery_RecovCondType() {
    return getOrCreateProperty("Recovery_RecovCondType", "Recovery_RecovCondType", null, pcftest.TowOnlyDV.Recovery_RecovCondType.class);
  }
  
  public DateElement getRecovery_RecovDate() {
    return getOrCreateProperty("Recovery_RecovDate", "Recovery_RecovDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Recovery_RecovInd getRecovery_RecovInd() {
    return getOrCreateProperty("Recovery_RecovInd", "Recovery_RecovInd", null, pcftest.TowOnlyDV.Recovery_RecovInd.class);
  }
  
  public Recovery_RecovState getRecovery_RecovState() {
    return getOrCreateProperty("Recovery_RecovState", "Recovery_RecovState", null, pcftest.TowOnlyDV.Recovery_RecovState.class);
  }
  
  public ValueElement getStatLine_Warning() {
    return getOrCreateProperty("StatLine_Warning", "StatLine_Warning", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.TowOnlyDV.State getState() {
    return getOrCreateProperty("State", "State", null, pcftest.TowOnlyDV.State.class);
  }
  
  public pcftest.TowOnlyDV.ValidationLevel getValidationLevel() {
    return getOrCreateProperty("ValidationLevel", "ValidationLevel", null, pcftest.TowOnlyDV.ValidationLevel.class);
  }
  
  public Vehicle_Incident getVehicle_Incident() {
    return getOrCreateProperty("Vehicle_Incident", "Vehicle_Incident", null, pcftest.TowOnlyDV.Vehicle_Incident.class);
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
    
    public pcftest.TowOnlyDV.Claimant_Picker.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.TowOnlyDV.Claimant_Picker.MenuItem_Search.class);
    }
    
    public pcftest.TowOnlyDV.Claimant_Picker.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.TowOnlyDV.Claimant_Picker.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/exposures/TowOnlyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/exposures/TowOnlyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClosedOutcome extends SelectElement {
    public ClosedOutcome(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ExposureClosedOutcomeType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ExposureClosedOutcomeType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ExposureClosedOutcomeType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ExposureClosedOutcomeType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/TowOnlyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CreatedVia extends SelectElement {
    public CreatedVia(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.CreatedVia arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.CreatedVia getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CreatedVia.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.CreatedVia arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/TowOnlyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableOtherCoverageDetailsLV_tb extends PCFElement {
    public EditableOtherCoverageDetailsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.TowOnlyDV.EditableOtherCoverageDetailsLV_tb.Add.class);
    }
    
    public Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.TowOnlyDV.EditableOtherCoverageDetailsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/TowOnlyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/TowOnlyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/exposures/TowOnlyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposure_CoverageSubType extends SelectElement {
    public Exposure_CoverageSubType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(CoverageSubtype arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public CoverageSubtype getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.CoverageSubtype.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(CoverageSubtype arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/TowOnlyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/exposures/TowOnlyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/exposures/TowOnlyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposure_Segment extends SelectElement {
    public Exposure_Segment(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ClaimSegment arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ClaimSegment getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ClaimSegment.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ClaimSegment arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/PolicyStatCodePickerWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposure_StatLine extends SelectElement {
    public Exposure_StatLine(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimPolicyStatCodePickerPopup click() {
      return clickThis(pcftest.ClaimPolicyStatCodePickerPopup.class);
    }
    
    public Exposure_StatLine_PickerButton getExposure_StatLine_PickerButton() {
      return getOrCreateProperty("Exposure_StatLine_PickerButton", "Exposure_StatLine_PickerButton", null, pcftest.TowOnlyDV.Exposure_StatLine.Exposure_StatLine_PickerButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/PolicyStatCodePickerWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Exposure_StatLine_PickerButton extends ClickableActionElement {
      public Exposure_StatLine_PickerButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimPolicyStatCodePickerPopup click() {
        return clickThis(pcftest.ClaimPolicyStatCodePickerPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/TowOnlyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposure_Strategy extends SelectElement {
    public Exposure_Strategy(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ClaimStrategy arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ClaimStrategy getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ClaimStrategy.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ClaimStrategy arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/TowOnlyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class JurisdictionState extends SelectElement {
    public JurisdictionState(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(Jurisdiction arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public Jurisdiction getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.Jurisdiction.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(Jurisdiction arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecovAgcy_Picker extends SelectElement {
    public RecovAgcy_Picker(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.TowOnlyDV.RecovAgcy_Picker.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.TowOnlyDV.RecovAgcy_Picker.MenuItem_Search.class);
    }
    
    public pcftest.TowOnlyDV.RecovAgcy_Picker.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.TowOnlyDV.RecovAgcy_Picker.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/exposures/TowOnlyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RecoveryAddress extends PCFElement {
    public RecoveryAddress(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CCAddressInputSet getCCAddressInputSet() {
      return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/TowOnlyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Recovery_RecovClassType extends SelectElement {
    public Recovery_RecovClassType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(RecovClassType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public RecovClassType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.RecovClassType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(RecovClassType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/TowOnlyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Recovery_RecovCondType extends SelectElement {
    public Recovery_RecovCondType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(RecovCondType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public RecovCondType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.RecovCondType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(RecovCondType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/TowOnlyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Recovery_RecovInd extends SelectElement {
    public Recovery_RecovInd(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(YesNo arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public YesNo getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.YesNo.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(YesNo arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/TowOnlyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Recovery_RecovState extends SelectElement {
    public Recovery_RecovState(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.State arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.State getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.State.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.State arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/TowOnlyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class State extends SelectElement {
    public State(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ExposureState arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ExposureState getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ExposureState.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ExposureState arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/TowOnlyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ValidationLevel extends SelectElement {
    public ValidationLevel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.ValidationLevel arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.ValidationLevel getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ValidationLevel.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.ValidationLevel arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/TowOnlyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Vehicle_Incident extends SelectElement {
    public Vehicle_Incident(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public TowOnlyDV_EditIncidentMenuItem getTowOnlyDV_EditIncidentMenuItem() {
      return getOrCreateProperty("TowOnlyDV_EditIncidentMenuItem", "TowOnlyDV_EditIncidentMenuItem", null, pcftest.TowOnlyDV.Vehicle_Incident.TowOnlyDV_EditIncidentMenuItem.class);
    }
    
    public TowOnlyDV_NewIncidentMenuItem getTowOnlyDV_NewIncidentMenuItem() {
      return getOrCreateProperty("TowOnlyDV_NewIncidentMenuItem", "TowOnlyDV_NewIncidentMenuItem", null, pcftest.TowOnlyDV.Vehicle_Incident.TowOnlyDV_NewIncidentMenuItem.class);
    }
    
    public TowOnlyDV_ViewIncidentMenuItem getTowOnlyDV_ViewIncidentMenuItem() {
      return getOrCreateProperty("TowOnlyDV_ViewIncidentMenuItem", "TowOnlyDV_ViewIncidentMenuItem", null, pcftest.TowOnlyDV.Vehicle_Incident.TowOnlyDV_ViewIncidentMenuItem.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/TowOnlyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TowOnlyDV_EditIncidentMenuItem extends ClickableActionElement {
      public TowOnlyDV_EditIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditVehicleIncidentPopup click() {
        return clickThis(pcftest.EditVehicleIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/TowOnlyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TowOnlyDV_NewIncidentMenuItem extends ClickableActionElement {
      public TowOnlyDV_NewIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NewVehicleIncidentPopup click() {
        return clickThis(pcftest.NewVehicleIncidentPopup.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/TowOnlyDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TowOnlyDV_ViewIncidentMenuItem extends ClickableActionElement {
      public TowOnlyDV_ViewIncidentMenuItem(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public EditVehicleIncidentPopup click() {
        return clickThis(pcftest.EditVehicleIncidentPopup.class);
      }
      
      
    }
    
    
  }
  
  
}