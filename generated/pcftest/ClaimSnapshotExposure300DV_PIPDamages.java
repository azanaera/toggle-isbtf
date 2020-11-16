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
import pcftest.ClaimSnapshotExposure300DV_PIPDamages.WorkStatusChangesLV;
import pcftest.ClaimSnapshotExposure300DV_PIPDamages.WorkStatusChangesLV.CommentsHeader;
import pcftest.ClaimSnapshotExposure300DV_PIPDamages.WorkStatusChangesLV.StatusDateHeader;
import pcftest.ClaimSnapshotExposure300DV_PIPDamages.WorkStatusChangesLV.StatusHeader;
import pcftest.ClaimSnapshotExposure300DV_PIPDamages.WorkStatusChangesLV._ListPaging;
import pcftest.ClaimSnapshotExposure300DV_PIPDamages.WorkStatusChangesLV.entry;
import pcftest.ClaimSnapshotExposure300DV_PIPDamages.WorkStatusChangesLV.entry._Select;
import pcftest.ClaimSnapshotExposure300DV_PIPDamages.WorkStatusChangesLV.entry._ViewDetail;
import pcftest.ClaimSnapshotExposure300DV_PIPDamages.WorkStatusChangesLV_tb;

@SimplePropertyProcessing
@Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotExposure300DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
public class ClaimSnapshotExposure300DV_PIPDamages extends ClaimSnapshotExposure300DV {
  public final static String CHECKSUM = "33d7b3a2021849a53f68aedec81fda4a";
  
  public ClaimSnapshotExposure300DV_PIPDamages(ISmokeTest helper, PCFElementId componentId)  {
    super(helper, componentId);
  }
  
  public ValueElement getClaimant() {
    return getOrCreateProperty("Claimant", "Claimant", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClaimantAddress() {
    return getOrCreateProperty("ClaimantAddress", "ClaimantAddress", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClaimantType() {
    return getOrCreateProperty("ClaimantType", "ClaimantType", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getCloseDate() {
    return getOrCreateProperty("CloseDate", "CloseDate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getClosedOutcome() {
    return getOrCreateProperty("ClosedOutcome", "ClosedOutcome", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getContact() {
    return getOrCreateProperty("Contact", "Contact", null, gw.smoketest.platform.web.ValueElement.class);
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
  
  public ValueElement getOvertimeRate() {
    return getOrCreateProperty("OvertimeRate", "OvertimeRate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getPayPeriod() {
    return getOrCreateProperty("PayPeriod", "PayPeriod", null, gw.smoketest.platform.web.ValueElement.class);
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
  
  public ValueElement getReOpenDate() {
    return getOrCreateProperty("ReOpenDate", "ReOpenDate", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getSegment() {
    return getOrCreateProperty("Segment", "Segment", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getStatLine() {
    return getOrCreateProperty("StatLine", "StatLine", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getState() {
    return getOrCreateProperty("State", "State", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getStrategy() {
    return getOrCreateProperty("Strategy", "Strategy", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public ValueElement getWageAmount() {
    return getOrCreateProperty("WageAmount", "WageAmount", null, gw.smoketest.platform.web.ValueElement.class);
  }
  
  public BooleanValueElement getWagePaymentCont() {
    return getOrCreateProperty("WagePaymentCont", "WagePaymentCont", null, gw.smoketest.platform.web.BooleanValueElement.class);
  }
  
  public WorkStatusChangesLV getWorkStatusChangesLV() {
    return getOrCreateProperty("WorkStatusChangesLV", "WorkStatusChangesLV", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListView, pcftest.ClaimSnapshotExposure300DV_PIPDamages.WorkStatusChangesLV.class);
  }
  
  public WorkStatusChangesLV_tb getWorkStatusChangesLV_tb() {
    return getOrCreateProperty("WorkStatusChangesLV_tb", "WorkStatusChangesLV_tb", null, pcftest.ClaimSnapshotExposure300DV_PIPDamages.WorkStatusChangesLV_tb.class);
  }
  
  @SimplePropertyProcessing
  @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotExposure300DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkStatusChangesLV extends PCFElement {
    public WorkStatusChangesLV(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    public CommentsHeader getCommentsHeader() {
      return getOrCreateProperty("CommentsHeader", "CommentsHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposure300DV_PIPDamages.WorkStatusChangesLV.CommentsHeader.class);
    }
    
    public StatusDateHeader getStatusDateHeader() {
      return getOrCreateProperty("StatusDateHeader", "StatusDateHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposure300DV_PIPDamages.WorkStatusChangesLV.StatusDateHeader.class);
    }
    
    public StatusHeader getStatusHeader() {
      return getOrCreateProperty("StatusHeader", "StatusHeader", gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewHeader, pcftest.ClaimSnapshotExposure300DV_PIPDamages.WorkStatusChangesLV.StatusHeader.class);
    }
    
    public IteratorEntryCheckboxElement get_Checkbox() {
      return getOrCreateProperty("_Checkbox", "_Checkbox", null, gw.smoketest.platform.web.IteratorEntryCheckboxElement.class);
    }
    
    @SuppressWarnings(value = "unchecked")
    public IteratorEntriesWithPaging<entry> get_Entries() {
      return getOrCreateEntries(gw.smoketest.platform.web.PCFElementId.PCFElementScope.ListViewRowIteratorEntry, pcftest.ClaimSnapshotExposure300DV_PIPDamages.WorkStatusChangesLV.entry.class, gw.smoketest.platform.web.IteratorEntriesWithPaging.class);
    }
    
    public _ListPaging get_ListPaging() {
      return getOrCreateProperty("_ListPaging", "_ListPaging", null, pcftest.ClaimSnapshotExposure300DV_PIPDamages.WorkStatusChangesLV._ListPaging.class);
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotExposure300DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class CommentsHeader extends ValueElement {
      public CommentsHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotExposure300DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatusDateHeader extends ValueElement {
      public StatusDateHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotExposure300DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class StatusHeader extends ValueElement {
      public StatusHeader(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotExposure300DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
    public static class _ListPaging extends PagingElement {
      public _ListPaging(ISmokeTest helper, PCFElementId componentId)  {
        super(helper, componentId);
      }
      
      public PCFLocation click() {
        return clickThis(gw.smoketest.platform.web.PCFLocation.class);
      }
      
      
    }
    
    @SimplePropertyProcessing
    @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotExposure300DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
        return getOrCreateProperty("_Select", "_Select", null, pcftest.ClaimSnapshotExposure300DV_PIPDamages.WorkStatusChangesLV.entry._Select.class);
      }
      
      public _ViewDetail get_ViewDetail() {
        return getOrCreateProperty("_ViewDetail", "_ViewDetail", null, pcftest.ClaimSnapshotExposure300DV_PIPDamages.WorkStatusChangesLV.entry._ViewDetail.class);
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotExposure300DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
      public static class _Select extends SelectorCellElement {
        public _Select(ISmokeTest helper, PCFElementId componentId)  {
          super(helper, componentId);
        }
        
        public PCFLocation click() {
          return clickThis(gw.smoketest.platform.web.PCFLocation.class);
        }
        
        
      }
      
      @SimplePropertyProcessing
      @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotExposure300DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
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
  @Generated(comments = "config/web/pcf/claim/snapshot/300/ClaimSnapshotExposure300DV.PIPDamages.pcf", date = "", value = "com.guidewire.pcfgen.PCFClassGenerator")
  public static class WorkStatusChangesLV_tb extends PCFElement {
    public WorkStatusChangesLV_tb(ISmokeTest helper, PCFElementId componentId)  {
      super(helper, componentId);
    }
    
    
  }
  
  
}