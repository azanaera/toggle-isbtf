package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
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
import pcftest.ClaimSnapshotExposureWageBenefitsDV.WorkStatusChangesLV;
import pcftest.ClaimSnapshotExposureWageBenefitsDV.WorkStatusChangesLV.CommentsHeader;
import pcftest.ClaimSnapshotExposureWageBenefitsDV.WorkStatusChangesLV.StatusDateHeader;
import pcftest.ClaimSnapshotExposureWageBenefitsDV.WorkStatusChangesLV.StatusHeader;
import pcftest.ClaimSnapshotExposureWageBenefitsDV.WorkStatusChangesLV._ListPaging;
import pcftest.ClaimSnapshotExposureWageBenefitsDV.WorkStatusChangesLV.entry;
import pcftest.ClaimSnapshotExposureWageBenefitsDV.WorkStatusChangesLV.entry._Select;
import pcftest.ClaimSnapshotExposureWageBenefitsDV.WorkStatusChangesLV.entry._ViewDetail;
import pcftest.ClaimSnapshotExposureWageBenefitsDV.WorkStatusChangesLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposureWageBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposureWageBenefitsDV extends DetailViewElement {
  public final static String CHECKSUM = "ccfdd2e5531d31ae7a487be0cfaa6ff1";
  
  public ClaimSnapshotExposureWageBenefitsDV(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getCompBenefits_BenefitsBeginDate() {
    return getOrCreateProperty("CompBenefits_BenefitsBeginDate", "CompBenefits_BenefitsBeginDate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCompBenefits_BenefitsEndDate() {
    return getOrCreateProperty("CompBenefits_BenefitsEndDate", "CompBenefits_BenefitsEndDate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCompBenefits_PaymentFrequency() {
    return getOrCreateProperty("CompBenefits_PaymentFrequency", "CompBenefits_PaymentFrequency", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCompBenefits_WeeklyCompRate() {
    return getOrCreateProperty("CompBenefits_WeeklyCompRate", "CompBenefits_WeeklyCompRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCompany_PrimaryContact() {
    return getOrCreateProperty("Company_PrimaryContact", "Company_PrimaryContact", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEmploymentData_DaysWorkedWeek() {
    return getOrCreateProperty("EmploymentData_DaysWorkedWeek", "EmploymentData_DaysWorkedWeek", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEmploymentData_EmploymentStatus() {
    return getOrCreateProperty("EmploymentData_EmploymentStatus", "EmploymentData_EmploymentStatus", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public DateElement getEmploymentData_HireDate() {
    return getOrCreateProperty("EmploymentData_HireDate", "EmploymentData_HireDate", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public DateElement getEmploymentData_InjuryStartTime() {
    return getOrCreateProperty("EmploymentData_InjuryStartTime", "EmploymentData_InjuryStartTime", null, gw.smoketest.platform.web.DateElement.class);
  }
  
  public ValueElement getEmploymentData_LastYearIncome() {
    return getOrCreateProperty("EmploymentData_LastYearIncome", "EmploymentData_LastYearIncome", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEmploymentData_NumDaysWorkedPerWeek() {
    return getOrCreateProperty("EmploymentData_NumDaysWorkedPerWeek", "EmploymentData_NumDaysWorkedPerWeek", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEmploymentData_NumHoursWorkedPerDay() {
    return getOrCreateProperty("EmploymentData_NumHoursWorkedPerDay", "EmploymentData_NumHoursWorkedPerDay", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEmploymentData_OvertimeRate() {
    return getOrCreateProperty("EmploymentData_OvertimeRate", "EmploymentData_OvertimeRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEmploymentData_PayPeriod() {
    return getOrCreateProperty("EmploymentData_PayPeriod", "EmploymentData_PayPeriod", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEmploymentData_WageAmount() {
    return getOrCreateProperty("EmploymentData_WageAmount", "EmploymentData_WageAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEmploymentData_WagePaymentCont() {
    return getOrCreateProperty("EmploymentData_WagePaymentCont", "EmploymentData_WagePaymentCont", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLostWagesBenefits_MonthlyCompRate() {
    return getOrCreateProperty("LostWagesBenefits_MonthlyCompRate", "LostWagesBenefits_MonthlyCompRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPIPDamages_Claimant() {
    return getOrCreateProperty("PIPDamages_Claimant", "PIPDamages_Claimant", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPIPDamages_WCCarrier() {
    return getOrCreateProperty("PIPDamages_WCCarrier", "PIPDamages_WCCarrier", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPartialEmployer_PrimaryAddress() {
    return getOrCreateProperty("PartialEmployer_PrimaryAddress", "PartialEmployer_PrimaryAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPartialEmployer_PrimaryContact() {
    return getOrCreateProperty("PartialEmployer_PrimaryContact", "PartialEmployer_PrimaryContact", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPartialEmployer_PrimaryPhone() {
    return getOrCreateProperty("PartialEmployer_PrimaryPhone", "PartialEmployer_PrimaryPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPartialEmploymentData_NumDaysWorkedPerWeek() {
    return getOrCreateProperty("PartialEmploymentData_NumDaysWorkedPerWeek", "PartialEmploymentData_NumDaysWorkedPerWeek", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPartialEmploymentData_NumHoursWorkedPerDay() {
    return getOrCreateProperty("PartialEmploymentData_NumHoursWorkedPerDay", "PartialEmploymentData_NumHoursWorkedPerDay", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPartialEmploymentData_PayPeriod() {
    return getOrCreateProperty("PartialEmploymentData_PayPeriod", "PartialEmploymentData_PayPeriod", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPartialEmploymentData_WageAmount() {
    return getOrCreateProperty("PartialEmploymentData_WageAmount", "PartialEmploymentData_WageAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPartialPIPDamages_Employer() {
    return getOrCreateProperty("PartialPIPDamages_Employer", "PartialPIPDamages_Employer", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPartialWageBenefitCollected_Question() {
    return getOrCreateProperty("PartialWageBenefitCollected_Question", "PartialWageBenefitCollected_Question", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPerson_Employer() {
    return getOrCreateProperty("Person_Employer", "Person_Employer", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPerson_Occupation() {
    return getOrCreateProperty("Person_Occupation", "Person_Occupation", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getSSCollected_Question() {
    return getOrCreateProperty("SSCollected_Question", "SSCollected_Question", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getSSDIBenefits_BeginDate() {
    return getOrCreateProperty("SSDIBenefits_BeginDate", "SSDIBenefits_BeginDate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getWCBenefits_BenefitsBeginDate() {
    return getOrCreateProperty("WCBenefits_BenefitsBeginDate", "WCBenefits_BenefitsBeginDate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getWCCarrier_PrimaryAddress() {
    return getOrCreateProperty("WCCarrier_PrimaryAddress", "WCCarrier_PrimaryAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getWCCarrier_PrimaryContact() {
    return getOrCreateProperty("WCCarrier_PrimaryContact", "WCCarrier_PrimaryContact", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getWCCarrier_PrimaryPhone() {
    return getOrCreateProperty("WCCarrier_PrimaryPhone", "WCCarrier_PrimaryPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public WorkStatusChangesLV getWorkStatusChangesLV() {
    return getOrCreateProperty("WorkStatusChangesLV", "WorkStatusChangesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotExposureWageBenefitsDV.WorkStatusChangesLV.class);
  }
  
  public WorkStatusChangesLV_tb getWorkStatusChangesLV_tb() {
    return getOrCreateProperty("WorkStatusChangesLV_tb", "WorkStatusChangesLV_tb", null, pcftest.ClaimSnapshotExposureWageBenefitsDV.WorkStatusChangesLV_tb.class);
  }
  
  public ValueElement getWorkersCompCollected_Question() {
    return getOrCreateProperty("WorkersCompCollected_Question", "WorkersCompCollected_Question", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposureWageBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkStatusChangesLV extends PCFElement {
    public WorkStatusChangesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CommentsHeader getCommentsHeader() {
      return getOrCreateProperty("CommentsHeader", "CommentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposureWageBenefitsDV.WorkStatusChangesLV.CommentsHeader.class);
    }
    
    public StatusDateHeader getStatusDateHeader() {
      return getOrCreateProperty("StatusDateHeader", "StatusDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposureWageBenefitsDV.WorkStatusChangesLV.StatusDateHeader.class);
    }
    
    public StatusHeader getStatusHeader() {
      return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposureWageBenefitsDV.WorkStatusChangesLV.StatusHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotExposureWageBenefitsDV.WorkStatusChangesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotExposureWageBenefitsDV.WorkStatusChangesLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposureWageBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CommentsHeader extends ValueElement {
      public CommentsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposureWageBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatusDateHeader extends ValueElement {
      public StatusDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposureWageBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatusHeader extends ValueElement {
      public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposureWageBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposureWageBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public _Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotExposureWageBenefitsDV.WorkStatusChangesLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotExposureWageBenefitsDV.WorkStatusChangesLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposureWageBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposureWageBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/default/ClaimSnapshotExposureWageBenefitsDV.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkStatusChangesLV_tb extends PCFElement {
    public WorkStatusChangesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}