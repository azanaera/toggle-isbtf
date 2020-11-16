package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ExposureDetailDV_Wcinjurydamage.AltContact_Name;
import pcftest.ExposureDetailDV_Wcinjurydamage.AssignedUser_Name;
import pcftest.ExposureDetailDV_Wcinjurydamage.Claim_NurseCaseManager;
import pcftest.ExposureDetailDV_Wcinjurydamage.ClosedOutcome;
import pcftest.ExposureDetailDV_Wcinjurydamage.Exposure_ISOCardTab;
import pcftest.ExposureDetailDV_Wcinjurydamage.MedicalNotes;
import pcftest.ExposureDetailDV_Wcinjurydamage.MedicalNotes.NotesLV_tb;
import pcftest.ExposureDetailDV_Wcinjurydamage.PlannedActivities;
import pcftest.ExposureDetailDV_Wcinjurydamage.PlannedActivities.WCExposureActivitiesLV_tb;
import pcftest.ExposureDetailDV_Wcinjurydamage.PrimaryCoverage;
import pcftest.ExposureDetailDV_Wcinjurydamage.ReopenedReason;
import pcftest.ExposureDetailDV_Wcinjurydamage.Segment;
import pcftest.ExposureDetailDV_Wcinjurydamage.State;
import pcftest.ExposureDetailDV_Wcinjurydamage.Strategy;
import pcftest.ExposureDetailDV_Wcinjurydamage.WCInjuryDamage_DetailsCardTab;
import pcftest.ExposureDetailDV_Wcinjurydamage.WCMedCaseMgmt_DetailsCardTab;
import pcftest.ExposureDetailDV_Wcinjurydamage.WCMedCaseMgmt_MainCardTab;
import typekey.ClaimSegment;
import typekey.ClaimStrategy;
import typekey.CoverageType;
import typekey.ExposureClosedOutcomeType;
import typekey.ExposureReopenedReason;
import typekey.ExposureState;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Wcinjurydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ExposureDetailDV_Wcinjurydamage extends ExposureDetailDV {
  public final static String CHECKSUM = "28c3e2a91ad4a627d5d68f60d6669d0e";
  
  public ExposureDetailDV_Wcinjurydamage(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public AltContact_Name getAltContact_Name() {
    return getOrCreateProperty("AltContact_Name", "AltContact_Name", null, pcftest.ExposureDetailDV_Wcinjurydamage.AltContact_Name.class);
  }
  
  public ValueElement getAssignedGroup_Name() {
    return getOrCreateProperty("AssignedGroup_Name", "AssignedGroup_Name", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public AssignedUser_Name getAssignedUser_Name() {
    return getOrCreateProperty("AssignedUser_Name", "AssignedUser_Name", null, pcftest.ExposureDetailDV_Wcinjurydamage.AssignedUser_Name.class);
  }
  
  public Claim_NurseCaseManager getClaim_NurseCaseManager() {
    return getOrCreateProperty("Claim_NurseCaseManager", "Claim_NurseCaseManager", null, pcftest.ExposureDetailDV_Wcinjurydamage.Claim_NurseCaseManager.class);
  }
  
  public DateElement getClosedDate() {
    return getOrCreateProperty("ClosedDate", "ClosedDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ClosedOutcome getClosedOutcome() {
    return getOrCreateProperty("ClosedOutcome", "ClosedOutcome", null, pcftest.ExposureDetailDV_Wcinjurydamage.ClosedOutcome.class);
  }
  
  public DateElement getCreateTime() {
    return getOrCreateProperty("CreateTime", "CreateTime", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public pcftest.ExposureDetailDV_Wcinjurydamage.CreatedVia getCreatedVia() {
    return getOrCreateProperty("CreatedVia", "CreatedVia", null, pcftest.ExposureDetailDV_Wcinjurydamage.CreatedVia.class);
  }
  
  public DeductibleInfoInputSet getDeductibleInfoInputSet() {
    return getOrCreateProperty("DeductibleInfoInputSet", "DeductibleInfoInputSet", null, pcftest.DeductibleInfoInputSet.class);
  }
  
  public EditableBodyPartDetailsLV getEditableBodyPartDetailsLV() {
    return getOrCreateProperty("EditableBodyPartDetailsLV", "EditableBodyPartDetailsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableBodyPartDetailsLV.class);
  }
  
  public ExposureWorkloadInputSet getExposureWorkloadInputSet() {
    return getOrCreateProperty("ExposureWorkloadInputSet", "ExposureWorkloadInputSet", null, pcftest.ExposureWorkloadInputSet.class);
  }
  
  public Exposure_ISOCardTab getExposure_ISOCardTab() {
    return getOrCreateProperty("Exposure_ISOCardTab", "Exposure_ISOCardTab", null, pcftest.ExposureDetailDV_Wcinjurydamage.Exposure_ISOCardTab.class);
  }
  
  public ValueElement getFuturePayments() {
    return getOrCreateProperty("FuturePayments", "FuturePayments", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ISODetailsDV getISODetailsDV() {
    return getOrCreateProperty("ISODetailsDV", "ISODetailsDV", null, pcftest.ISODetailsDV.class);
  }
  
  public ValueElement getInjuryDescription() {
    return getOrCreateProperty("InjuryDescription", "InjuryDescription", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public MedCaseMgrDV getMedCaseMgrDV() {
    return getOrCreateProperty("MedCaseMgrDV", "MedCaseMgrDV", null, pcftest.MedCaseMgrDV.class);
  }
  
  public MedicalDiagnosisLV getMedicalDiagnosisLV() {
    return getOrCreateProperty("MedicalDiagnosisLV", "MedicalDiagnosisLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.MedicalDiagnosisLV.class);
  }
  
  public MedicalNotes getMedicalNotes() {
    return getOrCreateProperty("MedicalNotes", "MedicalNotes", null, pcftest.ExposureDetailDV_Wcinjurydamage.MedicalNotes.class);
  }
  
  public PlannedActivities getPlannedActivities() {
    return getOrCreateProperty("PlannedActivities", "PlannedActivities", null, pcftest.ExposureDetailDV_Wcinjurydamage.PlannedActivities.class);
  }
  
  public PrimaryCoverage getPrimaryCoverage() {
    return getOrCreateProperty("PrimaryCoverage", "PrimaryCoverage", null, pcftest.ExposureDetailDV_Wcinjurydamage.PrimaryCoverage.class);
  }
  
  public DateElement getReOpenDate() {
    return getOrCreateProperty("ReOpenDate", "ReOpenDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getRemainingReserves() {
    return getOrCreateProperty("RemainingReserves", "RemainingReserves", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ReopenedReason getReopenedReason() {
    return getOrCreateProperty("ReopenedReason", "ReopenedReason", null, pcftest.ExposureDetailDV_Wcinjurydamage.ReopenedReason.class);
  }
  
  public Segment getSegment() {
    return getOrCreateProperty("Segment", "Segment", null, pcftest.ExposureDetailDV_Wcinjurydamage.Segment.class);
  }
  
  public State getState() {
    return getOrCreateProperty("State", "State", null, pcftest.ExposureDetailDV_Wcinjurydamage.State.class);
  }
  
  public Strategy getStrategy() {
    return getOrCreateProperty("Strategy", "Strategy", null, pcftest.ExposureDetailDV_Wcinjurydamage.Strategy.class);
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
  
  public pcftest.ExposureDetailDV_Wcinjurydamage.ValidationLevel getValidationLevel() {
    return getOrCreateProperty("ValidationLevel", "ValidationLevel", null, pcftest.ExposureDetailDV_Wcinjurydamage.ValidationLevel.class);
  }
  
  public WCInjuryDamageDV getWCInjuryDamageDV() {
    return getOrCreateProperty("WCInjuryDamageDV", "WCInjuryDamageDV", null, pcftest.WCInjuryDamageDV.class);
  }
  
  public WCInjuryDamage_DetailsCardTab getWCInjuryDamage_DetailsCardTab() {
    return getOrCreateProperty("WCInjuryDamage_DetailsCardTab", "WCInjuryDamage_DetailsCardTab", null, pcftest.ExposureDetailDV_Wcinjurydamage.WCInjuryDamage_DetailsCardTab.class);
  }
  
  public WCMedCaseMgmt_DetailsCardTab getWCMedCaseMgmt_DetailsCardTab() {
    return getOrCreateProperty("WCMedCaseMgmt_DetailsCardTab", "WCMedCaseMgmt_DetailsCardTab", null, pcftest.ExposureDetailDV_Wcinjurydamage.WCMedCaseMgmt_DetailsCardTab.class);
  }
  
  public WCMedCaseMgmt_MainCardTab getWCMedCaseMgmt_MainCardTab() {
    return getOrCreateProperty("WCMedCaseMgmt_MainCardTab", "WCMedCaseMgmt_MainCardTab", null, pcftest.ExposureDetailDV_Wcinjurydamage.WCMedCaseMgmt_MainCardTab.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AltContact_Name extends SelectElement {
    public AltContact_Name(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
    }
    
    public pcftest.ExposureDetailDV_Wcinjurydamage.AltContact_Name.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.ExposureDetailDV_Wcinjurydamage.AltContact_Name.MenuItem_Search.class);
    }
    
    public pcftest.ExposureDetailDV_Wcinjurydamage.AltContact_Name.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.ExposureDetailDV_Wcinjurydamage.AltContact_Name.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Wcinjurydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AssignedUser_Name extends ValueElement {
    public AssignedUser_Name(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public UserContactDetailPopup click() {
      return clickThis(pcftest.UserContactDetailPopup.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim_NurseCaseManager extends SelectElement {
    public Claim_NurseCaseManager(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewPersonOnlyPickerMenuItemSet getClaimNewPersonOnlyPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewPersonOnlyPickerMenuItemSet", "ClaimNewPersonOnlyPickerMenuItemSet", null, pcftest.ClaimNewPersonOnlyPickerMenuItemSet.class);
    }
    
    public pcftest.ExposureDetailDV_Wcinjurydamage.Claim_NurseCaseManager.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.ExposureDetailDV_Wcinjurydamage.Claim_NurseCaseManager.MenuItem_Search.class);
    }
    
    public pcftest.ExposureDetailDV_Wcinjurydamage.Claim_NurseCaseManager.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.ExposureDetailDV_Wcinjurydamage.Claim_NurseCaseManager.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Wcinjurydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Wcinjurydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Wcinjurydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Exposure_ISOCardTab extends ClickableActionElement {
    public Exposure_ISOCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Wcinjurydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedicalNotes extends PCFElement {
    public MedicalNotes(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NotesLV getNotesLV() {
      return getOrCreateProperty("NotesLV", "NotesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.NotesLV.class);
    }
    
    public NotesLV_tb getNotesLV_tb() {
      return getOrCreateProperty("NotesLV_tb", "NotesLV_tb", null, pcftest.ExposureDetailDV_Wcinjurydamage.MedicalNotes.NotesLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Wcinjurydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NotesLV_tb extends PCFElement {
      public NotesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Wcinjurydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class PlannedActivities extends PCFElement {
    public PlannedActivities(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public WCExposureActivitiesLV getWCExposureActivitiesLV() {
      return getOrCreateProperty("WCExposureActivitiesLV", "WCExposureActivitiesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.WCExposureActivitiesLV.class);
    }
    
    public WCExposureActivitiesLV_tb getWCExposureActivitiesLV_tb() {
      return getOrCreateProperty("WCExposureActivitiesLV_tb", "WCExposureActivitiesLV_tb", null, pcftest.ExposureDetailDV_Wcinjurydamage.PlannedActivities.WCExposureActivitiesLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Wcinjurydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WCExposureActivitiesLV_tb extends PCFElement {
      public WCExposureActivitiesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Wcinjurydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Wcinjurydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReopenedReason extends SelectElement {
    public ReopenedReason(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(ExposureReopenedReason arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public ExposureReopenedReason getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.ExposureReopenedReason.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(ExposureReopenedReason arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Wcinjurydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Segment extends SelectElement {
    public Segment(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Wcinjurydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Wcinjurydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Strategy extends SelectElement {
    public Strategy(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Wcinjurydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Wcinjurydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WCInjuryDamage_DetailsCardTab extends ClickableActionElement {
    public WCInjuryDamage_DetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Wcinjurydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WCMedCaseMgmt_DetailsCardTab extends ClickableActionElement {
    public WCMedCaseMgmt_DetailsCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/exposures/ExposureDetailDV.Wcinjurydamage.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WCMedCaseMgmt_MainCardTab extends ClickableActionElement {
    public WCMedCaseMgmt_MainCardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}