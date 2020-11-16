package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
import gw.smoketest.platform.web.DateElement;
import gw.smoketest.platform.web.DetailViewElement;
import gw.smoketest.platform.web.IteratorEntriesWithPaging;
import gw.smoketest.platform.web.IteratorEntryCheckboxElement;
import gw.smoketest.platform.web.PCFElement;
import gw.smoketest.platform.web.PCFElementId;
import gw.smoketest.platform.web.PCFLocation;
import gw.smoketest.platform.web.PagingElement;
import gw.smoketest.platform.web.RowElement;
import gw.smoketest.platform.web.SelectorCellElement;
import gw.smoketest.platform.web.ValueElement;
import gw.testharness.ISmokeTest;
import javax.annotation.processing.Generated;
import pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV;
import pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.BodyPartsLV;
import pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.BodyPartsLV.DetailedBodyPartHeader;
import pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.BodyPartsLV.PrimaryBodyPartHeader;
import pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.BodyPartsLV_tb;
import pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.ConcurrentEmplLV;
import pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.ConcurrentEmplLV.CompanyNameHeader;
import pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.ConcurrentEmplLV.EndDateHeader;
import pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.ConcurrentEmplLV.FullTimeHeader;
import pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.ConcurrentEmplLV.JobTitleHeader;
import pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.ConcurrentEmplLV.StartDateHeader;
import pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.ConcurrentEmplLV.WeeklyWageHeader;
import pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.ConcurrentEmplLV_tb;
import pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.OfficialsLV;
import pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.OfficialsLV.NameHeader;
import pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.OfficialsLV.ReportNumberHeader;
import pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.OfficialsLV.TypeHeader;
import pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.OfficialsLV_tb;
import pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.WorkStatusChangesLV;
import pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.WorkStatusChangesLV.CommentsHeader;
import pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.WorkStatusChangesLV.StatusDateHeader;
import pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.WorkStatusChangesLV.StatusHeader;
import pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.WorkStatusChangesLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotGeneral600PanelSet_wc extends ClaimSnapshotGeneral600PanelSet {
  public final static String CHECKSUM = "f0ef1a9985b57180b50a77da684b368a";
  
  public ClaimSnapshotGeneral600PanelSet_wc(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ClaimSnapshotGeneral600DV getClaimSnapshotGeneral600DV() {
    return getOrCreateProperty("ClaimSnapshotGeneral600DV", "ClaimSnapshotGeneral600DV", null, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ClaimSnapshotGeneral600DV extends DetailViewElement {
    public ClaimSnapshotGeneral600DV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ValueElement getAccidentType() {
      return getOrCreateProperty("AccidentType", "AccidentType", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getActivityPerformed() {
      return getOrCreateProperty("ActivityPerformed", "ActivityPerformed", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public AddressSnapshot600InputSet getAddressSnapshot600InputSet() {
      return getOrCreateProperty("AddressSnapshot600InputSet", "AddressSnapshot600InputSet", null, pcftest.AddressSnapshot600InputSet.class);
    }
    
    public BodyPartsLV getBodyPartsLV() {
      return getOrCreateProperty("BodyPartsLV", "BodyPartsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.BodyPartsLV.class);
    }
    
    public BodyPartsLV_tb getBodyPartsLV_tb() {
      return getOrCreateProperty("BodyPartsLV_tb", "BodyPartsLV_tb", null, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.BodyPartsLV_tb.class);
    }
    
    public ValueElement getCatastrophe() {
      return getOrCreateProperty("Catastrophe", "Catastrophe", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getClaimant() {
      return getOrCreateProperty("Claimant", "Claimant", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ConcurrentEmplLV getConcurrentEmplLV() {
      return getOrCreateProperty("ConcurrentEmplLV", "ConcurrentEmplLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.ConcurrentEmplLV.class);
    }
    
    public ConcurrentEmplLV_tb getConcurrentEmplLV_tb() {
      return getOrCreateProperty("ConcurrentEmplLV_tb", "ConcurrentEmplLV_tb", null, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.ConcurrentEmplLV_tb.class);
    }
    
    public ValueElement getConcurrentEmployment() {
      return getOrCreateProperty("ConcurrentEmployment", "ConcurrentEmployment", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getContactProhibited() {
      return getOrCreateProperty("ContactProhibited", "ContactProhibited", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public DateElement getCreateTime() {
      return getOrCreateProperty("CreateTime", "CreateTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getDateOfBirth() {
      return getOrCreateProperty("DateOfBirth", "DateOfBirth", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getDateOfInjury() {
      return getOrCreateProperty("DateOfInjury", "DateOfInjury", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getDateRptdToEmployer() {
      return getOrCreateProperty("DateRptdToEmployer", "DateRptdToEmployer", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getDeathDate() {
      return getOrCreateProperty("DeathDate", "DeathDate", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getDeathReport() {
      return getOrCreateProperty("DeathReport", "DeathReport", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getDescription() {
      return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getDetailedInjury() {
      return getOrCreateProperty("DetailedInjury", "DetailedInjury", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getDrugsInvolved() {
      return getOrCreateProperty("DrugsInvolved", "DrugsInvolved", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getEmpClass() {
      return getOrCreateProperty("EmpClass", "EmpClass", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getEmploymentInjury() {
      return getOrCreateProperty("EmploymentInjury", "EmploymentInjury", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getEmploymentStatus() {
      return getOrCreateProperty("EmploymentStatus", "EmploymentStatus", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getEquipmentUsed() {
      return getOrCreateProperty("EquipmentUsed", "EquipmentUsed", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getFirstNoticeSuit() {
      return getOrCreateProperty("FirstNoticeSuit", "FirstNoticeSuit", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public DateElement getHireDate() {
      return getOrCreateProperty("HireDate", "HireDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getHireState() {
      return getOrCreateProperty("HireState", "HireState", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public CheckboxValueElement getIncidentReport() {
      return getOrCreateProperty("IncidentReport", "IncidentReport", gw.smoketest.platform.web.PCFElementId.PCFElementScope.BooleanCheckboxValue, gw.smoketest.platform.web.CheckboxValueElement.class);
    }
    
    public BooleanValueElement getInjuredRegularJob() {
      return getOrCreateProperty("InjuredRegularJob", "InjuredRegularJob", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getInjuryDescription() {
      return getOrCreateProperty("InjuryDescription", "InjuryDescription", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getInjuryStartDate() {
      return getOrCreateProperty("InjuryStartDate", "InjuryStartDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public DateElement getInjuryStartTime() {
      return getOrCreateProperty("InjuryStartTime", "InjuryStartTime", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public BooleanValueElement getInsuredPremises() {
      return getOrCreateProperty("InsuredPremises", "InsuredPremises", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getJurisdictionState() {
      return getOrCreateProperty("JurisdictionState", "JurisdictionState", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getLOBCode() {
      return getOrCreateProperty("LOBCode", "LOBCode", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getLocationCode() {
      return getOrCreateProperty("LocationCode", "LocationCode", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getLocationDescription() {
      return getOrCreateProperty("LocationDescription", "LocationDescription", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getLossCause() {
      return getOrCreateProperty("LossCause", "LossCause", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getLossType() {
      return getOrCreateProperty("LossType", "LossType", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMainContact() {
      return getOrCreateProperty("MainContact", "MainContact", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMainContactType() {
      return getOrCreateProperty("MainContactType", "MainContactType", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getMedCase_ExaminationDate() {
      return getOrCreateProperty("MedCase_ExaminationDate", "MedCase_ExaminationDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getMedCase_FirstIntakeDoctor() {
      return getOrCreateProperty("MedCase_FirstIntakeDoctor", "MedCase_FirstIntakeDoctor", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMedCase_Hospital() {
      return getOrCreateProperty("MedCase_Hospital", "MedCase_Hospital", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getMedCase_HospitalDate() {
      return getOrCreateProperty("MedCase_HospitalDate", "MedCase_HospitalDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getMedCase_HospitalDays() {
      return getOrCreateProperty("MedCase_HospitalDays", "MedCase_HospitalDays", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMedCase_MedicalDiagnosis() {
      return getOrCreateProperty("MedCase_MedicalDiagnosis", "MedCase_MedicalDiagnosis", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMedCase_MedicalTreatment() {
      return getOrCreateProperty("MedCase_MedicalTreatment", "MedCase_MedicalTreatment", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getMedCase_TreatmentRend() {
      return getOrCreateProperty("MedCase_TreatmentRend", "MedCase_TreatmentRend", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getMedicalReport() {
      return getOrCreateProperty("MedicalReport", "MedicalReport", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public BooleanValueElement getModifiedDutyAvail() {
      return getOrCreateProperty("ModifiedDutyAvail", "ModifiedDutyAvail", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getNumDaysWorked() {
      return getOrCreateProperty("NumDaysWorked", "NumDaysWorked", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getNumHoursWorked() {
      return getOrCreateProperty("NumHoursWorked", "NumHoursWorked", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getOccupation() {
      return getOrCreateProperty("Occupation", "Occupation", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public OfficialsLV getOfficialsLV() {
      return getOrCreateProperty("OfficialsLV", "OfficialsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.OfficialsLV.class);
    }
    
    public OfficialsLV_tb getOfficialsLV_tb() {
      return getOrCreateProperty("OfficialsLV_tb", "OfficialsLV_tb", null, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.OfficialsLV_tb.class);
    }
    
    public BooleanValueElement getPaidFull() {
      return getOrCreateProperty("PaidFull", "PaidFull", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getPayPeriod() {
      return getOrCreateProperty("PayPeriod", "PayPeriod", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPrimaryAddress() {
      return getOrCreateProperty("PrimaryAddress", "PrimaryAddress", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPrimaryInjury() {
      return getOrCreateProperty("PrimaryInjury", "PrimaryInjury", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getPrimaryPhone() {
      return getOrCreateProperty("PrimaryPhone", "PrimaryPhone", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getReportedByType() {
      return getOrCreateProperty("ReportedByType", "ReportedByType", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public DateElement getReportedDate() {
      return getOrCreateProperty("ReportedDate", "ReportedDate", null, gw.smoketest.platform.web.DateElement.class);
    }
    
    public ValueElement getReporter() {
      return getOrCreateProperty("Reporter", "Reporter", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getSafetyEquipProv() {
      return getOrCreateProperty("SafetyEquipProv", "SafetyEquipProv", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public BooleanValueElement getSafetyEquipUsed() {
      return getOrCreateProperty("SafetyEquipUsed", "SafetyEquipUsed", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getSeverity() {
      return getOrCreateProperty("Severity", "Severity", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getSupervisor() {
      return getOrCreateProperty("Supervisor", "Supervisor", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getTaxID() {
      return getOrCreateProperty("TaxID", "TaxID", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getTimeLossReport() {
      return getOrCreateProperty("TimeLossReport", "TimeLossReport", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public ValueElement getValidationLevel() {
      return getOrCreateProperty("ValidationLevel", "ValidationLevel", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public ValueElement getWageAmount() {
      return getOrCreateProperty("WageAmount", "WageAmount", null, gw.smoketest.platform.web.ValueElement.class);
    }
    
    public BooleanValueElement getWagePaymentCont() {
      return getOrCreateProperty("WagePaymentCont", "WagePaymentCont", null, gw.smoketest.platform.web.BooleanValueElement.class);
    }
    
    public WorkStatusChangesLV getWorkStatusChangesLV() {
      return getOrCreateProperty("WorkStatusChangesLV", "WorkStatusChangesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.WorkStatusChangesLV.class);
    }
    
    public WorkStatusChangesLV_tb getWorkStatusChangesLV_tb() {
      return getOrCreateProperty("WorkStatusChangesLV_tb", "WorkStatusChangesLV_tb", null, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.WorkStatusChangesLV_tb.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BodyPartsLV extends PCFElement {
      public BodyPartsLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public DetailedBodyPartHeader getDetailedBodyPartHeader() {
        return getOrCreateProperty("DetailedBodyPartHeader", "DetailedBodyPartHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.BodyPartsLV.DetailedBodyPartHeader.class);
      }
      
      public PrimaryBodyPartHeader getPrimaryBodyPartHeader() {
        return getOrCreateProperty("PrimaryBodyPartHeader", "PrimaryBodyPartHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.BodyPartsLV.PrimaryBodyPartHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.BodyPartsLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.BodyPartsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.BodyPartsLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.BodyPartsLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class DetailedBodyPartHeader extends ValueElement {
        public DetailedBodyPartHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class PrimaryBodyPartHeader extends ValueElement {
        public PrimaryBodyPartHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getDetailedBodyPart() {
          return getOrCreateProperty("DetailedBodyPart", "DetailedBodyPart", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getPrimaryBodyPart() {
          return getOrCreateProperty("PrimaryBodyPart", "PrimaryBodyPart", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.BodyPartsLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.BodyPartsLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.BodyPartsLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.BodyPartsLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class BodyPartsLV_tb extends PCFElement {
      public BodyPartsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ConcurrentEmplLV extends PCFElement {
      public ConcurrentEmplLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CompanyNameHeader getCompanyNameHeader() {
        return getOrCreateProperty("CompanyNameHeader", "CompanyNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.ConcurrentEmplLV.CompanyNameHeader.class);
      }
      
      public EndDateHeader getEndDateHeader() {
        return getOrCreateProperty("EndDateHeader", "EndDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.ConcurrentEmplLV.EndDateHeader.class);
      }
      
      public FullTimeHeader getFullTimeHeader() {
        return getOrCreateProperty("FullTimeHeader", "FullTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.ConcurrentEmplLV.FullTimeHeader.class);
      }
      
      public JobTitleHeader getJobTitleHeader() {
        return getOrCreateProperty("JobTitleHeader", "JobTitleHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.ConcurrentEmplLV.JobTitleHeader.class);
      }
      
      public StartDateHeader getStartDateHeader() {
        return getOrCreateProperty("StartDateHeader", "StartDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.ConcurrentEmplLV.StartDateHeader.class);
      }
      
      public WeeklyWageHeader getWeeklyWageHeader() {
        return getOrCreateProperty("WeeklyWageHeader", "WeeklyWageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.ConcurrentEmplLV.WeeklyWageHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.ConcurrentEmplLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.ConcurrentEmplLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.ConcurrentEmplLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.ConcurrentEmplLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CompanyNameHeader extends ValueElement {
        public CompanyNameHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class EndDateHeader extends ValueElement {
        public EndDateHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class FullTimeHeader extends ValueElement {
        public FullTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class JobTitleHeader extends ValueElement {
        public JobTitleHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class StartDateHeader extends ValueElement {
        public StartDateHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class WeeklyWageHeader extends ValueElement {
        public WeeklyWageHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getCompanyName() {
          return getOrCreateProperty("CompanyName", "CompanyName", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getEndDate() {
          return getOrCreateProperty("EndDate", "EndDate", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getFullTime() {
          return getOrCreateProperty("FullTime", "FullTime", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getJobTitle() {
          return getOrCreateProperty("JobTitle", "JobTitle", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getStartDate() {
          return getOrCreateProperty("StartDate", "StartDate", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getWeeklyWage() {
          return getOrCreateProperty("WeeklyWage", "WeeklyWage", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.ConcurrentEmplLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.ConcurrentEmplLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.ConcurrentEmplLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.ConcurrentEmplLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ConcurrentEmplLV_tb extends PCFElement {
      public ConcurrentEmplLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OfficialsLV extends PCFElement {
      public OfficialsLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public NameHeader getNameHeader() {
        return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.OfficialsLV.NameHeader.class);
      }
      
      public ReportNumberHeader getReportNumberHeader() {
        return getOrCreateProperty("ReportNumberHeader", "ReportNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.OfficialsLV.ReportNumberHeader.class);
      }
      
      public TypeHeader getTypeHeader() {
        return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.OfficialsLV.TypeHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.OfficialsLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.OfficialsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.OfficialsLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.OfficialsLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class NameHeader extends ValueElement {
        public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class ReportNumberHeader extends ValueElement {
        public ReportNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class TypeHeader extends ValueElement {
        public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getName() {
          return getOrCreateProperty("Name", "Name", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getReportNumber() {
          return getOrCreateProperty("ReportNumber", "ReportNumber", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getType() {
          return getOrCreateProperty("Type", "Type", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.OfficialsLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.OfficialsLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.OfficialsLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.OfficialsLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class OfficialsLV_tb extends PCFElement {
      public OfficialsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WorkStatusChangesLV extends PCFElement {
      public WorkStatusChangesLV(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public CommentsHeader getCommentsHeader() {
        return getOrCreateProperty("CommentsHeader", "CommentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.WorkStatusChangesLV.CommentsHeader.class);
      }
      
      public StatusDateHeader getStatusDateHeader() {
        return getOrCreateProperty("StatusDateHeader", "StatusDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.WorkStatusChangesLV.StatusDateHeader.class);
      }
      
      public StatusHeader getStatusHeader() {
        return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.WorkStatusChangesLV.StatusHeader.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      @SuppressWarnings(value = "unchecked")
      public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.WorkStatusChangesLV.entry> get_Entries() {
        return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.WorkStatusChangesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
      }
      
      public pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.WorkStatusChangesLV._ListPaging get_ListPaging() {
        return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.WorkStatusChangesLV._ListPaging.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class CommentsHeader extends ValueElement {
        public CommentsHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class StatusDateHeader extends ValueElement {
        public StatusDateHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class StatusHeader extends ValueElement {
        public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _ListPaging extends PagingElement {
        public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class entry extends RowElement {
        public entry(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public ValueElement getComments() {
          return getOrCreateProperty("Comments", "Comments", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getStatus() {
          return getOrCreateProperty("Status", "Status", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public ValueElement getStatusDate() {
          return getOrCreateProperty("StatusDate", "StatusDate", null, gw.smoketest.platform.web.ValueElement.class);
        }
        
        public IteratorEntryCheckboxElement get_Checkbox() {
          return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
        }
        
        public pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.WorkStatusChangesLV.entry._Select get_Select() {
          return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.WorkStatusChangesLV.entry._Select.class);
        }
        
        public pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.WorkStatusChangesLV.entry._ViewDetail get_ViewDetail() {
          return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneral600PanelSet_wc.ClaimSnapshotGeneral600DV.WorkStatusChangesLV.entry._ViewDetail.class);
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
        public static class _Select extends SelectorCellElement {
          public _Select(ISmokeTest helper, PCFElementId componentId)  {
            super(helper, componentId);
          }
          
          public PCFLocation click() {
            return clickThis(gw.smoketest.platform.web.PCFLocation.class);
          }
          
          
        }
        
        @SimplePropertyProcessing
        @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
    @Generated(comments = "config/web/pcf/claim/snapshot/600/ClaimSnapshotGeneral600PanelSet.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WorkStatusChangesLV_tb extends PCFElement {
      public WorkStatusChangesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      
    }
    
    
  }
  
  
}