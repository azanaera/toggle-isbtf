package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
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
import pcftest.LossDetailsDV_Wc.Claim_AccidentType;
import pcftest.LossDetailsDV_Wc.Claim_DetailedInjury;
import pcftest.LossDetailsDV_Wc.Claim_HowReported;
import pcftest.LossDetailsDV_Wc.Claim_InjuryIllnessCause;
import pcftest.LossDetailsDV_Wc.Claim_MainContactType;
import pcftest.LossDetailsDV_Wc.Claim_PrimaryInjury;
import pcftest.LossDetailsDV_Wc.Claim_ReportedByType;
import pcftest.LossDetailsDV_Wc.Claim_Severity;
import pcftest.LossDetailsDV_Wc.Claimant_Picker;
import pcftest.LossDetailsDV_Wc.Classification;
import pcftest.LossDetailsDV_Wc.CompensabilityFactors;
import pcftest.LossDetailsDV_Wc.CompensabilityFactorsInputSet;
import pcftest.LossDetailsDV_Wc.CompensabilityFactorsInputSet.DrugsInvolved;
import pcftest.LossDetailsDV_Wc.CompensabilityFactorsInputSet.EmployerQuestionsValidity;
import pcftest.LossDetailsDV_Wc.ConcurrentEmployment;
import pcftest.LossDetailsDV_Wc.ConcurrentEmploymentLV;
import pcftest.LossDetailsDV_Wc.ConcurrentEmploymentLV.EditableConcurrentEmploymentLV_tb;
import pcftest.LossDetailsDV_Wc.EditableBodyPartDetailsLV_tb;
import pcftest.LossDetailsDV_Wc.EditableBodyPartDetailsLV_tb.MakeFirstButton;
import pcftest.LossDetailsDV_Wc.EditableOfficialsLV_tb;
import pcftest.LossDetailsDV_Wc.EditableOtherBenefitsLV_tb;
import pcftest.LossDetailsDV_Wc.EmploymentData_EmploymentStatus;
import pcftest.LossDetailsDV_Wc.EmploymentData_HireState;
import pcftest.LossDetailsDV_Wc.EmploymentData_PayPeriod;
import pcftest.LossDetailsDV_Wc.EmploymentData_SupervisorPicker;
import pcftest.LossDetailsDV_Wc.JurisdictionState;
import pcftest.LossDetailsDV_Wc.KeyWCDates;
import pcftest.LossDetailsDV_Wc.MainContact_Picker;
import pcftest.LossDetailsDV_Wc.MetroReportsLV_tb;
import pcftest.LossDetailsDV_Wc.ReportedBy_Picker;
import typekey.AccidentType;
import typekey.DetailedInjuryType;
import typekey.EmploymentStatusType;
import typekey.HowReportedType;
import typekey.InjuryType;
import typekey.Jurisdiction;
import typekey.LossCause;
import typekey.PayPeriodType;
import typekey.PersonRelationType;
import typekey.SeverityType;
import typekey.State;
import typekey.YesNo;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class LossDetailsDV_Wc extends LossDetailsDV {
  public final static String CHECKSUM = "4a4eb22764fe6625e27c36c0ba8cf280";
  
  public LossDetailsDV_Wc(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public pcftest.LossDetailsDV_Wc.AccidentPremises getAccidentPremises() {
    return getOrCreateProperty("AccidentPremises", "AccidentPremises", null, pcftest.LossDetailsDV_Wc.AccidentPremises.class);
  }
  
  public CCAddressInputSet getCCAddressInputSet() {
    return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
  }
  
  public SelectElement getCatastrophe_CatastropheNumber() {
    return getOrCreateProperty("Catastrophe_CatastropheNumber", "Catastrophe_CatastropheNumber", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public DateElement getClaimFormGiven() {
    return getOrCreateProperty("ClaimFormGiven", "ClaimFormGiven", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Claim_AccidentType getClaim_AccidentType() {
    return getOrCreateProperty("Claim_AccidentType", "Claim_AccidentType", null, pcftest.LossDetailsDV_Wc.Claim_AccidentType.class);
  }
  
  public ValueElement getClaim_ActivityPerformed() {
    return getOrCreateProperty("Claim_ActivityPerformed", "Claim_ActivityPerformed", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getClaim_DateReportedtoEmployer() {
    return getOrCreateProperty("Claim_DateReportedtoEmployer", "Claim_DateReportedtoEmployer", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Claim_DetailedInjury getClaim_DetailedInjury() {
    return getOrCreateProperty("Claim_DetailedInjury", "Claim_DetailedInjury", null, pcftest.LossDetailsDV_Wc.Claim_DetailedInjury.class);
  }
  
  public ValueElement getClaim_EquipmentUsed() {
    return getOrCreateProperty("Claim_EquipmentUsed", "Claim_EquipmentUsed", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getClaim_ExposureBegan() {
    return getOrCreateProperty("Claim_ExposureBegan", "Claim_ExposureBegan", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getClaim_ExposureEnded() {
    return getOrCreateProperty("Claim_ExposureEnded", "Claim_ExposureEnded", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Claim_HowReported getClaim_HowReported() {
    return getOrCreateProperty("Claim_HowReported", "Claim_HowReported", null, pcftest.LossDetailsDV_Wc.Claim_HowReported.class);
  }
  
  public Claim_InjuryIllnessCause getClaim_InjuryIllnessCause() {
    return getOrCreateProperty("Claim_InjuryIllnessCause", "Claim_InjuryIllnessCause", null, pcftest.LossDetailsDV_Wc.Claim_InjuryIllnessCause.class);
  }
  
  public DateElement getClaim_InjuryIllnessDate() {
    return getOrCreateProperty("Claim_InjuryIllnessDate", "Claim_InjuryIllnessDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Claim_MainContactType getClaim_MainContactType() {
    return getOrCreateProperty("Claim_MainContactType", "Claim_MainContactType", null, pcftest.LossDetailsDV_Wc.Claim_MainContactType.class);
  }
  
  public Claim_PrimaryInjury getClaim_PrimaryInjury() {
    return getOrCreateProperty("Claim_PrimaryInjury", "Claim_PrimaryInjury", null, pcftest.LossDetailsDV_Wc.Claim_PrimaryInjury.class);
  }
  
  public Claim_ReportedByType getClaim_ReportedByType() {
    return getOrCreateProperty("Claim_ReportedByType", "Claim_ReportedByType", null, pcftest.LossDetailsDV_Wc.Claim_ReportedByType.class);
  }
  
  public Claim_Severity getClaim_Severity() {
    return getOrCreateProperty("Claim_Severity", "Claim_Severity", null, pcftest.LossDetailsDV_Wc.Claim_Severity.class);
  }
  
  public DateElement getClaim_lossTime() {
    return getOrCreateProperty("Claim_lossTime", "Claim_lossTime", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getClaimant_Address() {
    return getOrCreateProperty("Claimant_Address", "Claimant_Address", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getClaimant_ContactProhibited() {
    return getOrCreateProperty("Claimant_ContactProhibited", "Claimant_ContactProhibited", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public DateElement getClaimant_DateOfBirth() {
    return getOrCreateProperty("Claimant_DateOfBirth", "Claimant_DateOfBirth", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getClaimant_Phone() {
    return getOrCreateProperty("Claimant_Phone", "Claimant_Phone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Claimant_Picker getClaimant_Picker() {
    return getOrCreateProperty("Claimant_Picker", "Claimant_Picker", null, pcftest.LossDetailsDV_Wc.Claimant_Picker.class);
  }
  
  public ValueElement getClaimant_TaxNumber() {
    return getOrCreateProperty("Claimant_TaxNumber", "Claimant_TaxNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Classification getClassification() {
    return getOrCreateProperty("Classification", "Classification", null, pcftest.LossDetailsDV_Wc.Classification.class);
  }
  
  public CompensabilityFactors getCompensabilityFactors() {
    return getOrCreateProperty("CompensabilityFactors", "CompensabilityFactors", null, pcftest.LossDetailsDV_Wc.CompensabilityFactors.class);
  }
  
  public CompensabilityFactorsInputSet getCompensabilityFactorsInputSet() {
    return getOrCreateProperty("CompensabilityFactorsInputSet", "CompensabilityFactorsInputSet", null, pcftest.LossDetailsDV_Wc.CompensabilityFactorsInputSet.class);
  }
  
  public ConcurrentEmployment getConcurrentEmployment() {
    return getOrCreateProperty("ConcurrentEmployment", "ConcurrentEmployment", null, pcftest.LossDetailsDV_Wc.ConcurrentEmployment.class);
  }
  
  public ConcurrentEmploymentLV getConcurrentEmploymentLV() {
    return getOrCreateProperty("ConcurrentEmploymentLV", "ConcurrentEmploymentLV", null, pcftest.LossDetailsDV_Wc.ConcurrentEmploymentLV.class);
  }
  
  public DateElement getDeathDate() {
    return getOrCreateProperty("DeathDate", "DeathDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public EditableBodyPartDetailsLV getEditableBodyPartDetailsLV() {
    return getOrCreateProperty("EditableBodyPartDetailsLV", "EditableBodyPartDetailsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableBodyPartDetailsLV.class);
  }
  
  public EditableBodyPartDetailsLV_tb getEditableBodyPartDetailsLV_tb() {
    return getOrCreateProperty("EditableBodyPartDetailsLV_tb", "EditableBodyPartDetailsLV_tb", null, pcftest.LossDetailsDV_Wc.EditableBodyPartDetailsLV_tb.class);
  }
  
  public EditableOfficialsLV getEditableOfficialsLV() {
    return getOrCreateProperty("EditableOfficialsLV", "EditableOfficialsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableOfficialsLV.class);
  }
  
  public EditableOfficialsLV_tb getEditableOfficialsLV_tb() {
    return getOrCreateProperty("EditableOfficialsLV_tb", "EditableOfficialsLV_tb", null, pcftest.LossDetailsDV_Wc.EditableOfficialsLV_tb.class);
  }
  
  public EditableOtherBenefitsLV getEditableOtherBenefitsLV() {
    return getOrCreateProperty("EditableOtherBenefitsLV", "EditableOtherBenefitsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableOtherBenefitsLV.class);
  }
  
  public EditableOtherBenefitsLV_tb getEditableOtherBenefitsLV_tb() {
    return getOrCreateProperty("EditableOtherBenefitsLV_tb", "EditableOtherBenefitsLV_tb", null, pcftest.LossDetailsDV_Wc.EditableOtherBenefitsLV_tb.class);
  }
  
  public SelectElement getEmploymentData_ClassCode() {
    return getOrCreateProperty("EmploymentData_ClassCode", "EmploymentData_ClassCode", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public BooleanValueElement getEmploymentData_ClassCodeByLocation() {
    return getOrCreateProperty("EmploymentData_ClassCodeByLocation", "EmploymentData_ClassCodeByLocation", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getEmploymentData_DepartmentCode() {
    return getOrCreateProperty("EmploymentData_DepartmentCode", "EmploymentData_DepartmentCode", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEmploymentData_DiscontinuedFringeBenefits() {
    return getOrCreateProperty("EmploymentData_DiscontinuedFringeBenefits", "EmploymentData_DiscontinuedFringeBenefits", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public EmploymentData_EmploymentStatus getEmploymentData_EmploymentStatus() {
    return getOrCreateProperty("EmploymentData_EmploymentStatus", "EmploymentData_EmploymentStatus", null, pcftest.LossDetailsDV_Wc.EmploymentData_EmploymentStatus.class);
  }
  
  public DateElement getEmploymentData_HireDate() {
    return getOrCreateProperty("EmploymentData_HireDate", "EmploymentData_HireDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public EmploymentData_HireState getEmploymentData_HireState() {
    return getOrCreateProperty("EmploymentData_HireState", "EmploymentData_HireState", null, pcftest.LossDetailsDV_Wc.EmploymentData_HireState.class);
  }
  
  public DateElement getEmploymentData_InjuryStartDate() {
    return getOrCreateProperty("EmploymentData_InjuryStartDate", "EmploymentData_InjuryStartDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getEmploymentData_InjuryStartTime() {
    return getOrCreateProperty("EmploymentData_InjuryStartTime", "EmploymentData_InjuryStartTime", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getEmploymentData_NumDaysWorkedPerWeek() {
    return getOrCreateProperty("EmploymentData_NumDaysWorkedPerWeek", "EmploymentData_NumDaysWorkedPerWeek", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEmploymentData_NumHoursWorkedPerDay() {
    return getOrCreateProperty("EmploymentData_NumHoursWorkedPerDay", "EmploymentData_NumHoursWorkedPerDay", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEmploymentData_Occupation() {
    return getOrCreateProperty("EmploymentData_Occupation", "EmploymentData_Occupation", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getEmploymentData_PaidFullWages() {
    return getOrCreateProperty("EmploymentData_PaidFullWages", "EmploymentData_PaidFullWages", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public EmploymentData_PayPeriod getEmploymentData_PayPeriod() {
    return getOrCreateProperty("EmploymentData_PayPeriod", "EmploymentData_PayPeriod", null, pcftest.LossDetailsDV_Wc.EmploymentData_PayPeriod.class);
  }
  
  public EmploymentData_SupervisorPicker getEmploymentData_SupervisorPicker() {
    return getOrCreateProperty("EmploymentData_SupervisorPicker", "EmploymentData_SupervisorPicker", null, pcftest.LossDetailsDV_Wc.EmploymentData_SupervisorPicker.class);
  }
  
  public BooleanValueElement getEmploymentData_WagePaymentContinued() {
    return getOrCreateProperty("EmploymentData_WagePaymentContinued", "EmploymentData_WagePaymentContinued", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getEmploymentData_WorkCompAWW() {
    return getOrCreateProperty("EmploymentData_WorkCompAWW", "EmploymentData_WorkCompAWW", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getInjuryDescription() {
    return getOrCreateProperty("InjuryDescription", "InjuryDescription", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getInjurySeverity_DeathReport() {
    return getOrCreateProperty("InjurySeverity_DeathReport", "InjurySeverity_DeathReport", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getInjurySeverity_EmployerLiability() {
    return getOrCreateProperty("InjurySeverity_EmployerLiability", "InjurySeverity_EmployerLiability", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getInjurySeverity_MedicalReport() {
    return getOrCreateProperty("InjurySeverity_MedicalReport", "InjurySeverity_MedicalReport", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getInjurySeverity_TimeLossReport() {
    return getOrCreateProperty("InjurySeverity_TimeLossReport", "InjurySeverity_TimeLossReport", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getJurisdictionClaimNumber() {
    return getOrCreateProperty("JurisdictionClaimNumber", "JurisdictionClaimNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public JurisdictionState getJurisdictionState() {
    return getOrCreateProperty("JurisdictionState", "JurisdictionState", null, pcftest.LossDetailsDV_Wc.JurisdictionState.class);
  }
  
  public KeyWCDates getKeyWCDates() {
    return getOrCreateProperty("KeyWCDates", "KeyWCDates", null, pcftest.LossDetailsDV_Wc.KeyWCDates.class);
  }
  
  public SelectElement getLocationCode() {
    return getOrCreateProperty("LocationCode", "LocationCode", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public MainContact_Picker getMainContact_Picker() {
    return getOrCreateProperty("MainContact_Picker", "MainContact_Picker", null, pcftest.LossDetailsDV_Wc.MainContact_Picker.class);
  }
  
  public MetroReportsLV getMetroReportsLV() {
    return getOrCreateProperty("MetroReportsLV", "MetroReportsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.MetroReportsLV.class);
  }
  
  public MetroReportsLV_tb getMetroReportsLV_tb() {
    return getOrCreateProperty("MetroReportsLV_tb", "MetroReportsLV_tb", null, pcftest.LossDetailsDV_Wc.MetroReportsLV_tb.class);
  }
  
  public BooleanValueElement getModifiedDutyAvailable() {
    return getOrCreateProperty("ModifiedDutyAvailable", "ModifiedDutyAvailable", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public DateElement getNotification_DateNotifiedOfEmployeeRepresentation() {
    return getOrCreateProperty("Notification_DateNotifiedOfEmployeeRepresentation", "Notification_DateNotifiedOfEmployeeRepresentation", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public BooleanValueElement getNotification_FirstNoticeSuit() {
    return getOrCreateProperty("Notification_FirstNoticeSuit", "Notification_FirstNoticeSuit", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getNotification_InsuredReportNumber() {
    return getOrCreateProperty("Notification_InsuredReportNumber", "Notification_InsuredReportNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getOccurrenceDescription() {
    return getOrCreateProperty("OccurrenceDescription", "OccurrenceDescription", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ReportedBy_Picker getReportedBy_Picker() {
    return getOrCreateProperty("ReportedBy_Picker", "ReportedBy_Picker", null, pcftest.LossDetailsDV_Wc.ReportedBy_Picker.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class AccidentPremises extends SelectElement {
    public AccidentPremises(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(typekey.AccidentPremises arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public typekey.AccidentPremises getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.AccidentPremises.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(typekey.AccidentPremises arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim_AccidentType extends SelectElement {
    public Claim_AccidentType(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(AccidentType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public AccidentType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.AccidentType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(AccidentType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim_DetailedInjury extends SelectElement {
    public Claim_DetailedInjury(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(DetailedInjuryType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public DetailedInjuryType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.DetailedInjuryType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(DetailedInjuryType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim_HowReported extends SelectElement {
    public Claim_HowReported(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim_InjuryIllnessCause extends SelectElement {
    public Claim_InjuryIllnessCause(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim_MainContactType extends SelectElement {
    public Claim_MainContactType(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim_PrimaryInjury extends SelectElement {
    public Claim_PrimaryInjury(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(InjuryType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public InjuryType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.InjuryType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(InjuryType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim_Severity extends SelectElement {
    public Claim_Severity(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(SeverityType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public SeverityType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.SeverityType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(SeverityType arg) {
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
    
    public ClaimNewPersonOnlyPickerMenuItemSet getClaimNewPersonOnlyPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewPersonOnlyPickerMenuItemSet", "ClaimNewPersonOnlyPickerMenuItemSet", null, pcftest.ClaimNewPersonOnlyPickerMenuItemSet.class);
    }
    
    public pcftest.LossDetailsDV_Wc.Claimant_Picker.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.LossDetailsDV_Wc.Claimant_Picker.MenuItem_Search.class);
    }
    
    public pcftest.LossDetailsDV_Wc.Claimant_Picker.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.LossDetailsDV_Wc.Claimant_Picker.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Classification extends ValueElement {
    public Classification(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CompensabilityFactors extends ValueElement {
    public CompensabilityFactors(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class CompensabilityFactorsInputSet extends PCFElement {
    public CompensabilityFactorsInputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public BooleanValueElement getClaim_EmploymentInjury() {
      return getOrCreateProperty("Claim_EmploymentInjury", "Claim_EmploymentInjury", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public CompensableInputSet getCompensableInputSet() {
      return getOrCreateProperty("CompensableInputSet", "CompensableInputSet", null, pcftest.CompensableInputSet.class);
    }
    
    public DrugsInvolved getDrugsInvolved() {
      return getOrCreateProperty("DrugsInvolved", "DrugsInvolved", null, pcftest.LossDetailsDV_Wc.CompensabilityFactorsInputSet.DrugsInvolved.class);
    }
    
    public EmployerQuestionsValidity getEmployerQuestionsValidity() {
      return getOrCreateProperty("EmployerQuestionsValidity", "EmployerQuestionsValidity", null, pcftest.LossDetailsDV_Wc.CompensabilityFactorsInputSet.EmployerQuestionsValidity.class);
    }
    
    public ValueElement getEmployerValidityReason() {
      return getOrCreateProperty("EmployerValidityReason", "EmployerValidityReason", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getInjuredOnRegularJob() {
      return getOrCreateProperty("InjuredOnRegularJob", "InjuredOnRegularJob", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public BooleanValueElement getSafetyEquipmentProvided() {
      return getOrCreateProperty("SafetyEquipmentProvided", "SafetyEquipmentProvided", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public BooleanValueElement getSafetyEquipmentUsed() {
      return getOrCreateProperty("SafetyEquipmentUsed", "SafetyEquipmentUsed", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DrugsInvolved extends SelectElement {
      public DrugsInvolved(ISmokeTest helper, PCFElementId componentId)  {
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
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EmployerQuestionsValidity extends SelectElement {
      public EmployerQuestionsValidity(ISmokeTest helper, PCFElementId componentId)  {
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
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ConcurrentEmployment extends SelectElement {
    public ConcurrentEmployment(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ConcurrentEmploymentLV extends PCFElement {
    public ConcurrentEmploymentLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EditableConcurrentEmploymentLV getEditableConcurrentEmploymentLV() {
      return getOrCreateProperty("EditableConcurrentEmploymentLV", "EditableConcurrentEmploymentLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableConcurrentEmploymentLV.class);
    }
    
    public EditableConcurrentEmploymentLV_tb getEditableConcurrentEmploymentLV_tb() {
      return getOrCreateProperty("EditableConcurrentEmploymentLV_tb", "EditableConcurrentEmploymentLV_tb", null, pcftest.LossDetailsDV_Wc.ConcurrentEmploymentLV.EditableConcurrentEmploymentLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableConcurrentEmploymentLV_tb extends PCFElement {
      public EditableConcurrentEmploymentLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.LossDetailsDV_Wc.ConcurrentEmploymentLV.EditableConcurrentEmploymentLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.LossDetailsDV_Wc.ConcurrentEmploymentLV.EditableConcurrentEmploymentLV_tb.Add.class);
      }
      
      public pcftest.LossDetailsDV_Wc.ConcurrentEmploymentLV.EditableConcurrentEmploymentLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.LossDetailsDV_Wc.ConcurrentEmploymentLV.EditableConcurrentEmploymentLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Remove extends ClickableActionElement {
        public Remove(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableBodyPartDetailsLV_tb extends PCFElement {
    public EditableBodyPartDetailsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.LossDetailsDV_Wc.EditableBodyPartDetailsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.LossDetailsDV_Wc.EditableBodyPartDetailsLV_tb.Add.class);
    }
    
    public MakeFirstButton getMakeFirstButton() {
      return getOrCreateProperty("MakeFirstButton", "MakeFirstButton", null, pcftest.LossDetailsDV_Wc.EditableBodyPartDetailsLV_tb.MakeFirstButton.class);
    }
    
    public pcftest.LossDetailsDV_Wc.EditableBodyPartDetailsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.LossDetailsDV_Wc.EditableBodyPartDetailsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MakeFirstButton extends ClickableActionElement {
      public MakeFirstButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableOfficialsLV_tb extends PCFElement {
    public EditableOfficialsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.LossDetailsDV_Wc.EditableOfficialsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.LossDetailsDV_Wc.EditableOfficialsLV_tb.Add.class);
    }
    
    public pcftest.LossDetailsDV_Wc.EditableOfficialsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.LossDetailsDV_Wc.EditableOfficialsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableOtherBenefitsLV_tb extends PCFElement {
    public EditableOtherBenefitsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.LossDetailsDV_Wc.EditableOtherBenefitsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.LossDetailsDV_Wc.EditableOtherBenefitsLV_tb.Add.class);
    }
    
    public pcftest.LossDetailsDV_Wc.EditableOtherBenefitsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.LossDetailsDV_Wc.EditableOtherBenefitsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EmploymentData_EmploymentStatus extends SelectElement {
    public EmploymentData_EmploymentStatus(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(EmploymentStatusType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public EmploymentStatusType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.EmploymentStatusType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(EmploymentStatusType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EmploymentData_HireState extends SelectElement {
    public EmploymentData_HireState(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(State arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public State getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.State.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(State arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EmploymentData_PayPeriod extends SelectElement {
    public EmploymentData_PayPeriod(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(PayPeriodType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public PayPeriodType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.PayPeriodType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(PayPeriodType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EmploymentData_SupervisorPicker extends SelectElement {
    public EmploymentData_SupervisorPicker(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewPersonOnlyPickerMenuItemSet getClaimNewPersonOnlyPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewPersonOnlyPickerMenuItemSet", "ClaimNewPersonOnlyPickerMenuItemSet", null, pcftest.ClaimNewPersonOnlyPickerMenuItemSet.class);
    }
    
    public pcftest.LossDetailsDV_Wc.EmploymentData_SupervisorPicker.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.LossDetailsDV_Wc.EmploymentData_SupervisorPicker.MenuItem_Search.class);
    }
    
    public pcftest.LossDetailsDV_Wc.EmploymentData_SupervisorPicker.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.LossDetailsDV_Wc.EmploymentData_SupervisorPicker.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class KeyWCDates extends ValueElement {
    public KeyWCDates(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MainContact_Picker extends SelectElement {
    public MainContact_Picker(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewPersonOnlyPickerMenuItemSet getClaimNewPersonOnlyPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewPersonOnlyPickerMenuItemSet", "ClaimNewPersonOnlyPickerMenuItemSet", null, pcftest.ClaimNewPersonOnlyPickerMenuItemSet.class);
    }
    
    public pcftest.LossDetailsDV_Wc.MainContact_Picker.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.LossDetailsDV_Wc.MainContact_Picker.MenuItem_Search.class);
    }
    
    public pcftest.LossDetailsDV_Wc.MainContact_Picker.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.LossDetailsDV_Wc.MainContact_Picker.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MetroReportsLV_tb extends PCFElement {
    public MetroReportsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.LossDetailsDV_Wc.MetroReportsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.LossDetailsDV_Wc.MetroReportsLV_tb.Add.class);
    }
    
    public pcftest.LossDetailsDV_Wc.MetroReportsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.LossDetailsDV_Wc.MetroReportsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/lossdetails/LossDetailsDV.Wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ReportedBy_Picker extends SelectElement {
    public ReportedBy_Picker(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ClaimContactDetailPopup click() {
      return clickThis(pcftest.ClaimContactDetailPopup.class);
    }
    
    public ClaimNewPersonOnlyPickerMenuItemSet getClaimNewPersonOnlyPickerMenuItemSet() {
      return getOrCreateProperty("ClaimNewPersonOnlyPickerMenuItemSet", "ClaimNewPersonOnlyPickerMenuItemSet", null, pcftest.ClaimNewPersonOnlyPickerMenuItemSet.class);
    }
    
    public pcftest.LossDetailsDV_Wc.ReportedBy_Picker.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.LossDetailsDV_Wc.ReportedBy_Picker.MenuItem_Search.class);
    }
    
    public pcftest.LossDetailsDV_Wc.ReportedBy_Picker.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.LossDetailsDV_Wc.ReportedBy_Picker.MenuItem_ViewDetails.class);
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