package pcftest;

import gw.lang.SimplePropertyProcessing;
import gw.smoketest.platform.web.BooleanValueElement;
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
import pcftest.ClaimSnapshotExposure700DV_PIPDamages.OtherCoverageDetLV;
import pcftest.ClaimSnapshotExposure700DV_PIPDamages.OtherCoverageDetLV.ContactNameHeader;
import pcftest.ClaimSnapshotExposure700DV_PIPDamages.OtherCoverageDetLV.ContactPhoneHeader;
import pcftest.ClaimSnapshotExposure700DV_PIPDamages.OtherCoverageDetLV.InsurerHeader;
import pcftest.ClaimSnapshotExposure700DV_PIPDamages.OtherCoverageDetLV.NotesHeader;
import pcftest.ClaimSnapshotExposure700DV_PIPDamages.OtherCoverageDetLV.PolicyNumberHeader;
import pcftest.ClaimSnapshotExposure700DV_PIPDamages.OtherCoverageDetLV_tb;
import pcftest.ClaimSnapshotExposure700DV_PIPDamages.WorkStatusChangesLV;
import pcftest.ClaimSnapshotExposure700DV_PIPDamages.WorkStatusChangesLV.CommentsHeader;
import pcftest.ClaimSnapshotExposure700DV_PIPDamages.WorkStatusChangesLV.StatusDateHeader;
import pcftest.ClaimSnapshotExposure700DV_PIPDamages.WorkStatusChangesLV.StatusHeader;
import pcftest.ClaimSnapshotExposure700DV_PIPDamages.WorkStatusChangesLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposure700DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposure700DV_PIPDamages extends ClaimSnapshotExposure700DV {
  public final static String CHECKSUM = "7cd5224a6d2ccc236f0152e99bc29c1c";
  
  public ClaimSnapshotExposure700DV_PIPDamages(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getClaimant() {
    return getOrCreateProperty("Claimant", "Claimant", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClaimantType() {
    return getOrCreateProperty("ClaimantType", "ClaimantType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getContactCompany() {
    return getOrCreateProperty("ContactCompany", "ContactCompany", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getContactProhibited() {
    return getOrCreateProperty("ContactProhibited", "ContactProhibited", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public ValueElement getCoverage() {
    return getOrCreateProperty("Coverage", "Coverage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCoverageSubType() {
    return getOrCreateProperty("CoverageSubType", "CoverageSubType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCreateTime() {
    return getOrCreateProperty("CreateTime", "CreateTime", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getDaysWorkedWeek() {
    return getOrCreateProperty("DaysWorkedWeek", "DaysWorkedWeek", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getEmploymentStatus() {
    return getOrCreateProperty("EmploymentStatus", "EmploymentStatus", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getHireDate() {
    return getOrCreateProperty("HireDate", "HireDate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getInjuryStartTime() {
    return getOrCreateProperty("InjuryStartTime", "InjuryStartTime", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getJurisdictionState() {
    return getOrCreateProperty("JurisdictionState", "JurisdictionState", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLastYearIncome() {
    return getOrCreateProperty("LastYearIncome", "LastYearIncome", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getLossParty() {
    return getOrCreateProperty("LossParty", "LossParty", null, gw.smoketest.platform.web.ValueElement.class);
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
  
  public BooleanValueElement getOtherCoverage() {
    return getOrCreateProperty("OtherCoverage", "OtherCoverage", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public OtherCoverageDetLV getOtherCoverageDetLV() {
    return getOrCreateProperty("OtherCoverageDetLV", "OtherCoverageDetLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotExposure700DV_PIPDamages.OtherCoverageDetLV.class);
  }
  
  public OtherCoverageDetLV_tb getOtherCoverageDetLV_tb() {
    return getOrCreateProperty("OtherCoverageDetLV_tb", "OtherCoverageDetLV_tb", null, pcftest.ClaimSnapshotExposure700DV_PIPDamages.OtherCoverageDetLV_tb.class);
  }
  
  public ValueElement getOvertimeRate() {
    return getOrCreateProperty("OvertimeRate", "OvertimeRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPayPeriod() {
    return getOrCreateProperty("PayPeriod", "PayPeriod", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPrimaryAddress() {
    return getOrCreateProperty("PrimaryAddress", "PrimaryAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPrimaryContact() {
    return getOrCreateProperty("PrimaryContact", "PrimaryContact", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPrimaryCoverage() {
    return getOrCreateProperty("PrimaryCoverage", "PrimaryCoverage", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPrimaryPhone() {
    return getOrCreateProperty("PrimaryPhone", "PrimaryPhone", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getStatLine() {
    return getOrCreateProperty("StatLine", "StatLine", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getWageAmount() {
    return getOrCreateProperty("WageAmount", "WageAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getWagePaymentCont() {
    return getOrCreateProperty("WagePaymentCont", "WagePaymentCont", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public WorkStatusChangesLV getWorkStatusChangesLV() {
    return getOrCreateProperty("WorkStatusChangesLV", "WorkStatusChangesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotExposure700DV_PIPDamages.WorkStatusChangesLV.class);
  }
  
  public WorkStatusChangesLV_tb getWorkStatusChangesLV_tb() {
    return getOrCreateProperty("WorkStatusChangesLV_tb", "WorkStatusChangesLV_tb", null, pcftest.ClaimSnapshotExposure700DV_PIPDamages.WorkStatusChangesLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposure700DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherCoverageDetLV extends PCFElement {
    public OtherCoverageDetLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public ContactNameHeader getContactNameHeader() {
      return getOrCreateProperty("ContactNameHeader", "ContactNameHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposure700DV_PIPDamages.OtherCoverageDetLV.ContactNameHeader.class);
    }
    
    public ContactPhoneHeader getContactPhoneHeader() {
      return getOrCreateProperty("ContactPhoneHeader", "ContactPhoneHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposure700DV_PIPDamages.OtherCoverageDetLV.ContactPhoneHeader.class);
    }
    
    public InsurerHeader getInsurerHeader() {
      return getOrCreateProperty("InsurerHeader", "InsurerHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposure700DV_PIPDamages.OtherCoverageDetLV.InsurerHeader.class);
    }
    
    public NotesHeader getNotesHeader() {
      return getOrCreateProperty("NotesHeader", "NotesHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposure700DV_PIPDamages.OtherCoverageDetLV.NotesHeader.class);
    }
    
    public PolicyNumberHeader getPolicyNumberHeader() {
      return getOrCreateProperty("PolicyNumberHeader", "PolicyNumberHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposure700DV_PIPDamages.OtherCoverageDetLV.PolicyNumberHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotExposure700DV_PIPDamages.OtherCoverageDetLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotExposure700DV_PIPDamages.OtherCoverageDetLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotExposure700DV_PIPDamages.OtherCoverageDetLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotExposure700DV_PIPDamages.OtherCoverageDetLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposure700DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ContactNameHeader extends ValueElement {
      public ContactNameHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposure700DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class ContactPhoneHeader extends ValueElement {
      public ContactPhoneHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposure700DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class InsurerHeader extends ValueElement {
      public InsurerHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposure700DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class NotesHeader extends ValueElement {
      public NotesHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposure700DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class PolicyNumberHeader extends ValueElement {
      public PolicyNumberHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposure700DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposure700DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class entry extends RowElement {
      public entry(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public ValueElement getContactName() {
        return getOrCreateProperty("ContactName", "ContactName", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getContactPhone() {
        return getOrCreateProperty("ContactPhone", "ContactPhone", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getInsurer() {
        return getOrCreateProperty("Insurer", "Insurer", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getNotes() {
        return getOrCreateProperty("Notes", "Notes", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public ValueElement getPolicyNumber() {
        return getOrCreateProperty("PolicyNumber", "PolicyNumber", null, gw.smoketest.platform.web.ValueElement.class);
      }
      
      public IteratorEntryCheckboxElement get_Checkbox() {
        return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
      }
      
      public pcftest.ClaimSnapshotExposure700DV_PIPDamages.OtherCoverageDetLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotExposure700DV_PIPDamages.OtherCoverageDetLV.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotExposure700DV_PIPDamages.OtherCoverageDetLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotExposure700DV_PIPDamages.OtherCoverageDetLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposure700DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposure700DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposure700DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class OtherCoverageDetLV_tb extends PCFElement {
    public OtherCoverageDetLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposure700DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkStatusChangesLV extends PCFElement {
    public WorkStatusChangesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CommentsHeader getCommentsHeader() {
      return getOrCreateProperty("CommentsHeader", "CommentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposure700DV_PIPDamages.WorkStatusChangesLV.CommentsHeader.class);
    }
    
    public StatusDateHeader getStatusDateHeader() {
      return getOrCreateProperty("StatusDateHeader", "StatusDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposure700DV_PIPDamages.WorkStatusChangesLV.StatusDateHeader.class);
    }
    
    public StatusHeader getStatusHeader() {
      return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposure700DV_PIPDamages.WorkStatusChangesLV.StatusHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<pcftest.ClaimSnapshotExposure700DV_PIPDamages.WorkStatusChangesLV.entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotExposure700DV_PIPDamages.WorkStatusChangesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public pcftest.ClaimSnapshotExposure700DV_PIPDamages.WorkStatusChangesLV._ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotExposure700DV_PIPDamages.WorkStatusChangesLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposure700DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CommentsHeader extends ValueElement {
      public CommentsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposure700DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatusDateHeader extends ValueElement {
      public StatusDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposure700DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatusHeader extends ValueElement {
      public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposure700DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposure700DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
      
      public pcftest.ClaimSnapshotExposure700DV_PIPDamages.WorkStatusChangesLV.entry._Select get_Select() {
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotExposure700DV_PIPDamages.WorkStatusChangesLV.entry._Select.class);
      }
      
      public pcftest.ClaimSnapshotExposure700DV_PIPDamages.WorkStatusChangesLV.entry._ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotExposure700DV_PIPDamages.WorkStatusChangesLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposure700DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposure700DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/700/ClaimSnapshotExposure700DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkStatusChangesLV_tb extends PCFElement {
    public WorkStatusChangesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}