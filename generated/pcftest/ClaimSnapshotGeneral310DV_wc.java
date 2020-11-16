package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
import gw.smoketest.platform.web.CheckboxValueElement;
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
import pcftest.ClaimSnapshotGeneral310DV_wc.BodyPartsLV;
import pcftest.ClaimSnapshotGeneral310DV_wc.BodyPartsLV.CompensabilityHeader;
import pcftest.ClaimSnapshotGeneral310DV_wc.BodyPartsLV.DetailedBodyPartHeader;
import pcftest.ClaimSnapshotGeneral310DV_wc.BodyPartsLV.PrimaryBodyPartHeader;
import pcftest.ClaimSnapshotGeneral310DV_wc.BodyPartsLV_tb;
import pcftest.ClaimSnapshotGeneral310DV_wc.ConcurrentEmplLV;
import pcftest.ClaimSnapshotGeneral310DV_wc.ConcurrentEmplLV.CompanyNameHeader;
import pcftest.ClaimSnapshotGeneral310DV_wc.ConcurrentEmplLV.FullTimeHeader;
import pcftest.ClaimSnapshotGeneral310DV_wc.ConcurrentEmplLV.JobTitleHeader;
import pcftest.ClaimSnapshotGeneral310DV_wc.ConcurrentEmplLV.WeeklyWageHeader;
import pcftest.ClaimSnapshotGeneral310DV_wc.ConcurrentEmplLV_tb;
import pcftest.ClaimSnapshotGeneral310DV_wc.OfficialsLV;
import pcftest.ClaimSnapshotGeneral310DV_wc.OfficialsLV.NameHeader;
import pcftest.ClaimSnapshotGeneral310DV_wc.OfficialsLV.ReportNumberHeader;
import pcftest.ClaimSnapshotGeneral310DV_wc.OfficialsLV.TypeHeader;
import pcftest.ClaimSnapshotGeneral310DV_wc.OfficialsLV_tb;
import pcftest.ClaimSnapshotGeneral310DV_wc.OtherBenefitsLV;
import pcftest.ClaimSnapshotGeneral310DV_wc.OtherBenefitsLV.AmountHeader;
import pcftest.ClaimSnapshotGeneral310DV_wc.OtherBenefitsLV.InitialContactHeader;
import pcftest.ClaimSnapshotGeneral310DV_wc.OtherBenefitsLV.ReferenceNumberHeader;
import pcftest.ClaimSnapshotGeneral310DV_wc.OtherBenefitsLV_tb;
import pcftest.ClaimSnapshotGeneral310DV_wc.WorkStatusChangesLV;
import pcftest.ClaimSnapshotGeneral310DV_wc.WorkStatusChangesLV.StatusDateHeader;
import pcftest.ClaimSnapshotGeneral310DV_wc.WorkStatusChangesLV.StatusHeader;
import pcftest.ClaimSnapshotGeneral310DV_wc.WorkStatusChangesLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotGeneral310DV_wc extends ClaimSnapshotGeneral310DV {
  public final static String CHECKSUM = "1ec749ebbe8bd93877556566c1277df7";
  
  public ClaimSnapshotGeneral310DV_wc(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getAccidentType() {
    return getOrCreateProperty("AccidentType", "AccidentType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getAddressLine2() {
    return getOrCreateProperty("AddressLine2", "AddressLine2", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getBenefitsStatusDcsn() {
    return getOrCreateProperty("BenefitsStatusDcsn", "BenefitsStatusDcsn", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BodyPartsLV getBodyPartsLV() {
    return getOrCreateProperty("BodyPartsLV", "BodyPartsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneral310DV_wc.BodyPartsLV.class);
  }
  
  public BodyPartsLV_tb getBodyPartsLV_tb() {
    return getOrCreateProperty("BodyPartsLV_tb", "BodyPartsLV_tb", null, pcftest.ClaimSnapshotGeneral310DV_wc.BodyPartsLV_tb.class);
  }
  
  public ValueElement getCatastrophe() {
    return getOrCreateProperty("Catastrophe", "Catastrophe", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClaimant() {
    return getOrCreateProperty("Claimant", "Claimant", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClaimantRprtdDate() {
    return getOrCreateProperty("ClaimantRprtdDate", "ClaimantRprtdDate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCloseDate() {
    return getOrCreateProperty("CloseDate", "CloseDate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClosedOutcome() {
    return getOrCreateProperty("ClosedOutcome", "ClosedOutcome", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ConcurrentEmplLV getConcurrentEmplLV() {
    return getOrCreateProperty("ConcurrentEmplLV", "ConcurrentEmplLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneral310DV_wc.ConcurrentEmplLV.class);
  }
  
  public ConcurrentEmplLV_tb getConcurrentEmplLV_tb() {
    return getOrCreateProperty("ConcurrentEmplLV_tb", "ConcurrentEmplLV_tb", null, pcftest.ClaimSnapshotGeneral310DV_wc.ConcurrentEmplLV_tb.class);
  }
  
  public ValueElement getContact() {
    return getOrCreateProperty("Contact", "Contact", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getCoverageInQuestion() {
    return getOrCreateProperty("CoverageInQuestion", "CoverageInQuestion", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getCreateTime() {
    return getOrCreateProperty("CreateTime", "CreateTime", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDateCompDcsnDue() {
    return getOrCreateProperty("DateCompDcsnDue", "DateCompDcsnDue", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDateCompDcsnMade() {
    return getOrCreateProperty("DateCompDcsnMade", "DateCompDcsnMade", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDateFormGivenToEmp() {
    return getOrCreateProperty("DateFormGivenToEmp", "DateFormGivenToEmp", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDateFormRetByEmp() {
    return getOrCreateProperty("DateFormRetByEmp", "DateFormRetByEmp", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDateOfBirth() {
    return getOrCreateProperty("DateOfBirth", "DateOfBirth", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDateOfInjury() {
    return getOrCreateProperty("DateOfInjury", "DateOfInjury", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDateRptdToEmployer() {
    return getOrCreateProperty("DateRptdToEmployer", "DateRptdToEmployer", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDeductibleStatus() {
    return getOrCreateProperty("DeductibleStatus", "DeductibleStatus", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDepartmentCode() {
    return getOrCreateProperty("DepartmentCode", "DepartmentCode", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDescription() {
    return getOrCreateProperty("Description", "Description", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDetailedBodyPart() {
    return getOrCreateProperty("DetailedBodyPart", "DetailedBodyPart", null, gw.smoketest.platform.web.ValueElement.class);
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
  
  public ValueElement getEmpQusValidity() {
    return getOrCreateProperty("EmpQusValidity", "EmpQusValidity", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEmployerValidityReason() {
    return getOrCreateProperty("EmployerValidityReason", "EmployerValidityReason", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getEmploymentInjury() {
    return getOrCreateProperty("EmploymentInjury", "EmploymentInjury", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getEmploymentStatus() {
    return getOrCreateProperty("EmploymentStatus", "EmploymentStatus", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getExposureBegan() {
    return getOrCreateProperty("ExposureBegan", "ExposureBegan", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getExposureEnded() {
    return getOrCreateProperty("ExposureEnded", "ExposureEnded", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getFirstNoticeSuit() {
    return getOrCreateProperty("FirstNoticeSuit", "FirstNoticeSuit", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getFlagged() {
    return getOrCreateProperty("Flagged", "Flagged", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getFlaggedDate() {
    return getOrCreateProperty("FlaggedDate", "FlaggedDate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getFlaggedReason() {
    return getOrCreateProperty("FlaggedReason", "FlaggedReason", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getHireDate() {
    return getOrCreateProperty("HireDate", "HireDate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getHireState() {
    return getOrCreateProperty("HireState", "HireState", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getHowReported() {
    return getOrCreateProperty("HowReported", "HowReported", null, gw.smoketest.platform.web.ValueElement.class);
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
  
  public ValueElement getInjuryStartTime() {
    return getOrCreateProperty("InjuryStartTime", "InjuryStartTime", null, gw.smoketest.platform.web.ValueElement.class);
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
  
  public ValueElement getLitigationStatus() {
    return getOrCreateProperty("LitigationStatus", "LitigationStatus", null, gw.smoketest.platform.web.ValueElement.class);
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
  
  public ValueElement getLossLocation() {
    return getOrCreateProperty("LossLocation", "LossLocation", null, gw.smoketest.platform.web.ValueElement.class);
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
  
  public BooleanValueElement getModifiedDutyAvail() {
    return getOrCreateProperty("ModifiedDutyAvail", "ModifiedDutyAvail", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getNumDaysWorked() {
    return getOrCreateProperty("NumDaysWorked", "NumDaysWorked", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNumHoursWorked() {
    return getOrCreateProperty("NumHoursWorked", "NumHoursWorked", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getNurseCaseMgr() {
    return getOrCreateProperty("NurseCaseMgr", "NurseCaseMgr", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getOccupation() {
    return getOrCreateProperty("Occupation", "Occupation", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public OfficialsLV getOfficialsLV() {
    return getOrCreateProperty("OfficialsLV", "OfficialsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneral310DV_wc.OfficialsLV.class);
  }
  
  public OfficialsLV_tb getOfficialsLV_tb() {
    return getOrCreateProperty("OfficialsLV_tb", "OfficialsLV_tb", null, pcftest.ClaimSnapshotGeneral310DV_wc.OfficialsLV_tb.class);
  }
  
  public OtherBenefitsLV getOtherBenefitsLV() {
    return getOrCreateProperty("OtherBenefitsLV", "OtherBenefitsLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneral310DV_wc.OtherBenefitsLV.class);
  }
  
  public OtherBenefitsLV_tb getOtherBenefitsLV_tb() {
    return getOrCreateProperty("OtherBenefitsLV_tb", "OtherBenefitsLV_tb", null, pcftest.ClaimSnapshotGeneral310DV_wc.OtherBenefitsLV_tb.class);
  }
  
  public ValueElement getOtherRecovStatus() {
    return getOrCreateProperty("OtherRecovStatus", "OtherRecovStatus", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getPaidFull() {
    return getOrCreateProperty("PaidFull", "PaidFull", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getPayPeriod() {
    return getOrCreateProperty("PayPeriod", "PayPeriod", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPermissionRequired() {
    return getOrCreateProperty("PermissionRequired", "PermissionRequired", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPrimaryAddress() {
    return getOrCreateProperty("PrimaryAddress", "PrimaryAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPrimaryBodyPart() {
    return getOrCreateProperty("PrimaryBodyPart", "PrimaryBodyPart", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPrimaryInjury() {
    return getOrCreateProperty("PrimaryInjury", "PrimaryInjury", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPrimaryPhone() {
    return getOrCreateProperty("PrimaryPhone", "PrimaryPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getReason() {
    return getOrCreateProperty("Reason", "Reason", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getReinsuranceStatus() {
    return getOrCreateProperty("ReinsuranceStatus", "ReinsuranceStatus", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getReportedByType() {
    return getOrCreateProperty("ReportedByType", "ReportedByType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getReportedDate() {
    return getOrCreateProperty("ReportedDate", "ReportedDate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getReporter() {
    return getOrCreateProperty("Reporter", "Reporter", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getSIUStatus() {
    return getOrCreateProperty("SIUStatus", "SIUStatus", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getSafetyEquipProv() {
    return getOrCreateProperty("SafetyEquipProv", "SafetyEquipProv", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public BooleanValueElement getSafetyEquipUsed() {
    return getOrCreateProperty("SafetyEquipUsed", "SafetyEquipUsed", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getSegment() {
    return getOrCreateProperty("Segment", "Segment", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getSeverity() {
    return getOrCreateProperty("Severity", "Severity", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getStrategy() {
    return getOrCreateProperty("Strategy", "Strategy", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getSubrogationStatus() {
    return getOrCreateProperty("SubrogationStatus", "SubrogationStatus", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getSupervisor() {
    return getOrCreateProperty("Supervisor", "Supervisor", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getTaxID() {
    return getOrCreateProperty("TaxID", "TaxID", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getWageAmount() {
    return getOrCreateProperty("WageAmount", "WageAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getWagePaymentCont() {
    return getOrCreateProperty("WagePaymentCont", "WagePaymentCont", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public WorkStatusChangesLV getWorkStatusChangesLV() {
    return getOrCreateProperty("WorkStatusChangesLV", "WorkStatusChangesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotGeneral310DV_wc.WorkStatusChangesLV.class);
  }
  
  public WorkStatusChangesLV_tb getWorkStatusChangesLV_tb() {
    return getOrCreateProperty("WorkStatusChangesLV_tb", "WorkStatusChangesLV_tb", null, pcftest.ClaimSnapshotGeneral310DV_wc.WorkStatusChangesLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BodyPartsLV extends PCFElement {
    public BodyPartsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CompensabilityHeader getCompensabilityHeader() {
      return getOrCreateProperty("CompensabilityHeader", "CompensabilityHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral310DV_wc.BodyPartsLV.CompensabilityHeader.class);
    }
    
    public DetailedBodyPartHeader getDetailedBodyPartHeader() {
      return getOrCreateProperty("DetailedBodyPartHeader", "DetailedBodyPartHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral310DV_wc.BodyPartsLV.DetailedBodyPartHeader.class);
    }
    
    public PrimaryBodyPartHeader getPrimaryBodyPartHeader() {
      return getOrCreateProperty("PrimaryBodyPartHeader", "PrimaryBodyPartHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral310DV_wc.BodyPartsLV.PrimaryBodyPartHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneral310DV_wc.BodyPartsLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneral310DV_wc.BodyPartsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotGeneral310DV_wc.BodyPartsLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneral310DV_wc.BodyPartsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CompensabilityHeader extends ValueElement {
      public CompensabilityHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class DetailedBodyPartHeader extends ValueElement {
      public DetailedBodyPartHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PrimaryBodyPartHeader extends ValueElement {
      public PrimaryBodyPartHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getCompensability() {
        return getOrCreateProperty("Compensability", "Compensability", null, gw.smoketest.platform.web.ValueElement.class);
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
      
      public pcftest.ClaimSnapshotGeneral310DV_wc.BodyPartsLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneral310DV_wc.BodyPartsLV.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotGeneral310DV_wc.BodyPartsLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneral310DV_wc.BodyPartsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class BodyPartsLV_tb extends PCFElement {
    public BodyPartsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ConcurrentEmplLV extends PCFElement {
    public ConcurrentEmplLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CompanyNameHeader getCompanyNameHeader() {
      return getOrCreateProperty("CompanyNameHeader", "CompanyNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral310DV_wc.ConcurrentEmplLV.CompanyNameHeader.class);
    }
    
    public pcftest.ClaimSnapshotGeneral310DV_wc.ConcurrentEmplLV.EndDateHeader getEndDateHeader() {
      return getOrCreateProperty("EndDateHeader", "EndDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral310DV_wc.ConcurrentEmplLV.EndDateHeader.class);
    }
    
    public FullTimeHeader getFullTimeHeader() {
      return getOrCreateProperty("FullTimeHeader", "FullTimeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral310DV_wc.ConcurrentEmplLV.FullTimeHeader.class);
    }
    
    public JobTitleHeader getJobTitleHeader() {
      return getOrCreateProperty("JobTitleHeader", "JobTitleHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral310DV_wc.ConcurrentEmplLV.JobTitleHeader.class);
    }
    
    public pcftest.ClaimSnapshotGeneral310DV_wc.ConcurrentEmplLV.StartDateHeader getStartDateHeader() {
      return getOrCreateProperty("StartDateHeader", "StartDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral310DV_wc.ConcurrentEmplLV.StartDateHeader.class);
    }
    
    public WeeklyWageHeader getWeeklyWageHeader() {
      return getOrCreateProperty("WeeklyWageHeader", "WeeklyWageHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral310DV_wc.ConcurrentEmplLV.WeeklyWageHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneral310DV_wc.ConcurrentEmplLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneral310DV_wc.ConcurrentEmplLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotGeneral310DV_wc.ConcurrentEmplLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneral310DV_wc.ConcurrentEmplLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CompanyNameHeader extends ValueElement {
      public CompanyNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EndDateHeader extends ValueElement {
      public EndDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class FullTimeHeader extends ValueElement {
      public FullTimeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class JobTitleHeader extends ValueElement {
      public JobTitleHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StartDateHeader extends ValueElement {
      public StartDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class WeeklyWageHeader extends ValueElement {
      public WeeklyWageHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public pcftest.ClaimSnapshotGeneral310DV_wc.ConcurrentEmplLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneral310DV_wc.ConcurrentEmplLV.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotGeneral310DV_wc.ConcurrentEmplLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneral310DV_wc.ConcurrentEmplLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class ConcurrentEmplLV_tb extends PCFElement {
    public ConcurrentEmplLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OfficialsLV extends PCFElement {
    public OfficialsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public NameHeader getNameHeader() {
      return getOrCreateProperty("NameHeader", "NameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral310DV_wc.OfficialsLV.NameHeader.class);
    }
    
    public ReportNumberHeader getReportNumberHeader() {
      return getOrCreateProperty("ReportNumberHeader", "ReportNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral310DV_wc.OfficialsLV.ReportNumberHeader.class);
    }
    
    public TypeHeader getTypeHeader() {
      return getOrCreateProperty("TypeHeader", "TypeHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral310DV_wc.OfficialsLV.TypeHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneral310DV_wc.OfficialsLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneral310DV_wc.OfficialsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotGeneral310DV_wc.OfficialsLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneral310DV_wc.OfficialsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NameHeader extends ValueElement {
      public NameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ReportNumberHeader extends ValueElement {
      public ReportNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class TypeHeader extends ValueElement {
      public TypeHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public pcftest.ClaimSnapshotGeneral310DV_wc.OfficialsLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneral310DV_wc.OfficialsLV.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotGeneral310DV_wc.OfficialsLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneral310DV_wc.OfficialsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OfficialsLV_tb extends PCFElement {
    public OfficialsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherBenefitsLV extends PCFElement {
    public OtherBenefitsLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public AmountHeader getAmountHeader() {
      return getOrCreateProperty("AmountHeader", "AmountHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral310DV_wc.OtherBenefitsLV.AmountHeader.class);
    }
    
    public pcftest.ClaimSnapshotGeneral310DV_wc.OtherBenefitsLV.CommentsHeader getCommentsHeader() {
      return getOrCreateProperty("CommentsHeader", "CommentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral310DV_wc.OtherBenefitsLV.CommentsHeader.class);
    }
    
    public pcftest.ClaimSnapshotGeneral310DV_wc.OtherBenefitsLV.EndDateHeader getEndDateHeader() {
      return getOrCreateProperty("EndDateHeader", "EndDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral310DV_wc.OtherBenefitsLV.EndDateHeader.class);
    }
    
    public InitialContactHeader getInitialContactHeader() {
      return getOrCreateProperty("InitialContactHeader", "InitialContactHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral310DV_wc.OtherBenefitsLV.InitialContactHeader.class);
    }
    
    public ReferenceNumberHeader getReferenceNumberHeader() {
      return getOrCreateProperty("ReferenceNumberHeader", "ReferenceNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral310DV_wc.OtherBenefitsLV.ReferenceNumberHeader.class);
    }
    
    public pcftest.ClaimSnapshotGeneral310DV_wc.OtherBenefitsLV.StartDateHeader getStartDateHeader() {
      return getOrCreateProperty("StartDateHeader", "StartDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral310DV_wc.OtherBenefitsLV.StartDateHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneral310DV_wc.OtherBenefitsLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneral310DV_wc.OtherBenefitsLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotGeneral310DV_wc.OtherBenefitsLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneral310DV_wc.OtherBenefitsLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class AmountHeader extends ValueElement {
      public AmountHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CommentsHeader extends ValueElement {
      public CommentsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class EndDateHeader extends ValueElement {
      public EndDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InitialContactHeader extends ValueElement {
      public InitialContactHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ReferenceNumberHeader extends ValueElement {
      public ReferenceNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StartDateHeader extends ValueElement {
      public StartDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getAmount() {
        return getOrCreateProperty("Amount", "Amount", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getComments() {
        return getOrCreateProperty("Comments", "Comments", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getEndDate() {
        return getOrCreateProperty("EndDate", "EndDate", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getInitialContact() {
        return getOrCreateProperty("InitialContact", "InitialContact", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getReferenceNumber() {
        return getOrCreateProperty("ReferenceNumber", "ReferenceNumber", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getStartDate() {
        return getOrCreateProperty("StartDate", "StartDate", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.ClaimSnapshotGeneral310DV_wc.OtherBenefitsLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneral310DV_wc.OtherBenefitsLV.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotGeneral310DV_wc.OtherBenefitsLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneral310DV_wc.OtherBenefitsLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherBenefitsLV_tb extends PCFElement {
    public OtherBenefitsLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkStatusChangesLV extends PCFElement {
    public WorkStatusChangesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public pcftest.ClaimSnapshotGeneral310DV_wc.WorkStatusChangesLV.CommentsHeader getCommentsHeader() {
      return getOrCreateProperty("CommentsHeader", "CommentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral310DV_wc.WorkStatusChangesLV.CommentsHeader.class);
    }
    
    public StatusDateHeader getStatusDateHeader() {
      return getOrCreateProperty("StatusDateHeader", "StatusDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral310DV_wc.WorkStatusChangesLV.StatusDateHeader.class);
    }
    
    public StatusHeader getStatusHeader() {
      return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotGeneral310DV_wc.WorkStatusChangesLV.StatusHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotGeneral310DV_wc.WorkStatusChangesLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotGeneral310DV_wc.WorkStatusChangesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotGeneral310DV_wc.WorkStatusChangesLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotGeneral310DV_wc.WorkStatusChangesLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CommentsHeader extends ValueElement {
      public CommentsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatusDateHeader extends ValueElement {
      public StatusDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatusHeader extends ValueElement {
      public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public pcftest.ClaimSnapshotGeneral310DV_wc.WorkStatusChangesLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotGeneral310DV_wc.WorkStatusChangesLV.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotGeneral310DV_wc.WorkStatusChangesLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotGeneral310DV_wc.WorkStatusChangesLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/310/ClaimSnapshotGeneral310DV.wc.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkStatusChangesLV_tb extends PCFElement {
    public WorkStatusChangesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}