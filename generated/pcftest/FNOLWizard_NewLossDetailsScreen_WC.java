package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.ClickableActionElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.MessagesElement;
import gw.smoketest.platform.web.OptionElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.SelectElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claim_AccidentPremises;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claim_AccidentType;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claim_ConcurrentEmploymentLV;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claim_ConcurrentEmploymentLV.EditableConcurrentEmploymentLV_tb;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claim_DetailedInjury;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claim_DrugsInvolved;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claim_InjuryIllnessCause;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claim_JurisdictionState;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claim_PrimaryInjury;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claim_Severity;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claimant_Gender;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claimant_MaritalStatus;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claimant_Picker;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.EditableBodyPartDetailsLV_tb;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.EditableBodyPartDetailsLV_tb.MakeFirstButton;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.EditableOfficialsLV_tb;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.EditableWorkStatusChangesLV_tb;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.EmploymentData_CardTab;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.EmploymentData_EmploymentStatus;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.EmploymentData_HireState;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.EmploymentData_SupervisorPicker;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.Injury_CardTab;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.MedicalReport_InputSet;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.MedicalReport_InputSet.MedCase_FirstIntakeDoctor;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.MedicalReport_InputSet.MedCase_Hospital;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.MedicalReport_InputSet.MedCase_InitialTreatment;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.MedicalReport_InputSet.MedCase_MedicalTreatment;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.Officials_CardTab;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.TimeLoss_CardTab;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.TimeLoss_InputSet;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.TimeLoss_InputSet.Claim_ConcurrentEmployment;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC.TimeLoss_InputSet.EmploymentData_PayPeriod;
import pcftest.FNOLWizard_NewLossDetailsScreen_WC._msgs;
import typekey.AccidentPremises;
import typekey.AccidentType;
import typekey.DetailedInjuryType;
import typekey.EmploymentStatusType;
import typekey.GenderType;
import typekey.InitialTreatment;
import typekey.InjuryType;
import typekey.Jurisdiction;
import typekey.LossCause;
import typekey.MaritalStatus;
import typekey.MedicalTreatmentType;
import typekey.PayPeriodType;
import typekey.SeverityType;
import typekey.State;
import typekey.YesNo;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class FNOLWizard_NewLossDetailsScreen_WC extends FNOLWizard_NewLossDetailsScreen {
  public final static String CHECKSUM = "8451b2fa3b5349e881d65160b1e2a967";
  
  public FNOLWizard_NewLossDetailsScreen_WC(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public CCAddressInputSet getCCAddressInputSet() {
    return getOrCreateProperty("CCAddressInputSet", "CCAddressInputSet", null, pcftest.CCAddressInputSet.class);
  }
  
  public SelectElement getCatastrophe_CatastropheNumber() {
    return getOrCreateProperty("Catastrophe_CatastropheNumber", "Catastrophe_CatastropheNumber", null, gw.smoketest.platform.web.SelectElement.class);
  }
  
  public Claim_AccidentPremises getClaim_AccidentPremises() {
    return getOrCreateProperty("Claim_AccidentPremises", "Claim_AccidentPremises", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claim_AccidentPremises.class);
  }
  
  public Claim_AccidentType getClaim_AccidentType() {
    return getOrCreateProperty("Claim_AccidentType", "Claim_AccidentType", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claim_AccidentType.class);
  }
  
  public ValueElement getClaim_ActivityPerformed() {
    return getOrCreateProperty("Claim_ActivityPerformed", "Claim_ActivityPerformed", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Claim_ConcurrentEmploymentLV getClaim_ConcurrentEmploymentLV() {
    return getOrCreateProperty("Claim_ConcurrentEmploymentLV", "Claim_ConcurrentEmploymentLV", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claim_ConcurrentEmploymentLV.class);
  }
  
  public Claim_DetailedInjury getClaim_DetailedInjury() {
    return getOrCreateProperty("Claim_DetailedInjury", "Claim_DetailedInjury", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claim_DetailedInjury.class);
  }
  
  public Claim_DrugsInvolved getClaim_DrugsInvolved() {
    return getOrCreateProperty("Claim_DrugsInvolved", "Claim_DrugsInvolved", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claim_DrugsInvolved.class);
  }
  
  public BooleanValueElement getClaim_EmploymentInjury() {
    return getOrCreateProperty("Claim_EmploymentInjury", "Claim_EmploymentInjury", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getClaim_EquipmentUsed() {
    return getOrCreateProperty("Claim_EquipmentUsed", "Claim_EquipmentUsed", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClaim_InjuryDescription() {
    return getOrCreateProperty("Claim_InjuryDescription", "Claim_InjuryDescription", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Claim_InjuryIllnessCause getClaim_InjuryIllnessCause() {
    return getOrCreateProperty("Claim_InjuryIllnessCause", "Claim_InjuryIllnessCause", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claim_InjuryIllnessCause.class);
  }
  
  public DateElement getClaim_InjuryIllnessDate() {
    return getOrCreateProperty("Claim_InjuryIllnessDate", "Claim_InjuryIllnessDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public Claim_JurisdictionState getClaim_JurisdictionState() {
    return getOrCreateProperty("Claim_JurisdictionState", "Claim_JurisdictionState", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claim_JurisdictionState.class);
  }
  
  public ValueElement getClaim_OccurrenceDescription() {
    return getOrCreateProperty("Claim_OccurrenceDescription", "Claim_OccurrenceDescription", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Claim_PrimaryInjury getClaim_PrimaryInjury() {
    return getOrCreateProperty("Claim_PrimaryInjury", "Claim_PrimaryInjury", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claim_PrimaryInjury.class);
  }
  
  public DateElement getClaim_ReportedDate() {
    return getOrCreateProperty("Claim_ReportedDate", "Claim_ReportedDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public BooleanValueElement getClaim_SafetyEquipmentProvided() {
    return getOrCreateProperty("Claim_SafetyEquipmentProvided", "Claim_SafetyEquipmentProvided", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getClaim_SafetyEquipmentUsed() {
    return getOrCreateProperty("Claim_SafetyEquipmentUsed", "Claim_SafetyEquipmentUsed", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Claim_Severity getClaim_Severity() {
    return getOrCreateProperty("Claim_Severity", "Claim_Severity", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claim_Severity.class);
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
  
  public Claimant_Gender getClaimant_Gender() {
    return getOrCreateProperty("Claimant_Gender", "Claimant_Gender", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claimant_Gender.class);
  }
  
  public Claimant_MaritalStatus getClaimant_MaritalStatus() {
    return getOrCreateProperty("Claimant_MaritalStatus", "Claimant_MaritalStatus", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claimant_MaritalStatus.class);
  }
  
  public ValueElement getClaimant_Phone() {
    return getOrCreateProperty("Claimant_Phone", "Claimant_Phone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public Claimant_Picker getClaimant_Picker() {
    return getOrCreateProperty("Claimant_Picker", "Claimant_Picker", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claimant_Picker.class);
  }
  
  public ValueElement getClaimant_TaxNumber() {
    return getOrCreateProperty("Claimant_TaxNumber", "Claimant_TaxNumber", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getDateReportedtoEmployer() {
    return getOrCreateProperty("DateReportedtoEmployer", "DateReportedtoEmployer", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public EditableBodyPartDetailsLV getEditableBodyPartDetailsLV() {
    return getOrCreateProperty("EditableBodyPartDetailsLV", "EditableBodyPartDetailsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableBodyPartDetailsLV.class);
  }
  
  public EditableBodyPartDetailsLV_tb getEditableBodyPartDetailsLV_tb() {
    return getOrCreateProperty("EditableBodyPartDetailsLV_tb", "EditableBodyPartDetailsLV_tb", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.EditableBodyPartDetailsLV_tb.class);
  }
  
  public EditableOfficialsLV getEditableOfficialsLV() {
    return getOrCreateProperty("EditableOfficialsLV", "EditableOfficialsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableOfficialsLV.class);
  }
  
  public EditableOfficialsLV_tb getEditableOfficialsLV_tb() {
    return getOrCreateProperty("EditableOfficialsLV_tb", "EditableOfficialsLV_tb", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.EditableOfficialsLV_tb.class);
  }
  
  public EditableWorkStatusChangesLV getEditableWorkStatusChangesLV() {
    return getOrCreateProperty("EditableWorkStatusChangesLV", "EditableWorkStatusChangesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableWorkStatusChangesLV.class);
  }
  
  public EditableWorkStatusChangesLV_tb getEditableWorkStatusChangesLV_tb() {
    return getOrCreateProperty("EditableWorkStatusChangesLV_tb", "EditableWorkStatusChangesLV_tb", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.EditableWorkStatusChangesLV_tb.class);
  }
  
  public EmploymentData_CardTab getEmploymentData_CardTab() {
    return getOrCreateProperty("EmploymentData_CardTab", "EmploymentData_CardTab", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.EmploymentData_CardTab.class);
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
  
  public ValueElement getEmploymentData_EmploymentLocation() {
    return getOrCreateProperty("EmploymentData_EmploymentLocation", "EmploymentData_EmploymentLocation", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public EmploymentData_EmploymentStatus getEmploymentData_EmploymentStatus() {
    return getOrCreateProperty("EmploymentData_EmploymentStatus", "EmploymentData_EmploymentStatus", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.EmploymentData_EmploymentStatus.class);
  }
  
  public DateElement getEmploymentData_HireDate() {
    return getOrCreateProperty("EmploymentData_HireDate", "EmploymentData_HireDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public EmploymentData_HireState getEmploymentData_HireState() {
    return getOrCreateProperty("EmploymentData_HireState", "EmploymentData_HireState", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.EmploymentData_HireState.class);
  }
  
  public DateElement getEmploymentData_InjuryStartDate() {
    return getOrCreateProperty("EmploymentData_InjuryStartDate", "EmploymentData_InjuryStartDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getEmploymentData_InjuryStartTime() {
    return getOrCreateProperty("EmploymentData_InjuryStartTime", "EmploymentData_InjuryStartTime", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getEmploymentData_Occupation() {
    return getOrCreateProperty("EmploymentData_Occupation", "EmploymentData_Occupation", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public EmploymentData_SupervisorPicker getEmploymentData_SupervisorPicker() {
    return getOrCreateProperty("EmploymentData_SupervisorPicker", "EmploymentData_SupervisorPicker", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.EmploymentData_SupervisorPicker.class);
  }
  
  public BooleanValueElement getInjurySeverity_DeathReport() {
    return getOrCreateProperty("InjurySeverity_DeathReport", "InjurySeverity_DeathReport", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public CheckboxValueElement getInjurySeverity_IncidentReport() {
    return getOrCreateProperty("InjurySeverity_IncidentReport", "InjurySeverity_IncidentReport", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
  }
  
  public BooleanValueElement getInjurySeverity_MedicalReport() {
    return getOrCreateProperty("InjurySeverity_MedicalReport", "InjurySeverity_MedicalReport", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getInjurySeverity_TimeLossReport() {
    return getOrCreateProperty("InjurySeverity_TimeLossReport", "InjurySeverity_TimeLossReport", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public Injury_CardTab getInjury_CardTab() {
    return getOrCreateProperty("Injury_CardTab", "Injury_CardTab", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.Injury_CardTab.class);
  }
  
  public MedicalReport_InputSet getMedicalReport_InputSet() {
    return getOrCreateProperty("MedicalReport_InputSet", "MedicalReport_InputSet", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.MedicalReport_InputSet.class);
  }
  
  public Officials_CardTab getOfficials_CardTab() {
    return getOrCreateProperty("Officials_CardTab", "Officials_CardTab", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.Officials_CardTab.class);
  }
  
  public TimeLoss_CardTab getTimeLoss_CardTab() {
    return getOrCreateProperty("TimeLoss_CardTab", "TimeLoss_CardTab", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.TimeLoss_CardTab.class);
  }
  
  public TimeLoss_InputSet getTimeLoss_InputSet() {
    return getOrCreateProperty("TimeLoss_InputSet", "TimeLoss_InputSet", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.TimeLoss_InputSet.class);
  }
  
  public _msgs get_msgs() {
    return getOrCreateProperty("_msgs", "_msgs", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC._msgs.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim_AccidentPremises extends SelectElement {
    public Claim_AccidentPremises(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(AccidentPremises arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public AccidentPremises getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.AccidentPremises.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(AccidentPremises arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim_ConcurrentEmploymentLV extends PCFElement {
    public Claim_ConcurrentEmploymentLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public EditableConcurrentEmploymentLV getEditableConcurrentEmploymentLV() {
      return getOrCreateProperty("EditableConcurrentEmploymentLV", "EditableConcurrentEmploymentLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.EditableConcurrentEmploymentLV.class);
    }
    
    public EditableConcurrentEmploymentLV_tb getEditableConcurrentEmploymentLV_tb() {
      return getOrCreateProperty("EditableConcurrentEmploymentLV_tb", "EditableConcurrentEmploymentLV_tb", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claim_ConcurrentEmploymentLV.EditableConcurrentEmploymentLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EditableConcurrentEmploymentLV_tb extends PCFElement {
      public EditableConcurrentEmploymentLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claim_ConcurrentEmploymentLV.EditableConcurrentEmploymentLV_tb.Add getAdd() {
        return getOrCreateProperty("Add", "Add", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claim_ConcurrentEmploymentLV.EditableConcurrentEmploymentLV_tb.Add.class);
      }
      
      public pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claim_ConcurrentEmploymentLV.EditableConcurrentEmploymentLV_tb.Remove getRemove() {
        return getOrCreateProperty("Remove", "Remove", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claim_ConcurrentEmploymentLV.EditableConcurrentEmploymentLV_tb.Remove.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class Add extends ClickableActionElement {
        public Add(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim_DrugsInvolved extends SelectElement {
    public Claim_DrugsInvolved(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claim_JurisdictionState extends SelectElement {
    public Claim_JurisdictionState(ISmokeTest helper, PCFElementId componentId)  {
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claimant_Gender extends SelectElement {
    public Claimant_Gender(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(GenderType arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public GenderType getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.GenderType.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(GenderType arg) {
      setValue(arg == null ? null : arg.getCode());
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Claimant_MaritalStatus extends SelectElement {
    public Claimant_MaritalStatus(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public OptionElement getOptionByTypeKey(MaritalStatus arg) {
      return getOptionByValue(arg == null ? null : arg.getCode());
    }
    
    public MaritalStatus getTypeKeyValue() {
      String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.MaritalStatus.getTypeKey(myValue);
    }
    
    public void setTypeKeyValue(MaritalStatus arg) {
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
    
    public pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claimant_Picker.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claimant_Picker.MenuItem_Search.class);
    }
    
    public pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claimant_Picker.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.Claimant_Picker.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableBodyPartDetailsLV_tb extends PCFElement {
    public EditableBodyPartDetailsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.FNOLWizard_NewLossDetailsScreen_WC.EditableBodyPartDetailsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.EditableBodyPartDetailsLV_tb.Add.class);
    }
    
    public MakeFirstButton getMakeFirstButton() {
      return getOrCreateProperty("MakeFirstButton", "MakeFirstButton", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.EditableBodyPartDetailsLV_tb.MakeFirstButton.class);
    }
    
    public pcftest.FNOLWizard_NewLossDetailsScreen_WC.EditableBodyPartDetailsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.EditableBodyPartDetailsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MakeFirstButton extends ClickableActionElement {
      public MakeFirstButton(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableOfficialsLV_tb extends PCFElement {
    public EditableOfficialsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.FNOLWizard_NewLossDetailsScreen_WC.EditableOfficialsLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.EditableOfficialsLV_tb.Add.class);
    }
    
    public pcftest.FNOLWizard_NewLossDetailsScreen_WC.EditableOfficialsLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.EditableOfficialsLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EditableWorkStatusChangesLV_tb extends PCFElement {
    public EditableWorkStatusChangesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.FNOLWizard_NewLossDetailsScreen_WC.EditableWorkStatusChangesLV_tb.Add getAdd() {
      return getOrCreateProperty("Add", "Add", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.EditableWorkStatusChangesLV_tb.Add.class);
    }
    
    public pcftest.FNOLWizard_NewLossDetailsScreen_WC.EditableWorkStatusChangesLV_tb.Remove getRemove() {
      return getOrCreateProperty("Remove", "Remove", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.EditableWorkStatusChangesLV_tb.Remove.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Add extends ClickableActionElement {
      public Add(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class EmploymentData_CardTab extends ClickableActionElement {
    public EmploymentData_CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    public pcftest.FNOLWizard_NewLossDetailsScreen_WC.EmploymentData_SupervisorPicker.MenuItem_Search getMenuItem_Search() {
      return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.EmploymentData_SupervisorPicker.MenuItem_Search.class);
    }
    
    public pcftest.FNOLWizard_NewLossDetailsScreen_WC.EmploymentData_SupervisorPicker.MenuItem_ViewDetails getMenuItem_ViewDetails() {
      return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.EmploymentData_SupervisorPicker.MenuItem_ViewDetails.class);
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
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Injury_CardTab extends ClickableActionElement {
    public Injury_CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class MedicalReport_InputSet extends PCFElement {
    public MedicalReport_InputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public DateElement getMedCase_ExaminationDate() {
      return getOrCreateProperty("MedCase_ExaminationDate", "MedCase_ExaminationDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public MedCase_FirstIntakeDoctor getMedCase_FirstIntakeDoctor() {
      return getOrCreateProperty("MedCase_FirstIntakeDoctor", "MedCase_FirstIntakeDoctor", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.MedicalReport_InputSet.MedCase_FirstIntakeDoctor.class);
    }
    
    public MedCase_Hospital getMedCase_Hospital() {
      return getOrCreateProperty("MedCase_Hospital", "MedCase_Hospital", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.MedicalReport_InputSet.MedCase_Hospital.class);
    }
    
    public DateElement getMedCase_HospitalDate() {
      return getOrCreateProperty("MedCase_HospitalDate", "MedCase_HospitalDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getMedCase_HospitalDays() {
      return getOrCreateProperty("MedCase_HospitalDays", "MedCase_HospitalDays", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public MedCase_InitialTreatment getMedCase_InitialTreatment() {
      return getOrCreateProperty("MedCase_InitialTreatment", "MedCase_InitialTreatment", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.MedicalReport_InputSet.MedCase_InitialTreatment.class);
    }
    
    public ValueElement getMedCase_MedicalDiagnosis() {
      return getOrCreateProperty("MedCase_MedicalDiagnosis", "MedCase_MedicalDiagnosis", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public MedCase_MedicalTreatment getMedCase_MedicalTreatment() {
      return getOrCreateProperty("MedCase_MedicalTreatment", "MedCase_MedicalTreatment", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.MedicalReport_InputSet.MedCase_MedicalTreatment.class);
    }
    
    public ValueElement getMedCase_TreatmentRend() {
      return getOrCreateProperty("MedCase_TreatmentRend", "MedCase_TreatmentRend", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MedCase_FirstIntakeDoctor extends SelectElement {
      public MedCase_FirstIntakeDoctor(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
        return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
      }
      
      public pcftest.FNOLWizard_NewLossDetailsScreen_WC.MedicalReport_InputSet.MedCase_FirstIntakeDoctor.MenuItem_Search getMenuItem_Search() {
        return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.MedicalReport_InputSet.MedCase_FirstIntakeDoctor.MenuItem_Search.class);
      }
      
      public pcftest.FNOLWizard_NewLossDetailsScreen_WC.MedicalReport_InputSet.MedCase_FirstIntakeDoctor.MenuItem_ViewDetails getMenuItem_ViewDetails() {
        return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.MedicalReport_InputSet.MedCase_FirstIntakeDoctor.MenuItem_ViewDetails.class);
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
    @Generated(comments = "config/web/widgets/ClaimContactWidget.xml", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MedCase_Hospital extends SelectElement {
      public MedCase_Hospital(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ClaimContactDetailPopup click() {
        return clickThis(pcftest.ClaimContactDetailPopup.class);
      }
      
      public ClaimNewContactPickerMenuItemSet getClaimNewContactPickerMenuItemSet() {
        return getOrCreateProperty("ClaimNewContactPickerMenuItemSet", "ClaimNewContactPickerMenuItemSet", null, pcftest.ClaimNewContactPickerMenuItemSet.class);
      }
      
      public pcftest.FNOLWizard_NewLossDetailsScreen_WC.MedicalReport_InputSet.MedCase_Hospital.MenuItem_Search getMenuItem_Search() {
        return getOrCreateProperty("MenuItem_Search", "MenuItem_Search", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.MedicalReport_InputSet.MedCase_Hospital.MenuItem_Search.class);
      }
      
      public pcftest.FNOLWizard_NewLossDetailsScreen_WC.MedicalReport_InputSet.MedCase_Hospital.MenuItem_ViewDetails getMenuItem_ViewDetails() {
        return getOrCreateProperty("MenuItem_ViewDetails", "MenuItem_ViewDetails", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.MedicalReport_InputSet.MedCase_Hospital.MenuItem_ViewDetails.class);
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
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MedCase_InitialTreatment extends SelectElement {
      public MedCase_InitialTreatment(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(InitialTreatment arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public InitialTreatment getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.InitialTreatment.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(InitialTreatment arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class MedCase_MedicalTreatment extends SelectElement {
      public MedCase_MedicalTreatment(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public OptionElement getOptionByTypeKey(MedicalTreatmentType arg) {
        return getOptionByValue(arg == null ? null : arg.getCode());
      }
      
      public MedicalTreatmentType getTypeKeyValue() {
        String myValue = getValue();return myValue == null || myValue.isEmpty() ? null : typekey.MedicalTreatmentType.getTypeKey(myValue);
      }
      
      public void setTypeKeyValue(MedicalTreatmentType arg) {
        setValue(arg == null ? null : arg.getCode());
      }
      
      
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class Officials_CardTab extends ClickableActionElement {
    public Officials_CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TimeLoss_CardTab extends ClickableActionElement {
    public TimeLoss_CardTab(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class TimeLoss_InputSet extends PCFElement {
    public TimeLoss_InputSet(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public Claim_ConcurrentEmployment getClaim_ConcurrentEmployment() {
      return getOrCreateProperty("Claim_ConcurrentEmployment", "Claim_ConcurrentEmployment", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.TimeLoss_InputSet.Claim_ConcurrentEmployment.class);
    }
    
    public BooleanValueElement getClaim_InjuredOnRegularJob() {
      return getOrCreateProperty("Claim_InjuredOnRegularJob", "Claim_InjuredOnRegularJob", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public BooleanValueElement getClaim_ModifiedDutyAvailable() {
      return getOrCreateProperty("Claim_ModifiedDutyAvailable", "Claim_ModifiedDutyAvailable", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getEmploymentData_DiscontinuedFringeBenefits() {
      return getOrCreateProperty("EmploymentData_DiscontinuedFringeBenefits", "EmploymentData_DiscontinuedFringeBenefits", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getEmploymentData_NumDaysWorkedPerWeek() {
      return getOrCreateProperty("EmploymentData_NumDaysWorkedPerWeek", "EmploymentData_NumDaysWorkedPerWeek", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getEmploymentData_NumHoursWorkedPerDay() {
      return getOrCreateProperty("EmploymentData_NumHoursWorkedPerDay", "EmploymentData_NumHoursWorkedPerDay", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getEmploymentData_PaidFullWages() {
      return getOrCreateProperty("EmploymentData_PaidFullWages", "EmploymentData_PaidFullWages", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public EmploymentData_PayPeriod getEmploymentData_PayPeriod() {
      return getOrCreateProperty("EmploymentData_PayPeriod", "EmploymentData_PayPeriod", null, pcftest.FNOLWizard_NewLossDetailsScreen_WC.TimeLoss_InputSet.EmploymentData_PayPeriod.class);
    }
    
    public ValueElement getEmploymentData_WageAmount() {
      return getOrCreateProperty("EmploymentData_WageAmount", "EmploymentData_WageAmount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getEmploymentData_WagePaymentContinued() {
      return getOrCreateProperty("EmploymentData_WagePaymentContinued", "EmploymentData_WagePaymentContinued", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class Claim_ConcurrentEmployment extends SelectElement {
      public Claim_ConcurrentEmployment(ISmokeTest helper, PCFElementId componentId)  {
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
    @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/FNOL/FNOLWizard_NewLossDetailsScreen.WC.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class _msgs extends MessagesElement {
    public _msgs(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public PCFLocation click() {
      return clickThis(gw.smoketest.platform.web.PCFLocation.class);
    }
    
    
  }
  
  
}