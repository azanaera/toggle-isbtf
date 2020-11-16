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
import pcftest.PIPSummaryDV.ClosedOutcome;
import pcftest.PIPSummaryDV.DisBenefits_Provider;
import pcftest.PIPSummaryDV.EditableOtherCoverageDetailsLV_tb;
import pcftest.PIPSummaryDV.Exposure_ClaimantType;
import pcftest.PIPSummaryDV.Exposure_Segment;
import pcftest.PIPSummaryDV.Exposure_Strategy;
import pcftest.PIPSummaryDV.Exposure_ValidationLevel;
import pcftest.PIPSummaryDV.IMEPerformedLV_tb;
import pcftest.PIPSummaryDV.JurisdictionState;
import pcftest.PIPSummaryDV.LossParty;
import pcftest.PIPSummaryDV.PIPDamages_Claimant;
import pcftest.PIPSummaryDV.PrimaryCoverage;
import pcftest.PIPSummaryDV.SettlementInformation_ExtLV_tb;
import pcftest.PIPSummaryDV.StatLine;
import pcftest.PIPSummaryDV.StatLine.StatLine_PickerButton;
import pcftest.PIPSummaryDV.State;
import pcftest.PIPSummaryDV.Title_CoverageSubType;
import typekey.ClaimSegment;
import typekey.ClaimStrategy;
import typekey.ClaimantType;
import typekey.CoverageSubtype;
import typekey.CoverageType;
import typekey.ExposureClosedOutcomeType;
import typekey.ExposureState;
import typekey.Jurisdiction;
import typekey.LossPartyType;
import typekey.ValidationLevel;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/PIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class PIPSummaryDV extends DetailViewElement {
  public final static String CHECKSUM = "2558ce9522d5bb0e8aefab8c8b58914a";
  
  public PIPSummaryDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAssignedGroup_Name() {
    return getOrCreateProperty("AssignedGroup_Name", "AssignedGroup_Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getAssignedUser_Name() {
    return getOrCreateProperty("AssignedUser_Name", "AssignedUser_Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BIDamageInputSet getBIDamageInputSet() {
    return getOrCreateProperty("BIDamageInputSet", "BIDamageInputSet", null, pcftest.BIDamageInputSet.class);
  }
  
  public BooleanValueElement getClaimant_ContactProhibited() {
    return getOrCreateProperty("Claimant_ContactProhibited", "Claimant_ContactProhibited", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getClaimant_OtherCoverage() {
    return getOrCreateProperty("Claimant_OtherCoverage", "Claimant_OtherCoverage", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getClaimant_PrimaryAddress() {
    return getOrCreateProperty("Claimant_PrimaryAddress", "Claimant_PrimaryAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClaimant_PrimaryPhone() {
    return getOrCreateProperty("Claimant_PrimaryPhone", "Claimant_PrimaryPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getClosedDate() {
    return getOrCreateProperty("ClosedDate", "ClosedDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ClosedOutcome getClosedOutcome() {
    return getOrCreateProperty("ClosedOutcome", "ClosedOutcome", null, pcftest.PIPSummaryDV.ClosedOutcome.class);
  }
  
  public DateElement getCreateTime() {
    return getOrCreateProperty("CreateTime", "CreateTime", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public pcftest.PIPSummaryDV.CreatedVia getCreatedVia() {
    return getOrCreateProperty("CreatedVia", "CreatedVia", null, pcftest.PIPSummaryDV.CreatedVia.class);
  }
  
  public DeductibleInfoInputSet getDeductibleInfoInputSet() {
    return getOrCreateProperty("DeductibleInfoInputSet", "DeductibleInfoInputSet", null, pcftest.DeductibleInfoInputSet.class);
  }
  
  public DisBenefits_Provider getDisBenefits_Provider() {
    return getOrCreateProperty("DisBenefits_Provider", "DisBenefits_Provider", null, pcftest.PIPSummaryDV.DisBenefits_Provider.class);
  }
  
  public EditableOtherCoverageDetailsLV getEditableOtherCoverageDetailsLV() {
    return getOrCreateProperty("EditableOtherCoverageDetailsLV", "EditableOtherCoverageDetailsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableOtherCoverageDetailsLV.class);
  }
  
  public EditableOtherCoverageDetailsLV_tb getEditableOtherCoverageDetailsLV_tb() {
    return getOrCreateProperty("EditableOtherCoverageDetailsLV_tb", "EditableOtherCoverageDetailsLV_tb", null, pcftest.PIPSummaryDV.EditableOtherCoverageDetailsLV_tb.class);
  }
  
  public pcftest.PIPSummaryDV.EscalationLevel_Ext getEscalationLevel_Ext() {
    return getOrCreateProperty("EscalationLevel_Ext", "EscalationLevel_Ext", null, pcftest.PIPSummaryDV.EscalationLevel_Ext.class);
  }
  
  public ExposureWorkloadInputSet getExposureWorkloadInputSet() {
    return getOrCreateProperty("ExposureWorkloadInputSet", "ExposureWorkloadInputSet", null, pcftest.ExposureWorkloadInputSet.class);
  }
  
  public Exposure_ClaimantType getExposure_ClaimantType() {
    return getOrCreateProperty("Exposure_ClaimantType", "Exposure_ClaimantType", null, pcftest.PIPSummaryDV.Exposure_ClaimantType.class);
  }
  
  public Exposure_Segment getExposure_Segment() {
    return getOrCreateProperty("Exposure_Segment", "Exposure_Segment", null, pcftest.PIPSummaryDV.Exposure_Segment.class);
  }
  
  public Exposure_Strategy getExposure_Strategy() {
    return getOrCreateProperty("Exposure_Strategy", "Exposure_Strategy", null, pcftest.PIPSummaryDV.Exposure_Strategy.class);
  }
  
  public Exposure_ValidationLevel getExposure_ValidationLevel() {
    return getOrCreateProperty("Exposure_ValidationLevel", "Exposure_ValidationLevel", null, pcftest.PIPSummaryDV.Exposure_ValidationLevel.class);
  }
  
  public ValueElement getFuturePayments() {
    return getOrCreateProperty("FuturePayments", "FuturePayments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public IMEPerformedLV getIMEPerformedLV() {
    return getOrCreateProperty("IMEPerformedLV", "IMEPerformedLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.IMEPerformedLV.class);
  }
  
  public IMEPerformedLV_tb getIMEPerformedLV_tb() {
    return getOrCreateProperty("IMEPerformedLV_tb", "IMEPerformedLV_tb", null, pcftest.PIPSummaryDV.IMEPerformedLV_tb.class);
  }
  
  public JurisdictionState getJurisdictionState() {
    return getOrCreateProperty("JurisdictionState", "JurisdictionState", null, pcftest.PIPSummaryDV.JurisdictionState.class);
  }
  
  public LossParty getLossParty() {
    return getOrCreateProperty("LossParty", "LossParty", null, pcftest.PIPSummaryDV.LossParty.class);
  }
  
  public ValueElement getLostWagesBenefits_Description() {
    return getOrCreateProperty("LostWagesBenefits_Description", "LostWagesBenefits_Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLostWagesBenefits_WeeklyCompRate() {
    return getOrCreateProperty("LostWagesBenefits_WeeklyCompRate", "LostWagesBenefits_WeeklyCompRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Medicare_ExtInputSet getMedicare_ExtInputSet() {
    return getOrCreateProperty("Medicare_ExtInputSet", "Medicare_ExtInputSet", null, pcftest.Medicare_ExtInputSet.class);
  }
  
  public PIPDamages_Claimant getPIPDamages_Claimant() {
    return getOrCreateProperty("PIPDamages_Claimant", "PIPDamages_Claimant", null, pcftest.PIPSummaryDV.PIPDamages_Claimant.class);
  }
  
  public BooleanValueElement getPIPDamages_SSDIEligible() {
    return getOrCreateProperty("PIPDamages_SSDIEligible", "PIPDamages_SSDIEligible", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public PrimaryCoverage getPrimaryCoverage() {
    return getOrCreateProperty("PrimaryCoverage", "PrimaryCoverage", null, pcftest.PIPSummaryDV.PrimaryCoverage.class);
  }
  
  public ValueElement getProvider_PrimaryAddress() {
    return getOrCreateProperty("Provider_PrimaryAddress", "Provider_PrimaryAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getProvider_PrimaryContact() {
    return getOrCreateProperty("Provider_PrimaryContact", "Provider_PrimaryContact", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getProvider_PrimaryPhone() {
    return getOrCreateProperty("Provider_PrimaryPhone", "Provider_PrimaryPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getRemainingReserves() {
    return getOrCreateProperty("RemainingReserves", "RemainingReserves", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public pcftest.PIPSummaryDV.RepresentationLevel_Ext getRepresentationLevel_Ext() {
    return getOrCreateProperty("RepresentationLevel_Ext", "RepresentationLevel_Ext", null, pcftest.PIPSummaryDV.RepresentationLevel_Ext.class);
  }
  
  public SettlementInformation_ExtLV getSettlementInformation_ExtLV() {
    return getOrCreateProperty("SettlementInformation_ExtLV", "SettlementInformation_ExtLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.SettlementInformation_ExtLV.class);
  }
  
  public SettlementInformation_ExtLV_tb getSettlementInformation_ExtLV_tb() {
    return getOrCreateProperty("SettlementInformation_ExtLV_tb", "SettlementInformation_ExtLV_tb", null, pcftest.PIPSummaryDV.SettlementInformation_ExtLV_tb.class);
  }
  
  public StatLine getStatLine() {
    return getOrCreateProperty("StatLine", "StatLine", null, pcftest.PIPSummaryDV.StatLine.class);
  }
  
  public ValueElement getStatLine_Warning() {
    return getOrCreateProperty("StatLine_Warning", "StatLine_Warning", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public State getState() {
    return getOrCreateProperty("State", "State", null, pcftest.PIPSummaryDV.State.class);
  }
  
  public SelectElement getTitle_Coverage() {
    return getOrCreateProperty("Title_Coverage", "Title_Coverage", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public Title_CoverageSubType getTitle_CoverageSubType() {
    return getOrCreateProperty("Title_CoverageSubType", "Title_CoverageSubType", null, pcftest.PIPSummaryDV.Title_CoverageSubType.class);
  }
  
  public ValueElement getTotalIncurredNet() {
    return getOrCreateProperty("TotalIncurredNet", "TotalIncurredNet", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTotalPayments() {
    return getOrCreateProperty("TotalPayments", "TotalPayments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTotalRecoveries() {
    return getOrCreateProperty("TotalRecoveries", "TotalRecoveries", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/PIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/exposures/PIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class DisBenefits_Provider extends SelectElement {
    public DisBenefits_Provider(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.PIPSummaryDV.DisBenefits_Provider.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.PIPSummaryDV.DisBenefits_Provider.MenuItem_Search.class);
    }
    
    public pcftest.PIPSummaryDV.DisBenefits_Provider.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.PIPSummaryDV.DisBenefits_Provider.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/exposures/PIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableOtherCoverageDetailsLV_tb extends PCFElement {
    public EditableOtherCoverageDetailsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.PIPSummaryDV.EditableOtherCoverageDetailsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.PIPSummaryDV.EditableOtherCoverageDetailsLV_tb.Add.class);
    }
    
    public pcftest.PIPSummaryDV.EditableOtherCoverageDetailsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.PIPSummaryDV.EditableOtherCoverageDetailsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/PIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/PIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/exposures/PIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EscalationLevel_Ext extends SelectElement {
    public EscalationLevel_Ext(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.EscalationLevel_Ext arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.EscalationLevel_Ext getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.EscalationLevel_Ext.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.EscalationLevel_Ext arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/PIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposure_ClaimantType extends SelectElement {
    public Exposure_ClaimantType(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/pcf/claim/exposures/PIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/exposures/PIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/exposures/PIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposure_ValidationLevel extends SelectElement {
    public Exposure_ValidationLevel(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ValidationLevel arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ValidationLevel getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ValidationLevel.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ValidationLevel arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/PIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class IMEPerformedLV_tb extends PCFElement {
    public IMEPerformedLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.PIPSummaryDV.IMEPerformedLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.PIPSummaryDV.IMEPerformedLV_tb.Add.class);
    }
    
    public pcftest.PIPSummaryDV.IMEPerformedLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.PIPSummaryDV.IMEPerformedLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/PIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/PIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/exposures/PIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/exposures/PIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class LossParty extends SelectElement {
    public LossParty(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PIPDamages_Claimant extends SelectElement {
    public PIPDamages_Claimant(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.PIPSummaryDV.PIPDamages_Claimant.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.PIPSummaryDV.PIPDamages_Claimant.MenuItem_Search.class);
    }
    
    public pcftest.PIPSummaryDV.PIPDamages_Claimant.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.PIPSummaryDV.PIPDamages_Claimant.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/exposures/PIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PrimaryCoverage extends SelectElement {
    public PrimaryCoverage(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/pcf/claim/exposures/PIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class RepresentationLevel_Ext extends SelectElement {
    public RepresentationLevel_Ext(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.RepresentationLevel_Ext arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.RepresentationLevel_Ext getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.RepresentationLevel_Ext.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.RepresentationLevel_Ext arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/PIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class SettlementInformation_ExtLV_tb extends PCFElement {
    public SettlementInformation_ExtLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.PIPSummaryDV.SettlementInformation_ExtLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.PIPSummaryDV.SettlementInformation_ExtLV_tb.Add.class);
    }
    
    public pcftest.PIPSummaryDV.SettlementInformation_ExtLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.PIPSummaryDV.SettlementInformation_ExtLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/PIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/PIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/widgets/PolicyStatCodePickerWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class StatLine extends SelectElement {
    public StatLine(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimPolicyStatCodePickerPopup click() {
      return clickThis(pcftest.ClaimPolicyStatCodePickerPopup.class);
    }
    
    public StatLine_PickerButton getStatLine_PickerButton() {
      return getOrCreateProperty("StatLine_PickerButton", "StatLine_PickerButton", null, pcftest.PIPSummaryDV.StatLine.StatLine_PickerButton.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/PolicyStatCodePickerWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatLine_PickerButton extends ClickableActionElement {
      public StatLine_PickerButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimPolicyStatCodePickerPopup click() {
        return clickThis(pcftest.ClaimPolicyStatCodePickerPopup.class);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/PIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/exposures/PIPSummaryDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Title_CoverageSubType extends SelectElement {
    public Title_CoverageSubType(ISmokeTest helper, PCFElementId componentId)  {
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
  
  
}